package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.data.service.C36620a;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.m0 */
public final class C36223m0 implements C10324h<C36620a> {

    /* renamed from: a */
    public final C36221l0 f89475a;

    /* renamed from: b */
    public final Provider<Context> f89476b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89477c;

    /* renamed from: d */
    public final Provider<C36151f> f89478d;

    /* renamed from: e */
    public final Provider<TokenAuthenticator> f89479e;

    /* renamed from: f */
    public final Provider<C28826i> f89480f;

    /* renamed from: g */
    public final Provider<LogMInterceptor> f89481g;

    /* renamed from: h */
    public final Provider<C28833m> f89482h;

    /* renamed from: i */
    public final Provider<C28818d> f89483i;

    public C36223m0(C36221l0 l0Var, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7, Provider<C28818d> provider8) {
        this.f89475a = l0Var;
        this.f89476b = provider;
        this.f89477c = provider2;
        this.f89478d = provider3;
        this.f89479e = provider4;
        this.f89480f = provider5;
        this.f89481g = provider6;
        this.f89482h = provider7;
        this.f89483i = provider8;
    }

    /* renamed from: a */
    public static C36223m0 m148718a(C36221l0 l0Var, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7, Provider<C28818d> provider8) {
        return new C36223m0(l0Var, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: c */
    public static C36620a m148719c(C36221l0 l0Var, Context context, AppEnvironment appEnvironment, C36151f fVar, TokenAuthenticator tokenAuthenticator, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar, C28818d dVar) {
        return (C36620a) C10335o.m38554f(l0Var.mo108185a(context, appEnvironment, fVar, tokenAuthenticator, iVar, logMInterceptor, mVar, dVar));
    }

    /* renamed from: b */
    public C36620a get() {
        return m148719c(this.f89475a, this.f89476b.get(), this.f89477c.get(), this.f89478d.get(), this.f89479e.get(), this.f89480f.get(), this.f89481g.get(), this.f89482h.get(), this.f89483i.get());
    }
}
