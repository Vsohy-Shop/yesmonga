package com.carrefour.fid.android.service.data.api.datasource;

import com.carrefour.fid.android.service.data.api.service.FacilityService;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class FacilityDataSource_Factory implements C10324h<FacilityDataSource> {
    private final Provider<FacilityService> facilityServiceProvider;

    public FacilityDataSource_Factory(Provider<FacilityService> provider) {
        this.facilityServiceProvider = provider;
    }

    public static FacilityDataSource_Factory create(Provider<FacilityService> provider) {
        return new FacilityDataSource_Factory(provider);
    }

    public static FacilityDataSource newInstance(FacilityService facilityService) {
        return new FacilityDataSource(facilityService);
    }

    public FacilityDataSource get() {
        return newInstance(this.facilityServiceProvider.get());
    }
}
