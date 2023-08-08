package com.carrefour.fid.android.service.data.api.datasource;

import com.carrefour.fid.android.service.data.api.service.StoreFacilityService;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class StoreFacilityDataSource_Factory implements C10324h<StoreFacilityDataSource> {
    private final Provider<AppEnvironment> appEnvironmentProvider;
    private final Provider<StoreFacilityService> storeFacilityServiceProvider;

    public StoreFacilityDataSource_Factory(Provider<AppEnvironment> provider, Provider<StoreFacilityService> provider2) {
        this.appEnvironmentProvider = provider;
        this.storeFacilityServiceProvider = provider2;
    }

    public static StoreFacilityDataSource_Factory create(Provider<AppEnvironment> provider, Provider<StoreFacilityService> provider2) {
        return new StoreFacilityDataSource_Factory(provider, provider2);
    }

    public static StoreFacilityDataSource newInstance(AppEnvironment appEnvironment, StoreFacilityService storeFacilityService) {
        return new StoreFacilityDataSource(appEnvironment, storeFacilityService);
    }

    public StoreFacilityDataSource get() {
        return newInstance(this.appEnvironmentProvider.get(), this.storeFacilityServiceProvider.get());
    }
}
