package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.shared.data.headers.C28642c;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffProductsManagementApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.product.data.api.datasource.c */
public final class C27463c implements C10324h<FacetProductCountDataSource> {

    /* renamed from: a */
    public final Provider<BffProductsManagementApi> f66597a;

    /* renamed from: b */
    public final Provider<C28642c> f66598b;

    public C27463c(Provider<BffProductsManagementApi> provider, Provider<C28642c> provider2) {
        this.f66597a = provider;
        this.f66598b = provider2;
    }

    /* renamed from: a */
    public static C27463c m115607a(Provider<BffProductsManagementApi> provider, Provider<C28642c> provider2) {
        return new C27463c(provider, provider2);
    }

    /* renamed from: c */
    public static FacetProductCountDataSource m115608c(BffProductsManagementApi bffProductsManagementApi, C28642c cVar) {
        return new FacetProductCountDataSource(bffProductsManagementApi, cVar);
    }

    /* renamed from: b */
    public FacetProductCountDataSource get() {
        return m115608c(this.f66597a.get(), this.f66598b.get());
    }
}
