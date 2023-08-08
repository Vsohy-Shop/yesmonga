package androidx.camera.core.impl.utils.futures;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1417i2;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.core.impl.utils.futures.g */
public abstract class C1554g<V> implements C32487a<V> {

    /* renamed from: a */
    public static final String f4447a = "ImmediateFuture";

    /* renamed from: androidx.camera.core.impl.utils.futures.g$a */
    public static class C1555a<V> extends C1554g<V> {
        @C0359n0

        /* renamed from: b */
        public final Throwable f4448b;

        public C1555a(@C0359n0 Throwable th) {
            this.f4448b = th;
        }

        @C0363p0
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f4448b);
        }

        @C0359n0
        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f4448b + "]]";
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.g$b */
    public static final class C1556b<V> extends C1555a<V> implements ScheduledFuture<V> {
        public C1556b(@C0359n0 Throwable th) {
            super(th);
        }

        public long getDelay(@C0359n0 TimeUnit timeUnit) {
            return 0;
        }

        /* renamed from: r */
        public int compareTo(@C0359n0 Delayed delayed) {
            return -1;
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.g$c */
    public static final class C1557c<V> extends C1554g<V> {

        /* renamed from: c */
        public static final C1554g<Object> f4449c = new C1557c((Object) null);
        @C0363p0

        /* renamed from: b */
        public final V f4450b;

        public C1557c(@C0363p0 V v) {
            this.f4450b = v;
        }

        @C0363p0
        public V get() {
            return this.f4450b;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f4450b + "]]";
        }
    }

    /* renamed from: g */
    public static <V> C32487a<V> m6490g() {
        return C1557c.f4449c;
    }

    public boolean cancel(boolean z) {
        return false;
    }

    @C0363p0
    public abstract V get() throws ExecutionException;

    @C0363p0
    public V get(long j, @C0359n0 TimeUnit timeUnit) throws ExecutionException {
        C18001r.m81775l(timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    /* renamed from: q */
    public void mo5489q(@C0359n0 Runnable runnable, @C0359n0 Executor executor) {
        C18001r.m81775l(runnable);
        C18001r.m81775l(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            C1417i2.m5914d(f4447a, "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }
}
