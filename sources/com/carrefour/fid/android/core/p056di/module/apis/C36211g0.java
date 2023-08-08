package com.carrefour.fid.android.core.p056di.module.apis;

import com.carrefour.fid.android.data.service.C36632k;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.g0 */
public final class C36211g0 implements C10324h<C36632k> {

    /* renamed from: a */
    public final C36209f0 f89453a;

    /* renamed from: b */
    public final Provider<C13092x> f89454b;

    public C36211g0(C36209f0 f0Var, Provider<C13092x> provider) {
        this.f89453a = f0Var;
        this.f89454b = provider;
    }

    /* renamed from: a */
    public static C36211g0 m148691a(C36209f0 f0Var, Provider<C13092x> provider) {
        return new C36211g0(f0Var, provider);
    }

    /* renamed from: c */
    public static C36632k m148692c(C36209f0 f0Var, C13092x xVar) {
        return (C36632k) C10335o.m38554f(f0Var.mo108171a(xVar));
    }

    /* renamed from: b */
    public C36632k get() {
        return m148692c(this.f89453a, this.f89454b.get());
    }
}
