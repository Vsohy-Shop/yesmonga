package com.carrefour.fid.android.airship.domain.interactor;

import com.carrefour.fid.android.airship.domain.repositories.C13755a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.airship.domain.interactor.d */
public final class C13754d implements C10324h<AirshipGetGaidUseCase> {

    /* renamed from: a */
    public final Provider<C13755a> f33394a;

    public C13754d(Provider<C13755a> provider) {
        this.f33394a = provider;
    }

    /* renamed from: a */
    public static C13754d m58638a(Provider<C13755a> provider) {
        return new C13754d(provider);
    }

    /* renamed from: c */
    public static AirshipGetGaidUseCase m58639c(C13755a aVar) {
        return new AirshipGetGaidUseCase(aVar);
    }

    /* renamed from: b */
    public AirshipGetGaidUseCase get() {
        return m58639c(this.f33394a.get());
    }
}
