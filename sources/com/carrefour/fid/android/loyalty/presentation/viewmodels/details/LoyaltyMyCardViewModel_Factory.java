package com.carrefour.fid.android.loyalty.presentation.viewmodels.details;

import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyCardNumberFromPreferencesUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class LoyaltyMyCardViewModel_Factory implements C10324h<LoyaltyMyCardViewModel> {
    private final Provider<GetLoyaltyCardNumberFromPreferencesUseCase> getLoyaltyCardNumberFromPreferencesUseCaseProvider;

    public LoyaltyMyCardViewModel_Factory(Provider<GetLoyaltyCardNumberFromPreferencesUseCase> provider) {
        this.getLoyaltyCardNumberFromPreferencesUseCaseProvider = provider;
    }

    public static LoyaltyMyCardViewModel_Factory create(Provider<GetLoyaltyCardNumberFromPreferencesUseCase> provider) {
        return new LoyaltyMyCardViewModel_Factory(provider);
    }

    public static LoyaltyMyCardViewModel newInstance(GetLoyaltyCardNumberFromPreferencesUseCase getLoyaltyCardNumberFromPreferencesUseCase) {
        return new LoyaltyMyCardViewModel(getLoyaltyCardNumberFromPreferencesUseCase);
    }

    public LoyaltyMyCardViewModel get() {
        return newInstance(this.getLoyaltyCardNumberFromPreferencesUseCaseProvider.get());
    }
}
