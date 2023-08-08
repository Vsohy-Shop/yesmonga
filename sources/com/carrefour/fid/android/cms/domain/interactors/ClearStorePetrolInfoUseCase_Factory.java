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
public final class ClearStorePetrolInfoUseCase_Factory implements C10324h<ClearStorePetrolInfoUseCase> {
    private final Provider<StorePetrolRepository> repositoryProvider;

    public ClearStorePetrolInfoUseCase_Factory(Provider<StorePetrolRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static ClearStorePetrolInfoUseCase_Factory create(Provider<StorePetrolRepository> provider) {
        return new ClearStorePetrolInfoUseCase_Factory(provider);
    }

    public static ClearStorePetrolInfoUseCase newInstance(StorePetrolRepository storePetrolRepository) {
        return new ClearStorePetrolInfoUseCase(storePetrolRepository);
    }

    public ClearStorePetrolInfoUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
