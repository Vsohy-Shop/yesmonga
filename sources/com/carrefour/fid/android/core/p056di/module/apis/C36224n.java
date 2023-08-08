package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.data.service.C36627f;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.n */
public final class C36224n implements C10324h<C36627f> {

    /* renamed from: a */
    public final C36222m f89484a;

    /* renamed from: b */
    public final Provider<Context> f89485b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89486c;

    /* renamed from: d */
    public final Provider<C28826i> f89487d;

    /* renamed from: e */
    public final Provider<LogMInterceptor> f89488e;

    /* renamed from: f */
    public final Provider<C28833m> f89489f;

    public C36224n(C36222m mVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        this.f89484a = mVar;
        this.f89485b = provider;
        this.f89486c = provider2;
        this.f89487d = provider3;
        this.f89488e = provider4;
        this.f89489f = provider5;
    }

    /* renamed from: a */
    public static C36224n m148721a(C36222m mVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        return new C36224n(mVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C36627f m148722c(C36222m mVar, Context context, AppEnvironment appEnvironment, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar2) {
        return (C36627f) C10335o.m38554f(mVar.mo108186a(context, appEnvironment, iVar, logMInterceptor, mVar2));
    }

    /* renamed from: b */
    public C36627f get() {
        return m148722c(this.f89484a, this.f89485b.get(), this.f89486c.get(), this.f89487d.get(), this.f89488e.get(), this.f89489f.get());
    }
}
