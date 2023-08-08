package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37591o0;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase", mo22502f = "BasketUpdateBasketUseCase.kt", mo22503i = {}, mo22504l = {67, 83}, mo22505m = "updateBasket-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketUpdateBasketUseCase$updateBasket$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketUpdateBasketUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketUpdateBasketUseCase$updateBasket$1(BasketUpdateBasketUseCase basketUpdateBasketUseCase, C11045c<? super BasketUpdateBasketUseCase$updateBasket$1> cVar) {
        super(cVar);
        this.this$0 = basketUpdateBasketUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.mo33291e((C37591o0.C37592a) null, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
