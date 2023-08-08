package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource;
import com.carrefour.fid.android.product.domain.model.C27587e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.repositories.d */
public final class C27598d implements C10324h<PlpProductPagingSource> {

    /* renamed from: a */
    public final Provider<C27587e> f67060a;

    /* renamed from: b */
    public final Provider<PlpProductListDataSource> f67061b;

    /* renamed from: c */
    public final Provider<FacetRepository> f67062c;

    public C27598d(Provider<C27587e> provider, Provider<PlpProductListDataSource> provider2, Provider<FacetRepository> provider3) {
        this.f67060a = provider;
        this.f67061b = provider2;
        this.f67062c = provider3;
    }

    /* renamed from: a */
    public static C27598d m116163a(Provider<C27587e> provider, Provider<PlpProductListDataSource> provider2, Provider<FacetRepository> provider3) {
        return new C27598d(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static PlpProductPagingSource m116164c(C27587e eVar, PlpProductListDataSource plpProductListDataSource, FacetRepository facetRepository) {
        return new PlpProductPagingSource(eVar, plpProductListDataSource, facetRepository);
    }

    /* renamed from: b */
    public PlpProductPagingSource get() {
        return m116164c(this.f67060a.get(), this.f67061b.get(), this.f67062c.get());
    }
}
