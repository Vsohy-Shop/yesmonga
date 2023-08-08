package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12177y1
/* renamed from: kotlinx.coroutines.w0 */
public interface C12164w0 {

    @C11363r0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n*L\n30#1:163,11\n*E\n"})
    /* renamed from: kotlinx.coroutines.w0$a */
    public static final class C12165a {
        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @C12580l
        /* renamed from: a */
        public static Object m48733a(@C12579k C12164w0 w0Var, long j, @C12579k C11045c<? super C11079d2> cVar) {
            if (j <= 0) {
                return C11079d2.f28267a;
            }
            C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
            pVar.mo24537e0();
            w0Var.mo23711p(j, pVar);
            Object y = pVar.mo24572y();
            if (y == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
            if (y == C11063b.m42612h()) {
                return y;
            }
            return C11079d2.f28267a;
        }

        @C12579k
        /* renamed from: b */
        public static C11962g1 m48734b(@C12579k C12164w0 w0Var, long j, @C12579k Runnable runnable, @C12579k CoroutineContext coroutineContext) {
            return C12144t0.m48662a().mo23705C(j, runnable, coroutineContext);
        }
    }

    @C12579k
    /* renamed from: C */
    C11962g1 mo23705C(long j, @C12579k Runnable runnable, @C12579k CoroutineContext coroutineContext);

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @C12580l
    /* renamed from: N */
    Object mo23721N(long j, @C12579k C11045c<? super C11079d2> cVar);

    /* renamed from: p */
    void mo23711p(long j, @C12579k C12072o<? super C11079d2> oVar);
}
