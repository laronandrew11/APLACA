%{
#include <stdio.h>
#include<conio.h>
#include<string.h>
int yylex(void);
void yyerror(char *);
%}

%union {
 char *str;
 char ch;
 double dbl;
 int num;
}

%token <num> INTEGER
%token <ch> CHAR
%token <str> STRING
%token <str> EXP_OPER
%token <str> EQUAL
%token <str> LESS_OR_EQUAL
%token <str> GREATER_OR_EQUAL
%token <str> LESS
%token <str> GREATER
%token <str> UNEQUAL
%token <str> AND
%token <str> OR
%token <str> IF
%token <str> ELSE
%token <str> GETS
%%
program:
	program expr '\n'	{printf("%d\n", $2); }
	|
	;

expr:
	int_expr				{ $$ = $<>1; }
	| str_expr					{ $$ = $1; }
	| EQUAL str_expr str_expr { $$ = $2 == $3;}
	| EQUAL int_expr int_expr { $$ = $2 == $3;}
	| LESS_OR_EQUAL str_expr str_expr { $$ = $2 <= $3;}
	| LESS_OR_EQUAL int_expr int_expr { $$ = $2 <= $3;}
	| GREATER_OR_EQUAL str_expr str_expr { $$ = $2 >= $3;}
	| GREATER_OR_EQUAL int_expr int_expr { $$ = $2 >= $3;}
	| UNEQUAL str_expr str_expr { $$ = $2 != $3;}
	| UNEQUAL int_expr int_expr { $$ = $2 != $3;}
	| LESS str_expr str_expr { $$ = $2 < $3;}
	| LESS int_expr int_expr { $$ = $2 < $3;}
	| GREATER str_expr str_expr { $$ = $2 > $3;}
	| GREATER int_expr int_expr { $$ = $2 > $3;}
	;

int_expr:
	INTEGER			{ $$ = $1; }
	| '+' int_expr  int_expr 	{ $$ = $2 + $3; }
	| '-' int_expr  int_expr	{ $$ = $2 - $3; }
	| '*' int_expr  int_expr 	{ $$ = $2 * $3; }
	| '/' int_expr  int_expr	{ $$ = $2 / $3; }
	| '%' int_expr  int_expr 	{ $$ = $2 % $3; }
	|'|' int_expr  int_expr 	{ $$ = $2 | $3; }
	| '&' int_expr  int_expr	{ $$ = $2 & $3; }
	|'^' int_expr  int_expr 	{ $$ = $2 ^ $3; }
	| EXP_OPER int_expr int_expr 	{
								int s = 1;
								while ($3--) {
									s *= $2;
								}

								$$ = s;
							}
	| AND int_expr int_expr { $$= $2 && $3;}
	| OR int_expr int_expr { $$= $2 || $3;}
	|'!'int_expr	{ $$ = !$2; }
	;

str_expr:
	STRING 			{ $$ = $1; }
	|'#' str_expr str_expr { strcat(&$2, &$3); 
							$$ = $2;}
	;
%%

void yyerror(char *s) {
	fprintf(stderr, "%s\n", s);
}

int main() {
	yyparse();
	return 0;
}
