package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;
import p073j$.time.DayOfWeek;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.OpeningComponentKt$OpeningComponentPreview$1 */
public final class OpeningComponentKt$OpeningComponentPreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ List<C23659a> $openings;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpeningComponentKt$OpeningComponentPreview$1(List<C23659a> list) {
        super(2);
        this.$openings = list;
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
                ComposerKt.m29845w0(-812082811, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.OpeningComponentPreview.<anonymous> (OpeningComponent.kt:179)");
            }
            OpeningComponentKt.m105029a(C8767m.f23478j, "Express Chatenay-Malabry France", this.$openings, DayOfWeek.THURSDAY, (C11289a<C11079d2>) null, oVar, 3638, 16);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
