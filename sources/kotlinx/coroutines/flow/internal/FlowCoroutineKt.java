package kotlinx.coroutines.flow.internal;

import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.intrinsics.C12037b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFlowCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,63:1\n106#2:64\n*S KotlinDebug\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n50#1:64\n*E\n"})
public final class FlowCoroutineKt {

    @C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n1#1,112:1\n51#2,2:113\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.internal.FlowCoroutineKt$a */
    public static final class C11923a implements C11907e<R> {

        /* renamed from: a */
        public final /* synthetic */ C11305q f29498a;

        public C11923a(C11305q qVar) {
            this.f29498a = qVar;
        }

        @C12580l
        public Object collect(@C12579k C11908f<? super R> fVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object a = FlowCoroutineKt.m47556a(new FlowCoroutineKt$scopedFlow$1$1(this.f29498a, fVar, (C11045c<? super FlowCoroutineKt$scopedFlow$1$1>) null), cVar);
            if (a == C11063b.m42612h()) {
                return a;
            }
            return C11079d2.f28267a;
        }
    }

    @C12580l
    /* renamed from: a */
    public static final <R> Object m47556a(@C12579k @C10863b C11304p<? super C12074o0, ? super C11045c<? super R>, ? extends Object> pVar, @C12579k C11045c<? super R> cVar) {
        C11930g gVar = new C11930g(cVar.getContext(), cVar);
        Object e = C12037b.m48053e(gVar, gVar, pVar);
        if (e == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return e;
    }

    @C12579k
    /* renamed from: b */
    public static final <R> C11907e<R> m47557b(@C12579k @C10863b C11305q<? super C12074o0, ? super C11908f<? super R>, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        return new C11923a(qVar);
    }
}
