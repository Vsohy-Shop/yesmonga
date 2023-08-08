package com.carrefour.fid.android.presentation.p035ui.orders.online.extension;

import android.content.Context;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.joda.time.DateTime;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.extension.a */
public final class C25196a {
    /* renamed from: a */
    public static final int m108884a(@C12579k OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsHeaderModel, "<this>");
        OrderStatus g = ordersOnlineDetailsHeaderModel.mo73380g();
        boolean z4 = true;
        if (Intrinsics.areEqual((Object) g, (Object) OrderStatus.Affected.f89246e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) g, (Object) OrderStatus.AwaitingPreparation.f89250e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Validated.f89268e);
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.PreparationInProgress.f89258e);
        }
        if (!z3) {
            z4 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Prepared.f89260e);
        }
        if (z4) {
            return R.string.cancel_validate_order_message;
        }
        return -1;
    }

    /* renamed from: b */
    public static final boolean m108885b(@C12579k OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsHeaderModel, "<this>");
        OrderStatus g = ordersOnlineDetailsHeaderModel.mo73380g();
        if (Intrinsics.areEqual((Object) g, (Object) OrderStatus.Closed.f89254e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Delivered.f89256e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.ReadyToPick.f89262e);
        }
        if (!z2 || ordersOnlineDetailsHeaderModel.mo73360T().length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m108886c(@C12579k OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel) {
        boolean z;
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsHeaderModel, "<this>");
        if (Intrinsics.areEqual((Object) ordersOnlineDetailsHeaderModel.mo73378f(), (Object) OrderType.R2h.f70292e) || Intrinsics.areEqual((Object) ordersOnlineDetailsHeaderModel.mo73378f(), (Object) OrderType.DriveExpressPickup.f70284e)) {
            return false;
        }
        if (Intrinsics.areEqual((Object) ordersOnlineDetailsHeaderModel.mo73378f(), (Object) OrderType.Drive.f70282e) && ordersOnlineDetailsHeaderModel.mo73388j0()) {
            return false;
        }
        OrderStatus g = ordersOnlineDetailsHeaderModel.mo73380g();
        boolean z2 = true;
        if (g instanceof OrderStatus.Closed) {
            z = true;
        } else {
            z = g instanceof OrderStatus.Delivered;
        }
        if (!z) {
            z2 = g instanceof OrderStatus.ReadyToPick;
        }
        if (z2) {
            return DateTime.m51195N2(ordersOnlineDetailsHeaderModel.mo73372d()).mo27726S2(30).mo28754o0();
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m108887d(@C12579k OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsHeaderModel, "<this>");
        OrderStatus g = ordersOnlineDetailsHeaderModel.mo73380g();
        boolean z5 = true;
        if (g instanceof OrderStatus.Affected) {
            z = true;
        } else {
            z = g instanceof OrderStatus.AwaitingPreparation;
        }
        if (z) {
            z2 = true;
        } else {
            z2 = g instanceof OrderStatus.Prepared;
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = g instanceof OrderStatus.PreparationInProgress;
        }
        if (z3) {
            z4 = true;
        } else {
            z4 = g instanceof OrderStatus.ReadyToPick;
        }
        if (!z4) {
            z5 = g instanceof OrderStatus.Validated;
        }
        if (z5) {
            return ordersOnlineDetailsHeaderModel.mo73378f() instanceof OrderType.DriveExpressPickup;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m108888e(@C12579k OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsHeaderModel, "<this>");
        OrderStatus g = ordersOnlineDetailsHeaderModel.mo73380g();
        boolean z4 = true;
        if (Intrinsics.areEqual((Object) g, (Object) OrderStatus.Affected.f89246e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) g, (Object) OrderStatus.AwaitingPreparation.f89250e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.PreparationInProgress.f89258e);
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Prepared.f89260e);
        }
        if (!z3) {
            z4 = Intrinsics.areEqual((Object) g, (Object) OrderStatus.Validated.f89268e);
        }
        if (z4) {
            return ordersOnlineDetailsHeaderModel.mo73378f() instanceof OrderType.C28690b;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public static final String m108889f(@C12579k OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel, @C12579k Context context) {
        int i;
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsHeaderModel, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (C11622t.equals(ordersOnlineDetailsHeaderModel.mo73368a0(), "drive", true)) {
            i = R.string.order_online_pickup_express_info_drive;
        } else {
            i = R.string.order_online_express_info_reception;
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n    i…ss_info_reception\n    }\n)");
        return string;
    }
}
