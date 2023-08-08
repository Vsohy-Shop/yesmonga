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
public final class GetCmsOffersUseCase_Factory implements C10324h<GetCmsOffersUseCase> {
    private final Provider<CmsRepository> repositoryProvider;

    public GetCmsOffersUseCase_Factory(Provider<CmsRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetCmsOffersUseCase_Factory create(Provider<CmsRepository> provider) {
        return new GetCmsOffersUseCase_Factory(provider);
    }

    public static GetCmsOffersUseCase newInstance(CmsRepository cmsRepository) {
        return new GetCmsOffersUseCase(cmsRepository);
    }

    public GetCmsOffersUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
