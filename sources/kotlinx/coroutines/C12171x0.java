package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.C12164w0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12177y1
/* renamed from: kotlinx.coroutines.x0 */
public interface C12171x0 extends C12164w0 {

    /* renamed from: kotlinx.coroutines.x0$a */
    public static final class C12172a {
        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @C12580l
        /* renamed from: a */
        public static Object m48747a(@C12579k C12171x0 x0Var, long j, @C12579k C11045c<? super C11079d2> cVar) {
            Object a = C12164w0.C12165a.m48733a(x0Var, j, cVar);
            return a == C11063b.m42612h() ? a : C11079d2.f28267a;
        }

        @C12579k
        /* renamed from: b */
        public static C11962g1 m48748b(@C12579k C12171x0 x0Var, long j, @C12579k Runnable runnable, @C12579k CoroutineContext coroutineContext) {
            return C12164w0.C12165a.m48734b(x0Var, j, runnable, coroutineContext);
        }
    }

    @C12579k
    /* renamed from: I */
    String mo24791I(long j);
}
