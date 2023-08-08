package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37606z;
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
/* renamed from: com.carrefour.fid.android.product.domain.interactors.e */
public final class C27558e implements C10324h<ProductGetComplementaryProductsUseCase> {

    /* renamed from: a */
    public final Provider<ProductsManagementRepository> f66927a;

    /* renamed from: b */
    public final Provider<C37823k> f66928b;

    /* renamed from: c */
    public final Provider<C37606z> f66929c;

    public C27558e(Provider<ProductsManagementRepository> provider, Provider<C37823k> provider2, Provider<C37606z> provider3) {
        this.f66927a = provider;
        this.f66928b = provider2;
        this.f66929c = provider3;
    }

    /* renamed from: a */
    public static C27558e m115958a(Provider<ProductsManagementRepository> provider, Provider<C37823k> provider2, Provider<C37606z> provider3) {
        return new C27558e(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static ProductGetComplementaryProductsUseCase m115959c(ProductsManagementRepository productsManagementRepository, C37823k kVar, C37606z zVar) {
        return new ProductGetComplementaryProductsUseCase(productsManagementRepository, kVar, zVar);
    }

    /* renamed from: b */
    public ProductGetComplementaryProductsUseCase get() {
        return m115959c(this.f66927a.get(), this.f66928b.get(), this.f66929c.get());
    }
}
