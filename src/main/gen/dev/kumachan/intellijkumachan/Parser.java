// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static dev.kumachan.intellijkumachan.Types.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class Parser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // node_name arg_mapping_to?
  public static boolean arg_mapping(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_mapping")) return false;
    if (!nextTokenIs(b, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_name(b, l + 1);
    r = r && arg_mapping_1(b, l + 1);
    exit_section_(b, m, ARG_MAPPING, r);
    return r;
  }

  // arg_mapping_to?
  private static boolean arg_mapping_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_mapping_1")) return false;
    arg_mapping_to(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // SYM5800 expr
  public static boolean arg_mapping_to(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_mapping_to")) return false;
    if (!nextTokenIs(b, SYM5800)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM5800);
    r = r && expr(b, l + 1);
    exit_section_(b, m, ARG_MAPPING_TO, r);
    return r;
  }

  /* ********************************************************** */
  // binding_plain | binding_cps
  public static boolean binding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding")) return false;
    if (!nextTokenIs(b, "<binding>", LET, SYM6400)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINDING, "<binding>");
    r = binding_plain(b, l + 1);
    if (!r) r = binding_cps(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYM6400 ref cps_pattern? expr SYM4400
  public static boolean binding_cps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_cps")) return false;
    if (!nextTokenIs(b, SYM6400)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM6400);
    r = r && ref(b, l + 1);
    r = r && binding_cps_2(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, SYM4400);
    exit_section_(b, m, BINDING_CPS, r);
    return r;
  }

  // cps_pattern?
  private static boolean binding_cps_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_cps_2")) return false;
    cps_pattern(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LET pattern SYM6100 expr SYM4400
  public static boolean binding_plain(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_plain")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && pattern(b, l + 1);
    r = r && consumeToken(b, SYM6100);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, SYM4400);
    exit_section_(b, m, BINDING_PLAIN, r);
    return r;
  }

  /* ********************************************************** */
  // SYM12300 binding* expr SYM12500
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, SYM12300)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM12300);
    r = r && block_1(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, SYM12500);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  // binding*
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!binding(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // native_body | block
  public static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    if (!nextTokenIs(b, "<body>", NATIVE, SYM12300)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY, "<body>");
    r = native_body(b, l + 1);
    if (!r) r = block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // node_byte+
  public static boolean bytes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bytes")) return false;
    if (!nextTokenIs(b, BYTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_byte(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!node_byte(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bytes", c)) break;
    }
    exit_section_(b, m, BYTES, r);
    return r;
  }

  /* ********************************************************** */
  // SYM4000 [ expr { SYM4400 expr }* ] SYM4100
  public static boolean call_ordered(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_ordered")) return false;
    if (!nextTokenIs(b, SYM4000)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4000);
    r = r && call_ordered_1(b, l + 1);
    r = r && consumeToken(b, SYM4100);
    exit_section_(b, m, CALL_ORDERED, r);
    return r;
  }

  // [ expr { SYM4400 expr }* ]
  private static boolean call_ordered_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_ordered_1")) return false;
    call_ordered_1_0(b, l + 1);
    return true;
  }

  // expr { SYM4400 expr }*
  private static boolean call_ordered_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_ordered_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && call_ordered_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { SYM4400 expr }*
  private static boolean call_ordered_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_ordered_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_ordered_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_ordered_1_0_1", c)) break;
    }
    return true;
  }

  // SYM4400 expr
  private static boolean call_ordered_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_ordered_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SYM12300 [ arg_mapping { SYM4400 arg_mapping }* ] SYM12500
  public static boolean call_unordered(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_unordered")) return false;
    if (!nextTokenIs(b, SYM12300)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM12300);
    r = r && call_unordered_1(b, l + 1);
    r = r && consumeToken(b, SYM12500);
    exit_section_(b, m, CALL_UNORDERED, r);
    return r;
  }

  // [ arg_mapping { SYM4400 arg_mapping }* ]
  private static boolean call_unordered_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_unordered_1")) return false;
    call_unordered_1_0(b, l + 1);
    return true;
  }

  // arg_mapping { SYM4400 arg_mapping }*
  private static boolean call_unordered_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_unordered_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg_mapping(b, l + 1);
    r = r && call_unordered_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { SYM4400 arg_mapping }*
  private static boolean call_unordered_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_unordered_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_unordered_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_unordered_1_0_1", c)) break;
    }
    return true;
  }

  // SYM4400 arg_mapping
  private static boolean call_unordered_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_unordered_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && arg_mapping(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // node_name { SYM12400 node_name }* pattern? SYM61006200 expr
  public static boolean case_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_$")) return false;
    if (!nextTokenIs(b, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_name(b, l + 1);
    r = r && case_1(b, l + 1);
    r = r && case_2(b, l + 1);
    r = r && consumeToken(b, SYM61006200);
    r = r && expr(b, l + 1);
    exit_section_(b, m, CASE, r);
    return r;
  }

  // { SYM12400 node_name }*
  private static boolean case_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!case_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_1", c)) break;
    }
    return true;
  }

  // SYM12400 node_name
  private static boolean case_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM12400);
    r = r && node_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // pattern?
  private static boolean case_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_2")) return false;
    pattern(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // SYM4000 SYM9100 node_type SYM9300 SYM4100
  public static boolean cast(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast")) return false;
    if (!nextTokenIs(b, SYM4000)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYM4000, SYM9100);
    r = r && node_type(b, l + 1);
    r = r && consumeTokens(b, 0, SYM9300, SYM4100);
    exit_section_(b, m, CAST, r);
    return r;
  }

  /* ********************************************************** */
  // cond_pattern? expr
  public static boolean cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND, "<cond>");
    r = cond_0(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // cond_pattern?
  private static boolean cond_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_0")) return false;
    cond_pattern(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LET pattern SYM6100
  public static boolean cond_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_pattern")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && pattern(b, l + 1);
    r = r && consumeToken(b, SYM6100);
    exit_section_(b, m, COND_PATTERN, r);
    return r;
  }

  /* ********************************************************** */
  // pattern SYM6100
  public static boolean cps_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cps_pattern")) return false;
    if (!nextTokenIs(b, "<cps pattern>", SYM4000, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPS_PATTERN, "<cps pattern>");
    r = pattern(b, l + 1);
    r = r && consumeToken(b, SYM6100);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // docs? const node_name node_type body
  public static boolean decl_const(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_const")) return false;
    if (!nextTokenIs(b, "<decl const>", CONST, DOC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_CONST, "<decl const>");
    r = decl_const_0(b, l + 1);
    r = r && consumeToken(b, CONST);
    r = r && node_name(b, l + 1);
    r = r && node_type(b, l + 1);
    r = r && body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean decl_const_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_const_0")) return false;
    docs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // entry block
  public static boolean decl_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_entry")) return false;
    if (!nextTokenIs(b, ENTRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTRY);
    r = r && block(b, l + 1);
    exit_section_(b, m, DECL_ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // docs? node_function node_variadic? node_name sig body
  public static boolean decl_func(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_func")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_FUNC, "<decl func>");
    r = decl_func_0(b, l + 1);
    r = r && node_function(b, l + 1);
    r = r && decl_func_2(b, l + 1);
    r = r && node_name(b, l + 1);
    r = r && sig(b, l + 1);
    r = r && body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean decl_func_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_func_0")) return false;
    docs(b, l + 1);
    return true;
  }

  // node_variadic?
  private static boolean decl_func_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_func_2")) return false;
    node_variadic(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // docs? method receiver SYM4600 node_name node_type body
  public static boolean decl_method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_method")) return false;
    if (!nextTokenIs(b, "<decl method>", DOC, METHOD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_METHOD, "<decl method>");
    r = decl_method_0(b, l + 1);
    r = r && consumeToken(b, METHOD);
    r = r && receiver(b, l + 1);
    r = r && consumeToken(b, SYM4600);
    r = r && node_name(b, l + 1);
    r = r && node_type(b, l + 1);
    r = r && body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean decl_method_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_method_0")) return false;
    docs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // docs? type node_name type_params? impl? type_def
  public static boolean decl_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_type")) return false;
    if (!nextTokenIs(b, "<decl type>", DOC, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_TYPE, "<decl type>");
    r = decl_type_0(b, l + 1);
    r = r && consumeToken(b, TYPE);
    r = r && node_name(b, l + 1);
    r = r && decl_type_3(b, l + 1);
    r = r && decl_type_4(b, l + 1);
    r = r && type_def(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean decl_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_type_0")) return false;
    docs(b, l + 1);
    return true;
  }

  // type_params?
  private static boolean decl_type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_type_3")) return false;
    type_params(b, l + 1);
    return true;
  }

  // impl?
  private static boolean decl_type_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_type_4")) return false;
    impl(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // node_doc+
  public static boolean docs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs")) return false;
    if (!nextTokenIs(b, DOC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_doc(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!node_doc(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "docs", c)) break;
    }
    exit_section_(b, m, DOCS, r);
    return r;
  }

  /* ********************************************************** */
  // IF SYM4000 cond { SYM4400 cond }* SYM4100 block
  public static boolean elif(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elif")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, SYM4000);
    r = r && cond(b, l + 1);
    r = r && elif_3(b, l + 1);
    r = r && consumeToken(b, SYM4100);
    r = r && block(b, l + 1);
    exit_section_(b, m, ELIF, r);
    return r;
  }

  // { SYM4400 cond }*
  private static boolean elif_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elif_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elif_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elif_3", c)) break;
    }
    return true;
  }

  // SYM4400 cond
  private static boolean elif_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elif_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && cond(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // docs? node_name
  public static boolean enum_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_item")) return false;
    if (!nextTokenIs(b, "<enum item>", DOC, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_ITEM, "<enum item>");
    r = enum_item_0(b, l + 1);
    r = r && node_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean enum_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_item_0")) return false;
    docs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // cast* term pipe*
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = expr_0(b, l + 1);
    r = r && term(b, l + 1);
    r = r && expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // cast*
  private static boolean expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cast(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_0", c)) break;
    }
    return true;
  }

  // pipe*
  private static boolean expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pipe(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // docs? node_name node_type field_default?
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    if (!nextTokenIs(b, "<field>", DOC, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD, "<field>");
    r = field_0(b, l + 1);
    r = r && node_name(b, l + 1);
    r = r && node_type(b, l + 1);
    r = r && field_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_0")) return false;
    docs(b, l + 1);
    return true;
  }

  // field_default?
  private static boolean field_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_3")) return false;
    field_default(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // SYM4000 expr SYM4100
  public static boolean field_default(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_default")) return false;
    if (!nextTokenIs(b, SYM4000)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4000);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, SYM4100);
    exit_section_(b, m, FIELD_DEFAULT, r);
    return r;
  }

  /* ********************************************************** */
  // block
  public static boolean if_no(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_no")) return false;
    if (!nextTokenIs(b, SYM12300)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block(b, l + 1);
    exit_section_(b, m, IF_NO, r);
    return r;
  }

  /* ********************************************************** */
  // block
  public static boolean if_yes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_yes")) return false;
    if (!nextTokenIs(b, SYM12300)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block(b, l + 1);
    exit_section_(b, m, IF_YES, r);
    return r;
  }

  /* ********************************************************** */
  // SYM4000 [ ref_base { SYM4400 ref_base }* ] SYM4100
  public static boolean impl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl")) return false;
    if (!nextTokenIs(b, SYM4000)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4000);
    r = r && impl_1(b, l + 1);
    r = r && consumeToken(b, SYM4100);
    exit_section_(b, m, IMPL, r);
    return r;
  }

  // [ ref_base { SYM4400 ref_base }* ]
  private static boolean impl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_1")) return false;
    impl_1_0(b, l + 1);
    return true;
  }

  // ref_base { SYM4400 ref_base }*
  private static boolean impl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref_base(b, l + 1);
    r = r && impl_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { SYM4400 ref_base }*
  private static boolean impl_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!impl_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "impl_1_0_1", c)) break;
    }
    return true;
  }

  // SYM4400 ref_base
  private static boolean impl_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impl_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && ref_base(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // inputs
  public static boolean implicit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit")) return false;
    if (!nextTokenIs(b, SYM12300)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inputs(b, l + 1);
    exit_section_(b, m, IMPLICIT, r);
    return r;
  }

  /* ********************************************************** */
  // expr
  public static boolean infix_left(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_left")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX_LEFT, "<infix left>");
    r = expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr
  public static boolean infix_right(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_right")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX_RIGHT, "<infix right>");
    r = expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYM4000 infix_left node_operator infix_right SYM4100
  public static boolean infix_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_term")) return false;
    if (!nextTokenIs(b, SYM4000)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4000);
    r = r && infix_left(b, l + 1);
    r = r && node_operator(b, l + 1);
    r = r && infix_right(b, l + 1);
    r = r && consumeToken(b, SYM4100);
    exit_section_(b, m, INFIX_TERM, r);
    return r;
  }

  /* ********************************************************** */
  // record_def
  public static boolean inputs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inputs")) return false;
    if (!nextTokenIs(b, SYM12300)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = record_def(b, l + 1);
    exit_section_(b, m, INPUTS, r);
    return r;
  }

  /* ********************************************************** */
  // SYM12300 pattern? lambda_self? SYM61006200 expr SYM12500
  public static boolean lambda(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda")) return false;
    if (!nextTokenIs(b, SYM12300)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM12300);
    r = r && lambda_1(b, l + 1);
    r = r && lambda_2(b, l + 1);
    r = r && consumeToken(b, SYM61006200);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, SYM12500);
    exit_section_(b, m, LAMBDA, r);
    return r;
  }

  // pattern?
  private static boolean lambda_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_1")) return false;
    pattern(b, l + 1);
    return true;
  }

  // lambda_self?
  private static boolean lambda_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_2")) return false;
    lambda_self(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // SYM3800 node_name
  public static boolean lambda_self(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_self")) return false;
    if (!nextTokenIs(b, SYM3800)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM3800);
    r = r && node_name(b, l + 1);
    exit_section_(b, m, LAMBDA_SELF, r);
    return r;
  }

  /* ********************************************************** */
  // native SYM4000 node_text SYM4100
  public static boolean native_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "native_body")) return false;
    if (!nextTokenIs(b, NATIVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NATIVE, SYM4000);
    r = r && node_text(b, l + 1);
    r = r && consumeToken(b, SYM4100);
    exit_section_(b, m, NATIVE_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // native
  public static boolean native_type_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "native_type_def")) return false;
    if (!nextTokenIs(b, NATIVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NATIVE);
    exit_section_(b, m, NATIVE_TYPE_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // SYM5800 node_name
  public static boolean new_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_tag")) return false;
    if (!nextTokenIs(b, SYM5800)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM5800);
    r = r && node_name(b, l + 1);
    exit_section_(b, m, NEW_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // BYTE
  public static boolean node_byte(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_byte")) return false;
    if (!nextTokenIs(b, BYTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BYTE);
    exit_section_(b, m, NODE_BYTE, r);
    return r;
  }

  /* ********************************************************** */
  // CHAR
  public static boolean node_char(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_char")) return false;
    if (!nextTokenIs(b, CHAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHAR);
    exit_section_(b, m, NODE_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // DOC
  public static boolean node_doc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_doc")) return false;
    if (!nextTokenIs(b, DOC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOC);
    exit_section_(b, m, NODE_DOC, r);
    return r;
  }

  /* ********************************************************** */
  // enum SYM12300 enum_item { SYM4400 enum_item }* SYM12500
  public static boolean node_enum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_enum")) return false;
    if (!nextTokenIs(b, ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENUM, SYM12300);
    r = r && enum_item(b, l + 1);
    r = r && node_enum_3(b, l + 1);
    r = r && consumeToken(b, SYM12500);
    exit_section_(b, m, NODE_ENUM, r);
    return r;
  }

  // { SYM4400 enum_item }*
  private static boolean node_enum_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_enum_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!node_enum_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "node_enum_3", c)) break;
    }
    return true;
  }

  // SYM4400 enum_item
  private static boolean node_enum_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_enum_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && enum_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FLOAT
  public static boolean node_float(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_float")) return false;
    if (!nextTokenIs(b, FLOAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FLOAT);
    exit_section_(b, m, NODE_FLOAT, r);
    return r;
  }

  /* ********************************************************** */
  // function | operator
  public static boolean node_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_function")) return false;
    if (!nextTokenIs(b, "<node function>", FUNCTION, OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NODE_FUNCTION, "<node function>");
    r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, OPERATOR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IF SYM4000 cond { SYM4400 cond }* SYM4100 if_yes elif* ELSE if_no
  public static boolean node_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_if")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, SYM4000);
    r = r && cond(b, l + 1);
    r = r && node_if_3(b, l + 1);
    r = r && consumeToken(b, SYM4100);
    r = r && if_yes(b, l + 1);
    r = r && node_if_6(b, l + 1);
    r = r && consumeToken(b, ELSE);
    r = r && if_no(b, l + 1);
    exit_section_(b, m, NODE_IF, r);
    return r;
  }

  // { SYM4400 cond }*
  private static boolean node_if_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_if_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!node_if_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "node_if_3", c)) break;
    }
    return true;
  }

  // SYM4400 cond
  private static boolean node_if_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_if_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && cond(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // elif*
  private static boolean node_if_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_if_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elif(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "node_if_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // INT
  public static boolean node_int(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_int")) return false;
    if (!nextTokenIs(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT);
    exit_section_(b, m, NODE_INT, r);
    return r;
  }

  /* ********************************************************** */
  // interface SYM12300 [ node_method { SYM4400 node_method }* ] SYM12500
  public static boolean node_interface(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_interface")) return false;
    if (!nextTokenIs(b, INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INTERFACE, SYM12300);
    r = r && node_interface_2(b, l + 1);
    r = r && consumeToken(b, SYM12500);
    exit_section_(b, m, NODE_INTERFACE, r);
    return r;
  }

  // [ node_method { SYM4400 node_method }* ]
  private static boolean node_interface_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_interface_2")) return false;
    node_interface_2_0(b, l + 1);
    return true;
  }

  // node_method { SYM4400 node_method }*
  private static boolean node_interface_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_interface_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_method(b, l + 1);
    r = r && node_interface_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { SYM4400 node_method }*
  private static boolean node_interface_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_interface_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!node_interface_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "node_interface_2_0_1", c)) break;
    }
    return true;
  }

  // SYM4400 node_method
  private static boolean node_interface_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_interface_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && node_method(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // docs? node_name node_type
  public static boolean node_method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_method")) return false;
    if (!nextTokenIs(b, "<node method>", DOC, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NODE_METHOD, "<node method>");
    r = node_method_0(b, l + 1);
    r = r && node_name(b, l + 1);
    r = r && node_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean node_method_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_method_0")) return false;
    docs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TOKEN_NAME
  public static boolean node_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_name")) return false;
    if (!nextTokenIs(b, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TOKEN_NAME);
    exit_section_(b, m, NODE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // NEW new_tag?
  public static boolean node_new(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_new")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && node_new_1(b, l + 1);
    exit_section_(b, m, NODE_NEW, r);
    return r;
  }

  // new_tag?
  private static boolean node_new_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_new_1")) return false;
    new_tag(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ref
  public static boolean node_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_operator")) return false;
    if (!nextTokenIs(b, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref(b, l + 1);
    exit_section_(b, m, NODE_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // record record_def
  public static boolean node_record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_record")) return false;
    if (!nextTokenIs(b, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORD);
    r = r && record_def(b, l + 1);
    exit_section_(b, m, NODE_RECORD, r);
    return r;
  }

  /* ********************************************************** */
  // node_text string_part*
  public static boolean node_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_string")) return false;
    if (!nextTokenIs(b, TOKEN_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_text(b, l + 1);
    r = r && node_string_1(b, l + 1);
    exit_section_(b, m, NODE_STRING, r);
    return r;
  }

  // string_part*
  private static boolean node_string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_string_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!string_part(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "node_string_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TOKEN_TEXT
  public static boolean node_text(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_text")) return false;
    if (!nextTokenIs(b, TOKEN_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TOKEN_TEXT);
    exit_section_(b, m, NODE_TEXT, r);
    return r;
  }

  /* ********************************************************** */
  // ref
  public static boolean node_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_type")) return false;
    if (!nextTokenIs(b, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref(b, l + 1);
    exit_section_(b, m, NODE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // union SYM12300 node_type { SYM4400 node_type }* SYM12500
  public static boolean node_union(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_union")) return false;
    if (!nextTokenIs(b, UNION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, UNION, SYM12300);
    r = r && node_type(b, l + 1);
    r = r && node_union_3(b, l + 1);
    r = r && consumeToken(b, SYM12500);
    exit_section_(b, m, NODE_UNION, r);
    return r;
  }

  // { SYM4400 node_type }*
  private static boolean node_union_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_union_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!node_union_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "node_union_3", c)) break;
    }
    return true;
  }

  // SYM4400 node_type
  private static boolean node_union_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_union_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && node_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variadic
  public static boolean node_variadic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_variadic")) return false;
    if (!nextTokenIs(b, VARIADIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIADIC);
    exit_section_(b, m, NODE_VARIADIC, r);
    return r;
  }

  /* ********************************************************** */
  // WHEN SYM4000 expr SYM4100 SYM12300 case { SYM4400 case }* SYM12500
  public static boolean node_when(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_when")) return false;
    if (!nextTokenIs(b, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHEN, SYM4000);
    r = r && expr(b, l + 1);
    r = r && consumeTokens(b, 0, SYM4100, SYM12300);
    r = r && case_$(b, l + 1);
    r = r && node_when_6(b, l + 1);
    r = r && consumeToken(b, SYM12500);
    exit_section_(b, m, NODE_WHEN, r);
    return r;
  }

  // { SYM4400 case }*
  private static boolean node_when_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_when_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!node_when_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "node_when_6", c)) break;
    }
    return true;
  }

  // SYM4400 case
  private static boolean node_when_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_when_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && case_$(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // namespace node_name? SYM58005800
  public static boolean ns(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ns")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAMESPACE);
    r = r && ns_1(b, l + 1);
    r = r && consumeToken(b, SYM58005800);
    exit_section_(b, m, NS, r);
    return r;
  }

  // node_name?
  private static boolean ns_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ns_1")) return false;
    node_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // node_name SYM58005800
  public static boolean ns_prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ns_prefix")) return false;
    if (!nextTokenIs(b, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_name(b, l + 1);
    r = r && consumeToken(b, SYM58005800);
    exit_section_(b, m, NS_PREFIX, r);
    return r;
  }

  /* ********************************************************** */
  // node_type
  public static boolean output(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output")) return false;
    if (!nextTokenIs(b, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_type(b, l + 1);
    exit_section_(b, m, OUTPUT, r);
    return r;
  }

  /* ********************************************************** */
  // pattern_single | pattern_multiple
  public static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    if (!nextTokenIs(b, "<pattern>", SYM4000, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN, "<pattern>");
    r = pattern_single(b, l + 1);
    if (!r) r = pattern_multiple(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYM4000 node_name { SYM4400 node_name }* SYM4100
  public static boolean pattern_multiple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_multiple")) return false;
    if (!nextTokenIs(b, SYM4000)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4000);
    r = r && node_name(b, l + 1);
    r = r && pattern_multiple_2(b, l + 1);
    r = r && consumeToken(b, SYM4100);
    exit_section_(b, m, PATTERN_MULTIPLE, r);
    return r;
  }

  // { SYM4400 node_name }*
  private static boolean pattern_multiple_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_multiple_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pattern_multiple_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pattern_multiple_2", c)) break;
    }
    return true;
  }

  // SYM4400 node_name
  private static boolean pattern_multiple_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_multiple_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && node_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // node_name
  public static boolean pattern_single(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_single")) return false;
    if (!nextTokenIs(b, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_name(b, l + 1);
    exit_section_(b, m, PATTERN_SINGLE, r);
    return r;
  }

  /* ********************************************************** */
  // pipe_call | pipe_infix | pipe_cast | pipe_get | pipe_interior
  public static boolean pipe(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipe")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PIPE, "<pipe>");
    r = pipe_call(b, l + 1);
    if (!r) r = pipe_infix(b, l + 1);
    if (!r) r = pipe_cast(b, l + 1);
    if (!r) r = pipe_get(b, l + 1);
    if (!r) r = pipe_interior(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // call_ordered | call_unordered
  public static boolean pipe_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipe_call")) return false;
    if (!nextTokenIs(b, "<pipe call>", SYM12300, SYM4000)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PIPE_CALL, "<pipe call>");
    r = call_ordered(b, l + 1);
    if (!r) r = call_unordered(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYM4600 cast
  public static boolean pipe_cast(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipe_cast")) return false;
    if (!nextTokenIs(b, SYM4600)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4600);
    r = r && cast(b, l + 1);
    exit_section_(b, m, PIPE_CAST, r);
    return r;
  }

  /* ********************************************************** */
  // SYM4600 node_name
  public static boolean pipe_get(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipe_get")) return false;
    if (!nextTokenIs(b, SYM4600)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4600);
    r = r && node_name(b, l + 1);
    exit_section_(b, m, PIPE_GET, r);
    return r;
  }

  /* ********************************************************** */
  // SYM12400 ref pipe_call
  public static boolean pipe_infix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipe_infix")) return false;
    if (!nextTokenIs(b, SYM12400)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM12400);
    r = r && ref(b, l + 1);
    r = r && pipe_call(b, l + 1);
    exit_section_(b, m, PIPE_INFIX, r);
    return r;
  }

  /* ********************************************************** */
  // SYM4600 SYM4000 ref_base SYM4100
  public static boolean pipe_interior(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipe_interior")) return false;
    if (!nextTokenIs(b, SYM4600)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYM4600, SYM4000);
    r = r && ref_base(b, l + 1);
    r = r && consumeToken(b, SYM4100);
    exit_section_(b, m, PIPE_INTERIOR, r);
    return r;
  }

  /* ********************************************************** */
  // node_name
  public static boolean receiver(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "receiver")) return false;
    if (!nextTokenIs(b, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_name(b, l + 1);
    exit_section_(b, m, RECEIVER, r);
    return r;
  }

  /* ********************************************************** */
  // SYM12300 [ field { SYM4400 field }* ] SYM12500
  public static boolean record_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_def")) return false;
    if (!nextTokenIs(b, SYM12300)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM12300);
    r = r && record_def_1(b, l + 1);
    r = r && consumeToken(b, SYM12500);
    exit_section_(b, m, RECORD_DEF, r);
    return r;
  }

  // [ field { SYM4400 field }* ]
  private static boolean record_def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_def_1")) return false;
    record_def_1_0(b, l + 1);
    return true;
  }

  // field { SYM4400 field }*
  private static boolean record_def_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_def_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field(b, l + 1);
    r = r && record_def_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { SYM4400 field }*
  private static boolean record_def_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_def_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!record_def_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_def_1_0_1", c)) break;
    }
    return true;
  }

  // SYM4400 field
  private static boolean record_def_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_def_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && field(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ref_base type_args?
  public static boolean ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref")) return false;
    if (!nextTokenIs(b, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref_base(b, l + 1);
    r = r && ref_1(b, l + 1);
    exit_section_(b, m, REF, r);
    return r;
  }

  // type_args?
  private static boolean ref_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_1")) return false;
    type_args(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ns_prefix? node_name
  public static boolean ref_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_base")) return false;
    if (!nextTokenIs(b, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref_base_0(b, l + 1);
    r = r && node_name(b, l + 1);
    exit_section_(b, m, REF_BASE, r);
    return r;
  }

  // ns_prefix?
  private static boolean ref_base_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_base_0")) return false;
    ns_prefix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // node_new? ref
  public static boolean ref_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_term")) return false;
    if (!nextTokenIs(b, "<ref term>", NEW, TOKEN_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REF_TERM, "<ref term>");
    r = ref_term_0(b, l + 1);
    r = r && ref(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // node_new?
  private static boolean ref_term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_term_0")) return false;
    node_new(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ns stmt*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ns(b, l + 1);
    r = r && root_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // stmt*
  private static boolean root_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // type_params? inputs implicit? output
  public static boolean sig(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sig")) return false;
    if (!nextTokenIs(b, "<sig>", SYM12300, SYM9100)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIG, "<sig>");
    r = sig_0(b, l + 1);
    r = r && inputs(b, l + 1);
    r = r && sig_2(b, l + 1);
    r = r && output(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_params?
  private static boolean sig_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sig_0")) return false;
    type_params(b, l + 1);
    return true;
  }

  // implicit?
  private static boolean sig_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sig_2")) return false;
    implicit(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // decl_entry | decl_type | decl_func | decl_const | decl_method
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = decl_entry(b, l + 1);
    if (!r) r = decl_type(b, l + 1);
    if (!r) r = decl_func(b, l + 1);
    if (!r) r = decl_const(b, l + 1);
    if (!r) r = decl_method(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYM46004600 string_part_content
  public static boolean string_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_part")) return false;
    if (!nextTokenIs(b, SYM46004600)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM46004600);
    r = r && string_part_content(b, l + 1);
    exit_section_(b, m, STRING_PART, r);
    return r;
  }

  /* ********************************************************** */
  // node_text | node_char
  public static boolean string_part_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_part_content")) return false;
    if (!nextTokenIs(b, "<string part content>", CHAR, TOKEN_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_PART_CONTENT, "<string part content>");
    r = node_text(b, l + 1);
    if (!r) r = node_char(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // infix_term | lambda | node_if | node_when | block | ref_term | node_int | node_float | node_char | bytes | node_string
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = infix_term(b, l + 1);
    if (!r) r = lambda(b, l + 1);
    if (!r) r = node_if(b, l + 1);
    if (!r) r = node_when(b, l + 1);
    if (!r) r = block(b, l + 1);
    if (!r) r = ref_term(b, l + 1);
    if (!r) r = node_int(b, l + 1);
    if (!r) r = node_float(b, l + 1);
    if (!r) r = node_char(b, l + 1);
    if (!r) r = bytes(b, l + 1);
    if (!r) r = node_string(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYM9100 [ node_type { SYM4400 node_type }* ] SYM9300
  public static boolean type_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_args")) return false;
    if (!nextTokenIs(b, SYM9100)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM9100);
    r = r && type_args_1(b, l + 1);
    r = r && consumeToken(b, SYM9300);
    exit_section_(b, m, TYPE_ARGS, r);
    return r;
  }

  // [ node_type { SYM4400 node_type }* ]
  private static boolean type_args_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_args_1")) return false;
    type_args_1_0(b, l + 1);
    return true;
  }

  // node_type { SYM4400 node_type }*
  private static boolean type_args_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_args_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_type(b, l + 1);
    r = r && type_args_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { SYM4400 node_type }*
  private static boolean type_args_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_args_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_args_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_args_1_0_1", c)) break;
    }
    return true;
  }

  // SYM4400 node_type
  private static boolean type_args_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_args_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && node_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // native_type_def | node_record | node_interface | node_union | node_enum
  public static boolean type_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF, "<type def>");
    r = native_type_def(b, l + 1);
    if (!r) r = node_record(b, l + 1);
    if (!r) r = node_interface(b, l + 1);
    if (!r) r = node_union(b, l + 1);
    if (!r) r = node_enum(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYM9100 [ node_name { SYM4400 node_name }* ] SYM9300
  public static boolean type_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_params")) return false;
    if (!nextTokenIs(b, SYM9100)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM9100);
    r = r && type_params_1(b, l + 1);
    r = r && consumeToken(b, SYM9300);
    exit_section_(b, m, TYPE_PARAMS, r);
    return r;
  }

  // [ node_name { SYM4400 node_name }* ]
  private static boolean type_params_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_params_1")) return false;
    type_params_1_0(b, l + 1);
    return true;
  }

  // node_name { SYM4400 node_name }*
  private static boolean type_params_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_params_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = node_name(b, l + 1);
    r = r && type_params_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { SYM4400 node_name }*
  private static boolean type_params_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_params_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_params_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_params_1_0_1", c)) break;
    }
    return true;
  }

  // SYM4400 node_name
  private static boolean type_params_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_params_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYM4400);
    r = r && node_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
