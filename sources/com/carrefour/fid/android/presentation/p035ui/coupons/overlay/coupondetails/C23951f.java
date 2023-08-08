package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import android.content.Context;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.data.entities.coupons.CouponType;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.Facility;
import com.carrefour.fid.android.presentation.models.Image;
import com.carrefour.fid.android.presentation.models.extension.C38465d;
import com.carrefour.fid.android.presentation.p035ui.coupons.helpers.C23815a;
import com.carrefour.fid.android.shared.extension.DateExtensionsKt;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.f */
public final class C23951f {
    /* renamed from: a */
    public static final String m105830a(Context context, String str, int i, int i2) {
        if (Intrinsics.areEqual((Object) str, (Object) "i")) {
            String string = context.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "{\n        context.getString(valueRI)\n    }");
            return string;
        }
        String string2 = context.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "{\n        context.getString(valueRD)\n    }");
        return string2;
    }

    /* renamed from: b */
    public static final String m105831b(CouponModel couponModel) {
        return couponModel.mo121388D() == CouponType.DIGIT ? couponModel.mo121389E() : couponModel.mo121401Q();
    }

    /* renamed from: c */
    public static final String m105832c(Context context, CouponModel couponModel) {
        String str;
        boolean z;
        Facility J = couponModel.mo121394J();
        String str2 = null;
        if (J != null) {
            str = J.mo121603f();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String T = couponModel.mo121404T();
            int hashCode = T.hashCode();
            if (hashCode != 2309) {
                if (hashCode != 2452) {
                    if (hashCode == 71644 && T.equals(C23815a.C23817b.f59931b)) {
                        return m105830a(context, couponModel.mo121400P(), R.string.loyalty_cgu_coupon_HM_RI, R.string.loyalty_cgu_coupon_HM_RD);
                    }
                } else if (T.equals(C23815a.C23817b.f59933d)) {
                    return m105830a(context, couponModel.mo121400P(), R.string.loyalty_cgu_coupon_market_RI, R.string.loyalty_cgu_coupon_market_RD);
                }
            } else if (T.equals(C23815a.C23817b.f59932c)) {
                return m105830a(context, couponModel.mo121400P(), R.string.loyalty_cgu_coupon_hyper_RI, R.string.loyalty_cgu_coupon_hyper_RD);
            }
            return m105830a(context, couponModel.mo121400P(), R.string.loyalty_cgu_coupon_other_RI, R.string.loyalty_cgu_coupon_other_RD);
        }
        Object[] objArr = new Object[1];
        Facility J2 = couponModel.mo121394J();
        if (J2 != null) {
            str2 = J2.mo121603f();
        }
        objArr[0] = str2;
        String string = context.getString(R.string.loyalty_cgu_coupon_store, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "{\n        context.getStr…pon.facility?.name)\n    }");
        return string;
    }

    /* renamed from: d */
    public static final String m105833d(CouponModel couponModel) {
        return couponModel.mo121388D() == CouponType.DIGIT ? couponModel.mo121390F() : couponModel.mo121389E();
    }

    /* renamed from: e */
    public static final String m105834e(CouponModel couponModel) {
        return couponModel.mo121388D() == CouponType.DIGIT ? new String() : couponModel.mo121390F();
    }

    /* renamed from: f */
    public static final String m105835f(Context context, CouponModel couponModel) {
        String str;
        if (couponModel.mo121388D() == CouponType.DIGIT) {
            str = context.getString(R.string.loyalty_cgu_coupon_digit_store);
        } else {
            str = m105832c(context, couponModel);
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (coupon.couponType ==…Notice(context, coupon)\n}");
        return str;
    }

    /* renamed from: g */
    public static final String m105836g(Context context, CouponModel couponModel) {
        boolean z;
        String str;
        if (couponModel.mo121404T().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = context.getString(R.string.coupons_partner_store_type, new Object[]{C23815a.f59923a.mo69750h(couponModel.mo121404T())});
        } else {
            str = new String();
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (coupon.storeType.isN…eType))\n    else String()");
        return str;
    }

    /* renamed from: h */
    public static final String m105837h(Context context, CouponModel couponModel) {
        if (!C38465d.m159627f(couponModel)) {
            String string = context.getString(R.string.coupons_validity_starts_txt, new Object[]{DateExtensionsKt.m118759e(couponModel.mo121407W())});
            Intrinsics.checkNotNullExpressionValue(string, "{\n        context.getStr…ityDate()\n        )\n    }");
            return string;
        }
        String string2 = context.getString(R.string.coupons_validity_ends_txt, new Object[]{DateExtensionsKt.m118759e(couponModel.mo121406V())});
        Intrinsics.checkNotNullExpressionValue(string2, "{\n        context.getStr…ityDate()\n        )\n    }");
        return string2;
    }

    /* renamed from: i */
    public static final boolean m105838i(CouponModel couponModel) {
        return couponModel.mo121388D() == CouponType.DIGIT;
    }

    @C12579k
    /* renamed from: j */
    public static final C23952g m105839j(@C12579k CouponModel couponModel, @C12579k Context context) {
        String str;
        Intrinsics.checkNotNullParameter(couponModel, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        String b = m105831b(couponModel);
        Image M = couponModel.mo121397M();
        if (M != null) {
            str = M.mo121644a();
        } else {
            str = null;
        }
        return new C23952g(b, str, m105833d(couponModel), m105837h(context, couponModel), m105834e(couponModel), m105835f(context, couponModel), m105836g(context, couponModel));
    }
}
