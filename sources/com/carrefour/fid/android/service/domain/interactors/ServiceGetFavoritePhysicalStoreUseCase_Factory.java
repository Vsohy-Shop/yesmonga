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
public final class ServiceGetFavoritePhysicalStoreUseCase_Factory implements C10324h<ServiceGetFavoritePhysicalStoreUseCase> {
    private final Provider<PhysicalStoreRepository> repositoryProvider;

    public ServiceGetFavoritePhysicalStoreUseCase_Factory(Provider<PhysicalStoreRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static ServiceGetFavoritePhysicalStoreUseCase_Factory create(Provider<PhysicalStoreRepository> provider) {
        return new ServiceGetFavoritePhysicalStoreUseCase_Factory(provider);
    }

    public static ServiceGetFavoritePhysicalStoreUseCase newInstance(PhysicalStoreRepository physicalStoreRepository) {
        return new ServiceGetFavoritePhysicalStoreUseCase(physicalStoreRepository);
    }

    public ServiceGetFavoritePhysicalStoreUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
