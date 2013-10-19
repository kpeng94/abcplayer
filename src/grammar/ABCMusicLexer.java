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
		COMMENTSIGN=15, SLASH=16, EQUALS=17, BASENOTE=18, COMMON=19, REST=20, 
		BAR=21, SHARP=22, FLAT=23, NEUTRAL=24, TIMES=25, NTH_REPEAT=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "DIGIT", "TEXT", "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", 
		"'V:'", "'K:'", "EOL", "'m'", "ACCIDENTAL", "'%'", "'/'", "EQUALS", "BASENOTE", 
		"COMMON", "'z'", "BAR", "SHARP", "FLAT", "NEUTRAL", "'*'", "NTH_REPEAT"
	};
	public static final String[] ruleNames = {
		"PLUS", "DIGIT", "TEXT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", 
		"IMETER", "ITEMPO", "IVOICE", "IKEY", "EOL", "MODEMINOR", "ACCIDENTAL", 
		"COMMENTSIGN", "SLASH", "EQUALS", "BASENOTE", "COMMON", "REST", "BAR", 
		"SHARP", "FLAT", "NEUTRAL", "TIMES", "NTH_REPEAT"
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
		"\2\4\34\u008b\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\6\4"+
		"=\n\4\r\4\16\4>\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26v\n\26\3\27\3\27"+
		"\3\27\5\27{\n\27\3\30\3\30\3\30\5\30\u0080\n\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\5\33\u008a\n\33\2\34\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1"+
		"\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1"+
		"\65\34\1\3\2\b\3\62;\3c|\4\f\f\17\17\4%%dd\4CIci\5AAEE~~\u0093\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7<\3\2\2\2\t"+
		"@\3\2\2\2\13C\3\2\2\2\rF\3\2\2\2\17I\3\2\2\2\21L\3\2\2\2\23O\3\2\2\2\25"+
		"R\3\2\2\2\27U\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35\\\3\2\2\2\37^\3\2\2\2"+
		"!`\3\2\2\2#b\3\2\2\2%d\3\2\2\2\'f\3\2\2\2)h\3\2\2\2+u\3\2\2\2-z\3\2\2"+
		"\2/\177\3\2\2\2\61\u0081\3\2\2\2\63\u0083\3\2\2\2\65\u0089\3\2\2\2\67"+
		"8\7-\2\28\4\3\2\2\29:\t\2\2\2:\6\3\2\2\2;=\t\3\2\2<;\3\2\2\2=>\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?\b\3\2\2\2@A\7Z\2\2AB\7<\2\2B\n\3\2\2\2CD\7V\2\2"+
		"DE\7<\2\2E\f\3\2\2\2FG\7E\2\2GH\7<\2\2H\16\3\2\2\2IJ\7N\2\2JK\7<\2\2K"+
		"\20\3\2\2\2LM\7O\2\2MN\7<\2\2N\22\3\2\2\2OP\7S\2\2PQ\7<\2\2Q\24\3\2\2"+
		"\2RS\7X\2\2ST\7<\2\2T\26\3\2\2\2UV\7M\2\2VW\7<\2\2W\30\3\2\2\2XY\t\4\2"+
		"\2Y\32\3\2\2\2Z[\7o\2\2[\34\3\2\2\2\\]\t\5\2\2]\36\3\2\2\2^_\7\'\2\2_"+
		" \3\2\2\2`a\7\61\2\2a\"\3\2\2\2bc\7?\2\2c$\3\2\2\2de\t\6\2\2e&\3\2\2\2"+
		"fg\t\7\2\2g(\3\2\2\2hi\7|\2\2i*\3\2\2\2jv\7~\2\2kl\7~\2\2lv\7~\2\2mn\7"+
		"]\2\2nv\7~\2\2op\7~\2\2pv\7_\2\2qr\7<\2\2rv\7~\2\2st\7~\2\2tv\7<\2\2u"+
		"j\3\2\2\2uk\3\2\2\2um\3\2\2\2uo\3\2\2\2uq\3\2\2\2us\3\2\2\2v,\3\2\2\2"+
		"w{\7`\2\2xy\7`\2\2y{\7`\2\2zw\3\2\2\2zx\3\2\2\2{.\3\2\2\2|\u0080\7a\2"+
		"\2}~\7a\2\2~\u0080\7a\2\2\177|\3\2\2\2\177}\3\2\2\2\u0080\60\3\2\2\2\u0081"+
		"\u0082\7?\2\2\u0082\62\3\2\2\2\u0083\u0084\7,\2\2\u0084\64\3\2\2\2\u0085"+
		"\u0086\7]\2\2\u0086\u008a\7\63\2\2\u0087\u0088\7]\2\2\u0088\u008a\7\64"+
		"\2\2\u0089\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u008a\66\3\2\2\2\b\2>uz\177"+
		"\u0089";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}