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
public final class CatalogsRemoveCatalogFavoriteProductUseCase_Factory implements C10324h<CatalogsRemoveCatalogFavoriteProductUseCase> {
    private final Provider<CatalogRepository> catalogRepositoryProvider;

    public CatalogsRemoveCatalogFavoriteProductUseCase_Factory(Provider<CatalogRepository> provider) {
        this.catalogRepositoryProvider = provider;
    }

    public static CatalogsRemoveCatalogFavoriteProductUseCase_Factory create(Provider<CatalogRepository> provider) {
        return new CatalogsRemoveCatalogFavoriteProductUseCase_Factory(provider);
    }

    public static CatalogsRemoveCatalogFavoriteProductUseCase newInstance(CatalogRepository catalogRepository) {
        return new CatalogsRemoveCatalogFavoriteProductUseCase(catalogRepository);
    }

    public CatalogsRemoveCatalogFavoriteProductUseCase get() {
        return newInstance(this.catalogRepositoryProvider.get());
    }
}
