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
public final class ServiceGetStoreRefUseCase_Factory implements C10324h<ServiceGetStoreRefUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ServiceGetStoreRefUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ServiceGetStoreRefUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ServiceGetStoreRefUseCase_Factory(provider);
    }

    public static ServiceGetStoreRefUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ServiceGetStoreRefUseCase(serviceSelectionRepository);
    }

    public ServiceGetStoreRefUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
