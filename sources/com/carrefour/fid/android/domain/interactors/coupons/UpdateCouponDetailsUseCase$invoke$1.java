package com.carrefour.fid.android.domain.interactors.coupons;

import com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase", mo22502f = "UpdateCouponDetailsUseCase.kt", mo22503i = {0, 0}, mo22504l = {24, 31}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "param"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UpdateCouponDetailsUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateCouponDetailsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateCouponDetailsUseCase$invoke$1(UpdateCouponDetailsUseCase updateCouponDetailsUseCase, C11045c<? super UpdateCouponDetailsUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = updateCouponDetailsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.m172954invokegIAlus((UpdateCouponDetailsUseCase.C37638a) null, this);
        return c == C11063b.m42612h() ? c : Result.m38701a(c);
    }
}
