package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37579k;
import com.carrefour.fid.android.domain.models.basket.Basket;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBasketCacheByReferenceUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketCacheByReferenceUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketCacheByReferenceUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1#2:16\n*E\n"})
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.d */
public final class C13907d implements C37579k {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33934a;

    @Inject
    public C13907d(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        this.f33934a = basketRepository;
    }

    @C12580l
    /* renamed from: a */
    public Object invoke(@C12579k C37579k.C37580a aVar, @C12579k C11045c<? super Basket> cVar) {
        for (Object next : this.f33934a.mo33392p().getValue()) {
            if (Intrinsics.areEqual((Object) ((Basket) next).mo116822G(), (Object) aVar.mo114399d())) {
                return next;
            }
        }
        return null;
    }
}
