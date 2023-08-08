package com.carrefour.fid.android.basket.data.api.entities.p022v4.response.extension;

import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse;
import com.carrefour.fid.android.shared.extension.C28746b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.extension.a */
public final class C13874a {
    @C12580l
    /* renamed from: a */
    public static final Double m58861a(@C12579k BasketAmountResponse basketAmountResponse) {
        int i;
        Intrinsics.checkNotNullParameter(basketAmountResponse, "<this>");
        Integer unscaledAmount = basketAmountResponse.getUnscaledAmount();
        if (unscaledAmount == null) {
            return null;
        }
        Integer scale = basketAmountResponse.getScale();
        if (scale != null) {
            i = scale.intValue();
        } else {
            i = 2;
        }
        return Double.valueOf(C28746b0.m119030a(unscaledAmount, i));
    }
}
