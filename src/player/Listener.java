package player;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import sound.Pitch;
import sound.PitchCalculator;

public class Listener extends ABCMusicBaseListener {
    // TODO: handle null cases
    private ArrayList<MusicalPhrase> phrases;
    private ArrayList<Bar> bars;
    
    // Instance variables in header
    private String title, composer, key;
    private int meterNumerator, meterDenominator, 
                          tempoNumerator, tempoDenominator, tempoSpeed, tempoBPM,
                          lengthNumerator, lengthDenominator;
    private boolean hasDefaultLength, hasTempo;
    
    // Instance variables in body
    private Bar currentBar;
    private String currentVoice;
    private Pitch pitch;
    private String baseNote;
    private int noteNumerator, noteDenominator;
    private boolean isChord, isTuplet, isRepeatOn, isOneTwoRepeat;
    private ArrayList<Note> chord;
    private ArrayList<Note> tuplet;
    private ArrayList<Note> repeats;
    
    //Mutable Variables
    private HashMap<String, ArrayList<Bar>> voiceHash = new HashMap<String, ArrayList<Bar>>();
    
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

    /** 
     * Returns the musical piece that has been generated by the listener.
     * @return Musical piece generated by the listener.
     */
    public MusicalPiece getMusicalPiece() {
        return new MusicalPiece(this.title, this.composer, this.meterDenominator, this.meterNumerator, this.tempoSpeed, this.phrases);
    }

    
    //
    // METHODS FOR HANDLING WHEN THE LISTENER ENTERS AND EXITS THE HEADER 
    //

    
    /**
     * Initializes default parameters for the musical piece at the very beginning
     * when the listener enters the tree.
     * @param ctx Context for the whole abc file
     */
    public void enterAbc_tune(ABCMusicParser.Abc_tuneContext ctx) {
        this.phrases = new ArrayList<MusicalPhrase>();
        this.bars = new ArrayList<Bar>();
        this.meterNumerator = 4;
        this.meterDenominator = 4;
        this.composer = "Unknown";
        this.repeats = new ArrayList<Note>();
    }

    /**
     * Sets the title of the piece when the listener leaves the title node.
     * @param ctx Context for title
     */
    @Override
    public void exitField_title(ABCMusicParser.Field_titleContext ctx) {
        String title = ctx.ITITLE().getText();
        title = title.substring(2);
        this.title = removeWhitespaceAtBeginning(title);
    }

    /**
     * Sets the composer of the piece when the listener leaves the composer node.
     * @param ctx Context for composer
     */
    @Override
    public void exitField_composer(ABCMusicParser.Field_composerContext ctx) {
        String composer = ctx.ICOMPOSER().getText();
        composer = composer.substring(2);
        this.composer = removeWhitespaceAtBeginning(composer);        
    }

    /**
     * Sets the meter of the piece when the listener leaves the meter node.
     * @param ctx Context for meter 
     */
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
            this.meterNumerator = Integer.parseInt(meter.substring(0, slashLocation));
            this.meterDenominator = Integer.parseInt(meter.substring(slashLocation + 1));
        }
        this.currentBar = new Bar(this.meterNumerator, this.meterDenominator);            
    }
    
    /**
     * Sets the tempo of the piece when the listener leaves the tempo node.
     * @param ctx Context for tempo
     */
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

    /**
     * Sets the tempo of the piece when the listener leaves the tempo node.
     * @param ctx Context for tempo
     */
    @Override
    public void exitField_key(ABCMusicParser.Field_keyContext ctx) {
        String key = ctx.IKEY().getText();
        key= key.substring(2);
        this.key= removeWhitespaceAtBeginning(key);
    }

    /**
     * Sets the default note length of the piece when the listener leaves the default length node.
     * @param ctx Context for default note length
     */
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

    /**
     * Sets the voices of the piece in the header when the listener leaves the voice nodes.
     * @param ctx Context for voices 
     */
    @Override 
    public void exitField_voice(ABCMusicParser.Field_voiceContext ctx) { 
    	String voice = ctx.IVOICE().getText();
    	voice = voice.substring(2);
    	voice = removeWhitespaceAtBeginning(voice);
    	
    	if (!voiceHash.containsKey(voice)) {
            voiceHash.put(voice, new ArrayList<Bar>());
    	}
    	else {
            currentVoice=voice;    	    
    	}
    }

    /**
     * Initializes parameters for the abc file that were missing in the header.
     * @param ctx Context for the header
     */
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

    //
    // METHODS FOR HANDLING THE BODY
    //
    
    //
    // Handling a note
    //
    
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
	            // TODO: 3 /
//	            System.out.println("Payload: ");
	            this.noteNumerator = this.lengthNumerator;
	            this.noteDenominator = Integer.parseInt(ctx.NUMBER(0).getText()) * this.lengthDenominator;	            
	        } else {
	            this.noteNumerator = this.lengthNumerator * Integer.parseInt(ctx.NUMBER(0).getText());
	            this.noteDenominator = this.lengthDenominator;
	        }
	    } else {
	        if (ctx.SLASH() != null) {
	            this.noteNumerator = this.lengthNumerator;
	            this.noteDenominator = this.lengthDenominator * 2;	            
	        } else {
	            this.noteNumerator = this.lengthNumerator;
	            this.noteDenominator = this.lengthDenominator;
	        }
	    }
	}

	@Override
	public void enterMulti_note(ABCMusicParser.Multi_noteContext ctx) {
	    isChord = true;
	    chord = new ArrayList<Note>();
	}
	
	@Override
	public void exitMulti_note(ABCMusicParser.Multi_noteContext ctx) {
	    isChord= false;
	    int chordNotes[] = new int[chord.size()];
	    int chordNumerator = chord.get(0).getNumerator();
        int chordDenominator = chord.get(0).getDenominator();
        for (int note = 0; note < chord.size(); note++) {
            chordNotes[note] = chord.get(note).getNote()[0];
            System.out.println(chordNumerator + " / " + chordDenominator + ": " + chord.get(note).getNote()[0]);
        }
        // TODO: Name better...
        Note theChord = new PitchNote(chordNumerator * this.noteNumerator, 
                                                                        chordDenominator * this.noteDenominator, 
                                                                        chordNotes, "");
        if (isTuplet) {
            this.tuplet.add(theChord);            
        } else {
            this.currentBar.addNote(theChord);
            if (isRepeatOn && !isOneTwoRepeat) {
                this.repeats.add(theChord);
            }
        }

	}

    @Override
    public void enterTuplet_element(ABCMusicParser.Tuplet_elementContext ctx) {
       isTuplet = true;
       tuplet = new ArrayList<Note>();
    }

	@Override
	public void exitTuplet_element(ABCMusicParser.Tuplet_elementContext ctx) {
	    isTuplet = false;
	    String tupletSpec = ctx.TUPLET_SPEC().getText();
	    
	    // TODO: Magic numbers (here and throughout)
	    if (tupletSpec.substring(1).equals("3")) {
	        if (tuplet.size() != 3) {
	            // TODO: throw error
	        }
	        
	        for (int i = 0; i < 3; i++) {
	            int noteNumerator = tuplet.get(i).getNumerator();
	            int noteDenominator = tuplet.get(i).getDenominator();
	            this.currentBar.addNote(new PitchNote(noteNumerator * 2, noteDenominator * 3, tuplet.get(i).getNote(), ""));
                if (isRepeatOn && !isOneTwoRepeat) {
                    this.repeats.add(new PitchNote(noteNumerator * 2, noteDenominator * 3, tuplet.get(i).getNote(), ""));
                }
	        }	       
	    } else if (tupletSpec.substring(1).equals("2")) {
            if (tuplet.size() != 2) {
                // throw error
            }
            for (int i = 0; i < 2; i++) {
                int noteNumerator = tuplet.get(i).getNumerator();
                int noteDenominator = tuplet.get(i).getDenominator();
                this.currentBar.addNote(new PitchNote(noteNumerator * 3, noteDenominator * 2, tuplet.get(i).getNote(), ""));
                if (isRepeatOn && !isOneTwoRepeat) {
                    this.repeats.add(new PitchNote(noteNumerator * 3, noteDenominator * 2, tuplet.get(i).getNote(), ""));
                }
            }          
	    } else {
            if (tuplet.size() != 4) {
                // throw error
            }
            for (int i = 0; i < 4; i++) {
                int noteNumerator = tuplet.get(i).getNumerator();
                int noteDenominator = tuplet.get(i).getDenominator();
                this.currentBar.addNote(new PitchNote(noteNumerator * 3, noteDenominator * 4, tuplet.get(i).getNote(), ""));
                if (isRepeatOn && !isOneTwoRepeat) {
                    this.repeats.add(new PitchNote(noteNumerator * 3, noteDenominator * 4, tuplet.get(i).getNote(), ""));
                }
            }
	        
	    }

	}
	
	@Override 
	public void exitNote(ABCMusicParser.NoteContext ctx) { 
	    // TODO: Lyrics
	    if (isChord) {
	        // TODO: May want to do some ADT changing later because to me (kpeng94), 
	        // this implementation of an array doesn't make a lot of sense
	        this.chord.add(new PitchNote(this.noteNumerator, this.noteDenominator, new int[] {pitch.toMidiNote()}, ""));
	    } else if (isTuplet) {
	        this.tuplet.add(new PitchNote(this.noteNumerator, this.noteDenominator, new int[] {pitch.toMidiNote()}, ""));
	    } else {
            if (this.pitch != null) {
                int[] notes = {this.pitch.toMidiNote()};
                this.currentBar.addNote(new PitchNote(this.noteNumerator, this.noteDenominator, notes, ""));
                if (isRepeatOn && !isOneTwoRepeat) {
                    this.repeats.add(new PitchNote(this.noteNumerator, this.noteDenominator, notes, ""));
                }
                pitch = null;
            } else {
                this.currentBar.addNote(new RestNote(this.noteNumerator, this.noteDenominator, ""));
                if (isRepeatOn && !isOneTwoRepeat) {
                    this.repeats.add(new RestNote(this.noteNumerator, this.noteDenominator, ""));
                }
            }
	        
	    }
	}
	
	@Override
	public void exitNote_or_rest(ABCMusicParser.Note_or_restContext ctx) {
	    if (ctx.REST() != null) {
	        this.pitch = null;
	    }
	}
	
	@Override
	public void exitElement(ABCMusicParser.ElementContext ctx) {
	    if (ctx.start.getType() == ABCMusicLexer.BAR) {
	        String bar = ctx.BAR().getText();
	        if (bar.equals("|") || bar.equals("||") || bar.equals("|]")) {
	            this.bars.add(new Bar(this.currentBar));
	            this.currentBar = new Bar(this.meterNumerator, this.meterDenominator);
	            
	        } else if (bar.equals("|:")) {
	            this.isRepeatOn = true;
	            // Check implementation later
	            this.repeats = new ArrayList<Note>();
	        } else if (bar.equals(":|")) {
	            this.isRepeatOn = false;
	            Bar repeatBar = new Bar(this.meterNumerator, this.meterDenominator);
	            for (int i = 0; i < this.repeats.size(); i++) {
	                repeatBar.addNote(this.repeats.get(i));
	            }
	            this.bars.add(repeatBar);
	        }
	    }
	    
	    if (ctx.start.getType() == ABCMusicLexer.NTH_REPEAT) {
	        String nthRepeat = ctx.NTH_REPEAT().getText();
	        if (nthRepeat.equals("[1")) {
	            this.isOneTwoRepeat = true;
	        } else {
	            this.isOneTwoRepeat = false;
	        }
	    }
	}

	@Override
	public void enterMid_tune_field(ABCMusicParser.Mid_tune_fieldContext ctx) {
	    if (this.currentVoice != null) {
	        if (!this.voiceHash.containsKey(this.currentVoice)) {
	            this.voiceHash.put(this.currentVoice, new ArrayList<Bar>());
	        }
	        for (int i = 0; i < this.bars.size(); i++) {
	            this.voiceHash.get(this.currentVoice).add(bars.get(i));
	        }
	        this.bars = new ArrayList<Bar>();	        
	    }
	    String voice = ctx.IVOICE().getText().substring(2);
	    voice = removeWhitespaceAtBeginning(voice);
	    this.currentVoice = voice;
	}
	
	@Override
	public void exitAbc_music(ABCMusicParser.Abc_musicContext ctx) {
	    if (!this.voiceHash.containsKey(this.currentVoice)) {
            this.voiceHash.put(this.currentVoice, new ArrayList<Bar>());
        }
        for (int i = 0; i < this.bars.size(); i++) {
            this.voiceHash.get(this.currentVoice).add(bars.get(i));
        }
        this.bars = new ArrayList<Bar>();
        
        for (Entry<String, ArrayList<Bar>> entry : voiceHash.entrySet()) {
            this.phrases.add(new MusicalPhrase(entry.getValue()));
        }
	}
	
	// TODO: check for overrides
}
