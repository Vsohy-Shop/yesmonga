package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37603x;
import com.carrefour.fid.android.domain.models.basket.Basket;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class BasketObserveBasketByReferenceUseCase implements C37603x {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33864a;

    @Inject
    public BasketObserveBasketByReferenceUseCase(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        this.f33864a = basketRepository;
    }

    @C12580l
    /* renamed from: b */
    public Object invoke(@C12579k String str, @C12579k C11045c<? super C11907e<Basket>> cVar) {
        return C11909g.m47376J0(new BasketObserveBasketByReferenceUseCase$invoke$2(this, str, (C11045c<? super BasketObserveBasketByReferenceUseCase$invoke$2>) null));
    }
}
