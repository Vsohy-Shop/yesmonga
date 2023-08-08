package kotlinx.coroutines.channels;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.C12176y0;
import kotlinx.coroutines.internal.C12007n0;
import kotlinx.coroutines.selects.C12128g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.channels.t */
public interface C11763t<E> {

    /* renamed from: kotlinx.coroutines.channels.t$a */
    public static final class C11764a {
        /* renamed from: a */
        public static /* synthetic */ boolean m46772a(C11763t tVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return tVar.mo23756d0(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        @C12176y0
        /* renamed from: b */
        public static /* synthetic */ void m46773b() {
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @C11587t0(expression = "trySend(element).isSuccess", imports = {}))
        /* renamed from: c */
        public static <E> boolean m46774c(@C12579k C11763t<? super E> tVar, E e) {
            Object L = tVar.mo23751L(e);
            if (C11749j.m46642m(L)) {
                return true;
            }
            Throwable f = C11749j.m46635f(L);
            if (f == null) {
                return false;
            }
            throw C12007n0.m47912o(f);
        }
    }

    /* renamed from: H */
    void mo23779H(@C12579k C11300l<? super Throwable, C11079d2> lVar);

    @C12579k
    /* renamed from: L */
    Object mo23751L(E e);

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @C11587t0(expression = "trySend(element).isSuccess", imports = {}))
    /* renamed from: M */
    boolean mo23791M(E e);

    /* renamed from: d0 */
    boolean mo23756d0(@C12580l Throwable th);

    @C12579k
    /* renamed from: h */
    C12128g<E, C11763t<E>> mo23833h();

    @C12580l
    /* renamed from: h0 */
    Object mo23757h0(E e, @C12579k C11045c<? super C11079d2> cVar);

    /* renamed from: i0 */
    boolean mo23758i0();
}
