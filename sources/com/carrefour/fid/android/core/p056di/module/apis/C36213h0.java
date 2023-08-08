package com.carrefour.fid.android.core.p056di.module.apis;

import com.carrefour.fid.android.data.service.C36633l;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.h0 */
public final class C36213h0 implements C10324h<C36633l> {

    /* renamed from: a */
    public final C36209f0 f89457a;

    /* renamed from: b */
    public final Provider<C13092x> f89458b;

    public C36213h0(C36209f0 f0Var, Provider<C13092x> provider) {
        this.f89457a = f0Var;
        this.f89458b = provider;
    }

    /* renamed from: a */
    public static C36213h0 m148697a(C36209f0 f0Var, Provider<C13092x> provider) {
        return new C36213h0(f0Var, provider);
    }

    /* renamed from: c */
    public static C36633l m148698c(C36209f0 f0Var, C13092x xVar) {
        return (C36633l) C10335o.m38554f(f0Var.mo108172b(xVar));
    }

    /* renamed from: b */
    public C36633l get() {
        return m148698c(this.f89457a, this.f89458b.get());
    }
}
