package com.carrefour.fid.android.service.domain.repositories;

import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository", mo22502f = "ServiceSelectionRepository.kt", mo22503i = {}, mo22504l = {22}, mo22505m = "setSelectedService-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ServiceSelectionRepository$setSelectedService$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServiceSelectionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSelectionRepository$setSelectedService$1(ServiceSelectionRepository serviceSelectionRepository, C11045c<? super ServiceSelectionRepository$setSelectedService$1> cVar) {
        super(cVar);
        this.this$0 = serviceSelectionRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m172876setSelectedService0E7RQCE((C38163l) null, (StoreService) null, this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
