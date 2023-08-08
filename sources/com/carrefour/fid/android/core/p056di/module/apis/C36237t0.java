package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.data.service.C36636o;
import com.carrefour.fid.android.shared.network.interceptors.C28818d;
import com.carrefour.fid.android.shared.network.interceptors.C28826i;
import com.carrefour.fid.android.shared.network.interceptors.C28833m;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.apis.t0 */
public final class C36237t0 implements C10324h<C36636o> {

    /* renamed from: a */
    public final C36235s0 f89527a;

    /* renamed from: b */
    public final Provider<Context> f89528b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89529c;

    /* renamed from: d */
    public final Provider<C36151f> f89530d;

    /* renamed from: e */
    public final Provider<TokenAuthenticator> f89531e;

    /* renamed from: f */
    public final Provider<C28826i> f89532f;

    /* renamed from: g */
    public final Provider<LogMInterceptor> f89533g;

    /* renamed from: h */
    public final Provider<C28833m> f89534h;

    /* renamed from: i */
    public final Provider<C28818d> f89535i;

    public C36237t0(C36235s0 s0Var, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7, Provider<C28818d> provider8) {
        this.f89527a = s0Var;
        this.f89528b = provider;
        this.f89529c = provider2;
        this.f89530d = provider3;
        this.f89531e = provider4;
        this.f89532f = provider5;
        this.f89533g = provider6;
        this.f89534h = provider7;
        this.f89535i = provider8;
    }

    /* renamed from: a */
    public static C36237t0 m148749a(C36235s0 s0Var, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7, Provider<C28818d> provider8) {
        return new C36237t0(s0Var, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: c */
    public static C36636o m148750c(C36235s0 s0Var, Context context, AppEnvironment appEnvironment, C36151f fVar, TokenAuthenticator tokenAuthenticator, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar, C28818d dVar) {
        return (C36636o) C10335o.m38554f(s0Var.mo108200a(context, appEnvironment, fVar, tokenAuthenticator, iVar, logMInterceptor, mVar, dVar));
    }

    /* renamed from: b */
    public C36636o get() {
        return m148750c(this.f89527a, this.f89528b.get(), this.f89529c.get(), this.f89530d.get(), this.f89531e.get(), this.f89532f.get(), this.f89533g.get(), this.f89534h.get(), this.f89535i.get());
    }
}
