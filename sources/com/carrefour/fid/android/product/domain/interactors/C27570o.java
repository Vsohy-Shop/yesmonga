package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.o */
public final class C27570o implements C10324h<ProductGetFrequentlyPurchasedProductsUseCase> {

    /* renamed from: a */
    public final Provider<ProductsManagementRepository> f66960a;

    /* renamed from: b */
    public final Provider<C37823k> f66961b;

    public C27570o(Provider<ProductsManagementRepository> provider, Provider<C37823k> provider2) {
        this.f66960a = provider;
        this.f66961b = provider2;
    }

    /* renamed from: a */
    public static C27570o m115991a(Provider<ProductsManagementRepository> provider, Provider<C37823k> provider2) {
        return new C27570o(provider, provider2);
    }

    /* renamed from: c */
    public static ProductGetFrequentlyPurchasedProductsUseCase m115992c(ProductsManagementRepository productsManagementRepository, C37823k kVar) {
        return new ProductGetFrequentlyPurchasedProductsUseCase(productsManagementRepository, kVar);
    }

    /* renamed from: b */
    public ProductGetFrequentlyPurchasedProductsUseCase get() {
        return m115992c(this.f66960a.get(), this.f66961b.get());
    }
}
