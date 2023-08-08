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
public final class ServiceGetServiceSelectionUseCase_Factory implements C10324h<ServiceGetServiceSelectionUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ServiceGetServiceSelectionUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ServiceGetServiceSelectionUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ServiceGetServiceSelectionUseCase_Factory(provider);
    }

    public static ServiceGetServiceSelectionUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ServiceGetServiceSelectionUseCase(serviceSelectionRepository);
    }

    public ServiceGetServiceSelectionUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
