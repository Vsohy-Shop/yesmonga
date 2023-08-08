package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.product.domain.repositories.PlpProductRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.w */
public final class C27578w implements C10324h<ProductGetProductFlowUseCase> {

    /* renamed from: a */
    public final Provider<PlpProductRepository> f66988a;

    /* renamed from: b */
    public final Provider<C37857d> f66989b;

    public C27578w(Provider<PlpProductRepository> provider, Provider<C37857d> provider2) {
        this.f66988a = provider;
        this.f66989b = provider2;
    }

    /* renamed from: a */
    public static C27578w m116015a(Provider<PlpProductRepository> provider, Provider<C37857d> provider2) {
        return new C27578w(provider, provider2);
    }

    /* renamed from: c */
    public static ProductGetProductFlowUseCase m116016c(PlpProductRepository plpProductRepository, C37857d dVar) {
        return new ProductGetProductFlowUseCase(plpProductRepository, dVar);
    }

    /* renamed from: b */
    public ProductGetProductFlowUseCase get() {
        return m116016c(this.f66988a.get(), this.f66989b.get());
    }
}
