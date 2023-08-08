package com.carrefour.fid.android.core.p056di.module.apis;

import com.carrefour.fid.android.cms.data.services.C40023a;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.j */
public final class C36216j implements C10324h<C40023a> {

    /* renamed from: a */
    public final C36214i f89461a;

    /* renamed from: b */
    public final Provider<C13092x> f89462b;

    public C36216j(C36214i iVar, Provider<C13092x> provider) {
        this.f89461a = iVar;
        this.f89462b = provider;
    }

    /* renamed from: a */
    public static C36216j m148703a(C36214i iVar, Provider<C13092x> provider) {
        return new C36216j(iVar, provider);
    }

    /* renamed from: c */
    public static C40023a m148704c(C36214i iVar, C13092x xVar) {
        return (C40023a) C10335o.m38554f(iVar.mo108177a(xVar));
    }

    /* renamed from: b */
    public C40023a get() {
        return m148704c(this.f89461a, this.f89462b.get());
    }
}
