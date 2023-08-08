package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.NalLabelComponentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$OfferList$2 */
public final class NonFoodCheckoutStep1StatefulKt$OfferList$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ OfferProductModel $offerProduct;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$OfferList$2(OfferProductModel offerProductModel) {
        super(2);
        this.$offerProduct = offerProductModel;
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
                ComposerKt.m29845w0(-1071136517, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.OfferList.<anonymous> (NonFoodCheckoutStep1Stateful.kt:426)");
            }
            NalLabelComponentKt.m104767a(this.$offerProduct, oVar, 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
