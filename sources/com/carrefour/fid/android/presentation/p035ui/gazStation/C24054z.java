package com.carrefour.fid.android.presentation.p035ui.gazStation;

import com.carrefour.fid.android.presentation.viewmodels.gazStation.C26350a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.z */
public final class C24054z implements C10158g<ServiceStationsResultFragment> {

    /* renamed from: a */
    public final Provider<C26350a> f60303a;

    public C24054z(Provider<C26350a> provider) {
        this.f60303a = provider;
    }

    /* renamed from: a */
    public static C10158g<ServiceStationsResultFragment> m106116a(Provider<C26350a> provider) {
        return new C24054z(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsResultFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m106117b(ServiceStationsResultFragment serviceStationsResultFragment, C26350a aVar) {
        serviceStationsResultFragment.f60230v = aVar;
    }

    /* renamed from: c */
    public void injectMembers(ServiceStationsResultFragment serviceStationsResultFragment) {
        m106117b(serviceStationsResultFragment, this.f60303a.get());
    }
}
