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
            
            // Next 2 Lines ***FOR DEBUGGING ONLY***
            //System.err.println(tree.toStringTree(parser));
            ((RuleContext) tree).inspect(parser);

            // Walk the tree with the listener.
            ParseTreeWalker walker = new ParseTreeWalker();
            ParseTreeListener listener = new Listener();
            walker.walk(listener, tree);
            
            MusicalPiece musicalPiece = ((Listener) listener).getMusicalPiece();
//            System.out.println(musicalPiece.toString());
            musicalPiece.playPiece();
        } 
        catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
            System.err.println("Please try again.");
        } 
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        do {
            // Display prompt
            System.out.println("\nEnter ABC Song Name. ");
            // TODO: edit println statement to give example as well.
            // Read input as file path relative to abcplayer directory
            fileName = in.readLine();
            // Terminate if input empty
            if (!fileName.equals("")) {
                play(fileName);
            }
        } while (!fileName.equals(""));
    }
}
