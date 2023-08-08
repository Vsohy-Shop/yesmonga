package com.carrefour.fid.android.cms.domain.interactors;

import com.carrefour.fid.android.cms.domain.repositories.CmsRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class GetCmsMiniHubBlocksUseCase_Factory implements C10324h<GetCmsMiniHubBlocksUseCase> {
    private final Provider<C37807b> remoteConfigRepositoryProvider;
    private final Provider<CmsRepository> repositoryProvider;

    public GetCmsMiniHubBlocksUseCase_Factory(Provider<C37807b> provider, Provider<CmsRepository> provider2) {
        this.remoteConfigRepositoryProvider = provider;
        this.repositoryProvider = provider2;
    }

    public static GetCmsMiniHubBlocksUseCase_Factory create(Provider<C37807b> provider, Provider<CmsRepository> provider2) {
        return new GetCmsMiniHubBlocksUseCase_Factory(provider, provider2);
    }

    public static GetCmsMiniHubBlocksUseCase newInstance(C37807b bVar, CmsRepository cmsRepository) {
        return new GetCmsMiniHubBlocksUseCase(bVar, cmsRepository);
    }

    public GetCmsMiniHubBlocksUseCase get() {
        return newInstance(this.remoteConfigRepositoryProvider.get(), this.repositoryProvider.get());
    }
}
