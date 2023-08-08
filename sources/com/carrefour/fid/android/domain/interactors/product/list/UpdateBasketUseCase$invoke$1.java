package com.carrefour.fid.android.domain.interactors.product.list;

import com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase", mo22502f = "UpdateBasketUseCase.kt", mo22503i = {0, 0}, mo22504l = {15, 18}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "param"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UpdateBasketUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateBasketUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateBasketUseCase$invoke$1(UpdateBasketUseCase updateBasketUseCase, C11045c<? super UpdateBasketUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = updateBasketUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.m172990invokegIAlus((UpdateBasketUseCase.C37767a) null, this);
        return c == C11063b.m42612h() ? c : Result.m38701a(c);
    }
}
