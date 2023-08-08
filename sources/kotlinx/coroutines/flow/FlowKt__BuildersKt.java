package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11471o;
import kotlin.sequences.C11559m;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11760r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,354:1\n106#2:355\n106#2:356\n106#2:357\n106#2:358\n106#2:359\n106#2:360\n106#2:361\n106#2:362\n106#2:363\n106#2:364\n106#2:365\n106#2:366\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n68#1:355\n82#1:356\n89#1:357\n98#1:358\n107#1:359\n122#1:360\n131#1:361\n153#1:362\n164#1:363\n175#1:364\n184#1:365\n193#1:366\n*E\n"})
public final /* synthetic */ class FlowKt__BuildersKt {

    @C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,112:1\n69#2,2:113\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$a */
    public static final class C11806a implements C11907e<T> {

        /* renamed from: a */
        public final /* synthetic */ C11289a f29282a;

        public C11806a(C11289a aVar) {
            this.f29282a = aVar;
        }

        @C12580l
        public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object emit = fVar.emit(this.f29282a.invoke(), cVar);
            if (emit == C11063b.m42612h()) {
                return emit;
            }
            return C11079d2.f28267a;
        }
    }

    @C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,112:1\n136#2,2:113\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$b */
    public static final class C11807b implements C11907e<T> {

        /* renamed from: a */
        public final /* synthetic */ Object f29283a;

        public C11807b(Object obj) {
            this.f29283a = obj;
        }

        @C12580l
        public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object emit = fVar.emit(this.f29283a, cVar);
            if (emit == C11063b.m42612h()) {
                return emit;
            }
            return C11079d2.f28267a;
        }
    }

    @C12579k
    /* renamed from: a */
    public static final <T> C11907e<T> m46984a(@C12579k Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    @C12579k
    /* renamed from: b */
    public static final <T> C11907e<T> m46985b(@C12579k Iterator<? extends T> it) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    @C12579k
    /* renamed from: c */
    public static final <T> C11907e<T> m46986c(@C12579k C11289a<? extends T> aVar) {
        return new C11806a(aVar);
    }

    @C12579k
    /* renamed from: d */
    public static final <T> C11907e<T> m46987d(@C12579k C11300l<? super C11045c<? super T>, ? extends Object> lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(lVar);
    }

    @C12579k
    /* renamed from: e */
    public static final C11907e<Integer> m46988e(@C12579k C11466l lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(lVar);
    }

    @C12579k
    /* renamed from: f */
    public static final C11907e<Long> m46989f(@C12579k C11471o oVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(oVar);
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C11907e<T> m46990g(@C12579k C11559m<? extends T> mVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(mVar);
    }

    @C12579k
    /* renamed from: h */
    public static final C11907e<Integer> m46991h(@C12579k int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    @C12579k
    /* renamed from: i */
    public static final C11907e<Long> m46992i(@C12579k long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    @C12579k
    /* renamed from: j */
    public static final <T> C11907e<T> m46993j(@C12579k T[] tArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    @C12579k
    /* renamed from: k */
    public static final <T> C11907e<T> m46994k(@C12579k @C10863b C11304p<? super C11760r<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return new CallbackFlowBuilder(pVar, (CoroutineContext) null, 0, (BufferOverflow) null, 14, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: l */
    public static final <T> C11907e<T> m46995l(@C12579k @C10863b C11304p<? super C11760r<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return new C11905c(pVar, (CoroutineContext) null, 0, (BufferOverflow) null, 14, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: m */
    public static final <T> C11907e<T> m46996m() {
        return C11906d.f29467a;
    }

    @C12579k
    /* renamed from: n */
    public static final <T> C11907e<T> m46997n(@C12579k @C10863b C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return new C11943m(pVar);
    }

    @C12579k
    /* renamed from: o */
    public static final <T> C11907e<T> m46998o(T t) {
        return new C11807b(t);
    }

    @C12579k
    /* renamed from: p */
    public static final <T> C11907e<T> m46999p(@C12579k T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }
}
