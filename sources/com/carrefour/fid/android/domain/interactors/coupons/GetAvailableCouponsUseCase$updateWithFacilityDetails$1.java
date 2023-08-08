package com.carrefour.fid.android.domain.interactors.coupons;

import com.carrefour.fid.android.domain.models.C37974c;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase", mo22502f = "GetAvailableCouponsUseCase.kt", mo22503i = {0}, mo22504l = {111}, mo22505m = "updateWithFacilityDetails", mo22506n = {"$this$updateWithFacilityDetails"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class GetAvailableCouponsUseCase$updateWithFacilityDetails$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetAvailableCouponsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetAvailableCouponsUseCase$updateWithFacilityDetails$1(GetAvailableCouponsUseCase getAvailableCouponsUseCase, C11045c<? super GetAvailableCouponsUseCase$updateWithFacilityDetails$1> cVar) {
        super(cVar);
        this.this$0 = getAvailableCouponsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo114543g((C37974c) null, this);
    }
}
