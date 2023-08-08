package com.carrefour.fid.android.presentation.p035ui.product.filter;

import com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.l */
public final class C25449l implements C10158g<ProductListFiltersSortAndFacetFragment> {

    /* renamed from: a */
    public final Provider<ProductListFiltersViewModel> f62608a;

    public C25449l(Provider<ProductListFiltersViewModel> provider) {
        this.f62608a = provider;
    }

    /* renamed from: a */
    public static C10158g<ProductListFiltersSortAndFacetFragment> m109795a(Provider<ProductListFiltersViewModel> provider) {
        return new C25449l(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersSortAndFacetFragment.productListFiltersViewModel")
    /* renamed from: c */
    public static void m109796c(ProductListFiltersSortAndFacetFragment productListFiltersSortAndFacetFragment, ProductListFiltersViewModel productListFiltersViewModel) {
        productListFiltersSortAndFacetFragment.f62557f = productListFiltersViewModel;
    }

    /* renamed from: b */
    public void injectMembers(ProductListFiltersSortAndFacetFragment productListFiltersSortAndFacetFragment) {
        m109796c(productListFiltersSortAndFacetFragment, this.f62608a.get());
    }
}
