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
public final class GetCmsCarouselsUseCase_Factory implements C10324h<GetCmsCarouselsUseCase> {
    private final Provider<CmsRepository> repositoryProvider;

    public GetCmsCarouselsUseCase_Factory(Provider<CmsRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetCmsCarouselsUseCase_Factory create(Provider<CmsRepository> provider) {
        return new GetCmsCarouselsUseCase_Factory(provider);
    }

    public static GetCmsCarouselsUseCase newInstance(CmsRepository cmsRepository) {
        return new GetCmsCarouselsUseCase(cmsRepository);
    }

    public GetCmsCarouselsUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
