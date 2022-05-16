package dev.kumachan.intellijkumachan;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.model.Symbol;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class CodeAnnotator implements Annotator {
    private void highlight(AnnotationHolder h, TextRange r, TextAttributesKey k) {
        h.newSilentAnnotation(HighlightSeverity.INFORMATION).
            range(r).
            textAttributes(k).
            create();
    }
    private void highlightRefBase(AnnotationHolder h, Ref r, TextAttributesKey k) {
        highlight(h, r.getRefBase().getTextRange(), k);
    }
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder h) {
        if (element instanceof BindingCps) {
            BindingCps el = ((BindingCps) element);
            highlightRefBase(h, el.getRef(), Highlighter.KEYWORD);
        } else if (element instanceof Expr) {
            Expr el = ((Expr) element);
            RefTerm ref_term = el.getTerm().getRefTerm();
            if (ref_term != null) {
                boolean is_new = (ref_term.getNodeNew() != null);
                Ref ref = ref_term.getRef();
                List<Pipe> pipes = el.getPipeList();
                if (pipes.size() > 0) {
                    Pipe pipe0 = pipes.get(0);
                    if (pipe0.getPipeCall() != null) {
                        // TODO: if (is_new) { ... }
                        highlightRefBase(h, ref, Highlighter.CALLEE);
                    }
                }
            }
        } else if (element instanceof PipeInfix) {
            PipeInfix el = ((PipeInfix) element);
            highlightRefBase(h, el.getRef(), Highlighter.CALLEE);
        }
    }
}


