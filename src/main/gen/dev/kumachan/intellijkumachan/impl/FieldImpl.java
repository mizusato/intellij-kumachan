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

public class FieldImpl extends ASTWrapperPsiElement implements Field {

  public FieldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitField(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Docs getDocs() {
    return findChildByClass(Docs.class);
  }

  @Override
  @Nullable
  public FieldDefault getFieldDefault() {
    return findChildByClass(FieldDefault.class);
  }

  @Override
  @NotNull
  public NodeName getNodeName() {
    return findNotNullChildByClass(NodeName.class);
  }

  @Override
  @NotNull
  public NodeType getNodeType() {
    return findNotNullChildByClass(NodeType.class);
  }

}
