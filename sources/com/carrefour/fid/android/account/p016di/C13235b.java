package com.carrefour.fid.android.account.p016di;

import com.carrefour.fid.android.account.data.service.C13210b;
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
/* renamed from: com.carrefour.fid.android.account.di.b */
public final class C13235b implements C10324h<C13210b> {

    /* renamed from: a */
    public final Provider<C13092x> f32578a;

    public C13235b(Provider<C13092x> provider) {
        this.f32578a = provider;
    }

    /* renamed from: a */
    public static C13235b m57358a(Provider<C13092x> provider) {
        return new C13235b(provider);
    }

    /* renamed from: c */
    public static C13210b m57359c(C13092x xVar) {
        return (C13210b) C10335o.m38554f(C13233a.f32576a.mo31411a(xVar));
    }

    /* renamed from: b */
    public C13210b get() {
        return m57359c(this.f32578a.get());
    }
}
