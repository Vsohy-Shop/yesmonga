package kotlinx.coroutines;

import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.a0 */
public interface C11702a0 extends C11723c2 {

    /* renamed from: kotlinx.coroutines.a0$a */
    public static final class C11703a {
        /* renamed from: b */
        public static <R> R m46079b(@C12579k C11702a0 a0Var, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return C11723c2.C11724a.m46186d(a0Var, r, pVar);
        }

        @C12580l
        /* renamed from: c */
        public static <E extends CoroutineContext.C11040a> E m46080c(@C12579k C11702a0 a0Var, @C12579k CoroutineContext.C11042b<E> bVar) {
            return C11723c2.C11724a.m46187e(a0Var, bVar);
        }

        @C12579k
        /* renamed from: d */
        public static CoroutineContext m46081d(@C12579k C11702a0 a0Var, @C12579k CoroutineContext.C11042b<?> bVar) {
            return C11723c2.C11724a.m46190h(a0Var, bVar);
        }

        @C12579k
        /* renamed from: e */
        public static CoroutineContext m46082e(@C12579k C11702a0 a0Var, @C12579k CoroutineContext coroutineContext) {
            return C11723c2.C11724a.m46191i(a0Var, coroutineContext);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @C12579k
        /* renamed from: f */
        public static C11723c2 m46083f(@C12579k C11702a0 a0Var, @C12579k C11723c2 c2Var) {
            return C11723c2.C11724a.m46192j(a0Var, c2Var);
        }
    }

    /* renamed from: i */
    boolean mo23696i(@C12579k Throwable th);

    /* renamed from: k */
    boolean mo23697k();
}
