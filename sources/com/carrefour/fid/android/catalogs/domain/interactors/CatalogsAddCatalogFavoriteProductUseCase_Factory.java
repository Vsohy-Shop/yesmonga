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
public final class CatalogsAddCatalogFavoriteProductUseCase_Factory implements C10324h<CatalogsAddCatalogFavoriteProductUseCase> {
    private final Provider<CatalogRepository> catalogRepositoryProvider;

    public CatalogsAddCatalogFavoriteProductUseCase_Factory(Provider<CatalogRepository> provider) {
        this.catalogRepositoryProvider = provider;
    }

    public static CatalogsAddCatalogFavoriteProductUseCase_Factory create(Provider<CatalogRepository> provider) {
        return new CatalogsAddCatalogFavoriteProductUseCase_Factory(provider);
    }

    public static CatalogsAddCatalogFavoriteProductUseCase newInstance(CatalogRepository catalogRepository) {
        return new CatalogsAddCatalogFavoriteProductUseCase(catalogRepository);
    }

    public CatalogsAddCatalogFavoriteProductUseCase get() {
        return newInstance(this.catalogRepositoryProvider.get());
    }
}
