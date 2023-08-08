package com.carrefour.fid.android.loyalty.core.datastore;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
public final class LoyaltyPreferencesStorage_Factory implements C10324h<LoyaltyPreferencesStorage> {
    private final Provider<Context> contextProvider;

    public LoyaltyPreferencesStorage_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static LoyaltyPreferencesStorage_Factory create(Provider<Context> provider) {
        return new LoyaltyPreferencesStorage_Factory(provider);
    }

    public static LoyaltyPreferencesStorage newInstance(Context context) {
        return new LoyaltyPreferencesStorage(context);
    }

    public LoyaltyPreferencesStorage get() {
        return newInstance(this.contextProvider.get());
    }
}
