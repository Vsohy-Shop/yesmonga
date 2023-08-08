package com.carrefour.fid.android.presentation.p035ui.coupons.overlay;

import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.C26314e;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.c */
public final class C23914c implements C10158g<CouponProductsOverlayBottomSheetFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f60095a;

    /* renamed from: b */
    public final Provider<C26314e> f60096b;

    public C23914c(Provider<C28796c> provider, Provider<C26314e> provider2) {
        this.f60095a = provider;
        this.f60096b = provider2;
    }

    /* renamed from: a */
    public static C10158g<CouponProductsOverlayBottomSheetFragment> m105772a(Provider<C28796c> provider, Provider<C26314e> provider2) {
        return new C23914c(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.coupons.overlay.CouponProductsOverlayBottomSheetFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m105773b(CouponProductsOverlayBottomSheetFragment couponProductsOverlayBottomSheetFragment, C26314e eVar) {
        couponProductsOverlayBottomSheetFragment.f60081g = eVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.coupons.overlay.CouponProductsOverlayBottomSheetFragment.navigator")
    /* renamed from: d */
    public static void m105774d(CouponProductsOverlayBottomSheetFragment couponProductsOverlayBottomSheetFragment, C28796c cVar) {
        couponProductsOverlayBottomSheetFragment.f60080f = cVar;
    }

    /* renamed from: c */
    public void injectMembers(CouponProductsOverlayBottomSheetFragment couponProductsOverlayBottomSheetFragment) {
        m105774d(couponProductsOverlayBottomSheetFragment, this.f60095a.get());
        m105773b(couponProductsOverlayBottomSheetFragment, this.f60096b.get());
    }
}
