package player.Tests;

import static org.junit.Assert.assertTrue;
import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import player.Listener;
import player.MusicalPhrase;
import player.MusicalPiece;
import player.Note;
import sound.PitchCalculator;

/** 
 * Class to test all the musical pieces in our sample_abc and extra_abc folder
 * Only tests successful parsing of the tree, doesn't play the files
 * 
 * @category no_didit
 */
public class MusicParserTest {
    
    @Test
    public void testPieceOneTwoThree() {
        // Test if we're able to parse the text in piece one, two and three
        String pieceOne = "X: 1\nT:Piece No.1\nM:4/4\nL:1/4\nQ:1/4=140\nK:C\nC C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 | (3c/2c/2c/2 (3G/2G/2G/2 (3B/2B/2B/2 (3C/2C/2C/2 | G3/4 F/4 E3/4 D/4 C2";
        parse(pieceOne, "");
        String pieceTwo = "X:1\nT:Piece No.2\nM:C\nL:1/4\nQ:1/4=200\nK:C\n[^Fe]/2 [Fe]/2 z/2 [Fe]/2 z/2 [Fc]/2 [Fe] | [GBg] z G z | c3/2 G/2 z E | E/2 A B _B/2 A | (3Geg a f/2 g/2 | z/2 e c/2 d/2 B3/4 z3/4";
        parse(pieceTwo,"");
        String pieceThree = "X:3\nT:Sample 3\nC:Me\nQ:1/8=100\nM:3/4\nL:1/8\nK:C\nz4 D2 | G4 BG | B4 A2 | G4 E2 | D4 D2 | G4 BG | B4 A2 | D'6 | D'2 z4 |]\nw: A-ma-zing | grace! How | sweet the | sound That | saved a | wretch like | me.";
        parse(pieceThree, "");
    }
    
    @Test
    public void headerParseTest() {
        // Test if we're able to parse the header of a simple piece.
        String pieceOneHeader = "X:1\nT:Simple scale\nC:Unknown\nM:4/4\nL:1/4\nQ:1/4=120\nK:C\nC D E F | G A B c | c B A G F E D C |";
        MusicalPiece mp = parse(pieceOneHeader, "");
        assertTrue(mp.getTitle().equals("Simple scale"));
        assertTrue(mp.getComposer().equals("Unknown"));
        assertTrue(mp.getMeterNumerator().equals(4));
        assertTrue(mp.getMeterDenominator().equals(4));
        assertTrue(mp.getTempo().equals(120));
    }
    
    @Test
    public void testParseMusic() {
        // Test if we're able to parse the body of a simple piece.
        String alphabetSongBasic = "X:1\nT:Alphabet Song\nC:Traditional Kid's Song\nM:4/4\nL:1/4\nQ:1/4=100\nK:D\n|D D A A|B B A2|G G F F|E/2E/2E/2E/2 D2|";
        MusicalPiece mp= parse(alphabetSongBasic, "");
        ArrayList<MusicalPhrase> phrases = mp.getPhrases();
        ArrayList<Note> notes=phrases.get(0).getBars().get(2).getNotes();
        System.out.println(notes.get(0).getNote().toString());
        assertTrue(notes.get(0).getNote()[0] == (new PitchCalculator().getPitchForKey("D", "B").toMidiNote()));
        assertTrue(notes.get(1).getNote()[0] == (new PitchCalculator().getPitchForKey("D", "B").toMidiNote()));
        assertTrue(notes.get(2).getNote()[0] == (new PitchCalculator().getPitchForKey("D", "A").toMidiNote()));
    }
    
    @Test(expected=NullPointerException.class)
    public void testFailParseMusic() {
        String alphabetSongBasic = "X:1\nT:Alphabet Song\nC:Traditional Kid's Song\nM:4/4\nL:1/4\nQ:1/4=100\nK:D\n|D D A A|B B A2|G G F F|E/2E/2E/2E/2 D2|";
        MusicalPiece mp= parse(alphabetSongBasic, null);
    }
    
    @Test(expected=NullPointerException.class)
    public void testNullExceptionMusic() {
        MusicalPiece mp = parse(null, "");
    }

    // We can test every file to see if it parses and plays without throwing an error and without actually playing the sound for DidIt
    
    @Test
    public void testPieceOneRead() {
        String pieceOneSrc = "sample_abc/piece1.abc";
        play(pieceOneSrc);
    }

    @Test
    public void testPieceTwoRead() {
        String pieceTwoSrc = "sample_abc/piece2.abc";
        play(pieceTwoSrc);        
    }
    
    @Test
    public void testPieceThreeRead() {
        String pieceThreeSrc = "sample_abc/piece3.abc";
        play(pieceThreeSrc);
    }
    
     @Test
    public void scaleRead() {
        String scale = "sample_abc/scale.abc";
        play(scale);
    }

    @Test
    public void lightNightMusicRead() {
        String littleNightMusic = "sample_abc/little_night_music.abc";
        play(littleNightMusic);
    }

    @Test
    public void abcMusicRead() {
        String abcMusic = "sample_abc/abc_song.abc";
        play(abcMusic);
    }
    
    @Test
    public void furEliseMusicRead() {
        String furEliseMusic = "sample_abc/fur_elise.abc";
        play(furEliseMusic);
    }
    
    @Test
    public void waxiesDargleRead() {
        String waxiesDargle = "sample_abc/waxies_dargle.abc";
        play(waxiesDargle);
    }
    
    @Test
    public void paddyRead() {
        String paddy = "sample_abc/paddy.abc";
        play(paddy);
    }
    
    @Test
    public void inventionRead() {
        String invention = "sample_abc/invention.abc";
        play(invention);
    }
    
    @Test
    public void clockRead() {
    	String clock = "extra_abc/clocks.abc";
    	play(clock);
    }
    
    @Test
    public void janaGanaRead() {
    	String jana = "extra_abc/jana_gana_mana.abc";
    	play(jana);
    }
    
    @Test(expected=RuntimeException.class)
    public void happyBirthdayReadFailTest() {
        //Happy Birthday should fail to play because it has tokens not in the 6.005 ABC Subspec
    	String happyBirthday="extra_abc/happy_birthday.abc";
    	play(happyBirthday);
    }
  
  //Allows to test parsing of input file. If the parsing fails ANTLR will throw an exception.
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
          tree = parser.abc_tune(); 
      
          // Walk the tree with the listener.
          ParseTreeWalker walker = new ParseTreeWalker();
          ParseTreeListener listener = new Listener();
          walker.walk(listener, tree);
          
          MusicalPiece musicalPiece = ((Listener) listener).getMusicalPiece();
      } 
      catch (IOException e) {
          System.err.println("ERROR: " + e.getMessage());
          System.err.println("Please try again.");
      } 
  }
  
  //Allows to test parsing of string input on either ABCBody, ABCHeader or Both. If the parsing fails ANTLR will throw an exception.
  public static MusicalPiece parse(String input, String testField) {
      CharStream stream = new ANTLRInputStream(input);
      // TODO: Change this to FileStream
      ABCMusicLexer lexer = new ABCMusicLexer(stream);
      lexer.reportErrorsAsExceptions();
      TokenStream tokens = new CommonTokenStream(lexer);
      
      ABCMusicParser parser = new ABCMusicParser(tokens);
      parser.reportErrorsAsExceptions();
      
      ParseTree tree;
      if (testField.equals("header")) {
          tree = parser.abc_header();
      } else if (testField.equals("body")) {
          tree = parser.abc_music();
      } else {
          tree = parser.abc_tune();
      }
      
      ParseTreeWalker walker = new ParseTreeWalker();
      ParseTreeListener listener = new Listener();
      walker.walk(listener, tree);
      return ((Listener) listener).getMusicalPiece();
      
}
    
}
