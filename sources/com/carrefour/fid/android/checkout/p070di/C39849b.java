package com.carrefour.fid.android.checkout.p070di;

import com.carrefour.fid.android.checkout.data.api.services.C39837a;
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
/* renamed from: com.carrefour.fid.android.checkout.di.b */
public final class C39849b implements C10324h<C39837a> {

    /* renamed from: a */
    public final C39848a f101652a;

    /* renamed from: b */
    public final Provider<C13092x> f101653b;

    public C39849b(C39848a aVar, Provider<C13092x> provider) {
        this.f101652a = aVar;
        this.f101653b = provider;
    }

    /* renamed from: a */
    public static C39849b m162459a(C39848a aVar, Provider<C13092x> provider) {
        return new C39849b(aVar, provider);
    }

    /* renamed from: c */
    public static C39837a m162460c(C39848a aVar, C13092x xVar) {
        return (C39837a) C10335o.m38554f(aVar.mo131403a(xVar));
    }

    /* renamed from: b */
    public C39837a get() {
        return m162460c(this.f101652a, this.f101653b.get());
    }
}
