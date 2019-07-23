package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java.lang.*;
import java.io.InputStreamReader;

%%

%class Scanner
%unicode
%line
%column
%function next_token
%type Symbol
%{
	
  StringBuilder lexeme = new StringBuilder();

  private Symbol generateToken(int type){
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol generateToken(int type, Object value){
    return new Symbol(type, yyline+1, yycolumn+1, value);
    }
%}

Newline    = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment = "/*" {CommentContent} \*+ "/"
EndOfLineComment = "//" [^\r\n]* {CommentContent}  {Newline}
CommentContent = ( [^*] | \*+[^*/] )*

ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*
DecLiteral = 0 | [1-9][0-9]* /*Decimal number is 0 or start with a number that not is zero followed by 0 or plus digits*/
DoubleLiteral = (0 | [1-9][0-9]*)\.[0-9]+
/*String literal*/
StringLiteral = [^\r\n\"\\] 


%eofval{
    return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%state STRING
%%

<YYINITIAL> {

  {Whitespace} {                              			}
  {Comment}    {										}
  							//keywords
  "if"         { return generateToken(Symbol.IF);		}
  "then"       { return generateToken(Symbol.THEN);		}
  "else"       { return generateToken(Symbol.ELSE);		}
  "while"      { return generateToken(Symbol.WHILE);	}
  "for"        { return generateToken(Symbol.FOR);		}
 						 //separators
  ";"          { return generateToken(Symbol.SEMI); 	}
  "("          { return generateToken(Symbol.LPAREN); 	}
  ")"          { return generateToken(Symbol.RPAREN); 	}
  "["          {  return generateToken(Symbol.LBRACE);	}
  "]"          { return generateToken(Symbol.RBRACE);	}
  "."          {  return generateToken(Symbol.DOT);		}
  "{"          { return generateToken(Symbol.LBRACK);	}
  "}"          {  return generateToken(Symbol.RBRACK);	} 
							  //opts
  "+"          { return generateToken(Symbol.PLUS); 	}
  "-"          { return generateToken(Symbol.MINUS); 	}
  "*"          { return generateToken(Symbol.TIMES); 	}
  "/"		   { return generateToken(Symbol.DIV);		}
  ">"          { return generateToken(Symbol.GT);		}
  "<"          { return generateToken(Symbol.LT);		}
  "="          { return generateToken(Symbol.EG);		}
  "=="         { return generateToken(Symbol.EGEG);		}
  "<="         {  return generateToken(Symbol.LEG);		}
  ">="         { return generateToken(Symbol.GEG);		}
  "!="         { return generateToken(Symbol.NOT);		}
  "&&"         { return generateToken(Symbol.AND);		}
  "||"         { return generateToken(Symbol.OR);		}

  {ident}          { return generateToken(Symbol.ident, yytext()); 								}
  {DecLiteral}     { return generateToken( Symbol.DecLiteral, Integer.parseInt(yytext())); 		}
  {DoubleLiteral}  { return generateToken( Symbol.DoubleLiteral, Double.parseDouble(yytext())); }


  /*When found " start state string*/
  \" { yybegin(STRING); lexeme.setLength(0); }

}
/*Handle String state*/
<STRING> {
\" { yybegin(YYINITIAL); return generateToken(Symbol.STRING_LITERAL, lexeme.toString()); }
/* escape sequences */
  {StringLiteral}+ { lexeme.append( yytext()); }
  "\\b" 	{ lexeme.append( '\b' ); }
  "\\t" 	{ lexeme.append( '\t' ); }
  "\\n" 	{ lexeme.append( '\n' ); }
  "\\f" 	{ lexeme.append( '\f' ); }
  "\\r" 	{ lexeme.append( '\r' ); }
  "\\\"" 	{ lexeme.append( '\"' ); }
  "\\'" 	{ lexeme.append( '\'' ); }
  "\\\\" 	{ lexeme.append( '\\' ); }

// error fallback
 \\. { throw new RuntimeException("Illegal escape sequence \""+yytext()+"\"");	}
  {Newline} { throw new RuntimeException("Unterminated string at end of line"); }
  }
  <<EOF>>  { return generateToken(Symbol.EOF); }