package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.data.service.C36624d;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.e */
public final class C36206e implements C10324h<C36624d> {

    /* renamed from: a */
    public final C36202c f89430a;

    /* renamed from: b */
    public final Provider<Context> f89431b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89432c;

    /* renamed from: d */
    public final Provider<C28826i> f89433d;

    /* renamed from: e */
    public final Provider<LogMInterceptor> f89434e;

    /* renamed from: f */
    public final Provider<C28833m> f89435f;

    public C36206e(C36202c cVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        this.f89430a = cVar;
        this.f89431b = provider;
        this.f89432c = provider2;
        this.f89433d = provider3;
        this.f89434e = provider4;
        this.f89435f = provider5;
    }

    /* renamed from: a */
    public static C36206e m148679a(C36202c cVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        return new C36206e(cVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C36624d m148680c(C36202c cVar, Context context, AppEnvironment appEnvironment, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar) {
        return (C36624d) C10335o.m38554f(cVar.mo108163b(context, appEnvironment, iVar, logMInterceptor, mVar));
    }

    /* renamed from: b */
    public C36624d get() {
        return m148680c(this.f89430a, this.f89431b.get(), this.f89432c.get(), this.f89433d.get(), this.f89434e.get(), this.f89435f.get());
    }
}
