package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ServiceIsPreviousSelectedServiceDifferentUseCase_Factory implements C10324h<ServiceIsPreviousSelectedServiceDifferentUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ServiceIsPreviousSelectedServiceDifferentUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ServiceIsPreviousSelectedServiceDifferentUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ServiceIsPreviousSelectedServiceDifferentUseCase_Factory(provider);
    }

    public static ServiceIsPreviousSelectedServiceDifferentUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ServiceIsPreviousSelectedServiceDifferentUseCase(serviceSelectionRepository);
    }

    public ServiceIsPreviousSelectedServiceDifferentUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
