package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.TickerChannelsKt", mo22502f = "TickerChannels.kt", mo22503i = {0, 0, 1, 1, 2, 2}, mo22504l = {106, 108, 109}, mo22505m = "fixedDelayTicker", mo22506n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, mo22507s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TickerChannelsKt$fixedDelayTicker$1(C11045c<? super TickerChannelsKt$fixedDelayTicker$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TickerChannelsKt.m46555c(0, 0, (C11763t<? super C11079d2>) null, this);
    }
}
