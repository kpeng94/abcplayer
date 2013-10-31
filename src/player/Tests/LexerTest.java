package player.Tests;

import static org.junit.Assert.*;
import grammar.ABCLyricLexer;
import grammar.ABCMusicLexer;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

/**
 * This is the test suite for Lexer. These tests will make 
 * sure our Lexer works as expected by testing tokenization
 * of the three sample pieces and various small pieces of notes.
 * We also test against combinations of tokens like bars, sharps, chords
 * and lyrics. We also test on a sample file with header and notes
 */
public class LexerTest {

    // We will test ABCHeader grammar against the three warm up pieces.
    
    @Test
    public void testPieceOneHeader() {
      // Testing that the lexer tokenizes piece one properly
        verifyLexer("X:1\nT:Piece No.1\nM:4/4\nL:1/4\nQ:1/4=140\nK:C", new String[] {"X:1", "\n", "T:Piece No.1", "\n", "M:4/4", "\n", "L:1/4", "\n", "Q:1/4=140", "\n", "K:C"});
    }
    
    @Test
    public void testPieceTwoHeader() {
      // Testing that the lexer tokenizes piece two properly
        verifyLexer("X:1\nT:Piece No.2\nM:C\nL:1/4\nQ:1/4=200\nK:C", new String[] {"X:1", "\n", "T:Piece No.2", "\n", "M:C", "\n", "L:1/4", "\n", "Q:1/4=200", "\n", "K:C"});
    }
    
    @Test
    public void testPieceThreeHeader() {
      // Testing that the lexer tokenizes piece three properly
        verifyLexer("X: 3\nT: Sample 3\nC: Me\nQ: 1/8=100\nM: 3/4\nL: 1/8\nK: C", new String[] {"X: 3", "\n", "T: Sample 3", "\n", "C: Me", "\n", "Q: 1/8=100", "\n", "M: 3/4", "\n", "L: 1/8", "\n", "K: C"});
    }
    
    // We will test ABCBody grammar portion against the three warm up pieces file.
    
    @Test
    public void testPieceOneBody() {
      // Testing that the lexer tokenizes piece one properly
        verifyLexer("C C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 | (3c/2c/2c/2 (3G/2G/2G/2 (3B/2B/2B/2 (3C/2C/2C/2 | G3/4 F/4 E3/4 D/4 C2 |]", new String[] {"C"," ","C"," ","C", "3","/","4"," ","D","/","4"," ","E"," ","|"," ","E","3","/","4"," ","D","/","4"," ","E","3","/","4"," ","F","/","4"," ","G","2"," ","|"," ","(3","c","/","2","c","/","2","c","/","2"," ","(3","G","/","2","G","/","2","G","/","2"," ","(3","B","/","2","B","/","2","B","/","2"," ","(3","C","/","2","C","/","2","C","/","2"," ","|"," ","G","3","/","4"," ","F","/","4"," ","E","3","/","4"," ","D","/","4"," ","C","2"," ","|]"});
    }
    
    @Test
    public void testPieceTwoBody() {
      // Testing that the lexer tokenizes piece two properly
        verifyLexer("[^Fe]/2 [Fe]/2 z/2 [Fe]/2 z/2 [Fc]/2 [Fe] | [GBg] z G z | c3/2 G/2 z E | E/2 A B _B/2 A | (3Geg a f/2 g/2 | z/2 e c/2 d/2 B3/4 z3/4 |]", new String[] {"[","^","F","e","]","/","2"," ","[","F","e","]","/","2"," ","z","/","2"," ","[","F","e","]","/","2"," ","z","/","2"," ","[","F","c","]","/","2"," ","[","F","e","]"," ","|"," ","[","G","B","g","]"," ","z"," ","G"," ","z"," ","|"," ","c","3","/","2"," ","G","/","2"," ","z"," ","E"," ","|"," ","E","/","2"," ","A"," ","B"," ","_","B","/","2"," ","A"," ","|"," ","(3","G","e","g"," ","a"," ","f","/","2"," ","g","/","2"," ","|"," ","z","/","2"," ","e"," ","c","/","2"," ","d","/","2"," ","B","3","/","4"," ","z","3","/","4"," ","|]"});
    }
    
    @Test
    public void testPieceThreeBody() {
      // Testing that the lexer tokenizes piece three properly
        verifyLexer("z4 D2 | G4 BG | B4 A2 | G4 E2 | D4 D2 | G4 BG | B4 A2 | D'6 | D'2 z4 |]", new String[] {"z","4"," ","D","2"," ","|"," ","G","4"," ","B","G"," ","|"," ","B","4"," ","A","2"," ","|"," ","G","4"," ","E","2"," ","|"," ","D","4"," ","D","2"," ","|"," ","G","4"," ","B","G"," ","|"," ","B","4"," ","A","2"," ","|"," ","D","\'","6"," ","|"," ","D","\'","2"," ","z","4"," ","|]"});
    }
    
    @Test
    public void testPieceThreeLyrics() {
      // Testing that the lexer tokenizes piece two lyrics properly
        verifyLyricLexer("A-ma-zing | grace! How | sweet the | sound That | saved a | wretch like | me.", new String[] {"A", "-", "ma", "-", "zing", " ", "| ", "grace!", " ", "How", " ", "| ", "sweet", " ", "the", " ", "| ", "sound", " ", "That", " ", "| ", "saved", " ", "a", " ", "| ", "wretch", " ", "like", " ", "| ", "me."});
    }
    
    // We will test some isolated strings for the tokenization of important tokens in our grammar
    
    @Test
    public void testBaseNote(){
    	// Testing that single notes is parsed properly
    	verifyLexer("a b c d e f g A B C D E F G", new String[] {"a"," ","b"," ","c"," ","d"," ","e"," ","f"," ","g"," ","A"," ","B"," ","C"," ","D"," ","E"," ","F"," ","G"});
    }
    
    @Test
    public void testBar(){
        // Testing that a bar is parsed properly
        verifyLexer("| :| |: ", new String[] {"|"," ",":|"," ","|:", " "});
    }
    
    @Test
    public void testComment() {
        // Testing that a comment gets tokenized seperately
        verifyLexer("B % This is a comment123", new String[] {"B", " ", "% This is a comment123"});
    }
    
    @Test
    public void testLyricalElement() {
        // Testing that a lyrical element tokenized by ABCBody (not ABCLyric)
        verifyLexer("w: A-ma-zing | grace! How | sweet the | sound That | saved a | wretch like | me.", new String[] {"w: A-ma-zing | grace! How | sweet the | sound That | saved a | wretch like | me."});
    }
    
    @Test
    public void testChords() {
        // Testing that a lyrical element tokenized by ABCBody (not ABCLyric)
        verifyLexer("[G3AA]", new String[] {"[", "G", "3", "A", "A", "]"});
    }
    
    @Test
    public void testSharpFlatNeutralNote() {
    	// Testing that a note with a sharp, flat or neutral gets tokenized
    	verifyLexer("B^", new String[] {"B", "^"});
    	verifyLexer("B_", new String[] {"B", "_"});
    	verifyLexer("=B", new String[] {"=", "B"});
    }
    
    // We will test a small file to verify that the lexer tokenizes it properly
    
    @Test
    public void testSmallFile() {
        // Testing a small to verify lexer tokenizing the header and a body properly
        verifyLexer("X:1\nT:Alphabet Song\nC:Traditional Kid's Song\nM:4/4\nL:1/4\nQ:1/4=100\nK:D\nD D A A|B B A2|", new String[] 
                {"X:1","\n","T:Alphabet Song","\n", "C:Traditional Kid's Song","\n", "M:4/4", "\n","L:1/4","\n", "Q:1/4=100","\n", "K:D","\n", "D", " ", "D", " ", "A"," ", "A", "|", "B", " ","B", " ", "A","2", "|"});
        
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
             /* FOR DEBUGGING ONLY
             System.out.println(expectedToken);
             System.out.println(actualToken);
             */
             assertEquals(actualToken, expectedToken);
        }
    }
    
 // This code is taken from PS2
    public void verifyLyricLexer(String input, String[] expectedTokens) {
        CharStream stream = new ANTLRInputStream(input);
        ABCLyricLexer lexer = new ABCLyricLexer(stream);
        lexer.reportErrorsAsExceptions();
        List<? extends Token> actualTokens = lexer.getAllTokens();

        assertEquals(expectedTokens.length, actualTokens.size());
                
        for(int i = 0; i < actualTokens.size(); i++) {
             String actualToken = actualTokens.get(i).getText();
             String expectedToken = expectedTokens[i];
             /* FOR DEBUGGING ONLY 
             System.out.println(expectedToken);
             System.out.println(actualToken);
             */
             assertEquals(actualToken, expectedToken);
        }
    }
}
