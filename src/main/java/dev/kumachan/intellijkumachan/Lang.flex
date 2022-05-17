package dev.kumachan.intellijkumachan;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static dev.kumachan.intellijkumachan.Types.*;

%%

%{
  public _LangLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _LangLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

DOC="///"[^\n]*
COMMENT="//"[^\n]*|"/"\*([^\*/]|\*[^/]|[^\*]"/")*\*"/"
WHITE_SPACE=[ \t\r　]+|[\n]+
TOKEN_TEXT='[^']*'|\"[^\"]*\"
INT=\-?0[xX][0-9A-Fa-f]+|\-?0[oO][0-7]+|\-?0[bB][01]+|\-?[0-9]+
FLOAT=\-?[0-9]+(\.[0-9]+)?[Ee][\+\-]?[0-9]+|\-?[0-9]+\.[0-9]+
BYTE=\\x[0-9A-Fa-f][0-9A-Fa-f]
CHAR=`.`|\\u[0-9A-Fa-f]+|\\[a-z]
SYM4000=\(
SYM4100=\)
SYM9100=\[
SYM9300=\]
SYM12300=\{
SYM12500=\}
SYM460046004600=\.\.\.
SYM46004600=\.\.
SYM4600=\.
SYM4400=,
SYM58005800=::
SYM5800=:
SYM5900=;
SYM6400=@
SYM3800=\&
SYM12400=\|
SYM9200=\\
IF=if
ELSE=else
WHEN=when
LET=let
NEW=new
SYM61006200==>
SYM6100==
TOKEN_NAME=[^0-9\{\}\[\]\(\)\.,:;@\&\|\\'\"` \t\r　\n][^\{\}\[\]\(\)\.,:;@\&\|\\'\"` \t\r　\n]*

%%
<YYINITIAL> {
  {WHITE_SPACE}          { return WHITE_SPACE; }

  "namespace"            { return NAMESPACE; }
  "entry"                { return ENTRY; }
  "type"                 { return TYPE; }
  "native"               { return NATIVE; }
  "record"               { return RECORD; }
  "default"              { return DEFAULT; }
  "interface"            { return INTERFACE; }
  "union"                { return UNION; }
  "enum"                 { return ENUM; }
  "function"             { return FUNCTION; }
  "operator"             { return OPERATOR; }
  "variadic"             { return VARIADIC; }
  "const"                { return CONST; }
  "method"               { return METHOD; }

  {DOC}                  { return DOC; }
  {COMMENT}              { return COMMENT; }
  {WHITE_SPACE}          { return WHITE_SPACE; }
  {TOKEN_TEXT}           { return TOKEN_TEXT; }
  {INT}                  { return INT; }
  {FLOAT}                { return FLOAT; }
  {BYTE}                 { return BYTE; }
  {CHAR}                 { return CHAR; }
  {SYM4000}              { return SYM4000; }
  {SYM4100}              { return SYM4100; }
  {SYM9100}              { return SYM9100; }
  {SYM9300}              { return SYM9300; }
  {SYM12300}             { return SYM12300; }
  {SYM12500}             { return SYM12500; }
  {SYM460046004600}      { return SYM460046004600; }
  {SYM46004600}          { return SYM46004600; }
  {SYM4600}              { return SYM4600; }
  {SYM4400}              { return SYM4400; }
  {SYM58005800}          { return SYM58005800; }
  {SYM5800}              { return SYM5800; }
  {SYM5900}              { return SYM5900; }
  {SYM6400}              { return SYM6400; }
  {SYM3800}              { return SYM3800; }
  {SYM12400}             { return SYM12400; }
  {SYM9200}              { return SYM9200; }
  {IF}                   { return IF; }
  {ELSE}                 { return ELSE; }
  {WHEN}                 { return WHEN; }
  {LET}                  { return LET; }
  {NEW}                  { return NEW; }
  {SYM61006200}          { return SYM61006200; }
  {SYM6100}              { return SYM6100; }
  {TOKEN_NAME}           { return TOKEN_NAME; }

}

[^] { return BAD_CHARACTER; }
