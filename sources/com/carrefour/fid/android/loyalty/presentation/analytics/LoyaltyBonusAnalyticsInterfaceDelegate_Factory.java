package com.carrefour.fid.android.loyalty.presentation.analytics;

import android.content.Context;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
public final class LoyaltyBonusAnalyticsInterfaceDelegate_Factory implements C10324h<LoyaltyBonusAnalyticsInterfaceDelegate> {
    private final Provider<C13783a> analyticManagerProvider;
    private final Provider<C13814a> appsFlyerTrackingManagerProvider;
    private final Provider<C28994a> audienceTrackingAdapterProvider;
    private final Provider<Context> contextProvider;

    public LoyaltyBonusAnalyticsInterfaceDelegate_Factory(Provider<C13783a> provider, Provider<C13814a> provider2, Provider<C28994a> provider3, Provider<Context> provider4) {
        this.analyticManagerProvider = provider;
        this.appsFlyerTrackingManagerProvider = provider2;
        this.audienceTrackingAdapterProvider = provider3;
        this.contextProvider = provider4;
    }

    public static LoyaltyBonusAnalyticsInterfaceDelegate_Factory create(Provider<C13783a> provider, Provider<C13814a> provider2, Provider<C28994a> provider3, Provider<Context> provider4) {
        return new LoyaltyBonusAnalyticsInterfaceDelegate_Factory(provider, provider2, provider3, provider4);
    }

    public static LoyaltyBonusAnalyticsInterfaceDelegate newInstance(C13783a aVar, C13814a aVar2, C28994a aVar3, Context context) {
        return new LoyaltyBonusAnalyticsInterfaceDelegate(aVar, aVar2, aVar3, context);
    }

    public LoyaltyBonusAnalyticsInterfaceDelegate get() {
        return newInstance(this.analyticManagerProvider.get(), this.appsFlyerTrackingManagerProvider.get(), this.audienceTrackingAdapterProvider.get(), this.contextProvider.get());
    }
}
