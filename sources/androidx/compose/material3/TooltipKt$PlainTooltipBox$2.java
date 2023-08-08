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
public final class TooltipKt$PlainTooltipBox$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $tooltip;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipKt$PlainTooltipBox$2(long j, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i) {
        super(2);
        this.$contentColor = j;
        this.$tooltip = pVar;
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
                ComposerKt.m29845w0(-785135750, i, -1, "androidx.compose.material3.PlainTooltipBox.<anonymous> (Tooltip.kt:107)");
            }
            long j = this.$contentColor;
            C11304p<C8592o, Integer, C11079d2> pVar = this.$tooltip;
            int i2 = this.$$dirty;
            TooltipKt.m26855b(j, pVar, oVar, ((i2 << 3) & 112) | ((i2 >> 15) & 14));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
