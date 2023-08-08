package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import androidx.annotation.C0337f0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bumptech.glide.load.engine.executor.a */
public final class C22218a implements ExecutorService {

    /* renamed from: b */
    public static final String f57064b = "source";

    /* renamed from: c */
    public static final String f57065c = "disk-cache";

    /* renamed from: d */
    public static final int f57066d = 1;

    /* renamed from: e */
    public static final String f57067e = "GlideExecutor";

    /* renamed from: f */
    public static final String f57068f = "source-unlimited";

    /* renamed from: g */
    public static final String f57069g = "animation";

    /* renamed from: v */
    public static final long f57070v = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: w */
    public static final int f57071w = 4;

    /* renamed from: x */
    public static volatile int f57072x;

    /* renamed from: a */
    public final ExecutorService f57073a;

    /* renamed from: com.bumptech.glide.load.engine.executor.a$b */
    public static final class C22220b {

        /* renamed from: h */
        public static final long f57074h = 0;

        /* renamed from: a */
        public final boolean f57075a;

        /* renamed from: b */
        public int f57076b;

        /* renamed from: c */
        public int f57077c;
        @C0359n0

        /* renamed from: d */
        public final ThreadFactory f57078d = new C22221c();
        @C0359n0

        /* renamed from: e */
        public C22225e f57079e = C22225e.f57094d;

        /* renamed from: f */
        public String f57080f;

        /* renamed from: g */
        public long f57081g;

        public C22220b(boolean z) {
            this.f57075a = z;
        }

        /* renamed from: a */
        public C22218a mo66081a() {
            if (!TextUtils.isEmpty(this.f57080f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f57076b, this.f57077c, this.f57081g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C22223d(this.f57078d, this.f57080f, this.f57079e, this.f57075a));
                if (this.f57081g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new C22218a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f57080f);
        }

        /* renamed from: b */
        public C22220b mo66082b(String str) {
            this.f57080f = str;
            return this;
        }

        /* renamed from: c */
        public C22220b mo66083c(@C0337f0(from = 1) int i) {
            this.f57076b = i;
            this.f57077c = i;
            return this;
        }

        /* renamed from: d */
        public C22220b mo66084d(long j) {
            this.f57081g = j;
            return this;
        }

        /* renamed from: e */
        public C22220b mo66085e(@C0359n0 C22225e eVar) {
            this.f57079e = eVar;
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.executor.a$c */
    public static final class C22221c implements ThreadFactory {

        /* renamed from: a */
        public static final int f57082a = 9;

        /* renamed from: com.bumptech.glide.load.engine.executor.a$c$a */
        public class C22222a extends Thread {
            public C22222a(Runnable runnable) {
                super(runnable);
            }

            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public C22221c() {
        }

        public Thread newThread(@C0359n0 Runnable runnable) {
            return new C22222a(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.executor.a$d */
    public static final class C22223d implements ThreadFactory {

        /* renamed from: a */
        public final ThreadFactory f57084a;

        /* renamed from: b */
        public final String f57085b;

        /* renamed from: c */
        public final C22225e f57086c;

        /* renamed from: d */
        public final boolean f57087d;

        /* renamed from: e */
        public final AtomicInteger f57088e = new AtomicInteger();

        /* renamed from: com.bumptech.glide.load.engine.executor.a$d$a */
        public class C22224a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f57089a;

            public C22224a(Runnable runnable) {
                this.f57089a = runnable;
            }

            public void run() {
                if (C22223d.this.f57087d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f57089a.run();
                } catch (Throwable th) {
                    C22223d.this.f57086c.mo66090a(th);
                }
            }
        }

        public C22223d(ThreadFactory threadFactory, String str, C22225e eVar, boolean z) {
            this.f57084a = threadFactory;
            this.f57085b = str;
            this.f57086c = eVar;
            this.f57087d = z;
        }

        public Thread newThread(@C0359n0 Runnable runnable) {
            Thread newThread = this.f57084a.newThread(new C22224a(runnable));
            newThread.setName("glide-" + this.f57085b + "-thread-" + this.f57088e.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.executor.a$e */
    public interface C22225e {

        /* renamed from: a */
        public static final C22225e f57091a = new C22226a();

        /* renamed from: b */
        public static final C22225e f57092b;

        /* renamed from: c */
        public static final C22225e f57093c = new C22228c();

        /* renamed from: d */
        public static final C22225e f57094d;

        /* renamed from: com.bumptech.glide.load.engine.executor.a$e$a */
        public class C22226a implements C22225e {
            /* renamed from: a */
            public void mo66090a(Throwable th) {
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.a$e$b */
        public class C22227b implements C22225e {
            /* renamed from: a */
            public void mo66090a(Throwable th) {
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.a$e$c */
        public class C22228c implements C22225e {
            /* renamed from: a */
            public void mo66090a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C22227b bVar = new C22227b();
            f57092b = bVar;
            f57094d = bVar;
        }

        /* renamed from: a */
        void mo66090a(Throwable th);
    }

    @C0344h1
    public C22218a(ExecutorService executorService) {
        this.f57073a = executorService;
    }

    /* renamed from: a */
    public static int m101142a() {
        if (f57072x == 0) {
            f57072x = Math.min(4, C22229b.m101164a());
        }
        return f57072x;
    }

    /* renamed from: b */
    public static C22220b m101143b() {
        int i;
        if (m101142a() >= 4) {
            i = 2;
        } else {
            i = 1;
        }
        return new C22220b(true).mo66083c(i).mo66082b(f57069g);
    }

    /* renamed from: c */
    public static C22218a m101144c() {
        return m101143b().mo66081a();
    }

    @Deprecated
    /* renamed from: d */
    public static C22218a m101145d(int i, C22225e eVar) {
        return m101143b().mo66083c(i).mo66085e(eVar).mo66081a();
    }

    /* renamed from: e */
    public static C22220b m101146e() {
        return new C22220b(true).mo66083c(1).mo66082b(f57065c);
    }

    /* renamed from: f */
    public static C22218a m101147f() {
        return m101146e().mo66081a();
    }

    @Deprecated
    /* renamed from: h */
    public static C22218a m101148h(int i, String str, C22225e eVar) {
        return m101146e().mo66083c(i).mo66082b(str).mo66085e(eVar).mo66081a();
    }

    @Deprecated
    /* renamed from: i */
    public static C22218a m101149i(C22225e eVar) {
        return m101146e().mo66085e(eVar).mo66081a();
    }

    /* renamed from: j */
    public static C22220b m101150j() {
        return new C22220b(false).mo66083c(m101142a()).mo66082b("source");
    }

    /* renamed from: k */
    public static C22218a m101151k() {
        return m101150j().mo66081a();
    }

    @Deprecated
    /* renamed from: l */
    public static C22218a m101152l(int i, String str, C22225e eVar) {
        return m101150j().mo66083c(i).mo66082b(str).mo66085e(eVar).mo66081a();
    }

    @Deprecated
    /* renamed from: m */
    public static C22218a m101153m(C22225e eVar) {
        return m101150j().mo66085e(eVar).mo66081a();
    }

    /* renamed from: n */
    public static C22218a m101154n() {
        return new C22218a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f57070v, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C22223d(new C22221c(), f57068f, C22225e.f57094d, false)));
    }

    public boolean awaitTermination(long j, @C0359n0 TimeUnit timeUnit) throws InterruptedException {
        return this.f57073a.awaitTermination(j, timeUnit);
    }

    public void execute(@C0359n0 Runnable runnable) {
        this.f57073a.execute(runnable);
    }

    @C0359n0
    public <T> List<Future<T>> invokeAll(@C0359n0 Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f57073a.invokeAll(collection);
    }

    @C0359n0
    public <T> T invokeAny(@C0359n0 Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f57073a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f57073a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f57073a.isTerminated();
    }

    public void shutdown() {
        this.f57073a.shutdown();
    }

    @C0359n0
    public List<Runnable> shutdownNow() {
        return this.f57073a.shutdownNow();
    }

    @C0359n0
    public Future<?> submit(@C0359n0 Runnable runnable) {
        return this.f57073a.submit(runnable);
    }

    public String toString() {
        return this.f57073a.toString();
    }

    @C0359n0
    public <T> List<Future<T>> invokeAll(@C0359n0 Collection<? extends Callable<T>> collection, long j, @C0359n0 TimeUnit timeUnit) throws InterruptedException {
        return this.f57073a.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(@C0359n0 Collection<? extends Callable<T>> collection, long j, @C0359n0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f57073a.invokeAny(collection, j, timeUnit);
    }

    @C0359n0
    public <T> Future<T> submit(@C0359n0 Runnable runnable, T t) {
        return this.f57073a.submit(runnable, t);
    }

    public <T> Future<T> submit(@C0359n0 Callable<T> callable) {
        return this.f57073a.submit(callable);
    }
}
