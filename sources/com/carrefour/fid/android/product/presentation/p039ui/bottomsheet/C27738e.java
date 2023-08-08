package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.e */
public final class C27738e implements C10158g<AlternativeProductsBottomSheetFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f67261a;

    /* renamed from: b */
    public final Provider<C27631a> f67262b;

    public C27738e(Provider<C28796c> provider, Provider<C27631a> provider2) {
        this.f67261a = provider;
        this.f67262b = provider2;
    }

    /* renamed from: a */
    public static C10158g<AlternativeProductsBottomSheetFragment> m116564a(Provider<C28796c> provider, Provider<C27631a> provider2) {
        return new C27738e(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetFragment.analytics")
    /* renamed from: b */
    public static void m116565b(AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment, C27631a aVar) {
        alternativeProductsBottomSheetFragment.f67221g = aVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetFragment.navigator")
    /* renamed from: d */
    public static void m116566d(AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment, C28796c cVar) {
        alternativeProductsBottomSheetFragment.f67220f = cVar;
    }

    /* renamed from: c */
    public void injectMembers(AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment) {
        m116566d(alternativeProductsBottomSheetFragment, this.f67261a.get());
        m116565b(alternativeProductsBottomSheetFragment, this.f67262b.get());
    }
}
