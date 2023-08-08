package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$2 */
public final class NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$2 extends Lambda implements C11304p<Integer, OfferProductModel, Object> {

    /* renamed from: f */
    public static final NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$2 f59429f = new NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$2();

    public NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$2() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final Object mo68878a(int i, @C12579k OfferProductModel offerProductModel) {
        String str;
        Intrinsics.checkNotNullParameter(offerProductModel, "item");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W != null) {
            str = W.mo115986f();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        Double j0 = offerProductModel.mo121741j0();
        return i + C32920e.f79928l + str + C32920e.f79928l + j0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo68878a(((Number) obj).intValue(), (OfferProductModel) obj2);
    }
}
