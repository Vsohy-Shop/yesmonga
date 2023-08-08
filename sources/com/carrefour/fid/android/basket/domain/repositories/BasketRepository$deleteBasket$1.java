package com.carrefour.fid.android.basket.domain.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.repositories.BasketRepository", mo22502f = "BasketRepository.kt", mo22503i = {0, 1, 1}, mo22504l = {86, 88, 92}, mo22505m = "deleteBasket-IoAF18A", mo22506n = {"this", "this", "currentBasket"}, mo22507s = {"L$0", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketRepository$deleteBasket$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketRepository$deleteBasket$1(BasketRepository basketRepository, C11045c<? super BasketRepository$deleteBasket$1> cVar) {
        super(cVar);
        this.this$0 = basketRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object i = this.this$0.mo33385i(this);
        return i == C11063b.m42612h() ? i : Result.m38701a(i);
    }
}
