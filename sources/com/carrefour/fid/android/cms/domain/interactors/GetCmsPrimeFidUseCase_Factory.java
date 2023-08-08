package com.carrefour.fid.android.cms.domain.interactors;

import com.carrefour.fid.android.cms.domain.repositories.CmsRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class GetCmsPrimeFidUseCase_Factory implements C10324h<GetCmsPrimeFidUseCase> {
    private final Provider<CmsRepository> repositoryProvider;

    public GetCmsPrimeFidUseCase_Factory(Provider<CmsRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetCmsPrimeFidUseCase_Factory create(Provider<CmsRepository> provider) {
        return new GetCmsPrimeFidUseCase_Factory(provider);
    }

    public static GetCmsPrimeFidUseCase newInstance(CmsRepository cmsRepository) {
        return new GetCmsPrimeFidUseCase(cmsRepository);
    }

    public GetCmsPrimeFidUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
