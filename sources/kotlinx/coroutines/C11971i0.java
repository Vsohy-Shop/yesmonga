package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11726c3;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12095s1
@C12176y0
/* renamed from: kotlinx.coroutines.i0 */
public interface C11971i0<S> extends C11726c3<S> {

    /* renamed from: kotlinx.coroutines.i0$a */
    public static final class C11972a {
        /* renamed from: a */
        public static <S, R> R m47711a(@C12579k C11971i0<S> i0Var, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return C11726c3.C11727a.m46195a(i0Var, r, pVar);
        }

        @C12580l
        /* renamed from: b */
        public static <S, E extends CoroutineContext.C11040a> E m47712b(@C12579k C11971i0<S> i0Var, @C12579k CoroutineContext.C11042b<E> bVar) {
            return C11726c3.C11727a.m46196b(i0Var, bVar);
        }

        @C12579k
        /* renamed from: c */
        public static <S> CoroutineContext m47713c(@C12579k C11971i0<S> i0Var, @C12579k CoroutineContext.C11042b<?> bVar) {
            return C11726c3.C11727a.m46197c(i0Var, bVar);
        }

        @C12579k
        /* renamed from: d */
        public static <S> CoroutineContext m47714d(@C12579k C11971i0<S> i0Var, @C12579k CoroutineContext coroutineContext) {
            return C11726c3.C11727a.m46198d(i0Var, coroutineContext);
        }
    }

    @C12579k
    /* renamed from: E */
    C11971i0<S> mo24294E();

    @C12579k
    /* renamed from: q */
    CoroutineContext mo24295q(@C12579k CoroutineContext.C11040a aVar);
}
