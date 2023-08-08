package com.carrefour.fid.android.presentation.p035ui.product.search;

import com.carrefour.fid.android.presentation.viewmodels.product.search.C27264a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.v */
public final class C25689v implements C10158g<ProductSearchWithListFragment> {

    /* renamed from: a */
    public final Provider<C27264a> f62983a;

    public C25689v(Provider<C27264a> provider) {
        this.f62983a = provider;
    }

    /* renamed from: a */
    public static C10158g<ProductSearchWithListFragment> m110359a(Provider<C27264a> provider) {
        return new C25689v(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.ProductSearchWithListFragment.productSearchAnalyticsViewModel")
    /* renamed from: c */
    public static void m110360c(ProductSearchWithListFragment productSearchWithListFragment, C27264a aVar) {
        productSearchWithListFragment.f62801v = aVar;
    }

    /* renamed from: b */
    public void injectMembers(ProductSearchWithListFragment productSearchWithListFragment) {
        m110360c(productSearchWithListFragment, this.f62983a.get());
    }
}
