package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.loyalty.data.services.LinkLoyaltyCardApiService;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.v */
public final class C36239v implements C10324h<LinkLoyaltyCardApiService> {

    /* renamed from: a */
    public final C36238u f89537a;

    /* renamed from: b */
    public final Provider<Context> f89538b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89539c;

    /* renamed from: d */
    public final Provider<C36151f> f89540d;

    /* renamed from: e */
    public final Provider<TokenAuthenticator> f89541e;

    /* renamed from: f */
    public final Provider<C28826i> f89542f;

    /* renamed from: g */
    public final Provider<LogMInterceptor> f89543g;

    /* renamed from: h */
    public final Provider<C28833m> f89544h;

    public C36239v(C36238u uVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7) {
        this.f89537a = uVar;
        this.f89538b = provider;
        this.f89539c = provider2;
        this.f89540d = provider3;
        this.f89541e = provider4;
        this.f89542f = provider5;
        this.f89543g = provider6;
        this.f89544h = provider7;
    }

    /* renamed from: a */
    public static C36239v m148753a(C36238u uVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<C28833m> provider7) {
        return new C36239v(uVar, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: c */
    public static LinkLoyaltyCardApiService m148754c(C36238u uVar, Context context, AppEnvironment appEnvironment, C36151f fVar, TokenAuthenticator tokenAuthenticator, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar) {
        return (LinkLoyaltyCardApiService) C10335o.m38554f(uVar.mo108203a(context, appEnvironment, fVar, tokenAuthenticator, iVar, logMInterceptor, mVar));
    }

    /* renamed from: b */
    public LinkLoyaltyCardApiService get() {
        return m148754c(this.f89537a, this.f89538b.get(), this.f89539c.get(), this.f89540d.get(), this.f89541e.get(), this.f89542f.get(), this.f89543g.get(), this.f89544h.get());
    }
}
