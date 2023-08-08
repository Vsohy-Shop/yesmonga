package com.carrefour.fid.android.core.p056di.module;

import android.content.Context;
import com.google.android.play.core.review.C32121c;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.core.di.module.u */
public final class C36289u implements C10324h<C32121c> {

    /* renamed from: a */
    public final C36265j f89627a;

    /* renamed from: b */
    public final Provider<Context> f89628b;

    public C36289u(C36265j jVar, Provider<Context> provider) {
        this.f89627a = jVar;
        this.f89628b = provider;
    }

    /* renamed from: a */
    public static C36289u m148905a(C36265j jVar, Provider<Context> provider) {
        return new C36289u(jVar, provider);
    }

    /* renamed from: c */
    public static C32121c m148906c(C36265j jVar, Context context) {
        return (C32121c) C10335o.m38554f(jVar.mo108262k(context));
    }

    /* renamed from: b */
    public C32121c get() {
        return m148906c(this.f89627a, this.f89628b.get());
    }
}
