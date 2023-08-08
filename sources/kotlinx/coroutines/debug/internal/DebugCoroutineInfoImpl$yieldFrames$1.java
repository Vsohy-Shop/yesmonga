package kotlinx.coroutines.debug.internal;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.sequences.C11561o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", mo22502f = "DebugCoroutineInfoImpl.kt", mo22503i = {0, 0, 0}, mo22504l = {171}, mo22505m = "yieldFrames", mo22506n = {"this", "$this$yieldFrames", "frame"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DebugCoroutineInfoImpl$yieldFrames$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DebugCoroutineInfoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$yieldFrames$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, C11045c<? super DebugCoroutineInfoImpl$yieldFrames$1> cVar) {
        super(cVar);
        this.this$0 = debugCoroutineInfoImpl;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo23993k((C11561o<? super StackTraceElement>) null, (C11066c) null, this);
    }
}
