package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.BufferedChannel", mo22502f = "BufferedChannel.kt", mo22503i = {0, 0, 0, 0}, mo22504l = {3056}, mo22505m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", mo22506n = {"this", "segment", "index", "r"}, mo22507s = {"L$0", "L$1", "I$0", "J$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, C11045c<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> cVar) {
        super(cVar);
        this.this$0 = bufferedChannel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object x = this.this$0.mo23826d1((C11754l) null, 0, 0, this);
        return x == C11063b.m42612h() ? x : C11749j.m46631b(x);
    }
}
