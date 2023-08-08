package com.carrefour.fid.android.service.presentation.analytics.drive;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class DriveSummaryAnalyticsReporter_Factory implements C10324h<DriveSummaryAnalyticsReporter> {
    private final Provider<C13783a> analyticManagerProvider;

    public DriveSummaryAnalyticsReporter_Factory(Provider<C13783a> provider) {
        this.analyticManagerProvider = provider;
    }

    public static DriveSummaryAnalyticsReporter_Factory create(Provider<C13783a> provider) {
        return new DriveSummaryAnalyticsReporter_Factory(provider);
    }

    public static DriveSummaryAnalyticsReporter newInstance(C13783a aVar) {
        return new DriveSummaryAnalyticsReporter(aVar);
    }

    public DriveSummaryAnalyticsReporter get() {
        return newInstance(this.analyticManagerProvider.get());
    }
}
