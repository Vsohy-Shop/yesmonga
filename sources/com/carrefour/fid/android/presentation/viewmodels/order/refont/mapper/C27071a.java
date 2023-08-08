package com.carrefour.fid.android.presentation.viewmodels.order.refont.mapper;

import com.carrefour.fid.android.R;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.mapper.a */
public final class C27071a {
    /* renamed from: a */
    public static final int m114413a(@C12579k OrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "<this>");
        boolean z = true;
        if (!Intrinsics.areEqual((Object) orderType, (Object) OrderType.R2h.f70292e)) {
            z = Intrinsics.areEqual((Object) orderType, (Object) OrderType.DriveExpressPickup.f70284e);
        }
        if (z) {
            return R.drawable.order_withdrawal_2h;
        }
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Clcv.f70280e)) {
            return R.drawable.order_delivery_al;
        }
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.H1h3.f70286e)) {
            return R.drawable.order_delivery_express;
        }
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Drive.f70282e)) {
            return R.drawable.order_drive;
        }
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Mktp.f70290e)) {
            return R.drawable.order_market_place;
        }
        if (!Intrinsics.areEqual((Object) orderType, (Object) OrderType.Lad.f70288e)) {
            Intrinsics.areEqual((Object) orderType, (Object) OrderType.Unknown.f70294e);
        }
        return R.drawable.order_delivery_nal;
    }

    /* renamed from: b */
    public static final int m114414b(@C12579k OrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "<this>");
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.R2h.f70292e)) {
            return R.string.order_type_r2h;
        }
        if (!Intrinsics.areEqual((Object) orderType, (Object) OrderType.DriveExpressPickup.f70284e)) {
            if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Clcv.f70280e)) {
                return R.string.order_type_clcv;
            }
            if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.H1h3.f70286e)) {
                return R.string.order_type_h1h3;
            }
            if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Drive.f70282e)) {
                return R.string.order_type_drive;
            }
            if (!Intrinsics.areEqual((Object) orderType, (Object) OrderType.Mktp.f70290e)) {
                if (!Intrinsics.areEqual((Object) orderType, (Object) OrderType.Lad.f70288e)) {
                    Intrinsics.areEqual((Object) orderType, (Object) OrderType.Unknown.f70294e);
                }
                return R.string.order_type_lad;
            }
        }
        return R.string.order_type_drive_express_pickup;
    }
}
