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
public final class ServiceIsServiceOpenUseCase_Factory implements C10324h<ServiceIsServiceOpenUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;
    private final Provider<StoreFacilityRepository> storeFacilityRepositoryProvider;

    public ServiceIsServiceOpenUseCase_Factory(Provider<ServiceSelectionRepository> provider, Provider<StoreFacilityRepository> provider2) {
        this.serviceSelectionRepositoryProvider = provider;
        this.storeFacilityRepositoryProvider = provider2;
    }

    public static ServiceIsServiceOpenUseCase_Factory create(Provider<ServiceSelectionRepository> provider, Provider<StoreFacilityRepository> provider2) {
        return new ServiceIsServiceOpenUseCase_Factory(provider, provider2);
    }

    public static ServiceIsServiceOpenUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository, StoreFacilityRepository storeFacilityRepository) {
        return new ServiceIsServiceOpenUseCase(serviceSelectionRepository, storeFacilityRepository);
    }

    public ServiceIsServiceOpenUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get(), this.storeFacilityRepositoryProvider.get());
    }
}
