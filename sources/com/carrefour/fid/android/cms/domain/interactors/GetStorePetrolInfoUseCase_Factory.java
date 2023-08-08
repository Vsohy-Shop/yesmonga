package com.carrefour.fid.android.cms.domain.interactors;

import com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class GetStorePetrolInfoUseCase_Factory implements C10324h<GetStorePetrolInfoUseCase> {
    private final Provider<StorePetrolRepository> repositoryProvider;

    public GetStorePetrolInfoUseCase_Factory(Provider<StorePetrolRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetStorePetrolInfoUseCase_Factory create(Provider<StorePetrolRepository> provider) {
        return new GetStorePetrolInfoUseCase_Factory(provider);
    }

    public static GetStorePetrolInfoUseCase newInstance(StorePetrolRepository storePetrolRepository) {
        return new GetStorePetrolInfoUseCase(storePetrolRepository);
    }

    public GetStorePetrolInfoUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
