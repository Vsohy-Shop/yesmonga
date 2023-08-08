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
public final class ServiceGetStoreServiceTypeSelectedUseCase_Factory implements C10324h<ServiceGetStoreServiceTypeSelectedUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ServiceGetStoreServiceTypeSelectedUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ServiceGetStoreServiceTypeSelectedUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ServiceGetStoreServiceTypeSelectedUseCase_Factory(provider);
    }

    public static ServiceGetStoreServiceTypeSelectedUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ServiceGetStoreServiceTypeSelectedUseCase(serviceSelectionRepository);
    }

    public ServiceGetStoreServiceTypeSelectedUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
