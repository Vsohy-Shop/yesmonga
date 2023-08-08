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
public final class ServiceObserveServiceSelectionUseCase_Factory implements C10324h<ServiceObserveServiceSelectionUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ServiceObserveServiceSelectionUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ServiceObserveServiceSelectionUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ServiceObserveServiceSelectionUseCase_Factory(provider);
    }

    public static ServiceObserveServiceSelectionUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ServiceObserveServiceSelectionUseCase(serviceSelectionRepository);
    }

    public ServiceObserveServiceSelectionUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
