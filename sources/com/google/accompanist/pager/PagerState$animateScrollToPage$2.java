package com.google.accompanist.pager;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.google.accompanist.pager.PagerState", mo22502f = "PagerState.kt", mo22503i = {0, 0, 0, 1, 2, 2, 2, 3, 4, 4, 4, 4, 5}, mo22504l = {239, 244, 247, 255, 262, 274}, mo22505m = "animateScrollToPage", mo22506n = {"this", "page", "pageOffset", "this", "this", "page", "pageOffset", "this", "this", "page", "pageOffset", "currentSize", "this"}, mo22507s = {"L$0", "I$0", "F$0", "L$0", "L$0", "I$0", "F$0", "L$0", "L$0", "I$0", "F$0", "I$1", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PagerState$animateScrollToPage$2 extends ContinuationImpl {
    float F$0;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$2(PagerState pagerState, C11045c<? super PagerState$animateScrollToPage$2> cVar) {
        super(cVar);
        this.this$0 = pagerState;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo42008l(0, 0.0f, this);
    }
}
