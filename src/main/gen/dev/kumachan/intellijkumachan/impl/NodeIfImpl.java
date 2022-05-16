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

public class NodeIfImpl extends ASTWrapperPsiElement implements NodeIf {

  public NodeIfImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitNodeIf(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Cond> getCondList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cond.class);
  }

  @Override
  @NotNull
  public List<Elif> getElifList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Elif.class);
  }

  @Override
  @NotNull
  public IfNo getIfNo() {
    return findNotNullChildByClass(IfNo.class);
  }

  @Override
  @NotNull
  public IfYes getIfYes() {
    return findNotNullChildByClass(IfYes.class);
  }

  @Override
  @NotNull
  public PsiElement getElse() {
    return findNotNullChildByType(ELSE);
  }

  @Override
  @NotNull
  public PsiElement getIf() {
    return findNotNullChildByType(IF);
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

}