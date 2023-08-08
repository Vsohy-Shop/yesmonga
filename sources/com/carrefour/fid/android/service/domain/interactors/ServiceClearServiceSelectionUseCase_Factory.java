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
public final class ServiceClearServiceSelectionUseCase_Factory implements C10324h<ServiceClearServiceSelectionUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ServiceClearServiceSelectionUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ServiceClearServiceSelectionUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ServiceClearServiceSelectionUseCase_Factory(provider);
    }

    public static ServiceClearServiceSelectionUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ServiceClearServiceSelectionUseCase(serviceSelectionRepository);
    }

    public ServiceClearServiceSelectionUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
