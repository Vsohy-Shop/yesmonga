package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.analytics.b */
public final class C23457b implements C23456a {
    @C12579k

    /* renamed from: a */
    public C13783a f59315a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.analytics.b$a */
    public /* synthetic */ class C23458a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.basket.BasketType[] r0 = com.carrefour.fid.android.domain.models.basket.BasketType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_ADDITIONAL_ORDER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_DRIVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_EXPRESS_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_HOME_DELIVERY_NAL     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_MARKETPLACE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.NONE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics.C23457b.C23458a.<clinit>():void");
        }
    }

    @Inject
    public C23457b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f59315a = aVar;
    }

    /* renamed from: a */
    public void mo68701a(@C12579k BasketType basketType, @C12580l StoreServiceType storeServiceType, boolean z) {
        Intrinsics.checkNotNullParameter(basketType, "basketType");
        C13783a.m58668o(this.f59315a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a("screen_name", "multi-baskets"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68833L1), C11078d1.m42659a(C28526d.f68937k, mo68704d(basketType, storeServiceType, z))), false, 2, (Object) null);
    }

    /* renamed from: b */
    public void mo68702b(boolean z) {
        String str;
        if (z) {
            str = "multi";
        } else {
            str = "simple";
        }
        C13783a.m58667i(this.f59315a, "checkout", "multi-baskets", C10975r0.m41401k(C11078d1.m42659a("env_basketSize", str)), false, false, false, 56, (Object) null);
    }

    /* renamed from: c */
    public void mo68703c() {
        C13783a.m58667i(this.f59315a, "checkout", "basket-vide", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: d */
    public final String mo68704d(BasketType basketType, StoreServiceType storeServiceType, boolean z) {
        switch (C23458a.$EnumSwitchMapping$0[basketType.ordinal()]) {
            case 1:
                return "complement";
            case 2:
                if (!Intrinsics.areEqual((Object) storeServiceType, (Object) StoreServiceType.Clcv.INSTANCE)) {
                    return "drive";
                }
                if (z) {
                    return "retrait-express";
                }
                return "home-delivery";
            case 3:
                return "retrait-express";
            case 4:
                return "nonfood-delivery";
            case 5:
            case 6:
                return new String();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
