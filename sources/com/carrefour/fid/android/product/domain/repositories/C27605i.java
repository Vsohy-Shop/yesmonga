package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.product.domain.repositories.i */
public final class C27605i implements C10324h<ProductRepository> {

    /* renamed from: a */
    public final Provider<ProductsDataSource> f67072a;

    public C27605i(Provider<ProductsDataSource> provider) {
        this.f67072a = provider;
    }

    /* renamed from: a */
    public static C27605i m116183a(Provider<ProductsDataSource> provider) {
        return new C27605i(provider);
    }

    /* renamed from: c */
    public static ProductRepository m116184c(ProductsDataSource productsDataSource) {
        return new ProductRepository(productsDataSource);
    }

    /* renamed from: b */
    public ProductRepository get() {
        return m116184c(this.f67072a.get());
    }
}
