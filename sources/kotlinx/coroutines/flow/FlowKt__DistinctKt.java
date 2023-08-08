package kotlinx.coroutines.flow;

import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final /* synthetic */ class FlowKt__DistinctKt {
    @C12579k

    /* renamed from: a */
    public static final C11300l<Object, Object> f29304a = FlowKt__DistinctKt$defaultKeySelector$1.f29307f;
    @C12579k

    /* renamed from: b */
    public static final C11304p<Object, Object, Boolean> f29305b = FlowKt__DistinctKt$defaultAreEquivalent$1.f29306f;

    @C12579k
    /* renamed from: a */
    public static final <T> C11907e<T> m47047a(@C12579k C11907e<? extends T> eVar) {
        if (eVar instanceof C11952u) {
            return eVar;
        }
        return m47050d(eVar, f29304a, f29305b);
    }

    @C12579k
    /* renamed from: b */
    public static final <T> C11907e<T> m47048b(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super T, Boolean> pVar) {
        C11300l<Object, Object> lVar = f29304a;
        Intrinsics.checkNotNull(pVar, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return m47050d(eVar, lVar, (C11304p) C11370u0.m43701q(pVar, 2));
    }

    @C12579k
    /* renamed from: c */
    public static final <T, K> C11907e<T> m47049c(@C12579k C11907e<? extends T> eVar, @C12579k C11300l<? super T, ? extends K> lVar) {
        return m47050d(eVar, lVar, f29305b);
    }

    /* renamed from: d */
    public static final <T> C11907e<T> m47050d(C11907e<? extends T> eVar, C11300l<? super T, ? extends Object> lVar, C11304p<Object, Object, Boolean> pVar) {
        if (eVar instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) eVar;
            if (distinctFlowImpl.f29277b == lVar && distinctFlowImpl.f29278c == pVar) {
                return eVar;
            }
        }
        return new DistinctFlowImpl(eVar, lVar, pVar);
    }
}
