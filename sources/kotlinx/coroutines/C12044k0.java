package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.k0 */
public interface C12044k0 extends CoroutineContext.C11040a {
    @C12579k

    /* renamed from: v0 */
    public static final C12046b f29686v0 = C12046b.f29687a;

    /* renamed from: kotlinx.coroutines.k0$a */
    public static final class C12045a {
        /* renamed from: a */
        public static <R> R m48081a(@C12579k C12044k0 k0Var, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return CoroutineContext.C11040a.C11041a.m42563a(k0Var, r, pVar);
        }

        @C12580l
        /* renamed from: b */
        public static <E extends CoroutineContext.C11040a> E m48082b(@C12579k C12044k0 k0Var, @C12579k CoroutineContext.C11042b<E> bVar) {
            return CoroutineContext.C11040a.C11041a.m42564b(k0Var, bVar);
        }

        @C12579k
        /* renamed from: c */
        public static CoroutineContext m48083c(@C12579k C12044k0 k0Var, @C12579k CoroutineContext.C11042b<?> bVar) {
            return CoroutineContext.C11040a.C11041a.m42565c(k0Var, bVar);
        }

        @C12579k
        /* renamed from: d */
        public static CoroutineContext m48084d(@C12579k C12044k0 k0Var, @C12579k CoroutineContext coroutineContext) {
            return CoroutineContext.C11040a.C11041a.m42566d(k0Var, coroutineContext);
        }
    }

    /* renamed from: kotlinx.coroutines.k0$b */
    public static final class C12046b implements CoroutineContext.C11042b<C12044k0> {

        /* renamed from: a */
        public static final /* synthetic */ C12046b f29687a = new C12046b();
    }

    /* renamed from: P */
    void mo23719P(@C12579k CoroutineContext coroutineContext, @C12579k Throwable th);
}
