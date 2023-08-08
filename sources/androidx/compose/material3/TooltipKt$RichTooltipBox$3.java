package androidx.compose.material3;

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
public final class TooltipKt$RichTooltipBox$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $action;
    final /* synthetic */ C8183c2 $colors;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipKt$RichTooltipBox$3(C8183c2 c2Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, int i) {
        super(2);
        this.$colors = c2Var;
        this.$text = pVar;
        this.$title = pVar2;
        this.$action = pVar3;
        this.$$dirty = i;
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
                ComposerKt.m29845w0(1423372873, i, -1, "androidx.compose.material3.RichTooltipBox.<anonymous> (Tooltip.kt:167)");
            }
            C8183c2 c2Var = this.$colors;
            C11304p<C8592o, Integer, C11079d2> pVar = this.$text;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$title;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$action;
            int i2 = this.$$dirty;
            TooltipKt.m26857d(c2Var, pVar, pVar2, pVar3, oVar, ((i2 >> 18) & 14) | ((i2 << 3) & 112) | ((i2 >> 3) & 896) | ((i2 >> 3) & 7168));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
