package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import android.content.Context;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.basket.BasketServiceType;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.urbanairship.iam.events.C9175a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.c */
public final class C23465c {
    @C12579k

    /* renamed from: a */
    public final Context f59328a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.c$a */
    public /* synthetic */ class C23466a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0055 */
        static {
            /*
                com.carrefour.fid.android.domain.models.basket.BasketServiceType[] r0 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.carrefour.fid.android.domain.models.basket.BasketServiceType r2 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.DELIVERY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.carrefour.fid.android.domain.models.basket.BasketServiceType r3 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.DRIVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.carrefour.fid.android.domain.models.basket.BasketServiceType r4 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                com.carrefour.fid.android.domain.models.basket.BasketType[] r0 = com.carrefour.fid.android.domain.models.basket.BasketType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.basket.BasketType r4 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_DRIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_EXPRESS_DELIVERY     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_HOME_DELIVERY_NAL     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.NONE     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_ADDITIONAL_ORDER     // Catch:{ NoSuchFieldError -> 0x0055 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_MARKETPLACE     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.C23465c.C23466a.<clinit>():void");
        }
    }

    public C23465c(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f59328a = context;
    }

    @C12579k
    /* renamed from: a */
    public final C23454a mo68718a(boolean z, @C12580l BasketType basketType, @C12579k BasketServiceType basketServiceType) {
        int i;
        Intrinsics.checkNotNullParameter(basketServiceType, "serviceType");
        if (z) {
            return C23454a.f59310d.mo68700a();
        }
        if (basketType == null) {
            i = -1;
        } else {
            i = C23466a.$EnumSwitchMapping$1[basketType.ordinal()];
        }
        switch (i) {
            case -1:
            case 4:
            case 5:
            case 6:
                throw new IllegalArgumentException(basketType + " is not supported yet");
            case 1:
                int i2 = C23466a.$EnumSwitchMapping$0[basketServiceType.ordinal()];
                if (i2 == 1) {
                    String string = this.f59328a.getString(R.string.basket_nal_delivery);
                    String string2 = this.f59328a.getString(R.string.basket_delivery_alimentary_subtitle);
                    Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…very_alimentary_subtitle)");
                    return new C23454a(R.drawable.ds_il_delivery_active, string, string2);
                } else if (i2 == 2) {
                    String string3 = this.f59328a.getString(R.string.basket_nal_drive);
                    String string4 = this.f59328a.getString(R.string.basket_delivery_alimentary_subtitle);
                    Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…very_alimentary_subtitle)");
                    return new C23454a(R.drawable.ds_il_drive_active, string3, string4);
                } else if (i2 == 3) {
                    return C23454a.f59310d.mo68700a();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            case 2:
                String string5 = this.f59328a.getString(R.string.basket_nal_h1h3);
                String string6 = this.f59328a.getString(R.string.basket_delivery_alimentary_subtitle);
                Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.stri…very_alimentary_subtitle)");
                return new C23454a(R.drawable.ds_il_delivery_h1h3_active, string5, string6);
            case 3:
                String string7 = this.f59328a.getString(R.string.basket_nal_delivery);
                String string8 = this.f59328a.getString(R.string.basket_delivery_nal_subtitle);
                Intrinsics.checkNotNullExpressionValue(string8, "context.getString(R.stri…et_delivery_nal_subtitle)");
                return new C23454a(R.drawable.ds_il_nal, string7, string8);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
