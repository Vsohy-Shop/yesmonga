package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel;
import com.carrefour.fid.android.shared.extension.StringKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.models.extension.i */
public final class C38473i {
    /* renamed from: a */
    public static final boolean m159632a(@C12579k LoyaltyModel loyaltyModel) {
        Double d;
        Intrinsics.checkNotNullParameter(loyaltyModel, "<this>");
        Double totalLoyaltyAmount = loyaltyModel.getTotalLoyaltyAmount();
        if (totalLoyaltyAmount != null) {
            d = Double.valueOf(Math.signum(totalLoyaltyAmount.doubleValue()));
        } else {
            d = null;
        }
        return Intrinsics.areEqual(d, 1.0d);
    }

    @C12580l
    /* renamed from: b */
    public static final String m159633b(@C12579k LoyaltyModel loyaltyModel) {
        String d;
        Intrinsics.checkNotNullParameter(loyaltyModel, "<this>");
        Double totalLoyaltyAmount = loyaltyModel.getTotalLoyaltyAmount();
        if (totalLoyaltyAmount == null || (d = totalLoyaltyAmount.toString()) == null) {
            return null;
        }
        return StringKt.m118910S(d, (String) null, 1, (Object) null);
    }
}
