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
public final class DriveServiceSelectionAnalyticsReporter_Factory implements C10324h<DriveServiceSelectionAnalyticsReporter> {
    private final Provider<C13783a> analyticManagerProvider;

    public DriveServiceSelectionAnalyticsReporter_Factory(Provider<C13783a> provider) {
        this.analyticManagerProvider = provider;
    }

    public static DriveServiceSelectionAnalyticsReporter_Factory create(Provider<C13783a> provider) {
        return new DriveServiceSelectionAnalyticsReporter_Factory(provider);
    }

    public static DriveServiceSelectionAnalyticsReporter newInstance(C13783a aVar) {
        return new DriveServiceSelectionAnalyticsReporter(aVar);
    }

    public DriveServiceSelectionAnalyticsReporter get() {
        return newInstance(this.analyticManagerProvider.get());
    }
}
