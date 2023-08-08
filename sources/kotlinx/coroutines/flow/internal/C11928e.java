package kotlinx.coroutines.flow.internal;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.flow.internal.e */
public final class C11928e<T> extends ChannelFlowOperator<T, T> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11928e(C11907e eVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i2 & 2) != 0 ? EmptyCoroutineContext.f28243a : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @C12579k
    /* renamed from: j */
    public ChannelFlow<T> mo24083j(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        return new C11928e(this.f29479d, coroutineContext, i, bufferOverflow);
    }

    @C12579k
    /* renamed from: k */
    public C11907e<T> mo24224k() {
        return this.f29479d;
    }

    @C12580l
    /* renamed from: s */
    public Object mo24237s(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = this.f29479d.collect(fVar, cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }

    public C11928e(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        super(eVar, coroutineContext, i, bufferOverflow);
    }
}
