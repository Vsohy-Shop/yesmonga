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
public final class ServiceSetFavoritePhysicalStoreUseCase_Factory implements C10324h<ServiceSetFavoritePhysicalStoreUseCase> {
    private final Provider<PhysicalStoreRepository> repositoryProvider;

    public ServiceSetFavoritePhysicalStoreUseCase_Factory(Provider<PhysicalStoreRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static ServiceSetFavoritePhysicalStoreUseCase_Factory create(Provider<PhysicalStoreRepository> provider) {
        return new ServiceSetFavoritePhysicalStoreUseCase_Factory(provider);
    }

    public static ServiceSetFavoritePhysicalStoreUseCase newInstance(PhysicalStoreRepository physicalStoreRepository) {
        return new ServiceSetFavoritePhysicalStoreUseCase(physicalStoreRepository);
    }

    public ServiceSetFavoritePhysicalStoreUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
