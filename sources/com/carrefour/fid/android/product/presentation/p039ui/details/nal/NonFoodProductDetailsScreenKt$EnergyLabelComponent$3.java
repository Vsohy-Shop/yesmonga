package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$EnergyLabelComponent$3 */
public final class NonFoodProductDetailsScreenKt$EnergyLabelComponent$3 extends Lambda implements C11305q<C2373k, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $energyLabel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$EnergyLabelComponent$3(String str, int i) {
        super(3);
        this.$energyLabel = str;
        this.$$dirty = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo80847a(@C12579k C2373k kVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(kVar, "$this$HorizontalBlockComponent");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(7517120, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.EnergyLabelComponent.<anonymous> (NonFoodProductDetailsScreen.kt:828)");
            }
            EnergyLabelKt.m117184b(this.$energyLabel, oVar, this.$$dirty & 14);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo80847a((C2373k) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
