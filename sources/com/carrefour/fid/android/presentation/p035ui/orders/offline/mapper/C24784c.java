package com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsPaymentDomain;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24799e;
import com.carrefour.fid.android.shared.base.C28486g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.mapper.c */
public final class C24784c extends C28486g<OrdersOfflineDetailsPaymentDomain, C24799e> {

    /* renamed from: b */
    public static final int f61477b = 0;

    @C12579k
    /* renamed from: d */
    public C24799e mo72340a(@C12579k OrdersOfflineDetailsPaymentDomain ordersOfflineDetailsPaymentDomain) {
        Intrinsics.checkNotNullParameter(ordersOfflineDetailsPaymentDomain, "entity");
        return new C24799e(3, ordersOfflineDetailsPaymentDomain.getPaymentCode(), ordersOfflineDetailsPaymentDomain.getPaymentName(), ordersOfflineDetailsPaymentDomain.getPaymentAmount());
    }
}
