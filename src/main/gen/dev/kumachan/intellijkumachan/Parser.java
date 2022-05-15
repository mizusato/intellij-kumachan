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
    return source_file(b, l + 1);
  }

  /* ********************************************************** */
  // FOO
  public static boolean a(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "a")) return false;
    if (!nextTokenIs(b, FOO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOO);
    exit_section_(b, m, A, r);
    return r;
  }

  /* ********************************************************** */
  // BAR
  public static boolean b(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "b")) return false;
    if (!nextTokenIs(b, BAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BAR);
    exit_section_(b, m, B, r);
    return r;
  }

  /* ********************************************************** */
  // stmt*
  static boolean source_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "source_file")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "source_file", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // a | b
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    if (!nextTokenIs(b, "<stmt>", BAR, FOO)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = a(b, l + 1);
    if (!r) r = b(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
