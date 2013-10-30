// Generated from ABCLyric.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCLyricLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HYPHEN=1, UNDERSCORE=2, SPACES=3, ASTERISK=4, BAR=5, WORD=6, EOL=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"HYPHEN", "UNDERSCORE", "SPACES", "ASTERISK", "BAR", "WORD", "EOL"
	};
	public static final String[] ruleNames = {
		"HYPHEN", "UNDERSCORE", "SPACES", "ASTERISK", "BAR", "WORD", "EOL"
	};


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        removeErrorListeners();
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public ABCLyricLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCLyric.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\t?\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3"+
		"\2\3\2\7\2\24\n\2\f\2\16\2\27\13\2\3\3\6\3\32\n\3\r\3\16\3\33\3\3\7\3"+
		"\37\n\3\f\3\16\3\"\13\3\3\4\6\4%\n\4\r\4\16\4&\3\5\3\5\7\5+\n\5\f\5\16"+
		"\5.\13\5\3\6\3\6\7\6\62\n\6\f\6\16\6\65\13\6\3\7\3\7\3\7\6\7:\n\7\r\7"+
		"\16\7;\3\b\3\b\2\t\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\3\2\n\4"+
		"\13\13\"\"\3aa\4\13\13\"\"\4\13\13\"\"\4\13\13\"\"\4\13\13\"\"\13#+.."+
		"\60\60\62;A\\^^``c|\u0080\u0080\4\f\f\17\17F\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2"+
		"\2\2\5\31\3\2\2\2\7$\3\2\2\2\t(\3\2\2\2\13/\3\2\2\2\r9\3\2\2\2\17=\3\2"+
		"\2\2\21\25\7/\2\2\22\24\t\2\2\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2"+
		"\2\2\25\26\3\2\2\2\26\4\3\2\2\2\27\25\3\2\2\2\30\32\t\3\2\2\31\30\3\2"+
		"\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34 \3\2\2\2\35\37\t\4\2"+
		"\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\6\3\2\2\2\" \3\2"+
		"\2\2#%\t\5\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\b\3\2\2\2(,"+
		"\7,\2\2)+\t\6\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\n\3\2\2\2."+
		",\3\2\2\2/\63\7~\2\2\60\62\t\7\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3"+
		"\2\2\2\63\64\3\2\2\2\64\f\3\2\2\2\65\63\3\2\2\2\66\67\7^\2\2\67:\7/\2"+
		"\28:\t\b\2\29\66\3\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\16\3"+
		"\2\2\2=>\t\t\2\2>\20\3\2\2\2\13\2\25\33 &,\639;";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}