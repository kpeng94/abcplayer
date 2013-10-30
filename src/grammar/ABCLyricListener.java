// Generated from ABCLyric.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCLyricListener extends ParseTreeListener {
	void enterLyric(ABCLyricParser.LyricContext ctx);
	void exitLyric(ABCLyricParser.LyricContext ctx);

	void enterWord(ABCLyricParser.WordContext ctx);
	void exitWord(ABCLyricParser.WordContext ctx);
}