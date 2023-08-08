package com.carrefour.fid.android.basket.data.api.extension;

import com.carrefour.fid.android.basket.data.api.entities.p022v4.request.YieldFeesAmountRequest;
import com.carrefour.fid.android.shared.extension.C28746b0;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Double.kt\ncom/carrefour/fid/android/basket/data/api/extension/DoubleKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
/* renamed from: com.carrefour.fid.android.basket.data.api.extension.a */
public final class C13878a {
    @C12580l
    /* renamed from: a */
    public static final YieldFeesAmountRequest m58879a(@C12580l Double d) {
        boolean z;
        if (d == null || d.doubleValue() > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d = null;
        }
        if (d != null) {
            return new YieldFeesAmountRequest(C28746b0.m119035f(Double.valueOf(d.doubleValue() * ((double) 100)), 0, 1, (Object) null), 2, "EUR");
        }
        return null;
    }
}
