package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.analytics.C23943a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.e */
public final class C23950e implements C10158g<CouponDetailsOverlayBottomSheetFragment> {

    /* renamed from: a */
    public final Provider<C23943a> f60119a;

    public C23950e(Provider<C23943a> provider) {
        this.f60119a = provider;
    }

    /* renamed from: a */
    public static C10158g<CouponDetailsOverlayBottomSheetFragment> m105827a(Provider<C23943a> provider) {
        return new C23950e(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetFragment.analytics")
    /* renamed from: b */
    public static void m105828b(CouponDetailsOverlayBottomSheetFragment couponDetailsOverlayBottomSheetFragment, C23943a aVar) {
        couponDetailsOverlayBottomSheetFragment.f60103f = aVar;
    }

    /* renamed from: c */
    public void injectMembers(CouponDetailsOverlayBottomSheetFragment couponDetailsOverlayBottomSheetFragment) {
        m105828b(couponDetailsOverlayBottomSheetFragment, this.f60119a.get());
    }
}
