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
public final class ServiceFetchDeliveryStoresUseCase_Factory implements C10324h<ServiceFetchDeliveryStoresUseCase> {
    private final Provider<StoreFacilityRepository> storeFacilityRepositoryProvider;

    public ServiceFetchDeliveryStoresUseCase_Factory(Provider<StoreFacilityRepository> provider) {
        this.storeFacilityRepositoryProvider = provider;
    }

    public static ServiceFetchDeliveryStoresUseCase_Factory create(Provider<StoreFacilityRepository> provider) {
        return new ServiceFetchDeliveryStoresUseCase_Factory(provider);
    }

    public static ServiceFetchDeliveryStoresUseCase newInstance(StoreFacilityRepository storeFacilityRepository) {
        return new ServiceFetchDeliveryStoresUseCase(storeFacilityRepository);
    }

    public ServiceFetchDeliveryStoresUseCase get() {
        return newInstance(this.storeFacilityRepositoryProvider.get());
    }
}
