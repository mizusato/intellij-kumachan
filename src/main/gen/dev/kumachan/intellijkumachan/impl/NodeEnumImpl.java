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

public class NodeEnumImpl extends ASTWrapperPsiElement implements NodeEnum {

  public NodeEnumImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitNodeEnum(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<EnumItem> getEnumItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, EnumItem.class);
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

}
