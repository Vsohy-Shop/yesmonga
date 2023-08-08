package com.carrefour.fid.android.loyalty.data.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository", mo22502f = "LoyaltyRepository.kt", mo22503i = {0}, mo22504l = {152}, mo22505m = "getUserChannels-gIAlu-s", mo22506n = {"loyaltyCardId"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyRepository$getUserChannels$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoyaltyRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyRepository$getUserChannels$1(LoyaltyRepository loyaltyRepository, C11045c<? super LoyaltyRepository$getUserChannels$1> cVar) {
        super(cVar);
        this.this$0 = loyaltyRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m173024getUserChannelsgIAlus((String) null, this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
