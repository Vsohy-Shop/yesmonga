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
@C10337q({"com.carrefour.fid.android.shared.di.annotation.ApplicationAuthApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.network.l */
public final class C36281l implements C10324h<C13092x> {

    /* renamed from: a */
    public final C36270a f89611a;

    /* renamed from: b */
    public final Provider<RetrofitFactory> f89612b;

    /* renamed from: c */
    public final Provider<C36320a> f89613c;

    /* renamed from: d */
    public final Provider<AppEnvironment> f89614d;

    public C36281l(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36320a> provider2, Provider<AppEnvironment> provider3) {
        this.f89611a = aVar;
        this.f89612b = provider;
        this.f89613c = provider2;
        this.f89614d = provider3;
    }

    /* renamed from: a */
    public static C36281l m148881a(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36320a> provider2, Provider<AppEnvironment> provider3) {
        return new C36281l(aVar, provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13092x m148882c(C36270a aVar, RetrofitFactory retrofitFactory, C36320a aVar2, AppEnvironment appEnvironment) {
        return (C13092x) C10335o.m38554f(aVar.mo108277k(retrofitFactory, aVar2, appEnvironment));
    }

    /* renamed from: b */
    public C13092x get() {
        return m148882c(this.f89611a, this.f89612b.get(), this.f89613c.get(), this.f89614d.get());
    }
}
