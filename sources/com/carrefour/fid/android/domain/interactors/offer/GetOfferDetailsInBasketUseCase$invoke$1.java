package com.carrefour.fid.android.domain.interactors.offer;

import com.carrefour.fid.android.domain.models.basket.Basket;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase", mo22502f = "GetOfferDetailsInBasketUseCase.kt", mo22503i = {}, mo22504l = {12}, mo22505m = "invoke", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class GetOfferDetailsInBasketUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetOfferDetailsInBasketUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetOfferDetailsInBasketUseCase$invoke$1(GetOfferDetailsInBasketUseCase getOfferDetailsInBasketUseCase, C11045c<? super GetOfferDetailsInBasketUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = getOfferDetailsInBasketUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Basket) null, this);
    }
}
