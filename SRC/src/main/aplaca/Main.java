package aplaca;
import aplaca.parser.*;
import org.antlr.runtime.*;    
    
public class Main {    
  public static void main(String[] args) throws Exception {    
    // create an instance of the lexer    
    APLACALexer lexer = new APLACALexer(new ANTLRFileStream(args[0]));    
            
    // wrap a token-stream around the lexer    
    CommonTokenStream tokens = new CommonTokenStream(lexer);    
            
    // create the parser    
    APLACAParser parser = new APLACAParser(tokens);    
       
    // invoke the 'parse' rule  
    parser.parse();  
  }    
}    