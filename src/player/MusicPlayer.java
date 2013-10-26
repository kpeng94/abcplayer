package player;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MusicPlayer {
    
    public void parse(String piece) {
        runListener(piece);
//        TODO: return MusicalPiece
//        return runListener(piece);
    }
    
    public void runListener(String input) {
              CharStream stream = new ANTLRInputStream(input);
              // TODO: Change this to FileStream
              ABCMusicLexer lexer = new ABCMusicLexer(stream);
              lexer.reportErrorsAsExceptions();
              TokenStream tokens = new CommonTokenStream(lexer);
              

              ABCMusicParser parser = new ABCMusicParser(tokens);
              parser.reportErrorsAsExceptions();
              
              ParseTree tree;
//              tree = parser.abc_music();
              System.out.println("wat");
//              System.err.println(tree.toStringTree(parser));
              
//              ParseTreeWalker walker = new ParseTreeWalker();
//              ParseTreeListener listener = new Listener();
//              walker.walk(listener, tree);
//              return ((Listener) listener).getMusicalPiece();
              
    }
}
