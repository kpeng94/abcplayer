package player;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.util.Stack;

import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends ABCMusicBaseListener {
    
    private Stack<Object> stack = new Stack<Object>();
    public MusicalPiece getMusicalPiece() {
        // TODO: implement getMusicalPiece()
        return null;
    }
    
    @Override 
    public void exitNote_length_strict(ABCMusicParser.Note_length_strictContext ctx) {
        
    }
    
    @Override 
    public void exitLiteral(ABCMusicParser.LiteralContext ctx) { 
        TerminalNode token;
        if (ctx.start.getType() == ABCMusicLexer.BASENOTE) {
            token = ctx.BASENOTE();
//            stack.push(new Object(token.getText()));
        }
    }


}
