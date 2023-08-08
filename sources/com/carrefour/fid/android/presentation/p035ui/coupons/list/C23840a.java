package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.a */
public final class C23840a {

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.a$a */
    public /* synthetic */ class C23841a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.data.entities.coupons.CouponStatus[] r0 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.data.entities.coupons.CouponStatus r1 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.EMITTED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.data.entities.coupons.CouponStatus r1 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.UNLOADTOCARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.data.entities.coupons.CouponStatus r1 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.LOADEDTOCARD     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.C23840a.C23841a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final CouponStatus m105565a(@C12579k CouponStatus couponStatus, boolean z) {
        Intrinsics.checkNotNullParameter(couponStatus, "<this>");
        if (z) {
            int i = C23841a.$EnumSwitchMapping$0[couponStatus.ordinal()];
            if (i == 1 || i == 2) {
                return CouponStatus.LOADEDTOCARD;
            }
            return couponStatus;
        } else if (C23841a.$EnumSwitchMapping$0[couponStatus.ordinal()] == 3) {
            return CouponStatus.EMITTED;
        } else {
            return couponStatus;
        }
    }
}
