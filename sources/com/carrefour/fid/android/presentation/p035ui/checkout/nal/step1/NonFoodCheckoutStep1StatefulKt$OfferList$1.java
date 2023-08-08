package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.NalPriceComponentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$OfferList$1 */
public final class NonFoodCheckoutStep1StatefulKt$OfferList$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ OfferProductModel $offerProduct;
    final /* synthetic */ ProductModel $product;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$OfferList$1(OfferProductModel offerProductModel, ProductModel productModel) {
        super(2);
        this.$offerProduct = offerProductModel;
        this.$product = productModel;
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
                ComposerKt.m29845w0(-655809700, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.OfferList.<anonymous> (NonFoodCheckoutStep1Stateful.kt:416)");
            }
            OfferDiscountDomain w = this.$offerProduct.mo121523w();
            Double d = null;
            OfferDiscountType z = w != null ? w.mo115961z() : null;
            Double j0 = this.$offerProduct.mo121741j0();
            OfferPriceDomain m0 = this.$offerProduct.mo121514m0();
            if (m0 != null) {
                d = m0.mo116007l();
            }
            NalPriceComponentKt.m104768a(z, j0, d, this.$product.mo121868B(), !OfferProductModelKt.m159554C(this.$offerProduct), this.$offerProduct.mo121519p0(), oVar, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
