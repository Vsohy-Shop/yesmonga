package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.BroadcastChannelImpl", mo22502f = "BroadcastChannel.kt", mo22503i = {0, 0}, mo22504l = {230}, mo22505m = "send", mo22506n = {"this", "element"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BroadcastChannelImpl$send$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BroadcastChannelImpl<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$send$1(BroadcastChannelImpl<E> broadcastChannelImpl, C11045c<? super BroadcastChannelImpl$send$1> cVar) {
        super(cVar);
        this.this$0 = broadcastChannelImpl;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo23757h0(null, this);
    }
}
