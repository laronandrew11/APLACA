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
[*][*]				return EXP_OPER;
=_=					return EQUAL;
=_\<					return LESS_OR_EQUAL;
\<_\<					return LESS;
\>_=					return GREATER_OR_EQUAL;
\>_\>					return GREATER;
\>_\<					return UNEQUAL;
[-+*/%()|&^\n]		return *yytext;
[ \t]		;
.			yyerror("invalid character");
%%

int yywrap(void) {
	return 1;
}


