package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.loyalty.core.interceptors.MidFidErrorInterceptor;
import com.carrefour.fid.android.loyalty.data.services.MidFidApiService;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.e0 */
public final class C36207e0 implements C10324h<MidFidApiService> {

    /* renamed from: a */
    public final C36205d0 f89436a;

    /* renamed from: b */
    public final Provider<Context> f89437b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89438c;

    /* renamed from: d */
    public final Provider<C36151f> f89439d;

    /* renamed from: e */
    public final Provider<TokenAuthenticator> f89440e;

    /* renamed from: f */
    public final Provider<C28826i> f89441f;

    /* renamed from: g */
    public final Provider<LogMInterceptor> f89442g;

    /* renamed from: h */
    public final Provider<MidFidErrorInterceptor> f89443h;

    /* renamed from: i */
    public final Provider<C28833m> f89444i;

    /* renamed from: j */
    public final Provider<C28818d> f89445j;

    public C36207e0(C36205d0 d0Var, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<MidFidErrorInterceptor> provider7, Provider<C28833m> provider8, Provider<C28818d> provider9) {
        this.f89436a = d0Var;
        this.f89437b = provider;
        this.f89438c = provider2;
        this.f89439d = provider3;
        this.f89440e = provider4;
        this.f89441f = provider5;
        this.f89442g = provider6;
        this.f89443h = provider7;
        this.f89444i = provider8;
        this.f89445j = provider9;
    }

    /* renamed from: a */
    public static C36207e0 m148682a(C36205d0 d0Var, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<MidFidErrorInterceptor> provider7, Provider<C28833m> provider8, Provider<C28818d> provider9) {
        return new C36207e0(d0Var, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    /* renamed from: c */
    public static MidFidApiService m148683c(C36205d0 d0Var, Context context, AppEnvironment appEnvironment, C36151f fVar, TokenAuthenticator tokenAuthenticator, C28826i iVar, LogMInterceptor logMInterceptor, MidFidErrorInterceptor midFidErrorInterceptor, C28833m mVar, C28818d dVar) {
        return (MidFidApiService) C10335o.m38554f(d0Var.mo108167a(context, appEnvironment, fVar, tokenAuthenticator, iVar, logMInterceptor, midFidErrorInterceptor, mVar, dVar));
    }

    /* renamed from: b */
    public MidFidApiService get() {
        return m148683c(this.f89436a, this.f89437b.get(), this.f89438c.get(), this.f89439d.get(), this.f89440e.get(), this.f89441f.get(), this.f89442g.get(), this.f89443h.get(), this.f89444i.get(), this.f89445j.get());
    }
}
