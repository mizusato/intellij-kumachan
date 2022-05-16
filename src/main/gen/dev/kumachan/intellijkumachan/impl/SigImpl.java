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

public class SigImpl extends ASTWrapperPsiElement implements Sig {

  public SigImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitSig(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Implicit getImplicit() {
    return findChildByClass(Implicit.class);
  }

  @Override
  @NotNull
  public Inputs getInputs() {
    return findNotNullChildByClass(Inputs.class);
  }

  @Override
  @NotNull
  public Output getOutput() {
    return findNotNullChildByClass(Output.class);
  }

  @Override
  @Nullable
  public TypeParams getTypeParams() {
    return findChildByClass(TypeParams.class);
  }

}
