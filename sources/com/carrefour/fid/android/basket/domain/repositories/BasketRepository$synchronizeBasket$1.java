package com.carrefour.fid.android.basket.domain.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.repositories.BasketRepository", mo22502f = "BasketRepository.kt", mo22503i = {0, 1, 1, 2, 3}, mo22504l = {228, 229, 232, 237, 241}, mo22505m = "synchronizeBasket-IoAF18A", mo22506n = {"this", "this", "currentBasket", "this", "this"}, mo22507s = {"L$0", "L$0", "L$1", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketRepository$synchronizeBasket$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketRepository$synchronizeBasket$1(BasketRepository basketRepository, C11045c<? super BasketRepository$synchronizeBasket$1> cVar) {
        super(cVar);
        this.this$0 = basketRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object E = this.this$0.mo33375E(this);
        return E == C11063b.m42612h() ? E : Result.m38701a(E);
    }
}
