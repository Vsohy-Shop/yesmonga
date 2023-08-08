package com.carrefour.fid.android.catalogs.domain.interactors;

import com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class CatalogsGetCatalogDetailsUseCase_Factory implements C10324h<CatalogsGetCatalogDetailsUseCase> {
    private final Provider<CatalogRepository> catalogRepositoryProvider;

    public CatalogsGetCatalogDetailsUseCase_Factory(Provider<CatalogRepository> provider) {
        this.catalogRepositoryProvider = provider;
    }

    public static CatalogsGetCatalogDetailsUseCase_Factory create(Provider<CatalogRepository> provider) {
        return new CatalogsGetCatalogDetailsUseCase_Factory(provider);
    }

    public static CatalogsGetCatalogDetailsUseCase newInstance(CatalogRepository catalogRepository) {
        return new CatalogsGetCatalogDetailsUseCase(catalogRepository);
    }

    public CatalogsGetCatalogDetailsUseCase get() {
        return newInstance(this.catalogRepositoryProvider.get());
    }
}
