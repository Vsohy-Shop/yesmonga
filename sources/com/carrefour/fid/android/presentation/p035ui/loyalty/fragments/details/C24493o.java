package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyAnalyticsInterfaceDelegate;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.o */
public final class C24493o implements C10158g<LoyaltyNotLoggedFragment> {

    /* renamed from: a */
    public final Provider<LoyaltyAnalyticsInterfaceDelegate> f61024a;

    public C24493o(Provider<LoyaltyAnalyticsInterfaceDelegate> provider) {
        this.f61024a = provider;
    }

    /* renamed from: a */
    public static C10158g<LoyaltyNotLoggedFragment> m107344a(Provider<LoyaltyAnalyticsInterfaceDelegate> provider) {
        return new C24493o(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyNotLoggedFragment.loyaltyAnalytics")
    /* renamed from: b */
    public static void m107345b(LoyaltyNotLoggedFragment loyaltyNotLoggedFragment, LoyaltyAnalyticsInterfaceDelegate loyaltyAnalyticsInterfaceDelegate) {
        loyaltyNotLoggedFragment.f60982f = loyaltyAnalyticsInterfaceDelegate;
    }

    /* renamed from: c */
    public void injectMembers(LoyaltyNotLoggedFragment loyaltyNotLoggedFragment) {
        m107345b(loyaltyNotLoggedFragment, this.f61024a.get());
    }
}
