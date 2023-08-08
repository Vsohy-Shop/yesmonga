package com.carrefour.fid.android.data.repositories.datasource.memos;

import com.carrefour.fid.android.core.type.C36368a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource", mo22502f = "MemoLocalDatasource.kt", mo22503i = {0, 0, 0}, mo22504l = {11, 18}, mo22505m = "add", mo22506n = {"this", "type", "value"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MemoLocalDatasource$add$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MemoLocalDatasource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoLocalDatasource$add$1(MemoLocalDatasource memoLocalDatasource, C11045c<? super MemoLocalDatasource$add$1> cVar) {
        super(cVar);
        this.this$0 = memoLocalDatasource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo111589b((C36368a) null, (String) null, this);
    }
}
