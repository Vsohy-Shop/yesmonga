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
public final class IsFirstVisitPrimesFidelityUseCase_Factory implements C10324h<IsFirstVisitPrimesFidelityUseCase> {
    private final Provider<LoyaltyPreferencesStorage> loyaltyPreferencesStorageProvider;

    public IsFirstVisitPrimesFidelityUseCase_Factory(Provider<LoyaltyPreferencesStorage> provider) {
        this.loyaltyPreferencesStorageProvider = provider;
    }

    public static IsFirstVisitPrimesFidelityUseCase_Factory create(Provider<LoyaltyPreferencesStorage> provider) {
        return new IsFirstVisitPrimesFidelityUseCase_Factory(provider);
    }

    public static IsFirstVisitPrimesFidelityUseCase newInstance(LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        return new IsFirstVisitPrimesFidelityUseCase(loyaltyPreferencesStorage);
    }

    public IsFirstVisitPrimesFidelityUseCase get() {
        return newInstance(this.loyaltyPreferencesStorageProvider.get());
    }
}
