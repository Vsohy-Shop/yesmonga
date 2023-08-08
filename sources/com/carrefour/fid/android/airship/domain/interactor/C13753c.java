package com.carrefour.fid.android.airship.domain.interactor;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.airship.domain.interactor.c */
public final class C13753c implements C10324h<AirshipGetAirshipInboxUseCase> {

    /* renamed from: a */
    public final Provider<C13750a> f33393a;

    public C13753c(Provider<C13750a> provider) {
        this.f33393a = provider;
    }

    /* renamed from: a */
    public static C13753c m58635a(Provider<C13750a> provider) {
        return new C13753c(provider);
    }

    /* renamed from: c */
    public static AirshipGetAirshipInboxUseCase m58636c(C13750a aVar) {
        return new AirshipGetAirshipInboxUseCase(aVar);
    }

    /* renamed from: b */
    public AirshipGetAirshipInboxUseCase get() {
        return m58636c(this.f33393a.get());
    }
}
