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
public final class ClearLoyaltyUseCase_Factory implements C10324h<ClearLoyaltyUseCase> {
    private final Provider<LoyaltyPreferencesStorage> loyaltyPreferencesStorageProvider;

    public ClearLoyaltyUseCase_Factory(Provider<LoyaltyPreferencesStorage> provider) {
        this.loyaltyPreferencesStorageProvider = provider;
    }

    public static ClearLoyaltyUseCase_Factory create(Provider<LoyaltyPreferencesStorage> provider) {
        return new ClearLoyaltyUseCase_Factory(provider);
    }

    public static ClearLoyaltyUseCase newInstance(LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        return new ClearLoyaltyUseCase(loyaltyPreferencesStorage);
    }

    public ClearLoyaltyUseCase get() {
        return newInstance(this.loyaltyPreferencesStorageProvider.get());
    }
}
