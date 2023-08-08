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
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.l */
public final class C28056l implements C10158g<ProductListDepartmentFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f67967a;

    /* renamed from: b */
    public final Provider<PlpProductAnalytics> f67968b;

    /* renamed from: c */
    public final Provider<C28936j> f67969c;

    public C28056l(Provider<C28796c> provider, Provider<PlpProductAnalytics> provider2, Provider<C28936j> provider3) {
        this.f67967a = provider;
        this.f67968b = provider2;
        this.f67969c = provider3;
    }

    /* renamed from: a */
    public static C10158g<ProductListDepartmentFragment> m117556a(Provider<C28796c> provider, Provider<PlpProductAnalytics> provider2, Provider<C28936j> provider3) {
        return new C28056l(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListDepartmentFragment.fragmentUtil")
    /* renamed from: b */
    public static void m117557b(ProductListDepartmentFragment productListDepartmentFragment, C28936j jVar) {
        productListDepartmentFragment.f67895y = jVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListDepartmentFragment.navigator")
    /* renamed from: d */
    public static void m117558d(ProductListDepartmentFragment productListDepartmentFragment, C28796c cVar) {
        productListDepartmentFragment.f67893w = cVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.list.ProductListDepartmentFragment.plpProductAnalytics")
    /* renamed from: e */
    public static void m117559e(ProductListDepartmentFragment productListDepartmentFragment, PlpProductAnalytics plpProductAnalytics) {
        productListDepartmentFragment.f67894x = plpProductAnalytics;
    }

    /* renamed from: c */
    public void injectMembers(ProductListDepartmentFragment productListDepartmentFragment) {
        m117558d(productListDepartmentFragment, this.f67967a.get());
        m117559e(productListDepartmentFragment, this.f67968b.get());
        m117557b(productListDepartmentFragment, this.f67969c.get());
    }
}
