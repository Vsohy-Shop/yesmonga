package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp;

import com.carrefour.fid.android.domain.interactors.account.C37521g;
import com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.InitSecretCodeAnalyticsDelegate;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class SecretCodeViewModel_Factory implements C10324h<SecretCodeViewModel> {
    private final Provider<InitSecretCodeAnalyticsDelegate> analyticsProvider;
    private final Provider<C28994a> audienceTrackingAdapterProvider;
    private final Provider<LinkLoyaltyCardUseCase> linkLoyaltyCardUseCaseProvider;
    private final Provider<LoyaltyAuthenticationUseCase> loyaltyAuthenticationUseCaseProvider;
    private final Provider<C37521g> refreshTokenUseCaseProvider;
    private final Provider<UpdateSecretCodeUseCase> updateSecretCodeUseCaseProvider;

    public SecretCodeViewModel_Factory(Provider<UpdateSecretCodeUseCase> provider, Provider<LoyaltyAuthenticationUseCase> provider2, Provider<LinkLoyaltyCardUseCase> provider3, Provider<C37521g> provider4, Provider<C28994a> provider5, Provider<InitSecretCodeAnalyticsDelegate> provider6) {
        this.updateSecretCodeUseCaseProvider = provider;
        this.loyaltyAuthenticationUseCaseProvider = provider2;
        this.linkLoyaltyCardUseCaseProvider = provider3;
        this.refreshTokenUseCaseProvider = provider4;
        this.audienceTrackingAdapterProvider = provider5;
        this.analyticsProvider = provider6;
    }

    public static SecretCodeViewModel_Factory create(Provider<UpdateSecretCodeUseCase> provider, Provider<LoyaltyAuthenticationUseCase> provider2, Provider<LinkLoyaltyCardUseCase> provider3, Provider<C37521g> provider4, Provider<C28994a> provider5, Provider<InitSecretCodeAnalyticsDelegate> provider6) {
        return new SecretCodeViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static SecretCodeViewModel newInstance(UpdateSecretCodeUseCase updateSecretCodeUseCase, LoyaltyAuthenticationUseCase loyaltyAuthenticationUseCase, LinkLoyaltyCardUseCase linkLoyaltyCardUseCase, C37521g gVar, C28994a aVar, InitSecretCodeAnalyticsDelegate initSecretCodeAnalyticsDelegate) {
        return new SecretCodeViewModel(updateSecretCodeUseCase, loyaltyAuthenticationUseCase, linkLoyaltyCardUseCase, gVar, aVar, initSecretCodeAnalyticsDelegate);
    }

    public SecretCodeViewModel get() {
        return newInstance(this.updateSecretCodeUseCaseProvider.get(), this.loyaltyAuthenticationUseCaseProvider.get(), this.linkLoyaltyCardUseCaseProvider.get(), this.refreshTokenUseCaseProvider.get(), this.audienceTrackingAdapterProvider.get(), this.analyticsProvider.get());
    }
}
