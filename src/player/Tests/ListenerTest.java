package player.Tests;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import player.Listener;
import player.MusicalPiece;

public class ListenerTest {

	/**
	 * This class tests methods in the listener against the creation of a tree
	 * in out ADT.
	 * 
	 * Testing Strategy:
	 *  1) Listener Helper Methods
	 *      a) Test trailing whitespace removal helper method
	 *      
	 *  2) Header -> ADT:
	 *      a) Test the header title is being stored in the ADT
	 *      b) Test the header composer is being stored in the ADT
	 *      c) Test the header meter is being stored in the ADT
	 *      d) Test the header tempo is being stored in the ADT
	 * 
	 *  3) Body -> ADT:
	 *      a) Test the phrases title is being stored in the ADT
	 *      b) Test that repeat is working properly is being stored in the ADT
	 * 
	 * @category no_didit
	 */
	
	@Test
	public void whitespaceRemovalTest() {
	    // Test trailing whitespace removal method
		String white = "     abcdef";
		String output=new Listener().removeWhitespaceAtBeginning(white);
		assertTrue("abcdef".equals(output));
	}
	
	@Test
	public void headerTitleTest() {
	 // Test the header title is being stored in the ADT
		MusicalPiece mp = parse("sample_abc/abc_song.abc");
		assertTrue(mp.getTitle().equals("Alphabet Song"));
	}
	
	@Test
    public void headerComposerTest() {
	 // Test the header composer is being stored in the ADT
        MusicalPiece mp = parse("extra_abc/clocks.abc");
        assertTrue(mp.getComposer().equals("Coldplay"));
    }
	
	@Test
    public void headerMeterTest() {
	 // Test the header meter is being stored in the ADT
        MusicalPiece mp = parse("extra_abc/clocks.abc");
        assertTrue(mp.getMeterNumerator().equals(4));
        assertTrue(mp.getMeterDenominator().equals(4));
    }
	
	@Test
    public void headerTempoTest() {
	 // Test the header tempo is being stored in the ADT
        MusicalPiece mp = parse("extra_abc/clocks.abc");
        assertTrue(mp.getTempo().equals(130));
    }
	
    @Test
    public void headerPhrasesTest() {
     // Test the phrases title is being stored in the ADT
        MusicalPiece mp = parse("extra_abc/clocks.abc");
        assertTrue(mp.getPhrases().size() == 1);
        assertEquals(mp.getPhrases().get(0).getBars().get(0).getNotes().get(0).getLength(), 0.125, 0.0001);
    }
    
    @Test
    public void headerRepeatTest() {
     // Test that repeat is working properly is being stored in the ADT
        MusicalPiece mp = parse("extra_abc/clocks.abc");
        assertTrue(mp.getPhrases().size() == 1);
        assertEquals(mp.getPhrases().get(0).getBars().size(), 11);
    }
	
	  //Allows to test parsing of string input. If the parsing fails ANTLR will throw an exception.
	  public static MusicalPiece parse(String filePath) {
	      MusicalPiece musicalPiece = null;
	      try {
	          BufferedReader in = new BufferedReader(new FileReader(new java.io.File(filePath).getAbsolutePath()));
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
	          
	          // Next 2 Lines ***FOR DEBUGGING ONLY***
	          //System.err.println(tree.toStringTree(parser));
	          //((RuleContext) tree).inspect(parser);

	          // Walk the tree with the listener.
	          ParseTreeWalker walker = new ParseTreeWalker();
	          ParseTreeListener listener = new Listener();
	          walker.walk(listener, tree);
	          
	          musicalPiece = ((Listener) listener).getMusicalPiece();
	          //musicalPiece.playPiece();
	      } 
	      catch (IOException e) {
	          System.err.println("ERROR: " + e.getMessage());
	          System.err.println("Please try again.");
	      } 
	      return musicalPiece;
	}
}
