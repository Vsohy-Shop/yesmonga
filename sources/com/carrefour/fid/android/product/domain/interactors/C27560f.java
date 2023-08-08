package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.product.domain.repositories.AlternativeProductsRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.f */
public final class C27560f implements C10324h<ProductGetConsolidatedAlternativeProductsFlowUseCase> {

    /* renamed from: a */
    public final Provider<AlternativeProductsRepository> f66931a;

    /* renamed from: b */
    public final Provider<C37682c> f66932b;

    /* renamed from: c */
    public final Provider<C37606z> f66933c;

    /* renamed from: d */
    public final Provider<C37559b0> f66934d;

    public C27560f(Provider<AlternativeProductsRepository> provider, Provider<C37682c> provider2, Provider<C37606z> provider3, Provider<C37559b0> provider4) {
        this.f66931a = provider;
        this.f66932b = provider2;
        this.f66933c = provider3;
        this.f66934d = provider4;
    }

    /* renamed from: a */
    public static C27560f m115964a(Provider<AlternativeProductsRepository> provider, Provider<C37682c> provider2, Provider<C37606z> provider3, Provider<C37559b0> provider4) {
        return new C27560f(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static ProductGetConsolidatedAlternativeProductsFlowUseCase m115965c(AlternativeProductsRepository alternativeProductsRepository, C37682c cVar, C37606z zVar, C37559b0 b0Var) {
        return new ProductGetConsolidatedAlternativeProductsFlowUseCase(alternativeProductsRepository, cVar, zVar, b0Var);
    }

    /* renamed from: b */
    public ProductGetConsolidatedAlternativeProductsFlowUseCase get() {
        return m115965c(this.f66931a.get(), this.f66932b.get(), this.f66933c.get(), this.f66934d.get());
    }
}
