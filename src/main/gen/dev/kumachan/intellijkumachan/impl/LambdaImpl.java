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

public class LambdaImpl extends ASTWrapperPsiElement implements Lambda {

  public LambdaImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitLambda(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public Expr getExpr() {
    return findNotNullChildByClass(Expr.class);
  }

  @Override
  @Nullable
  public LambdaSelf getLambdaSelf() {
    return findChildByClass(LambdaSelf.class);
  }

  @Override
  @Nullable
  public Pattern getPattern() {
    return findChildByClass(Pattern.class);
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

  @Override
  @NotNull
  public PsiElement getSym61006200() {
    return findNotNullChildByType(SYM61006200);
  }

}
