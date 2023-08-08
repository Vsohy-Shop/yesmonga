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
public final class GetCmsPrimeFidListUseCase_Factory implements C10324h<GetCmsPrimeFidListUseCase> {
    private final Provider<CmsRepository> repositoryProvider;

    public GetCmsPrimeFidListUseCase_Factory(Provider<CmsRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetCmsPrimeFidListUseCase_Factory create(Provider<CmsRepository> provider) {
        return new GetCmsPrimeFidListUseCase_Factory(provider);
    }

    public static GetCmsPrimeFidListUseCase newInstance(CmsRepository cmsRepository) {
        return new GetCmsPrimeFidListUseCase(cmsRepository);
    }

    public GetCmsPrimeFidListUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
