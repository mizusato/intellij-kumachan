// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.kumachan.intellijkumachan.Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.kumachan.intellijkumachan.*;

public class ExprImpl extends ASTWrapperPsiElement implements Expr {

  public ExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Cast> getCastList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cast.class);
  }

  @Override
  @NotNull
  public List<Pipe> getPipeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Pipe.class);
  }

  @Override
  @NotNull
  public Term getTerm() {
    return findNotNullChildByClass(Term.class);
  }

}
