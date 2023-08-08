package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.sequences.C11559m;
import kotlinx.coroutines.selects.C12124c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.c2 */
public interface C11723c2 extends CoroutineContext.C11040a {
    @C12579k

    /* renamed from: w0 */
    public static final C11725b f29067w0 = C11725b.f29068a;

    /* renamed from: kotlinx.coroutines.c2$a */
    public static final class C11724a {
        /* renamed from: b */
        public static /* synthetic */ void m46184b(C11723c2 c2Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                c2Var.mo23621a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: c */
        public static /* synthetic */ boolean m46185c(C11723c2 c2Var, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return c2Var.mo23624c(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: d */
        public static <R> R m46186d(@C12579k C11723c2 c2Var, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return CoroutineContext.C11040a.C11041a.m42563a(c2Var, r, pVar);
        }

        @C12580l
        /* renamed from: e */
        public static <E extends CoroutineContext.C11040a> E m46187e(@C12579k C11723c2 c2Var, @C12579k CoroutineContext.C11042b<E> bVar) {
            return CoroutineContext.C11040a.C11041a.m42564b(c2Var, bVar);
        }

        @C12095s1
        /* renamed from: f */
        public static /* synthetic */ void m46188f() {
        }

        /* renamed from: g */
        public static /* synthetic */ C11962g1 m46189g(C11723c2 c2Var, boolean z, boolean z2, C11300l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return c2Var.mo23650t(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        @C12579k
        /* renamed from: h */
        public static CoroutineContext m46190h(@C12579k C11723c2 c2Var, @C12579k CoroutineContext.C11042b<?> bVar) {
            return CoroutineContext.C11040a.C11041a.m42565c(c2Var, bVar);
        }

        @C12579k
        /* renamed from: i */
        public static CoroutineContext m46191i(@C12579k C11723c2 c2Var, @C12579k CoroutineContext coroutineContext) {
            return CoroutineContext.C11040a.C11041a.m42566d(c2Var, coroutineContext);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @C12579k
        /* renamed from: j */
        public static C11723c2 m46192j(@C12579k C11723c2 c2Var, @C12579k C11723c2 c2Var2) {
            return c2Var2;
        }
    }

    /* renamed from: kotlinx.coroutines.c2$b */
    public static final class C11725b implements CoroutineContext.C11042b<C11723c2> {

        /* renamed from: a */
        public static final /* synthetic */ C11725b f29068a = new C11725b();
    }

    @C12579k
    /* renamed from: D */
    C11962g1 mo23589D(@C12579k C11300l<? super Throwable, C11079d2> lVar);

    @C12580l
    /* renamed from: S */
    Object mo23614S(@C12579k C11045c<? super C11079d2> cVar);

    /* renamed from: a */
    void mo23621a(@C12580l CancellationException cancellationException);

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: c */
    /* synthetic */ boolean mo23624c(Throwable th);

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    /* renamed from: d */
    boolean mo23627d();

    @C12579k
    /* renamed from: f0 */
    C12124c mo23630f0();

    @C12580l
    C11723c2 getParent();

    boolean isCancelled();

    /* renamed from: j */
    boolean mo23636j();

    @C12177y1
    @C12579k
    /* renamed from: q0 */
    C12152u mo23644q0(@C12579k C12162w wVar);

    @C12579k
    /* renamed from: r */
    C11559m<C11723c2> mo23646r();

    boolean start();

    @C12177y1
    @C12579k
    /* renamed from: t */
    C11962g1 mo23650t(boolean z, boolean z2, @C12579k C11300l<? super Throwable, C11079d2> lVar);

    @C12177y1
    @C12579k
    /* renamed from: u */
    CancellationException mo23653u();

    @C11395k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @C12579k
    /* renamed from: z */
    C11723c2 mo23665z(@C12579k C11723c2 c2Var);
}
