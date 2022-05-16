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

public class DeclTypeImpl extends ASTWrapperPsiElement implements DeclType {

  public DeclTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitDeclType(this);
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
  public Impl getImpl() {
    return findChildByClass(Impl.class);
  }

  @Override
  @NotNull
  public NodeName getNodeName() {
    return findNotNullChildByClass(NodeName.class);
  }

  @Override
  @NotNull
  public TypeDef getTypeDef() {
    return findNotNullChildByClass(TypeDef.class);
  }

  @Override
  @Nullable
  public TypeParams getTypeParams() {
    return findChildByClass(TypeParams.class);
  }

}
