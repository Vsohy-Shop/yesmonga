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
public final class SetFirstVisitPrimesFidelityUseCase_Factory implements C10324h<SetFirstVisitPrimesFidelityUseCase> {
    private final Provider<LoyaltyPreferencesStorage> loyaltyPreferencesStorageProvider;

    public SetFirstVisitPrimesFidelityUseCase_Factory(Provider<LoyaltyPreferencesStorage> provider) {
        this.loyaltyPreferencesStorageProvider = provider;
    }

    public static SetFirstVisitPrimesFidelityUseCase_Factory create(Provider<LoyaltyPreferencesStorage> provider) {
        return new SetFirstVisitPrimesFidelityUseCase_Factory(provider);
    }

    public static SetFirstVisitPrimesFidelityUseCase newInstance(LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        return new SetFirstVisitPrimesFidelityUseCase(loyaltyPreferencesStorage);
    }

    public SetFirstVisitPrimesFidelityUseCase get() {
        return newInstance(this.loyaltyPreferencesStorageProvider.get());
    }
}
