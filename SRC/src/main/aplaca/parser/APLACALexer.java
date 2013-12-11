// $ANTLR 3.5 src/grammar/APLACA.g 2013-12-11 17:03:27
 
  package aplaca.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class APLACALexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADDITIVE=4;
	public static final int AND=5;
	public static final int BITWISE_AND=6;
	public static final int BITWISE_OR=7;
	public static final int BITWISE_XOR=8;
	public static final int BOOL=9;
	public static final int CHAR=10;
	public static final int CLOSE_BRACE=11;
	public static final int CLOSE_PAREN=12;
	public static final int CONCAT=13;
	public static final int ELSE=14;
	public static final int ELSEIF=15;
	public static final int END_OF_STATEMENT=16;
	public static final int EQUAL=17;
	public static final int EXP_OPER=18;
	public static final int FLOAT=19;
	public static final int FUNCTION=20;
	public static final int GETS=21;
	public static final int GREATER=22;
	public static final int GREATER_OR_EQUAL=23;
	public static final int IDENTIFIER=24;
	public static final int IF=25;
	public static final int IN=26;
	public static final int INTEGER=27;
	public static final int LESS=28;
	public static final int LESS_OR_EQUAL=29;
	public static final int MULTIPLICATIVE=30;
	public static final int NEWLINE=31;
	public static final int NOT=32;
	public static final int OPEN_BRACE=33;
	public static final int OPEN_PAREN=34;
	public static final int OR=35;
	public static final int OUT=36;
	public static final int RETURN=37;
	public static final int STRING=38;
	public static final int TAB=39;
	public static final int UNEQUAL=40;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public APLACALexer() {} 
	public APLACALexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public APLACALexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "src/grammar/APLACA.g"; }

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:19:4: ( 'if' )
			// src/grammar/APLACA.g:19:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:20:6: ( 'fi' )
			// src/grammar/APLACA.g:20:8: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ELSEIF"
	public final void mELSEIF() throws RecognitionException {
		try {
			int _type = ELSEIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:21:8: ( ( ELSE IF ) )
			// src/grammar/APLACA.g:21:10: ( ELSE IF )
			{
			// src/grammar/APLACA.g:21:10: ( ELSE IF )
			// src/grammar/APLACA.g:21:11: ELSE IF
			{
			mELSE(); 

			mIF(); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSEIF"

	// $ANTLR start "OUT"
	public final void mOUT() throws RecognitionException {
		try {
			int _type = OUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:22:5: ( 'out' )
			// src/grammar/APLACA.g:22:7: 'out'
			{
			match("out"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OUT"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:23:4: ( 'in' )
			// src/grammar/APLACA.g:23:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:24:9: ( 'func' )
			// src/grammar/APLACA.g:24:11: 'func'
			{
			match("func"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:25:8: ( 'return' )
			// src/grammar/APLACA.g:25:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "GETS"
	public final void mGETS() throws RecognitionException {
		try {
			int _type = GETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:26:6: ( '<-' )
			// src/grammar/APLACA.g:26:8: '<-'
			{
			match("<-"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GETS"

	// $ANTLR start "END_OF_STATEMENT"
	public final void mEND_OF_STATEMENT() throws RecognitionException {
		try {
			int _type = END_OF_STATEMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:28:2: ( ';' )
			// src/grammar/APLACA.g:28:4: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END_OF_STATEMENT"

	// $ANTLR start "EXP_OPER"
	public final void mEXP_OPER() throws RecognitionException {
		try {
			int _type = EXP_OPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:30:9: ( '**' )
			// src/grammar/APLACA.g:30:11: '**'
			{
			match("**"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXP_OPER"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:31:7: ( '=_=' )
			// src/grammar/APLACA.g:31:9: '=_='
			{
			match("=_="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "LESS_OR_EQUAL"
	public final void mLESS_OR_EQUAL() throws RecognitionException {
		try {
			int _type = LESS_OR_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:33:2: ( '=_<' )
			// src/grammar/APLACA.g:33:4: '=_<'
			{
			match("=_<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_OR_EQUAL"

	// $ANTLR start "LESS"
	public final void mLESS() throws RecognitionException {
		try {
			int _type = LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:34:6: ( '<_<' )
			// src/grammar/APLACA.g:34:8: '<_<'
			{
			match("<_<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS"

	// $ANTLR start "GREATER_OR_EQUAL"
	public final void mGREATER_OR_EQUAL() throws RecognitionException {
		try {
			int _type = GREATER_OR_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:36:2: ( '>_=' )
			// src/grammar/APLACA.g:36:4: '>_='
			{
			match(">_="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER_OR_EQUAL"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:37:9: ( '>_>' )
			// src/grammar/APLACA.g:37:11: '>_>'
			{
			match(">_>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER"

	// $ANTLR start "UNEQUAL"
	public final void mUNEQUAL() throws RecognitionException {
		try {
			int _type = UNEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:38:9: ( '>_<' )
			// src/grammar/APLACA.g:38:11: '>_<'
			{
			match(">_<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNEQUAL"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:39:5: ( '&_&' )
			// src/grammar/APLACA.g:39:7: '&_&'
			{
			match("&_&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:40:4: ( '|_|' )
			// src/grammar/APLACA.g:40:6: '|_|'
			{
			match("|_|"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:41:5: ( '!' )
			// src/grammar/APLACA.g:41:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "BITWISE_AND"
	public final void mBITWISE_AND() throws RecognitionException {
		try {
			int _type = BITWISE_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:44:2: ( '&' )
			// src/grammar/APLACA.g:44:4: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISE_AND"

	// $ANTLR start "BITWISE_OR"
	public final void mBITWISE_OR() throws RecognitionException {
		try {
			int _type = BITWISE_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:46:2: ( '|' )
			// src/grammar/APLACA.g:46:4: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISE_OR"

	// $ANTLR start "BITWISE_XOR"
	public final void mBITWISE_XOR() throws RecognitionException {
		try {
			int _type = BITWISE_XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:48:2: ( '^' )
			// src/grammar/APLACA.g:48:4: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISE_XOR"

	// $ANTLR start "OPEN_BRACE"
	public final void mOPEN_BRACE() throws RecognitionException {
		try {
			int _type = OPEN_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:51:12: ( '{' )
			// src/grammar/APLACA.g:51:14: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_BRACE"

	// $ANTLR start "CLOSE_BRACE"
	public final void mCLOSE_BRACE() throws RecognitionException {
		try {
			int _type = CLOSE_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:53:2: ( '}' )
			// src/grammar/APLACA.g:53:4: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_BRACE"

	// $ANTLR start "CONCAT"
	public final void mCONCAT() throws RecognitionException {
		try {
			int _type = CONCAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:54:8: ( '#' )
			// src/grammar/APLACA.g:54:10: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONCAT"

	// $ANTLR start "ADDITIVE"
	public final void mADDITIVE() throws RecognitionException {
		try {
			int _type = ADDITIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:55:9: ( '-' | '+' )
			// src/grammar/APLACA.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDITIVE"

	// $ANTLR start "MULTIPLICATIVE"
	public final void mMULTIPLICATIVE() throws RecognitionException {
		try {
			int _type = MULTIPLICATIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:57:2: ( '*' | '/' | '%' )
			// src/grammar/APLACA.g:
			{
			if ( input.LA(1)=='%'||input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTIPLICATIVE"

	// $ANTLR start "OPEN_PAREN"
	public final void mOPEN_PAREN() throws RecognitionException {
		try {
			int _type = OPEN_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:59:2: ( '(' )
			// src/grammar/APLACA.g:59:4: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_PAREN"

	// $ANTLR start "CLOSE_PAREN"
	public final void mCLOSE_PAREN() throws RecognitionException {
		try {
			int _type = CLOSE_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:60:12: ( ')' )
			// src/grammar/APLACA.g:60:14: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_PAREN"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:62:9: ( '\\n' )
			// src/grammar/APLACA.g:62:11: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "TAB"
	public final void mTAB() throws RecognitionException {
		try {
			int _type = TAB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:63:5: ( '\\t' )
			// src/grammar/APLACA.g:63:7: '\\t'
			{
			match('\t'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAB"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:65:9: ( ( '0' .. '9' )+ )
			// src/grammar/APLACA.g:65:11: ( '0' .. '9' )+
			{
			// src/grammar/APLACA.g:65:11: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/grammar/APLACA.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:66:7: ( ( INTEGER '.' INTEGER ) )
			// src/grammar/APLACA.g:66:9: ( INTEGER '.' INTEGER )
			{
			// src/grammar/APLACA.g:66:9: ( INTEGER '.' INTEGER )
			// src/grammar/APLACA.g:66:10: INTEGER '.' INTEGER
			{
			mINTEGER(); 

			match('.'); 
			mINTEGER(); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:67:6: ( 'true' | 'false' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='t') ) {
				alt2=1;
			}
			else if ( (LA2_0=='f') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/grammar/APLACA.g:67:8: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// src/grammar/APLACA.g:68:5: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:70:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// src/grammar/APLACA.g:70:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// src/grammar/APLACA.g:70:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// src/grammar/APLACA.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:71:6: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' ) '\\'' )
			// src/grammar/APLACA.g:71:8: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' ) '\\''
			{
			match('\''); 
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/grammar/APLACA.g:72:8: ( '\\'' ( '\"\"' |~ '\"' )* '\\'' )
			// src/grammar/APLACA.g:72:10: '\\'' ( '\"\"' |~ '\"' )* '\\''
			{
			match('\''); 
			// src/grammar/APLACA.g:72:15: ( '\"\"' |~ '\"' )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\'') ) {
					int LA4_1 = input.LA(2);
					if ( ((LA4_1 >= '\u0000' && LA4_1 <= '\uFFFF')) ) {
						alt4=2;
					}

				}
				else if ( (LA4_0=='\"') ) {
					alt4=1;
				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '&')||(LA4_0 >= '(' && LA4_0 <= '\uFFFF')) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// src/grammar/APLACA.g:72:16: '\"\"'
					{
					match("\"\""); 

					}
					break;
				case 2 :
					// src/grammar/APLACA.g:72:23: ~ '\"'
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	@Override
	public void mTokens() throws RecognitionException {
		// src/grammar/APLACA.g:1:8: ( IF | ELSE | ELSEIF | OUT | IN | FUNCTION | RETURN | GETS | END_OF_STATEMENT | EXP_OPER | EQUAL | LESS_OR_EQUAL | LESS | GREATER_OR_EQUAL | GREATER | UNEQUAL | AND | OR | NOT | BITWISE_AND | BITWISE_OR | BITWISE_XOR | OPEN_BRACE | CLOSE_BRACE | CONCAT | ADDITIVE | MULTIPLICATIVE | OPEN_PAREN | CLOSE_PAREN | NEWLINE | TAB | INTEGER | FLOAT | BOOL | IDENTIFIER | CHAR | STRING )
		int alt5=37;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// src/grammar/APLACA.g:1:10: IF
				{
				mIF(); 

				}
				break;
			case 2 :
				// src/grammar/APLACA.g:1:13: ELSE
				{
				mELSE(); 

				}
				break;
			case 3 :
				// src/grammar/APLACA.g:1:18: ELSEIF
				{
				mELSEIF(); 

				}
				break;
			case 4 :
				// src/grammar/APLACA.g:1:25: OUT
				{
				mOUT(); 

				}
				break;
			case 5 :
				// src/grammar/APLACA.g:1:29: IN
				{
				mIN(); 

				}
				break;
			case 6 :
				// src/grammar/APLACA.g:1:32: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 7 :
				// src/grammar/APLACA.g:1:41: RETURN
				{
				mRETURN(); 

				}
				break;
			case 8 :
				// src/grammar/APLACA.g:1:48: GETS
				{
				mGETS(); 

				}
				break;
			case 9 :
				// src/grammar/APLACA.g:1:53: END_OF_STATEMENT
				{
				mEND_OF_STATEMENT(); 

				}
				break;
			case 10 :
				// src/grammar/APLACA.g:1:70: EXP_OPER
				{
				mEXP_OPER(); 

				}
				break;
			case 11 :
				// src/grammar/APLACA.g:1:79: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 12 :
				// src/grammar/APLACA.g:1:85: LESS_OR_EQUAL
				{
				mLESS_OR_EQUAL(); 

				}
				break;
			case 13 :
				// src/grammar/APLACA.g:1:99: LESS
				{
				mLESS(); 

				}
				break;
			case 14 :
				// src/grammar/APLACA.g:1:104: GREATER_OR_EQUAL
				{
				mGREATER_OR_EQUAL(); 

				}
				break;
			case 15 :
				// src/grammar/APLACA.g:1:121: GREATER
				{
				mGREATER(); 

				}
				break;
			case 16 :
				// src/grammar/APLACA.g:1:129: UNEQUAL
				{
				mUNEQUAL(); 

				}
				break;
			case 17 :
				// src/grammar/APLACA.g:1:137: AND
				{
				mAND(); 

				}
				break;
			case 18 :
				// src/grammar/APLACA.g:1:141: OR
				{
				mOR(); 

				}
				break;
			case 19 :
				// src/grammar/APLACA.g:1:144: NOT
				{
				mNOT(); 

				}
				break;
			case 20 :
				// src/grammar/APLACA.g:1:148: BITWISE_AND
				{
				mBITWISE_AND(); 

				}
				break;
			case 21 :
				// src/grammar/APLACA.g:1:160: BITWISE_OR
				{
				mBITWISE_OR(); 

				}
				break;
			case 22 :
				// src/grammar/APLACA.g:1:171: BITWISE_XOR
				{
				mBITWISE_XOR(); 

				}
				break;
			case 23 :
				// src/grammar/APLACA.g:1:183: OPEN_BRACE
				{
				mOPEN_BRACE(); 

				}
				break;
			case 24 :
				// src/grammar/APLACA.g:1:194: CLOSE_BRACE
				{
				mCLOSE_BRACE(); 

				}
				break;
			case 25 :
				// src/grammar/APLACA.g:1:206: CONCAT
				{
				mCONCAT(); 

				}
				break;
			case 26 :
				// src/grammar/APLACA.g:1:213: ADDITIVE
				{
				mADDITIVE(); 

				}
				break;
			case 27 :
				// src/grammar/APLACA.g:1:222: MULTIPLICATIVE
				{
				mMULTIPLICATIVE(); 

				}
				break;
			case 28 :
				// src/grammar/APLACA.g:1:237: OPEN_PAREN
				{
				mOPEN_PAREN(); 

				}
				break;
			case 29 :
				// src/grammar/APLACA.g:1:248: CLOSE_PAREN
				{
				mCLOSE_PAREN(); 

				}
				break;
			case 30 :
				// src/grammar/APLACA.g:1:260: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 31 :
				// src/grammar/APLACA.g:1:268: TAB
				{
				mTAB(); 

				}
				break;
			case 32 :
				// src/grammar/APLACA.g:1:272: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 33 :
				// src/grammar/APLACA.g:1:280: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 34 :
				// src/grammar/APLACA.g:1:286: BOOL
				{
				mBOOL(); 

				}
				break;
			case 35 :
				// src/grammar/APLACA.g:1:291: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 36 :
				// src/grammar/APLACA.g:1:302: CHAR
				{
				mCHAR(); 

				}
				break;
			case 37 :
				// src/grammar/APLACA.g:1:307: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\1\uffff\4\31\2\uffff\1\22\2\uffff\1\50\1\52\13\uffff\1\53\1\31\2\uffff"+
		"\1\60\1\61\1\62\4\31\13\uffff\1\31\5\uffff\3\31\1\102\1\31\5\uffff\1\31"+
		"\1\105\1\106\1\107\1\31\1\uffff\1\31\1\112\3\uffff\1\112\1\31\1\uffff"+
		"\1\114\1\uffff";
	static final String DFA5_eofS =
		"\115\uffff";
	static final String DFA5_minS =
		"\1\11\1\146\1\141\1\165\1\145\1\55\1\uffff\1\52\4\137\13\uffff\1\56\1"+
		"\162\1\uffff\1\0\3\60\1\156\1\154\2\164\3\uffff\2\74\6\uffff\1\165\1\0"+
		"\4\uffff\1\146\1\143\1\163\1\60\1\165\5\uffff\1\145\1\0\2\60\1\145\1\uffff"+
		"\1\162\1\60\3\uffff\1\60\1\156\1\uffff\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\175\1\156\2\165\1\145\1\137\1\uffff\1\52\4\137\13\uffff\1\71\1\162"+
		"\1\uffff\1\uffff\3\172\1\156\1\154\2\164\3\uffff\1\75\1\76\6\uffff\1\165"+
		"\1\uffff\4\uffff\1\146\1\143\1\163\1\172\1\165\5\uffff\1\145\1\uffff\2"+
		"\172\1\145\1\uffff\1\162\1\172\3\uffff\1\172\1\156\1\uffff\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\6\uffff\1\11\5\uffff\1\23\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
		"\1\37\2\uffff\1\43\10\uffff\1\10\1\15\1\12\2\uffff\1\21\1\24\1\22\1\25"+
		"\1\40\1\41\2\uffff\1\45\1\1\1\5\1\2\5\uffff\1\13\1\14\1\16\1\17\1\20\5"+
		"\uffff\1\4\2\uffff\1\44\1\3\1\6\2\uffff\1\42\1\uffff\1\7";
	static final String DFA5_specialS =
		"\32\uffff\1\1\23\uffff\1\0\17\uffff\1\2\16\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\26\1\25\26\uffff\1\14\1\uffff\1\20\1\uffff\1\22\1\12\1\32\1\23\1\24"+
			"\1\7\1\21\1\uffff\1\21\1\uffff\1\22\12\27\1\uffff\1\6\1\5\1\10\1\11\2"+
			"\uffff\32\31\3\uffff\1\15\1\31\1\uffff\5\31\1\2\2\31\1\1\5\31\1\3\2\31"+
			"\1\4\1\31\1\30\6\31\1\16\1\13\1\17",
			"\1\33\7\uffff\1\34",
			"\1\37\7\uffff\1\35\13\uffff\1\36",
			"\1\40",
			"\1\41",
			"\1\42\61\uffff\1\43",
			"",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\51",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\54\1\uffff\12\27",
			"\1\55",
			"",
			"\101\57\32\56\6\57\32\56\uff85\57",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31\1\63\21\31",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"",
			"",
			"",
			"\1\71\1\70",
			"\1\74\1\72\1\73",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\75",
			"\47\57\1\76\uffd8\57",
			"",
			"",
			"",
			"",
			"\1\77",
			"\1\100",
			"\1\101",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\103",
			"",
			"",
			"",
			"",
			"",
			"\1\104",
			"\0\57",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\110",
			"",
			"\1\111",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\113",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( IF | ELSE | ELSEIF | OUT | IN | FUNCTION | RETURN | GETS | END_OF_STATEMENT | EXP_OPER | EQUAL | LESS_OR_EQUAL | LESS | GREATER_OR_EQUAL | GREATER | UNEQUAL | AND | OR | NOT | BITWISE_AND | BITWISE_OR | BITWISE_XOR | OPEN_BRACE | CLOSE_BRACE | CONCAT | ADDITIVE | MULTIPLICATIVE | OPEN_PAREN | CLOSE_PAREN | NEWLINE | TAB | INTEGER | FLOAT | BOOL | IDENTIFIER | CHAR | STRING );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA5_46 = input.LA(1);
						s = -1;
						if ( (LA5_46=='\'') ) {s = 62;}
						else if ( ((LA5_46 >= '\u0000' && LA5_46 <= '&')||(LA5_46 >= '(' && LA5_46 <= '\uFFFF')) ) {s = 47;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA5_26 = input.LA(1);
						s = -1;
						if ( ((LA5_26 >= 'A' && LA5_26 <= 'Z')||(LA5_26 >= 'a' && LA5_26 <= 'z')) ) {s = 46;}
						else if ( ((LA5_26 >= '\u0000' && LA5_26 <= '@')||(LA5_26 >= '[' && LA5_26 <= '`')||(LA5_26 >= '{' && LA5_26 <= '\uFFFF')) ) {s = 47;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA5_62 = input.LA(1);
						s = -1;
						if ( ((LA5_62 >= '\u0000' && LA5_62 <= '\uFFFF')) ) {s = 47;}
						else s = 69;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 5, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
