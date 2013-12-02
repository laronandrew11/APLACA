 %{

  #include <stdlib.h>
  #include "y.tab.h"

  %}

  %%

  ("hi"|"oi")"\n"       { return HI;  }
  ("tchau"|"bye")"\n"   { return BYE; }
  .                     { yyerror();  }

  %%

  int yyerror(void)
  {
      printf("Error\n");
      exit(1);
  }
  
  int yywrap(void)
  {
     return 0;
  }

  int main(void)
  {
     yyparse();
     return 0;
  }
