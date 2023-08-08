package com.carrefour.fid.android.presentation.p035ui.home.shop;

import com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.home.shop.f */
public final class C24209f implements C10158g<OnlineShopBasketDetailsFragment> {

    /* renamed from: a */
    public final Provider<HomeAnalyticsViewModel> f60541a;

    public C24209f(Provider<HomeAnalyticsViewModel> provider) {
        this.f60541a = provider;
    }

    /* renamed from: a */
    public static C10158g<OnlineShopBasketDetailsFragment> m106575a(Provider<HomeAnalyticsViewModel> provider) {
        return new C24209f(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.home.shop.OnlineShopBasketDetailsFragment.homeAnalyticsViewModel")
    /* renamed from: b */
    public static void m106576b(OnlineShopBasketDetailsFragment onlineShopBasketDetailsFragment, HomeAnalyticsViewModel homeAnalyticsViewModel) {
        onlineShopBasketDetailsFragment.f60507v = homeAnalyticsViewModel;
    }

    /* renamed from: c */
    public void injectMembers(OnlineShopBasketDetailsFragment onlineShopBasketDetailsFragment) {
        m106576b(onlineShopBasketDetailsFragment, this.f60541a.get());
    }
}
