package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.slot.C37858e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.x */
public final class C27579x implements C10324h<ProductGetSlotSliceUseCase> {

    /* renamed from: a */
    public final Provider<C37858e> f66990a;

    /* renamed from: b */
    public final Provider<C37566e0> f66991b;

    public C27579x(Provider<C37858e> provider, Provider<C37566e0> provider2) {
        this.f66990a = provider;
        this.f66991b = provider2;
    }

    /* renamed from: a */
    public static C27579x m116018a(Provider<C37858e> provider, Provider<C37566e0> provider2) {
        return new C27579x(provider, provider2);
    }

    /* renamed from: c */
    public static ProductGetSlotSliceUseCase m116019c(C37858e eVar, C37566e0 e0Var) {
        return new ProductGetSlotSliceUseCase(eVar, e0Var);
    }

    /* renamed from: b */
    public ProductGetSlotSliceUseCase get() {
        return m116019c(this.f66990a.get(), this.f66991b.get());
    }
}
