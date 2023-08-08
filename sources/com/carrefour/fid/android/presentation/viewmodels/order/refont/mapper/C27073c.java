package com.carrefour.fid.android.presentation.viewmodels.order.refont.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.domain.models.OrdersOnlineDomain;
import com.carrefour.fid.android.presentation.p035ui.orders.online.view.OrderOnlineItemModel;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.extension.C28782t;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.mapper.c */
public final class C27073c {

    /* renamed from: a */
    public static final int f65802a = 0;

    @C12579k
    /* renamed from: a */
    public final OrdersOnlineItemModel mo78619a(@C12579k OrdersOnlineDomain ordersOnlineDomain) {
        double d;
        boolean z;
        Intrinsics.checkNotNullParameter(ordersOnlineDomain, "entity");
        boolean additionalOrderEligible = ordersOnlineDomain.getAdditionalOrderEligible();
        Long additionalOrderId = ordersOnlineDomain.getAdditionalOrderId();
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
        String slotBeginDate = ordersOnlineDomain.getSlotBeginDate();
        String slotEndDate = ordersOnlineDomain.getSlotEndDate();
        String slotCutOff = ordersOnlineDomain.getSlotCutOff();
        String redirectionUrl = ordersOnlineDomain.getRedirectionUrl();
        List<SelfCareType> c = C27072b.m114417c(ordersOnlineDomain);
        String facilityServiceId = ordersOnlineDomain.getFacilityServiceId();
        String orderId2 = ordersOnlineDomain.getOrderId();
        OrderType orderType3 = ordersOnlineDomain.getOrderType();
        if (orderType3 == null) {
            orderType3 = OrderType.Unknown.f70294e;
        }
        int a = C27071a.m114413a(orderType3);
        OrderType orderType4 = ordersOnlineDomain.getOrderType();
        if (orderType4 == null) {
            orderType4 = OrderType.Unknown.f70294e;
        }
        OrderHeaderModel orderHeaderModel = new OrderHeaderModel(a, C27071a.m114414b(orderType4), orderId2, (String) null, false, 24, (DefaultConstructorMarker) null);
        List<SelfCareType> c2 = C27072b.m114417c(ordersOnlineDomain);
        String b = C28782t.m119105b(ordersOnlineDomain.getOrderAmount());
        int d2 = C27072b.m114418d(ordersOnlineDomain);
        int b2 = C27072b.m114416b(ordersOnlineDomain);
        if (C27072b.m114416b(ordersOnlineDomain) != 0) {
            z = true;
        } else {
            z = false;
        }
        OrderOnlineItemModel orderOnlineItemModel = r20;
        OrderOnlineItemModel orderOnlineItemModel2 = new OrderOnlineItemModel(orderHeaderModel, z, d2, b2, C27072b.m114419e(ordersOnlineDomain), C27072b.m114420f(ordersOnlineDomain), c2, b);
        return new OrdersOnlineItemModel(additionalOrderEligible, additionalOrderId, orderType2, orderStatus2, (String) null, orderId, d, slotBeginDate, slotEndDate, slotCutOff, redirectionUrl, c, facilityServiceId, orderOnlineItemModel, 16, (DefaultConstructorMarker) null);
    }
}
