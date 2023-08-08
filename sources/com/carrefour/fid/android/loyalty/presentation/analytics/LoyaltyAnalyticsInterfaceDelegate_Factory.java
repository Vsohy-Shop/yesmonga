package com.carrefour.fid.android.loyalty.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class LoyaltyAnalyticsInterfaceDelegate_Factory implements C10324h<LoyaltyAnalyticsInterfaceDelegate> {
    private final Provider<C13783a> analyticManagerProvider;

    public LoyaltyAnalyticsInterfaceDelegate_Factory(Provider<C13783a> provider) {
        this.analyticManagerProvider = provider;
    }

    public static LoyaltyAnalyticsInterfaceDelegate_Factory create(Provider<C13783a> provider) {
        return new LoyaltyAnalyticsInterfaceDelegate_Factory(provider);
    }

    public static LoyaltyAnalyticsInterfaceDelegate newInstance(C13783a aVar) {
        return new LoyaltyAnalyticsInterfaceDelegate(aVar);
    }

    public LoyaltyAnalyticsInterfaceDelegate get() {
        return newInstance(this.analyticManagerProvider.get());
    }
}
