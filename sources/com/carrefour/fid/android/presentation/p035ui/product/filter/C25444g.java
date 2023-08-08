package com.carrefour.fid.android.presentation.p035ui.product.filter;

import com.carrefour.fid.android.presentation.viewmodels.product.filter.C27177a;
import com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.g */
public final class C25444g implements C10158g<ProductListFiltersDialogFragment> {

    /* renamed from: a */
    public final Provider<ProductListFiltersViewModel> f62603a;

    /* renamed from: b */
    public final Provider<C27177a> f62604b;

    public C25444g(Provider<ProductListFiltersViewModel> provider, Provider<C27177a> provider2) {
        this.f62603a = provider;
        this.f62604b = provider2;
    }

    /* renamed from: a */
    public static C10158g<ProductListFiltersDialogFragment> m109790a(Provider<ProductListFiltersViewModel> provider, Provider<C27177a> provider2) {
        return new C25444g(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersDialogFragment.productListFiltersAnalyticsViewModel")
    /* renamed from: c */
    public static void m109791c(ProductListFiltersDialogFragment productListFiltersDialogFragment, C27177a aVar) {
        productListFiltersDialogFragment.f62542x = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersDialogFragment.productListFiltersViewModel")
    /* renamed from: d */
    public static void m109792d(ProductListFiltersDialogFragment productListFiltersDialogFragment, ProductListFiltersViewModel productListFiltersViewModel) {
        productListFiltersDialogFragment.f62541w = productListFiltersViewModel;
    }

    /* renamed from: b */
    public void injectMembers(ProductListFiltersDialogFragment productListFiltersDialogFragment) {
        m109792d(productListFiltersDialogFragment, this.f62603a.get());
        m109791c(productListFiltersDialogFragment, this.f62604b.get());
    }
}
