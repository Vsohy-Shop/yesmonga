package com.carrefour.fid.android.core.p056di.module.network;

import com.carrefour.fid.android.core.network.RetrofitFactory;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.AuthenticatedNoHeaderApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.network.d */
public final class C36273d implements C10324h<C13092x> {

    /* renamed from: a */
    public final C36270a f89581a;

    /* renamed from: b */
    public final Provider<RetrofitFactory> f89582b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89583c;

    public C36273d(C36270a aVar, Provider<RetrofitFactory> provider, Provider<AppEnvironment> provider2) {
        this.f89581a = aVar;
        this.f89582b = provider;
        this.f89583c = provider2;
    }

    /* renamed from: a */
    public static C36273d m148857a(C36270a aVar, Provider<RetrofitFactory> provider, Provider<AppEnvironment> provider2) {
        return new C36273d(aVar, provider, provider2);
    }

    /* renamed from: c */
    public static C13092x m148858c(C36270a aVar, RetrofitFactory retrofitFactory, AppEnvironment appEnvironment) {
        return (C13092x) C10335o.m38554f(aVar.mo108269c(retrofitFactory, appEnvironment));
    }

    /* renamed from: b */
    public C13092x get() {
        return m148858c(this.f89581a, this.f89582b.get(), this.f89583c.get());
    }
}
