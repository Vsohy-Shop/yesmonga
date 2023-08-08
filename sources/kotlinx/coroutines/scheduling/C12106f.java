package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11394v;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.scheduling.f */
public final class C12106f extends ExecutorCoroutineDispatcher implements C12111k, Executor {
    @C12579k

    /* renamed from: w */
    public static final AtomicIntegerFieldUpdater f29805w = AtomicIntegerFieldUpdater.newUpdater(C12106f.class, "inFlightTasks");
    @C12579k

    /* renamed from: d */
    public final C12104d f29806d;

    /* renamed from: e */
    public final int f29807e;
    @C12580l

    /* renamed from: f */
    public final String f29808f;

    /* renamed from: g */
    public final int f29809g;
    @C11394v
    private volatile int inFlightTasks;
    @C12579k

    /* renamed from: v */
    public final ConcurrentLinkedQueue<Runnable> f29810v = new ConcurrentLinkedQueue<>();

    public C12106f(@C12579k C12104d dVar, int i, @C12580l String str, int i2) {
        this.f29806d = dVar;
        this.f29807e = i;
        this.f29808f = str;
        this.f29809g = i2;
    }

    /* renamed from: K */
    public void mo24657K() {
        Runnable poll = this.f29810v.poll();
        if (poll != null) {
            this.f29806d.mo24655e0(poll, this, true);
            return;
        }
        f29805w.decrementAndGet(this);
        Runnable poll2 = this.f29810v.poll();
        if (poll2 != null) {
            mo24659b0(poll2, true);
        }
    }

    /* renamed from: L */
    public int mo24658L() {
        return this.f29809g;
    }

    /* renamed from: O */
    public void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        mo24659b0(runnable, false);
    }

    /* renamed from: T */
    public void mo23564T(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        mo24659b0(runnable, true);
    }

    @C12579k
    /* renamed from: a0 */
    public Executor mo23573a0() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v5 java.lang.Runnable) binds: [B:0:0x0000, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24659b0(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f29805w
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f29807e
            if (r1 > r2) goto L_0x0010
            kotlinx.coroutines.scheduling.d r0 = r3.f29806d
            r0.mo24655e0(r4, r3, r5)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f29810v
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f29807e
            if (r4 < r0) goto L_0x001e
            return
        L_0x001e:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f29810v
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.C12106f.mo24659b0(java.lang.Runnable, boolean):void");
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(@C12579k Runnable runnable) {
        mo24659b0(runnable, false);
    }

    @C12579k
    public String toString() {
        String str = this.f29808f;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f29806d + C12361b.f30261l;
    }
}
