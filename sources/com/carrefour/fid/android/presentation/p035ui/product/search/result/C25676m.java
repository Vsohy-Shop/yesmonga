package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import com.carrefour.fid.android.presentation.viewmodels.product.search.C27272f;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.m */
public final class C25676m implements C10158g<ProductSearchWithListAllResultsFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f62967a;

    /* renamed from: b */
    public final Provider<C27272f> f62968b;

    public C25676m(Provider<C28796c> provider, Provider<C27272f> provider2) {
        this.f62967a = provider;
        this.f62968b = provider2;
    }

    /* renamed from: a */
    public static C10158g<ProductSearchWithListAllResultsFragment> m110329a(Provider<C28796c> provider, Provider<C27272f> provider2) {
        return new C25676m(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListAllResultsFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m110330b(ProductSearchWithListAllResultsFragment productSearchWithListAllResultsFragment, C27272f fVar) {
        productSearchWithListAllResultsFragment.f62884v = fVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListAllResultsFragment.navigator")
    /* renamed from: d */
    public static void m110331d(ProductSearchWithListAllResultsFragment productSearchWithListAllResultsFragment, C28796c cVar) {
        productSearchWithListAllResultsFragment.f62883g = cVar;
    }

    /* renamed from: c */
    public void injectMembers(ProductSearchWithListAllResultsFragment productSearchWithListAllResultsFragment) {
        m110331d(productSearchWithListAllResultsFragment, this.f62967a.get());
        m110330b(productSearchWithListAllResultsFragment, this.f62968b.get());
    }
}
