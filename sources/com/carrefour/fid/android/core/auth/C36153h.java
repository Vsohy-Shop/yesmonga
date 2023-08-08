package com.carrefour.fid.android.core.auth;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import okhttp3.Interceptor;

@C10321e
@C10337q({"com.carrefour.fid.android.core.di.module.TokenInterceptor"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.auth.h */
public final class C36153h implements C10324h<C36151f> {

    /* renamed from: a */
    public final Provider<Interceptor> f89237a;

    public C36153h(Provider<Interceptor> provider) {
        this.f89237a = provider;
    }

    /* renamed from: a */
    public static C36153h m148555a(Provider<Interceptor> provider) {
        return new C36153h(provider);
    }

    /* renamed from: c */
    public static C36151f m148556c(Interceptor interceptor) {
        return new C36151f(interceptor);
    }

    /* renamed from: b */
    public C36151f get() {
        return m148556c(this.f89237a.get());
    }
}
