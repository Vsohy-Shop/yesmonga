package kotlinx.coroutines.flow.internal;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11047d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    @C12579k
    @C11287e

    /* renamed from: d */
    public final C11907e<S> f29479d;

    public ChannelFlowOperator(@C12579k C11907e<? extends S> eVar, @C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f29479d = eVar;
    }

    /* renamed from: p */
    public static /* synthetic */ <S, T> Object m47539p(ChannelFlowOperator<S, T> channelFlowOperator, C11908f<? super T> fVar, C11045c<? super C11079d2> cVar) {
        if (channelFlowOperator.f29471b == -3) {
            CoroutineContext context = cVar.getContext();
            CoroutineContext d = CoroutineContextKt.m45900d(context, channelFlowOperator.f29470a);
            if (Intrinsics.areEqual((Object) d, (Object) context)) {
                Object s = channelFlowOperator.mo24237s(fVar, cVar);
                if (s == C11063b.m42612h()) {
                    return s;
                }
                return C11079d2.f28267a;
            }
            C11047d.C11049b bVar = C11047d.f28247u0;
            if (Intrinsics.areEqual((Object) d.mo7444b(bVar), (Object) context.mo7444b(bVar))) {
                Object r = channelFlowOperator.mo24236r(fVar, d, cVar);
                if (r == C11063b.m42612h()) {
                    return r;
                }
                return C11079d2.f28267a;
            }
        }
        Object collect = super.collect(fVar, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: q */
    public static /* synthetic */ <S, T> Object m47540q(ChannelFlowOperator<S, T> channelFlowOperator, C11760r<? super T> rVar, C11045c<? super C11079d2> cVar) {
        Object s = channelFlowOperator.mo24237s(new C11937m(rVar), cVar);
        return s == C11063b.m42612h() ? s : C11079d2.f28267a;
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        return m47539p(this, fVar, cVar);
    }

    @C12580l
    /* renamed from: i */
    public Object mo24082i(@C12579k C11760r<? super T> rVar, @C12579k C11045c<? super C11079d2> cVar) {
        return m47540q(this, rVar, cVar);
    }

    /* renamed from: r */
    public final Object mo24236r(C11908f<? super T> fVar, CoroutineContext coroutineContext, C11045c<? super C11079d2> cVar) {
        Object d = C11927d.m47586d(coroutineContext, C11927d.m47587e(fVar, cVar.getContext()), (Object) null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, (C11045c<? super ChannelFlowOperator$collectWithContextUndispatched$2>) null), cVar, 4, (Object) null);
        if (d == C11063b.m42612h()) {
            return d;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: s */
    public abstract Object mo24237s(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar);

    @C12579k
    public String toString() {
        return this.f29479d + " -> " + super.toString();
    }
}
