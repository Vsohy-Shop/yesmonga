package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37751c;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.BasketItemDeleteUseCase", mo22502f = "BasketItemDeleteUseCase.kt", mo22503i = {}, mo22504l = {11}, mo22505m = "invoke-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketItemDeleteUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketItemDeleteUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketItemDeleteUseCase$invoke$1(BasketItemDeleteUseCase basketItemDeleteUseCase, C11045c<? super BasketItemDeleteUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = basketItemDeleteUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.m172759invokegIAlus((C37751c.C37752a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
