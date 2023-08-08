package com.carrefour.fid.android.product.p038di;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffProductsManagementApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.product.di.c */
public final class C27517c implements C10324h<BffProductsManagementApi> {

    /* renamed from: a */
    public final Provider<C13092x> f66798a;

    public C27517c(Provider<C13092x> provider) {
        this.f66798a = provider;
    }

    /* renamed from: a */
    public static C27517c m115798a(Provider<C13092x> provider) {
        return new C27517c(provider);
    }

    /* renamed from: c */
    public static BffProductsManagementApi m115799c(C13092x xVar) {
        return (BffProductsManagementApi) C10335o.m38554f(C27515b.f66796a.mo79908a(xVar));
    }

    /* renamed from: b */
    public BffProductsManagementApi get() {
        return m115799c(this.f66798a.get());
    }
}
