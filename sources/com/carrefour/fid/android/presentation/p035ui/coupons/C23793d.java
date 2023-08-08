package com.carrefour.fid.android.presentation.p035ui.coupons;

import com.carrefour.fid.android.presentation.analytics.C38364e;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.d */
public final class C23793d implements C10158g<CouponsScanBarcodeFragment> {

    /* renamed from: a */
    public final Provider<C38364e> f59887a;

    public C23793d(Provider<C38364e> provider) {
        this.f59887a = provider;
    }

    /* renamed from: a */
    public static C10158g<CouponsScanBarcodeFragment> m105472a(Provider<C38364e> provider) {
        return new C23793d(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.coupons.CouponsScanBarcodeFragment.analyticsDelegate")
    /* renamed from: b */
    public static void m105473b(CouponsScanBarcodeFragment couponsScanBarcodeFragment, C38364e eVar) {
        couponsScanBarcodeFragment.f59875f = eVar;
    }

    /* renamed from: c */
    public void injectMembers(CouponsScanBarcodeFragment couponsScanBarcodeFragment) {
        m105473b(couponsScanBarcodeFragment, this.f59887a.get());
    }
}
