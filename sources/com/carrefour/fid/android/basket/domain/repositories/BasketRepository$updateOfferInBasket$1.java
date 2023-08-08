package com.carrefour.fid.android.basket.domain.repositories;

import com.carrefour.fid.android.domain.models.basket.BasketType;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.repositories.BasketRepository", mo22502f = "BasketRepository.kt", mo22503i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3}, mo22504l = {292, 293, 297, 308}, mo22505m = "updateOfferInBasket-ek6i_oY", mo22506n = {"this", "facilityId", "gtin", "slotId", "type", "quantity", "synchronize", "this", "facilityId", "gtin", "slotId", "type", "currentBasket", "quantity", "synchronize", "this", "gtin", "this", "gtin"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "Z$0", "L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketRepository$updateOfferInBasket$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketRepository$updateOfferInBasket$1(BasketRepository basketRepository, C11045c<? super BasketRepository$updateOfferInBasket$1> cVar) {
        super(cVar);
        this.this$0 = basketRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object H = this.this$0.mo33378H((String) null, (String) null, 0, (String) null, false, (BasketType) null, this);
        return H == C11063b.m42612h() ? H : Result.m38701a(H);
    }
}
