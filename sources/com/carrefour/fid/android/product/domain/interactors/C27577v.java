package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.performance.C38328d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.v */
public final class C27577v implements C10324h<ProductGetProductDetailsNalUseCase> {

    /* renamed from: a */
    public final Provider<ProductGetProductDetailUseCase> f66985a;

    /* renamed from: b */
    public final Provider<C37823k> f66986b;

    /* renamed from: c */
    public final Provider<C38328d> f66987c;

    public C27577v(Provider<ProductGetProductDetailUseCase> provider, Provider<C37823k> provider2, Provider<C38328d> provider3) {
        this.f66985a = provider;
        this.f66986b = provider2;
        this.f66987c = provider3;
    }

    /* renamed from: a */
    public static C27577v m116012a(Provider<ProductGetProductDetailUseCase> provider, Provider<C37823k> provider2, Provider<C38328d> provider3) {
        return new C27577v(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static ProductGetProductDetailsNalUseCase m116013c(ProductGetProductDetailUseCase productGetProductDetailUseCase, C37823k kVar, C38328d dVar) {
        return new ProductGetProductDetailsNalUseCase(productGetProductDetailUseCase, kVar, dVar);
    }

    /* renamed from: b */
    public ProductGetProductDetailsNalUseCase get() {
        return m116013c(this.f66985a.get(), this.f66986b.get(), this.f66987c.get());
    }
}
