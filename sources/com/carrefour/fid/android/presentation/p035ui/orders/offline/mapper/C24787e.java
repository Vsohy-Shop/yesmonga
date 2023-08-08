package com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsProductDomain;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24800f;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.mapper.e */
public final class C24787e extends C28486g<OrdersOfflineDetailsProductDomain, C24800f> {

    /* renamed from: b */
    public static final int f61479b = 0;

    @C12579k
    /* renamed from: d */
    public C24800f mo72340a(@C12579k OrdersOfflineDetailsProductDomain ordersOfflineDetailsProductDomain) {
        Intrinsics.checkNotNullParameter(ordersOfflineDetailsProductDomain, "entity");
        return new C24800f(1, ordersOfflineDetailsProductDomain.getProductName(), C28782t.m119105b(Double.valueOf(ordersOfflineDetailsProductDomain.getProductAmount())), C28782t.m119105b(Double.valueOf(ordersOfflineDetailsProductDomain.getProductAmountUnitPrice())), ordersOfflineDetailsProductDomain.getProductAmountImmediateDiscount(), ordersOfflineDetailsProductDomain.getWeight(), ordersOfflineDetailsProductDomain.getQuantity());
    }
}
