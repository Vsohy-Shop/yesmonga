package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ServiceClearFavoritePhysicalStoreUseCase_Factory implements C10324h<ServiceClearFavoritePhysicalStoreUseCase> {
    private final Provider<PhysicalStoreRepository> repositoryProvider;

    public ServiceClearFavoritePhysicalStoreUseCase_Factory(Provider<PhysicalStoreRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static ServiceClearFavoritePhysicalStoreUseCase_Factory create(Provider<PhysicalStoreRepository> provider) {
        return new ServiceClearFavoritePhysicalStoreUseCase_Factory(provider);
    }

    public static ServiceClearFavoritePhysicalStoreUseCase newInstance(PhysicalStoreRepository physicalStoreRepository) {
        return new ServiceClearFavoritePhysicalStoreUseCase(physicalStoreRepository);
    }

    public ServiceClearFavoritePhysicalStoreUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
