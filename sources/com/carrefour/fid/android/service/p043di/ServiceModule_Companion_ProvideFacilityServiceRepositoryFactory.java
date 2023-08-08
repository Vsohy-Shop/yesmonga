package com.carrefour.fid.android.service.p043di;

import com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource;
import com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.C12074o0;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.ApplicationScope"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.service.di.ServiceModule_Companion_ProvideFacilityServiceRepositoryFactory */
public final class ServiceModule_Companion_ProvideFacilityServiceRepositoryFactory implements C10324h<StoreFacilityRepository> {
    private final Provider<FacilityDataSource> facilityDataSourceProvider;
    private final Provider<C12074o0> scopeProvider;
    private final Provider<StoreFacilityDataSource> storeFacilityDataSourceProvider;

    public ServiceModule_Companion_ProvideFacilityServiceRepositoryFactory(Provider<StoreFacilityDataSource> provider, Provider<FacilityDataSource> provider2, Provider<C12074o0> provider3) {
        this.storeFacilityDataSourceProvider = provider;
        this.facilityDataSourceProvider = provider2;
        this.scopeProvider = provider3;
    }

    public static ServiceModule_Companion_ProvideFacilityServiceRepositoryFactory create(Provider<StoreFacilityDataSource> provider, Provider<FacilityDataSource> provider2, Provider<C12074o0> provider3) {
        return new ServiceModule_Companion_ProvideFacilityServiceRepositoryFactory(provider, provider2, provider3);
    }

    public static StoreFacilityRepository provideFacilityServiceRepository(StoreFacilityDataSource storeFacilityDataSource, FacilityDataSource facilityDataSource, C12074o0 o0Var) {
        return (StoreFacilityRepository) C10335o.m38554f(ServiceModule.Companion.provideFacilityServiceRepository(storeFacilityDataSource, facilityDataSource, o0Var));
    }

    public StoreFacilityRepository get() {
        return provideFacilityServiceRepository(this.storeFacilityDataSourceProvider.get(), this.facilityDataSourceProvider.get(), this.scopeProvider.get());
    }
}
