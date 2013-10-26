package player;

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
