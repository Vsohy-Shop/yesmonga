package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.data.service.C36628g;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.p */
public final class C36228p implements C10324h<C36628g> {

    /* renamed from: a */
    public final C36226o f89500a;

    /* renamed from: b */
    public final Provider<Context> f89501b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89502c;

    /* renamed from: d */
    public final Provider<C36151f> f89503d;

    /* renamed from: e */
    public final Provider<TokenAuthenticator> f89504e;

    /* renamed from: f */
    public final Provider<C28826i> f89505f;

    /* renamed from: g */
    public final Provider<LogMInterceptor> f89506g;

    /* renamed from: h */
    public final Provider<C28833m> f89507h;

    /* renamed from: i */
    public final Provider<C28818d> f89508i;

    public C36228p(C36226o oVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7, Provider<C28818d> provider8) {
        this.f89500a = oVar;
        this.f89501b = provider;
        this.f89502c = provider2;
        this.f89503d = provider3;
        this.f89504e = provider4;
        this.f89505f = provider5;
        this.f89506g = provider6;
        this.f89507h = provider7;
        this.f89508i = provider8;
    }

    /* renamed from: a */
    public static C36228p m148730a(C36226o oVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7, Provider<C28818d> provider8) {
        return new C36228p(oVar, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: c */
    public static C36628g m148731c(C36226o oVar, Context context, AppEnvironment appEnvironment, C36151f fVar, TokenAuthenticator tokenAuthenticator, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar, C28818d dVar) {
        return (C36628g) C10335o.m38554f(oVar.mo108191a(context, appEnvironment, fVar, tokenAuthenticator, iVar, logMInterceptor, mVar, dVar));
    }

    /* renamed from: b */
    public C36628g get() {
        return m148731c(this.f89500a, this.f89501b.get(), this.f89502c.get(), this.f89503d.get(), this.f89504e.get(), this.f89505f.get(), this.f89506g.get(), this.f89507h.get(), this.f89508i.get());
    }
}
