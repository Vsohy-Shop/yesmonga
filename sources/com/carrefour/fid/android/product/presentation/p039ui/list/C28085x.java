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
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.x */
public final class C28085x implements C10158g<ProductListSearchFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f68026a;

    /* renamed from: b */
    public final Provider<PlpProductAnalytics> f68027b;

    /* renamed from: c */
    public final Provider<C28936j> f68028c;

    public C28085x(Provider<C28796c> provider, Provider<PlpProductAnalytics> provider2, Provider<C28936j> provider3) {
        this.f68026a = provider;
        this.f68027b = provider2;
        this.f68028c = provider3;
    }

    /* renamed from: a */
    public static C10158g<ProductListSearchFragment> m117620a(Provider<C28796c> provider, Provider<PlpProductAnalytics> provider2, Provider<C28936j> provider3) {
        return new C28085x(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListSearchFragment.fragmentUtil")
    /* renamed from: b */
    public static void m117621b(ProductListSearchFragment productListSearchFragment, C28936j jVar) {
        productListSearchFragment.f67924y = jVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListSearchFragment.navigator")
    /* renamed from: d */
    public static void m117622d(ProductListSearchFragment productListSearchFragment, C28796c cVar) {
        productListSearchFragment.f67922w = cVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListSearchFragment.plpProductAnalytics")
    /* renamed from: e */
    public static void m117623e(ProductListSearchFragment productListSearchFragment, PlpProductAnalytics plpProductAnalytics) {
        productListSearchFragment.f67923x = plpProductAnalytics;
    }

    /* renamed from: c */
    public void injectMembers(ProductListSearchFragment productListSearchFragment) {
        m117622d(productListSearchFragment, this.f68026a.get());
        m117623e(productListSearchFragment, this.f68027b.get());
        m117621b(productListSearchFragment, this.f68028c.get());
    }
}
