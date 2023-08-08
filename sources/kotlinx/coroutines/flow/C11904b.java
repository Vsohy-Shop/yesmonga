package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.C11394v;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.C11937m;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.b */
public final class C11904b<T> extends ChannelFlow<T> {
    @C12579k

    /* renamed from: f */
    public static final AtomicIntegerFieldUpdater f29463f = AtomicIntegerFieldUpdater.newUpdater(C11904b.class, "consumed");
    @C11394v
    private volatile int consumed;
    @C12579k

    /* renamed from: d */
    public final ReceiveChannel<T> f29464d;

    /* renamed from: e */
    public final boolean f29465e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11904b(ReceiveChannel receiveChannel, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(receiveChannel, z, (i2 & 4) != 0 ? EmptyCoroutineContext.f28243a : coroutineContext, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (this.f29471b == -3) {
            mo24226o();
            Object a = FlowKt__ChannelsKt.m47004e(fVar, this.f29464d, this.f29465e, cVar);
            if (a == C11063b.m42612h()) {
                return a;
            }
            return C11079d2.f28267a;
        }
        Object collect = super.collect(fVar, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: g */
    public String mo24223g() {
        return "channel=" + this.f29464d;
    }

    @C12580l
    /* renamed from: i */
    public Object mo24082i(@C12579k C11760r<? super T> rVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = FlowKt__ChannelsKt.m47004e(new C11937m(rVar), this.f29464d, this.f29465e, cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: j */
    public ChannelFlow<T> mo24083j(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        return new C11904b(this.f29464d, this.f29465e, coroutineContext, i, bufferOverflow);
    }

    @C12579k
    /* renamed from: k */
    public C11907e<T> mo24224k() {
        return new C11904b(this.f29464d, this.f29465e, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: n */
    public ReceiveChannel<T> mo24225n(@C12579k C12074o0 o0Var) {
        mo24226o();
        if (this.f29471b == -3) {
            return this.f29464d;
        }
        return super.mo24225n(o0Var);
    }

    /* renamed from: o */
    public final void mo24226o() {
        if (this.f29465e) {
            boolean z = true;
            if (f29463f.getAndSet(this, 1) != 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    public C11904b(@C12579k ReceiveChannel<? extends T> receiveChannel, boolean z, @C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f29464d = receiveChannel;
        this.f29465e = z;
        this.consumed = 0;
    }
}
