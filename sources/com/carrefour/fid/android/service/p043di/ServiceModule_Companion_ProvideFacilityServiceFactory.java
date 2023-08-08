package com.carrefour.fid.android.service.p043di;

import com.carrefour.fid.android.service.data.api.service.FacilityService;
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
/* renamed from: com.carrefour.fid.android.service.di.ServiceModule_Companion_ProvideFacilityServiceFactory */
public final class ServiceModule_Companion_ProvideFacilityServiceFactory implements C10324h<FacilityService> {
    private final Provider<C13092x> retrofitProvider;

    public ServiceModule_Companion_ProvideFacilityServiceFactory(Provider<C13092x> provider) {
        this.retrofitProvider = provider;
    }

    public static ServiceModule_Companion_ProvideFacilityServiceFactory create(Provider<C13092x> provider) {
        return new ServiceModule_Companion_ProvideFacilityServiceFactory(provider);
    }

    public static FacilityService provideFacilityService(C13092x xVar) {
        return (FacilityService) C10335o.m38554f(ServiceModule.Companion.provideFacilityService(xVar));
    }

    public FacilityService get() {
        return provideFacilityService(this.retrofitProvider.get());
    }
}
