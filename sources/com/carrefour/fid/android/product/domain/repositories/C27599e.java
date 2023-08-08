package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.C12074o0;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.RepositoryScope"})
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.repositories.e */
public final class C27599e implements C10324h<PlpProductRepository> {

    /* renamed from: a */
    public final Provider<PlpProductListDataSource> f67063a;

    /* renamed from: b */
    public final Provider<FacetRepository> f67064b;

    /* renamed from: c */
    public final Provider<C12074o0> f67065c;

    public C27599e(Provider<PlpProductListDataSource> provider, Provider<FacetRepository> provider2, Provider<C12074o0> provider3) {
        this.f67063a = provider;
        this.f67064b = provider2;
        this.f67065c = provider3;
    }

    /* renamed from: a */
    public static C27599e m116166a(Provider<PlpProductListDataSource> provider, Provider<FacetRepository> provider2, Provider<C12074o0> provider3) {
        return new C27599e(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static PlpProductRepository m116167c(PlpProductListDataSource plpProductListDataSource, FacetRepository facetRepository, C12074o0 o0Var) {
        return new PlpProductRepository(plpProductListDataSource, facetRepository, o0Var);
    }

    /* renamed from: b */
    public PlpProductRepository get() {
        return m116167c(this.f67063a.get(), this.f67064b.get(), this.f67065c.get());
    }
}
