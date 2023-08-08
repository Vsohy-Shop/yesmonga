package com.carrefour.fid.android.loyalty.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class LoyaltyDetailAnalyticsDelegate_Factory implements C10324h<LoyaltyDetailAnalyticsDelegate> {
    private final Provider<C13783a> analyticManagerProvider;
    private final Provider<C28994a> audienceTrackingAdapterProvider;

    public LoyaltyDetailAnalyticsDelegate_Factory(Provider<C13783a> provider, Provider<C28994a> provider2) {
        this.analyticManagerProvider = provider;
        this.audienceTrackingAdapterProvider = provider2;
    }

    public static LoyaltyDetailAnalyticsDelegate_Factory create(Provider<C13783a> provider, Provider<C28994a> provider2) {
        return new LoyaltyDetailAnalyticsDelegate_Factory(provider, provider2);
    }

    public static LoyaltyDetailAnalyticsDelegate newInstance(C13783a aVar, C28994a aVar2) {
        return new LoyaltyDetailAnalyticsDelegate(aVar, aVar2);
    }

    public LoyaltyDetailAnalyticsDelegate get() {
        return newInstance(this.analyticManagerProvider.get(), this.audienceTrackingAdapterProvider.get());
    }
}
