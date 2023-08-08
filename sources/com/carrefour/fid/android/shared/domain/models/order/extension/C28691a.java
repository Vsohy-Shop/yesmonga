package com.carrefour.fid.android.shared.domain.models.order.extension;

import com.carrefour.fid.android.domain.models.order.OrderServiceType;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.domain.models.order.extension.a */
public final class C28691a {
    @C12579k
    /* renamed from: a */
    public static final OrderType m118687a(@C12579k OrderServiceType orderServiceType) {
        Intrinsics.checkNotNullParameter(orderServiceType, "<this>");
        if (Intrinsics.areEqual((Object) orderServiceType, (Object) OrderServiceType.Clcv.f96189a)) {
            return OrderType.Clcv.f70280e;
        }
        if (Intrinsics.areEqual((Object) orderServiceType, (Object) OrderServiceType.Drive.f96190a)) {
            return OrderType.Drive.f70282e;
        }
        if (Intrinsics.areEqual((Object) orderServiceType, (Object) OrderServiceType.DriveExpressPickup.f96191a)) {
            return OrderType.DriveExpressPickup.f70284e;
        }
        if (Intrinsics.areEqual((Object) orderServiceType, (Object) OrderServiceType.Mktp.f96193a)) {
            return OrderType.Mktp.f70290e;
        }
        if (Intrinsics.areEqual((Object) orderServiceType, (Object) OrderServiceType.R2h.f96194a)) {
            return OrderType.R2h.f70292e;
        }
        if (Intrinsics.areEqual((Object) orderServiceType, (Object) OrderServiceType.H1h3.f96192a)) {
            return OrderType.H1h3.f70286e;
        }
        if (Intrinsics.areEqual((Object) orderServiceType, (Object) OrderServiceType.Unknown.f96195a)) {
            return OrderType.Unknown.f70294e;
        }
        throw new NoWhenBranchMatchedException();
    }
}
