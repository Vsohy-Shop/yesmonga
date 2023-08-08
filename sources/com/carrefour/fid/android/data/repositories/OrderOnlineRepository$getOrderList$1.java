package com.carrefour.fid.android.data.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.OrderOnlineRepository", mo22502f = "OrderOnlineRepository.kt", mo22503i = {}, mo22504l = {71}, mo22505m = "getOrderList-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOnlineRepository$getOrderList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderOnlineRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineRepository$getOrderList$1(OrderOnlineRepository orderOnlineRepository, C11045c<? super OrderOnlineRepository$getOrderList$1> cVar) {
        super(cVar);
        this.this$0 = orderOnlineRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object j = this.this$0.mo111538j((String) null, (String) null, this);
        return j == C11063b.m42612h() ? j : Result.m38701a(j);
    }
}
