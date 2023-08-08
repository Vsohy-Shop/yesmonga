package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.core.util.C17970d;
import androidx.core.util.C18001r;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.provider.i */
public class C17872i {

    /* renamed from: androidx.core.provider.i$a */
    public static class C17873a implements ThreadFactory {

        /* renamed from: a */
        public String f46281a;

        /* renamed from: b */
        public int f46282b;

        /* renamed from: androidx.core.provider.i$a$a */
        public static class C17874a extends Thread {

            /* renamed from: a */
            public final int f46283a;

            public C17874a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f46283a = i;
            }

            public void run() {
                Process.setThreadPriority(this.f46283a);
                super.run();
            }
        }

        public C17873a(@C0359n0 String str, int i) {
            this.f46281a = str;
            this.f46282b = i;
        }

        public Thread newThread(Runnable runnable) {
            return new C17874a(runnable, this.f46281a, this.f46282b);
        }
    }

    /* renamed from: androidx.core.provider.i$b */
    public static class C17875b implements Executor {

        /* renamed from: a */
        public final Handler f46284a;

        public C17875b(@C0359n0 Handler handler) {
            this.f46284a = (Handler) C18001r.m81775l(handler);
        }

        public void execute(@C0359n0 Runnable runnable) {
            if (!this.f46284a.post((Runnable) C18001r.m81775l(runnable))) {
                throw new RejectedExecutionException(this.f46284a + " is shutting down");
            }
        }
    }

    /* renamed from: androidx.core.provider.i$c */
    public static class C17876c<T> implements Runnable {
        @C0359n0

        /* renamed from: a */
        public Callable<T> f46285a;
        @C0359n0

        /* renamed from: b */
        public C17970d<T> f46286b;
        @C0359n0

        /* renamed from: c */
        public Handler f46287c;

        /* renamed from: androidx.core.provider.i$c$a */
        public class C17877a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C17970d f46288a;

            /* renamed from: b */
            public final /* synthetic */ Object f46289b;

            public C17877a(C17970d dVar, Object obj) {
                this.f46288a = dVar;
                this.f46289b = obj;
            }

            public void run() {
                this.f46288a.accept(this.f46289b);
            }
        }

        public C17876c(@C0359n0 Handler handler, @C0359n0 Callable<T> callable, @C0359n0 C17970d<T> dVar) {
            this.f46285a = callable;
            this.f46286b = dVar;
            this.f46287c = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f46285a.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f46287c.post(new C17877a(this.f46286b, t));
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m81391a(@C0359n0 String str, int i, @C0337f0(from = 0) int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C17873a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static Executor m81392b(@C0359n0 Handler handler) {
        return new C17875b(handler);
    }

    /* renamed from: c */
    public static <T> void m81393c(@C0359n0 Executor executor, @C0359n0 Callable<T> callable, @C0359n0 C17970d<T> dVar) {
        executor.execute(new C17876c(C17850b.m81317a(), callable, dVar));
    }

    /* renamed from: d */
    public static <T> T m81394d(@C0359n0 ExecutorService executorService, @C0359n0 Callable<T> callable, @C0337f0(from = 0) int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
