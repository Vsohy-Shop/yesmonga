package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffProductsManagementApiGateway"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.product.domain.repositories.j */
public final class C27606j implements C10324h<ProductsManagementRepository> {

    /* renamed from: a */
    public final Provider<ProductsDataSource> f67073a;

    /* renamed from: b */
    public final Provider<BffProductsManagementApi> f67074b;

    /* renamed from: c */
    public final Provider<C28646a> f67075c;

    public C27606j(Provider<ProductsDataSource> provider, Provider<BffProductsManagementApi> provider2, Provider<C28646a> provider3) {
        this.f67073a = provider;
        this.f67074b = provider2;
        this.f67075c = provider3;
    }

    /* renamed from: a */
    public static C27606j m116186a(Provider<ProductsDataSource> provider, Provider<BffProductsManagementApi> provider2, Provider<C28646a> provider3) {
        return new C27606j(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static ProductsManagementRepository m116187c(ProductsDataSource productsDataSource, BffProductsManagementApi bffProductsManagementApi, C28646a aVar) {
        return new ProductsManagementRepository(productsDataSource, bffProductsManagementApi, aVar);
    }

    /* renamed from: b */
    public ProductsManagementRepository get() {
        return m116187c(this.f67073a.get(), this.f67074b.get(), this.f67075c.get());
    }
}
