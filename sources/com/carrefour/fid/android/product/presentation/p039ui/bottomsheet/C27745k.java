package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.k */
public final class C27745k implements C10158g<MixingProductsBottomSheetFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f67276a;

    /* renamed from: b */
    public final Provider<PlpProductAnalytics> f67277b;

    /* renamed from: c */
    public final Provider<C28936j> f67278c;

    public C27745k(Provider<C28796c> provider, Provider<PlpProductAnalytics> provider2, Provider<C28936j> provider3) {
        this.f67276a = provider;
        this.f67277b = provider2;
        this.f67278c = provider3;
    }

    /* renamed from: a */
    public static C10158g<MixingProductsBottomSheetFragment> m116573a(Provider<C28796c> provider, Provider<PlpProductAnalytics> provider2, Provider<C28936j> provider3) {
        return new C27745k(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.bottomsheet.MixingProductsBottomSheetFragment.fragmentUtil")
    /* renamed from: b */
    public static void m116574b(MixingProductsBottomSheetFragment mixingProductsBottomSheetFragment, C28936j jVar) {
        mixingProductsBottomSheetFragment.f67241O0 = jVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.bottomsheet.MixingProductsBottomSheetFragment.navigator")
    /* renamed from: d */
    public static void m116575d(MixingProductsBottomSheetFragment mixingProductsBottomSheetFragment, C28796c cVar) {
        mixingProductsBottomSheetFragment.f67239M0 = cVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.bottomsheet.MixingProductsBottomSheetFragment.productListAnalytics")
    /* renamed from: e */
    public static void m116576e(MixingProductsBottomSheetFragment mixingProductsBottomSheetFragment, PlpProductAnalytics plpProductAnalytics) {
        mixingProductsBottomSheetFragment.f67240N0 = plpProductAnalytics;
    }

    /* renamed from: c */
    public void injectMembers(MixingProductsBottomSheetFragment mixingProductsBottomSheetFragment) {
        m116575d(mixingProductsBottomSheetFragment, this.f67276a.get());
        m116576e(mixingProductsBottomSheetFragment, this.f67277b.get());
        m116574b(mixingProductsBottomSheetFragment, this.f67278c.get());
    }
}
