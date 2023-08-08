package com.carrefour.fid.android.catalogs.data.repositories;

import com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource;
import com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.data.repositories.a */
public final class C39409a implements C10324h<CatalogRepository> {

    /* renamed from: a */
    public final Provider<CatalogsRemoteDataSource> f100787a;

    /* renamed from: b */
    public final Provider<CatalogsLocalDataSource> f100788b;

    public C39409a(Provider<CatalogsRemoteDataSource> provider, Provider<CatalogsLocalDataSource> provider2) {
        this.f100787a = provider;
        this.f100788b = provider2;
    }

    /* renamed from: a */
    public static C39409a m161526a(Provider<CatalogsRemoteDataSource> provider, Provider<CatalogsLocalDataSource> provider2) {
        return new C39409a(provider, provider2);
    }

    /* renamed from: c */
    public static CatalogRepository m161527c(CatalogsRemoteDataSource catalogsRemoteDataSource, CatalogsLocalDataSource catalogsLocalDataSource) {
        return new CatalogRepository(catalogsRemoteDataSource, catalogsLocalDataSource);
    }

    /* renamed from: b */
    public CatalogRepository get() {
        return m161527c(this.f100787a.get(), this.f100788b.get());
    }
}
