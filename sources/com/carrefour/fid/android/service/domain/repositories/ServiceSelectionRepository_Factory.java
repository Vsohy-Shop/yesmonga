package com.carrefour.fid.android.service.domain.repositories;

import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
public final class ServiceSelectionRepository_Factory implements C10324h<ServiceSelectionRepository> {
    private final Provider<ServiceSelectionRepository.ServicePersistence> servicePersistenceProvider;

    public ServiceSelectionRepository_Factory(Provider<ServiceSelectionRepository.ServicePersistence> provider) {
        this.servicePersistenceProvider = provider;
    }

    public static ServiceSelectionRepository_Factory create(Provider<ServiceSelectionRepository.ServicePersistence> provider) {
        return new ServiceSelectionRepository_Factory(provider);
    }

    public static ServiceSelectionRepository newInstance(ServiceSelectionRepository.ServicePersistence servicePersistence) {
        return new ServiceSelectionRepository(servicePersistence);
    }

    public ServiceSelectionRepository get() {
        return newInstance(this.servicePersistenceProvider.get());
    }
}
