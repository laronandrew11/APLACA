grammar APLACA;

@parser::header { 
  package aplaca.parser; 
}  
  
@lexer::header { 
  package aplaca.parser; 
} 

parse  
  :  block EOF  
  ;  
  
block  
  :  (statement | functionDecl)* (Return expression ';')?  
  ;  
  
statement  
  :  assignment ';'  
  |  functionCall ';'  
  |  ifStatement  
  |  forStatement  
  |  whileStatement  
  ;  
  
functionDecl  
  :  Def Identifier '(' idList? ')' block End  
  ;  
  
idList  
  :  Identifier (',' Identifier)*  
  ;  
 
assignment  
  :  Identifier indexes? '<-' expression  
  ;  
  
indexes  
  :  ('[' expression ']')+  
  ;   
  
expression  
  :  condExpr  
  ;  
  
condExpr  
  :  orExpr ( '?' expression ':' expression  
            | In expression  
            )?  
  ;  
  
orExpr  
  :  andExpr ('||' andExpr)*  
  ;  
  
andExpr  
  :  equExpr ('&&' equExpr)*  
  ;  
  
equExpr  
  :  relExpr (('==' | '!=') relExpr)*  
  ;  
  
relExpr  
  :  addExpr (('>=' | '<=' | '>' | '<') addExpr)*  
  ;  
  
addExpr  
  :  mulExpr (('+' | '-') mulExpr)*  
  ;  
  
mulExpr  
  :  powExpr (('*' | '/' | '%') powExpr)*  
  ;  
  
powExpr  
  :  unaryExpr ('^' unaryExpr)*  
  ;  
    
unaryExpr  
  :  '-' atom  
  |  '!' atom  
  |  atom  
  ;  
  
atom  
  :  Null  
  |  Number  
  |  Bool  
  |  lookup  
  ;  

functionCall  
  :  Identifier '(' exprList? ')'  
  |  Println '(' expression? ')'  
  |  Print '(' expression ')'  
  |  Assert '(' expression ')'  
  |  Size '(' expression ')'  
  ;   

IF	:	'if';
ELSE	:	'fi';
ELSEIF	:	(ELSE IF);
OUT	:	'out';
IN	:	'in';
FUNCTION:	'func';
RETURN	:	'return';
GETS	:	'<-';	
END_OF_STATEMENT
	:	';';

EXP_OPER:	'**';
EQUAL	:	'=_='	;
LESS_OR_EQUAL
	:	'=_<'	;
LESS	:	'<_<';
GREATER_OR_EQUAL
	:	'>_=';
GREATER	:	'>_>';
UNEQUAL	:	'>_<';
AND	:	'&_&';
OR	:	'|_|';
NOT	:	'!';

BITWISE_AND
	:	'&';
BITWISE_OR
	:	'|';
BITWISE_XOR
	:	'^';


OPEN_BRACE	:	'{';
CLOSE_BRACE
	:	'}';	
CONCAT	:	'#'; //or we could overload '+'
ADDITIVE:	'-'|'+';
MULTIPLICATIVE
	:	'*'|'/'|'%';
OPEN_PAREN
	:	'(';
CLOSE_PAREN:	')';
	
NEWLINE	:	'\n';
TAB	:	'\t';

INTEGER	:	('0'..'9')+;
FLOAT	:	(INTEGER'.'INTEGER);
BOOL	:	'true'
	| 	'false';
IDENTIFIER
	:	 ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;
CHAR	:	'\''('a'..'z'|'A'..'Z')'\''	; 
STRING	:	'\'' ('""' | ~'"')* '\''  ; 

	


