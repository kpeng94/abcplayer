package player;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import sound.Pitch;
import grammar.ABCMusicBaseListener;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(new java.io.File(file).getAbsolutePath()));
            String song = ""; 
            while (in.ready()) { 
                song += in.readLine() + "\n"; 
            }
            in.close();
            // Create a stream of tokens using the lexer.
            CharStream stream = new ANTLRInputStream(song);
            ABCMusicLexer lexer = new ABCMusicLexer(stream);
            lexer.reportErrorsAsExceptions();
            TokenStream tokens = new CommonTokenStream(lexer);
            
            // Feed the tokens into the parser.
            ABCMusicParser parser = new ABCMusicParser(tokens);
            parser.reportErrorsAsExceptions();
            
            // Generate the parse tree using the starter rule.
            ParseTree tree;
            tree = parser.abc_tune(); // "line" is the starter rule.
            
            //System.err.println(tree.toStringTree(parser));

            // Walk the tree with the listener.
            ParseTreeWalker walker = new ParseTreeWalker();
            ParseTreeListener listener = new ABCMusicBaseListener();
            walker.walk(listener, tree);
            
            MusicalPiece musicalPiece = ((ABCMusicBaseListener)listener).getMusicalPiece();
            musicalPiece.playPiece();
        } 
        catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        } 
    }

    public static void main(String[] args) {
        String pieceOne = "X: 1\nT:Piece No.1\nM:4/4\nL:1/4\nQ:1/4=140\nK:C\nC C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 | (3c/2c/2c/2 (3G/2G/2G/2 (3B/2B/2B/2 (3C/2C/2C/2 | G3/4 F/4 E3/4 D/4 C2";
        String piece = "X: 1\nT:Piece No.1\nM:4/4\nL:1/4\nQ:1/4=140\nK:C\n";
        CharStream stream = new ANTLRInputStream(pieceOne);
        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.reportErrorsAsExceptions();
        TokenStream tokens = new CommonTokenStream(lexer);
        

        ABCMusicParser parser = new ABCMusicParser(tokens);
        parser.reportErrorsAsExceptions();
        
        ParseTree tree;
        tree = parser.abc_tune();

        System.err.println(tree.toStringTree(parser));
        ((RuleContext) tree).inspect(parser);
    }
        
        
        
        
        // CALL play() HERE
        
        // For Demo:
        // Voice 1
//        Note pn1 = new PitchNote(1, 8, new Pitch('F').transpose(1).toMidiNote(), "Super");
//        Note restNote = new RestNote(1, 8, "");
//        Note pn3 = new PitchNote(1, 4, new Pitch('F').transpose(1).toMidiNote(), "Mario");
//        Bar bar = new Bar(4);
//        bar.addNote(pn1);
//        bar.addNote(pn1);
//        bar.addNote(restNote);
//        bar.addNote(pn1);
//        bar.addNote(restNote);
//        bar.addNote(pn1);
//        bar.addNote(pn3);
//        
//        Note pn4 = new PitchNote(1, 4, new Pitch('G').toMidiNote(), "");
//        Note quarterRest = new RestNote(1, 4, "");
//        Note pn6 = new PitchNote(1, 4, new Pitch('B').toMidiNote(), "");
//        Bar bar2 = new Bar(4);
//        bar2.addNote(pn4);
//        bar2.addNote(quarterRest);
//        bar2.addNote(pn4);
//        bar2.addNote(quarterRest);
//
//        Note pn7 = new PitchNote(3, 8, new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), "");
//        Note pn8 = new PitchNote(1, 8, new Pitch('G').toMidiNote(), "");
//        Note pn9 = new PitchNote(1, 4, new Pitch('E').toMidiNote(), "");
//        Bar bar3 = new Bar(4);
//        bar3.addNote(pn7);
//        bar3.addNote(pn8);
//        bar3.addNote(quarterRest);
//        bar3.addNote(pn9);        
//
//        Note pn10 = new PitchNote(1, 8, new Pitch('E').toMidiNote(), "");
//        Note pn11 = new PitchNote(1, 4, new Pitch('A').toMidiNote(), "");
//        Note pn12 = new PitchNote(1, 4, new Pitch('B').toMidiNote(), "");
//        Note pn13 = new PitchNote(1, 8, new Pitch('B').transpose(-1).toMidiNote(), "");
//        
//        Bar bar4 = new Bar(4);
//        bar4.addNote(pn10);
//        bar4.addNote(pn11);
//        bar4.addNote(pn12);        
//        bar4.addNote(pn13);                
//        bar4.addNote(pn11);
//
//        Note pn14 = new PitchNote(1, 6, new Pitch('G').toMidiNote(), "");
//        Note pn15 = new PitchNote(1, 6, new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), "");
//        Note pn16 = new PitchNote(1, 6, new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), "");
//        Note pn17 = new PitchNote(1, 4, new Pitch('A').transpose(Pitch.OCTAVE).toMidiNote(), "");
//        Note pn18 = new PitchNote(1, 8, new Pitch('F').transpose(Pitch.OCTAVE).toMidiNote(), "");
//        Note pn19 = new PitchNote(1, 8, new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), "");
//
//        Bar bar5 = new Bar(4);
//        bar5.addNote(pn14);
//        bar5.addNote(pn15);
//        bar5.addNote(pn16);
//        bar5.addNote(pn17);
//        bar5.addNote(pn18);
//        bar5.addNote(pn19);
//
//        Note pn20 = new PitchNote(1, 4, new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), "");
//        Note pn21 = new PitchNote(1, 8, new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), "");
//        Note pn22 = new PitchNote(1, 8, new Pitch('D').transpose(Pitch.OCTAVE).toMidiNote(), "");
//        Note pn23 = new PitchNote(3, 16, new Pitch('B').toMidiNote(), "");
//        Note restNote3 = new RestNote(3, 16, "");
//
//        Bar bar6 = new Bar(4);
//        bar6.addNote(restNote);
//        bar6.addNote(pn20);
//        bar6.addNote(pn21);
//        bar6.addNote(pn22);
//        bar6.addNote(pn23);
//        bar6.addNote(restNote3);
//
//        ArrayList<Bar> firstVoice = new ArrayList<Bar>();
//        firstVoice.add(bar);
//        firstVoice.add(bar2);
//        firstVoice.add(bar3);
//        firstVoice.add(bar4);
//        firstVoice.add(bar5);
//        firstVoice.add(bar6);
//        
//        ArrayList<Bar> secondVoice = new ArrayList<Bar>();
//        Note pn2 = new PitchNote(1, 8, new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), "");
//        Bar bar7 = new Bar(4);
//        bar7.addNote(pn2);
//        bar7.addNote(pn2);
//        bar7.addNote(restNote);
//        bar7.addNote(pn2);
//        bar7.addNote(restNote);
//        bar7.addNote(pn21);
//        bar7.addNote(pn20);
//
//        Note wholeRestNote = new RestNote(4, 4, "");
//        Note pn24 = new PitchNote(1, 4, new Pitch('B').toMidiNote(), "");
//        Bar bar8 = new Bar(4);
//        bar8.addNote(pn24);
//        secondVoice.add(bar7);
//        secondVoice.add(bar8);
//        
//        Note pn25 = new PitchNote(1, 4, new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(),"");
//        ArrayList<Bar> thirdVoice = new ArrayList<Bar>();
//        Bar bar9 = new Bar(4);
//        bar9.addNote(wholeRestNote);
//        Bar bar10 = new Bar(4);
//        bar10.addNote(pn25);
//        thirdVoice.add(bar9);
//        thirdVoice.add(bar10);
//        
//        MusicalPhrase firstPhrase = new MusicalPhrase(firstVoice);
//        MusicalPhrase secondPhrase = new MusicalPhrase(secondVoice);
//        MusicalPhrase thirdPhrase = new MusicalPhrase(thirdVoice);
//        
//        ArrayList<MusicalPhrase> musicalPhrases = new ArrayList<MusicalPhrase>();
//        musicalPhrases.add(firstPhrase);
//        musicalPhrases.add(secondPhrase);
//        musicalPhrases.add(thirdPhrase);
//
//        MusicalPiece testPiece = new MusicalPiece("Piece No. 2", "Anonymous", 4, 4, 200, musicalPhrases);
//        testPiece.playPiece();

//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String fileName;
//        do {
//            // Display prompt
//            System.out.println("\nEnter ABC Song Name. ");
//            // Read input
//            fileName = in.readLine();
//            // Terminate if input empty
//            if (!fileName.equals("")) {
//                play(fileName);
//            }
//        } while (!fileName.equals(""));
//    }
}
