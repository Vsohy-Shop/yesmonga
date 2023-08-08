package kotlinx.coroutines.flow.internal;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {
    @C12579k

    /* renamed from: e */
    public final C11305q<C11908f<? super R>, T, C11045c<? super C11079d2>, Object> f29480e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelFlowTransformLatest(C11305q qVar, C11907e eVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, eVar, (i2 & 4) != 0 ? EmptyCoroutineContext.f28243a : coroutineContext, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @C12579k
    /* renamed from: j */
    public ChannelFlow<R> mo24083j(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f29480e, this.f29479d, coroutineContext, i, bufferOverflow);
    }

    @C12580l
    /* renamed from: s */
    public Object mo24237s(@C12579k C11908f<? super R> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new ChannelFlowTransformLatest$flowCollect$3(this, fVar, (C11045c<? super ChannelFlowTransformLatest$flowCollect$3>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    public ChannelFlowTransformLatest(@C12579k C11305q<? super C11908f<? super R>, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar, @C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        super(eVar, coroutineContext, i, bufferOverflow);
        this.f29480e = qVar;
    }
}
