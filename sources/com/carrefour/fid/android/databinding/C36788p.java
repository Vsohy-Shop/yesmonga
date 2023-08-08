package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.CouponComponent;

/* renamed from: com.carrefour.fid.android.databinding.p */
public final class C36788p implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CouponComponent f91456a;
    @C0359n0

    /* renamed from: b */
    public final CouponComponent f91457b;

    public C36788p(@C0359n0 CouponComponent couponComponent, @C0359n0 CouponComponent couponComponent2) {
        this.f91456a = couponComponent;
        this.f91457b = couponComponent2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36788p m150879a(@C0359n0 View view) {
        if (view != null) {
            CouponComponent couponComponent = (CouponComponent) view;
            return new C36788p(couponComponent, couponComponent);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36788p m150880c(@C0359n0 LayoutInflater layoutInflater) {
        return m150881d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36788p m150881d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.coupon_row_view_new, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150879a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CouponComponent getRoot() {
        return this.f91456a;
    }
}
