package grammar;

import static org.junit.Assert.*;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

/**
 * This is the test suite for Lexer. These tests will make 
 * sure your Lexer works as expected.
 */
public class LexerTest {

    // Here, we will test ABCHeader grammar against the three warm up pieces.
    
    @Test
    public void testPieceOneHeader() {
      // Testing that the lexer tokenizes piece one properly
        verifyLexer("X:1\nT:Piece No.1\nM:4/4\nL:1/4\nQ:1/4=140\nK:C", new String[] {"X:", "1", "\n", "T:", "Piece No.1", "\n", "M:", "4", "/", "4", "\n", "L:", "1", "/", "4", "\n", "Q:", "1", "/", "4", "=", "140", "\n", "K:", "C"});
    }
    
    @Test
    public void testPieceTwoHeader() {
      // Testing that the lexer tokenizes piece two properly
        verifyLexer("X:1\nT:Piece No.2\nM:C\nL:1/4\nQ:1/4=200\nK:C", new String[] {"X:", "1", "\n", "T:", "Piece No.2", "\n", "M:", "C", "\n", "L:", "1", "/", "4", "\n", "Q:", "1", "/", "4", "=", "200", "\n", "K:", "C"});
    }
    
    @Test
    public void testPieceThreeHeader() {
      // Testing that the lexer tokenizes piece three properly
        verifyLexer("X: 3\nT: Sample 3\nC: Me\nQ: 1/8=100\nM: 3/4\nL: 1/8\nK: C", new String[] {"X: ", "3", "\n", "T: ", "Sample 3", "\n", "C: ", "Me", "\n", "Q: ", "1", "/", "8", "=", "100", "\n", "M: ", "3", "/", "4", "\n", "L: ", "1", "/", "8", "\n", "K: ", "C"});
    }
    
    // Here, we will test ABCBody grammar portion against the three warm up pieces file.
    
    @Test
    public void testNote(){
    	// Testing that a single note is parsed properly
    	verifyLexer("B", new String[] {"B"});
    }
    
    @Test
    public void testSharpNote() {
    	// Testing that a note with a sharp gets tokenized
    	verifyLexer("B^", new String[] {"B", "^"});
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testNonNote() {
    	verifyLexer("ZZ", new String[] {"ZZ"});
    }
    
    @Test
    public void testMeasureNote() {
    	verifyLexer("C C C3/4 D/4 E |", new String[] {"C", "C", "C3/4", "D/4", "E", "|"});
    }
    // This code is taken from PS2
    public void verifyLexer(String input, String[] expectedTokens) {
        CharStream stream = new ANTLRInputStream(input);
        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.reportErrorsAsExceptions();
        List<? extends Token> actualTokens = lexer.getAllTokens();

        assertEquals(expectedTokens.length, actualTokens.size());
        
        for(int i = 0; i < actualTokens.size(); i++) {
             String actualToken = actualTokens.get(i).getText();
             String expectedToken = expectedTokens[i];
             assertEquals(actualToken, expectedToken);
        }
    }
}
