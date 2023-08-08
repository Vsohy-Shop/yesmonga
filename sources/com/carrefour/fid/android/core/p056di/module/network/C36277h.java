package com.carrefour.fid.android.core.p056di.module.network;

import com.carrefour.fid.android.core.network.RetrofitFactory;
import com.carrefour.fid.android.core.network.headers.C36326g;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.CatalogApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.network.h */
public final class C36277h implements C10324h<C13092x> {

    /* renamed from: a */
    public final C36270a f89596a;

    /* renamed from: b */
    public final Provider<RetrofitFactory> f89597b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f89598c;

    /* renamed from: d */
    public final Provider<C36326g> f89599d;

    public C36277h(C36270a aVar, Provider<RetrofitFactory> provider, Provider<AppEnvironment> provider2, Provider<C36326g> provider3) {
        this.f89596a = aVar;
        this.f89597b = provider;
        this.f89598c = provider2;
        this.f89599d = provider3;
    }

    /* renamed from: a */
    public static C36277h m148869a(C36270a aVar, Provider<RetrofitFactory> provider, Provider<AppEnvironment> provider2, Provider<C36326g> provider3) {
        return new C36277h(aVar, provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13092x m148870c(C36270a aVar, RetrofitFactory retrofitFactory, AppEnvironment appEnvironment, C36326g gVar) {
        return (C13092x) C10335o.m38554f(aVar.mo108273g(retrofitFactory, appEnvironment, gVar));
    }

    /* renamed from: b */
    public C13092x get() {
        return m148870c(this.f89596a, this.f89597b.get(), this.f89598c.get(), this.f89599d.get());
    }
}
