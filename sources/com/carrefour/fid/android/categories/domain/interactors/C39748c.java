package com.carrefour.fid.android.categories.domain.interactors;

import com.carrefour.fid.android.categories.domain.datasource.DriveOmrAvailabilityApi;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.categories.domain.interactors.c */
public final class C39748c implements C10324h<CategoriesGetDriveOmrPromiseUseCase> {

    /* renamed from: a */
    public final Provider<C37823k> f101454a;

    /* renamed from: b */
    public final Provider<DriveOmrAvailabilityApi> f101455b;

    public C39748c(Provider<C37823k> provider, Provider<DriveOmrAvailabilityApi> provider2) {
        this.f101454a = provider;
        this.f101455b = provider2;
    }

    /* renamed from: a */
    public static C39748c m162196a(Provider<C37823k> provider, Provider<DriveOmrAvailabilityApi> provider2) {
        return new C39748c(provider, provider2);
    }

    /* renamed from: c */
    public static CategoriesGetDriveOmrPromiseUseCase m162197c(C37823k kVar, DriveOmrAvailabilityApi driveOmrAvailabilityApi) {
        return new CategoriesGetDriveOmrPromiseUseCase(kVar, driveOmrAvailabilityApi);
    }

    /* renamed from: b */
    public CategoriesGetDriveOmrPromiseUseCase get() {
        return m162197c(this.f101454a.get(), this.f101455b.get());
    }
}
