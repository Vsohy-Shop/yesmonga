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
public final class CatalogsGetCatalogFavoriteProductsUseCase_Factory implements C10324h<CatalogsGetCatalogFavoriteProductsUseCase> {
    private final Provider<CatalogRepository> catalogRepositoryProvider;

    public CatalogsGetCatalogFavoriteProductsUseCase_Factory(Provider<CatalogRepository> provider) {
        this.catalogRepositoryProvider = provider;
    }

    public static CatalogsGetCatalogFavoriteProductsUseCase_Factory create(Provider<CatalogRepository> provider) {
        return new CatalogsGetCatalogFavoriteProductsUseCase_Factory(provider);
    }

    public static CatalogsGetCatalogFavoriteProductsUseCase newInstance(CatalogRepository catalogRepository) {
        return new CatalogsGetCatalogFavoriteProductsUseCase(catalogRepository);
    }

    public CatalogsGetCatalogFavoriteProductsUseCase get() {
        return newInstance(this.catalogRepositoryProvider.get());
    }
}
