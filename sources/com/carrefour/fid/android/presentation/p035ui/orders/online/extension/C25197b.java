package com.carrefour.fid.android.presentation.p035ui.orders.online.extension;

import com.carrefour.fid.android.domain.models.OrdersOnlineDetailsProductPriceDomain;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.extension.b */
public final class C25197b {
    @C12579k
    /* renamed from: a */
    public static final String m108890a(@C12579k OrdersOnlineDetailsProductPriceDomain ordersOnlineDetailsProductPriceDomain) {
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsProductPriceDomain, "<this>");
        if (ordersOnlineDetailsProductPriceDomain.mo116377e() > 0.0d) {
            return C28782t.m119105b(Double.valueOf(ordersOnlineDetailsProductPriceDomain.mo116377e()));
        }
        return C28782t.m119105b(Double.valueOf(ordersOnlineDetailsProductPriceDomain.mo116379f()));
    }
}
