package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository", mo22502f = "LoyaltyRepository.kt", mo22503i = {0, 0, 0}, mo22504l = {99, 100}, mo22505m = "activeFidAdhesionEasy-0E7RQCE", mo22506n = {"this", "body", "loyaltyCardId"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyRepository$activeFidAdhesionEasy$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoyaltyRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyRepository$activeFidAdhesionEasy$1(LoyaltyRepository loyaltyRepository, C11045c<? super LoyaltyRepository$activeFidAdhesionEasy$1> cVar) {
        super(cVar);
        this.this$0 = loyaltyRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m173018activeFidAdhesionEasy0E7RQCE((BffCreateOrAttachCardBody) null, (String) null, this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
