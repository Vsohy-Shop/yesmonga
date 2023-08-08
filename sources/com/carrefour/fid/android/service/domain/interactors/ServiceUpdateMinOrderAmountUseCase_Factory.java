package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ServiceUpdateMinOrderAmountUseCase_Factory implements C10324h<ServiceUpdateMinOrderAmountUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;
    private final Provider<StoreFacilityRepository> storeFacilityRepositoryProvider;

    public ServiceUpdateMinOrderAmountUseCase_Factory(Provider<ServiceSelectionRepository> provider, Provider<StoreFacilityRepository> provider2) {
        this.serviceSelectionRepositoryProvider = provider;
        this.storeFacilityRepositoryProvider = provider2;
    }

    public static ServiceUpdateMinOrderAmountUseCase_Factory create(Provider<ServiceSelectionRepository> provider, Provider<StoreFacilityRepository> provider2) {
        return new ServiceUpdateMinOrderAmountUseCase_Factory(provider, provider2);
    }

    public static ServiceUpdateMinOrderAmountUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository, StoreFacilityRepository storeFacilityRepository) {
        return new ServiceUpdateMinOrderAmountUseCase(serviceSelectionRepository, storeFacilityRepository);
    }

    public ServiceUpdateMinOrderAmountUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get(), this.storeFacilityRepositoryProvider.get());
    }
}
