package kotlinx.coroutines.flow.internal;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n95#1:101,2\n*E\n"})
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {
    @C12579k

    /* renamed from: d */
    public final Iterable<C11907e<T>> f29485d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelLimitedFlowMerge(Iterable iterable, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i2 & 2) != 0 ? EmptyCoroutineContext.f28243a : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @C12580l
    /* renamed from: i */
    public Object mo24082i(@C12579k C11760r<? super T> rVar, @C12579k C11045c<? super C11079d2> cVar) {
        C11937m mVar = new C11937m(rVar);
        for (C11907e<T> channelLimitedFlowMerge$collectTo$2$1 : this.f29485d) {
            C11723c2 unused = C12038j.m48061f(rVar, (CoroutineContext) null, (CoroutineStart) null, new ChannelLimitedFlowMerge$collectTo$2$1(channelLimitedFlowMerge$collectTo$2$1, mVar, (C11045c<? super ChannelLimitedFlowMerge$collectTo$2$1>) null), 3, (Object) null);
        }
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: j */
    public ChannelFlow<T> mo24083j(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.f29485d, coroutineContext, i, bufferOverflow);
    }

    @C12579k
    /* renamed from: n */
    public ReceiveChannel<T> mo24225n(@C12579k C12074o0 o0Var) {
        return ProduceKt.m46527c(o0Var, this.f29470a, this.f29471b, mo24230l());
    }

    public ChannelLimitedFlowMerge(@C12579k Iterable<? extends C11907e<? extends T>> iterable, @C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f29485d = iterable;
    }
}
