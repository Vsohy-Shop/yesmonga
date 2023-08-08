package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,245:1\n95#2,5:246\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n226#1:246,5\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.internal.d */
public final class C11927d {
    @C12579k
    /* renamed from: b */
    public static final <T> ChannelFlow<T> m47584b(@C12579k C11907e<? extends T> eVar) {
        ChannelFlow<T> channelFlow = eVar instanceof ChannelFlow ? (ChannelFlow) eVar : null;
        return channelFlow == null ? new C11928e(eVar, (CoroutineContext) null, 0, (BufferOverflow) null, 14, (DefaultConstructorMarker) null) : channelFlow;
    }

    /* JADX INFO: finally extract failed */
    @C12580l
    /* renamed from: c */
    public static final <T, V> Object m47585c(@C12579k CoroutineContext coroutineContext, V v, @C12579k Object obj, @C12579k C11304p<? super V, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        Object c = ThreadContextKt.m47768c(coroutineContext, obj);
        try {
            Object invoke = ((C11304p) C11370u0.m43701q(pVar, 2)).invoke(v, new C11938n(cVar, coroutineContext));
            ThreadContextKt.m47766a(coroutineContext, c);
            if (invoke == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
            return invoke;
        } catch (Throwable th) {
            ThreadContextKt.m47766a(coroutineContext, c);
            throw th;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ Object m47586d(CoroutineContext coroutineContext, Object obj, Object obj2, C11304p pVar, C11045c cVar, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ThreadContextKt.m47767b(coroutineContext);
        }
        return m47585c(coroutineContext, obj, obj2, pVar, cVar);
    }

    /* renamed from: e */
    public static final <T> C11908f<T> m47587e(C11908f<? super T> fVar, CoroutineContext coroutineContext) {
        boolean z;
        if (fVar instanceof C11937m) {
            z = true;
        } else {
            z = fVar instanceof C11935k;
        }
        if (z) {
            return fVar;
        }
        return new UndispatchedContextCollector(fVar, coroutineContext);
    }
}
