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
public final class ShouldDisplayUserConsentsBackdropUseCase_Factory implements C10324h<ShouldDisplayUserConsentsBackdropUseCase> {
    private final Provider<ConsentPreferencesStorage> consentPreferencesStorageProvider;

    public ShouldDisplayUserConsentsBackdropUseCase_Factory(Provider<ConsentPreferencesStorage> provider) {
        this.consentPreferencesStorageProvider = provider;
    }

    public static ShouldDisplayUserConsentsBackdropUseCase_Factory create(Provider<ConsentPreferencesStorage> provider) {
        return new ShouldDisplayUserConsentsBackdropUseCase_Factory(provider);
    }

    public static ShouldDisplayUserConsentsBackdropUseCase newInstance(ConsentPreferencesStorage consentPreferencesStorage) {
        return new ShouldDisplayUserConsentsBackdropUseCase(consentPreferencesStorage);
    }

    public ShouldDisplayUserConsentsBackdropUseCase get() {
        return newInstance(this.consentPreferencesStorageProvider.get());
    }
}
