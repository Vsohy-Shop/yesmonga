package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import com.carrefour.fid.android.service.presentation.analytics.delivery.DeliverySummaryAnalyticsReporter;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryFragment_MembersInjector */
public final class DeliverySummaryFragment_MembersInjector implements C10158g<DeliverySummaryFragment> {
    private final Provider<DeliverySummaryAnalyticsReporter> analyticsProvider;
    private final Provider<C28796c> navigatorProvider;

    public DeliverySummaryFragment_MembersInjector(Provider<C28796c> provider, Provider<DeliverySummaryAnalyticsReporter> provider2) {
        this.navigatorProvider = provider;
        this.analyticsProvider = provider2;
    }

    public static C10158g<DeliverySummaryFragment> create(Provider<C28796c> provider, Provider<DeliverySummaryAnalyticsReporter> provider2) {
        return new DeliverySummaryFragment_MembersInjector(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryFragment.analytics")
    public static void injectAnalytics(DeliverySummaryFragment deliverySummaryFragment, DeliverySummaryAnalyticsReporter deliverySummaryAnalyticsReporter) {
        deliverySummaryFragment.analytics = deliverySummaryAnalyticsReporter;
    }

    @C10326j("com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryFragment.navigator")
    public static void injectNavigator(DeliverySummaryFragment deliverySummaryFragment, C28796c cVar) {
        deliverySummaryFragment.navigator = cVar;
    }

    public void injectMembers(DeliverySummaryFragment deliverySummaryFragment) {
        injectNavigator(deliverySummaryFragment, this.navigatorProvider.get());
        injectAnalytics(deliverySummaryFragment, this.analyticsProvider.get());
    }
}
