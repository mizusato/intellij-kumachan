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

public class PipeImpl extends ASTWrapperPsiElement implements Pipe {

  public PipeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitPipe(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PipeCall getPipeCall() {
    return findChildByClass(PipeCall.class);
  }

  @Override
  @Nullable
  public PipeCast getPipeCast() {
    return findChildByClass(PipeCast.class);
  }

  @Override
  @Nullable
  public PipeGet getPipeGet() {
    return findChildByClass(PipeGet.class);
  }

  @Override
  @Nullable
  public PipeInfix getPipeInfix() {
    return findChildByClass(PipeInfix.class);
  }

  @Override
  @Nullable
  public PipeInterior getPipeInterior() {
    return findChildByClass(PipeInterior.class);
  }

}
