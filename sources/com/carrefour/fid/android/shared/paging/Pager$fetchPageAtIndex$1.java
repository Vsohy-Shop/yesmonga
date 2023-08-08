package com.carrefour.fid.android.shared.paging;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.paging.Pager", mo22502f = "Pager.kt", mo22503i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, mo22504l = {100, 107}, mo22505m = "fetchPageAtIndex", mo22506n = {"this", "previousResult", "pageIndex", "retry", "currentIndex", "this", "previousResult", "pageIndex", "retry", "currentIndex"}, mo22507s = {"L$0", "L$1", "I$0", "Z$0", "I$1", "L$0", "L$1", "I$0", "Z$0", "I$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class Pager$fetchPageAtIndex$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Pager<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pager$fetchPageAtIndex$1(Pager<Key, Value> pager, C11045c<? super Pager$fetchPageAtIndex$1> cVar) {
        super(cVar);
        this.this$0 = pager;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo83904h(0, false, this);
    }
}
