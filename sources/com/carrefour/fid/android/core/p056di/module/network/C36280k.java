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
@C10337q({"com.carrefour.fid.android.shared.di.annotation.NoHeaderApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.network.k */
public final class C36280k implements C10324h<C13092x> {

    /* renamed from: a */
    public final C36270a f89608a;

    /* renamed from: b */
    public final Provider<RetrofitFactory> f89609b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89610c;

    public C36280k(C36270a aVar, Provider<RetrofitFactory> provider, Provider<AppEnvironment> provider2) {
        this.f89608a = aVar;
        this.f89609b = provider;
        this.f89610c = provider2;
    }

    /* renamed from: a */
    public static C36280k m148878a(C36270a aVar, Provider<RetrofitFactory> provider, Provider<AppEnvironment> provider2) {
        return new C36280k(aVar, provider, provider2);
    }

    /* renamed from: c */
    public static C13092x m148879c(C36270a aVar, RetrofitFactory retrofitFactory, AppEnvironment appEnvironment) {
        return (C13092x) C10335o.m38554f(aVar.mo108276j(retrofitFactory, appEnvironment));
    }

    /* renamed from: b */
    public C13092x get() {
        return m148879c(this.f89608a, this.f89609b.get(), this.f89610c.get());
    }
}
