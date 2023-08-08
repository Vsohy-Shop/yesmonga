package com.carrefour.fid.android.scan.core.datastore;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.scan.core.datastore.c */
public final class C28261c implements C10324h<ScanPreferencesStorage> {

    /* renamed from: a */
    public final Provider<Context> f68415a;

    public C28261c(Provider<Context> provider) {
        this.f68415a = provider;
    }

    /* renamed from: a */
    public static C28261c m118183a(Provider<Context> provider) {
        return new C28261c(provider);
    }

    /* renamed from: c */
    public static ScanPreferencesStorage m118184c(Context context) {
        return new ScanPreferencesStorage(context);
    }

    /* renamed from: b */
    public ScanPreferencesStorage get() {
        return m118184c(this.f68415a.get());
    }
}
