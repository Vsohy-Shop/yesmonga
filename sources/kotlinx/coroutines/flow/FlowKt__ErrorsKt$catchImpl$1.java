package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", mo22502f = "Errors.kt", mo22503i = {0}, mo22504l = {156}, mo22505m = "catchImpl", mo22506n = {"fromDownstream"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ErrorsKt$catchImpl$1(C11045c<? super FlowKt__ErrorsKt$catchImpl$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C11909g.m47497v((C11907e) null, (C11908f) null, this);
    }
}
