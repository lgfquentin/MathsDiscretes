// Generated from C:/Users/ruben/Desktop/MathD_ANTLR/TP_2/PCF2/src/parser/PCF.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PCFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OP=6, OP2=7, LIT=8, LINE_COMMENT=9, 
		WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "OP", "OP2", "LIT", "LINE_COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ifz'", "'then'", "'else'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OP", "OP2", "LIT", "LINE_COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PCFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PCF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\nI\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007/\b"+
		"\u0007\n\u0007\f\u00072\t\u0007\u0003\u00074\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b:\b\b\n\b\f\b=\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0004\tD\b\t\u000b\t\f\tE\u0001\t\u0001\t\u0000\u0000\n\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0001\u0000\u0006\u0002\u0000++--\u0002\u0000**//\u0001"+
		"\u000019\u0001\u000009\u0001\u0000\n\n\u0003\u0000\t\n\r\r  L\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001\u0000"+
		"\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000\u0005\u001e\u0001\u0000"+
		"\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t%\u0001\u0000\u0000\u0000"+
		"\u000b\'\u0001\u0000\u0000\u0000\r)\u0001\u0000\u0000\u0000\u000f3\u0001"+
		"\u0000\u0000\u0000\u00115\u0001\u0000\u0000\u0000\u0013C\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0005i\u0000\u0000\u0016\u0017\u0005f\u0000\u0000\u0017"+
		"\u0018\u0005z\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005t\u0000\u0000\u001a\u001b\u0005h\u0000\u0000\u001b\u001c\u0005e"+
		"\u0000\u0000\u001c\u001d\u0005n\u0000\u0000\u001d\u0004\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005e\u0000\u0000\u001f \u0005l\u0000\u0000 !\u0005"+
		"s\u0000\u0000!\"\u0005e\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#$"+
		"\u0005(\u0000\u0000$\b\u0001\u0000\u0000\u0000%&\u0005)\u0000\u0000&\n"+
		"\u0001\u0000\u0000\u0000\'(\u0007\u0000\u0000\u0000(\f\u0001\u0000\u0000"+
		"\u0000)*\u0007\u0001\u0000\u0000*\u000e\u0001\u0000\u0000\u0000+4\u0005"+
		"0\u0000\u0000,0\u0007\u0002\u0000\u0000-/\u0007\u0003\u0000\u0000.-\u0001"+
		"\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u00003+\u0001\u0000\u0000\u00003,\u0001\u0000\u0000\u00004\u0010\u0001"+
		"\u0000\u0000\u000056\u0005/\u0000\u000067\u0005/\u0000\u00007;\u0001\u0000"+
		"\u0000\u00008:\b\u0004\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005\n\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@A\u0006\b\u0000\u0000A\u0012\u0001\u0000\u0000\u0000"+
		"BD\u0007\u0005\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GH\u0006\t\u0000\u0000H\u0014\u0001\u0000\u0000\u0000\u0005"+
		"\u000003;E\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}