package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.data.service.C36621b;
import com.carrefour.fid.android.shared.network.interceptors.C28818d;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.o0 */
public final class C36227o0 implements C10324h<C36621b> {

    /* renamed from: a */
    public final C36225n0 f89492a;

    /* renamed from: b */
    public final Provider<Context> f89493b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89494c;

    /* renamed from: d */
    public final Provider<C36151f> f89495d;

    /* renamed from: e */
    public final Provider<TokenAuthenticator> f89496e;

    /* renamed from: f */
    public final Provider<LogMInterceptor> f89497f;

    /* renamed from: g */
    public final Provider<C28833m> f89498g;

    /* renamed from: h */
    public final Provider<C28818d> f89499h;

    public C36227o0(C36225n0 n0Var, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<LogMInterceptor> provider5, Provider<C28833m> provider6, Provider<C28818d> provider7) {
        this.f89492a = n0Var;
        this.f89493b = provider;
        this.f89494c = provider2;
        this.f89495d = provider3;
        this.f89496e = provider4;
        this.f89497f = provider5;
        this.f89498g = provider6;
        this.f89499h = provider7;
    }

    /* renamed from: a */
    public static C36227o0 m148727a(C36225n0 n0Var, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<LogMInterceptor> provider5, Provider<C28833m> provider6, Provider<C28818d> provider7) {
        return new C36227o0(n0Var, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: c */
    public static C36621b m148728c(C36225n0 n0Var, Context context, AppEnvironment appEnvironment, C36151f fVar, TokenAuthenticator tokenAuthenticator, LogMInterceptor logMInterceptor, C28833m mVar, C28818d dVar) {
        return (C36621b) C10335o.m38554f(n0Var.mo108189a(context, appEnvironment, fVar, tokenAuthenticator, logMInterceptor, mVar, dVar));
    }

    /* renamed from: b */
    public C36621b get() {
        return m148728c(this.f89492a, this.f89493b.get(), this.f89494c.get(), this.f89495d.get(), this.f89496e.get(), this.f89497f.get(), this.f89498g.get(), this.f89499h.get());
    }
}
