package com.carrefour.fid.android.loyalty.presentation.viewmodels.create;

import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.presentation.analytics.SuccessCreateCardAnalyticsDelegate;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class SuccessCreateCardViewModel_Factory implements C10324h<SuccessCreateCardViewModel> {
    private final Provider<SuccessCreateCardAnalyticsDelegate> analyticsProvider;
    private final Provider<C37878e> getUserInfoUseCaseProvider;

    public SuccessCreateCardViewModel_Factory(Provider<C37878e> provider, Provider<SuccessCreateCardAnalyticsDelegate> provider2) {
        this.getUserInfoUseCaseProvider = provider;
        this.analyticsProvider = provider2;
    }

    public static SuccessCreateCardViewModel_Factory create(Provider<C37878e> provider, Provider<SuccessCreateCardAnalyticsDelegate> provider2) {
        return new SuccessCreateCardViewModel_Factory(provider, provider2);
    }

    public static SuccessCreateCardViewModel newInstance(C37878e eVar, SuccessCreateCardAnalyticsDelegate successCreateCardAnalyticsDelegate) {
        return new SuccessCreateCardViewModel(eVar, successCreateCardAnalyticsDelegate);
    }

    public SuccessCreateCardViewModel get() {
        return newInstance(this.getUserInfoUseCaseProvider.get(), this.analyticsProvider.get());
    }
}
