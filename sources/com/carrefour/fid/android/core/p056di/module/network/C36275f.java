package com.carrefour.fid.android.core.p056di.module.network;

import com.carrefour.fid.android.core.network.RetrofitFactory;
import com.carrefour.fid.android.core.network.headers.C36322c;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffProductsManagementApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.network.f */
public final class C36275f implements C10324h<C13092x> {

    /* renamed from: a */
    public final C36270a f89588a;

    /* renamed from: b */
    public final Provider<RetrofitFactory> f89589b;

    /* renamed from: c */
    public final Provider<C36322c> f89590c;

    /* renamed from: d */
    public final Provider<AppEnvironment> f89591d;

    public C36275f(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36322c> provider2, Provider<AppEnvironment> provider3) {
        this.f89588a = aVar;
        this.f89589b = provider;
        this.f89590c = provider2;
        this.f89591d = provider3;
    }

    /* renamed from: a */
    public static C36275f m148863a(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36322c> provider2, Provider<AppEnvironment> provider3) {
        return new C36275f(aVar, provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13092x m148864c(C36270a aVar, RetrofitFactory retrofitFactory, C36322c cVar, AppEnvironment appEnvironment) {
        return (C13092x) C10335o.m38554f(aVar.mo108271e(retrofitFactory, cVar, appEnvironment));
    }

    /* renamed from: b */
    public C13092x get() {
        return m148864c(this.f89588a, this.f89589b.get(), this.f89590c.get(), this.f89591d.get());
    }
}
