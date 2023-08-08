package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ServiceGetFacilityDetailsByAnabelKeyUseCase_Factory implements C10324h<ServiceGetFacilityDetailsByAnabelKeyUseCase> {
    private final Provider<StoreFacilityRepository> repositoryProvider;

    public ServiceGetFacilityDetailsByAnabelKeyUseCase_Factory(Provider<StoreFacilityRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static ServiceGetFacilityDetailsByAnabelKeyUseCase_Factory create(Provider<StoreFacilityRepository> provider) {
        return new ServiceGetFacilityDetailsByAnabelKeyUseCase_Factory(provider);
    }

    public static ServiceGetFacilityDetailsByAnabelKeyUseCase newInstance(StoreFacilityRepository storeFacilityRepository) {
        return new ServiceGetFacilityDetailsByAnabelKeyUseCase(storeFacilityRepository);
    }

    public ServiceGetFacilityDetailsByAnabelKeyUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
