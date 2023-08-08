package com.carrefour.fid.android.various.domain.interactor;

import com.carrefour.fid.android.various.domain.repository.C22798d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.various.domain.interactor.d */
public final class C22782d implements C10324h<ThirdPartyCheckRemoteConfigUseCase> {

    /* renamed from: a */
    public final Provider<C22798d> f58341a;

    public C22782d(Provider<C22798d> provider) {
        this.f58341a = provider;
    }

    /* renamed from: a */
    public static C22782d m103015a(Provider<C22798d> provider) {
        return new C22782d(provider);
    }

    /* renamed from: c */
    public static ThirdPartyCheckRemoteConfigUseCase m103016c(C22798d dVar) {
        return new ThirdPartyCheckRemoteConfigUseCase(dVar);
    }

    /* renamed from: b */
    public ThirdPartyCheckRemoteConfigUseCase get() {
        return m103016c(this.f58341a.get());
    }
}
