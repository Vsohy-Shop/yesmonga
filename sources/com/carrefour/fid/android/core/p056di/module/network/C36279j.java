package com.carrefour.fid.android.core.p056di.module.network;

import com.carrefour.fid.android.core.network.RetrofitFactory;
import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffLoyaltyManagementApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.network.j */
public final class C36279j implements C10324h<C13092x> {

    /* renamed from: a */
    public final C36270a f89604a;

    /* renamed from: b */
    public final Provider<RetrofitFactory> f89605b;

    /* renamed from: c */
    public final Provider<LoyaltyHeaders> f89606c;

    /* renamed from: d */
    public final Provider<AppEnvironment> f89607d;

    public C36279j(C36270a aVar, Provider<RetrofitFactory> provider, Provider<LoyaltyHeaders> provider2, Provider<AppEnvironment> provider3) {
        this.f89604a = aVar;
        this.f89605b = provider;
        this.f89606c = provider2;
        this.f89607d = provider3;
    }

    /* renamed from: a */
    public static C36279j m148875a(C36270a aVar, Provider<RetrofitFactory> provider, Provider<LoyaltyHeaders> provider2, Provider<AppEnvironment> provider3) {
        return new C36279j(aVar, provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13092x m148876c(C36270a aVar, RetrofitFactory retrofitFactory, LoyaltyHeaders loyaltyHeaders, AppEnvironment appEnvironment) {
        return (C13092x) C10335o.m38554f(aVar.mo108275i(retrofitFactory, loyaltyHeaders, appEnvironment));
    }

    /* renamed from: b */
    public C13092x get() {
        return m148876c(this.f89604a, this.f89605b.get(), this.f89606c.get(), this.f89607d.get());
    }
}
