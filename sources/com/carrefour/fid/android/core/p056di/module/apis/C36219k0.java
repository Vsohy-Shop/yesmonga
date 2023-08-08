package com.carrefour.fid.android.core.p056di.module.apis;

import com.carrefour.fid.android.data.service.C36634m;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.k0 */
public final class C36219k0 implements C10324h<C36634m> {

    /* renamed from: a */
    public final C36215i0 f89469a;

    /* renamed from: b */
    public final Provider<C13092x> f89470b;

    public C36219k0(C36215i0 i0Var, Provider<C13092x> provider) {
        this.f89469a = i0Var;
        this.f89470b = provider;
    }

    /* renamed from: a */
    public static C36219k0 m148710a(C36215i0 i0Var, Provider<C13092x> provider) {
        return new C36219k0(i0Var, provider);
    }

    /* renamed from: c */
    public static C36634m m148711c(C36215i0 i0Var, C13092x xVar) {
        return (C36634m) C10335o.m38554f(i0Var.mo108179b(xVar));
    }

    /* renamed from: b */
    public C36634m get() {
        return m148711c(this.f89469a, this.f89470b.get());
    }
}
