package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.data.service.C36631j;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.a0 */
public final class C36199a0 implements C10324h<C36631j> {

    /* renamed from: a */
    public final C36242y f89398a;

    /* renamed from: b */
    public final Provider<Context> f89399b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89400c;

    /* renamed from: d */
    public final Provider<C28826i> f89401d;

    /* renamed from: e */
    public final Provider<LogMInterceptor> f89402e;

    /* renamed from: f */
    public final Provider<C28833m> f89403f;

    public C36199a0(C36242y yVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        this.f89398a = yVar;
        this.f89399b = provider;
        this.f89400c = provider2;
        this.f89401d = provider3;
        this.f89402e = provider4;
        this.f89403f = provider5;
    }

    /* renamed from: a */
    public static C36199a0 m148662a(C36242y yVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        return new C36199a0(yVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C36631j m148663c(C36242y yVar, Context context, AppEnvironment appEnvironment, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar) {
        return (C36631j) C10335o.m38554f(yVar.mo108208b(context, appEnvironment, iVar, logMInterceptor, mVar));
    }

    /* renamed from: b */
    public C36631j get() {
        return m148663c(this.f89398a, this.f89399b.get(), this.f89400c.get(), this.f89401d.get(), this.f89402e.get(), this.f89403f.get());
    }
}
