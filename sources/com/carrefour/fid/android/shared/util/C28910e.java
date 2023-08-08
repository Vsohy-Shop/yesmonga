package com.carrefour.fid.android.shared.util;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.shared.util.e */
public final class C28910e implements C10324h<C28909d> {

    /* renamed from: a */
    public final Provider<Context> f70822a;

    public C28910e(Provider<Context> provider) {
        this.f70822a = provider;
    }

    /* renamed from: a */
    public static C28910e m119564a(Provider<Context> provider) {
        return new C28910e(provider);
    }

    /* renamed from: c */
    public static C28909d m119565c(Context context) {
        return new C28909d(context);
    }

    /* renamed from: b */
    public C28909d get() {
        return m119565c(this.f70822a.get());
    }
}
