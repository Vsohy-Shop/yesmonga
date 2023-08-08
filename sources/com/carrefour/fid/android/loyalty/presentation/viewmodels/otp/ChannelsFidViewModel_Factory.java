package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp;

import com.carrefour.fid.android.loyalty.domain.interactors.GetOtpUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ChannelsFidViewModel_Factory implements C10324h<ChannelsFidViewModel> {
    private final Provider<GetOtpUseCase> getOtpUseCaseProvider;
    private final Provider<GetUserChannelsUseCase> getUserChannelsUseCaseProvider;

    public ChannelsFidViewModel_Factory(Provider<GetUserChannelsUseCase> provider, Provider<GetOtpUseCase> provider2) {
        this.getUserChannelsUseCaseProvider = provider;
        this.getOtpUseCaseProvider = provider2;
    }

    public static ChannelsFidViewModel_Factory create(Provider<GetUserChannelsUseCase> provider, Provider<GetOtpUseCase> provider2) {
        return new ChannelsFidViewModel_Factory(provider, provider2);
    }

    public static ChannelsFidViewModel newInstance(GetUserChannelsUseCase getUserChannelsUseCase, GetOtpUseCase getOtpUseCase) {
        return new ChannelsFidViewModel(getUserChannelsUseCase, getOtpUseCase);
    }

    public ChannelsFidViewModel get() {
        return newInstance(this.getUserChannelsUseCaseProvider.get(), this.getOtpUseCaseProvider.get());
    }
}
