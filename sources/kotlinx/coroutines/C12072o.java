package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.o */
public interface C12072o<T> extends C11045c<T> {

    /* renamed from: kotlinx.coroutines.o$a */
    public static final class C12073a {
        /* renamed from: a */
        public static /* synthetic */ boolean m48184a(C12072o oVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return oVar.mo24535c(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m48185b(C12072o oVar, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return oVar.mo24541p(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    /* renamed from: C */
    void mo24529C(@C12579k C11300l<? super Throwable, C11079d2> lVar);

    @C12177y1
    @C12580l
    /* renamed from: K */
    Object mo24530K(@C12579k Throwable th);

    @C12095s1
    /* renamed from: N */
    void mo24531N(@C12579k CoroutineDispatcher coroutineDispatcher, @C12579k Throwable th);

    @C12095s1
    /* renamed from: O */
    void mo24532O(T t, @C12580l C11300l<? super Throwable, C11079d2> lVar);

    @C12177y1
    @C12580l
    /* renamed from: a0 */
    Object mo24533a0(T t, @C12580l Object obj, @C12580l C11300l<? super Throwable, C11079d2> lVar);

    @C12095s1
    /* renamed from: b0 */
    void mo24534b0(@C12579k CoroutineDispatcher coroutineDispatcher, T t);

    /* renamed from: c */
    boolean mo24535c(@C12580l Throwable th);

    /* renamed from: d */
    boolean mo24536d();

    @C12177y1
    /* renamed from: e0 */
    void mo24537e0();

    boolean isCancelled();

    /* renamed from: j */
    boolean mo24539j();

    @C12177y1
    /* renamed from: o0 */
    void mo24540o0(@C12579k Object obj);

    @C12177y1
    @C12580l
    /* renamed from: p */
    Object mo24541p(T t, @C12580l Object obj);
}
