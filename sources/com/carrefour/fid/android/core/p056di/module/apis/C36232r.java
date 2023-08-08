package com.carrefour.fid.android.core.p056di.module.apis;

import com.carrefour.fid.android.data.service.C36629h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.DlvApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.apis.r */
public final class C36232r implements C10324h<C36629h> {

    /* renamed from: a */
    public final C36230q f89512a;

    /* renamed from: b */
    public final Provider<C13092x> f89513b;

    public C36232r(C36230q qVar, Provider<C13092x> provider) {
        this.f89512a = qVar;
        this.f89513b = provider;
    }

    /* renamed from: a */
    public static C36232r m148738a(C36230q qVar, Provider<C13092x> provider) {
        return new C36232r(qVar, provider);
    }

    /* renamed from: c */
    public static C36629h m148739c(C36230q qVar, C13092x xVar) {
        return (C36629h) C10335o.m38554f(qVar.mo108195a(xVar));
    }

    /* renamed from: b */
    public C36629h get() {
        return m148739c(this.f89512a, this.f89513b.get());
    }
}
