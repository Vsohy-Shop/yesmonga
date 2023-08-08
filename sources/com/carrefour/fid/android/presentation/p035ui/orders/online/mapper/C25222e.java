package com.carrefour.fid.android.presentation.p035ui.orders.online.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.domain.models.OrdersOnlineDomain;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.mapper.e */
public final class C25222e extends C28486g<OrdersOnlineDomain, OrdersOnlineItemModel> {

    /* renamed from: b */
    public static final int f62109b = 0;

    @C12579k
    /* renamed from: d */
    public OrdersOnlineItemModel mo72340a(@C12579k OrdersOnlineDomain ordersOnlineDomain) {
        double d;
        Intrinsics.checkNotNullParameter(ordersOnlineDomain, "entity");
        boolean additionalOrderEligible = ordersOnlineDomain.getAdditionalOrderEligible();
        Long additionalOrderId = ordersOnlineDomain.getAdditionalOrderId();
        int viewType = ordersOnlineDomain.getViewType();
        String orderCreationDateTime = ordersOnlineDomain.getOrderCreationDateTime();
        String orderId = ordersOnlineDomain.getOrderId();
        OrderStatus orderStatus = ordersOnlineDomain.getOrderStatus();
        if (orderStatus == null) {
            orderStatus = OrderStatus.Unknown.f89266e;
        }
        OrderStatus orderStatus2 = orderStatus;
        OrderType orderType = ordersOnlineDomain.getOrderType();
        if (orderType == null) {
            orderType = OrderType.Unknown.f70294e;
        }
        OrderType orderType2 = orderType;
        Double orderPreparedAmount = ordersOnlineDomain.getOrderPreparedAmount();
        if (orderPreparedAmount == null && (orderPreparedAmount = ordersOnlineDomain.getOrderAmount()) == null) {
            d = 0.0d;
        } else {
            d = orderPreparedAmount.doubleValue();
        }
        return new OrdersOnlineItemModel(additionalOrderEligible, additionalOrderId, orderCreationDateTime, orderType2, orderStatus2, (String) null, viewType, orderId, d, ordersOnlineDomain.getSlotId(), ordersOnlineDomain.getSlotBeginDate(), ordersOnlineDomain.getSlotEndDate(), ordersOnlineDomain.getSlotCutOff(), ordersOnlineDomain.getRedirectionUrl(), 32, (DefaultConstructorMarker) null);
    }
}
