package com.carrefour.fid.android.loyalty.presentation.viewmodels.history;

import com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetUserTransactionsUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyAmountHistoryAnalyticsDelegate;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class LoyaltyAmountHistoryViewModel_Factory implements C10324h<LoyaltyAmountHistoryViewModel> {
    private final Provider<LoyaltyAmountHistoryAnalyticsDelegate> analyticsProvider;
    private final Provider<GetFidHistoryUseCase> getFidHistoryUseCaseProvider;
    private final Provider<GetUserTransactionsUseCase> getUserTransactionsUseCaseProvider;

    public LoyaltyAmountHistoryViewModel_Factory(Provider<GetFidHistoryUseCase> provider, Provider<GetUserTransactionsUseCase> provider2, Provider<LoyaltyAmountHistoryAnalyticsDelegate> provider3) {
        this.getFidHistoryUseCaseProvider = provider;
        this.getUserTransactionsUseCaseProvider = provider2;
        this.analyticsProvider = provider3;
    }

    public static LoyaltyAmountHistoryViewModel_Factory create(Provider<GetFidHistoryUseCase> provider, Provider<GetUserTransactionsUseCase> provider2, Provider<LoyaltyAmountHistoryAnalyticsDelegate> provider3) {
        return new LoyaltyAmountHistoryViewModel_Factory(provider, provider2, provider3);
    }

    public static LoyaltyAmountHistoryViewModel newInstance(GetFidHistoryUseCase getFidHistoryUseCase, GetUserTransactionsUseCase getUserTransactionsUseCase, LoyaltyAmountHistoryAnalyticsDelegate loyaltyAmountHistoryAnalyticsDelegate) {
        return new LoyaltyAmountHistoryViewModel(getFidHistoryUseCase, getUserTransactionsUseCase, loyaltyAmountHistoryAnalyticsDelegate);
    }

    public LoyaltyAmountHistoryViewModel get() {
        return newInstance(this.getFidHistoryUseCaseProvider.get(), this.getUserTransactionsUseCaseProvider.get(), this.analyticsProvider.get());
    }
}
