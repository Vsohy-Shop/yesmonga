package com.carrefour.fid.android.loyalty.data.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class LoyaltyHeaders_Factory implements C10324h<LoyaltyHeaders> {
    private final Provider<C28640a> headerBuilderProvider;

    public LoyaltyHeaders_Factory(Provider<C28640a> provider) {
        this.headerBuilderProvider = provider;
    }

    public static LoyaltyHeaders_Factory create(Provider<C28640a> provider) {
        return new LoyaltyHeaders_Factory(provider);
    }

    public static LoyaltyHeaders newInstance(C28640a aVar) {
        return new LoyaltyHeaders(aVar);
    }

    public LoyaltyHeaders get() {
        return newInstance(this.headerBuilderProvider.get());
    }
}
