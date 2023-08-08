package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class GetLoyaltyCardNumberFromPreferencesUseCase_Factory implements C10324h<GetLoyaltyCardNumberFromPreferencesUseCase> {
    private final Provider<LoyaltyPreferencesStorage> loyaltyPreferencesStorageProvider;

    public GetLoyaltyCardNumberFromPreferencesUseCase_Factory(Provider<LoyaltyPreferencesStorage> provider) {
        this.loyaltyPreferencesStorageProvider = provider;
    }

    public static GetLoyaltyCardNumberFromPreferencesUseCase_Factory create(Provider<LoyaltyPreferencesStorage> provider) {
        return new GetLoyaltyCardNumberFromPreferencesUseCase_Factory(provider);
    }

    public static GetLoyaltyCardNumberFromPreferencesUseCase newInstance(LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        return new GetLoyaltyCardNumberFromPreferencesUseCase(loyaltyPreferencesStorage);
    }

    public GetLoyaltyCardNumberFromPreferencesUseCase get() {
        return newInstance(this.loyaltyPreferencesStorageProvider.get());
    }
}
