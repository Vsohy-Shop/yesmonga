package kotlinx.coroutines.flow.internal;

import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,143:1\n106#2:144\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n86#1:144\n*E\n"})
public final class CombineKt {

    @C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n1#1,112:1\n87#2:113\n142#2:114\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$a */
    public static final class C11915a implements C11907e<R> {

        /* renamed from: a */
        public final /* synthetic */ C11907e f29486a;

        /* renamed from: b */
        public final /* synthetic */ C11907e f29487b;

        /* renamed from: c */
        public final /* synthetic */ C11305q f29488c;

        public C11915a(C11907e eVar, C11907e eVar2, C11305q qVar) {
            this.f29486a = eVar;
            this.f29487b = eVar2;
            this.f29488c = qVar;
        }

        @C12580l
        public Object collect(@C12579k C11908f<? super R> fVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object g = C12079p0.m48266g(new CombineKt$zipImpl$1$1(fVar, this.f29486a, this.f29487b, this.f29488c, (C11045c<? super CombineKt$zipImpl$1$1>) null), cVar);
            if (g == C11063b.m42612h()) {
                return g;
            }
            return C11079d2.f28267a;
        }
    }

    @C12580l
    @C11532s0
    /* renamed from: a */
    public static final <R, T> Object m47551a(@C12579k C11908f<? super R> fVar, @C12579k C11907e<? extends T>[] eVarArr, @C12579k C11289a<T[]> aVar, @C12579k C11305q<? super C11908f<? super R>, ? super T[], ? super C11045c<? super C11079d2>, ? extends Object> qVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = FlowCoroutineKt.m47556a(new CombineKt$combineInternal$2(eVarArr, aVar, qVar, fVar, (C11045c<? super CombineKt$combineInternal$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: b */
    public static final <T1, T2, R> C11907e<R> m47552b(@C12579k C11907e<? extends T1> eVar, @C12579k C11907e<? extends T2> eVar2, @C12579k C11305q<? super T1, ? super T2, ? super C11045c<? super R>, ? extends Object> qVar) {
        return new C11915a(eVar2, eVar, qVar);
    }
}
