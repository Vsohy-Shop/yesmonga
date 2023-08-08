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
public final class ServiceIsServiceSelectedUseCase_Factory implements C10324h<ServiceIsServiceSelectedUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ServiceIsServiceSelectedUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ServiceIsServiceSelectedUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ServiceIsServiceSelectedUseCase_Factory(provider);
    }

    public static ServiceIsServiceSelectedUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ServiceIsServiceSelectedUseCase(serviceSelectionRepository);
    }

    public ServiceIsServiceSelectedUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
