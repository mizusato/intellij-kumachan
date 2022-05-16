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

public class NodeWhenImpl extends ASTWrapperPsiElement implements NodeWhen {

  public NodeWhenImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitNodeWhen(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Case> getCaseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Case.class);
  }

  @Override
  @NotNull
  public Expr getExpr() {
    return findNotNullChildByClass(Expr.class);
  }

  @Override
  @NotNull
  public PsiElement getSym0() {
    return findNotNullChildByType(SYM0);
  }

  @Override
  @NotNull
  public PsiElement getSym1() {
    return findNotNullChildByType(SYM1);
  }

  @Override
  @NotNull
  public PsiElement getSym4() {
    return findNotNullChildByType(SYM4);
  }

  @Override
  @NotNull
  public PsiElement getSym5() {
    return findNotNullChildByType(SYM5);
  }

  @Override
  @NotNull
  public PsiElement getWhen() {
    return findNotNullChildByType(WHEN);
  }

}