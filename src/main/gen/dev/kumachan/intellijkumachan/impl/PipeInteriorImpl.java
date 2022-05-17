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

public class PipeInteriorImpl extends ASTWrapperPsiElement implements PipeInterior {

  public PipeInteriorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitPipeInterior(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RefBase getRefBase() {
    return findNotNullChildByClass(RefBase.class);
  }

  @Override
  @NotNull
  public PsiElement getSym4000() {
    return findNotNullChildByType(SYM4000);
  }

  @Override
  @NotNull
  public PsiElement getSym4100() {
    return findNotNullChildByType(SYM4100);
  }

  @Override
  @NotNull
  public PsiElement getSym4600() {
    return findNotNullChildByType(SYM4600);
  }

}
