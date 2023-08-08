package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.product.C37778p;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.h */
public final class C27563h implements C10324h<ProductGetConsolidatedPlpFlowUseCase> {

    /* renamed from: a */
    public final Provider<C37778p> f66942a;

    /* renamed from: b */
    public final Provider<AddMarketingElementsToPlpUseCase> f66943b;

    /* renamed from: c */
    public final Provider<C37682c> f66944c;

    /* renamed from: d */
    public final Provider<C37606z> f66945d;

    /* renamed from: e */
    public final Provider<C37559b0> f66946e;

    /* renamed from: f */
    public final Provider<C37807b> f66947f;

    public C27563h(Provider<C37778p> provider, Provider<AddMarketingElementsToPlpUseCase> provider2, Provider<C37682c> provider3, Provider<C37606z> provider4, Provider<C37559b0> provider5, Provider<C37807b> provider6) {
        this.f66942a = provider;
        this.f66943b = provider2;
        this.f66944c = provider3;
        this.f66945d = provider4;
        this.f66946e = provider5;
        this.f66947f = provider6;
    }

    /* renamed from: a */
    public static C27563h m115973a(Provider<C37778p> provider, Provider<AddMarketingElementsToPlpUseCase> provider2, Provider<C37682c> provider3, Provider<C37606z> provider4, Provider<C37559b0> provider5, Provider<C37807b> provider6) {
        return new C27563h(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static ProductGetConsolidatedPlpFlowUseCase m115974c(C37778p pVar, AddMarketingElementsToPlpUseCase addMarketingElementsToPlpUseCase, C37682c cVar, C37606z zVar, C37559b0 b0Var, C37807b bVar) {
        return new ProductGetConsolidatedPlpFlowUseCase(pVar, addMarketingElementsToPlpUseCase, cVar, zVar, b0Var, bVar);
    }

    /* renamed from: b */
    public ProductGetConsolidatedPlpFlowUseCase get() {
        return m115974c(this.f66942a.get(), this.f66943b.get(), this.f66944c.get(), this.f66945d.get(), this.f66946e.get(), this.f66947f.get());
    }
}
