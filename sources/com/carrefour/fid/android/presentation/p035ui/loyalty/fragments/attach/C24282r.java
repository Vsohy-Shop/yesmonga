package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.attach;

import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyAnalyticsInterfaceDelegate;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.attach.r */
public final class C24282r implements C10158g<InfoCardsFragment> {

    /* renamed from: a */
    public final Provider<LoyaltyAnalyticsInterfaceDelegate> f60692a;

    public C24282r(Provider<LoyaltyAnalyticsInterfaceDelegate> provider) {
        this.f60692a = provider;
    }

    /* renamed from: a */
    public static C10158g<InfoCardsFragment> m106780a(Provider<LoyaltyAnalyticsInterfaceDelegate> provider) {
        return new C24282r(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.loyalty.fragments.attach.InfoCardsFragment.loyaltyAnalytics")
    /* renamed from: b */
    public static void m106781b(InfoCardsFragment infoCardsFragment, LoyaltyAnalyticsInterfaceDelegate loyaltyAnalyticsInterfaceDelegate) {
        infoCardsFragment.f60651f = loyaltyAnalyticsInterfaceDelegate;
    }

    /* renamed from: c */
    public void injectMembers(InfoCardsFragment infoCardsFragment) {
        m106781b(infoCardsFragment, this.f60692a.get());
    }
}
