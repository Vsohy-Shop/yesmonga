package com.carrefour.fid.android.data.repositories;

import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.MemoRepository", mo22502f = "MemoRepository.kt", mo22503i = {0, 0}, mo22504l = {36, 37}, mo22505m = "addList-gIAlu-s", mo22506n = {"this", "labels"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MemoRepository$addList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MemoRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoRepository$addList$1(MemoRepository memoRepository, C11045c<? super MemoRepository$addList$1> cVar) {
        super(cVar);
        this.this$0 = memoRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.mo111517d((List<String>) null, this);
        return d == C11063b.m42612h() ? d : Result.m38701a(d);
    }
}
