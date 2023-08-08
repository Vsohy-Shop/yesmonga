package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.repositories.o */
public final class C36608o implements C10324h<OneTrustRepository> {

    /* renamed from: a */
    public final Provider<Context> f90505a;

    public C36608o(Provider<Context> provider) {
        this.f90505a = provider;
    }

    /* renamed from: a */
    public static C36608o m150204a(Provider<Context> provider) {
        return new C36608o(provider);
    }

    /* renamed from: c */
    public static OneTrustRepository m150205c(Context context) {
        return new OneTrustRepository(context);
    }

    /* renamed from: b */
    public OneTrustRepository get() {
        return m150205c(this.f90505a.get());
    }
}
