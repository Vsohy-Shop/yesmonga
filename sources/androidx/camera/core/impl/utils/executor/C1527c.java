package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.C0359n0;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.C32487a;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.impl.utils.executor.c */
public final class C1527c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b */
    public static ThreadLocal<ScheduledExecutorService> f4382b = new C1528a();

    /* renamed from: a */
    public final Handler f4383a;

    /* renamed from: androidx.camera.core.impl.utils.executor.c$a */
    public class C1528a extends ThreadLocal<ScheduledExecutorService> {
        /* renamed from: a */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return C1525a.m6441e();
            }
            if (Looper.myLooper() != null) {
                return new C1527c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.executor.c$b */
    public class C1529b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ Runnable f4384a;

        public C1529b(Runnable runnable) {
            this.f4384a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f4384a.run();
            return null;
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.executor.c$c */
    public static class C1530c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: a */
        public final AtomicReference<CallbackToFutureAdapter.C16559a<V>> f4386a = new AtomicReference<>((Object) null);

        /* renamed from: b */
        public final long f4387b;

        /* renamed from: c */
        public final Callable<V> f4388c;

        /* renamed from: d */
        public final C32487a<V> f4389d;

        /* renamed from: androidx.camera.core.impl.utils.executor.c$c$a */
        public class C1531a implements CallbackToFutureAdapter.C16560b<V> {

            /* renamed from: a */
            public final /* synthetic */ Handler f4390a;

            /* renamed from: b */
            public final /* synthetic */ Callable f4391b;

            /* renamed from: androidx.camera.core.impl.utils.executor.c$c$a$a */
            public class C1532a implements Runnable {
                public C1532a() {
                }

                public void run() {
                    if (C1530c.this.f4386a.getAndSet((Object) null) != null) {
                        C1531a aVar = C1531a.this;
                        aVar.f4390a.removeCallbacks(C1530c.this);
                    }
                }
            }

            public C1531a(Handler handler, Callable callable) {
                this.f4390a = handler;
                this.f4391b = callable;
            }

            /* renamed from: a */
            public Object mo4001a(@C0359n0 CallbackToFutureAdapter.C16559a<V> aVar) throws RejectedExecutionException {
                aVar.mo48123a(new C1532a(), C1525a.m6437a());
                C1530c.this.f4386a.set(aVar);
                return "HandlerScheduledFuture-" + this.f4391b.toString();
            }
        }

        public C1530c(Handler handler, long j, Callable<V> callable) {
            this.f4387b = j;
            this.f4388c = callable;
            this.f4389d = CallbackToFutureAdapter.m74987a(new C1531a(handler, callable));
        }

        /* renamed from: b */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        public boolean cancel(boolean z) {
            return this.f4389d.cancel(z);
        }

        public V get() throws ExecutionException, InterruptedException {
            return this.f4389d.get();
        }

        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f4387b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public boolean isCancelled() {
            return this.f4389d.isCancelled();
        }

        public boolean isDone() {
            return this.f4389d.isDone();
        }

        public boolean isPeriodic() {
            return false;
        }

        public void run() {
            CallbackToFutureAdapter.C16559a andSet = this.f4386a.getAndSet((Object) null);
            if (andSet != null) {
                try {
                    andSet.mo48125c(this.f4388c.call());
                } catch (Exception e) {
                    andSet.mo48128f(e);
                }
            }
        }

        public V get(long j, @C0359n0 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f4389d.get(j, timeUnit);
        }
    }

    public C1527c(@C0359n0 Handler handler) {
        this.f4383a = handler;
    }

    /* renamed from: b */
    public static ScheduledExecutorService m6446b() {
        ScheduledExecutorService scheduledExecutorService = f4382b.get();
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            C1527c cVar = new C1527c(new Handler(myLooper));
            f4382b.set(cVar);
            return cVar;
        }
        throw new IllegalStateException("Current thread has no looper!");
    }

    /* renamed from: a */
    public final RejectedExecutionException mo5439a() {
        return new RejectedExecutionException(this.f4383a + " is shutting down");
    }

    public boolean awaitTermination(long j, @C0359n0 TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C1527c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public void execute(@C0359n0 Runnable runnable) {
        if (!this.f4383a.post(runnable)) {
            throw mo5439a();
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public ScheduledFuture<?> schedule(@C0359n0 Runnable runnable, long j, @C0359n0 TimeUnit timeUnit) {
        return schedule(new C1529b(runnable), j, timeUnit);
    }

    @C0359n0
    public ScheduledFuture<?> scheduleAtFixedRate(@C0359n0 Runnable runnable, long j, long j2, @C0359n0 TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C1527c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @C0359n0
    public ScheduledFuture<?> scheduleWithFixedDelay(@C0359n0 Runnable runnable, long j, long j2, @C0359n0 TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C1527c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    public void shutdown() {
        throw new UnsupportedOperationException(C1527c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @C0359n0
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(C1527c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @C0359n0
    public <V> ScheduledFuture<V> schedule(@C0359n0 Callable<V> callable, long j, @C0359n0 TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        C1530c cVar = new C1530c(this.f4383a, uptimeMillis, callable);
        if (this.f4383a.postAtTime(cVar, uptimeMillis)) {
            return cVar;
        }
        return C1548f.m6478g(mo5439a());
    }
}
