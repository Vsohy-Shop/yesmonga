package com.carrefour.fid.android.loyalty.data.cache;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
public final class LoyaltyMidFidCache_Factory implements C10324h<LoyaltyMidFidCache> {
    private final Provider<Context> contextProvider;

    public LoyaltyMidFidCache_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static LoyaltyMidFidCache_Factory create(Provider<Context> provider) {
        return new LoyaltyMidFidCache_Factory(provider);
    }

    public static LoyaltyMidFidCache newInstance(Context context) {
        return new LoyaltyMidFidCache(context);
    }

    public LoyaltyMidFidCache get() {
        return newInstance(this.contextProvider.get());
    }
}
