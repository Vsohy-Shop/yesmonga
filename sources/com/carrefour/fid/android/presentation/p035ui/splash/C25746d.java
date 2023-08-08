package com.carrefour.fid.android.presentation.p035ui.splash;

import com.carrefour.fid.android.presentation.viewmodels.splash.C27420a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.splash.d */
public final class C25746d implements C10158g<SplashActivity> {

    /* renamed from: a */
    public final Provider<C27420a> f63074a;

    public C25746d(Provider<C27420a> provider) {
        this.f63074a = provider;
    }

    /* renamed from: a */
    public static C10158g<SplashActivity> m110494a(Provider<C27420a> provider) {
        return new C25746d(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.splash.SplashActivity.splashAnalyticsViewModel")
    /* renamed from: c */
    public static void m110495c(SplashActivity splashActivity, C27420a aVar) {
        splashActivity.f63056X0 = aVar;
    }

    /* renamed from: b */
    public void injectMembers(SplashActivity splashActivity) {
        m110495c(splashActivity, this.f63074a.get());
    }
}
