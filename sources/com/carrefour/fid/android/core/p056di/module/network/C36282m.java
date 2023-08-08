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
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffUtilitiesManagementGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.network.m */
public final class C36282m implements C10324h<C13092x> {

    /* renamed from: a */
    public final C36270a f89615a;

    /* renamed from: b */
    public final Provider<RetrofitFactory> f89616b;

    /* renamed from: c */
    public final Provider<C36322c> f89617c;

    /* renamed from: d */
    public final Provider<AppEnvironment> f89618d;

    public C36282m(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36322c> provider2, Provider<AppEnvironment> provider3) {
        this.f89615a = aVar;
        this.f89616b = provider;
        this.f89617c = provider2;
        this.f89618d = provider3;
    }

    /* renamed from: a */
    public static C36282m m148884a(C36270a aVar, Provider<RetrofitFactory> provider, Provider<C36322c> provider2, Provider<AppEnvironment> provider3) {
        return new C36282m(aVar, provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13092x m148885c(C36270a aVar, RetrofitFactory retrofitFactory, C36322c cVar, AppEnvironment appEnvironment) {
        return (C13092x) C10335o.m38554f(aVar.mo108278l(retrofitFactory, cVar, appEnvironment));
    }

    /* renamed from: b */
    public C13092x get() {
        return m148885c(this.f89615a, this.f89616b.get(), this.f89617c.get(), this.f89618d.get());
    }
}
