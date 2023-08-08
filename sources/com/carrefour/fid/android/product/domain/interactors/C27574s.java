package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37786s;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.product.domain.repositories.PlpProductRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.s */
public final class C27574s implements C10324h<ProductGetPlpFlowUseCase> {

    /* renamed from: a */
    public final Provider<PlpProductRepository> f66977a;

    /* renamed from: b */
    public final Provider<C37857d> f66978b;

    /* renamed from: c */
    public final Provider<C37786s> f66979c;

    /* renamed from: d */
    public final Provider<C38328d> f66980d;

    public C27574s(Provider<PlpProductRepository> provider, Provider<C37857d> provider2, Provider<C37786s> provider3, Provider<C38328d> provider4) {
        this.f66977a = provider;
        this.f66978b = provider2;
        this.f66979c = provider3;
        this.f66980d = provider4;
    }

    /* renamed from: a */
    public static C27574s m116003a(Provider<PlpProductRepository> provider, Provider<C37857d> provider2, Provider<C37786s> provider3, Provider<C38328d> provider4) {
        return new C27574s(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static ProductGetPlpFlowUseCase m116004c(PlpProductRepository plpProductRepository, C37857d dVar, C37786s sVar, C38328d dVar2) {
        return new ProductGetPlpFlowUseCase(plpProductRepository, dVar, sVar, dVar2);
    }

    /* renamed from: b */
    public ProductGetPlpFlowUseCase get() {
        return m116004c(this.f66977a.get(), this.f66978b.get(), this.f66979c.get(), this.f66980d.get());
    }
}
