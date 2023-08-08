package com.carrefour.fid.android.presentation.p035ui.orders.offline.extension;

import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsVATDomain;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24802h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.extension.a */
public final class C24770a {
    @C12579k
    /* renamed from: a */
    public static final C24802h m107962a(@C12579k OrdersOfflineDetailsVATDomain ordersOfflineDetailsVATDomain) {
        Intrinsics.checkNotNullParameter(ordersOfflineDetailsVATDomain, "<this>");
        return new C24802h(ordersOfflineDetailsVATDomain.getPercentage(), ordersOfflineDetailsVATDomain.getAmount(), ordersOfflineDetailsVATDomain.getAmountWithTax());
    }
}
