package com.carrefour.fid.android.core.p056di.module;

import com.carrefour.fid.android.core.auth.C36146b;
import com.carrefour.fid.android.core.auth.TokenRefresherImpl;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import okhttp3.Interceptor;

@C10321e
@C10337q({"com.carrefour.fid.android.core.di.module.TokenInterceptor"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.core.di.module.e */
public final class C36260e implements C10324h<Interceptor> {

    /* renamed from: a */
    public final C36245c f89563a;

    /* renamed from: b */
    public final Provider<TokenRefresherImpl> f89564b;

    /* renamed from: c */
    public final Provider<C36146b> f89565c;

    public C36260e(C36245c cVar, Provider<TokenRefresherImpl> provider, Provider<C36146b> provider2) {
        this.f89563a = cVar;
        this.f89564b = provider;
        this.f89565c = provider2;
    }

    /* renamed from: a */
    public static C36260e m148810a(C36245c cVar, Provider<TokenRefresherImpl> provider, Provider<C36146b> provider2) {
        return new C36260e(cVar, provider, provider2);
    }

    /* renamed from: c */
    public static Interceptor m148811c(C36245c cVar, TokenRefresherImpl tokenRefresherImpl, C36146b bVar) {
        return (Interceptor) C10335o.m38554f(cVar.mo108212b(tokenRefresherImpl, bVar));
    }

    /* renamed from: b */
    public Interceptor get() {
        return m148811c(this.f89563a, this.f89564b.get(), this.f89565c.get());
    }
}
