package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.data.service.C36637p;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.f */
public final class C36208f implements C10324h<C36637p> {

    /* renamed from: a */
    public final C36202c f89446a;

    /* renamed from: b */
    public final Provider<Context> f89447b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89448c;

    /* renamed from: d */
    public final Provider<C28826i> f89449d;

    /* renamed from: e */
    public final Provider<LogMInterceptor> f89450e;

    /* renamed from: f */
    public final Provider<C28833m> f89451f;

    public C36208f(C36202c cVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        this.f89446a = cVar;
        this.f89447b = provider;
        this.f89448c = provider2;
        this.f89449d = provider3;
        this.f89450e = provider4;
        this.f89451f = provider5;
    }

    /* renamed from: a */
    public static C36208f m148685a(C36202c cVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        return new C36208f(cVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C36637p m148686c(C36202c cVar, Context context, AppEnvironment appEnvironment, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar) {
        return (C36637p) C10335o.m38554f(cVar.mo108164c(context, appEnvironment, iVar, logMInterceptor, mVar));
    }

    /* renamed from: b */
    public C36637p get() {
        return m148686c(this.f89446a, this.f89447b.get(), this.f89448c.get(), this.f89449d.get(), this.f89450e.get(), this.f89451f.get());
    }
}
