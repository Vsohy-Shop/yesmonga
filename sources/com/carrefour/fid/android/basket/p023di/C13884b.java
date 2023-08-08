package com.carrefour.fid.android.basket.p023di;

import com.carrefour.fid.android.basket.data.api.services.C13881a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.AuthenticatedNoHeaderApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.basket.di.b */
public final class C13884b implements C10324h<C13881a> {

    /* renamed from: a */
    public final Provider<C13092x> f33844a;

    public C13884b(Provider<C13092x> provider) {
        this.f33844a = provider;
    }

    /* renamed from: a */
    public static C13884b m58940a(Provider<C13092x> provider) {
        return new C13884b(provider);
    }

    /* renamed from: c */
    public static C13881a m58941c(C13092x xVar) {
        return (C13881a) C10335o.m38554f(C13882a.f33842a.mo33262a(xVar));
    }

    /* renamed from: b */
    public C13881a get() {
        return m58941c(this.f33844a.get());
    }
}
