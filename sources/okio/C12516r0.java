package okio;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.C11079d2;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.r0 */
public class C12516r0 {
    @C12579k
    public static final C12518b Companion = new C12518b((DefaultConstructorMarker) null);
    @C12579k
    @C11287e
    public static final C12516r0 NONE = new C12517a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* renamed from: okio.r0$a */
    public static final class C12517a extends C12516r0 {
        @C12579k
        public C12516r0 deadlineNanoTime(long j) {
            return this;
        }

        public void throwIfReached() {
        }

        @C12579k
        public C12516r0 timeout(long j, @C12579k TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "unit");
            return this;
        }
    }

    /* renamed from: okio.r0$b */
    public static final class C12518b {
        public C12518b() {
        }

        /* renamed from: a */
        public final long mo27441a(long j, long j2) {
            return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
        }

        public /* synthetic */ C12518b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C12579k
    public C12516r0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    @C12579k
    public C12516r0 clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    @C12579k
    public final C12516r0 deadline(long j, @C12579k TimeUnit timeUnit) {
        boolean z;
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final void intersectWith(@C12579k C12516r0 r0Var, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(r0Var, "other");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        long timeoutNanos2 = timeoutNanos();
        long a = Companion.mo27441a(r0Var.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(a, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime2 = deadlineNanoTime();
            if (r0Var.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), r0Var.deadlineNanoTime()));
            }
            try {
                aVar.invoke();
                C11322b0.m43481d(1);
                timeout(timeoutNanos2, timeUnit);
                if (r0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime2);
                }
                C11322b0.m43480c(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (r0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime2);
                }
                C11322b0.m43480c(1);
                throw th;
            }
        } else {
            if (r0Var.hasDeadline()) {
                deadlineNanoTime(r0Var.deadlineNanoTime());
            }
            try {
                aVar.invoke();
                C11322b0.m43481d(1);
                timeout(timeoutNanos2, timeUnit);
                if (r0Var.hasDeadline()) {
                    clearDeadline();
                }
                C11322b0.m43480c(1);
            } catch (Throwable th2) {
                C11322b0.m43481d(1);
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (r0Var.hasDeadline()) {
                    clearDeadline();
                }
                C11322b0.m43480c(1);
                throw th2;
            }
        }
    }

    public void throwIfReached() throws IOException {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @C12579k
    public C12516r0 timeout(long j, @C12579k TimeUnit timeUnit) {
        boolean z;
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(@C12579k Object obj) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(obj, "monitor");
        try {
            boolean hasDeadline2 = hasDeadline();
            long timeoutNanos2 = timeoutNanos();
            long j = 0;
            if (hasDeadline2 || timeoutNanos2 != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline2 && timeoutNanos2 != 0) {
                    timeoutNanos2 = Math.min(timeoutNanos2, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline2) {
                    timeoutNanos2 = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos2 > 0) {
                    long j2 = timeoutNanos2 / 1000000;
                    obj.wait(j2, (int) (timeoutNanos2 - (1000000 * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos2) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @C12579k
    public C12516r0 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
