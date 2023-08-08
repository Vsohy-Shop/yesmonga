package com.carrefour.fid.android.airship.data.datasource;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.airship.data.datasource.b */
public final class C13743b implements C10324h<C13742a> {

    /* renamed from: a */
    public final Provider<Context> f33384a;

    public C13743b(Provider<Context> provider) {
        this.f33384a = provider;
    }

    /* renamed from: a */
    public static C13743b m58606a(Provider<Context> provider) {
        return new C13743b(provider);
    }

    /* renamed from: c */
    public static C13742a m58607c(Context context) {
        return new C13742a(context);
    }

    /* renamed from: b */
    public C13742a get() {
        return m58607c(this.f33384a.get());
    }
}
