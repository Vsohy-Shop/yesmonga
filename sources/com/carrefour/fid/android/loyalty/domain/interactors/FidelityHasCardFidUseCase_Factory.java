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
public final class FidelityHasCardFidUseCase_Factory implements C10324h<FidelityHasCardFidUseCase> {
    private final Provider<LoyaltyPreferencesStorage> loyaltyPreferencesStorageProvider;

    public FidelityHasCardFidUseCase_Factory(Provider<LoyaltyPreferencesStorage> provider) {
        this.loyaltyPreferencesStorageProvider = provider;
    }

    public static FidelityHasCardFidUseCase_Factory create(Provider<LoyaltyPreferencesStorage> provider) {
        return new FidelityHasCardFidUseCase_Factory(provider);
    }

    public static FidelityHasCardFidUseCase newInstance(LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        return new FidelityHasCardFidUseCase(loyaltyPreferencesStorage);
    }

    public FidelityHasCardFidUseCase get() {
        return newInstance(this.loyaltyPreferencesStorageProvider.get());
    }
}
