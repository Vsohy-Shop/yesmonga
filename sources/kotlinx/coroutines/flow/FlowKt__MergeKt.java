package kotlinx.coroutines.flow;

import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.C12145t1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.internal.C12016r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n53#2:219\n55#2:223\n53#2:224\n55#2:228\n50#3:220\n55#3:222\n50#3:225\n55#3:227\n106#4:221\n106#4:226\n106#4:229\n1#5:230\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n47#1:219\n47#1:223\n74#1:224\n74#1:228\n47#1:220\n47#1:222\n74#1:225\n74#1:227\n47#1:221\n74#1:226\n82#1:229\n*E\n"})
public final /* synthetic */ class FlowKt__MergeKt {

    /* renamed from: a */
    public static final int f29350a = C12016r0.m47945b(C11909g.f29468a, 16, 1, Integer.MAX_VALUE);

    @C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,112:1\n83#2,2:113\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$a */
    public static final class C11837a implements C11907e<T> {

        /* renamed from: a */
        public final /* synthetic */ C11907e f29351a;

        public C11837a(C11907e eVar) {
            this.f29351a = eVar;
        }

        @C12580l
        public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object collect = this.f29351a.collect(new FlowKt__MergeKt$flattenConcat$1$1(fVar), cVar);
            if (collect == C11063b.m42612h()) {
                return collect;
            }
            return C11079d2.f28267a;
        }
    }

    @C12095s1
    @C12579k
    /* renamed from: a */
    public static final <T, R> C11907e<R> m47085a(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11907e<? extends R>>, ? extends Object> pVar) {
        return C11909g.m47367G0(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(eVar, pVar));
    }

    @C12095s1
    @C12579k
    /* renamed from: b */
    public static final <T, R> C11907e<R> m47086b(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11304p<? super T, ? super C11045c<? super C11907e<? extends R>>, ? extends Object> pVar) {
        return C11909g.m47441d2(eVar, new FlowKt__MergeKt$flatMapLatest$1(pVar, (C11045c<? super FlowKt__MergeKt$flatMapLatest$1>) null));
    }

    @C12095s1
    @C12579k
    /* renamed from: c */
    public static final <T, R> C11907e<R> m47087c(@C12579k C11907e<? extends T> eVar, int i, @C12579k C11304p<? super T, ? super C11045c<? super C11907e<? extends R>>, ? extends Object> pVar) {
        return C11909g.m47370H0(new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(eVar, pVar), i);
    }

    /* renamed from: d */
    public static /* synthetic */ C11907e m47088d(C11907e eVar, int i, C11304p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = f29350a;
        }
        return C11909g.m47358D0(eVar, i, pVar);
    }

    @C12095s1
    @C12579k
    /* renamed from: e */
    public static final <T> C11907e<T> m47089e(@C12579k C11907e<? extends C11907e<? extends T>> eVar) {
        return new C11837a(eVar);
    }

    @C12095s1
    @C12579k
    /* renamed from: f */
    public static final <T> C11907e<T> m47090f(@C12579k C11907e<? extends C11907e<? extends T>> eVar, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i).toString());
        } else if (i == 1) {
            return C11909g.m47367G0(eVar);
        } else {
            return new ChannelFlowMerge(eVar, i, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ C11907e m47091g(C11907e eVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = f29350a;
        }
        return C11909g.m47370H0(eVar, i);
    }

    /* renamed from: h */
    public static final int m47092h() {
        return f29350a;
    }

    @C12145t1
    /* renamed from: i */
    public static /* synthetic */ void m47093i() {
    }

    @C12145t1
    /* renamed from: j */
    public static /* synthetic */ void m47094j() {
    }

    @C12095s1
    @C12579k
    /* renamed from: k */
    public static final <T, R> C11907e<R> m47095k(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11304p<? super T, ? super C11045c<? super R>, ? extends Object> pVar) {
        return C11909g.m47441d2(eVar, new FlowKt__MergeKt$mapLatest$1(pVar, (C11045c<? super FlowKt__MergeKt$mapLatest$1>) null));
    }

    @C12579k
    /* renamed from: l */
    public static final <T> C11907e<T> m47096l(@C12579k Iterable<? extends C11907e<? extends T>> iterable) {
        return new ChannelLimitedFlowMerge(iterable, (CoroutineContext) null, 0, (BufferOverflow) null, 14, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: m */
    public static final <T> C11907e<T> m47097m(@C12579k C11907e<? extends T>... eVarArr) {
        return C11909g.m47424Z0(ArraysKt___ArraysKt.m39672c6(eVarArr));
    }

    @C12095s1
    @C12579k
    /* renamed from: n */
    public static final <T, R> C11907e<R> m47098n(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11305q<? super C11908f<? super R>, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        return new ChannelFlowTransformLatest(qVar, eVar, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
    }
}
