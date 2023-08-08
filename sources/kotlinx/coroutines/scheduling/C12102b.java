package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11798e1;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.C12016r0;
import kotlinx.coroutines.internal.C12020t0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.scheduling.b */
public final class C12102b extends ExecutorCoroutineDispatcher implements Executor {
    @C12579k

    /* renamed from: d */
    public static final C12102b f29797d = new C12102b();
    @C12579k

    /* renamed from: e */
    public static final CoroutineDispatcher f29798e = C12115o.f29831c.mo23566V(C12020t0.m47961e(C11798e1.f29266a, C11479u.m44447u(64, C12016r0.m47944a()), 0, 0, 12, (Object) null));

    /* renamed from: O */
    public void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        f29798e.mo23563O(coroutineContext, runnable);
    }

    @C12177y1
    /* renamed from: T */
    public void mo23564T(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        f29798e.mo23564T(coroutineContext, runnable);
    }

    @C12095s1
    @C12579k
    /* renamed from: V */
    public CoroutineDispatcher mo23566V(int i) {
        return C12115o.f29831c.mo23566V(i);
    }

    @C12579k
    /* renamed from: a0 */
    public Executor mo23573a0() {
        return this;
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(@C12579k Runnable runnable) {
        mo23563O(EmptyCoroutineContext.f28243a, runnable);
    }

    @C12579k
    public String toString() {
        return "Dispatchers.IO";
    }
}
