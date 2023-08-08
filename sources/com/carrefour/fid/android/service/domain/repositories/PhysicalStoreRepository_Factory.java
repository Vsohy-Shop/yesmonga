package com.carrefour.fid.android.service.domain.repositories;

import com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
public final class PhysicalStoreRepository_Factory implements C10324h<PhysicalStoreRepository> {
    private final Provider<PhysicalStoreRepository.PhysicalStorePersistence> persistenceProvider;

    public PhysicalStoreRepository_Factory(Provider<PhysicalStoreRepository.PhysicalStorePersistence> provider) {
        this.persistenceProvider = provider;
    }

    public static PhysicalStoreRepository_Factory create(Provider<PhysicalStoreRepository.PhysicalStorePersistence> provider) {
        return new PhysicalStoreRepository_Factory(provider);
    }

    public static PhysicalStoreRepository newInstance(PhysicalStoreRepository.PhysicalStorePersistence physicalStorePersistence) {
        return new PhysicalStoreRepository(physicalStorePersistence);
    }

    public PhysicalStoreRepository get() {
        return newInstance(this.persistenceProvider.get());
    }
}
