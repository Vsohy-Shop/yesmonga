package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.product.C37780r;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.i */
public final class C27564i implements C10324h<ProductGetConsolidatedProductFlowUseCase> {

    /* renamed from: a */
    public final Provider<C37780r> f66948a;

    /* renamed from: b */
    public final Provider<C37682c> f66949b;

    /* renamed from: c */
    public final Provider<C37606z> f66950c;

    /* renamed from: d */
    public final Provider<C37559b0> f66951d;

    public C27564i(Provider<C37780r> provider, Provider<C37682c> provider2, Provider<C37606z> provider3, Provider<C37559b0> provider4) {
        this.f66948a = provider;
        this.f66949b = provider2;
        this.f66950c = provider3;
        this.f66951d = provider4;
    }

    /* renamed from: a */
    public static C27564i m115976a(Provider<C37780r> provider, Provider<C37682c> provider2, Provider<C37606z> provider3, Provider<C37559b0> provider4) {
        return new C27564i(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static ProductGetConsolidatedProductFlowUseCase m115977c(C37780r rVar, C37682c cVar, C37606z zVar, C37559b0 b0Var) {
        return new ProductGetConsolidatedProductFlowUseCase(rVar, cVar, zVar, b0Var);
    }

    /* renamed from: b */
    public ProductGetConsolidatedProductFlowUseCase get() {
        return m115977c(this.f66948a.get(), this.f66949b.get(), this.f66950c.get(), this.f66951d.get());
    }
}
