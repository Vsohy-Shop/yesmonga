package com.carrefour.fid.android.domain.interactors.criteo;

import com.carrefour.fid.android.data.repositories.CriteoRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.criteo.c */
public final class C37662c implements C10324h<CriteoSendCriteoEventUseCase> {

    /* renamed from: a */
    public final Provider<CriteoRepository> f94517a;

    /* renamed from: b */
    public final Provider<C37807b> f94518b;

    public C37662c(Provider<CriteoRepository> provider, Provider<C37807b> provider2) {
        this.f94517a = provider;
        this.f94518b = provider2;
    }

    /* renamed from: a */
    public static C37662c m154399a(Provider<CriteoRepository> provider, Provider<C37807b> provider2) {
        return new C37662c(provider, provider2);
    }

    /* renamed from: c */
    public static CriteoSendCriteoEventUseCase m154400c(CriteoRepository criteoRepository, C37807b bVar) {
        return new CriteoSendCriteoEventUseCase(criteoRepository, bVar);
    }

    /* renamed from: b */
    public CriteoSendCriteoEventUseCase get() {
        return m154400c(this.f94517a.get(), this.f94518b.get());
    }
}
