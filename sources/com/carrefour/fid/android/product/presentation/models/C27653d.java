package com.carrefour.fid.android.product.presentation.models;

import android.content.Context;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.models.d */
public abstract class C27653d {
    @C12579k

    /* renamed from: a */
    public static final C27654a f67180a = new C27654a((DefaultConstructorMarker) null);

    /* renamed from: com.carrefour.fid.android.product.presentation.models.d$a */
    public static final class C27654a {

        /* renamed from: com.carrefour.fid.android.product.presentation.models.d$a$a */
        public /* synthetic */ class C27655a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    com.carrefour.fid.android.domain.models.offer.PromoType[] r0 = com.carrefour.fid.android.domain.models.offer.PromoType.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.RI     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.RD     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.PROMO     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.PF     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.models.C27653d.C27654a.C27655a.<clinit>():void");
            }
        }

        public /* synthetic */ C27654a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C27653d mo80352a(@C12579k Context context, @C12579k PromoType promoType) {
            C27653d dVar;
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(promoType, "discountType");
            int i = C27655a.$EnumSwitchMapping$0[promoType.ordinal()];
            if (i == 1) {
                dVar = new C27678i(context);
            } else if (i == 2) {
                dVar = new C27677h(context);
            } else if (i != 3 && i != 4) {
                return C27679j.f67208b;
            } else {
                dVar = new C27669f(context);
            }
            return dVar;
        }

        public C27654a() {
        }
    }

    public /* synthetic */ C27653d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12579k
    /* renamed from: a */
    public abstract String mo80351a(@C12579k Offer offer);

    public C27653d() {
    }
}
