package com.carrefour.fid.android.data.entities.mapper;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.IoDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.data.entities.mapper.q0 */
public final class C36519q0 implements C10324h<OHMOrdersOnlineDetailsEntityDataMapper> {

    /* renamed from: a */
    public final Provider<C36522r0> f90210a;

    /* renamed from: b */
    public final Provider<C36513o0> f90211b;

    /* renamed from: c */
    public final Provider<C36508m0> f90212c;

    /* renamed from: d */
    public final Provider<C37807b> f90213d;

    /* renamed from: e */
    public final Provider<CoroutineDispatcher> f90214e;

    public C36519q0(Provider<C36522r0> provider, Provider<C36513o0> provider2, Provider<C36508m0> provider3, Provider<C37807b> provider4, Provider<CoroutineDispatcher> provider5) {
        this.f90210a = provider;
        this.f90211b = provider2;
        this.f90212c = provider3;
        this.f90213d = provider4;
        this.f90214e = provider5;
    }

    /* renamed from: a */
    public static C36519q0 m149735a(Provider<C36522r0> provider, Provider<C36513o0> provider2, Provider<C36508m0> provider3, Provider<C37807b> provider4, Provider<CoroutineDispatcher> provider5) {
        return new C36519q0(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static OHMOrdersOnlineDetailsEntityDataMapper m149736c(C36522r0 r0Var, C36513o0 o0Var, C36508m0 m0Var, C37807b bVar, CoroutineDispatcher coroutineDispatcher) {
        return new OHMOrdersOnlineDetailsEntityDataMapper(r0Var, o0Var, m0Var, bVar, coroutineDispatcher);
    }

    /* renamed from: b */
    public OHMOrdersOnlineDetailsEntityDataMapper get() {
        return m149736c(this.f90210a.get(), this.f90211b.get(), this.f90212c.get(), this.f90213d.get(), this.f90214e.get());
    }
}
