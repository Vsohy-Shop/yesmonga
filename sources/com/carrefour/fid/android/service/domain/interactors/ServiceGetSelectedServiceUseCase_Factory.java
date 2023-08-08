package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ServiceGetSelectedServiceUseCase_Factory implements C10324h<ServiceGetSelectedServiceUseCase> {
    private final Provider<C37823k> getServiceSelectionUseCaseProvider;

    public ServiceGetSelectedServiceUseCase_Factory(Provider<C37823k> provider) {
        this.getServiceSelectionUseCaseProvider = provider;
    }

    public static ServiceGetSelectedServiceUseCase_Factory create(Provider<C37823k> provider) {
        return new ServiceGetSelectedServiceUseCase_Factory(provider);
    }

    public static ServiceGetSelectedServiceUseCase newInstance(C37823k kVar) {
        return new ServiceGetSelectedServiceUseCase(kVar);
    }

    public ServiceGetSelectedServiceUseCase get() {
        return newInstance(this.getServiceSelectionUseCaseProvider.get());
    }
}
