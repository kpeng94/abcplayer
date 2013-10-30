package player.Tests;

import static org.junit.Assert.*;
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
	 * Header Tests
	 */
	
	@Test
	public void whitespaceRemovalTest() {
		String white = "     abcdef";
		String output=new Listener().removeWhitespaceAtBeginning(white);
		assertTrue("abcdef".equals(output));
	}
	
	@Test
	public void headerTitleTest() {
		MusicalPiece mp = play("sample_abc/abc_song.abc");
		assertTrue(mp.getTitle().equals("Alphabet Song"));
	}
	
	@Test
	public MusicalPiece play(String song){
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
        
        // Walk the tree with the listener.
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new Listener();
        walker.walk(listener, tree);
        
        MusicalPiece musicalPiece = ((Listener) listener).getMusicalPiece();
        return musicalPiece;
       
	}
}
