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

public class CallUnorderedImpl extends ASTWrapperPsiElement implements CallUnordered {

  public CallUnorderedImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitCallUnordered(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ArgMapping> getArgMappingList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ArgMapping.class);
  }

  @Override
  @NotNull
  public PsiElement getSym12300() {
    return findNotNullChildByType(SYM12300);
  }

  @Override
  @NotNull
  public PsiElement getSym12500() {
    return findNotNullChildByType(SYM12500);
  }

}
