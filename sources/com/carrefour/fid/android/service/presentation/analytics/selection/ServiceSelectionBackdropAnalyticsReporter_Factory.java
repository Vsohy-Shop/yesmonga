package com.carrefour.fid.android.service.presentation.analytics.selection;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ServiceSelectionBackdropAnalyticsReporter_Factory implements C10324h<ServiceSelectionBackdropAnalyticsReporter> {
    private final Provider<C13783a> analyticManagerProvider;

    public ServiceSelectionBackdropAnalyticsReporter_Factory(Provider<C13783a> provider) {
        this.analyticManagerProvider = provider;
    }

    public static ServiceSelectionBackdropAnalyticsReporter_Factory create(Provider<C13783a> provider) {
        return new ServiceSelectionBackdropAnalyticsReporter_Factory(provider);
    }

    public static ServiceSelectionBackdropAnalyticsReporter newInstance(C13783a aVar) {
        return new ServiceSelectionBackdropAnalyticsReporter(aVar);
    }

    public ServiceSelectionBackdropAnalyticsReporter get() {
        return newInstance(this.analyticManagerProvider.get());
    }
}
