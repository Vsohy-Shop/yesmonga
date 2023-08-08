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
public final class CatalogsRemoveCatalogFavoriteListUseCase_Factory implements C10324h<CatalogsRemoveCatalogFavoriteListUseCase> {
    private final Provider<CatalogRepository> catalogRepositoryProvider;

    public CatalogsRemoveCatalogFavoriteListUseCase_Factory(Provider<CatalogRepository> provider) {
        this.catalogRepositoryProvider = provider;
    }

    public static CatalogsRemoveCatalogFavoriteListUseCase_Factory create(Provider<CatalogRepository> provider) {
        return new CatalogsRemoveCatalogFavoriteListUseCase_Factory(provider);
    }

    public static CatalogsRemoveCatalogFavoriteListUseCase newInstance(CatalogRepository catalogRepository) {
        return new CatalogsRemoveCatalogFavoriteListUseCase(catalogRepository);
    }

    public CatalogsRemoveCatalogFavoriteListUseCase get() {
        return newInstance(this.catalogRepositoryProvider.get());
    }
}
