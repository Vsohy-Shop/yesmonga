package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.product.domain.repositories.b */
public final class C27596b implements C10324h<FacetRepository> {

    /* renamed from: a */
    public final Provider<FacetProductCountDataSource> f67059a;

    public C27596b(Provider<FacetProductCountDataSource> provider) {
        this.f67059a = provider;
    }

    /* renamed from: a */
    public static C27596b m116159a(Provider<FacetProductCountDataSource> provider) {
        return new C27596b(provider);
    }

    /* renamed from: c */
    public static FacetRepository m116160c(FacetProductCountDataSource facetProductCountDataSource) {
        return new FacetRepository(facetProductCountDataSource);
    }

    /* renamed from: b */
    public FacetRepository get() {
        return m116160c(this.f67059a.get());
    }
}
