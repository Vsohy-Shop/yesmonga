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
public final class GetMinimumOrderAmountUseCase_Factory implements C10324h<GetMinimumOrderAmountUseCase> {
    private final Provider<StoreFacilityRepository> storeFacilityRepositoryProvider;

    public GetMinimumOrderAmountUseCase_Factory(Provider<StoreFacilityRepository> provider) {
        this.storeFacilityRepositoryProvider = provider;
    }

    public static GetMinimumOrderAmountUseCase_Factory create(Provider<StoreFacilityRepository> provider) {
        return new GetMinimumOrderAmountUseCase_Factory(provider);
    }

    public static GetMinimumOrderAmountUseCase newInstance(StoreFacilityRepository storeFacilityRepository) {
        return new GetMinimumOrderAmountUseCase(storeFacilityRepository);
    }

    public GetMinimumOrderAmountUseCase get() {
        return newInstance(this.storeFacilityRepositoryProvider.get());
    }
}
