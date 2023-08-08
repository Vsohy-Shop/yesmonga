package com.carrefour.fid.android.core.p056di.module.apis;

import com.carrefour.fid.android.data.service.C36635n;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.r0 */
public final class C36233r0 implements C10324h<C36635n> {

    /* renamed from: a */
    public final C36231q0 f89514a;

    /* renamed from: b */
    public final Provider<C13092x> f89515b;

    public C36233r0(C36231q0 q0Var, Provider<C13092x> provider) {
        this.f89514a = q0Var;
        this.f89515b = provider;
    }

    /* renamed from: a */
    public static C36233r0 m148741a(C36231q0 q0Var, Provider<C13092x> provider) {
        return new C36233r0(q0Var, provider);
    }

    /* renamed from: c */
    public static C36635n m148742c(C36231q0 q0Var, C13092x xVar) {
        return (C36635n) C10335o.m38554f(q0Var.mo108196a(xVar));
    }

    /* renamed from: b */
    public C36635n get() {
        return m148742c(this.f89514a, this.f89515b.get());
    }
}
