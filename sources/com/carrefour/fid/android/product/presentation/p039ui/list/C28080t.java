package com.carrefour.fid.android.product.presentation.p039ui.list;

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
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.t */
public final class C28080t implements C10158g<ProductListQueryFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f68020a;

    /* renamed from: b */
    public final Provider<PlpProductAnalytics> f68021b;

    /* renamed from: c */
    public final Provider<C28936j> f68022c;

    public C28080t(Provider<C28796c> provider, Provider<PlpProductAnalytics> provider2, Provider<C28936j> provider3) {
        this.f68020a = provider;
        this.f68021b = provider2;
        this.f68022c = provider3;
    }

    /* renamed from: a */
    public static C10158g<ProductListQueryFragment> m117613a(Provider<C28796c> provider, Provider<PlpProductAnalytics> provider2, Provider<C28936j> provider3) {
        return new C28080t(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListQueryFragment.fragmentUtil")
    /* renamed from: b */
    public static void m117614b(ProductListQueryFragment productListQueryFragment, C28936j jVar) {
        productListQueryFragment.f67914y = jVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListQueryFragment.navigator")
    /* renamed from: d */
    public static void m117615d(ProductListQueryFragment productListQueryFragment, C28796c cVar) {
        productListQueryFragment.f67912w = cVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListQueryFragment.plpProductAnalytics")
    /* renamed from: e */
    public static void m117616e(ProductListQueryFragment productListQueryFragment, PlpProductAnalytics plpProductAnalytics) {
        productListQueryFragment.f67913x = plpProductAnalytics;
    }

    /* renamed from: c */
    public void injectMembers(ProductListQueryFragment productListQueryFragment) {
        m117615d(productListQueryFragment, this.f68020a.get());
        m117616e(productListQueryFragment, this.f68021b.get());
        m117614b(productListQueryFragment, this.f68022c.get());
    }
}
