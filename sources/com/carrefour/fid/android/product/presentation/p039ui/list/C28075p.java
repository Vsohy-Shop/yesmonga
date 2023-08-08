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
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.p */
public final class C28075p implements C10158g<ProductListPromoFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f68014a;

    /* renamed from: b */
    public final Provider<PlpProductAnalytics> f68015b;

    /* renamed from: c */
    public final Provider<C28936j> f68016c;

    public C28075p(Provider<C28796c> provider, Provider<PlpProductAnalytics> provider2, Provider<C28936j> provider3) {
        this.f68014a = provider;
        this.f68015b = provider2;
        this.f68016c = provider3;
    }

    /* renamed from: a */
    public static C10158g<ProductListPromoFragment> m117606a(Provider<C28796c> provider, Provider<PlpProductAnalytics> provider2, Provider<C28936j> provider3) {
        return new C28075p(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListPromoFragment.fragmentUtil")
    /* renamed from: b */
    public static void m117607b(ProductListPromoFragment productListPromoFragment, C28936j jVar) {
        productListPromoFragment.f67904x = jVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListPromoFragment.navigator")
    /* renamed from: d */
    public static void m117608d(ProductListPromoFragment productListPromoFragment, C28796c cVar) {
        productListPromoFragment.f67902v = cVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListPromoFragment.plpProductAnalytics")
    /* renamed from: e */
    public static void m117609e(ProductListPromoFragment productListPromoFragment, PlpProductAnalytics plpProductAnalytics) {
        productListPromoFragment.f67903w = plpProductAnalytics;
    }

    /* renamed from: c */
    public void injectMembers(ProductListPromoFragment productListPromoFragment) {
        m117608d(productListPromoFragment, this.f68014a.get());
        m117609e(productListPromoFragment, this.f68015b.get());
        m117607b(productListPromoFragment, this.f68016c.get());
    }
}
