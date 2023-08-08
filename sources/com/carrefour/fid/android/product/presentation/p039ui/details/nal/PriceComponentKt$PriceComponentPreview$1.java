package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.product.presentation.models.OfferAvailability;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.PriceComponentKt$PriceComponentPreview$1 */
public final class PriceComponentKt$PriceComponentPreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ Discount $discount;
    final /* synthetic */ Prices $prices;
    final /* synthetic */ String $taxeMessage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PriceComponentKt$PriceComponentPreview$1(Prices prices, Discount discount, String str) {
        super(2);
        this.$prices = prices;
        this.$discount = discount;
        this.$taxeMessage = str;
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
                ComposerKt.m29845w0(-373272459, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.PriceComponentPreview.<anonymous> (PriceComponent.kt:139)");
            }
            PriceComponentKt.m116894a(this.$prices, this.$discount, this.$taxeMessage, OfferAvailability.Available, (C8767m) null, oVar, 3528, 16);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
