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
public final class ClearConsentUserCase_Factory implements C10324h<ClearConsentUserCase> {
    private final Provider<ConsentPreferencesStorage> consentPreferencesStorageProvider;

    public ClearConsentUserCase_Factory(Provider<ConsentPreferencesStorage> provider) {
        this.consentPreferencesStorageProvider = provider;
    }

    public static ClearConsentUserCase_Factory create(Provider<ConsentPreferencesStorage> provider) {
        return new ClearConsentUserCase_Factory(provider);
    }

    public static ClearConsentUserCase newInstance(ConsentPreferencesStorage consentPreferencesStorage) {
        return new ClearConsentUserCase(consentPreferencesStorage);
    }

    public ClearConsentUserCase get() {
        return newInstance(this.consentPreferencesStorageProvider.get());
    }
}
