package androidx.compose.material3;

import androidx.compose.material3.tokens.C8299e0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ListItemKt$ListItem$decoratedHeadlineContent$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8187d1 $colors;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $headlineContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$decoratedHeadlineContent$1(C8187d1 d1Var, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        super(2);
        this.$colors = d1Var;
        this.$$dirty = i;
        this.$headlineContent = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-403249643, i, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:84)");
            }
            ListItemKt.m25854d(this.$colors.mo12527b(true, oVar, ((this.$$dirty >> 15) & 112) | 6).getValue().mo42833M(), C8299e0.f21005a.mo13454u(), this.$headlineContent, oVar, ((this.$$dirty << 6) & 896) | 48);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
