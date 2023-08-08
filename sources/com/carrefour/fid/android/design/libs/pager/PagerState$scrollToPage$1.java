package com.carrefour.fid.android.design.libs.pager;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.design.libs.pager.PagerState", mo22502f = "PagerState.kt", mo22503i = {0, 0, 1}, mo22504l = {248, 252}, mo22505m = "scrollToPage", mo22506n = {"this", "pageOffset", "this"}, mo22507s = {"L$0", "F$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PagerState$scrollToPage$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$1(PagerState pagerState, C11045c<? super PagerState$scrollToPage$1> cVar) {
        super(cVar);
        this.this$0 = pagerState;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo114103D(0, 0.0f, this);
    }
}
