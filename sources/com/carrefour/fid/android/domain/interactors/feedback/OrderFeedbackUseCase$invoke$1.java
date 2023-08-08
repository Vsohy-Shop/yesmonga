package com.carrefour.fid.android.domain.interactors.feedback;

import com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase", mo22502f = "OrderFeedbackUseCase.kt", mo22503i = {0, 1}, mo22504l = {22, 27}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "feedback"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderFeedbackUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderFeedbackUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderFeedbackUseCase$invoke$1(OrderFeedbackUseCase orderFeedbackUseCase, C11045c<? super OrderFeedbackUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = orderFeedbackUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.m172967invokegIAlus((OrderFeedbackUseCase.C37685a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
