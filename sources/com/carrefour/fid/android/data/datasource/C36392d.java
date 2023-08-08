package com.carrefour.fid.android.data.datasource;

import android.content.Context;
import com.carrefour.fid.android.data.repositories.CriteoRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.datasource.d */
public final class C36392d implements C10324h<CriteoTrackingGateway> {

    /* renamed from: a */
    public final Provider<Context> f90033a;

    /* renamed from: b */
    public final Provider<CriteoRepository> f90034b;

    /* renamed from: c */
    public final Provider<C37807b> f90035c;

    public C36392d(Provider<Context> provider, Provider<CriteoRepository> provider2, Provider<C37807b> provider3) {
        this.f90033a = provider;
        this.f90034b = provider2;
        this.f90035c = provider3;
    }

    /* renamed from: a */
    public static C36392d m149308a(Provider<Context> provider, Provider<CriteoRepository> provider2, Provider<C37807b> provider3) {
        return new C36392d(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static CriteoTrackingGateway m149309c(Context context, CriteoRepository criteoRepository, C37807b bVar) {
        return new CriteoTrackingGateway(context, criteoRepository, bVar);
    }

    /* renamed from: b */
    public CriteoTrackingGateway get() {
        return m149309c(this.f90033a.get(), this.f90034b.get(), this.f90035c.get());
    }
}
