package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStatefulKt$ReinsuranceScreen$2 */
public final class ReinsuranceStatefulKt$ReinsuranceScreen$2 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27900p, C11079d2> $actioner;
    final /* synthetic */ ReinsuranceType $reinsuranceType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReinsuranceStatefulKt$ReinsuranceScreen$2(C11300l<? super C27900p, C11079d2> lVar, ReinsuranceType reinsuranceType, int i) {
        super(3);
        this.$actioner = lVar;
        this.$reinsuranceType = reinsuranceType;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(i0Var, "it");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1920705704, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceScreen.<anonymous> (ReinsuranceStateful.kt:43)");
            }
            C11300l<C27900p, C11079d2> lVar = this.$actioner;
            ReinsuranceType reinsuranceType = this.$reinsuranceType;
            int i2 = this.$$dirty;
            ReinsuranceStatefulKt.m116904c(lVar, reinsuranceType, oVar, (i2 & 112) | (i2 & 14));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
