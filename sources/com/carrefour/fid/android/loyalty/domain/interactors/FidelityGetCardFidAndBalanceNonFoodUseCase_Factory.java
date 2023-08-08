package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.loyalty.C37700d;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class FidelityGetCardFidAndBalanceNonFoodUseCase_Factory implements C10324h<FidelityGetCardFidAndBalanceNonFoodUseCase> {
    private final Provider<C37816e> getFacilityDetailsByAnabelKeyUseCaseProvider;
    private final Provider<GetLoyaltyBalanceUseCase> getLoyaltyBalanceUseCaseProvider;
    private final Provider<GetLoyaltyCardNumberFromPreferencesUseCase> getLoyaltyCardNumberFromPreferencesUseCaseProvider;
    private final Provider<C37700d> hasCardFidUseCaseProvider;

    public FidelityGetCardFidAndBalanceNonFoodUseCase_Factory(Provider<C37700d> provider, Provider<GetLoyaltyCardNumberFromPreferencesUseCase> provider2, Provider<GetLoyaltyBalanceUseCase> provider3, Provider<C37816e> provider4) {
        this.hasCardFidUseCaseProvider = provider;
        this.getLoyaltyCardNumberFromPreferencesUseCaseProvider = provider2;
        this.getLoyaltyBalanceUseCaseProvider = provider3;
        this.getFacilityDetailsByAnabelKeyUseCaseProvider = provider4;
    }

    public static FidelityGetCardFidAndBalanceNonFoodUseCase_Factory create(Provider<C37700d> provider, Provider<GetLoyaltyCardNumberFromPreferencesUseCase> provider2, Provider<GetLoyaltyBalanceUseCase> provider3, Provider<C37816e> provider4) {
        return new FidelityGetCardFidAndBalanceNonFoodUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static FidelityGetCardFidAndBalanceNonFoodUseCase newInstance(C37700d dVar, GetLoyaltyCardNumberFromPreferencesUseCase getLoyaltyCardNumberFromPreferencesUseCase, GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase, C37816e eVar) {
        return new FidelityGetCardFidAndBalanceNonFoodUseCase(dVar, getLoyaltyCardNumberFromPreferencesUseCase, getLoyaltyBalanceUseCase, eVar);
    }

    public FidelityGetCardFidAndBalanceNonFoodUseCase get() {
        return newInstance(this.hasCardFidUseCaseProvider.get(), this.getLoyaltyCardNumberFromPreferencesUseCaseProvider.get(), this.getLoyaltyBalanceUseCaseProvider.get(), this.getFacilityDetailsByAnabelKeyUseCaseProvider.get());
    }
}
