package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37583l;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.offer.Offer;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketGetBasketItemListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketGetBasketItemListUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketGetBasketItemListUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.m */
public final class C13939m implements C37583l {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f34023a;

    @Inject
    public C13939m(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "basketRepository");
        this.f34023a = basketRepository;
    }

    @C12579k
    /* renamed from: a */
    public List<Offer> invoke(@C12579k String str) {
        Object obj;
        List<Offer> B;
        Intrinsics.checkNotNullParameter(str, "param");
        Iterator it = this.f34023a.mo33392p().getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((Basket) obj).mo116822G(), (Object) str)) {
                break;
            }
        }
        Basket basket = (Basket) obj;
        if (basket == null || (B = basket.mo116817B()) == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return B;
    }
}
