package com.carrefour.fid.android.shared.network;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.shared.network.d */
public final class C28808d implements C10324h<C28802c> {

    /* renamed from: a */
    public final Provider<Context> f70606a;

    public C28808d(Provider<Context> provider) {
        this.f70606a = provider;
    }

    /* renamed from: a */
    public static C28808d m119231a(Provider<Context> provider) {
        return new C28808d(provider);
    }

    /* renamed from: c */
    public static C28802c m119232c(Context context) {
        return new C28802c(context);
    }

    /* renamed from: b */
    public C28802c get() {
        return m119232c(this.f70606a.get());
    }
}
