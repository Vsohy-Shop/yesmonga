package com.carrefour.fid.android.domain.interactors.coupons;

import com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponListUseCase", mo22502f = "UpdateCouponListUseCase.kt", mo22503i = {}, mo22504l = {16}, mo22505m = "invoke-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UpdateCouponListUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateCouponListUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateCouponListUseCase$invoke$1(UpdateCouponListUseCase updateCouponListUseCase, C11045c<? super UpdateCouponListUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = updateCouponListUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.m172955invokegIAlus((UpdateCouponListUseCase.C37640a) null, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
