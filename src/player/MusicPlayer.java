package player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MusicPlayer {
    
    public void parse(String piece, String testField) {
        runListener(piece, testField);
//        TODO: return MusicalPiece
//        return runListener(piece);
    }
    
    // TODO: remove or edit this later. Temporarily using this to test input reading for files.
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
            
            // Next 2 Lines ***FOR DEBUGGING ONLY***
            System.err.println(tree.toStringTree(parser));
//            ((RuleContext) tree).inspect(parser);

            // Walk the tree with the listener.
            ParseTreeWalker walker = new ParseTreeWalker();
            ParseTreeListener listener = new Listener();
            walker.walk(listener, tree);
            
            MusicalPiece musicalPiece = ((Listener) listener).getMusicalPiece();
//            musicalPiece.playPiece();
        } 
        catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
            System.err.println("Please try again.");
        } 
    }

    
    public void runListener(String input, String testField) {
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

              System.err.println(tree.toStringTree(parser));
              ((RuleContext) tree).inspect(parser);
              
//              ParseTreeWalker walker = new ParseTreeWalker();
//              ParseTreeListener listener = new Listener();
//              walker.walk(listener, tree);
//              return ((Listener) listener).getMusicalPiece();
              
    }
}
