package com.carrefour.fid.android.domain.interactors.shoppinglist;

import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.product.GetFavoriteProductsFlowUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.shoppinglist.f */
public final class C37851f implements C10324h<ProductGetFavoriteFlowUseCase> {

    /* renamed from: a */
    public final Provider<GetFavoriteProductsFlowUseCase> f94940a;

    /* renamed from: b */
    public final Provider<C37682c> f94941b;

    /* renamed from: c */
    public final Provider<C37606z> f94942c;

    /* renamed from: d */
    public final Provider<C37559b0> f94943d;

    /* renamed from: e */
    public final Provider<C37823k> f94944e;

    public C37851f(Provider<GetFavoriteProductsFlowUseCase> provider, Provider<C37682c> provider2, Provider<C37606z> provider3, Provider<C37559b0> provider4, Provider<C37823k> provider5) {
        this.f94940a = provider;
        this.f94941b = provider2;
        this.f94942c = provider3;
        this.f94943d = provider4;
        this.f94944e = provider5;
    }

    /* renamed from: a */
    public static C37851f m155057a(Provider<GetFavoriteProductsFlowUseCase> provider, Provider<C37682c> provider2, Provider<C37606z> provider3, Provider<C37559b0> provider4, Provider<C37823k> provider5) {
        return new C37851f(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static ProductGetFavoriteFlowUseCase m155058c(GetFavoriteProductsFlowUseCase getFavoriteProductsFlowUseCase, C37682c cVar, C37606z zVar, C37559b0 b0Var, C37823k kVar) {
        return new ProductGetFavoriteFlowUseCase(getFavoriteProductsFlowUseCase, cVar, zVar, b0Var, kVar);
    }

    /* renamed from: b */
    public ProductGetFavoriteFlowUseCase get() {
        return m155058c(this.f94940a.get(), this.f94941b.get(), this.f94942c.get(), this.f94943d.get(), this.f94944e.get());
    }
}
