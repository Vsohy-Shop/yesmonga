package com.carrefour.fid.android.account.p016di;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffCustomersManagementApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.account.di.d */
public final class C13237d implements C10324h<BffCustomersManagementApi> {

    /* renamed from: a */
    public final C13236c f32579a;

    /* renamed from: b */
    public final Provider<C13092x> f32580b;

    public C13237d(C13236c cVar, Provider<C13092x> provider) {
        this.f32579a = cVar;
        this.f32580b = provider;
    }

    /* renamed from: a */
    public static C13237d m57362a(C13236c cVar, Provider<C13092x> provider) {
        return new C13237d(cVar, provider);
    }

    /* renamed from: c */
    public static BffCustomersManagementApi m57363c(C13236c cVar, C13092x xVar) {
        return (BffCustomersManagementApi) C10335o.m38554f(cVar.mo31413a(xVar));
    }

    /* renamed from: b */
    public BffCustomersManagementApi get() {
        return m57363c(this.f32579a, this.f32580b.get());
    }
}
