package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.account.data.service.C13209a;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.b */
public final class C36200b implements C10324h<C13209a> {

    /* renamed from: a */
    public final C36198a f89404a;

    /* renamed from: b */
    public final Provider<Context> f89405b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89406c;

    /* renamed from: d */
    public final Provider<C36151f> f89407d;

    /* renamed from: e */
    public final Provider<TokenAuthenticator> f89408e;

    /* renamed from: f */
    public final Provider<C28826i> f89409f;

    /* renamed from: g */
    public final Provider<LogMInterceptor> f89410g;

    /* renamed from: h */
    public final Provider<C28833m> f89411h;

    public C36200b(C36198a aVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7) {
        this.f89404a = aVar;
        this.f89405b = provider;
        this.f89406c = provider2;
        this.f89407d = provider3;
        this.f89408e = provider4;
        this.f89409f = provider5;
        this.f89410g = provider6;
        this.f89411h = provider7;
    }

    /* renamed from: a */
    public static C36200b m148665a(C36198a aVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7) {
        return new C36200b(aVar, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: c */
    public static C13209a m148666c(C36198a aVar, Context context, AppEnvironment appEnvironment, C36151f fVar, TokenAuthenticator tokenAuthenticator, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar) {
        return (C13209a) C10335o.m38554f(aVar.mo108158a(context, appEnvironment, fVar, tokenAuthenticator, iVar, logMInterceptor, mVar));
    }

    /* renamed from: b */
    public C13209a get() {
        return m148666c(this.f89404a, this.f89405b.get(), this.f89406c.get(), this.f89407d.get(), this.f89408e.get(), this.f89409f.get(), this.f89410g.get(), this.f89411h.get());
    }
}
