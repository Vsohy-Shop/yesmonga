package com.carrefour.fid.android.consent.core.datastore;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
public final class ConsentPreferencesStorage_Factory implements C10324h<ConsentPreferencesStorage> {
    private final Provider<Context> contextProvider;

    public ConsentPreferencesStorage_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ConsentPreferencesStorage_Factory create(Provider<Context> provider) {
        return new ConsentPreferencesStorage_Factory(provider);
    }

    public static ConsentPreferencesStorage newInstance(Context context) {
        return new ConsentPreferencesStorage(context);
    }

    public ConsentPreferencesStorage get() {
        return newInstance(this.contextProvider.get());
    }
}
