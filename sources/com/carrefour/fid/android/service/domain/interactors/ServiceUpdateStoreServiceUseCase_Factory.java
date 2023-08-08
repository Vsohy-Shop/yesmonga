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
public final class ServiceUpdateStoreServiceUseCase_Factory implements C10324h<ServiceUpdateStoreServiceUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ServiceUpdateStoreServiceUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ServiceUpdateStoreServiceUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ServiceUpdateStoreServiceUseCase_Factory(provider);
    }

    public static ServiceUpdateStoreServiceUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ServiceUpdateStoreServiceUseCase(serviceSelectionRepository);
    }

    public ServiceUpdateStoreServiceUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
