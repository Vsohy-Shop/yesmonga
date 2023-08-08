package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.c3 */
public interface C11726c3<S> extends CoroutineContext.C11040a {

    /* renamed from: kotlinx.coroutines.c3$a */
    public static final class C11727a {
        /* renamed from: a */
        public static <S, R> R m46195a(@C12579k C11726c3<S> c3Var, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return CoroutineContext.C11040a.C11041a.m42563a(c3Var, r, pVar);
        }

        @C12580l
        /* renamed from: b */
        public static <S, E extends CoroutineContext.C11040a> E m46196b(@C12579k C11726c3<S> c3Var, @C12579k CoroutineContext.C11042b<E> bVar) {
            return CoroutineContext.C11040a.C11041a.m42564b(c3Var, bVar);
        }

        @C12579k
        /* renamed from: c */
        public static <S> CoroutineContext m46197c(@C12579k C11726c3<S> c3Var, @C12579k CoroutineContext.C11042b<?> bVar) {
            return CoroutineContext.C11040a.C11041a.m42565c(c3Var, bVar);
        }

        @C12579k
        /* renamed from: d */
        public static <S> CoroutineContext m46198d(@C12579k C11726c3<S> c3Var, @C12579k CoroutineContext coroutineContext) {
            return CoroutineContext.C11040a.C11041a.m42566d(c3Var, coroutineContext);
        }
    }

    /* renamed from: F */
    void mo15332F(@C12579k CoroutineContext coroutineContext, S s);

    /* renamed from: p0 */
    S mo15336p0(@C12579k CoroutineContext coroutineContext);
}
