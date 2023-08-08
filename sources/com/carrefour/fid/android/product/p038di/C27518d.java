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
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffProductsManagementNoTokenInterceptor"})
@C10338r
/* renamed from: com.carrefour.fid.android.product.di.d */
public final class C27518d implements C10324h<BffProductsManagementApi> {

    /* renamed from: a */
    public final Provider<C13092x> f66799a;

    public C27518d(Provider<C13092x> provider) {
        this.f66799a = provider;
    }

    /* renamed from: a */
    public static C27518d m115801a(Provider<C13092x> provider) {
        return new C27518d(provider);
    }

    /* renamed from: c */
    public static BffProductsManagementApi m115802c(C13092x xVar) {
        return (BffProductsManagementApi) C10335o.m38554f(C27515b.f66796a.mo79909b(xVar));
    }

    /* renamed from: b */
    public BffProductsManagementApi get() {
        return m115802c(this.f66799a.get());
    }
}
