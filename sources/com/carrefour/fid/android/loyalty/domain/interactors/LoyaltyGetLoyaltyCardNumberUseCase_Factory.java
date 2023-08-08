package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.user.C37878e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class LoyaltyGetLoyaltyCardNumberUseCase_Factory implements C10324h<LoyaltyGetLoyaltyCardNumberUseCase> {
    private final Provider<GetLoyaltyCardNumberFromPreferencesUseCase> getLoyaltyCardNumberFromPreferencesUseCaseProvider;
    private final Provider<C37878e> getUserInfoUseCaseProvider;

    public LoyaltyGetLoyaltyCardNumberUseCase_Factory(Provider<GetLoyaltyCardNumberFromPreferencesUseCase> provider, Provider<C37878e> provider2) {
        this.getLoyaltyCardNumberFromPreferencesUseCaseProvider = provider;
        this.getUserInfoUseCaseProvider = provider2;
    }

    public static LoyaltyGetLoyaltyCardNumberUseCase_Factory create(Provider<GetLoyaltyCardNumberFromPreferencesUseCase> provider, Provider<C37878e> provider2) {
        return new LoyaltyGetLoyaltyCardNumberUseCase_Factory(provider, provider2);
    }

    public static LoyaltyGetLoyaltyCardNumberUseCase newInstance(GetLoyaltyCardNumberFromPreferencesUseCase getLoyaltyCardNumberFromPreferencesUseCase, C37878e eVar) {
        return new LoyaltyGetLoyaltyCardNumberUseCase(getLoyaltyCardNumberFromPreferencesUseCase, eVar);
    }

    public LoyaltyGetLoyaltyCardNumberUseCase get() {
        return newInstance(this.getLoyaltyCardNumberFromPreferencesUseCaseProvider.get(), this.getUserInfoUseCaseProvider.get());
    }
}
