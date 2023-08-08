package com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension;

import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.OfferPricePerMeasureResponse;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.extension.c */
public final class C13877c {
    @C12579k
    /* renamed from: a */
    public static final String m58878a(@C12579k OfferPricePerMeasureResponse offerPricePerMeasureResponse) {
        Double d;
        Intrinsics.checkNotNullParameter(offerPricePerMeasureResponse, "<this>");
        BasketAmountResponse pricePerUnitValue$basket_release = offerPricePerMeasureResponse.getPricePerUnitValue$basket_release();
        if (pricePerUnitValue$basket_release != null) {
            d = C13874a.m58861a(pricePerUnitValue$basket_release);
        } else {
            d = null;
        }
        String b = C28782t.m119105b(d);
        String unitMeasure$basket_release = offerPricePerMeasureResponse.getUnitMeasure$basket_release();
        return b + "/" + unitMeasure$basket_release;
    }
}
