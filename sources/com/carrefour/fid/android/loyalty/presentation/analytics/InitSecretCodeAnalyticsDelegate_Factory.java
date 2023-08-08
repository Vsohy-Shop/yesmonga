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
public final class InitSecretCodeAnalyticsDelegate_Factory implements C10324h<InitSecretCodeAnalyticsDelegate> {
    private final Provider<C13783a> analyticManagerProvider;
    private final Provider<C28994a> audienceTrackingAdapterProvider;

    public InitSecretCodeAnalyticsDelegate_Factory(Provider<C13783a> provider, Provider<C28994a> provider2) {
        this.analyticManagerProvider = provider;
        this.audienceTrackingAdapterProvider = provider2;
    }

    public static InitSecretCodeAnalyticsDelegate_Factory create(Provider<C13783a> provider, Provider<C28994a> provider2) {
        return new InitSecretCodeAnalyticsDelegate_Factory(provider, provider2);
    }

    public static InitSecretCodeAnalyticsDelegate newInstance(C13783a aVar, C28994a aVar2) {
        return new InitSecretCodeAnalyticsDelegate(aVar, aVar2);
    }

    public InitSecretCodeAnalyticsDelegate get() {
        return newInstance(this.analyticManagerProvider.get(), this.audienceTrackingAdapterProvider.get());
    }
}
