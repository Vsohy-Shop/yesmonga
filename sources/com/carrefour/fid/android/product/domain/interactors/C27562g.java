package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.utilities.C37890c;
import com.carrefour.fid.android.performance.C38328d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.g */
public final class C27562g implements C10324h<ProductGetConsolidatedCriteoProductsFlowUseCase> {

    /* renamed from: a */
    public final Provider<C37890c> f66936a;

    /* renamed from: b */
    public final Provider<C37823k> f66937b;

    /* renamed from: c */
    public final Provider<C37682c> f66938c;

    /* renamed from: d */
    public final Provider<C37606z> f66939d;

    /* renamed from: e */
    public final Provider<C37559b0> f66940e;

    /* renamed from: f */
    public final Provider<C38328d> f66941f;

    public C27562g(Provider<C37890c> provider, Provider<C37823k> provider2, Provider<C37682c> provider3, Provider<C37606z> provider4, Provider<C37559b0> provider5, Provider<C38328d> provider6) {
        this.f66936a = provider;
        this.f66937b = provider2;
        this.f66938c = provider3;
        this.f66939d = provider4;
        this.f66940e = provider5;
        this.f66941f = provider6;
    }

    /* renamed from: a */
    public static C27562g m115970a(Provider<C37890c> provider, Provider<C37823k> provider2, Provider<C37682c> provider3, Provider<C37606z> provider4, Provider<C37559b0> provider5, Provider<C38328d> provider6) {
        return new C27562g(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static ProductGetConsolidatedCriteoProductsFlowUseCase m115971c(C37890c cVar, C37823k kVar, C37682c cVar2, C37606z zVar, C37559b0 b0Var, C38328d dVar) {
        return new ProductGetConsolidatedCriteoProductsFlowUseCase(cVar, kVar, cVar2, zVar, b0Var, dVar);
    }

    /* renamed from: b */
    public ProductGetConsolidatedCriteoProductsFlowUseCase get() {
        return m115971c(this.f66936a.get(), this.f66937b.get(), this.f66938c.get(), this.f66939d.get(), this.f66940e.get(), this.f66941f.get());
    }
}
