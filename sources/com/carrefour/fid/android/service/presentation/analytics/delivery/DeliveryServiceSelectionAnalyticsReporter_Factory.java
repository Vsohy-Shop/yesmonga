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
public final class DeliveryServiceSelectionAnalyticsReporter_Factory implements C10324h<DeliveryServiceSelectionAnalyticsReporter> {
    private final Provider<C13783a> analyticManagerProvider;

    public DeliveryServiceSelectionAnalyticsReporter_Factory(Provider<C13783a> provider) {
        this.analyticManagerProvider = provider;
    }

    public static DeliveryServiceSelectionAnalyticsReporter_Factory create(Provider<C13783a> provider) {
        return new DeliveryServiceSelectionAnalyticsReporter_Factory(provider);
    }

    public static DeliveryServiceSelectionAnalyticsReporter newInstance(C13783a aVar) {
        return new DeliveryServiceSelectionAnalyticsReporter(aVar);
    }

    public DeliveryServiceSelectionAnalyticsReporter get() {
        return newInstance(this.analyticManagerProvider.get());
    }
}
