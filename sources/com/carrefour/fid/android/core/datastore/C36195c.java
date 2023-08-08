package com.carrefour.fid.android.core.datastore;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.datastore.c */
public final class C36195c implements C10324h<AppPreferencesStorage> {

    /* renamed from: a */
    public final Provider<Context> f89391a;

    public C36195c(Provider<Context> provider) {
        this.f89391a = provider;
    }

    /* renamed from: a */
    public static C36195c m148649a(Provider<Context> provider) {
        return new C36195c(provider);
    }

    /* renamed from: c */
    public static AppPreferencesStorage m148650c(Context context) {
        return new AppPreferencesStorage(context);
    }

    /* renamed from: b */
    public AppPreferencesStorage get() {
        return m148650c(this.f89391a.get());
    }
}
