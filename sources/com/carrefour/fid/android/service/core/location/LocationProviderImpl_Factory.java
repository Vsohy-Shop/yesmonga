package com.carrefour.fid.android.service.core.location;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
public final class LocationProviderImpl_Factory implements C10324h<LocationProviderImpl> {
    private final Provider<Context> appContextProvider;

    public LocationProviderImpl_Factory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    public static LocationProviderImpl_Factory create(Provider<Context> provider) {
        return new LocationProviderImpl_Factory(provider);
    }

    public static LocationProviderImpl newInstance(Context context) {
        return new LocationProviderImpl(context);
    }

    public LocationProviderImpl get() {
        return newInstance(this.appContextProvider.get());
    }
}
