package com.carrefour.fid.android.core.p056di.module;

import android.content.Context;
import androidx.core.app.C17180n4;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.core.di.module.t */
public final class C36288t implements C10324h<C17180n4> {

    /* renamed from: a */
    public final C36265j f89625a;

    /* renamed from: b */
    public final Provider<Context> f89626b;

    public C36288t(C36265j jVar, Provider<Context> provider) {
        this.f89625a = jVar;
        this.f89626b = provider;
    }

    /* renamed from: a */
    public static C36288t m148902a(C36265j jVar, Provider<Context> provider) {
        return new C36288t(jVar, provider);
    }

    /* renamed from: c */
    public static C17180n4 m148903c(C36265j jVar, Context context) {
        return (C17180n4) C10335o.m38554f(jVar.mo108261j(context));
    }

    /* renamed from: b */
    public C17180n4 get() {
        return m148903c(this.f89625a, this.f89626b.get());
    }
}
