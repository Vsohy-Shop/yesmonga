package com.carrefour.fid.android.utilities.p032di;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffUtilitiesManagementGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.utilities.di.c */
public final class C22682c implements C10324h<BffUtilitiesManagementApi> {

    /* renamed from: a */
    public final Provider<C13092x> f58088a;

    public C22682c(Provider<C13092x> provider) {
        this.f58088a = provider;
    }

    /* renamed from: a */
    public static C22682c m102709a(Provider<C13092x> provider) {
        return new C22682c(provider);
    }

    /* renamed from: c */
    public static BffUtilitiesManagementApi m102710c(C13092x xVar) {
        return (BffUtilitiesManagementApi) C10335o.m38554f(C22680b.f58086a.mo67028a(xVar));
    }

    /* renamed from: b */
    public BffUtilitiesManagementApi get() {
        return m102710c(this.f58088a.get());
    }
}
