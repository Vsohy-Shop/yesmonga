package com.carrefour.fid.android.presentation.p035ui.gazStation;

import com.carrefour.fid.android.presentation.viewmodels.gazStation.C26350a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.m */
public final class C24036m implements C10158g<ServiceStationsCameraFragment> {

    /* renamed from: a */
    public final Provider<C26350a> f60279a;

    public C24036m(Provider<C26350a> provider) {
        this.f60279a = provider;
    }

    /* renamed from: a */
    public static C10158g<ServiceStationsCameraFragment> m106075a(Provider<C26350a> provider) {
        return new C24036m(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsCameraFragment.serviceStationsAnalyticsViewModel")
    /* renamed from: c */
    public static void m106076c(ServiceStationsCameraFragment serviceStationsCameraFragment, C26350a aVar) {
        serviceStationsCameraFragment.f60213g = aVar;
    }

    /* renamed from: b */
    public void injectMembers(ServiceStationsCameraFragment serviceStationsCameraFragment) {
        m106076c(serviceStationsCameraFragment, this.f60279a.get());
    }
}
