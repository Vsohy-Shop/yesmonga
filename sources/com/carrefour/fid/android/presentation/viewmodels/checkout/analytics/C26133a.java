package com.carrefour.fid.android.presentation.viewmodels.checkout.analytics;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.BasketService;
import com.carrefour.fid.android.core.type.BasketType;
import com.carrefour.fid.android.shared.constant.C28526d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.analytics.a */
public final class C26133a {
    @C12579k

    /* renamed from: a */
    public static final C26133a f63892a = new C26133a();

    /* renamed from: b */
    public static final int f63893b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.analytics.a$a */
    public /* synthetic */ class C26134a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.core.type.BasketType[] r0 = com.carrefour.fid.android.core.type.BasketType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.core.type.BasketType r1 = com.carrefour.fid.android.core.type.BasketType.BASKET_V4_TYPE_DRIVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.core.type.BasketType r1 = com.carrefour.fid.android.core.type.BasketType.BASKET_V4_EXPRESS_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.core.type.BasketType r1 = com.carrefour.fid.android.core.type.BasketType.BASKET_V4_TYPE_MARKETPLACE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.analytics.C26133a.C26134a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public final String mo75922a(@C12580l BasketType basketType, @C12580l BasketService basketService, boolean z) {
        int i;
        if (basketType == null) {
            i = -1;
        } else {
            i = C26134a.$EnumSwitchMapping$0[basketType.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return "lex";
            }
            if (i == 3) {
                return C28526d.f68995y1;
            }
            if (z) {
                return "retrait-express";
            }
            return new String();
        } else if (basketService == BasketService.DELIVERY) {
            return "livraison";
        } else {
            return "drive";
        }
    }
}
