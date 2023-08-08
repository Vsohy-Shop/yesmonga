package com.carrefour.fid.android.loyalty.presentation.viewmodels.create;

import com.carrefour.fid.android.account.domain.events.C13239a;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase;
import com.carrefour.fid.android.domain.interactors.account.C37521g;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.domain.interactors.ActivateLoyaltyCardFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase;
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
public final class InitLoyaltyCardViewModel_Factory implements C10324h<InitLoyaltyCardViewModel> {
    private final Provider<ActivateLoyaltyCardFidUseCase> activateLoyaltyCardFidUseCaseProvider;
    private final Provider<C13239a> addressTunnelDataProvider;
    private final Provider<InitSecretCodeAnalyticsDelegate> analyticsProvider;
    private final Provider<C28994a> audienceTrackingProvider;
    private final Provider<CreateLoyaltyCardFidUseCase> createLoyaltyCardFidUseCaseProvider;
    private final Provider<GetDQEAddressSuggestionsUseCase> getDQEAddressSuggestionsUseCaseProvider;
    private final Provider<C37878e> getUserInfoUseCaseProvider;
    private final Provider<GetVerificationDQEAddressUseCase> getVerificationDQEAddressUseCaseProvider;
    private final Provider<LoyaltyPreferencesStorage> loyaltyPreferencesStorageProvider;
    private final Provider<C37521g> refreshTokenUseCaseProvider;

    public InitLoyaltyCardViewModel_Factory(Provider<CreateLoyaltyCardFidUseCase> provider, Provider<C37878e> provider2, Provider<C37521g> provider3, Provider<ActivateLoyaltyCardFidUseCase> provider4, Provider<C28994a> provider5, Provider<LoyaltyPreferencesStorage> provider6, Provider<GetDQEAddressSuggestionsUseCase> provider7, Provider<GetVerificationDQEAddressUseCase> provider8, Provider<C13239a> provider9, Provider<InitSecretCodeAnalyticsDelegate> provider10) {
        this.createLoyaltyCardFidUseCaseProvider = provider;
        this.getUserInfoUseCaseProvider = provider2;
        this.refreshTokenUseCaseProvider = provider3;
        this.activateLoyaltyCardFidUseCaseProvider = provider4;
        this.audienceTrackingProvider = provider5;
        this.loyaltyPreferencesStorageProvider = provider6;
        this.getDQEAddressSuggestionsUseCaseProvider = provider7;
        this.getVerificationDQEAddressUseCaseProvider = provider8;
        this.addressTunnelDataProvider = provider9;
        this.analyticsProvider = provider10;
    }

    public static InitLoyaltyCardViewModel_Factory create(Provider<CreateLoyaltyCardFidUseCase> provider, Provider<C37878e> provider2, Provider<C37521g> provider3, Provider<ActivateLoyaltyCardFidUseCase> provider4, Provider<C28994a> provider5, Provider<LoyaltyPreferencesStorage> provider6, Provider<GetDQEAddressSuggestionsUseCase> provider7, Provider<GetVerificationDQEAddressUseCase> provider8, Provider<C13239a> provider9, Provider<InitSecretCodeAnalyticsDelegate> provider10) {
        return new InitLoyaltyCardViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static InitLoyaltyCardViewModel newInstance(CreateLoyaltyCardFidUseCase createLoyaltyCardFidUseCase, C37878e eVar, C37521g gVar, ActivateLoyaltyCardFidUseCase activateLoyaltyCardFidUseCase, C28994a aVar, LoyaltyPreferencesStorage loyaltyPreferencesStorage, GetDQEAddressSuggestionsUseCase getDQEAddressSuggestionsUseCase, GetVerificationDQEAddressUseCase getVerificationDQEAddressUseCase, C13239a aVar2, InitSecretCodeAnalyticsDelegate initSecretCodeAnalyticsDelegate) {
        return new InitLoyaltyCardViewModel(createLoyaltyCardFidUseCase, eVar, gVar, activateLoyaltyCardFidUseCase, aVar, loyaltyPreferencesStorage, getDQEAddressSuggestionsUseCase, getVerificationDQEAddressUseCase, aVar2, initSecretCodeAnalyticsDelegate);
    }

    public InitLoyaltyCardViewModel get() {
        return newInstance(this.createLoyaltyCardFidUseCaseProvider.get(), this.getUserInfoUseCaseProvider.get(), this.refreshTokenUseCaseProvider.get(), this.activateLoyaltyCardFidUseCaseProvider.get(), this.audienceTrackingProvider.get(), this.loyaltyPreferencesStorageProvider.get(), this.getDQEAddressSuggestionsUseCaseProvider.get(), this.getVerificationDQEAddressUseCaseProvider.get(), this.addressTunnelDataProvider.get(), this.analyticsProvider.get());
    }
}
