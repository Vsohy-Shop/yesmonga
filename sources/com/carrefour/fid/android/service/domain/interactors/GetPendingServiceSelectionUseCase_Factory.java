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
public final class GetPendingServiceSelectionUseCase_Factory implements C10324h<GetPendingServiceSelectionUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public GetPendingServiceSelectionUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static GetPendingServiceSelectionUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new GetPendingServiceSelectionUseCase_Factory(provider);
    }

    public static GetPendingServiceSelectionUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new GetPendingServiceSelectionUseCase(serviceSelectionRepository);
    }

    public GetPendingServiceSelectionUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
