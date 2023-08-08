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
public final class FetchDriveUseCase_Factory implements C10324h<FetchDriveUseCase> {
    private final Provider<StoreFacilityRepository> storeFacilityRepositoryProvider;

    public FetchDriveUseCase_Factory(Provider<StoreFacilityRepository> provider) {
        this.storeFacilityRepositoryProvider = provider;
    }

    public static FetchDriveUseCase_Factory create(Provider<StoreFacilityRepository> provider) {
        return new FetchDriveUseCase_Factory(provider);
    }

    public static FetchDriveUseCase newInstance(StoreFacilityRepository storeFacilityRepository) {
        return new FetchDriveUseCase(storeFacilityRepository);
    }

    public FetchDriveUseCase get() {
        return newInstance(this.storeFacilityRepositoryProvider.get());
    }
}
