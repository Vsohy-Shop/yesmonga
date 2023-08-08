package com.carrefour.fid.android.service.p043di;

import com.carrefour.fid.android.service.data.api.service.StoreFacilityService;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.ApplicationAuthApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.service.di.ServiceModule_Companion_ProvideStoreFacilityDataSourceFactory */
public final class ServiceModule_Companion_ProvideStoreFacilityDataSourceFactory implements C10324h<StoreFacilityService> {
    private final Provider<C13092x> retrofitProvider;

    public ServiceModule_Companion_ProvideStoreFacilityDataSourceFactory(Provider<C13092x> provider) {
        this.retrofitProvider = provider;
    }

    public static ServiceModule_Companion_ProvideStoreFacilityDataSourceFactory create(Provider<C13092x> provider) {
        return new ServiceModule_Companion_ProvideStoreFacilityDataSourceFactory(provider);
    }

    public static StoreFacilityService provideStoreFacilityDataSource(C13092x xVar) {
        return (StoreFacilityService) C10335o.m38554f(ServiceModule.Companion.provideStoreFacilityDataSource(xVar));
    }

    public StoreFacilityService get() {
        return provideStoreFacilityDataSource(this.retrofitProvider.get());
    }
}
