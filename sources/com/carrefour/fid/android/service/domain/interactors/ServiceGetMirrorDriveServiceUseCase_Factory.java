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
public final class ServiceGetMirrorDriveServiceUseCase_Factory implements C10324h<ServiceGetMirrorDriveServiceUseCase> {
    private final Provider<StoreFacilityRepository> repositoryProvider;

    public ServiceGetMirrorDriveServiceUseCase_Factory(Provider<StoreFacilityRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static ServiceGetMirrorDriveServiceUseCase_Factory create(Provider<StoreFacilityRepository> provider) {
        return new ServiceGetMirrorDriveServiceUseCase_Factory(provider);
    }

    public static ServiceGetMirrorDriveServiceUseCase newInstance(StoreFacilityRepository storeFacilityRepository) {
        return new ServiceGetMirrorDriveServiceUseCase(storeFacilityRepository);
    }

    public ServiceGetMirrorDriveServiceUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
