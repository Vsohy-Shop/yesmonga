package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import com.google.firebase.crashlytics.internal.C32741f;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.firebase.crashlytics.internal.common.t */
public final class C32725t {

    /* renamed from: a */
    public static final long f79449a = 2;

    /* renamed from: com.google.firebase.crashlytics.internal.common.t$a */
    public class C32726a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f79450a;

        /* renamed from: b */
        public final /* synthetic */ AtomicLong f79451b;

        /* renamed from: com.google.firebase.crashlytics.internal.common.t$a$a */
        public class C32727a extends C32671c {

            /* renamed from: a */
            public final /* synthetic */ Runnable f79452a;

            public C32727a(Runnable runnable) {
                this.f79452a = runnable;
            }

            /* renamed from: a */
            public void mo94860a() {
                this.f79452a.run();
            }
        }

        public C32726a(String str, AtomicLong atomicLong) {
            this.f79450a = str;
            this.f79451b = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C32727a(runnable));
            newThread.setName(this.f79450a + this.f79451b.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.t$b */
    public class C32728b extends C32671c {

        /* renamed from: a */
        public final /* synthetic */ String f79454a;

        /* renamed from: b */
        public final /* synthetic */ ExecutorService f79455b;

        /* renamed from: c */
        public final /* synthetic */ long f79456c;

        /* renamed from: d */
        public final /* synthetic */ TimeUnit f79457d;

        public C32728b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f79454a = str;
            this.f79455b = executorService;
            this.f79456c = j;
            this.f79457d = timeUnit;
        }

        /* renamed from: a */
        public void mo94860a() {
            try {
                C32741f f = C32741f.m132248f();
                f.mo95052b("Executing shutdown hook for " + this.f79454a);
                this.f79455b.shutdown();
                if (!this.f79455b.awaitTermination(this.f79456c, this.f79457d)) {
                    C32741f f2 = C32741f.m132248f();
                    f2.mo95052b(this.f79454a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f79455b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C32741f.m132248f().mo95052b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f79454a}));
                this.f79455b.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public static void m132191a(String str, ExecutorService executorService) {
        m132192b(str, executorService, 2, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: b */
    public static void m132192b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C32728b bVar = new C32728b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m132193c(String str) {
        ExecutorService f = m132196f(m132195e(str), new ThreadPoolExecutor.DiscardPolicy());
        m132191a(str, f);
        return f;
    }

    /* renamed from: d */
    public static ScheduledExecutorService m132194d(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(m132195e(str));
        m132191a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    /* renamed from: e */
    public static ThreadFactory m132195e(String str) {
        return new C32726a(str, new AtomicLong(1));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: f */
    public static ExecutorService m132196f(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
