package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.account.data.service.C13212c;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.x */
public final class C36241x implements C10324h<C13212c> {

    /* renamed from: a */
    public final C36240w f89546a;

    /* renamed from: b */
    public final Provider<Context> f89547b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89548c;

    /* renamed from: d */
    public final Provider<LogMInterceptor> f89549d;

    /* renamed from: e */
    public final Provider<C28826i> f89550e;

    /* renamed from: f */
    public final Provider<C28833m> f89551f;

    public C36241x(C36240w wVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<LogMInterceptor> provider3, Provider<C28826i> provider4, Provider<C28833m> provider5) {
        this.f89546a = wVar;
        this.f89547b = provider;
        this.f89548c = provider2;
        this.f89549d = provider3;
        this.f89550e = provider4;
        this.f89551f = provider5;
    }

    /* renamed from: a */
    public static C36241x m148757a(C36240w wVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<LogMInterceptor> provider3, Provider<C28826i> provider4, Provider<C28833m> provider5) {
        return new C36241x(wVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C13212c m148758c(C36240w wVar, Context context, AppEnvironment appEnvironment, LogMInterceptor logMInterceptor, C28826i iVar, C28833m mVar) {
        return (C13212c) C10335o.m38554f(wVar.mo108205a(context, appEnvironment, logMInterceptor, iVar, mVar));
    }

    /* renamed from: b */
    public C13212c get() {
        return m148758c(this.f89546a, this.f89547b.get(), this.f89548c.get(), this.f89549d.get(), this.f89550e.get(), this.f89551f.get());
    }
}
