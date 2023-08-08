package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C12164w0;
import kotlinx.coroutines.internal.C11986d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.q1 */
public final class C12086q1 extends ExecutorCoroutineDispatcher implements C12164w0 {
    @C12579k

    /* renamed from: d */
    public final Executor f29746d;

    public C12086q1(@C12579k Executor executor) {
        this.f29746d = executor;
        C11986d.m47800c(mo23573a0());
    }

    @C12579k
    /* renamed from: C */
    public C11962g1 mo23705C(long j, @C12579k Runnable runnable, @C12579k CoroutineContext coroutineContext) {
        ScheduledExecutorService scheduledExecutorService;
        Executor a0 = mo23573a0();
        ScheduledFuture<?> scheduledFuture = null;
        if (a0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) a0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = mo24578c0(scheduledExecutorService, runnable, coroutineContext, j);
        }
        if (scheduledFuture != null) {
            return new C11803f1(scheduledFuture);
        }
        return C12094s0.f29753w.mo23705C(j, runnable, coroutineContext);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @C12580l
    /* renamed from: N */
    public Object mo23721N(long j, @C12579k C11045c<? super C11079d2> cVar) {
        return C12164w0.C12165a.m48733a(this, j, cVar);
    }

    /* renamed from: O */
    public void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        Runnable runnable2;
        try {
            Executor a0 = mo23573a0();
            C11715b b = C11720c.m46159b();
            if (b == null || (runnable2 = b.mo23732i(runnable)) == null) {
                runnable2 = runnable;
            }
            a0.execute(runnable2);
        } catch (RejectedExecutionException e) {
            C11715b b2 = C11720c.m46159b();
            if (b2 != null) {
                b2.mo23729f();
            }
            mo24577b0(coroutineContext, e);
            C11768d1.m46781c().mo23563O(coroutineContext, runnable);
        }
    }

    @C12579k
    /* renamed from: a0 */
    public Executor mo23573a0() {
        return this.f29746d;
    }

    /* renamed from: b0 */
    public final void mo24577b0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        C11804f2.m46958f(coroutineContext, C12080p1.m48273a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: c0 */
    public final ScheduledFuture<?> mo24578c0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            mo24577b0(coroutineContext, e);
            return null;
        }
    }

    public void close() {
        Executor a0 = mo23573a0();
        ExecutorService executorService = a0 instanceof ExecutorService ? (ExecutorService) a0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(@C12580l Object obj) {
        return (obj instanceof C12086q1) && ((C12086q1) obj).mo23573a0() == mo23573a0();
    }

    public int hashCode() {
        return System.identityHashCode(mo23573a0());
    }

    /* renamed from: p */
    public void mo23711p(long j, @C12579k C12072o<? super C11079d2> oVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor a0 = mo23573a0();
        ScheduledFuture<?> scheduledFuture = null;
        if (a0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) a0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = mo24578c0(scheduledExecutorService, new C12161v2(this, oVar), oVar.getContext(), j);
        }
        if (scheduledFuture != null) {
            C11804f2.m46975w(oVar, scheduledFuture);
        } else {
            C12094s0.f29753w.mo23711p(j, oVar);
        }
    }

    @C12579k
    public String toString() {
        return mo23573a0().toString();
    }
}
