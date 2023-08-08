package com.carrefour.fid.android.various.p033di;

import android.content.Context;
import com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.various.di.b */
public final class C22777b implements C10324h<AppMessageDataStore> {

    /* renamed from: a */
    public final Provider<Context> f58327a;

    public C22777b(Provider<Context> provider) {
        this.f58327a = provider;
    }

    /* renamed from: a */
    public static C22777b m102996a(Provider<Context> provider) {
        return new C22777b(provider);
    }

    /* renamed from: c */
    public static AppMessageDataStore m102997c(Context context) {
        return (AppMessageDataStore) C10335o.m38554f(C22774a.f58325a.mo67189a(context));
    }

    /* renamed from: b */
    public AppMessageDataStore get() {
        return m102997c(this.f58327a.get());
    }
}
