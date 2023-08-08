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
public final class CatalogsGetCatalogListUseCase_Factory implements C10324h<CatalogsGetCatalogListUseCase> {
    private final Provider<CatalogRepository> catalogRepositoryProvider;

    public CatalogsGetCatalogListUseCase_Factory(Provider<CatalogRepository> provider) {
        this.catalogRepositoryProvider = provider;
    }

    public static CatalogsGetCatalogListUseCase_Factory create(Provider<CatalogRepository> provider) {
        return new CatalogsGetCatalogListUseCase_Factory(provider);
    }

    public static CatalogsGetCatalogListUseCase newInstance(CatalogRepository catalogRepository) {
        return new CatalogsGetCatalogListUseCase(catalogRepository);
    }

    public CatalogsGetCatalogListUseCase get() {
        return newInstance(this.catalogRepositoryProvider.get());
    }
}
