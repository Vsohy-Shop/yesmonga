package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ServiceGetPromiseUseCase_Factory implements C10324h<ServiceGetPromiseUseCase> {
    private final Provider<C37807b> remoteConfigRepositoryProvider;

    public ServiceGetPromiseUseCase_Factory(Provider<C37807b> provider) {
        this.remoteConfigRepositoryProvider = provider;
    }

    public static ServiceGetPromiseUseCase_Factory create(Provider<C37807b> provider) {
        return new ServiceGetPromiseUseCase_Factory(provider);
    }

    public static ServiceGetPromiseUseCase newInstance(C37807b bVar) {
        return new ServiceGetPromiseUseCase(bVar);
    }

    public ServiceGetPromiseUseCase get() {
        return newInstance(this.remoteConfigRepositoryProvider.get());
    }
}
