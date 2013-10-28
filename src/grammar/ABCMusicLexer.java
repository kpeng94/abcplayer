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
		PLUS=1, DIGIT=2, INUMBER=3, ITITLE=4, ICOMPOSER=5, ILENGTH=6, IMETER=7, 
		ITEMPO=8, IVOICE=9, IKEY=10, EOL=11, COMMENTSIGN=12, SLASH=13, BASENOTE=14, 
		OCTAVE=15, REST=16, BAR=17, SHARP=18, FLAT=19, NEUTRAL=20, NTH_REPEAT=21, 
		SPACE=22, LYRICAL_ELEMENT_TOKEN=23, ILYRIC=24, OPEN_BRACKET=25, CLOSE_BRACKET=26, 
		OPEN_PAREN=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "DIGIT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", "IMETER", 
		"ITEMPO", "IVOICE", "IKEY", "EOL", "COMMENTSIGN", "'/'", "BASENOTE", "OCTAVE", 
		"REST", "BAR", "SHARP", "FLAT", "NEUTRAL", "NTH_REPEAT", "' '", "LYRICAL_ELEMENT_TOKEN", 
		"ILYRIC", "'['", "']'", "'('"
	};
	public static final String[] ruleNames = {
		"PLUS", "DIGIT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", "IMETER", 
		"ITEMPO", "IVOICE", "IKEY", "EOL", "COMMENTSIGN", "SLASH", "BASENOTE", 
		"OCTAVE", "REST", "BAR", "SHARP", "FLAT", "NEUTRAL", "NTH_REPEAT", "SPACE", 
		"LYRICAL_ELEMENT_TOKEN", "ILYRIC", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PAREN"
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21: SPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\35\u0131\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16\4E\13\4\3\4\6\4H\n\4\r\4\16\4I\3\5"+
		"\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13\5\3\5\6\5V\n\5\r\5\16\5W\3\6\3\6\3"+
		"\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6\6\6d\n\6\r\6\16\6e\3\7\3\7\3\7\3\7"+
		"\7\7l\n\7\f\7\16\7o\13\7\3\7\6\7r\n\7\r\7\16\7s\3\7\3\7\6\7x\n\7\r\7\16"+
		"\7y\3\b\3\b\3\b\3\b\7\b\u0080\n\b\f\b\16\b\u0083\13\b\3\b\3\b\3\b\5\b"+
		"\u0088\n\b\3\b\6\b\u008b\n\b\r\b\16\b\u008c\3\b\3\b\6\b\u0091\n\b\r\b"+
		"\16\b\u0092\5\b\u0095\n\b\3\t\3\t\3\t\3\t\7\t\u009b\n\t\f\t\16\t\u009e"+
		"\13\t\3\t\3\t\3\t\5\t\u00a3\n\t\3\t\6\t\u00a6\n\t\r\t\16\t\u00a7\3\t\3"+
		"\t\6\t\u00ac\n\t\r\t\16\t\u00ad\3\t\3\t\6\t\u00b2\n\t\r\t\16\t\u00b3\7"+
		"\t\u00b6\n\t\f\t\16\t\u00b9\13\t\5\t\u00bb\n\t\3\n\3\n\3\n\3\n\7\n\u00c1"+
		"\n\n\f\n\16\n\u00c4\13\n\3\n\6\n\u00c7\n\n\r\n\16\n\u00c8\3\13\3\13\3"+
		"\13\3\13\7\13\u00cf\n\13\f\13\16\13\u00d2\13\13\3\13\3\13\5\13\u00d6\n"+
		"\13\3\13\5\13\u00d9\n\13\3\f\3\f\3\r\3\r\7\r\u00df\n\r\f\r\16\r\u00e2"+
		"\13\r\3\16\3\16\3\17\3\17\3\20\6\20\u00e9\n\20\r\20\16\20\u00ea\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fa"+
		"\n\22\3\23\3\23\3\23\5\23\u00ff\n\23\3\24\3\24\3\24\5\24\u0104\n\24\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\5\26\u010c\n\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\5\30\u0116\n\30\3\31\3\31\3\31\3\31\7\31\u011c\n\31\f"+
		"\31\16\31\u011f\13\31\3\31\6\31\u0122\n\31\r\31\16\31\u0123\3\31\7\31"+
		"\u0127\n\31\f\31\16\31\u012a\13\31\3\32\3\32\3\33\3\33\3\34\3\34\2\35"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\2/\31\1\61\32\1\63\33\1\65\34\1\67\35\1\3\2=\3\62;\4\13\13\"\""+
		"\3\62;\4\13\13\"\"\t\"$().\60\62;AAC\\c|\4\13\13\"\"\t\"$().\60\62;AA"+
		"C\\c|\4\13\13\"\"\3\62;\3\62;\4\13\13\"\"\3EE\4^^~~\3EE\3\62;\3\62;\4"+
		"\13\13\"\"\3EE\4^^~~\3EE\3\62;\3\62;\3\62;\4\13\13\"\"\t\"$().\60\62;"+
		"AAC\\c|\4\13\13\"\"\3Ci\4%%dd\3oo\4\f\f\17\17\t\"$().\60\62;AAC\\c|\4"+
		"CIci\4))..\3||\4^^~~\4^^~~\4^^~~\4))<<\4))<<\4^^~~\3]]\4^^~~\4^^~~\3^"+
		"_\4^^~~\4^^``\4^^``\4^^``\4^^aa\4^^aa\4^^aa\3??\3]]\3\63\63\3]]\3\64\64"+
		"\7\"\",,//aa\u0080\u0080\4\13\13\"\"\13##%&(+..\60\60\62;A\\^^c|\u015a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3"+
		"\2\2\2\7=\3\2\2\2\tK\3\2\2\2\13Y\3\2\2\2\rg\3\2\2\2\17{\3\2\2\2\21\u0096"+
		"\3\2\2\2\23\u00bc\3\2\2\2\25\u00ca\3\2\2\2\27\u00da\3\2\2\2\31\u00dc\3"+
		"\2\2\2\33\u00e3\3\2\2\2\35\u00e5\3\2\2\2\37\u00e8\3\2\2\2!\u00ec\3\2\2"+
		"\2#\u00f9\3\2\2\2%\u00fe\3\2\2\2\'\u0103\3\2\2\2)\u0105\3\2\2\2+\u010b"+
		"\3\2\2\2-\u010d\3\2\2\2/\u0115\3\2\2\2\61\u0117\3\2\2\2\63\u012b\3\2\2"+
		"\2\65\u012d\3\2\2\2\67\u012f\3\2\2\29:\7-\2\2:\4\3\2\2\2;<\t\2\2\2<\6"+
		"\3\2\2\2=>\7Z\2\2>?\7<\2\2?C\3\2\2\2@B\t\3\2\2A@\3\2\2\2BE\3\2\2\2CA\3"+
		"\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2FH\t\4\2\2GF\3\2\2\2HI\3\2\2\2IG\3"+
		"\2\2\2IJ\3\2\2\2J\b\3\2\2\2KL\7V\2\2LM\7<\2\2MQ\3\2\2\2NP\t\5\2\2ON\3"+
		"\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TV\t\6\2\2UT\3"+
		"\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\n\3\2\2\2YZ\7E\2\2Z[\7<\2\2[_\3"+
		"\2\2\2\\^\t\7\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a"+
		"_\3\2\2\2bd\t\b\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\f\3\2\2\2"+
		"gh\7N\2\2hi\7<\2\2im\3\2\2\2jl\t\t\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2m"+
		"n\3\2\2\2nq\3\2\2\2om\3\2\2\2pr\t\n\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2tu\3\2\2\2uw\7\61\2\2vx\t\13\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2"+
		"\2yz\3\2\2\2z\16\3\2\2\2{|\7O\2\2|}\7<\2\2}\u0081\3\2\2\2~\u0080\t\f\2"+
		"\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0094\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\t\r\2\2\u0085"+
		"\u0088\t\16\2\2\u0086\u0088\t\17\2\2\u0087\u0084\3\2\2\2\u0087\u0086\3"+
		"\2\2\2\u0088\u0095\3\2\2\2\u0089\u008b\t\20\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0090\7\61\2\2\u008f\u0091\t\21\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0087\3\2\2\2\u0094\u008a\3\2\2\2\u0095\20\3\2\2\2\u0096\u0097"+
		"\7S\2\2\u0097\u0098\7<\2\2\u0098\u009c\3\2\2\2\u0099\u009b\t\22\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u00ba\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\t\23\2\2\u00a0"+
		"\u00a3\t\24\2\2\u00a1\u00a3\t\25\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3\u00bb\3\2\2\2\u00a4\u00a6\t\26\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\7\61\2\2\u00aa\u00ac\t\27\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b7\3\2"+
		"\2\2\u00af\u00b1\7?\2\2\u00b0\u00b2\t\30\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00af\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00a2\3\2"+
		"\2\2\u00ba\u00a5\3\2\2\2\u00bb\22\3\2\2\2\u00bc\u00bd\7X\2\2\u00bd\u00be"+
		"\7<\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c1\t\31\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\t\32\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\24\3\2\2"+
		"\2\u00ca\u00cb\7M\2\2\u00cb\u00cc\7<\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cf"+
		"\t\33\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2"+
		"\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5"+
		"\t\34\2\2\u00d4\u00d6\t\35\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d8\3\2\2\2\u00d7\u00d9\t\36\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\26\3\2\2\2\u00da\u00db\t\37\2\2\u00db\30\3\2\2\2\u00dc"+
		"\u00e0\7\'\2\2\u00dd\u00df\t \2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\32\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4\34\3\2\2\2\u00e5\u00e6\t!\2\2\u00e6"+
		"\36\3\2\2\2\u00e7\u00e9\t\"\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2"+
		"\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb \3\2\2\2\u00ec\u00ed"+
		"\t#\2\2\u00ed\"\3\2\2\2\u00ee\u00ef\t$\2\2\u00ef\u00fa\t%\2\2\u00f0\u00f1"+
		"\t&\2\2\u00f1\u00fa\t\'\2\2\u00f2\u00f3\t(\2\2\u00f3\u00fa\t)\2\2\u00f4"+
		"\u00f5\t*\2\2\u00f5\u00fa\t+\2\2\u00f6\u00f7\t,\2\2\u00f7\u00fa\t-\2\2"+
		"\u00f8\u00fa\t.\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00f0\3\2\2\2\u00f9\u00f2"+
		"\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"$\3\2\2\2\u00fb\u00fc\t/\2\2\u00fc\u00ff\t\60\2\2\u00fd\u00ff\t\61\2\2"+
		"\u00fe\u00fb\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff&\3\2\2\2\u0100\u0101\t"+
		"\62\2\2\u0101\u0104\t\63\2\2\u0102\u0104\t\64\2\2\u0103\u0100\3\2\2\2"+
		"\u0103\u0102\3\2\2\2\u0104(\3\2\2\2\u0105\u0106\t\65\2\2\u0106*\3\2\2"+
		"\2\u0107\u0108\t\66\2\2\u0108\u010c\t\67\2\2\u0109\u010a\t8\2\2\u010a"+
		"\u010c\t9\2\2\u010b\u0107\3\2\2\2\u010b\u0109\3\2\2\2\u010c,\3\2\2\2\u010d"+
		"\u010e\7\"\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b\27\2\2\u0110.\3\2\2\2"+
		"\u0111\u0116\t:\2\2\u0112\u0113\7^\2\2\u0113\u0116\7/\2\2\u0114\u0116"+
		"\7~\2\2\u0115\u0111\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\60\3\2\2\2\u0117\u0118\7y\2\2\u0118\u0119\7<\2\2\u0119\u011d\3\2\2\2"+
		"\u011a\u011c\t;\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0128\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0122\t<\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0127\5/\30\2\u0126"+
		"\u0121\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\62\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c"+
		"\7]\2\2\u012c\64\3\2\2\2\u012d\u012e\7_\2\2\u012e\66\3\2\2\2\u012f\u0130"+
		"\7*\2\2\u01308\3\2\2\2)\2CIQW_emsy\u0081\u0087\u008c\u0092\u0094\u009c"+
		"\u00a2\u00a7\u00ad\u00b3\u00b7\u00ba\u00c2\u00c8\u00d0\u00d5\u00d8\u00e0"+
		"\u00e8\u00ea\u00f9\u00fe\u0103\u010b\u0115\u011d\u0123\u0126\u0128";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}