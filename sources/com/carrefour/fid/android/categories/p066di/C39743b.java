package com.carrefour.fid.android.categories.p066di;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffStoresManagementApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.categories.di.b */
public final class C39743b implements C10324h<BffStoresManagementApi> {

    /* renamed from: a */
    public final Provider<C13092x> f101442a;

    public C39743b(Provider<C13092x> provider) {
        this.f101442a = provider;
    }

    /* renamed from: a */
    public static C39743b m162187a(Provider<C13092x> provider) {
        return new C39743b(provider);
    }

    /* renamed from: c */
    public static BffStoresManagementApi m162188c(C13092x xVar) {
        return (BffStoresManagementApi) C10335o.m38554f(C39741a.f101440a.mo131028a(xVar));
    }

    /* renamed from: b */
    public BffStoresManagementApi get() {
        return m162188c(this.f101442a.get());
    }
}
