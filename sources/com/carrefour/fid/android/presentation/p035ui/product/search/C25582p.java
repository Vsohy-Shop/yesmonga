package com.carrefour.fid.android.presentation.p035ui.product.search;

import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27264a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.p */
public final class C25582p implements C10158g<ProductSearchFragment> {

    /* renamed from: a */
    public final Provider<C27264a> f62860a;

    /* renamed from: b */
    public final Provider<AppPreferencesStorage> f62861b;

    public C25582p(Provider<C27264a> provider, Provider<AppPreferencesStorage> provider2) {
        this.f62860a = provider;
        this.f62861b = provider2;
    }

    /* renamed from: a */
    public static C10158g<ProductSearchFragment> m110171a(Provider<C27264a> provider, Provider<AppPreferencesStorage> provider2) {
        return new C25582p(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.ProductSearchFragment.appPreferencesStorage")
    /* renamed from: b */
    public static void m110172b(ProductSearchFragment productSearchFragment, AppPreferencesStorage appPreferencesStorage) {
        productSearchFragment.f62786v = appPreferencesStorage;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.ProductSearchFragment.productSearchAnalyticsViewModel")
    /* renamed from: d */
    public static void m110173d(ProductSearchFragment productSearchFragment, C27264a aVar) {
        productSearchFragment.f62785g = aVar;
    }

    /* renamed from: c */
    public void injectMembers(ProductSearchFragment productSearchFragment) {
        m110173d(productSearchFragment, this.f62860a.get());
        m110172b(productSearchFragment, this.f62861b.get());
    }
}
