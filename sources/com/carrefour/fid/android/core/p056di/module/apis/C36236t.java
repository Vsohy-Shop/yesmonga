package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.loyalty.core.interceptors.MidFidErrorInterceptor;
import com.carrefour.fid.android.loyalty.data.services.IamAuthLoyaltyApiService;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.t */
public final class C36236t implements C10324h<IamAuthLoyaltyApiService> {

    /* renamed from: a */
    public final C36234s f89518a;

    /* renamed from: b */
    public final Provider<Context> f89519b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89520c;

    /* renamed from: d */
    public final Provider<C36151f> f89521d;

    /* renamed from: e */
    public final Provider<TokenAuthenticator> f89522e;

    /* renamed from: f */
    public final Provider<C28826i> f89523f;

    /* renamed from: g */
    public final Provider<LogMInterceptor> f89524g;

    /* renamed from: h */
    public final Provider<MidFidErrorInterceptor> f89525h;

    /* renamed from: i */
    public final Provider<C28833m> f89526i;

    public C36236t(C36234s sVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<MidFidErrorInterceptor> provider7, Provider<C28833m> provider8) {
        this.f89518a = sVar;
        this.f89519b = provider;
        this.f89520c = provider2;
        this.f89521d = provider3;
        this.f89522e = provider4;
        this.f89523f = provider5;
        this.f89524g = provider6;
        this.f89525h = provider7;
        this.f89526i = provider8;
    }

    /* renamed from: a */
    public static C36236t m148746a(C36234s sVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C36151f> provider3, Provider<TokenAuthenticator> provider4, Provider<C28826i> provider5, Provider<LogMInterceptor> provider6, Provider<MidFidErrorInterceptor> provider7, Provider<C28833m> provider8) {
        return new C36236t(sVar, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: c */
    public static IamAuthLoyaltyApiService m148747c(C36234s sVar, Context context, AppEnvironment appEnvironment, C36151f fVar, TokenAuthenticator tokenAuthenticator, C28826i iVar, LogMInterceptor logMInterceptor, MidFidErrorInterceptor midFidErrorInterceptor, C28833m mVar) {
        return (IamAuthLoyaltyApiService) C10335o.m38554f(sVar.mo108199a(context, appEnvironment, fVar, tokenAuthenticator, iVar, logMInterceptor, midFidErrorInterceptor, mVar));
    }

    /* renamed from: b */
    public IamAuthLoyaltyApiService get() {
        return m148747c(this.f89518a, this.f89519b.get(), this.f89520c.get(), this.f89521d.get(), this.f89522e.get(), this.f89523f.get(), this.f89524g.get(), this.f89525h.get(), this.f89526i.get());
    }
}
