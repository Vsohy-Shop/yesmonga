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
public final class SetPendingServiceSelectionUseCase_Factory implements C10324h<SetPendingServiceSelectionUseCase> {
    private final Provider<ServiceSelectionRepository> serviceSelectionRepositoryProvider;

    public SetPendingServiceSelectionUseCase_Factory(Provider<ServiceSelectionRepository> provider) {
        this.serviceSelectionRepositoryProvider = provider;
    }

    public static SetPendingServiceSelectionUseCase_Factory create(Provider<ServiceSelectionRepository> provider) {
        return new SetPendingServiceSelectionUseCase_Factory(provider);
    }

    public static SetPendingServiceSelectionUseCase newInstance(ServiceSelectionRepository serviceSelectionRepository) {
        return new SetPendingServiceSelectionUseCase(serviceSelectionRepository);
    }

    public SetPendingServiceSelectionUseCase get() {
        return newInstance(this.serviceSelectionRepositoryProvider.get());
    }
}
