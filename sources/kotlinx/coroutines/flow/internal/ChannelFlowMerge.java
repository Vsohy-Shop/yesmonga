package kotlinx.coroutines.flow.internal;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.sync.SemaphoreKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ChannelFlowMerge<T> extends ChannelFlow<T> {
    @C12579k

    /* renamed from: d */
    public final C11907e<C11907e<T>> f29473d;

    /* renamed from: e */
    public final int f29474e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelFlowMerge(C11907e eVar, int i, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, i, (i3 & 4) != 0 ? EmptyCoroutineContext.f28243a : coroutineContext, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @C12579k
    /* renamed from: g */
    public String mo24223g() {
        return "concurrency=" + this.f29474e;
    }

    @C12580l
    /* renamed from: i */
    public Object mo24082i(@C12579k C11760r<? super T> rVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = this.f29473d.collect(new ChannelFlowMerge$collectTo$2((C11723c2) cVar.getContext().mo7444b(C11723c2.f29067w0), SemaphoreKt.m48630b(this.f29474e, 0, 2, (Object) null), rVar, new C11937m(rVar)), cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: j */
    public ChannelFlow<T> mo24083j(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.f29473d, this.f29474e, coroutineContext, i, bufferOverflow);
    }

    @C12579k
    /* renamed from: n */
    public ReceiveChannel<T> mo24225n(@C12579k C12074o0 o0Var) {
        return ProduceKt.m46527c(o0Var, this.f29470a, this.f29471b, mo24230l());
    }

    public ChannelFlowMerge(@C12579k C11907e<? extends C11907e<? extends T>> eVar, int i, @C12579k CoroutineContext coroutineContext, int i2, @C12579k BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.f29473d = eVar;
        this.f29474e = i;
    }
}
