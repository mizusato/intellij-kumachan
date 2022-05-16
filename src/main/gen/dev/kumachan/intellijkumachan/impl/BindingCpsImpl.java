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

public class BindingCpsImpl extends ASTWrapperPsiElement implements BindingCps {

  public BindingCpsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitBindingCps(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CpsPattern getCpsPattern() {
    return findChildByClass(CpsPattern.class);
  }

  @Override
  @NotNull
  public Expr getExpr() {
    return findNotNullChildByClass(Expr.class);
  }

  @Override
  @NotNull
  public Ref getRef() {
    return findNotNullChildByClass(Ref.class);
  }

  @Override
  @NotNull
  public PsiElement getSym13() {
    return findNotNullChildByType(SYM13);
  }

  @Override
  @NotNull
  public PsiElement getSym9() {
    return findNotNullChildByType(SYM9);
  }

}
