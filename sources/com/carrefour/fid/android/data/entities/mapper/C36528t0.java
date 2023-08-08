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
/* renamed from: com.carrefour.fid.android.data.entities.mapper.t0 */
public final class C36528t0 implements C10324h<OHMOrdersOnlineEntityDataMapper> {

    /* renamed from: a */
    public final Provider<C37807b> f90220a;

    /* renamed from: b */
    public final Provider<CoroutineDispatcher> f90221b;

    public C36528t0(Provider<C37807b> provider, Provider<CoroutineDispatcher> provider2) {
        this.f90220a = provider;
        this.f90221b = provider2;
    }

    /* renamed from: a */
    public static C36528t0 m149755a(Provider<C37807b> provider, Provider<CoroutineDispatcher> provider2) {
        return new C36528t0(provider, provider2);
    }

    /* renamed from: c */
    public static OHMOrdersOnlineEntityDataMapper m149756c(C37807b bVar, CoroutineDispatcher coroutineDispatcher) {
        return new OHMOrdersOnlineEntityDataMapper(bVar, coroutineDispatcher);
    }

    /* renamed from: b */
    public OHMOrdersOnlineEntityDataMapper get() {
        return m149756c(this.f90220a.get(), this.f90221b.get());
    }
}
