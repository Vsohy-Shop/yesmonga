package com.carrefour.fid.android.core.network;

import android.content.Context;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.shared.network.interceptors.C28818d;
import com.carrefour.fid.android.shared.network.interceptors.C28826i;
import com.carrefour.fid.android.shared.network.interceptors.C28833m;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.network.a */
public final class C36319a implements C10324h<RetrofitFactory> {

    /* renamed from: a */
    public final Provider<Context> f89727a;

    /* renamed from: b */
    public final Provider<C36151f> f89728b;

    /* renamed from: c */
    public final Provider<TokenAuthenticator> f89729c;

    /* renamed from: d */
    public final Provider<C28826i> f89730d;

    /* renamed from: e */
    public final Provider<LogMInterceptor> f89731e;

    /* renamed from: f */
    public final Provider<C28833m> f89732f;

    /* renamed from: g */
    public final Provider<C28818d> f89733g;

    public C36319a(Provider<Context> provider, Provider<C36151f> provider2, Provider<TokenAuthenticator> provider3, Provider<C28826i> provider4, Provider<LogMInterceptor> provider5, Provider<C28833m> provider6, Provider<C28818d> provider7) {
        this.f89727a = provider;
        this.f89728b = provider2;
        this.f89729c = provider3;
        this.f89730d = provider4;
        this.f89731e = provider5;
        this.f89732f = provider6;
        this.f89733g = provider7;
    }

    /* renamed from: a */
    public static C36319a m149035a(Provider<Context> provider, Provider<C36151f> provider2, Provider<TokenAuthenticator> provider3, Provider<C28826i> provider4, Provider<LogMInterceptor> provider5, Provider<C28833m> provider6, Provider<C28818d> provider7) {
        return new C36319a(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: c */
    public static RetrofitFactory m149036c(Context context, C36151f fVar, TokenAuthenticator tokenAuthenticator, C28826i iVar, LogMInterceptor logMInterceptor, C28833m mVar, C28818d dVar) {
        return new RetrofitFactory(context, fVar, tokenAuthenticator, iVar, logMInterceptor, mVar, dVar);
    }

    /* renamed from: b */
    public RetrofitFactory get() {
        return m149036c(this.f89727a.get(), this.f89728b.get(), this.f89729c.get(), this.f89730d.get(), this.f89731e.get(), this.f89732f.get(), this.f89733g.get());
    }
}
