package com.carrefour.fid.android.core.p056di.module.apis;

import com.carrefour.fid.android.data.service.C36625e;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.l */
public final class C36220l implements C10324h<C36625e> {

    /* renamed from: a */
    public final C36218k f89471a;

    /* renamed from: b */
    public final Provider<C13092x> f89472b;

    public C36220l(C36218k kVar, Provider<C13092x> provider) {
        this.f89471a = kVar;
        this.f89472b = provider;
    }

    /* renamed from: a */
    public static C36220l m148713a(C36218k kVar, Provider<C13092x> provider) {
        return new C36220l(kVar, provider);
    }

    /* renamed from: c */
    public static C36625e m148714c(C36218k kVar, C13092x xVar) {
        return (C36625e) C10335o.m38554f(kVar.mo108182a(xVar));
    }

    /* renamed from: b */
    public C36625e get() {
        return m148714c(this.f89471a, this.f89472b.get());
    }
}
