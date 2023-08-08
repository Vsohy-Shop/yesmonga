package com.carrefour.fid.android.data.entities;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.b */
public final class C36419b {
    /* renamed from: a */
    public static final boolean m149379a(@C12579k OrderV3DeliveryOption orderV3DeliveryOption) {
        DlvCode dlvCode;
        Intrinsics.checkNotNullParameter(orderV3DeliveryOption, "<this>");
        OrderV3ShippingType shippingType = orderV3DeliveryOption.getShippingType();
        DlvCode dlvCode2 = null;
        if (shippingType != null) {
            dlvCode = shippingType.getCode();
        } else {
            dlvCode = null;
        }
        if (dlvCode != DlvCode.PRE) {
            OrderV3ShippingType shippingType2 = orderV3DeliveryOption.getShippingType();
            if (shippingType2 != null) {
                dlvCode2 = shippingType2.getCode();
            }
            if (dlvCode2 == DlvCode.PRC) {
                return true;
            }
            return false;
        }
        return true;
    }
}
