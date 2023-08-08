package com.carrefour.fid.android.service.domain.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository", mo22502f = "StoreFacilityRepository.kt", mo22503i = {}, mo22504l = {79}, mo22505m = "getEligibilityPostalCode-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreFacilityRepository$getEligibilityPostalCode$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StoreFacilityRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreFacilityRepository$getEligibilityPostalCode$1(StoreFacilityRepository storeFacilityRepository, C11045c<? super StoreFacilityRepository$getEligibilityPostalCode$1> cVar) {
        super(cVar);
        this.this$0 = storeFacilityRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m172882getEligibilityPostalCode0E7RQCE((String) null, (String) null, this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
