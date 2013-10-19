// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCMusicListener extends ParseTreeListener {
	void enterLine(ABCMusicParser.LineContext ctx);
	void exitLine(ABCMusicParser.LineContext ctx);

	void enterAccidental(ABCMusicParser.AccidentalContext ctx);
	void exitAccidental(ABCMusicParser.AccidentalContext ctx);

	void enterLiteral(ABCMusicParser.LiteralContext ctx);
	void exitLiteral(ABCMusicParser.LiteralContext ctx);
}