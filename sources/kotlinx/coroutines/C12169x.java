package kotlinx.coroutines;

import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12154u0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.x */
public interface C12169x<T> extends C12154u0<T> {

    /* renamed from: kotlinx.coroutines.x$a */
    public static final class C12170a {
        /* renamed from: b */
        public static <T, R> R m48741b(@C12579k C12169x<T> xVar, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return C12154u0.C12155a.m48709b(xVar, r, pVar);
        }

        @C12580l
        /* renamed from: c */
        public static <T, E extends CoroutineContext.C11040a> E m48742c(@C12579k C12169x<T> xVar, @C12579k CoroutineContext.C11042b<E> bVar) {
            return C12154u0.C12155a.m48710c(xVar, bVar);
        }

        @C12579k
        /* renamed from: d */
        public static <T> CoroutineContext m48743d(@C12579k C12169x<T> xVar, @C12579k CoroutineContext.C11042b<?> bVar) {
            return C12154u0.C12155a.m48711d(xVar, bVar);
        }

        @C12579k
        /* renamed from: e */
        public static <T> CoroutineContext m48744e(@C12579k C12169x<T> xVar, @C12579k CoroutineContext coroutineContext) {
            return C12154u0.C12155a.m48712e(xVar, coroutineContext);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @C12579k
        /* renamed from: f */
        public static <T> C11723c2 m48745f(@C12579k C12169x<T> xVar, @C12579k C11723c2 c2Var) {
            return C12154u0.C12155a.m48713f(xVar, c2Var);
        }
    }

    /* renamed from: G */
    boolean mo24789G(T t);

    /* renamed from: i */
    boolean mo24790i(@C12579k Throwable th);
}
