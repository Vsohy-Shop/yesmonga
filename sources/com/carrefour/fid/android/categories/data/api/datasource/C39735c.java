package com.carrefour.fid.android.categories.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.categories.data.api.datasource.c */
public final class C39735c implements C10324h<DriveOmrAvailabilityApiImpl> {

    /* renamed from: a */
    public final Provider<BffStoresManagementApi> f101384a;

    public C39735c(Provider<BffStoresManagementApi> provider) {
        this.f101384a = provider;
    }

    /* renamed from: a */
    public static C39735c m162167a(Provider<BffStoresManagementApi> provider) {
        return new C39735c(provider);
    }

    /* renamed from: c */
    public static DriveOmrAvailabilityApiImpl m162168c(BffStoresManagementApi bffStoresManagementApi) {
        return new DriveOmrAvailabilityApiImpl(bffStoresManagementApi);
    }

    /* renamed from: b */
    public DriveOmrAvailabilityApiImpl get() {
        return m162168c(this.f101384a.get());
    }
}
