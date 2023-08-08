package com.carrefour.fid.android.core.p056di.module;

import android.content.Context;
import com.carrefour.fid.android.logm.C38243b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.core.di.module.r */
public final class C36286r implements C10324h<C38243b> {

    /* renamed from: a */
    public final C36265j f89622a;

    /* renamed from: b */
    public final Provider<Context> f89623b;

    public C36286r(C36265j jVar, Provider<Context> provider) {
        this.f89622a = jVar;
        this.f89623b = provider;
    }

    /* renamed from: a */
    public static C36286r m148896a(C36265j jVar, Provider<Context> provider) {
        return new C36286r(jVar, provider);
    }

    /* renamed from: c */
    public static C38243b m148897c(C36265j jVar, Context context) {
        return (C38243b) C10335o.m38554f(jVar.mo108259h(context));
    }

    /* renamed from: b */
    public C38243b get() {
        return m148897c(this.f89622a, this.f89623b.get());
    }
}
