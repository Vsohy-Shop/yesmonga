package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37571g0;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.BasketSetDeliveryTypeUseCase", mo22502f = "BasketSetDeliveryTypeUseCase.kt", mo22503i = {}, mo22504l = {12}, mo22505m = "invoke-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketSetDeliveryTypeUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketSetDeliveryTypeUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketSetDeliveryTypeUseCase$invoke$1(BasketSetDeliveryTypeUseCase basketSetDeliveryTypeUseCase, C11045c<? super BasketSetDeliveryTypeUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = basketSetDeliveryTypeUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.m172764invokegIAlus((C37571g0.C37572a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
