package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11322b0;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C11935k;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final /* synthetic */ class FlowKt__CollectKt {
    @C12580l
    /* renamed from: a */
    public static final Object m47007a(@C12579k C11907e<?> eVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = eVar.collect(C11935k.f29515a, cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    /* renamed from: b */
    public static final /* synthetic */ <T> Object m47008b(C11907e<? extends T> eVar, C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar, C11045c<? super C11079d2> cVar) {
        Object collect = eVar.collect(new FlowKt__CollectKt$collect$3(pVar), cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    /* renamed from: c */
    public static final /* synthetic */ <T> Object m47009c(C11907e<? extends T> eVar, C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar, C11045c<? super C11079d2> cVar) {
        FlowKt__CollectKt$collect$3 flowKt__CollectKt$collect$3 = new FlowKt__CollectKt$collect$3(pVar);
        C11322b0.m43482e(0);
        eVar.collect(flowKt__CollectKt$collect$3, cVar);
        C11322b0.m43482e(1);
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: d */
    public static final <T> Object m47010d(@C12579k C11907e<? extends T> eVar, @C12579k C11305q<? super Integer, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = eVar.collect(new FlowKt__CollectKt$collectIndexed$2(qVar), cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }

    /* renamed from: e */
    public static final <T> Object m47011e(C11907e<? extends T> eVar, C11305q<? super Integer, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar, C11045c<? super C11079d2> cVar) {
        FlowKt__CollectKt$collectIndexed$2 flowKt__CollectKt$collectIndexed$2 = new FlowKt__CollectKt$collectIndexed$2(qVar);
        C11322b0.m43482e(0);
        eVar.collect(flowKt__CollectKt$collectIndexed$2, cVar);
        C11322b0.m43482e(1);
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: f */
    public static final <T> Object m47012f(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object x = C11909g.m47503x(C11910h.m47515d(C11909g.m47418X0(eVar, pVar), 0, (BufferOverflow) null, 2, (Object) null), cVar);
        return x == C11063b.m42612h() ? x : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: g */
    public static final <T> Object m47013g(@C12579k C11908f<? super T> fVar, @C12579k C11907e<? extends T> eVar, @C12579k C11045c<? super C11079d2> cVar) {
        C11909g.m47477o0(fVar);
        Object collect = eVar.collect(fVar, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: h */
    public static final <T> C11723c2 m47014h(@C12579k C11907e<? extends T> eVar, @C12579k C12074o0 o0Var) {
        return C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new FlowKt__CollectKt$launchIn$1(eVar, (C11045c<? super FlowKt__CollectKt$launchIn$1>) null), 3, (Object) null);
    }
}
