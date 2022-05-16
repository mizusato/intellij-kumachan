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

public class StmtImpl extends ASTWrapperPsiElement implements Stmt {

  public StmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DeclConst getDeclConst() {
    return findChildByClass(DeclConst.class);
  }

  @Override
  @Nullable
  public DeclEntry getDeclEntry() {
    return findChildByClass(DeclEntry.class);
  }

  @Override
  @Nullable
  public DeclFunc getDeclFunc() {
    return findChildByClass(DeclFunc.class);
  }

  @Override
  @Nullable
  public DeclMethod getDeclMethod() {
    return findChildByClass(DeclMethod.class);
  }

  @Override
  @Nullable
  public DeclType getDeclType() {
    return findChildByClass(DeclType.class);
  }

}
