package com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.OrdersOfflineDomain;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24803i;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.OrderDetailParam;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.mapper.g */
public final class C24790g extends C28486g<OrdersOfflineDomain, C24803i> {

    /* renamed from: c */
    public static final int f61481c = 8;
    @C12579k

    /* renamed from: b */
    public final Context f61482b;

    @Inject
    public C24790g(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f61482b = context;
    }

    @C12579k
    /* renamed from: d */
    public C24803i mo72340a(@C12579k OrdersOfflineDomain ordersOfflineDomain) {
        Intrinsics.checkNotNullParameter(ordersOfflineDomain, "entity");
        String facilityName = ordersOfflineDomain.getFacilityName();
        String facilityAddress = ordersOfflineDomain.getFacilityAddress();
        if (facilityAddress == null) {
            facilityAddress = "";
        }
        String str = facilityAddress;
        String b = C28782t.m119105b(Double.valueOf(ordersOfflineDomain.getOrderAmount()));
        String s = StringKt.m118939s(ordersOfflineDomain.getOrderDate());
        String gln = ordersOfflineDomain.getGln();
        String orderKey = ordersOfflineDomain.getOrderKey();
        String orderDate = ordersOfflineDomain.getOrderDate();
        String string = this.f61482b.getString(R.string.order_detail_command_download_receipt);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…command_download_receipt)");
        return new C24803i(facilityName, str, b, s, new OrderDetailParam(gln, orderKey, orderDate, "details-commande", string));
    }
}
