package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.OrderOfflineRepository", mo22502f = "OrderOfflineRepository.kt", mo22503i = {0}, mo22504l = {44}, mo22505m = "getOrderList-gIAlu-s", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOfflineRepository$getOrderList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderOfflineRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOfflineRepository$getOrderList$1(OrderOfflineRepository orderOfflineRepository, C11045c<? super OrderOfflineRepository$getOrderList$1> cVar) {
        super(cVar);
        this.this$0 = orderOfflineRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.mo111534b((GetOrderOfflineListUseCase.C37722a) null, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
