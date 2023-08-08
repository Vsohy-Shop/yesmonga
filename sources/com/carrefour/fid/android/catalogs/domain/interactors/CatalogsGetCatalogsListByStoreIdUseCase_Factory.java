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
public final class CatalogsGetCatalogsListByStoreIdUseCase_Factory implements C10324h<CatalogsGetCatalogsListByStoreIdUseCase> {
    private final Provider<CatalogRepository> catalogRepositoryProvider;

    public CatalogsGetCatalogsListByStoreIdUseCase_Factory(Provider<CatalogRepository> provider) {
        this.catalogRepositoryProvider = provider;
    }

    public static CatalogsGetCatalogsListByStoreIdUseCase_Factory create(Provider<CatalogRepository> provider) {
        return new CatalogsGetCatalogsListByStoreIdUseCase_Factory(provider);
    }

    public static CatalogsGetCatalogsListByStoreIdUseCase newInstance(CatalogRepository catalogRepository) {
        return new CatalogsGetCatalogsListByStoreIdUseCase(catalogRepository);
    }

    public CatalogsGetCatalogsListByStoreIdUseCase get() {
        return newInstance(this.catalogRepositoryProvider.get());
    }
}
