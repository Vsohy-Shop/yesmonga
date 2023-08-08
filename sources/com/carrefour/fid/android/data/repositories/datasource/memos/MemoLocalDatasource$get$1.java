package com.carrefour.fid.android.data.repositories.datasource.memos;

import com.carrefour.fid.android.core.type.C36368a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource", mo22502f = "MemoLocalDatasource.kt", mo22503i = {0}, mo22504l = {47}, mo22505m = "get", mo22506n = {"type"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MemoLocalDatasource$get$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MemoLocalDatasource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoLocalDatasource$get$1(MemoLocalDatasource memoLocalDatasource, C11045c<? super MemoLocalDatasource$get$1> cVar) {
        super(cVar);
        this.this$0 = memoLocalDatasource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo111592f((C36368a) null, this);
    }
}
