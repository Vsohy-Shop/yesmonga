package com.carrefour.fid.android.presentation.p035ui.home.shop;

import com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.home.shop.j */
public final class C24213j implements C10158g<OnlineStoreShopFragment> {

    /* renamed from: a */
    public final Provider<HomeAnalyticsViewModel> f60544a;

    public C24213j(Provider<HomeAnalyticsViewModel> provider) {
        this.f60544a = provider;
    }

    /* renamed from: a */
    public static C10158g<OnlineStoreShopFragment> m106579a(Provider<HomeAnalyticsViewModel> provider) {
        return new C24213j(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.home.shop.OnlineStoreShopFragment.homeAnalyticsViewModel")
    /* renamed from: b */
    public static void m106580b(OnlineStoreShopFragment onlineStoreShopFragment, HomeAnalyticsViewModel homeAnalyticsViewModel) {
        onlineStoreShopFragment.f60523g = homeAnalyticsViewModel;
    }

    /* renamed from: c */
    public void injectMembers(OnlineStoreShopFragment onlineStoreShopFragment) {
        m106580b(onlineStoreShopFragment, this.f60544a.get());
    }
}
