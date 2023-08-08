package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.C11079d2;
import kotlinx.coroutines.C12053l1;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.m1 */
public abstract class C12063m1 extends C12047k1 {
    @C12579k
    /* renamed from: H0 */
    public abstract Thread mo24291H0();

    /* renamed from: K0 */
    public void mo24517K0(long j, @C12579k C12053l1.C12056c cVar) {
        C12094s0.f29753w.mo24497j1(j, cVar);
    }

    /* renamed from: L0 */
    public final void mo24518L0() {
        C11079d2 d2Var;
        Thread H0 = mo24291H0();
        if (Thread.currentThread() != H0) {
            C11715b b = C11720c.m46159b();
            if (b != null) {
                b.mo23730g(H0);
                d2Var = C11079d2.f28267a;
            } else {
                d2Var = null;
            }
            if (d2Var == null) {
                LockSupport.unpark(H0);
            }
        }
    }
}
