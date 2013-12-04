%{
#include <stdio.h>
#include<conio.h>
#include<string.h>
int yylex(void);
void yyerror(char *);
%}

%token INTEGER
%token CHAR
%token STRING
%token EXP_OPER
%token EQUAL
%token LESS_OR_EQUAL
%token GREATER_OR_EQUAL
%token LESS
%token GREATER
%token UNEQUAL
%token AND
%token OR
%token IF
%token ELSE
%token GETS
%%
program:
	program expr '\n'	{printf("%d\n", $2); }
	|
	;

expr:
	INTEGER			{ $$ = $1; }
	| '+' expr  expr 	{ $$ = $2 + $3; }
	| '-' expr  expr	{ $$ = $2 - $3; }
	| '*' expr  expr 	{ $$ = $2 * $3; }
	| '/' expr  expr	{ $$ = $2 / $3; }
	| '%' expr  expr 	{ $$ = $2 % $3; }
	|'|' expr  expr 	{ $$ = $2 | $3; }
	| '&' expr  expr	{ $$ = $2 & $3; }
	|'^' expr  expr 	{ $$ = $2 ^ $3; }
	| EXP_OPER expr expr 	{
								int s = 1;
								while ($3--) {
									s *= $2;
								}

								$$ = s;
							}
	| EQUAL expr expr { $$= $2 == $3;}
	| LESS_OR_EQUAL expr expr { $$= $2 <= $3;}
	| GREATER_OR_EQUAL expr expr { $$= $2 >= $3;}
	| UNEQUAL expr expr { $$= $2 != $3;}
	| LESS expr expr { $$= $2 < $3;}
	| GREATER expr expr { $$= $2 > $3;}
	| AND expr expr { $$= $2 && $3;}
	| OR expr expr { $$= $2 || $3;}
	|'!'expr	{ $$ = !$2; }
	STRING {$$=$1;}
	//|'#' expr expr { $$ =strcat( $2, $3); }
	;
%%

void yyerror(char *s) {
	fprintf(stderr, "%s\n", s);
}

int main() {
	yyparse();
	return 0;
}
