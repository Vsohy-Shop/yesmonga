package com.carrefour.fid.android.consent.domain.interactors;

import com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class SaveConsentCurrentDateUseCase_Factory implements C10324h<SaveConsentCurrentDateUseCase> {
    private final Provider<ConsentPreferencesStorage> consentPreferencesStorageProvider;

    public SaveConsentCurrentDateUseCase_Factory(Provider<ConsentPreferencesStorage> provider) {
        this.consentPreferencesStorageProvider = provider;
    }

    public static SaveConsentCurrentDateUseCase_Factory create(Provider<ConsentPreferencesStorage> provider) {
        return new SaveConsentCurrentDateUseCase_Factory(provider);
    }

    public static SaveConsentCurrentDateUseCase newInstance(ConsentPreferencesStorage consentPreferencesStorage) {
        return new SaveConsentCurrentDateUseCase(consentPreferencesStorage);
    }

    public SaveConsentCurrentDateUseCase get() {
        return newInstance(this.consentPreferencesStorageProvider.get());
    }
}
