package player;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.util.ArrayList;
import java.util.HashMap;

import sound.Pitch;
import sound.PitchCalculator;

public class Listener extends ABCMusicBaseListener {
    // TODO: handle null cases
    private ArrayList<MusicalPhrase> phrases;
    private ArrayList<Bar> bars;
    
    // Header instance variables
    private String title, composer, key;
    private int meterNumerator, meterDenominator, 
                          tempoNumerator, tempoDenominator, tempoSpeed, tempoBPM,
                          lengthNumerator, lengthDenominator;
    private boolean hasDefaultLength, hasTempo;
    
    //Mutable Variables
    private HashMap<String, ArrayList<Bar>> voiceHash = new HashMap<String, ArrayList<Bar>>();
    private Bar currentBar;
    private String currentVoice;
    private Pitch pitch;
    private String baseNote;
    private int noteNumerator, noteDenominator;

    // 
    PitchCalculator pitchCalculator = new PitchCalculator();
    
    /**
     * Removes all whitespace at the beginning of the string passed in.
     * @param s String to pass in.
     * @return s without all the whitespaces in the beginning.
     */
    public String removeWhitespaceAtBeginning(String s) {
        int whitespaceCounter;
        for (whitespaceCounter = 0; whitespaceCounter < s.length(); whitespaceCounter++) {
            if (s.charAt(whitespaceCounter) != ' ' && s.charAt(whitespaceCounter) != '\t') {
                break;
            }
        }
        return s.substring(whitespaceCounter);       
    }
    
    public MusicalPiece getMusicalPiece() {
        return new MusicalPiece(title, composer, meterDenominator, meterNumerator, tempoSpeed, phrases);
    }
        
    @Override
    public void exitField_title(ABCMusicParser.Field_titleContext ctx) {
        // Cut off the first T:
        String title = ctx.ITITLE().getText();
        title = title.substring(2);
        this.title = removeWhitespaceAtBeginning(title);
    }

    @Override
    public void exitField_composer(ABCMusicParser.Field_composerContext ctx) {
        String composer = ctx.ICOMPOSER().getText();
        composer = composer.substring(2);
        this.composer = removeWhitespaceAtBeginning(composer);        
    }

    @Override
    public void exitField_meter(ABCMusicParser.Field_meterContext ctx) {
        String meter = ctx.IMETER().getText();
        meter = meter.substring(2);
        meter = removeWhitespaceAtBeginning(meter);
        if (meter.equals("C")) {
            this.meterNumerator = 4;
            this.meterDenominator = 4;
        } else {
            int slashLocation;
            for (slashLocation = 0; slashLocation < meter.length(); slashLocation++) {
                if (meter.charAt(slashLocation) == '/') {
                    break;
                }
            }
            // We should have gotten integers in front and behind the slash symbol.
            this.meterNumerator = Integer.parseInt(meter.substring(0, slashLocation));
            this.meterDenominator = Integer.parseInt(meter.substring(slashLocation + 1));
        }
        this.currentBar = new Bar(this.meterNumerator, this.meterDenominator);            
    }
    
    @Override
    public void exitField_tempo(ABCMusicParser.Field_tempoContext ctx) {
        hasTempo = true;
        String tempo = ctx.ITEMPO().getText();
        tempo = tempo.substring(2);
        tempo = removeWhitespaceAtBeginning(tempo);
        int slashLocation, equalLocation;
        for (slashLocation = 0; slashLocation < tempo.length();  slashLocation++) {
            if(tempo.charAt(slashLocation) == '/') {
                break;
            }
        }
        for (equalLocation = 0; equalLocation < tempo.length(); equalLocation++) {
            if(tempo.charAt(equalLocation) == '=') {
                break;
            }
        }
        
        this.tempoNumerator = Integer.parseInt(tempo.substring(0, slashLocation));
        this.tempoDenominator = Integer.parseInt(tempo.substring(slashLocation + 1, equalLocation));
        this.tempoSpeed = Integer.parseInt(tempo.substring(equalLocation + 1));
    }
    
    @Override
    public void exitField_key(ABCMusicParser.Field_keyContext ctx) {
        String key = ctx.IKEY().getText();
        key= key.substring(2);
        this.key= removeWhitespaceAtBeginning(key);
    }

    @Override
    public void exitField_default_length(ABCMusicParser.Field_default_lengthContext ctx) {
        hasDefaultLength = true;
        String length = ctx.ILENGTH().getText();
        length = length.substring(2);
        length = removeWhitespaceAtBeginning(length);
        // TODO: Java has a built-in method for this I think. I was too sleepy to use it so we should change it later.
        // Also make sure that the functionality is the same.
        int slashLocation;
        for (slashLocation = 0; slashLocation < length.length();  slashLocation++) {
            if(length.charAt(slashLocation) == '/') {
                break;
            }
        }
        this.lengthNumerator = Integer.parseInt(length.substring(0, slashLocation));
        this.lengthDenominator = Integer.parseInt(length.substring(slashLocation + 1));
    }
        
    @Override 
    public void exitField_voice(ABCMusicParser.Field_voiceContext ctx) { 
    	String voice = ctx.IVOICE().getText();
    	voice = voice.substring(2);
    	voice = removeWhitespaceAtBeginning(voice);
    	
    	if (!voiceHash.containsKey(voice))
    		voiceHash.put(voice, new ArrayList<Bar>());
    	else
    		currentVoice=voice;
    }

    @Override
    public void exitAbc_header(ABCMusicParser.Abc_headerContext ctx) {
        if (!hasDefaultLength) {
            if (this.meterNumerator * 1.0 / this.meterDenominator < 0.75) {
                this.lengthNumerator = 1;
                this.lengthDenominator = 16;
            } else {
                this.lengthNumerator = 1;
                this.lengthDenominator = 8;
            }
        } else if (!hasTempo) {
            this.tempoSpeed = 100;
            this.tempoNumerator = this.lengthNumerator;
            this.tempoDenominator = this.lengthDenominator;
        }
    }

    @Override
    public void enterPitch(ABCMusicParser.PitchContext ctx) {
        baseNote = ctx.BASENOTE().getText();
        pitch = pitchCalculator.getPitchForKey(this.key, baseNote);
    }   
    
    @Override
    public void exitAccidental(ABCMusicParser.AccidentalContext ctx) {
        if (ctx.start.getType() == ABCMusicLexer.SHARP) {
            String accidental = ctx.SHARP().getText();
            pitch = pitchCalculator.getPitchForKey("C", baseNote);
            pitch = pitch.transpose(accidental.length());
        } else if (ctx.start.getType() == ABCMusicLexer.NEUTRAL) {
            pitch = pitchCalculator.getPitchForKey("C", baseNote);
        } else if (ctx.start.getType() == ABCMusicLexer.FLAT) {
            String accidental = ctx.FLAT().getText();
            pitch = pitchCalculator.getPitchForKey("C", baseNote);
            pitch = pitch.transpose(-1 * accidental.length());
        }
    }
	
	@Override
	public void exitPitch(ABCMusicParser.PitchContext ctx) {
	    if (ctx.OCTAVE() != null) {
	        String octave = ctx.OCTAVE().getText();
            for (int i = 0; i < octave.length(); i++) {
                if (octave.charAt(i) == ',') {
                    pitch = pitch.transpose(-Pitch.OCTAVE);
                } else {
                    pitch = pitch.transpose(Pitch.OCTAVE);
                }
            }           	        
	    }
	}
	
	@Override
	public void exitNote_length(ABCMusicParser.Note_lengthContext ctx) {
	    if (ctx.NUMBER().size() > 1) {
	        this.noteNumerator = Integer.parseInt(ctx.NUMBER(0).getText()) * this.lengthNumerator;
	        this.noteDenominator = Integer.parseInt(ctx.NUMBER(1).getText()) * this.lengthDenominator;	        
	    } else if (ctx.NUMBER().size() > 0) {
	        if (ctx.SLASH() != null) {
	            this.noteNumerator = this.lengthNumerator;
	            this.noteDenominator = Integer.parseInt(ctx.NUMBER(0).getText()) * this.lengthDenominator;	            
	        } else {
	            this.noteNumerator = this.lengthNumerator * Integer.parseInt(ctx.NUMBER(0).getText());
	            this.noteDenominator = this.lengthDenominator;
	        }
	    } else {
	        noteNumerator = this.lengthNumerator;
	        noteDenominator = this.lengthDenominator * 2;
	    }
	}

	@Override 
	public void exitNote(ABCMusicParser.NoteContext ctx) { 
	    // TODO: Lyrics
	    if (pitch != null) {
	        // TODO: chords
	        int[] notes = {pitch.toMidiNote()};
	        this.currentBar.addNote(new PitchNote(this.noteNumerator, this.noteDenominator, notes, ""));
	        pitch = null;
	    } else {
	        this.currentBar.addNote(new RestNote(this.noteNumerator, this.noteDenominator, ""));
	    }
	    
	}
	
	@Override
	public void exitElement(ABCMusicParser.ElementContext ctx) {
	    if (ctx.start.getType() == ABCMusicLexer.BAR) {
	        String bar = ctx.BAR().getText();
	        if (bar.equals("|") || bar.equals("||")) {
	            System.out.println(new Bar(this.currentBar));
	            System.out.println(bars);
	            bars.add(new Bar(this.currentBar));
	            this.currentBar = new Bar(this.meterNumerator, this.meterDenominator);
	            
	        }
	    }
	}
	
	public void enterMid_tune_field(ABCMusicParser.Mid_tune_fieldContext ctx) {
	    this.bars = new ArrayList<Bar>();
	}
	
	public void enterAbc_tune(ABCMusicParser.Abc_tuneContext ctx) {
	    this.bars = new ArrayList<Bar>();
	    this.meterNumerator = 4;
	    this.meterDenominator = 4;
	    this.composer = "Unknown";
	}
}
