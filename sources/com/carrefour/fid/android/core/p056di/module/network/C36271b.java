package com.carrefour.fid.android.core.p056di.module.network;

import com.carrefour.fid.android.core.network.RetrofitFactory;
import com.carrefour.fid.android.core.network.headers.C36324e;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffCustomersManagementApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.network.b */
public final class C36271b implements C10324h<C13092x> {

    /* renamed from: a */
    public final C36270a f89573a;

    /* renamed from: b */
    public final Provider<RetrofitFactory> f89574b;

    /* renamed from: c */
    public final Provider<C36324e> f89575c;

    /* renamed from: d */
    public final Provider<AppEnvironment> f89576d;

    public C36271b(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36324e> provider2, Provider<AppEnvironment> provider3) {
        this.f89573a = aVar;
        this.f89574b = provider;
        this.f89575c = provider2;
        this.f89576d = provider3;
    }

    /* renamed from: a */
    public static C36271b m148851a(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36324e> provider2, Provider<AppEnvironment> provider3) {
        return new C36271b(aVar, provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13092x m148852c(C36270a aVar, RetrofitFactory retrofitFactory, C36324e eVar, AppEnvironment appEnvironment) {
        return (C13092x) C10335o.m38554f(aVar.mo108267a(retrofitFactory, eVar, appEnvironment));
    }

    /* renamed from: b */
    public C13092x get() {
        return m148852c(this.f89573a, this.f89574b.get(), this.f89575c.get(), this.f89576d.get());
    }
}
