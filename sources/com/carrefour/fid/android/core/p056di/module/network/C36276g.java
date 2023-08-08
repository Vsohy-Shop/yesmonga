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
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffStoresManagementApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.network.g */
public final class C36276g implements C10324h<C13092x> {

    /* renamed from: a */
    public final C36270a f89592a;

    /* renamed from: b */
    public final Provider<RetrofitFactory> f89593b;

    /* renamed from: c */
    public final Provider<C36322c> f89594c;

    /* renamed from: d */
    public final Provider<AppEnvironment> f89595d;

    public C36276g(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36322c> provider2, Provider<AppEnvironment> provider3) {
        this.f89592a = aVar;
        this.f89593b = provider;
        this.f89594c = provider2;
        this.f89595d = provider3;
    }

    /* renamed from: a */
    public static C36276g m148866a(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36322c> provider2, Provider<AppEnvironment> provider3) {
        return new C36276g(aVar, provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13092x m148867c(C36270a aVar, RetrofitFactory retrofitFactory, C36322c cVar, AppEnvironment appEnvironment) {
        return (C13092x) C10335o.m38554f(aVar.mo108272f(retrofitFactory, cVar, appEnvironment));
    }

    /* renamed from: b */
    public C13092x get() {
        return m148867c(this.f89592a, this.f89593b.get(), this.f89594c.get(), this.f89595d.get());
    }
}
