// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import dev.kumachan.intellijkumachan.impl.*;

public interface Types {

  IElementType ARG_MAPPING = new Element("ARG_MAPPING");
  IElementType ARG_MAPPING_TO = new Element("ARG_MAPPING_TO");
  IElementType BINDING = new Element("BINDING");
  IElementType BINDING_CPS = new Element("BINDING_CPS");
  IElementType BINDING_PLAIN = new Element("BINDING_PLAIN");
  IElementType BLOCK = new Element("BLOCK");
  IElementType BODY = new Element("BODY");
  IElementType BYTES = new Element("BYTES");
  IElementType CALL_ORDERED = new Element("CALL_ORDERED");
  IElementType CALL_UNORDERED = new Element("CALL_UNORDERED");
  IElementType CASE = new Element("CASE");
  IElementType CAST = new Element("CAST");
  IElementType COND = new Element("COND");
  IElementType COND_PATTERN = new Element("COND_PATTERN");
  IElementType CPS_PATTERN = new Element("CPS_PATTERN");
  IElementType DECL_CONST = new Element("DECL_CONST");
  IElementType DECL_ENTRY = new Element("DECL_ENTRY");
  IElementType DECL_FUNC = new Element("DECL_FUNC");
  IElementType DECL_METHOD = new Element("DECL_METHOD");
  IElementType DECL_TYPE = new Element("DECL_TYPE");
  IElementType DOCS = new Element("DOCS");
  IElementType ELIF = new Element("ELIF");
  IElementType ENUM_ITEM = new Element("ENUM_ITEM");
  IElementType EXPR = new Element("EXPR");
  IElementType FIELD = new Element("FIELD");
  IElementType FIELD_DEFAULT = new Element("FIELD_DEFAULT");
  IElementType IF_NO = new Element("IF_NO");
  IElementType IF_YES = new Element("IF_YES");
  IElementType IMPL = new Element("IMPL");
  IElementType IMPLICIT = new Element("IMPLICIT");
  IElementType INFIX_LEFT = new Element("INFIX_LEFT");
  IElementType INFIX_RIGHT = new Element("INFIX_RIGHT");
  IElementType INFIX_TERM = new Element("INFIX_TERM");
  IElementType INPUTS = new Element("INPUTS");
  IElementType LAMBDA = new Element("LAMBDA");
  IElementType LAMBDA_SELF = new Element("LAMBDA_SELF");
  IElementType NATIVE_BODY = new Element("NATIVE_BODY");
  IElementType NATIVE_TYPE_DEF = new Element("NATIVE_TYPE_DEF");
  IElementType NEW_TAG = new Element("NEW_TAG");
  IElementType NODE_BYTE = new Element("NODE_BYTE");
  IElementType NODE_CHAR = new Element("NODE_CHAR");
  IElementType NODE_DOC = new Element("NODE_DOC");
  IElementType NODE_ENUM = new Element("NODE_ENUM");
  IElementType NODE_FLOAT = new Element("NODE_FLOAT");
  IElementType NODE_FUNCTION = new Element("NODE_FUNCTION");
  IElementType NODE_IF = new Element("NODE_IF");
  IElementType NODE_INT = new Element("NODE_INT");
  IElementType NODE_INTERFACE = new Element("NODE_INTERFACE");
  IElementType NODE_METHOD = new Element("NODE_METHOD");
  IElementType NODE_NAME = new Element("NODE_NAME");
  IElementType NODE_NEW = new Element("NODE_NEW");
  IElementType NODE_OPERATOR = new Element("NODE_OPERATOR");
  IElementType NODE_RECORD = new Element("NODE_RECORD");
  IElementType NODE_STRING = new Element("NODE_STRING");
  IElementType NODE_TEXT = new Element("NODE_TEXT");
  IElementType NODE_TYPE = new Element("NODE_TYPE");
  IElementType NODE_UNION = new Element("NODE_UNION");
  IElementType NODE_VARIADIC = new Element("NODE_VARIADIC");
  IElementType NODE_WHEN = new Element("NODE_WHEN");
  IElementType NS = new Element("NS");
  IElementType NS_PREFIX = new Element("NS_PREFIX");
  IElementType OUTPUT = new Element("OUTPUT");
  IElementType PATTERN = new Element("PATTERN");
  IElementType PATTERN_MULTIPLE = new Element("PATTERN_MULTIPLE");
  IElementType PATTERN_SINGLE = new Element("PATTERN_SINGLE");
  IElementType PIPE = new Element("PIPE");
  IElementType PIPE_CALL = new Element("PIPE_CALL");
  IElementType PIPE_CAST = new Element("PIPE_CAST");
  IElementType PIPE_GET = new Element("PIPE_GET");
  IElementType PIPE_INFIX = new Element("PIPE_INFIX");
  IElementType PIPE_INTERIOR = new Element("PIPE_INTERIOR");
  IElementType RECEIVER = new Element("RECEIVER");
  IElementType RECORD_DEF = new Element("RECORD_DEF");
  IElementType REF = new Element("REF");
  IElementType REF_BASE = new Element("REF_BASE");
  IElementType REF_TERM = new Element("REF_TERM");
  IElementType SIG = new Element("SIG");
  IElementType STMT = new Element("STMT");
  IElementType STRING_PART = new Element("STRING_PART");
  IElementType STRING_PART_CONTENT = new Element("STRING_PART_CONTENT");
  IElementType TERM = new Element("TERM");
  IElementType TYPE_ARGS = new Element("TYPE_ARGS");
  IElementType TYPE_DEF = new Element("TYPE_DEF");
  IElementType TYPE_PARAMS = new Element("TYPE_PARAMS");

  IElementType BYTE = new Token("BYTE");
  IElementType CHAR = new Token("CHAR");
  IElementType COMMENT = new Token("COMMENT");
  IElementType CONST = new Token("const");
  IElementType DOC = new Token("DOC");
  IElementType ELSE = new Token("ELSE");
  IElementType ENTRY = new Token("entry");
  IElementType ENUM = new Token("enum");
  IElementType FLOAT = new Token("FLOAT");
  IElementType FUNCTION = new Token("function");
  IElementType IF = new Token("IF");
  IElementType INT = new Token("INT");
  IElementType INTERFACE = new Token("interface");
  IElementType LET = new Token("LET");
  IElementType METHOD = new Token("method");
  IElementType NAMESPACE = new Token("namespace");
  IElementType NATIVE = new Token("native");
  IElementType NEW = new Token("NEW");
  IElementType OPERATOR = new Token("operator");
  IElementType RECORD = new Token("record");
  IElementType SYM12300 = new Token("SYM12300");
  IElementType SYM12400 = new Token("SYM12400");
  IElementType SYM12500 = new Token("SYM12500");
  IElementType SYM3800 = new Token("SYM3800");
  IElementType SYM4000 = new Token("SYM4000");
  IElementType SYM4100 = new Token("SYM4100");
  IElementType SYM4400 = new Token("SYM4400");
  IElementType SYM4600 = new Token("SYM4600");
  IElementType SYM46004600 = new Token("SYM46004600");
  IElementType SYM460046004600 = new Token("SYM460046004600");
  IElementType SYM5800 = new Token("SYM5800");
  IElementType SYM58005800 = new Token("SYM58005800");
  IElementType SYM5900 = new Token("SYM5900");
  IElementType SYM6100 = new Token("SYM6100");
  IElementType SYM61006200 = new Token("SYM61006200");
  IElementType SYM6400 = new Token("SYM6400");
  IElementType SYM9100 = new Token("SYM9100");
  IElementType SYM9200 = new Token("SYM9200");
  IElementType SYM9300 = new Token("SYM9300");
  IElementType TOKEN_NAME = new Token("TOKEN_NAME");
  IElementType TOKEN_TEXT = new Token("TOKEN_TEXT");
  IElementType TYPE = new Token("type");
  IElementType UNION = new Token("union");
  IElementType VARIADIC = new Token("variadic");
  IElementType WHEN = new Token("WHEN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARG_MAPPING) {
        return new ArgMappingImpl(node);
      }
      else if (type == ARG_MAPPING_TO) {
        return new ArgMappingToImpl(node);
      }
      else if (type == BINDING) {
        return new BindingImpl(node);
      }
      else if (type == BINDING_CPS) {
        return new BindingCpsImpl(node);
      }
      else if (type == BINDING_PLAIN) {
        return new BindingPlainImpl(node);
      }
      else if (type == BLOCK) {
        return new BlockImpl(node);
      }
      else if (type == BODY) {
        return new BodyImpl(node);
      }
      else if (type == BYTES) {
        return new BytesImpl(node);
      }
      else if (type == CALL_ORDERED) {
        return new CallOrderedImpl(node);
      }
      else if (type == CALL_UNORDERED) {
        return new CallUnorderedImpl(node);
      }
      else if (type == CASE) {
        return new CaseImpl(node);
      }
      else if (type == CAST) {
        return new CastImpl(node);
      }
      else if (type == COND) {
        return new CondImpl(node);
      }
      else if (type == COND_PATTERN) {
        return new CondPatternImpl(node);
      }
      else if (type == CPS_PATTERN) {
        return new CpsPatternImpl(node);
      }
      else if (type == DECL_CONST) {
        return new DeclConstImpl(node);
      }
      else if (type == DECL_ENTRY) {
        return new DeclEntryImpl(node);
      }
      else if (type == DECL_FUNC) {
        return new DeclFuncImpl(node);
      }
      else if (type == DECL_METHOD) {
        return new DeclMethodImpl(node);
      }
      else if (type == DECL_TYPE) {
        return new DeclTypeImpl(node);
      }
      else if (type == DOCS) {
        return new DocsImpl(node);
      }
      else if (type == ELIF) {
        return new ElifImpl(node);
      }
      else if (type == ENUM_ITEM) {
        return new EnumItemImpl(node);
      }
      else if (type == EXPR) {
        return new ExprImpl(node);
      }
      else if (type == FIELD) {
        return new FieldImpl(node);
      }
      else if (type == FIELD_DEFAULT) {
        return new FieldDefaultImpl(node);
      }
      else if (type == IF_NO) {
        return new IfNoImpl(node);
      }
      else if (type == IF_YES) {
        return new IfYesImpl(node);
      }
      else if (type == IMPL) {
        return new ImplImpl(node);
      }
      else if (type == IMPLICIT) {
        return new ImplicitImpl(node);
      }
      else if (type == INFIX_LEFT) {
        return new InfixLeftImpl(node);
      }
      else if (type == INFIX_RIGHT) {
        return new InfixRightImpl(node);
      }
      else if (type == INFIX_TERM) {
        return new InfixTermImpl(node);
      }
      else if (type == INPUTS) {
        return new InputsImpl(node);
      }
      else if (type == LAMBDA) {
        return new LambdaImpl(node);
      }
      else if (type == LAMBDA_SELF) {
        return new LambdaSelfImpl(node);
      }
      else if (type == NATIVE_BODY) {
        return new NativeBodyImpl(node);
      }
      else if (type == NATIVE_TYPE_DEF) {
        return new NativeTypeDefImpl(node);
      }
      else if (type == NEW_TAG) {
        return new NewTagImpl(node);
      }
      else if (type == NODE_BYTE) {
        return new NodeByteImpl(node);
      }
      else if (type == NODE_CHAR) {
        return new NodeCharImpl(node);
      }
      else if (type == NODE_DOC) {
        return new NodeDocImpl(node);
      }
      else if (type == NODE_ENUM) {
        return new NodeEnumImpl(node);
      }
      else if (type == NODE_FLOAT) {
        return new NodeFloatImpl(node);
      }
      else if (type == NODE_FUNCTION) {
        return new NodeFunctionImpl(node);
      }
      else if (type == NODE_IF) {
        return new NodeIfImpl(node);
      }
      else if (type == NODE_INT) {
        return new NodeIntImpl(node);
      }
      else if (type == NODE_INTERFACE) {
        return new NodeInterfaceImpl(node);
      }
      else if (type == NODE_METHOD) {
        return new NodeMethodImpl(node);
      }
      else if (type == NODE_NAME) {
        return new NodeNameImpl(node);
      }
      else if (type == NODE_NEW) {
        return new NodeNewImpl(node);
      }
      else if (type == NODE_OPERATOR) {
        return new NodeOperatorImpl(node);
      }
      else if (type == NODE_RECORD) {
        return new NodeRecordImpl(node);
      }
      else if (type == NODE_STRING) {
        return new NodeStringImpl(node);
      }
      else if (type == NODE_TEXT) {
        return new NodeTextImpl(node);
      }
      else if (type == NODE_TYPE) {
        return new NodeTypeImpl(node);
      }
      else if (type == NODE_UNION) {
        return new NodeUnionImpl(node);
      }
      else if (type == NODE_VARIADIC) {
        return new NodeVariadicImpl(node);
      }
      else if (type == NODE_WHEN) {
        return new NodeWhenImpl(node);
      }
      else if (type == NS) {
        return new NsImpl(node);
      }
      else if (type == NS_PREFIX) {
        return new NsPrefixImpl(node);
      }
      else if (type == OUTPUT) {
        return new OutputImpl(node);
      }
      else if (type == PATTERN) {
        return new PatternImpl(node);
      }
      else if (type == PATTERN_MULTIPLE) {
        return new PatternMultipleImpl(node);
      }
      else if (type == PATTERN_SINGLE) {
        return new PatternSingleImpl(node);
      }
      else if (type == PIPE) {
        return new PipeImpl(node);
      }
      else if (type == PIPE_CALL) {
        return new PipeCallImpl(node);
      }
      else if (type == PIPE_CAST) {
        return new PipeCastImpl(node);
      }
      else if (type == PIPE_GET) {
        return new PipeGetImpl(node);
      }
      else if (type == PIPE_INFIX) {
        return new PipeInfixImpl(node);
      }
      else if (type == PIPE_INTERIOR) {
        return new PipeInteriorImpl(node);
      }
      else if (type == RECEIVER) {
        return new ReceiverImpl(node);
      }
      else if (type == RECORD_DEF) {
        return new RecordDefImpl(node);
      }
      else if (type == REF) {
        return new RefImpl(node);
      }
      else if (type == REF_BASE) {
        return new RefBaseImpl(node);
      }
      else if (type == REF_TERM) {
        return new RefTermImpl(node);
      }
      else if (type == SIG) {
        return new SigImpl(node);
      }
      else if (type == STMT) {
        return new StmtImpl(node);
      }
      else if (type == STRING_PART) {
        return new StringPartImpl(node);
      }
      else if (type == STRING_PART_CONTENT) {
        return new StringPartContentImpl(node);
      }
      else if (type == TERM) {
        return new TermImpl(node);
      }
      else if (type == TYPE_ARGS) {
        return new TypeArgsImpl(node);
      }
      else if (type == TYPE_DEF) {
        return new TypeDefImpl(node);
      }
      else if (type == TYPE_PARAMS) {
        return new TypeParamsImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
