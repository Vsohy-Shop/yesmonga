package com.carrefour.fid.android.presentation.p035ui.onboarding;

import com.carrefour.fid.android.presentation.viewmodels.splash.C27420a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.onboarding.c */
public final class C24659c implements C10158g<SplashOnBoardingActivity> {

    /* renamed from: a */
    public final Provider<C27420a> f61245a;

    public C24659c(Provider<C27420a> provider) {
        this.f61245a = provider;
    }

    /* renamed from: a */
    public static C10158g<SplashOnBoardingActivity> m107713a(Provider<C27420a> provider) {
        return new C24659c(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.onboarding.SplashOnBoardingActivity.splashAnalyticsViewModel")
    /* renamed from: c */
    public static void m107714c(SplashOnBoardingActivity splashOnBoardingActivity, C27420a aVar) {
        splashOnBoardingActivity.f61240X0 = aVar;
    }

    /* renamed from: b */
    public void injectMembers(SplashOnBoardingActivity splashOnBoardingActivity) {
        m107714c(splashOnBoardingActivity, this.f61245a.get());
    }
}
