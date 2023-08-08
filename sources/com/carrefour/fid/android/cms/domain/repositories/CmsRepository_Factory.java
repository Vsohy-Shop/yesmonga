package com.carrefour.fid.android.cms.domain.repositories;

import android.content.Context;
import com.carrefour.fid.android.cms.data.headers.C40020a;
import com.carrefour.fid.android.cms.data.services.C40023a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
public final class CmsRepository_Factory implements C10324h<CmsRepository> {
    private final Provider<Context> appContextProvider;
    private final Provider<C40023a> cmsApiServiceProvider;
    private final Provider<C40020a> cmsHeadersProvider;

    public CmsRepository_Factory(Provider<C40023a> provider, Provider<C40020a> provider2, Provider<Context> provider3) {
        this.cmsApiServiceProvider = provider;
        this.cmsHeadersProvider = provider2;
        this.appContextProvider = provider3;
    }

    public static CmsRepository_Factory create(Provider<C40023a> provider, Provider<C40020a> provider2, Provider<Context> provider3) {
        return new CmsRepository_Factory(provider, provider2, provider3);
    }

    public static CmsRepository newInstance(C40023a aVar, C40020a aVar2, Context context) {
        return new CmsRepository(aVar, aVar2, context);
    }

    public CmsRepository get() {
        return newInstance(this.cmsApiServiceProvider.get(), this.cmsHeadersProvider.get(), this.appContextProvider.get());
    }
}
