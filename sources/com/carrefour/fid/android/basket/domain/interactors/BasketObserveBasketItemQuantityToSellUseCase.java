package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37605y;
import com.carrefour.fid.android.domain.models.basket.C37968a;
import com.carrefour.fid.android.domain.models.product.Gtin;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBasketObserveBasketItemQuantityToSellUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketObserveBasketItemQuantityToSellUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketObserveBasketItemQuantityToSellUseCase\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,24:1\n53#2:25\n55#2:29\n50#3:26\n55#3:28\n106#4:27\n*S KotlinDebug\n*F\n+ 1 BasketObserveBasketItemQuantityToSellUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketObserveBasketItemQuantityToSellUseCase\n*L\n15#1:25\n15#1:29\n15#1:26\n15#1:28\n15#1:27\n*E\n"})
public final class BasketObserveBasketItemQuantityToSellUseCase implements C37605y {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f33867a;

    @Inject
    public BasketObserveBasketItemQuantityToSellUseCase(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f33867a = basketRepository;
    }

    @C12580l
    /* renamed from: a */
    public Object mo33278a(@C12580l String str, @C12579k C11045c<? super C11907e<C37968a>> cVar) {
        return new C13888x3f20449a(this.f33867a.mo33391o(), str);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Gtin gtin = (Gtin) obj;
        return mo33278a(gtin != null ? gtin.mo118380i() : null, (C11045c) obj2);
    }
}
