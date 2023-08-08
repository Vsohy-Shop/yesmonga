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
public final class GetCheckoutCgvUseCase_Factory implements C10324h<GetCheckoutCgvUseCase> {
    private final Provider<CmsRepository> repositoryProvider;

    public GetCheckoutCgvUseCase_Factory(Provider<CmsRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetCheckoutCgvUseCase_Factory create(Provider<CmsRepository> provider) {
        return new GetCheckoutCgvUseCase_Factory(provider);
    }

    public static GetCheckoutCgvUseCase newInstance(CmsRepository cmsRepository) {
        return new GetCheckoutCgvUseCase(cmsRepository);
    }

    public GetCheckoutCgvUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
