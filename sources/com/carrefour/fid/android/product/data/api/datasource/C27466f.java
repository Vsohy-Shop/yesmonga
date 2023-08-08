package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffProductsManagementApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.product.data.api.datasource.f */
public final class C27466f implements C10324h<NonFoodProductDetailDataSource> {

    /* renamed from: a */
    public final Provider<BffProductsManagementApi> f66599a;

    /* renamed from: b */
    public final Provider<C28646a> f66600b;

    public C27466f(Provider<BffProductsManagementApi> provider, Provider<C28646a> provider2) {
        this.f66599a = provider;
        this.f66600b = provider2;
    }

    /* renamed from: a */
    public static C27466f m115612a(Provider<BffProductsManagementApi> provider, Provider<C28646a> provider2) {
        return new C27466f(provider, provider2);
    }

    /* renamed from: c */
    public static NonFoodProductDetailDataSource m115613c(BffProductsManagementApi bffProductsManagementApi, C28646a aVar) {
        return new NonFoodProductDetailDataSource(bffProductsManagementApi, aVar);
    }

    /* renamed from: b */
    public NonFoodProductDetailDataSource get() {
        return m115613c(this.f66599a.get(), this.f66600b.get());
    }
}
