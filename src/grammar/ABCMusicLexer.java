// Generated from ABCMusic.g4 by ANTLR 4.0

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
public class ABCMusicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, DIGIT=2, TEXT=3, INUMBER=4, ITITLE=5, ICOMPOSER=6, ILENGTH=7, 
		IMETER=8, ITEMPO=9, IVOICE=10, IKEY=11, EOL=12, MODEMINOR=13, ACCIDENTAL=14, 
		COMMENTSIGN=15, SLASH=16, EQUALS=17, BASENOTE=18, COMMON=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "DIGIT", "TEXT", "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", 
		"'V:'", "'K:'", "EOL", "'m'", "ACCIDENTAL", "'%'", "'/'", "'='", "BASENOTE", 
		"COMMON"
	};
	public static final String[] ruleNames = {
		"PLUS", "DIGIT", "TEXT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", 
		"IMETER", "ITEMPO", "IVOICE", "IKEY", "EOL", "MODEMINOR", "ACCIDENTAL", 
		"COMMENTSIGN", "SLASH", "EQUALS", "BASENOTE", "COMMON"
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


	public ABCMusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\25Z\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\6\4/\n\4"+
		"\r\4\16\4\60\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\2\25\3\3\1\5\4\1\7"+
		"\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33"+
		"\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1\3\2\b\3\62;\3c|\4\f\f\17"+
		"\17\4%%dd\4CIci\5AAEE~~Z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2"+
		"\2\7.\3\2\2\2\t\62\3\2\2\2\13\65\3\2\2\2\r8\3\2\2\2\17;\3\2\2\2\21>\3"+
		"\2\2\2\23A\3\2\2\2\25D\3\2\2\2\27G\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35"+
		"N\3\2\2\2\37P\3\2\2\2!R\3\2\2\2#T\3\2\2\2%V\3\2\2\2\'X\3\2\2\2)*\7-\2"+
		"\2*\4\3\2\2\2+,\t\2\2\2,\6\3\2\2\2-/\t\3\2\2.-\3\2\2\2/\60\3\2\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\b\3\2\2\2\62\63\7Z\2\2\63\64\7<\2\2\64\n\3"+
		"\2\2\2\65\66\7V\2\2\66\67\7<\2\2\67\f\3\2\2\289\7E\2\29:\7<\2\2:\16\3"+
		"\2\2\2;<\7N\2\2<=\7<\2\2=\20\3\2\2\2>?\7O\2\2?@\7<\2\2@\22\3\2\2\2AB\7"+
		"S\2\2BC\7<\2\2C\24\3\2\2\2DE\7X\2\2EF\7<\2\2F\26\3\2\2\2GH\7M\2\2HI\7"+
		"<\2\2I\30\3\2\2\2JK\t\4\2\2K\32\3\2\2\2LM\7o\2\2M\34\3\2\2\2NO\t\5\2\2"+
		"O\36\3\2\2\2PQ\7\'\2\2Q \3\2\2\2RS\7\61\2\2S\"\3\2\2\2TU\7?\2\2U$\3\2"+
		"\2\2VW\t\6\2\2W&\3\2\2\2XY\t\7\2\2Y(\3\2\2\2\4\2\60";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}