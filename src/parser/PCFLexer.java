// Generated from C:/Users/Quent/dev/workspaces/imt/MathsDiscretes/PCF/src/parser/PCF.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, IFZ=4, THEN=5, ELSE=6, LET=7, IN=8, OP=9, OP2=10, 
		LIT=11, ID=12, WS=13, COMMENT=14, LINE_COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "IFZ", "THEN", "ELSE", "LET", "IN", "OP", "OP2", 
			"LIT", "ID", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "'ifz'", "'then'", "'else'", "'let'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IFZ", "THEN", "ELSE", "LET", "IN", "OP", "OP2", 
			"LIT", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
		"\u0004\u0000\u000fq\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0005\nB\b\n\n\n\f\nE\t\n\u0003\nG\b\n\u0001\u000b\u0001"+
		"\u000b\u0005\u000bK\b\u000b\n\u000b\f\u000bN\t\u000b\u0001\f\u0004\fQ"+
		"\b\f\u000b\f\f\fR\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r[\b\r\n\r\f\r^\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000ei\b\u000e\n\u000e\f\u000e"+
		"l\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\\\u0000"+
		"\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u0001\u0000\b\u0002\u0000++--\u0002\u0000**//\u0001\u0000"+
		"19\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n"+
		"\r\r  \u0001\u0000\n\nv\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000"+
		"\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000"+
		"\u0007%\u0001\u0000\u0000\u0000\t)\u0001\u0000\u0000\u0000\u000b.\u0001"+
		"\u0000\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f7\u0001\u0000\u0000"+
		"\u0000\u0011:\u0001\u0000\u0000\u0000\u0013<\u0001\u0000\u0000\u0000\u0015"+
		"F\u0001\u0000\u0000\u0000\u0017H\u0001\u0000\u0000\u0000\u0019P\u0001"+
		"\u0000\u0000\u0000\u001bV\u0001\u0000\u0000\u0000\u001dd\u0001\u0000\u0000"+
		"\u0000\u001f \u0005(\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005"+
		")\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005=\u0000\u0000$\u0006"+
		"\u0001\u0000\u0000\u0000%&\u0005i\u0000\u0000&\'\u0005f\u0000\u0000\'"+
		"(\u0005z\u0000\u0000(\b\u0001\u0000\u0000\u0000)*\u0005t\u0000\u0000*"+
		"+\u0005h\u0000\u0000+,\u0005e\u0000\u0000,-\u0005n\u0000\u0000-\n\u0001"+
		"\u0000\u0000\u0000./\u0005e\u0000\u0000/0\u0005l\u0000\u000001\u0005s"+
		"\u0000\u000012\u0005e\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005l"+
		"\u0000\u000045\u0005e\u0000\u000056\u0005t\u0000\u00006\u000e\u0001\u0000"+
		"\u0000\u000078\u0005i\u0000\u000089\u0005n\u0000\u00009\u0010\u0001\u0000"+
		"\u0000\u0000:;\u0007\u0000\u0000\u0000;\u0012\u0001\u0000\u0000\u0000"+
		"<=\u0007\u0001\u0000\u0000=\u0014\u0001\u0000\u0000\u0000>G\u00050\u0000"+
		"\u0000?C\u0007\u0002\u0000\u0000@B\u0007\u0003\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"F>\u0001\u0000\u0000\u0000F?\u0001\u0000\u0000\u0000G\u0016\u0001\u0000"+
		"\u0000\u0000HL\u0007\u0004\u0000\u0000IK\u0007\u0005\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000M\u0018\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OQ\u0007\u0006\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TU\u0006\f\u0000\u0000U\u001a\u0001\u0000\u0000"+
		"\u0000VW\u0005/\u0000\u0000WX\u0005*\u0000\u0000X\\\u0001\u0000\u0000"+
		"\u0000Y[\t\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005*\u0000\u0000`a\u0005/"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0006\r\u0000\u0000c\u001c\u0001"+
		"\u0000\u0000\u0000de\u0005/\u0000\u0000ef\u0005/\u0000\u0000fj\u0001\u0000"+
		"\u0000\u0000gi\b\u0007\u0000\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005\n\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000op\u0006\u000e\u0000\u0000p\u001e\u0001\u0000\u0000"+
		"\u0000\u0007\u0000CFLR\\j\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}