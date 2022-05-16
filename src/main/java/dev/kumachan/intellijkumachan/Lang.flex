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
SYM0=\(
SYM1=\)
SYM2=\[
SYM3=\]
SYM4=\{
SYM5=\}
SYM6=\.\.\.
SYM7=\.\.
SYM8=\.
SYM9=,
SYM10=::
SYM11=:
SYM12=;
SYM13=@
SYM14=\&
SYM15=\|
SYM16=\\
IF=if
ELSE=else
WHEN=when
LET=let
NEW=new
SYM17==>
SYM18==
TOKEN_NAME=[^0-9\{\}\[\]\(\)\.,:;@\&\|\'\"` \t\r　\n][^\{\}\[\]\(\)\.,:;@\&\|\'\"` \t\r　\n]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "namespace"        { return NAMESPACE; }
  "entry"            { return ENTRY; }
  "type"             { return TYPE; }
  "native"           { return NATIVE; }
  "record"           { return RECORD; }
  "default"          { return DEFAULT; }
  "interface"        { return INTERFACE; }
  "union"            { return UNION; }
  "enum"             { return ENUM; }
  "function"         { return FUNCTION; }
  "operator"         { return OPERATOR; }
  "variadic"         { return VARIADIC; }
  "const"            { return CONST; }
  "method"           { return METHOD; }

  {DOC}              { return DOC; }
  {COMMENT}          { return COMMENT; }
  {WHITE_SPACE}      { return WHITE_SPACE; }
  {TOKEN_TEXT}       { return TOKEN_TEXT; }
  {INT}              { return INT; }
  {FLOAT}            { return FLOAT; }
  {BYTE}             { return BYTE; }
  {CHAR}             { return CHAR; }
  {SYM0}             { return SYM0; }
  {SYM1}             { return SYM1; }
  {SYM2}             { return SYM2; }
  {SYM3}             { return SYM3; }
  {SYM4}             { return SYM4; }
  {SYM5}             { return SYM5; }
  {SYM6}             { return SYM6; }
  {SYM7}             { return SYM7; }
  {SYM8}             { return SYM8; }
  {SYM9}             { return SYM9; }
  {SYM10}            { return SYM10; }
  {SYM11}            { return SYM11; }
  {SYM12}            { return SYM12; }
  {SYM13}            { return SYM13; }
  {SYM14}            { return SYM14; }
  {SYM15}            { return SYM15; }
  {SYM16}            { return SYM16; }
  {IF}               { return IF; }
  {ELSE}             { return ELSE; }
  {WHEN}             { return WHEN; }
  {LET}              { return LET; }
  {NEW}              { return NEW; }
  {SYM17}            { return SYM17; }
  {SYM18}            { return SYM18; }
  {TOKEN_NAME}       { return TOKEN_NAME; }

}

[^] { return BAD_CHARACTER; }
