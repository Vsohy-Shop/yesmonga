package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase", mo22502f = "UpdateBasketOfferQuantityUseCase.kt", mo22503i = {}, mo22504l = {56}, mo22505m = "updateOffer-CkRE9Mk", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UpdateBasketOfferQuantityUseCase$updateOffer$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateBasketOfferQuantityUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateBasketOfferQuantityUseCase$updateOffer$1(UpdateBasketOfferQuantityUseCase updateBasketOfferQuantityUseCase, C11045c<? super UpdateBasketOfferQuantityUseCase$updateOffer$1> cVar) {
        super(cVar);
        this.this$0 = updateBasketOfferQuantityUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo33322c((String) null, (C37588n0.C37589a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
