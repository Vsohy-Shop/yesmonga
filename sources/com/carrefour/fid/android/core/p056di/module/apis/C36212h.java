package com.carrefour.fid.android.core.p056di.module.apis;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffMidFidApiService;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffLoyaltyManagementApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.di.module.apis.h */
public final class C36212h implements C10324h<BffMidFidApiService> {

    /* renamed from: a */
    public final C36210g f89455a;

    /* renamed from: b */
    public final Provider<C13092x> f89456b;

    public C36212h(C36210g gVar, Provider<C13092x> provider) {
        this.f89455a = gVar;
        this.f89456b = provider;
    }

    /* renamed from: a */
    public static C36212h m148694a(C36210g gVar, Provider<C13092x> provider) {
        return new C36212h(gVar, provider);
    }

    /* renamed from: c */
    public static BffMidFidApiService m148695c(C36210g gVar, C13092x xVar) {
        return (BffMidFidApiService) C10335o.m38554f(gVar.mo108173a(xVar));
    }

    /* renamed from: b */
    public BffMidFidApiService get() {
        return m148695c(this.f89455a, this.f89456b.get());
    }
}
