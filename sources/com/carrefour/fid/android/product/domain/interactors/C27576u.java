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
/* renamed from: com.carrefour.fid.android.product.domain.interactors.u */
public final class C27576u implements C10324h<ProductGetProductDetailUseCase> {

    /* renamed from: a */
    public final Provider<ProductDetailRepository> f66983a;

    /* renamed from: b */
    public final Provider<C37857d> f66984b;

    public C27576u(Provider<ProductDetailRepository> provider, Provider<C37857d> provider2) {
        this.f66983a = provider;
        this.f66984b = provider2;
    }

    /* renamed from: a */
    public static C27576u m116009a(Provider<ProductDetailRepository> provider, Provider<C37857d> provider2) {
        return new C27576u(provider, provider2);
    }

    /* renamed from: c */
    public static ProductGetProductDetailUseCase m116010c(ProductDetailRepository productDetailRepository, C37857d dVar) {
        return new ProductGetProductDetailUseCase(productDetailRepository, dVar);
    }

    /* renamed from: b */
    public ProductGetProductDetailUseCase get() {
        return m116010c(this.f66983a.get(), this.f66984b.get());
    }
}
