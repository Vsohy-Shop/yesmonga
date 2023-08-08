package com.carrefour.fid.android.various.core;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.various.core.b */
public final class C22753b implements C10324h<C22752a> {

    /* renamed from: a */
    public final Provider<Context> f58269a;

    public C22753b(Provider<Context> provider) {
        this.f58269a = provider;
    }

    /* renamed from: a */
    public static C22753b m102913a(Provider<Context> provider) {
        return new C22753b(provider);
    }

    /* renamed from: c */
    public static C22752a m102914c(Context context) {
        return new C22752a(context);
    }

    /* renamed from: b */
    public C22752a get() {
        return m102914c(this.f58269a.get());
    }
}
