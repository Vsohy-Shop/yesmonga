package com.carrefour.fid.android.domain.interactors.account.order;

import com.carrefour.fid.android.domain.interactors.account.order.GetOnlineOrderByIdUseCase;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.account.order.GetOnlineOrderByIdUseCase", mo22502f = "GetOnlineOrderByIdUseCase.kt", mo22503i = {}, mo22504l = {13}, mo22505m = "invoke-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class GetOnlineOrderByIdUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetOnlineOrderByIdUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetOnlineOrderByIdUseCase$invoke$1(GetOnlineOrderByIdUseCase getOnlineOrderByIdUseCase, C11045c<? super GetOnlineOrderByIdUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = getOnlineOrderByIdUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.m172932invokegIAlus((GetOnlineOrderByIdUseCase.C37524a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
