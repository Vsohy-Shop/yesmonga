package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary;

import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getMinimumAmountOrder$1;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getMinimumAmountOrder$1$1", mo22502f = "DeliverySummaryViewModel.kt", mo22503i = {0}, mo22504l = {92}, mo22505m = "emit", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DeliverySummaryViewModel$getMinimumAmountOrder$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeliverySummaryViewModel$getMinimumAmountOrder$1.C284351 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryViewModel$getMinimumAmountOrder$1$1$emit$1(DeliverySummaryViewModel$getMinimumAmountOrder$1.C284351 r1, C11045c<? super DeliverySummaryViewModel$getMinimumAmountOrder$1$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = r1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((String) null, (C11045c<? super C11079d2>) this);
    }
}
