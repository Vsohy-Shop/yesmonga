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
public final class PhysicalStoreDataStore_Factory implements C10324h<PhysicalStoreDataStore> {
    private final Provider<Context> appContextProvider;

    public PhysicalStoreDataStore_Factory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    public static PhysicalStoreDataStore_Factory create(Provider<Context> provider) {
        return new PhysicalStoreDataStore_Factory(provider);
    }

    public static PhysicalStoreDataStore newInstance(Context context) {
        return new PhysicalStoreDataStore(context);
    }

    public PhysicalStoreDataStore get() {
        return newInstance(this.appContextProvider.get());
    }
}
