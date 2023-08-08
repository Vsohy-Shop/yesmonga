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

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase", mo22502f = "BasketUpdateBasketUseCase.kt", mo22503i = {0, 0}, mo22504l = {57, 59}, mo22505m = "handleSuccessInitializeBasket-gIAlu-s", mo22506n = {"this", "param"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketUpdateBasketUseCase$handleSuccessInitializeBasket$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketUpdateBasketUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketUpdateBasketUseCase$handleSuccessInitializeBasket$1(BasketUpdateBasketUseCase basketUpdateBasketUseCase, C11045c<? super BasketUpdateBasketUseCase$handleSuccessInitializeBasket$1> cVar) {
        super(cVar);
        this.this$0 = basketUpdateBasketUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo33289c((C37591o0.C37592a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
