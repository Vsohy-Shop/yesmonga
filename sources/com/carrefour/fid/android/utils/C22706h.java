package com.carrefour.fid.android.utils;

import android.content.Context;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ActivityContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.utils.h */
public final class C22706h implements C10324h<DeviceSecurityHelper> {

    /* renamed from: a */
    public final Provider<Context> f58159a;

    /* renamed from: b */
    public final Provider<AppPreferencesStorage> f58160b;

    public C22706h(Provider<Context> provider, Provider<AppPreferencesStorage> provider2) {
        this.f58159a = provider;
        this.f58160b = provider2;
    }

    /* renamed from: a */
    public static C22706h m102801a(Provider<Context> provider, Provider<AppPreferencesStorage> provider2) {
        return new C22706h(provider, provider2);
    }

    /* renamed from: c */
    public static DeviceSecurityHelper m102802c(Context context, AppPreferencesStorage appPreferencesStorage) {
        return new DeviceSecurityHelper(context, appPreferencesStorage);
    }

    /* renamed from: b */
    public DeviceSecurityHelper get() {
        return m102802c(this.f58159a.get(), this.f58160b.get());
    }
}
