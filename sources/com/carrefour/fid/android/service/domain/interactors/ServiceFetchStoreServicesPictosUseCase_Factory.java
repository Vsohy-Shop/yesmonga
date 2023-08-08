package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ServiceFetchStoreServicesPictosUseCase_Factory implements C10324h<ServiceFetchStoreServicesPictosUseCase> {
    private final Provider<StoreFacilityRepository> storeFacilityRepositoryProvider;

    public ServiceFetchStoreServicesPictosUseCase_Factory(Provider<StoreFacilityRepository> provider) {
        this.storeFacilityRepositoryProvider = provider;
    }

    public static ServiceFetchStoreServicesPictosUseCase_Factory create(Provider<StoreFacilityRepository> provider) {
        return new ServiceFetchStoreServicesPictosUseCase_Factory(provider);
    }

    public static ServiceFetchStoreServicesPictosUseCase newInstance(StoreFacilityRepository storeFacilityRepository) {
        return new ServiceFetchStoreServicesPictosUseCase(storeFacilityRepository);
    }

    public ServiceFetchStoreServicesPictosUseCase get() {
        return newInstance(this.storeFacilityRepositoryProvider.get());
    }
}
