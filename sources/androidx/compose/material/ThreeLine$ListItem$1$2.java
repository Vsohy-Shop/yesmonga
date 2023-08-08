package androidx.compose.material;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ThreeLine$ListItem$1$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $overlineText;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $secondaryText;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeLine$ListItem$1$2(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3) {
        super(2);
        this.$overlineText = pVar;
        this.$$dirty = i;
        this.$text = pVar2;
        this.$secondaryText = pVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-318094245, i, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:324)");
            }
            oVar.mo14918M(-755940677);
            C11304p<C8592o, Integer, C11079d2> pVar = this.$overlineText;
            if (pVar != null) {
                pVar.invoke(oVar, Integer.valueOf((this.$$dirty >> 12) & 14));
            }
            oVar.mo15002m0();
            this.$text.invoke(oVar, Integer.valueOf((this.$$dirty >> 6) & 14));
            this.$secondaryText.invoke(oVar, Integer.valueOf((this.$$dirty >> 9) & 14));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
