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
public final class ServiceSetServiceSelectionUseCase_Factory implements C10324h<ServiceSetServiceSelectionUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ServiceSetServiceSelectionUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ServiceSetServiceSelectionUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ServiceSetServiceSelectionUseCase_Factory(provider);
    }

    public static ServiceSetServiceSelectionUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ServiceSetServiceSelectionUseCase(serviceSelectionRepository);
    }

    public ServiceSetServiceSelectionUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
