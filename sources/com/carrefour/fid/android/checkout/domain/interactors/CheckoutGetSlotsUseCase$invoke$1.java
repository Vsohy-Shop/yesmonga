package com.carrefour.fid.android.checkout.domain.interactors;

import com.carrefour.fid.android.domain.interactors.slot.C37861g;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase", mo22502f = "CheckoutGetSlotsUseCase.kt", mo22503i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3}, mo22504l = {30, 31, 41, 47, 63, 65, 68}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "param", "this", "param", "this", "facilityStoreId", "selectedService", "this", "basket", "facilityStoreId", "selectedService", "productCount"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckoutGetSlotsUseCase$invoke$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutGetSlotsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutGetSlotsUseCase$invoke$1(CheckoutGetSlotsUseCase checkoutGetSlotsUseCase, C11045c<? super CheckoutGetSlotsUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = checkoutGetSlotsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.m173114invokegIAlus((C37861g.C37862a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
