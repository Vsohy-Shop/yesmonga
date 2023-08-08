package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11289a;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.n1 */
public final class C12069n1 {
    @C12579k
    /* renamed from: a */
    public static final C12047k1 m48160a() {
        return new C11960g(Thread.currentThread());
    }

    @C12177y1
    @C11532s0
    @C12176y0
    /* renamed from: b */
    public static final boolean m48161b(@C12579k Thread thread) {
        if (!(thread instanceof CoroutineScheduler.C12100c)) {
            return false;
        }
        return ((CoroutineScheduler.C12100c) thread).mo24639p();
    }

    /* renamed from: c */
    public static final void m48162c(@C12579k C11289a<C11079d2> aVar) {
        aVar.invoke();
    }

    @C12177y1
    /* renamed from: d */
    public static final long m48163d() {
        C12047k1 a = C11800e3.f29268a.mo24075a();
        if (a != null) {
            return a.mo24478D0();
        }
        return Long.MAX_VALUE;
    }

    @C12177y1
    @C11532s0
    @C12176y0
    /* renamed from: e */
    public static final long m48164e() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof CoroutineScheduler.C12100c) {
            return ((CoroutineScheduler.C12100c) currentThread).mo24644t();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + currentThread);
    }
}
