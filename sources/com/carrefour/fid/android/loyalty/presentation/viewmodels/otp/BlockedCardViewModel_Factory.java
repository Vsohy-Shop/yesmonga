package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp;

import com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.BlockedCardAnalyticsDelegate;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class BlockedCardViewModel_Factory implements C10324h<BlockedCardViewModel> {
    private final Provider<BlockedCardAnalyticsDelegate> analyticsProvider;
    private final Provider<GetUserChannelsUseCase> getUserChannelsUseCaseProvider;

    public BlockedCardViewModel_Factory(Provider<GetUserChannelsUseCase> provider, Provider<BlockedCardAnalyticsDelegate> provider2) {
        this.getUserChannelsUseCaseProvider = provider;
        this.analyticsProvider = provider2;
    }

    public static BlockedCardViewModel_Factory create(Provider<GetUserChannelsUseCase> provider, Provider<BlockedCardAnalyticsDelegate> provider2) {
        return new BlockedCardViewModel_Factory(provider, provider2);
    }

    public static BlockedCardViewModel newInstance(GetUserChannelsUseCase getUserChannelsUseCase, BlockedCardAnalyticsDelegate blockedCardAnalyticsDelegate) {
        return new BlockedCardViewModel(getUserChannelsUseCase, blockedCardAnalyticsDelegate);
    }

    public BlockedCardViewModel get() {
        return newInstance(this.getUserChannelsUseCaseProvider.get(), this.analyticsProvider.get());
    }
}
