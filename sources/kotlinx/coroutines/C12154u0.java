package kotlinx.coroutines;

import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.selects.C12126e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.u0 */
public interface C12154u0<T> extends C11723c2 {

    /* renamed from: kotlinx.coroutines.u0$a */
    public static final class C12155a {
        /* renamed from: b */
        public static <T, R> R m48709b(@C12579k C12154u0<? extends T> u0Var, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return C11723c2.C11724a.m46186d(u0Var, r, pVar);
        }

        @C12580l
        /* renamed from: c */
        public static <T, E extends CoroutineContext.C11040a> E m48710c(@C12579k C12154u0<? extends T> u0Var, @C12579k CoroutineContext.C11042b<E> bVar) {
            return C11723c2.C11724a.m46187e(u0Var, bVar);
        }

        @C12579k
        /* renamed from: d */
        public static <T> CoroutineContext m48711d(@C12579k C12154u0<? extends T> u0Var, @C12579k CoroutineContext.C11042b<?> bVar) {
            return C11723c2.C11724a.m46190h(u0Var, bVar);
        }

        @C12579k
        /* renamed from: e */
        public static <T> CoroutineContext m48712e(@C12579k C12154u0<? extends T> u0Var, @C12579k CoroutineContext coroutineContext) {
            return C11723c2.C11724a.m46191i(u0Var, coroutineContext);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @C12579k
        /* renamed from: f */
        public static <T> C11723c2 m48713f(@C12579k C12154u0<? extends T> u0Var, @C12579k C11723c2 c2Var) {
            return C11723c2.C11724a.m46192j(u0Var, c2Var);
        }
    }

    @C12579k
    /* renamed from: R */
    C12126e<T> mo24777R();

    @C12095s1
    /* renamed from: n */
    T mo24778n();

    @C12580l
    @C12095s1
    /* renamed from: s */
    Throwable mo24779s();

    @C12580l
    /* renamed from: v */
    Object mo24780v(@C12579k C11045c<? super T> cVar);
}
