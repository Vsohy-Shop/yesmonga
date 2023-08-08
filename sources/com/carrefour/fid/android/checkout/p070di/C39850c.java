package com.carrefour.fid.android.checkout.p070di;

import com.carrefour.fid.android.checkout.data.api.services.C39838b;
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
/* renamed from: com.carrefour.fid.android.checkout.di.c */
public final class C39850c implements C10324h<C39838b> {

    /* renamed from: a */
    public final C39848a f101654a;

    /* renamed from: b */
    public final Provider<C13092x> f101655b;

    public C39850c(C39848a aVar, Provider<C13092x> provider) {
        this.f101654a = aVar;
        this.f101655b = provider;
    }

    /* renamed from: a */
    public static C39850c m162462a(C39848a aVar, Provider<C13092x> provider) {
        return new C39850c(aVar, provider);
    }

    /* renamed from: c */
    public static C39838b m162463c(C39848a aVar, C13092x xVar) {
        return (C39838b) C10335o.m38554f(aVar.mo131404b(xVar));
    }

    /* renamed from: b */
    public C39838b get() {
        return m162463c(this.f101654a, this.f101655b.get());
    }
}
