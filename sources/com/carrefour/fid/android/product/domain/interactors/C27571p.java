package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.product.domain.repositories.ProductDetailRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.p */
public final class C27571p implements C10324h<ProductGetMixedProductsDetailUseCase> {

    /* renamed from: a */
    public final Provider<ProductDetailRepository> f66962a;

    /* renamed from: b */
    public final Provider<C37857d> f66963b;

    public C27571p(Provider<ProductDetailRepository> provider, Provider<C37857d> provider2) {
        this.f66962a = provider;
        this.f66963b = provider2;
    }

    /* renamed from: a */
    public static C27571p m115994a(Provider<ProductDetailRepository> provider, Provider<C37857d> provider2) {
        return new C27571p(provider, provider2);
    }

    /* renamed from: c */
    public static ProductGetMixedProductsDetailUseCase m115995c(ProductDetailRepository productDetailRepository, C37857d dVar) {
        return new ProductGetMixedProductsDetailUseCase(productDetailRepository, dVar);
    }

    /* renamed from: b */
    public ProductGetMixedProductsDetailUseCase get() {
        return m115995c(this.f66962a.get(), this.f66963b.get());
    }
}
