package com.carrefour.fid.android.service.presentation.p044ui.selection;

import com.carrefour.fid.android.service.presentation.analytics.selection.ServiceSelectionBackdropAnalyticsReporter;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.service.presentation.ui.selection.ServiceSelectionBackDropFragment_MembersInjector */
public final class ServiceSelectionBackDropFragment_MembersInjector implements C10158g<ServiceSelectionBackDropFragment> {
    private final Provider<ServiceSelectionBackdropAnalyticsReporter> analyticsProvider;
    private final Provider<C28796c> navigatorProvider;

    public ServiceSelectionBackDropFragment_MembersInjector(Provider<C28796c> provider, Provider<ServiceSelectionBackdropAnalyticsReporter> provider2) {
        this.navigatorProvider = provider;
        this.analyticsProvider = provider2;
    }

    public static C10158g<ServiceSelectionBackDropFragment> create(Provider<C28796c> provider, Provider<ServiceSelectionBackdropAnalyticsReporter> provider2) {
        return new ServiceSelectionBackDropFragment_MembersInjector(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.service.presentation.ui.selection.ServiceSelectionBackDropFragment.analytics")
    public static void injectAnalytics(ServiceSelectionBackDropFragment serviceSelectionBackDropFragment, ServiceSelectionBackdropAnalyticsReporter serviceSelectionBackdropAnalyticsReporter) {
        serviceSelectionBackDropFragment.analytics = serviceSelectionBackdropAnalyticsReporter;
    }

    @C10326j("com.carrefour.fid.android.service.presentation.ui.selection.ServiceSelectionBackDropFragment.navigator")
    public static void injectNavigator(ServiceSelectionBackDropFragment serviceSelectionBackDropFragment, C28796c cVar) {
        serviceSelectionBackDropFragment.navigator = cVar;
    }

    public void injectMembers(ServiceSelectionBackDropFragment serviceSelectionBackDropFragment) {
        injectNavigator(serviceSelectionBackDropFragment, this.navigatorProvider.get());
        injectAnalytics(serviceSelectionBackDropFragment, this.analyticsProvider.get());
    }
}
