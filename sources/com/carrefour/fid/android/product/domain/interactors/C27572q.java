package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.product.domain.repositories.ProductRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.q */
public final class C27572q implements C10324h<ProductGetMixedProductsFlowUseCase> {

    /* renamed from: a */
    public final Provider<ProductRepository> f66964a;

    /* renamed from: b */
    public final Provider<C37857d> f66965b;

    /* renamed from: c */
    public final Provider<C37682c> f66966c;

    /* renamed from: d */
    public final Provider<C37606z> f66967d;

    /* renamed from: e */
    public final Provider<C37559b0> f66968e;

    /* renamed from: f */
    public final Provider<C37681b> f66969f;

    public C27572q(Provider<ProductRepository> provider, Provider<C37857d> provider2, Provider<C37682c> provider3, Provider<C37606z> provider4, Provider<C37559b0> provider5, Provider<C37681b> provider6) {
        this.f66964a = provider;
        this.f66965b = provider2;
        this.f66966c = provider3;
        this.f66967d = provider4;
        this.f66968e = provider5;
        this.f66969f = provider6;
    }

    /* renamed from: a */
    public static C27572q m115997a(Provider<ProductRepository> provider, Provider<C37857d> provider2, Provider<C37682c> provider3, Provider<C37606z> provider4, Provider<C37559b0> provider5, Provider<C37681b> provider6) {
        return new C27572q(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static ProductGetMixedProductsFlowUseCase m115998c(ProductRepository productRepository, C37857d dVar, C37682c cVar, C37606z zVar, C37559b0 b0Var, C37681b bVar) {
        return new ProductGetMixedProductsFlowUseCase(productRepository, dVar, cVar, zVar, b0Var, bVar);
    }

    /* renamed from: b */
    public ProductGetMixedProductsFlowUseCase get() {
        return m115998c(this.f66964a.get(), this.f66965b.get(), this.f66966c.get(), this.f66967d.get(), this.f66968e.get(), this.f66969f.get());
    }
}
