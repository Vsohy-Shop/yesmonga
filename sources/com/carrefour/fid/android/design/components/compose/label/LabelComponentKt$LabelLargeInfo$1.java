package com.carrefour.fid.android.design.components.compose.label;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLabelComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LabelComponent.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelComponentKt$LabelLargeInfo$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,451:1\n154#2:452\n*S KotlinDebug\n*F\n+ 1 LabelComponent.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelComponentKt$LabelLargeInfo$1\n*L\n154#1:452\n*E\n"})
public final class LabelComponentKt$LabelLargeInfo$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $imageRes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelComponentKt$LabelLargeInfo$1(int i, int i2) {
        super(2);
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
                ComposerKt.m29845w0(-1344753994, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelLargeInfo.<anonymous> (LabelComponent.kt:149)");
            }
            ImageKt.m8967b(C16015f.m71849d(this.$imageRes, oVar, (this.$$dirty >> 3) & 14), (String) null, SizeKt.m10121u(C8767m.f23478j, C16483g.m74435M((float) 20)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar, 440, 120);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
