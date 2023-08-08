package com.carrefour.fid.android.core.constants;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.constants.d */
public abstract class C36171d {
    @C12579k

    /* renamed from: a */
    public static final C36172a f89287a = new C36172a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f89288b = 0;

    /* renamed from: com.carrefour.fid.android.core.constants.d$a */
    public static final class C36172a {

        /* renamed from: com.carrefour.fid.android.core.constants.d$a$a */
        public /* synthetic */ class C36173a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    com.carrefour.fid.android.domain.models.offer.OfferDiscountType[] r0 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RI     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RD     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.PROMO     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.PF     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.core.constants.C36171d.C36172a.C36173a.<clinit>():void");
            }
        }

        public /* synthetic */ C36172a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C36171d mo108077a(@C12579k Context context, @C12579k OfferDiscountType offerDiscountType) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(offerDiscountType, "discountType");
            int i = C36173a.$EnumSwitchMapping$0[offerDiscountType.ordinal()];
            if (i == 1) {
                return new C36183n(context);
            }
            if (i == 2) {
                return new C36182m(context);
            }
            if (i == 3 || i == 4) {
                return new C36180k(context);
            }
            return new C36189t(context);
        }

        public C36172a() {
        }
    }

    public /* synthetic */ C36171d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12579k
    /* renamed from: a */
    public abstract String mo108076a(@C12579k OfferProductModel offerProductModel);

    public C36171d() {
    }
}
