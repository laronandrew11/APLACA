%{
#include <stdlib.h>
void yyerror(char *);
#include "y.tab.h"
%}

%%
[0-9]+ 		{
				yylval = atoi(yytext);
				return INTEGER;
			}
if					return IF;
fi					return ELSE;
<-					return GETS;			
[*][*]				return EXP_OPER;
=_=					return EQUAL;
=_\<					return LESS_OR_EQUAL;
\<_\<					return LESS;
\>_=					return GREATER_OR_EQUAL;
\>_\>					return GREATER;
\>_\<					return UNEQUAL;
&_&						return AND;
\|_\|						return OR;
[#!-+*/%()|&^\n]		return *yytext;
[ \t]		;
[a-zA-Z]			{
						
						return CHAR;
					}
[a-zA-Z][a-zA-Z]+			return STRING;
.			yyerror("invalid character");
%%

int yywrap(void) {
	return 1;
}


