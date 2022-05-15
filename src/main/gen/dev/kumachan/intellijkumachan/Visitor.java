// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class Visitor extends PsiElementVisitor {

  public void visitA(@NotNull A o) {
    visitPsiElement(o);
  }

  public void visitB(@NotNull B o) {
    visitPsiElement(o);
  }

  public void visitStmt(@NotNull Stmt o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
