package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase", mo22502f = "GetOrderOnlineListUseCase.kt", mo22503i = {0, 0, 1}, mo22504l = {23, 28}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "param", "this"}, mo22507s = {"L$0", "L$1", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class GetOrderOnlineListUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetOrderOnlineListUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetOrderOnlineListUseCase$invoke$1(GetOrderOnlineListUseCase getOrderOnlineListUseCase, C11045c<? super GetOrderOnlineListUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = getOrderOnlineListUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.m172981invokegIAlus((GetOrderOnlineListUseCase.C37724a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
