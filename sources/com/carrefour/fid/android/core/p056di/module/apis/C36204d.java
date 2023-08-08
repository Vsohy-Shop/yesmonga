package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.data.service.C36623c;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.d */
public final class C36204d implements C10324h<C36623c> {

    /* renamed from: a */
    public final C36202c f89423a;

    /* renamed from: b */
    public final Provider<Context> f89424b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89425c;

    /* renamed from: d */
    public final Provider<C28826i> f89426d;

    /* renamed from: e */
    public final Provider<LogMInterceptor> f89427e;

    /* renamed from: f */
    public final Provider<C28833m> f89428f;

    public C36204d(C36202c cVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        this.f89423a = cVar;
        this.f89424b = provider;
        this.f89425c = provider2;
        this.f89426d = provider3;
        this.f89427e = provider4;
        this.f89428f = provider5;
    }

    /* renamed from: a */
    public static C36204d m148675a(C36202c cVar, Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28826i> provider3, Provider<LogMInterceptor> provider4, Provider<C28833m> provider5) {
        return new C36204d(cVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C36623c m148676c(C36202c cVar, Context context, AppEnvironment appEnvironment, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar) {
        return (C36623c) C10335o.m38554f(cVar.mo108162a(context, appEnvironment, iVar, logMInterceptor, mVar));
    }

    /* renamed from: b */
    public C36623c get() {
        return m148676c(this.f89423a, this.f89424b.get(), this.f89425c.get(), this.f89426d.get(), this.f89427e.get(), this.f89428f.get());
    }
}
