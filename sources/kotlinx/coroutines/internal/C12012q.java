package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11962g1;
import kotlinx.coroutines.C12051l0;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.C12144t0;
import kotlinx.coroutines.C12164w0;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,134:1\n66#1,8:135\n66#1,8:143\n28#2,4:151\n28#2,4:156\n20#3:155\n20#3:160\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n48#1:135,8\n55#1:143,8\n79#1:151,4\n92#1:156,4\n79#1:155\n92#1:160\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.q */
public final class C12012q extends CoroutineDispatcher implements C12164w0 {
    @C12579k

    /* renamed from: v */
    public static final AtomicIntegerFieldUpdater f29619v = AtomicIntegerFieldUpdater.newUpdater(C12012q.class, "runningWorkers");
    @C12579k

    /* renamed from: c */
    public final CoroutineDispatcher f29620c;

    /* renamed from: d */
    public final int f29621d;

    /* renamed from: e */
    public final /* synthetic */ C12164w0 f29622e;
    @C12579k

    /* renamed from: f */
    public final C12025w<Runnable> f29623f;
    @C12579k

    /* renamed from: g */
    public final Object f29624g;
    @C11394v
    private volatile int runningWorkers;

    /* renamed from: kotlinx.coroutines.internal.q$a */
    public final class C12013a implements Runnable {
        @C12579k

        /* renamed from: a */
        public Runnable f29625a;

        public C12013a(@C12579k Runnable runnable) {
            this.f29625a = runnable;
        }

        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.f29625a.run();
                } catch (Throwable th) {
                    C12051l0.m48104b(EmptyCoroutineContext.f28243a, th);
                }
                Runnable b0 = C12012q.this.mo24402d0();
                if (b0 != null) {
                    this.f29625a = b0;
                    i++;
                    if (i >= 16 && C12012q.this.f29620c.mo23565U(C12012q.this)) {
                        C12012q.this.f29620c.mo23563O(C12012q.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C12012q(@C12579k CoroutineDispatcher coroutineDispatcher, int i) {
        C12164w0 w0Var;
        this.f29620c = coroutineDispatcher;
        this.f29621d = i;
        if (coroutineDispatcher instanceof C12164w0) {
            w0Var = (C12164w0) coroutineDispatcher;
        } else {
            w0Var = null;
        }
        this.f29622e = w0Var == null ? C12144t0.m48662a() : w0Var;
        this.f29623f = new C12025w<>(false);
        this.f29624g = new Object();
    }

    @C12579k
    /* renamed from: C */
    public C11962g1 mo23705C(long j, @C12579k Runnable runnable, @C12579k CoroutineContext coroutineContext) {
        return this.f29622e.mo23705C(j, runnable, coroutineContext);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @C12580l
    /* renamed from: N */
    public Object mo23721N(long j, @C12579k C11045c<? super C11079d2> cVar) {
        return this.f29622e.mo23721N(j, cVar);
    }

    /* renamed from: O */
    public void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        Runnable d0;
        this.f29623f.mo24415a(runnable);
        if (f29619v.get(this) < this.f29621d && mo24403e0() && (d0 = mo24402d0()) != null) {
            this.f29620c.mo23563O(this, new C12013a(d0));
        }
    }

    @C12177y1
    /* renamed from: T */
    public void mo23564T(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        Runnable d0;
        this.f29623f.mo24415a(runnable);
        if (f29619v.get(this) < this.f29621d && mo24403e0() && (d0 = mo24402d0()) != null) {
            this.f29620c.mo23564T(this, new C12013a(d0));
        }
    }

    @C12095s1
    @C12579k
    /* renamed from: V */
    public CoroutineDispatcher mo23566V(int i) {
        C12015r.m47943a(i);
        if (i >= this.f29621d) {
            return this;
        }
        return super.mo23566V(i);
    }

    /* renamed from: c0 */
    public final void mo24401c0(Runnable runnable, C11300l<? super C12013a, C11079d2> lVar) {
        Runnable d0;
        this.f29623f.mo24415a(runnable);
        if (f29619v.get(this) < this.f29621d && mo24403e0() && (d0 = mo24402d0()) != null) {
            lVar.invoke(new C12013a(d0));
        }
    }

    /* renamed from: d0 */
    public final Runnable mo24402d0() {
        while (true) {
            Runnable h = this.f29623f.mo24422h();
            if (h != null) {
                return h;
            }
            synchronized (this.f29624g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29619v;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f29623f.mo24417c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* renamed from: e0 */
    public final boolean mo24403e0() {
        synchronized (this.f29624g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29619v;
            if (atomicIntegerFieldUpdater.get(this) >= this.f29621d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    /* renamed from: p */
    public void mo23711p(long j, @C12579k C12072o<? super C11079d2> oVar) {
        this.f29622e.mo23711p(j, oVar);
    }
}
