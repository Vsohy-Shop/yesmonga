package com.carrefour.fid.android.presentation.p035ui.home;

import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.home.i */
public final class C24161i implements C10158g<HomePageFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f60428a;

    /* renamed from: b */
    public final Provider<C28796c> f60429b;

    public C24161i(Provider<AppEnvironment> provider, Provider<C28796c> provider2) {
        this.f60428a = provider;
        this.f60429b = provider2;
    }

    /* renamed from: a */
    public static C10158g<HomePageFragment> m106400a(Provider<AppEnvironment> provider, Provider<C28796c> provider2) {
        return new C24161i(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.home.HomePageFragment.environment")
    /* renamed from: b */
    public static void m106401b(HomePageFragment homePageFragment, AppEnvironment appEnvironment) {
        homePageFragment.f60308g = appEnvironment;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.home.HomePageFragment.navigator")
    /* renamed from: d */
    public static void m106402d(HomePageFragment homePageFragment, C28796c cVar) {
        homePageFragment.f60309v = cVar;
    }

    /* renamed from: c */
    public void injectMembers(HomePageFragment homePageFragment) {
        m106401b(homePageFragment, this.f60428a.get());
        m106402d(homePageFragment, this.f60429b.get());
    }
}
