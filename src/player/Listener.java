package player;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.parse.GrammarTreeVisitor.tokenSpec_return;
import org.antlr.v4.runtime.tree.TerminalNode;

import sound.Pitch;

public class Listener extends ABCMusicBaseListener {
    // TODO: handle null cases
    private ArrayList<MusicalPhrase> phrases;
    private ArrayList<Bar> bars;
    
    // Header instance variables
    private String title, composer, key;
    private int meterNumerator, meterDenominator, 
                          tempoNumerator, tempoDenominator, tempoSpeed,
                          lengthNumerator, lengthDenominator;
   
    //Mutable Variables
    private HashMap<String, ArrayList<Bar>> voiceHash = new HashMap<String, ArrayList<Bar>>();
    private String currentVoice;
    private Pitch pitch;
    private char baseNote;
    
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
        // TODO: implement getMusicalPiece()
        return null;
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
            return;
        }
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
    
    @Override
    public void exitField_tempo(ABCMusicParser.Field_tempoContext ctx) {
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
    public void exitLiteral(ABCMusicParser.LiteralContext ctx) { 
        TerminalNode token;
        if (ctx.start.getType() == ABCMusicLexer.BASENOTE) {
            token = ctx.BASENOTE();
//            stack.push(new Object(token.getText()));
        }
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
	public void exitNote(ABCMusicParser.NoteContext ctx) { 
		for (int x=0; x< (ctx.getChildCount()-1)/2; x++){
		}
	}

	@Override
	public void enterPitch(ABCMusicParser.PitchContext ctx) {
		// TODO: Make the default pitch based on the key signature or measure
		// using a hashmap
		pitch = new Pitch(ctx.BASENOTE().getText().charAt(0));
		baseNote = ctx.BASENOTE().getText().charAt(0);
	}	
	
	@Override
	public void exitAccidental(ABCMusicParser.AccidentalContext ctx) {
		if (ctx.start.getType() == ABCMusicLexer.SHARP) {
			String accidental = ctx.SHARP().getText();
			pitch = new Pitch(baseNote);
			pitch = pitch.transpose(accidental.length());
		} else if (ctx.start.getType() == ABCMusicLexer.NEUTRAL) {
			String accidental = ctx.NEUTRAL().getText();
			pitch = new Pitch(baseNote);
		} else if (ctx.start.getType() == ABCMusicLexer.FLAT) {
			String accidental = ctx.FLAT().getText();
			pitch = new Pitch(baseNote);
			pitch = pitch.transpose(-1 * accidental.length());
		}
	}
	
	@Override
	public void exitOctave(ABCMusicParser.OctaveContext ctx) {
		for (int i = 0; i < ctx.getChildCount(); i++) {
			ctx.
		}

		*/*if (ctx.start== ABCMusicLexer.OCTAVE_HIGHER) {
			
		}
	}
	
	@Override
	public void exitPitch(ABCMusicParser.PitchContext ctx) {
//		ctx.BASENOTE()
	}
}
