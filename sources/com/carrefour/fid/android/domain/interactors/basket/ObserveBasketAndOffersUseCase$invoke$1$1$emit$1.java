package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$invoke$1;
import com.carrefour.fid.android.domain.models.basket.Basket;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$invoke$1$1", mo22502f = "BasketObserveBasketAndOffersUseCase.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {30, 31, 39}, mo22505m = "emit", mo22506n = {"this", "basket", "this", "basket"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ObserveBasketAndOffersUseCase$invoke$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ObserveBasketAndOffersUseCase$invoke$1.C375531 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObserveBasketAndOffersUseCase$invoke$1$1$emit$1(ObserveBasketAndOffersUseCase$invoke$1.C375531 r1, C11045c<? super ObserveBasketAndOffersUseCase$invoke$1$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = r1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Basket) null, this);
    }
}
