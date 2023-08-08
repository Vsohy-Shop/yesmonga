package com.carrefour.fid.android.presentation.viewmodels.order.refont.mapper;

import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.domain.models.OrdersOnlineDomain;
import com.carrefour.fid.android.presentation.p035ui.orders.online.view.TextStatusVariant;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.joda.time.DateTime;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.mapper.b */
public final class C27072b {
    /* renamed from: a */
    public static final boolean m114415a(OrdersOnlineDomain ordersOnlineDomain) {
        if (!Intrinsics.areEqual((Object) ordersOnlineDomain.getOrderStatus(), (Object) OrderStatus.Shipped.f89264e) && !Intrinsics.areEqual((Object) ordersOnlineDomain.getOrderStatus(), (Object) OrderStatus.Arrived.f89248e)) {
            return false;
        }
        return ordersOnlineDomain.getTrackingUrl().length() > 0;
    }

    /* renamed from: b */
    public static final int m114416b(@C12579k OrdersOnlineDomain ordersOnlineDomain) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(ordersOnlineDomain, "<this>");
        OrderStatus orderStatus = ordersOnlineDomain.getOrderStatus();
        boolean z5 = true;
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Cancelled.f89252e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Closed.f89254e);
        }
        if (z) {
            return 0;
        }
        OrderType orderType = ordersOnlineDomain.getOrderType();
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Drive.f70282e)) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) orderType, (Object) OrderType.DriveExpressPickup.f70284e);
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = Intrinsics.areEqual((Object) orderType, (Object) OrderType.R2h.f70292e);
        }
        if (z3) {
            return 2;
        }
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Clcv.f70280e)) {
            z4 = true;
        } else {
            z4 = Intrinsics.areEqual((Object) orderType, (Object) OrderType.Lad.f70288e);
        }
        if (!z4) {
            z5 = Intrinsics.areEqual((Object) orderType, (Object) OrderType.H1h3.f70286e);
        }
        if (z5) {
            return 3;
        }
        return 0;
    }

    @C12579k
    /* renamed from: c */
    public static final List<SelfCareType> m114417c(@C12579k OrdersOnlineDomain ordersOnlineDomain) {
        Intrinsics.checkNotNullParameter(ordersOnlineDomain, "<this>");
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.areEqual((Object) ordersOnlineDomain.getOrderType(), (Object) OrderType.Lad.f70288e)) {
            if (Intrinsics.areEqual((Object) ordersOnlineDomain.getOrderStatus(), (Object) OrderStatus.Delivered.f89256e)) {
                arrayList.add(SelfCareType.ASK_REFUND);
            }
            if (m114415a(ordersOnlineDomain)) {
                arrayList.add(SelfCareType.FOLLOW_COMMAND);
            }
            if (Intrinsics.areEqual((Object) ordersOnlineDomain.getOrderStatus(), (Object) OrderStatus.Validated.f89268e) || Intrinsics.areEqual((Object) ordersOnlineDomain.getOrderStatus(), (Object) OrderStatus.Affected.f89246e) || Intrinsics.areEqual((Object) ordersOnlineDomain.getOrderStatus(), (Object) OrderStatus.AwaitingPreparation.f89250e)) {
                arrayList.add(SelfCareType.CANCEL_ORDER);
            }
        } else {
            if (!Intrinsics.areEqual((Object) ordersOnlineDomain.getOrderType(), (Object) OrderType.R2h.f70292e)) {
                arrayList.add(SelfCareType.RE_ORDER);
            }
            if (ordersOnlineDomain.getAdditionalOrderEligible() && ordersOnlineDomain.getAdditionalOrderId() == null) {
                arrayList.add(SelfCareType.ADD_FORGOTTEN_PRODUCTS);
            }
            if (m114421g(ordersOnlineDomain)) {
                arrayList.add(SelfCareType.ASK_REFUND);
            }
            if (ordersOnlineDomain.getCanPostponeOrder()) {
                arrayList.add(SelfCareType.CHANGE_SLOT);
            }
            if (ordersOnlineDomain.getCanCancelOrder()) {
                arrayList.add(SelfCareType.CANCEL_ORDER);
            }
            if (m114422h(ordersOnlineDomain)) {
                arrayList.add(SelfCareType.WITHDRAWAL_VOUCHER);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final int m114418d(@C12579k OrdersOnlineDomain ordersOnlineDomain) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(ordersOnlineDomain, "<this>");
        if (m114416b(ordersOnlineDomain) == 0) {
            return 0;
        }
        OrderStatus orderStatus = ordersOnlineDomain.getOrderStatus();
        boolean z4 = true;
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Affected.f89246e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Validated.f89268e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.AwaitingPreparation.f89250e);
        }
        if (z2) {
            return 0;
        }
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.PreparationInProgress.f89258e)) {
            z3 = true;
        } else {
            z3 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Prepared.f89260e);
        }
        if (z3) {
            return 1;
        }
        if (!Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Shipped.f89264e)) {
            z4 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.ReadyToPick.f89262e);
        }
        if (z4) {
            return 2;
        }
        return 3;
    }

    /* renamed from: e */
    public static final int m114419e(@C12579k OrdersOnlineDomain ordersOnlineDomain) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(ordersOnlineDomain, "<this>");
        OrderStatus orderStatus = ordersOnlineDomain.getOrderStatus();
        boolean z5 = true;
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Validated.f89268e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Affected.f89246e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.AwaitingPreparation.f89250e);
        }
        if (z2) {
            return R.string.order_txt_order_status_validee;
        }
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.PreparationInProgress.f89258e)) {
            z3 = true;
        } else {
            z3 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Prepared.f89260e);
        }
        if (z3) {
            return R.string.order_txt_order_status_cours_prep;
        }
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Shipped.f89264e)) {
            return R.string.order_txt_order_status_expediee;
        }
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.ReadyToPick.f89262e)) {
            return R.string.order_txt_order_status_prete_retiree;
        }
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Delivered.f89256e)) {
            return R.string.order_txt_order_status_livree;
        }
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Arrived.f89248e)) {
            return R.string.order_txt_order_status_arrived;
        }
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Cancelled.f89252e)) {
            return R.string.order_txt_order_status_annulee;
        }
        if (!Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Closed.f89254e)) {
            return R.string.order_txt_order_unavalable_title;
        }
        OrderType orderType = ordersOnlineDomain.getOrderType();
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Drive.f70282e)) {
            z4 = true;
        } else {
            z4 = Intrinsics.areEqual((Object) orderType, (Object) OrderType.DriveExpressPickup.f70284e);
        }
        if (!z4) {
            z5 = Intrinsics.areEqual((Object) orderType, (Object) OrderType.R2h.f70292e);
        }
        if (z5) {
            return R.string.order_txt_order_status_retiree;
        }
        return R.string.order_txt_order_status_facturee;
    }

    @C12579k
    /* renamed from: f */
    public static final TextStatusVariant m114420f(@C12579k OrdersOnlineDomain ordersOnlineDomain) {
        Intrinsics.checkNotNullParameter(ordersOnlineDomain, "<this>");
        OrderStatus orderStatus = ordersOnlineDomain.getOrderStatus();
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Cancelled.f89252e)) {
            return TextStatusVariant.Red;
        }
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Closed.f89254e)) {
            return TextStatusVariant.GreenWithIcon;
        }
        return TextStatusVariant.Green;
    }

    /* renamed from: g */
    public static final boolean m114421g(OrdersOnlineDomain ordersOnlineDomain) {
        boolean z;
        if (Intrinsics.areEqual((Object) ordersOnlineDomain.getOrderType(), (Object) OrderType.R2h.f70292e) || Intrinsics.areEqual((Object) ordersOnlineDomain.getOrderType(), (Object) OrderType.DriveExpressPickup.f70284e)) {
            return false;
        }
        if (Intrinsics.areEqual((Object) ordersOnlineDomain.getOrderType(), (Object) OrderType.Drive.f70282e) && ordersOnlineDomain.isInstorePayment()) {
            return false;
        }
        OrderStatus orderStatus = ordersOnlineDomain.getOrderStatus();
        boolean z2 = true;
        if (orderStatus instanceof OrderStatus.Closed) {
            z = true;
        } else {
            z = orderStatus instanceof OrderStatus.Delivered;
        }
        if (!z) {
            z2 = orderStatus instanceof OrderStatus.ReadyToPick;
        }
        if (z2) {
            return DateTime.m51195N2(ordersOnlineDomain.getOrderCreationDateTime()).mo27726S2(30).mo28754o0();
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m114422h(OrdersOnlineDomain ordersOnlineDomain) {
        boolean z;
        boolean z2;
        boolean z3;
        OrderStatus orderStatus = ordersOnlineDomain.getOrderStatus();
        boolean z4 = true;
        if (Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Affected.f89246e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.AwaitingPreparation.f89250e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.PreparationInProgress.f89258e);
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Prepared.f89260e);
        }
        if (!z3) {
            z4 = Intrinsics.areEqual((Object) orderStatus, (Object) OrderStatus.Validated.f89268e);
        }
        if (z4) {
            return ordersOnlineDomain.getOrderType() instanceof OrderType.C28690b;
        }
        return false;
    }
}
