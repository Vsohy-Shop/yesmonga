package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.data.service.C36630i;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.z */
public final class C36243z implements C10324h<C36630i> {

    /* renamed from: a */
    public final C36242y f89553a;

    /* renamed from: b */
    public final Provider<Context> f89554b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89555c;

    /* renamed from: d */
    public final Provider<C28826i> f89556d;

    /* renamed from: e */
    public final Provider<LogMInterceptor> f89557e;

    /* renamed from: f */
    public final Provider<C28833m> f89558f;

    public C36243z(C36242y yVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        this.f89553a = yVar;
        this.f89554b = provider;
        this.f89555c = provider2;
        this.f89556d = provider3;
        this.f89557e = provider4;
        this.f89558f = provider5;
    }

    /* renamed from: a */
    public static C36243z m148762a(C36242y yVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        return new C36243z(yVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C36630i m148763c(C36242y yVar, Context context, AppEnvironment appEnvironment, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar) {
        return (C36630i) C10335o.m38554f(yVar.mo108207a(context, appEnvironment, iVar, logMInterceptor, mVar));
    }

    /* renamed from: b */
    public C36630i get() {
        return m148763c(this.f89553a, this.f89554b.get(), this.f89555c.get(), this.f89556d.get(), this.f89557e.get(), this.f89558f.get());
    }
}
