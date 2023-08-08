package com.carrefour.fid.android.service.presentation.analytics.delivery;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class DeliverySummaryAnalyticsReporter_Factory implements C10324h<DeliverySummaryAnalyticsReporter> {
    private final Provider<C13783a> analyticManagerProvider;

    public DeliverySummaryAnalyticsReporter_Factory(Provider<C13783a> provider) {
        this.analyticManagerProvider = provider;
    }

    public static DeliverySummaryAnalyticsReporter_Factory create(Provider<C13783a> provider) {
        return new DeliverySummaryAnalyticsReporter_Factory(provider);
    }

    public static DeliverySummaryAnalyticsReporter newInstance(C13783a aVar) {
        return new DeliverySummaryAnalyticsReporter(aVar);
    }

    public DeliverySummaryAnalyticsReporter get() {
        return newInstance(this.analyticManagerProvider.get());
    }
}
