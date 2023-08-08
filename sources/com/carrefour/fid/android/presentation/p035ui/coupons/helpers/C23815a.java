package com.carrefour.fid.android.presentation.p035ui.coupons.helpers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.carrefour.fid.android.domain.models.FacilityBanner;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.helpers.a */
public final class C23815a {
    @C12579k

    /* renamed from: a */
    public static final C23815a f59923a = new C23815a();
    @C12580l

    /* renamed from: b */
    public static final String f59924b = C11342l0.m43547d(C23815a.class).mo22848s();

    /* renamed from: c */
    public static final int f59925c = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.helpers.a$a */
    public static final class C23816a {
        @C12579k

        /* renamed from: a */
        public static final C23816a f59926a = new C23816a();
        @C12579k

        /* renamed from: b */
        public static final String f59927b = "i";
        @C12579k

        /* renamed from: c */
        public static final String f59928c = "d";

        /* renamed from: d */
        public static final int f59929d = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.helpers.a$b */
    public static final class C23817b {
        @C12579k

        /* renamed from: a */
        public static final C23817b f59930a = new C23817b();
        @C12579k

        /* renamed from: b */
        public static final String f59931b = "HMA";
        @C12579k

        /* renamed from: c */
        public static final String f59932c = "HM";
        @C12579k

        /* renamed from: d */
        public static final String f59933d = "MA";
        @C12579k

        /* renamed from: e */
        public static final String f59934e = "HMAPX";
        @C12579k

        /* renamed from: f */
        public static final String f59935f = "PX";
        @C12579k

        /* renamed from: g */
        public static final String f59936g = "HMPX";
        @C12579k

        /* renamed from: h */
        public static final String f59937h = "MAPX";

        /* renamed from: i */
        public static final int f59938i = 0;
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.helpers.a$c */
    public /* synthetic */ class C23818c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.domain.models.DiscountType[] r0 = com.carrefour.fid.android.domain.models.DiscountType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.DiscountType r1 = com.carrefour.fid.android.domain.models.DiscountType.AMOUNT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.DiscountType r1 = com.carrefour.fid.android.domain.models.DiscountType.PERCENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.DiscountType r1 = com.carrefour.fid.android.domain.models.DiscountType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.helpers.C23815a.C23818c.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public final String mo69743a(@C12580l Double d, @C12579k DiscountType discountType) {
        Double d2;
        String d3;
        Intrinsics.checkNotNullParameter(discountType, "discountType");
        int i = C23818c.$EnumSwitchMapping$0[discountType.ordinal()];
        if (i == 1) {
            if (d != null) {
                d2 = Double.valueOf(C28782t.m119109f(d.doubleValue()));
            } else {
                d2 = null;
            }
            return C28782t.m119105b(d2);
        } else if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        } else if (d == null || (d3 = C28782t.m119107d(d.doubleValue())) == null) {
            return "";
        } else {
            return d3;
        }
    }

    /* renamed from: b */
    public final int mo69744b(@C12580l String str) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (Intrinsics.areEqual((Object) str, (Object) FacilityBanner.EXPRESS.mo115797q())) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) str, (Object) FacilityBanner.CORNER_EXPRESS.mo115797q());
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) str, (Object) FacilityBanner.CARREFOUR_EXPRESS.mo115797q());
        }
        if (z2) {
            return R.drawable.ds_br_express;
        }
        if (!Intrinsics.areEqual((Object) str, (Object) FacilityBanner.CARREFOUR_MARKET.mo115797q())) {
            z3 = Intrinsics.areEqual((Object) str, (Object) FacilityBanner.MARKET.mo115797q());
        }
        if (z3) {
            return R.drawable.ds_gr_market;
        }
        if (Intrinsics.areEqual((Object) str, (Object) FacilityBanner.BON_APP.mo115797q())) {
            return R.drawable.ds_br_bon_app;
        }
        if (Intrinsics.areEqual((Object) str, (Object) FacilityBanner.MONTAGNE.mo115797q())) {
            return R.drawable.ds_br_montagne;
        }
        if (Intrinsics.areEqual((Object) str, (Object) FacilityBanner.BIO.mo115797q())) {
            return R.drawable.ds_br_carrefour_bio;
        }
        if (Intrinsics.areEqual((Object) str, (Object) FacilityBanner.CARREFOUR_CONTACT.mo115797q())) {
            return R.drawable.ds_br_contact;
        }
        if (Intrinsics.areEqual((Object) str, (Object) FacilityBanner.CONTACT_MARCHE.mo115797q())) {
            return R.drawable.ds_br_contact_marche;
        }
        if (Intrinsics.areEqual((Object) str, (Object) FacilityBanner.CITY.mo115797q())) {
            return R.drawable.ds_br_city;
        }
        return R.drawable.ds_br_carrefour_without_title;
    }

    /* renamed from: c */
    public final int mo69745c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "reimbursementType");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual((Object) lowerCase, (Object) "d")) {
            return R.color.colorPrimary;
        }
        return R.color.dark_cream;
    }

    /* renamed from: d */
    public final int mo69746d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "reimbursementType");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual((Object) lowerCase, (Object) "d")) {
            return R.drawable.coupon_header_rd_cell_bg;
        }
        return R.drawable.coupon_header_ri_cell_bg;
    }

    /* renamed from: e */
    public final int mo69747e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "reimbursementType");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual((Object) lowerCase, (Object) "i")) {
            return R.string.coupons_title_offer_txt_ri;
        }
        if (Intrinsics.areEqual((Object) lowerCase, (Object) "d")) {
            return R.string.coupons_title_offer_txt_rd;
        }
        return 0;
    }

    /* renamed from: f */
    public final int mo69748f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "reimbursementType");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual((Object) lowerCase, (Object) "d")) {
            return R.color.ds_grey_white;
        }
        return R.color.ds_primary_dark;
    }

    /* renamed from: g */
    public final int mo69749g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "reimbursementType");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        if (Intrinsics.areEqual((Object) lowerCase, (Object) "d")) {
            return R.color.ds_grey_white;
        }
        return R.color.error_color;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @org.jetbrains.annotations.C12579k
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo69750h(@org.jetbrains.annotations.C12579k java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "storeType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case 2309: goto L_0x0055;
                case 2452: goto L_0x0049;
                case 2568: goto L_0x003d;
                case 71644: goto L_0x0031;
                case 2221517: goto L_0x0025;
                case 2358940: goto L_0x0019;
                case 68852452: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0061
        L_0x000d:
            java.lang.String r0 = "HMAPX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0016
            goto L_0x0061
        L_0x0016:
            java.lang.String r2 = "Hypermarché, Market et Proxi"
            goto L_0x0063
        L_0x0019:
            java.lang.String r0 = "MAPX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0022
            goto L_0x0061
        L_0x0022:
            java.lang.String r2 = "Market et Proxi"
            goto L_0x0063
        L_0x0025:
            java.lang.String r0 = "HMPX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x002e
            goto L_0x0061
        L_0x002e:
            java.lang.String r2 = "Hypermarché et Proxi"
            goto L_0x0063
        L_0x0031:
            java.lang.String r0 = "HMA"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x003a
            goto L_0x0061
        L_0x003a:
            java.lang.String r2 = "Hypermarché et Market"
            goto L_0x0063
        L_0x003d:
            java.lang.String r0 = "PX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0046
            goto L_0x0061
        L_0x0046:
            java.lang.String r2 = "Proxi"
            goto L_0x0063
        L_0x0049:
            java.lang.String r0 = "MA"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0052
            goto L_0x0061
        L_0x0052:
            java.lang.String r2 = "Market"
            goto L_0x0063
        L_0x0055:
            java.lang.String r0 = "HM"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            java.lang.String r2 = "Hypermarché"
            goto L_0x0063
        L_0x0061:
            java.lang.String r2 = ""
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.helpers.C23815a.mo69750h(java.lang.String):java.lang.String");
    }

    @C12580l
    /* renamed from: i */
    public final Integer mo69751i(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -1303124906:
                if (str.equals("MAILING_MANUEL")) {
                    return Integer.valueOf(R.string.coupon_promotion_channel_manual_mailing);
                }
                break;
            case 82233:
                if (str.equals(LoyaltyConstantsKt.MEDIA_TYPE_SMS)) {
                    return Integer.valueOf(R.string.coupon_promotion_channel_sms);
                }
                break;
            case 66081660:
                if (str.equals("EMAIL")) {
                    return Integer.valueOf(R.string.coupon_promotion_channel_email);
                }
                break;
            case 1980439130:
                if (str.equals("CAISSE")) {
                    return Integer.valueOf(R.string.coupon_promotion_channel_checkout);
                }
                break;
        }
        return null;
    }

    @C12580l
    /* renamed from: j */
    public final String mo69752j() {
        return f59924b;
    }
}
