package com.carrefour.fid.android.design.components.compose.label;

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
public final class LabelComponentKt$LabelLarge$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $imageRes;
    final /* synthetic */ long $imageTint;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelComponentKt$LabelLarge$1(long j, int i, int i2) {
        super(2);
        this.$imageTint = j;
        this.$imageRes = i;
        this.$$dirty = i2;
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
                ComposerKt.m29845w0(235187414, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelLarge.<anonymous> (LabelComponent.kt:74)");
            }
            long j = this.$imageTint;
            int i2 = this.$imageRes;
            int i3 = this.$$dirty;
            BaseLabelComponentKt.m151755f(j, i2, oVar, ((i3 >> 6) & 112) | ((i3 >> 6) & 14));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
