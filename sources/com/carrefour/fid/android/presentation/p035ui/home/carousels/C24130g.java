package com.carrefour.fid.android.presentation.p035ui.home.carousels;

import com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.home.carousels.g */
public final class C24130g implements C10158g<C24127e> {

    /* renamed from: a */
    public final Provider<HomeAnalyticsViewModel> f60365a;

    public C24130g(Provider<HomeAnalyticsViewModel> provider) {
        this.f60365a = provider;
    }

    /* renamed from: a */
    public static C10158g<C24127e> m106259a(Provider<HomeAnalyticsViewModel> provider) {
        return new C24130g(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.home.carousels.HomeCmsSlideFragment.homeAnalyticsViewModel")
    /* renamed from: b */
    public static void m106260b(C24127e eVar, HomeAnalyticsViewModel homeAnalyticsViewModel) {
        eVar.f60364g = homeAnalyticsViewModel;
    }

    /* renamed from: c */
    public void injectMembers(C24127e eVar) {
        m106260b(eVar, this.f60365a.get());
    }
}
