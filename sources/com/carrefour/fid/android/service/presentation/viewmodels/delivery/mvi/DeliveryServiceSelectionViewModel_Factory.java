package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi;

import com.carrefour.fid.android.domain.events.account.C37493a;
import com.carrefour.fid.android.domain.interactors.service.C37812b;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.service.domain.interactors.SetPendingServiceSelectionUseCase;
import com.carrefour.fid.android.service.presentation.analytics.delivery.DeliveryServiceSelectionAnalyticsReporter;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class DeliveryServiceSelectionViewModel_Factory implements C10324h<DeliveryServiceSelectionViewModel> {
    private final Provider<DeliveryServiceSelectionAnalyticsReporter> analyticsProvider;
    private final Provider<C37812b> fetchDeliveryStoresUseCaseProvider;
    private final Provider<C37878e> getUserInfoUseCaseProvider;
    private final Provider<SetPendingServiceSelectionUseCase> setPendingServiceSelectionUseCaseProvider;
    private final Provider<C37493a> userAddressProvider;

    public DeliveryServiceSelectionViewModel_Factory(Provider<C37878e> provider, Provider<SetPendingServiceSelectionUseCase> provider2, Provider<DeliveryServiceSelectionAnalyticsReporter> provider3, Provider<C37493a> provider4, Provider<C37812b> provider5) {
        this.getUserInfoUseCaseProvider = provider;
        this.setPendingServiceSelectionUseCaseProvider = provider2;
        this.analyticsProvider = provider3;
        this.userAddressProvider = provider4;
        this.fetchDeliveryStoresUseCaseProvider = provider5;
    }

    public static DeliveryServiceSelectionViewModel_Factory create(Provider<C37878e> provider, Provider<SetPendingServiceSelectionUseCase> provider2, Provider<DeliveryServiceSelectionAnalyticsReporter> provider3, Provider<C37493a> provider4, Provider<C37812b> provider5) {
        return new DeliveryServiceSelectionViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DeliveryServiceSelectionViewModel newInstance(C37878e eVar, SetPendingServiceSelectionUseCase setPendingServiceSelectionUseCase, DeliveryServiceSelectionAnalyticsReporter deliveryServiceSelectionAnalyticsReporter, C37493a aVar, C37812b bVar) {
        return new DeliveryServiceSelectionViewModel(eVar, setPendingServiceSelectionUseCase, deliveryServiceSelectionAnalyticsReporter, aVar, bVar);
    }

    public DeliveryServiceSelectionViewModel get() {
        return newInstance(this.getUserInfoUseCaseProvider.get(), this.setPendingServiceSelectionUseCaseProvider.get(), this.analyticsProvider.get(), this.userAddressProvider.get(), this.fetchDeliveryStoresUseCaseProvider.get());
    }
}
