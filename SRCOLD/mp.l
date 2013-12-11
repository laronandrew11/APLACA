%{
#include <stdlib.h>
void yyerror(char *);
#include "y.tab.h"
%}

%%
[0-9]+ 		{
				yylval.y = atoi(yytext);
				return INTEGER;
			}
if					return IF;
fi					return ELSE;
[<][-]					return GETS;			
[*][*]					return EXP_OPER;
=_=						return EQUAL;
=_\<					return LESS_OR_EQUAL;
\<_\<					return LESS;
\>_=					return GREATER_OR_EQUAL;
\>_\>					return GREATER;
\>_\<					return UNEQUAL;
&_&						return AND;
\|_\|					return OR;
[#!-+*/%()|&^\n]		return *yytext;
[ \t]		;
['][a-zA-Z][']			{
						yylval.c = yytext[1];
						return CHAR;
						}
['][a-zA-Z][a-zA-Z]+[']	{
						char* s = strdup(yytext)[1];
						s[strlen(s)-1] = '\0';
						yylval.a = strdup(yytext);
						return STRING;
						}
.			yyerror("invalid character");
%%

int yywrap(void) {
	return 1;
}


