package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.C23460b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsList$1$1$1$1 */
public final class CheckoutBasketsListStatefulKt$CheckoutBasketsList$1$1$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C23460b, C11079d2> $actioner;
    final /* synthetic */ Basket $basket;
    final /* synthetic */ BasketType $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutBasketsListStatefulKt$CheckoutBasketsList$1$1$1$1(C11300l<? super C23460b, C11079d2> lVar, BasketType basketType, Basket basket) {
        super(0);
        this.$actioner = lVar;
        this.$it = basketType;
        this.$basket = basket;
    }

    public final void invoke() {
        this.$actioner.invoke(new C23460b.C23464d(true, this.$it, this.$basket.mo116822G(), this.$basket.mo116830O()));
    }
}
