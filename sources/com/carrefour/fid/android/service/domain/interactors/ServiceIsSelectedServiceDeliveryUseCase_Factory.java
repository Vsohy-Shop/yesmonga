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
public final class ServiceIsSelectedServiceDeliveryUseCase_Factory implements C10324h<ServiceIsSelectedServiceDeliveryUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ServiceIsSelectedServiceDeliveryUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ServiceIsSelectedServiceDeliveryUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ServiceIsSelectedServiceDeliveryUseCase_Factory(provider);
    }

    public static ServiceIsSelectedServiceDeliveryUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ServiceIsSelectedServiceDeliveryUseCase(serviceSelectionRepository);
    }

    public ServiceIsSelectedServiceDeliveryUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
