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

public class TypeDefImpl extends ASTWrapperPsiElement implements TypeDef {

  public TypeDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitTypeDef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NativeTypeDef getNativeTypeDef() {
    return findChildByClass(NativeTypeDef.class);
  }

  @Override
  @Nullable
  public NodeEnum getNodeEnum() {
    return findChildByClass(NodeEnum.class);
  }

  @Override
  @Nullable
  public NodeInterface getNodeInterface() {
    return findChildByClass(NodeInterface.class);
  }

  @Override
  @Nullable
  public NodeRecord getNodeRecord() {
    return findChildByClass(NodeRecord.class);
  }

  @Override
  @Nullable
  public NodeUnion getNodeUnion() {
    return findChildByClass(NodeUnion.class);
  }

}
