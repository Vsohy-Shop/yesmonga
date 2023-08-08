package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37596r;
import com.carrefour.fid.android.domain.models.basket.Basket;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketGetTotalBasketNumberUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketGetTotalBasketNumberUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketGetTotalBasketNumberUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n1774#2,4:14\n*S KotlinDebug\n*F\n+ 1 BasketGetTotalBasketNumberUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketGetTotalBasketNumberUseCase\n*L\n11#1:14,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.s */
public final class C13951s implements C37596r {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f34044a;

    @Inject
    public C13951s(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        this.f34044a = basketRepository;
    }

    /* renamed from: a */
    public boolean mo33353a() {
        int i;
        boolean z;
        Iterable<Basket> value = this.f34044a.mo33392p().getValue();
        if (!(value instanceof Collection) || !((Collection) value).isEmpty()) {
            i = 0;
            for (Basket D : value) {
                if (D.mo116819D() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.m40458V();
                }
            }
        } else {
            i = 0;
        }
        if (i > 1) {
            return true;
        }
        return false;
    }
}
