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
public final class ApplyPendingServiceSelectionUseCase_Factory implements C10324h<ApplyPendingServiceSelectionUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public ApplyPendingServiceSelectionUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static ApplyPendingServiceSelectionUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new ApplyPendingServiceSelectionUseCase_Factory(provider);
    }

    public static ApplyPendingServiceSelectionUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new ApplyPendingServiceSelectionUseCase(serviceSelectionRepository);
    }

    public ApplyPendingServiceSelectionUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
