package com.carrefour.fid.android.design.components.compose.label;

import androidx.compose.p004ui.C8767m;
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
public final class LabelComboLinkKt$LabelComboSmallHorizontalLink$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $color;
    final /* synthetic */ int $imageRes;
    final /* synthetic */ long $imageTint;
    final /* synthetic */ String $text;
    final /* synthetic */ long $textColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelComboLinkKt$LabelComboSmallHorizontalLink$1(long j, long j2, long j3, int i, String str, int i2) {
        super(2);
        this.$color = j;
        this.$textColor = j2;
        this.$imageTint = j3;
        this.$imageRes = i;
        this.$text = str;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(249451841, i2, -1, "com.carrefour.fid.android.design.components.compose.label.LabelComboSmallHorizontalLink.<anonymous> (LabelComboLink.kt:96)");
            }
            long j = this.$color;
            long j2 = this.$textColor;
            long j3 = this.$imageTint;
            int i3 = this.$imageRes;
            String str = this.$text;
            int i4 = this.$$dirty;
            LabelComponentKt.m151838k(j, j2, j3, i3, str, (C8767m) null, oVar, (i4 & 14) | (i4 & 112) | (i4 & 896) | ((i4 >> 3) & 7168) | ((i4 >> 6) & 57344), 32);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
