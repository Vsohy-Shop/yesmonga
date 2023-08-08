package com.carrefour.fid.android.domain.interactors.coupons;

import com.carrefour.fid.android.presentation.models.CouponModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase", mo22502f = "UpdateCouponsUseCase.kt", mo22503i = {0}, mo22504l = {57}, mo22505m = "updateCoupons-yxL6bBk", mo22506n = {"currentCoupons"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UpdateCouponsUseCase$updateCoupons$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateCouponsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateCouponsUseCase$updateCoupons$1(UpdateCouponsUseCase updateCouponsUseCase, C11045c<? super UpdateCouponsUseCase$updateCoupons$1> cVar) {
        super(cVar);
        this.this$0 = updateCouponsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo114598d((String) null, false, (List<CouponModel>) null, (C37643a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
