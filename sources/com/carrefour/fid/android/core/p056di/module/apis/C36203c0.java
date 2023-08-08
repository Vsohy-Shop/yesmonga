package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.loyalty.data.services.ApiMemberCardService;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.c0 */
public final class C36203c0 implements C10324h<ApiMemberCardService> {

    /* renamed from: a */
    public final C36201b0 f89414a;

    /* renamed from: b */
    public final Provider<Context> f89415b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89416c;

    /* renamed from: d */
    public final Provider<C36151f> f89417d;

    /* renamed from: e */
    public final Provider<TokenAuthenticator> f89418e;

    /* renamed from: f */
    public final Provider<C28826i> f89419f;

    /* renamed from: g */
    public final Provider<LogMInterceptor> f89420g;

    /* renamed from: h */
    public final Provider<C28833m> f89421h;

    /* renamed from: i */
    public final Provider<C28818d> f89422i;

    public C36203c0(C36201b0 b0Var, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7, Provider<C28818d> provider8) {
        this.f89414a = b0Var;
        this.f89415b = provider;
        this.f89416c = provider2;
        this.f89417d = provider3;
        this.f89418e = provider4;
        this.f89419f = provider5;
        this.f89420g = provider6;
        this.f89421h = provider7;
        this.f89422i = provider8;
    }

    /* renamed from: a */
    public static C36203c0 m148672a(C36201b0 b0Var, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7, Provider<C28818d> provider8) {
        return new C36203c0(b0Var, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: c */
    public static ApiMemberCardService m148673c(C36201b0 b0Var, Context context, AppEnvironment appEnvironment, C36151f fVar, TokenAuthenticator tokenAuthenticator, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar, C28818d dVar) {
        return (ApiMemberCardService) C10335o.m38554f(b0Var.mo108161a(context, appEnvironment, fVar, tokenAuthenticator, iVar, logMInterceptor, mVar, dVar));
    }

    /* renamed from: b */
    public ApiMemberCardService get() {
        return m148673c(this.f89414a, this.f89415b.get(), this.f89416c.get(), this.f89417d.get(), this.f89418e.get(), this.f89419f.get(), this.f89420g.get(), this.f89421h.get(), this.f89422i.get());
    }
}
