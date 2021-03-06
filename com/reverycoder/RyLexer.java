// Generated from Ry.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LITERAL=2, COMMA=3, SEMICOLON=4, CRLF=5, END=6, DEF=7, IF=8, ELSE=9, 
		ELSIF=10, UNLESS=11, WHILE=12, RETRY=13, BREAK=14, FOR=15, TRUE=16, FALSE=17, 
		PLUS=18, MINUS=19, MUL=20, DIV=21, MOD=22, EXP=23, ASSIGN=24, PLUS_ASSIGN=25, 
		MINUS_ASSIGN=26, MUL_ASSIGN=27, DIV_ASSIGN=28, MOD_ASSIGN=29, EXP_ASSIGN=30, 
		EQUAL=31, NOT_EQUAL=32, GREATER=33, LESS=34, LESS_EQUAL=35, GREATER_EQUAL=36, 
		AND=37, OR=38, NOT=39, IN=40, DOTS=41, LEFT_RBRACKET=42, RIGHT_RBRACKET=43, 
		LEFT_SBRACKET=44, RIGHT_SBRACKET=45, NIL=46, RETURN=47, SL_COMMENT=48, 
		ML_COMMENT=49, WS=50, INT=51, FLOAT=52, ID=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ESCAPED_QUOTE", "LITERAL", "COMMA", "SEMICOLON", "CRLF", "END", 
		"DEF", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", "FOR", 
		"TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "ASSIGN", 
		"PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"EXP_ASSIGN", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
		"AND", "OR", "NOT", "IN", "DOTS", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "NIL", "RETURN", "SL_COMMENT", "ML_COMMENT", "WS", "INT", 
		"FLOAT", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'puts'", null, "','", "';'", "'\n'", "'end'", "'def'", "'if'", 
		"'else'", "'elsif'", "'unless'", "'while'", "'retry'", "'break'", "'for'", 
		"'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'='", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'**='", "'=='", "'!='", "'>'", 
		"'<'", "'<='", "'>='", null, null, null, "'in'", "'..'", "'('", "')'", 
		"'['", "']'", "'nil'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "END", "DEF", "IF", 
		"ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "TRUE", "FALSE", 
		"PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "ASSIGN", "PLUS_ASSIGN", 
		"MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", 
		"EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
		"AND", "OR", "NOT", "IN", "DOTS", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "NIL", "RETURN", "SL_COMMENT", "ML_COMMENT", "WS", "INT", 
		"FLOAT", "ID"
	};
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


	public RyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ry.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u016c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\7\4{\n\4\f\4\16\4~\13\4\3\4\3\4\3\4\3\4\7\4\u0084\n\4\f\4\16"+
		"\4\u0087\13\4\3\4\5\4\u008a\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u0107\n\'\3(\3(\3(\3(\5(\u010d\n(\3)\3)\3)\3)\5)"+
		"\u0113\n)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\7\62\u0130\n\62\f\62\16"+
		"\62\u0133\13\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\7\63\u0141\n\63\f\63\16\63\u0144\13\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\6\64\u014f\n\64\r\64\16\64\u0150\3\64\3\64\3\65\6"+
		"\65\u0156\n\65\r\65\16\65\u0157\3\66\7\66\u015b\n\66\f\66\16\66\u015e"+
		"\13\66\3\66\3\66\6\66\u0162\n\66\r\66\16\66\u0163\3\67\3\67\7\67\u0168"+
		"\n\67\f\67\16\67\u016b\13\67\5|\u0085\u0142\28\3\3\5\2\7\4\t\5\13\6\r"+
		"\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)"+
		"\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'"+
		"O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67\3\2\7\4\2\f\f\17\17\4"+
		"\2\13\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\u0179\2\3\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5t\3\2\2\2\7\u0089"+
		"\3\2\2\2\t\u008b\3\2\2\2\13\u008d\3\2\2\2\r\u008f\3\2\2\2\17\u0091\3\2"+
		"\2\2\21\u0095\3\2\2\2\23\u0099\3\2\2\2\25\u009c\3\2\2\2\27\u00a1\3\2\2"+
		"\2\31\u00a7\3\2\2\2\33\u00ae\3\2\2\2\35\u00b4\3\2\2\2\37\u00ba\3\2\2\2"+
		"!\u00c0\3\2\2\2#\u00c4\3\2\2\2%\u00c9\3\2\2\2\'\u00cf\3\2\2\2)\u00d1\3"+
		"\2\2\2+\u00d3\3\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2\2\2\61\u00d9\3\2\2\2\63"+
		"\u00dc\3\2\2\2\65\u00de\3\2\2\2\67\u00e1\3\2\2\29\u00e4\3\2\2\2;\u00e7"+
		"\3\2\2\2=\u00ea\3\2\2\2?\u00ed\3\2\2\2A\u00f1\3\2\2\2C\u00f4\3\2\2\2E"+
		"\u00f7\3\2\2\2G\u00f9\3\2\2\2I\u00fb\3\2\2\2K\u00fe\3\2\2\2M\u0106\3\2"+
		"\2\2O\u010c\3\2\2\2Q\u0112\3\2\2\2S\u0114\3\2\2\2U\u0117\3\2\2\2W\u011a"+
		"\3\2\2\2Y\u011c\3\2\2\2[\u011e\3\2\2\2]\u0120\3\2\2\2_\u0122\3\2\2\2a"+
		"\u0126\3\2\2\2c\u012d\3\2\2\2e\u0138\3\2\2\2g\u014e\3\2\2\2i\u0155\3\2"+
		"\2\2k\u015c\3\2\2\2m\u0165\3\2\2\2op\7r\2\2pq\7w\2\2qr\7v\2\2rs\7u\2\2"+
		"s\4\3\2\2\2tu\7^\2\2uv\7$\2\2v\6\3\2\2\2w|\7$\2\2x{\5\5\3\2y{\n\2\2\2"+
		"zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2"+
		"\2\2\177\u008a\7$\2\2\u0080\u0085\7)\2\2\u0081\u0084\5\5\3\2\u0082\u0084"+
		"\n\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u008a\7)\2\2\u0089w\3\2\2\2\u0089\u0080\3\2\2\2\u008a\b\3\2"+
		"\2\2\u008b\u008c\7.\2\2\u008c\n\3\2\2\2\u008d\u008e\7=\2\2\u008e\f\3\2"+
		"\2\2\u008f\u0090\7\f\2\2\u0090\16\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7f\2\2\u0094\20\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097"+
		"\7g\2\2\u0097\u0098\7h\2\2\u0098\22\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b"+
		"\7h\2\2\u009b\24\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f"+
		"\7u\2\2\u009f\u00a0\7g\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3"+
		"\7n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7h\2\2\u00a6"+
		"\30\3\2\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7n\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7u\2\2\u00ad\32\3\2\2\2\u00ae"+
		"\u00af\7y\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7n\2\2"+
		"\u00b2\u00b3\7g\2\2\u00b3\34\3\2\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7"+
		"g\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7{\2\2\u00b9\36"+
		"\3\2\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7c\2\2\u00be\u00bf\7m\2\2\u00bf \3\2\2\2\u00c0\u00c1\7h\2\2\u00c1"+
		"\u00c2\7q\2\2\u00c2\u00c3\7t\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7g\2\2\u00c8$\3\2\2\2\u00c9"+
		"\u00ca\7h\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2"+
		"\u00cd\u00ce\7g\2\2\u00ce&\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0(\3\2\2\2\u00d1"+
		"\u00d2\7/\2\2\u00d2*\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4,\3\2\2\2\u00d5\u00d6"+
		"\7\61\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7\'\2\2\u00d8\60\3\2\2\2\u00d9\u00da"+
		"\7,\2\2\u00da\u00db\7,\2\2\u00db\62\3\2\2\2\u00dc\u00dd\7?\2\2\u00dd\64"+
		"\3\2\2\2\u00de\u00df\7-\2\2\u00df\u00e0\7?\2\2\u00e0\66\3\2\2\2\u00e1"+
		"\u00e2\7/\2\2\u00e2\u00e3\7?\2\2\u00e38\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5"+
		"\u00e6\7?\2\2\u00e6:\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9\7?\2\2\u00e9"+
		"<\3\2\2\2\u00ea\u00eb\7\'\2\2\u00eb\u00ec\7?\2\2\u00ec>\3\2\2\2\u00ed"+
		"\u00ee\7,\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f0\7?\2\2\u00f0@\3\2\2\2\u00f1"+
		"\u00f2\7?\2\2\u00f2\u00f3\7?\2\2\u00f3B\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5"+
		"\u00f6\7?\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8F\3\2\2\2\u00f9\u00fa"+
		"\7>\2\2\u00faH\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc\u00fd\7?\2\2\u00fdJ\3"+
		"\2\2\2\u00fe\u00ff\7@\2\2\u00ff\u0100\7?\2\2\u0100L\3\2\2\2\u0101\u0102"+
		"\7c\2\2\u0102\u0103\7p\2\2\u0103\u0107\7f\2\2\u0104\u0105\7(\2\2\u0105"+
		"\u0107\7(\2\2\u0106\u0101\3\2\2\2\u0106\u0104\3\2\2\2\u0107N\3\2\2\2\u0108"+
		"\u0109\7q\2\2\u0109\u010d\7t\2\2\u010a\u010b\7~\2\2\u010b\u010d\7~\2\2"+
		"\u010c\u0108\3\2\2\2\u010c\u010a\3\2\2\2\u010dP\3\2\2\2\u010e\u010f\7"+
		"p\2\2\u010f\u0110\7q\2\2\u0110\u0113\7v\2\2\u0111\u0113\7#\2\2\u0112\u010e"+
		"\3\2\2\2\u0112\u0111\3\2\2\2\u0113R\3\2\2\2\u0114\u0115\7k\2\2\u0115\u0116"+
		"\7p\2\2\u0116T\3\2\2\2\u0117\u0118\7\60\2\2\u0118\u0119\7\60\2\2\u0119"+
		"V\3\2\2\2\u011a\u011b\7*\2\2\u011bX\3\2\2\2\u011c\u011d\7+\2\2\u011dZ"+
		"\3\2\2\2\u011e\u011f\7]\2\2\u011f\\\3\2\2\2\u0120\u0121\7_\2\2\u0121^"+
		"\3\2\2\2\u0122\u0123\7p\2\2\u0123\u0124\7k\2\2\u0124\u0125\7n\2\2\u0125"+
		"`\3\2\2\2\u0126\u0127\7t\2\2\u0127\u0128\7g\2\2\u0128\u0129\7v\2\2\u0129"+
		"\u012a\7w\2\2\u012a\u012b\7t\2\2\u012b\u012c\7p\2\2\u012cb\3\2\2\2\u012d"+
		"\u0131\7%\2\2\u012e\u0130\n\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\7\f\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b\62"+
		"\2\2\u0137d\3\2\2\2\u0138\u0139\7?\2\2\u0139\u013a\7d\2\2\u013a\u013b"+
		"\7g\2\2\u013b\u013c\7i\2\2\u013c\u013d\7k\2\2\u013d\u013e\7p\2\2\u013e"+
		"\u0142\3\2\2\2\u013f\u0141\13\2\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\7?\2\2\u0146\u0147\7g\2\2\u0147\u0148\7p\2"+
		"\2\u0148\u0149\7f\2\2\u0149\u014a\7\f\2\2\u014a\u014b\3\2\2\2\u014b\u014c"+
		"\b\63\2\2\u014cf\3\2\2\2\u014d\u014f\t\3\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\b\64\2\2\u0153h\3\2\2\2\u0154\u0156\t\4\2\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"j\3\2\2\2\u0159\u015b\t\4\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2"+
		"\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015f\u0161\7\60\2\2\u0160\u0162\t\4\2\2\u0161\u0160\3\2\2\2"+
		"\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164l\3"+
		"\2\2\2\u0165\u0169\t\5\2\2\u0166\u0168\t\6\2\2\u0167\u0166\3\2\2\2\u0168"+
		"\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016an\3\2\2\2"+
		"\u016b\u0169\3\2\2\2\22\2z|\u0083\u0085\u0089\u0106\u010c\u0112\u0131"+
		"\u0142\u0150\u0157\u015c\u0163\u0169\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}