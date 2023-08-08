package com.carrefour.fid.android.cms.domain.repositories;

import com.carrefour.fid.android.cms.data.cache.StorePetrolCache;
import com.carrefour.fid.android.cms.data.headers.C40020a;
import com.carrefour.fid.android.cms.data.services.C40023a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class StorePetrolRepository_Factory implements C10324h<StorePetrolRepository> {
    private final Provider<StorePetrolCache> cacheProvider;
    private final Provider<C40023a> cmsApiServiceProvider;
    private final Provider<C40020a> cmsHeadersProvider;

    public StorePetrolRepository_Factory(Provider<StorePetrolCache> provider, Provider<C40023a> provider2, Provider<C40020a> provider3) {
        this.cacheProvider = provider;
        this.cmsApiServiceProvider = provider2;
        this.cmsHeadersProvider = provider3;
    }

    public static StorePetrolRepository_Factory create(Provider<StorePetrolCache> provider, Provider<C40023a> provider2, Provider<C40020a> provider3) {
        return new StorePetrolRepository_Factory(provider, provider2, provider3);
    }

    public static StorePetrolRepository newInstance(StorePetrolCache storePetrolCache, C40023a aVar, C40020a aVar2) {
        return new StorePetrolRepository(storePetrolCache, aVar, aVar2);
    }

    public StorePetrolRepository get() {
        return newInstance(this.cacheProvider.get(), this.cmsApiServiceProvider.get(), this.cmsHeadersProvider.get());
    }
}
