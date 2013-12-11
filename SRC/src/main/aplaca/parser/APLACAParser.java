// $ANTLR 3.5 src/grammar/APLACA.g 2013-12-11 17:03:27
 
  package aplaca.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class APLACAParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDITIVE", "AND", "BITWISE_AND", 
		"BITWISE_OR", "BITWISE_XOR", "BOOL", "CHAR", "CLOSE_BRACE", "CLOSE_PAREN", 
		"CONCAT", "ELSE", "ELSEIF", "END_OF_STATEMENT", "EQUAL", "EXP_OPER", "FLOAT", 
		"FUNCTION", "GETS", "GREATER", "GREATER_OR_EQUAL", "IDENTIFIER", "IF", 
		"IN", "INTEGER", "LESS", "LESS_OR_EQUAL", "MULTIPLICATIVE", "NEWLINE", 
		"NOT", "OPEN_BRACE", "OPEN_PAREN", "OR", "OUT", "RETURN", "STRING", "TAB", 
		"UNEQUAL"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public APLACAParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public APLACAParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return APLACAParser.tokenNames; }
	@Override public String getGrammarFileName() { return "src/grammar/APLACA.g"; }



	// $ANTLR start "parse"
	// src/grammar/APLACA.g:11:1: parse : (t= . )* EOF ;
	public final void parse() throws Exception {
		Token t=null;

		try {
			// src/grammar/APLACA.g:12:3: ( (t= . )* EOF )
			// src/grammar/APLACA.g:12:6: (t= . )* EOF
			{
			// src/grammar/APLACA.g:12:6: (t= . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ADDITIVE && LA1_0 <= UNEQUAL)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/grammar/APLACA.g:12:7: t= .
					{
					t=input.LT(1);
					matchAny(input); 
					System.out.printf("text: %-7s  type: %s \n",  
					           (t!=null?t.getText():null), tokenNames[(t!=null?t.getType():0)]);
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_parse76); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parse"

	// Delegated rules



	public static final BitSet FOLLOW_EOF_in_parse76 = new BitSet(new long[]{0x0000000000000002L});
}
