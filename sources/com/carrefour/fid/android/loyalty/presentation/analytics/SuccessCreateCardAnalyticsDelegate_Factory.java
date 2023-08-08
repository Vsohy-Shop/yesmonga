package com.carrefour.fid.android.loyalty.presentation.analytics;

import android.content.Context;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
public final class SuccessCreateCardAnalyticsDelegate_Factory implements C10324h<SuccessCreateCardAnalyticsDelegate> {
    private final Provider<C13783a> analyticManagerProvider;
    private final Provider<C13814a> appsFlyerTrackingManagerProvider;
    private final Provider<Context> contextProvider;

    public SuccessCreateCardAnalyticsDelegate_Factory(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3) {
        this.contextProvider = provider;
        this.analyticManagerProvider = provider2;
        this.appsFlyerTrackingManagerProvider = provider3;
    }

    public static SuccessCreateCardAnalyticsDelegate_Factory create(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3) {
        return new SuccessCreateCardAnalyticsDelegate_Factory(provider, provider2, provider3);
    }

    public static SuccessCreateCardAnalyticsDelegate newInstance(Context context, C13783a aVar, C13814a aVar2) {
        return new SuccessCreateCardAnalyticsDelegate(context, aVar, aVar2);
    }

    public SuccessCreateCardAnalyticsDelegate get() {
        return newInstance(this.contextProvider.get(), this.analyticManagerProvider.get(), this.appsFlyerTrackingManagerProvider.get());
    }
}
