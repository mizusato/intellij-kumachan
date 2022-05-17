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

public class TypeParamsImpl extends ASTWrapperPsiElement implements TypeParams {

  public TypeParamsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitTypeParams(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NodeName> getNodeNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NodeName.class);
  }

  @Override
  @NotNull
  public PsiElement getSym9100() {
    return findNotNullChildByType(SYM9100);
  }

  @Override
  @NotNull
  public PsiElement getSym9300() {
    return findNotNullChildByType(SYM9300);
  }

}
