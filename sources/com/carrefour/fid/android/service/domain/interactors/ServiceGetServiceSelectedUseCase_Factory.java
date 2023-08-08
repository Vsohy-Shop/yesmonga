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
public final class ServiceGetServiceSelectedUseCase_Factory implements C10324h<ServiceGetServiceSelectedUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ServiceGetServiceSelectedUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ServiceGetServiceSelectedUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ServiceGetServiceSelectedUseCase_Factory(provider);
    }

    public static ServiceGetServiceSelectedUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ServiceGetServiceSelectedUseCase(serviceSelectionRepository);
    }

    public ServiceGetServiceSelectedUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
