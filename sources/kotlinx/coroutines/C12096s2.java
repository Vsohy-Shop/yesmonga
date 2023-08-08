package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@C12177y1
/* renamed from: kotlinx.coroutines.s2 */
public interface C12096s2 extends C11723c2 {

    /* renamed from: kotlinx.coroutines.s2$a */
    public static final class C12097a {
        /* renamed from: b */
        public static <R> R m48324b(@C12579k C12096s2 s2Var, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return C11723c2.C11724a.m46186d(s2Var, r, pVar);
        }

        @C12580l
        /* renamed from: c */
        public static <E extends CoroutineContext.C11040a> E m48325c(@C12579k C12096s2 s2Var, @C12579k CoroutineContext.C11042b<E> bVar) {
            return C11723c2.C11724a.m46187e(s2Var, bVar);
        }

        @C12579k
        /* renamed from: d */
        public static CoroutineContext m48326d(@C12579k C12096s2 s2Var, @C12579k CoroutineContext.C11042b<?> bVar) {
            return C11723c2.C11724a.m46190h(s2Var, bVar);
        }

        @C12579k
        /* renamed from: e */
        public static CoroutineContext m48327e(@C12579k C12096s2 s2Var, @C12579k CoroutineContext coroutineContext) {
            return C11723c2.C11724a.m46191i(s2Var, coroutineContext);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @C12579k
        /* renamed from: f */
        public static C11723c2 m48328f(@C12579k C12096s2 s2Var, @C12579k C11723c2 c2Var) {
            return C11723c2.C11724a.m46192j(s2Var, c2Var);
        }
    }

    @C12177y1
    @C12579k
    /* renamed from: J */
    CancellationException mo23601J();
}
