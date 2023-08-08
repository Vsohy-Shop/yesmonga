package com.carrefour.fid.android.cms.domain.repositories;

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
public final class DeliveryRateRepository_Factory implements C10324h<DeliveryRateRepository> {
    private final Provider<C40023a> cmsApiServiceProvider;
    private final Provider<C40020a> cmsHeadersProvider;

    public DeliveryRateRepository_Factory(Provider<C40023a> provider, Provider<C40020a> provider2) {
        this.cmsApiServiceProvider = provider;
        this.cmsHeadersProvider = provider2;
    }

    public static DeliveryRateRepository_Factory create(Provider<C40023a> provider, Provider<C40020a> provider2) {
        return new DeliveryRateRepository_Factory(provider, provider2);
    }

    public static DeliveryRateRepository newInstance(C40023a aVar, C40020a aVar2) {
        return new DeliveryRateRepository(aVar, aVar2);
    }

    public DeliveryRateRepository get() {
        return newInstance(this.cmsApiServiceProvider.get(), this.cmsHeadersProvider.get());
    }
}
