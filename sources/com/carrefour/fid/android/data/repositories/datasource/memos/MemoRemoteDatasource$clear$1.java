package com.carrefour.fid.android.data.repositories.datasource.memos;

import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource", mo22502f = "MemoRemoteDatasource.kt", mo22503i = {}, mo22504l = {79}, mo22505m = "clear-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MemoRemoteDatasource$clear$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MemoRemoteDatasource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoRemoteDatasource$clear$1(MemoRemoteDatasource memoRemoteDatasource, C11045c<? super MemoRemoteDatasource$clear$1> cVar) {
        super(cVar);
        this.this$0 = memoRemoteDatasource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.mo111596g((String) null, (List<String>) null, this);
        return g == C11063b.m42612h() ? g : Result.m38701a(g);
    }
}
