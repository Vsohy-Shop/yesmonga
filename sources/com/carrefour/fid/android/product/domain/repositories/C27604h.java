package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.product.domain.repositories.h */
public final class C27604h implements C10324h<ProductDetailRepository> {

    /* renamed from: a */
    public final Provider<NonFoodProductDetailDataSource> f67070a;

    /* renamed from: b */
    public final Provider<C27600f> f67071b;

    public C27604h(Provider<NonFoodProductDetailDataSource> provider, Provider<C27600f> provider2) {
        this.f67070a = provider;
        this.f67071b = provider2;
    }

    /* renamed from: a */
    public static C27604h m116180a(Provider<NonFoodProductDetailDataSource> provider, Provider<C27600f> provider2) {
        return new C27604h(provider, provider2);
    }

    /* renamed from: c */
    public static ProductDetailRepository m116181c(NonFoodProductDetailDataSource nonFoodProductDetailDataSource, C27600f fVar) {
        return new ProductDetailRepository(nonFoodProductDetailDataSource, fVar);
    }

    /* renamed from: b */
    public ProductDetailRepository get() {
        return m116181c(this.f67070a.get(), this.f67071b.get());
    }
}
