package com.carrefour.fid.android.presentation.p035ui.gazStation;

import com.carrefour.fid.android.presentation.viewmodels.gazStation.C26350a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.v */
public final class C24049v implements C10158g<ServiceStationsLandingPageFragment> {

    /* renamed from: a */
    public final Provider<C26350a> f60295a;

    public C24049v(Provider<C26350a> provider) {
        this.f60295a = provider;
    }

    /* renamed from: a */
    public static C10158g<ServiceStationsLandingPageFragment> m106103a(Provider<C26350a> provider) {
        return new C24049v(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsLandingPageFragment.serviceStationsAnalyticsViewModel")
    /* renamed from: c */
    public static void m106104c(ServiceStationsLandingPageFragment serviceStationsLandingPageFragment, C26350a aVar) {
        serviceStationsLandingPageFragment.f60219f = aVar;
    }

    /* renamed from: b */
    public void injectMembers(ServiceStationsLandingPageFragment serviceStationsLandingPageFragment) {
        m106104c(serviceStationsLandingPageFragment, this.f60295a.get());
    }
}
