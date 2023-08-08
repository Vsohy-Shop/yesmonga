package com.carrefour.fid.android.core.p056di.module.network;

import com.carrefour.fid.android.core.network.RetrofitFactory;
import com.carrefour.fid.android.core.network.headers.C36320a;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.ApplicationCachedAuthApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.network.c */
public final class C36272c implements C10324h<C13092x> {

    /* renamed from: a */
    public final C36270a f89577a;

    /* renamed from: b */
    public final Provider<RetrofitFactory> f89578b;

    /* renamed from: c */
    public final Provider<C36320a> f89579c;

    /* renamed from: d */
    public final Provider<AppEnvironment> f89580d;

    public C36272c(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36320a> provider2, Provider<AppEnvironment> provider3) {
        this.f89577a = aVar;
        this.f89578b = provider;
        this.f89579c = provider2;
        this.f89580d = provider3;
    }

    /* renamed from: a */
    public static C36272c m148854a(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36320a> provider2, Provider<AppEnvironment> provider3) {
        return new C36272c(aVar, provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13092x m148855c(C36270a aVar, RetrofitFactory retrofitFactory, C36320a aVar2, AppEnvironment appEnvironment) {
        return (C13092x) C10335o.m38554f(aVar.mo108268b(retrofitFactory, aVar2, appEnvironment));
    }

    /* renamed from: b */
    public C13092x get() {
        return m148855c(this.f89577a, this.f89578b.get(), this.f89579c.get(), this.f89580d.get());
    }
}
