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
public final class SaveHasPrimeFidUseCase_Factory implements C10324h<SaveHasPrimeFidUseCase> {
    private final Provider<LoyaltyPreferencesStorage> loyaltyPreferencesStorageProvider;

    public SaveHasPrimeFidUseCase_Factory(Provider<LoyaltyPreferencesStorage> provider) {
        this.loyaltyPreferencesStorageProvider = provider;
    }

    public static SaveHasPrimeFidUseCase_Factory create(Provider<LoyaltyPreferencesStorage> provider) {
        return new SaveHasPrimeFidUseCase_Factory(provider);
    }

    public static SaveHasPrimeFidUseCase newInstance(LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        return new SaveHasPrimeFidUseCase(loyaltyPreferencesStorage);
    }

    public SaveHasPrimeFidUseCase get() {
        return newInstance(this.loyaltyPreferencesStorageProvider.get());
    }
}
