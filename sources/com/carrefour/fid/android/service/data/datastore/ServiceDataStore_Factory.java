package com.carrefour.fid.android.service.data.datastore;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
public final class ServiceDataStore_Factory implements C10324h<ServiceDataStore> {
    private final Provider<Context> appContextProvider;

    public ServiceDataStore_Factory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    public static ServiceDataStore_Factory create(Provider<Context> provider) {
        return new ServiceDataStore_Factory(provider);
    }

    public static ServiceDataStore newInstance(Context context) {
        return new ServiceDataStore(context);
    }

    public ServiceDataStore get() {
        return newInstance(this.appContextProvider.get());
    }
}
