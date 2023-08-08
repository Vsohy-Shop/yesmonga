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
/* renamed from: com.carrefour.fid.android.product.domain.interactors.t */
public final class C27575t implements C10324h<ProductGetProductChannelTypesUseCase> {

    /* renamed from: a */
    public final Provider<ProductsManagementRepository> f66981a;

    /* renamed from: b */
    public final Provider<C37823k> f66982b;

    public C27575t(Provider<ProductsManagementRepository> provider, Provider<C37823k> provider2) {
        this.f66981a = provider;
        this.f66982b = provider2;
    }

    /* renamed from: a */
    public static C27575t m116006a(Provider<ProductsManagementRepository> provider, Provider<C37823k> provider2) {
        return new C27575t(provider, provider2);
    }

    /* renamed from: c */
    public static ProductGetProductChannelTypesUseCase m116007c(ProductsManagementRepository productsManagementRepository, C37823k kVar) {
        return new ProductGetProductChannelTypesUseCase(productsManagementRepository, kVar);
    }

    /* renamed from: b */
    public ProductGetProductChannelTypesUseCase get() {
        return m116007c(this.f66981a.get(), this.f66982b.get());
    }
}
