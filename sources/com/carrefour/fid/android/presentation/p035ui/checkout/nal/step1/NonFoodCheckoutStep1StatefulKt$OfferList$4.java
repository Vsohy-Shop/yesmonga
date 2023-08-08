package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.C38478n;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$OfferList$4 */
public final class NonFoodCheckoutStep1StatefulKt$OfferList$4 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C23520c, C11079d2> $actioner;
    final /* synthetic */ OfferProductModel $offerProduct;
    final /* synthetic */ ProductModel $product;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$OfferList$4(C11300l<? super C23520c, C11079d2> lVar, OfferProductModel offerProductModel, ProductModel productModel) {
        super(0);
        this.$actioner = lVar;
        this.$offerProduct = offerProductModel;
        this.$product = productModel;
    }

    public final void invoke() {
        C11300l<C23520c, C11079d2> lVar = this.$actioner;
        int p0 = this.$offerProduct.mo121519p0();
        Integer h0 = this.$offerProduct.mo121510h0();
        int intValue = h0 != null ? h0.intValue() : 0;
        Integer f0 = this.$offerProduct.mo121508f0();
        int intValue2 = f0 != null ? f0.intValue() : this.$offerProduct.mo121519p0();
        Integer X = this.$offerProduct.mo121503X();
        lVar.invoke(new C23520c.C23533f.C23534a(p0, intValue2, intValue, X != null ? X.intValue() : 1, C38478n.m159655a(this.$product)));
    }
}
