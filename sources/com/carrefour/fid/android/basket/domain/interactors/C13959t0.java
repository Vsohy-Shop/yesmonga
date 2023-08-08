package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37554a;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.basket.C37597s;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.t0 */
public final class C13959t0 implements C10324h<BasketUpdateBasketUseCase> {

    /* renamed from: a */
    public final Provider<C37588n0> f34077a;

    /* renamed from: b */
    public final Provider<C37597s> f34078b;

    /* renamed from: c */
    public final Provider<C37554a> f34079c;

    /* renamed from: d */
    public final Provider<InitializeBasketUseCase> f34080d;

    /* renamed from: e */
    public final Provider<InitializeNonFoodBasketUseCase> f34081e;

    /* renamed from: f */
    public final Provider<BasketRepository> f34082f;

    public C13959t0(Provider<C37588n0> provider, Provider<C37597s> provider2, Provider<C37554a> provider3, Provider<InitializeBasketUseCase> provider4, Provider<InitializeNonFoodBasketUseCase> provider5, Provider<BasketRepository> provider6) {
        this.f34077a = provider;
        this.f34078b = provider2;
        this.f34079c = provider3;
        this.f34080d = provider4;
        this.f34081e = provider5;
        this.f34082f = provider6;
    }

    /* renamed from: a */
    public static C13959t0 m59159a(Provider<C37588n0> provider, Provider<C37597s> provider2, Provider<C37554a> provider3, Provider<InitializeBasketUseCase> provider4, Provider<InitializeNonFoodBasketUseCase> provider5, Provider<BasketRepository> provider6) {
        return new C13959t0(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static BasketUpdateBasketUseCase m59160c(C37588n0 n0Var, C37597s sVar, C37554a aVar, InitializeBasketUseCase initializeBasketUseCase, InitializeNonFoodBasketUseCase initializeNonFoodBasketUseCase, BasketRepository basketRepository) {
        return new BasketUpdateBasketUseCase(n0Var, sVar, aVar, initializeBasketUseCase, initializeNonFoodBasketUseCase, basketRepository);
    }

    /* renamed from: b */
    public BasketUpdateBasketUseCase get() {
        return m59160c(this.f34077a.get(), this.f34078b.get(), this.f34079c.get(), this.f34080d.get(), this.f34081e.get(), this.f34082f.get());
    }
}
