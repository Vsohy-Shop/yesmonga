package com.carrefour.fid.android.loyalty.presentation.viewmodels.attach;

import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.AttachCardAnalyticsDelegate;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class AttachCardViewModel_Factory implements C10324h<AttachCardViewModel> {
    private final Provider<AttachCardAnalyticsDelegate> attachCardAnalyticsProvider;
    private final Provider<GetMemberCardUseCase> getMemberCardUseCaseProvider;
    private final Provider<C37878e> getUserInfoUseCaseProvider;

    public AttachCardViewModel_Factory(Provider<GetMemberCardUseCase> provider, Provider<C37878e> provider2, Provider<AttachCardAnalyticsDelegate> provider3) {
        this.getMemberCardUseCaseProvider = provider;
        this.getUserInfoUseCaseProvider = provider2;
        this.attachCardAnalyticsProvider = provider3;
    }

    public static AttachCardViewModel_Factory create(Provider<GetMemberCardUseCase> provider, Provider<C37878e> provider2, Provider<AttachCardAnalyticsDelegate> provider3) {
        return new AttachCardViewModel_Factory(provider, provider2, provider3);
    }

    public static AttachCardViewModel newInstance(GetMemberCardUseCase getMemberCardUseCase, C37878e eVar, AttachCardAnalyticsDelegate attachCardAnalyticsDelegate) {
        return new AttachCardViewModel(getMemberCardUseCase, eVar, attachCardAnalyticsDelegate);
    }

    public AttachCardViewModel get() {
        return newInstance(this.getMemberCardUseCaseProvider.get(), this.getUserInfoUseCaseProvider.get(), this.attachCardAnalyticsProvider.get());
    }
}
