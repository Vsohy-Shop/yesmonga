package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C12053l1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
/* renamed from: kotlinx.coroutines.s0 */
public final class C12094s0 extends C12053l1 implements Runnable {

    /* renamed from: E0 */
    public static final int f29748E0 = 3;

    /* renamed from: F0 */
    public static final int f29749F0 = 4;

    /* renamed from: X */
    public static final int f29750X = 0;

    /* renamed from: Y */
    public static final int f29751Y = 1;

    /* renamed from: Z */
    public static final int f29752Z = 2;
    @C12580l
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;
    @C12579k

    /* renamed from: w */
    public static final C12094s0 f29753w;
    @C12579k

    /* renamed from: x */
    public static final String f29754x = "kotlinx.coroutines.DefaultExecutor";

    /* renamed from: y */
    public static final long f29755y = 1000;

    /* renamed from: z */
    public static final long f29756z;

    static {
        Long l;
        C12094s0 s0Var = new C12094s0();
        f29753w = s0Var;
        C12047k1.m48086t0(s0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f29756z = timeUnit.toNanos(l.longValue());
    }

    /* renamed from: D1 */
    public static /* synthetic */ void m48308D1() {
    }

    /* renamed from: A1 */
    public final synchronized Thread mo24582A1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f29754x);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: B1 */
    public final synchronized void mo24583B1() {
        debugStatus = 0;
        mo24582A1();
        while (debugStatus == 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @C12579k
    /* renamed from: C */
    public C11962g1 mo23705C(long j, @C12579k Runnable runnable, @C12579k CoroutineContext coroutineContext) {
        return mo24499n1(j, runnable);
    }

    /* renamed from: F1 */
    public final boolean mo24584F1() {
        return debugStatus == 4;
    }

    /* renamed from: G1 */
    public final boolean mo24585G1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    @C12579k
    /* renamed from: H0 */
    public Thread mo24291H0() {
        Thread thread = _thread;
        return thread == null ? mo24582A1() : thread;
    }

    /* renamed from: H1 */
    public final boolean mo24586H1() {
        return _thread != null;
    }

    /* renamed from: K0 */
    public void mo24517K0(long j, @C12579k C12053l1.C12056c cVar) {
        mo24588M1();
    }

    /* renamed from: L1 */
    public final synchronized boolean mo24587L1() {
        if (mo24585G1()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* renamed from: M1 */
    public final void mo24588M1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* renamed from: P1 */
    public final synchronized void mo24589P1(long j) {
        C11079d2 d2Var;
        long currentTimeMillis = System.currentTimeMillis() + j;
        if (!mo24585G1()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
                C11715b b = C11720c.m46159b();
                if (b != null) {
                    b.mo23730g(thread);
                    d2Var = C11079d2.f28267a;
                } else {
                    d2Var = null;
                }
                if (d2Var == null) {
                    LockSupport.unpark(thread);
                }
            }
            if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            }
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait(j);
        }
        debugStatus = 0;
    }

    /* renamed from: U0 */
    public void mo24492U0(@C12579k Runnable runnable) {
        if (mo24584F1()) {
            mo24588M1();
        }
        super.mo24492U0(runnable);
    }

    public void run() {
        C11079d2 d2Var;
        long j;
        C11800e3.f29268a.mo24078d(this);
        C11715b b = C11720c.m46159b();
        if (b != null) {
            b.mo23727d();
        }
        try {
            if (mo24587L1()) {
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long D0 = mo24478D0();
                    if (D0 == Long.MAX_VALUE) {
                        C11715b b2 = C11720c.m46159b();
                        if (b2 != null) {
                            j = b2.mo23725b();
                        } else {
                            j = System.nanoTime();
                        }
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f29756z + j;
                        }
                        long j3 = j2 - j;
                        if (j3 <= 0) {
                            _thread = null;
                            mo24591z1();
                            C11715b b3 = C11720c.m46159b();
                            if (b3 != null) {
                                b3.mo23731h();
                            }
                            if (!mo24488x0()) {
                                mo24291H0();
                                return;
                            }
                            return;
                        }
                        D0 = C11479u.m44316C(D0, j3);
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (D0 > 0) {
                        if (mo24585G1()) {
                            _thread = null;
                            mo24591z1();
                            C11715b b4 = C11720c.m46159b();
                            if (b4 != null) {
                                b4.mo23731h();
                            }
                            if (!mo24488x0()) {
                                mo24291H0();
                                return;
                            }
                            return;
                        }
                        C11715b b5 = C11720c.m46159b();
                        if (b5 != null) {
                            b5.mo23726c(this, D0);
                            d2Var = C11079d2.f28267a;
                        } else {
                            d2Var = null;
                        }
                        if (d2Var == null) {
                            LockSupport.parkNanos(this, D0);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            mo24591z1();
            C11715b b6 = C11720c.m46159b();
            if (b6 != null) {
                b6.mo23731h();
            }
            if (!mo24488x0()) {
                mo24291H0();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    /* renamed from: z1 */
    public final synchronized void mo24591z1() {
        if (mo24585G1()) {
            debugStatus = 3;
            mo24496g1();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }
}
