package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.BufferedChannel", mo22502f = "BufferedChannel.kt", mo22503i = {}, mo22504l = {739}, mo22505m = "receiveCatching-JP2dKIU$suspendImpl", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel<E> bufferedChannel, C11045c<? super BufferedChannel$receiveCatching$1> cVar) {
        super(cVar);
        this.this$0 = bufferedChannel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c1 = BufferedChannel.m46234c1(this.this$0, this);
        return c1 == C11063b.m42612h() ? c1 : C11749j.m46631b(c1);
    }
}
