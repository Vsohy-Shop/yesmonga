package com.google.firebase.messaging.threads;

import android.annotation.SuppressLint;
import androidx.annotation.C0359n0;
import com.google.errorprone.annotations.C32495d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.threads.b */
public class C33245b {

    /* renamed from: a */
    public static final C33244a f80836a;

    /* renamed from: b */
    public static volatile C33244a f80837b;

    /* renamed from: com.google.firebase.messaging.threads.b$b */
    public static class C33247b implements C33244a {

        /* renamed from: a */
        public static final long f80838a = 60;

        public C33247b() {
        }

        @SuppressLint({"ThreadPoolCreation"})
        @C0359n0
        /* renamed from: a */
        public ExecutorService mo96197a(ThreadPriority threadPriority) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        }

        @SuppressLint({"ThreadPoolCreation"})
        @C0359n0
        /* renamed from: b */
        public ScheduledExecutorService mo96198b(int i, ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i, threadFactory));
        }

        @C0359n0
        /* renamed from: c */
        public ExecutorService mo96199c(ThreadPriority threadPriority) {
            return mo96204h(1, threadPriority);
        }

        @SuppressLint({"ThreadPoolCreation"})
        @C0359n0
        /* renamed from: d */
        public Future<?> mo96200d(@C32495d String str, @C32495d String str2, ThreadPriority threadPriority, Runnable runnable) {
            FutureTask futureTask = new FutureTask(runnable, (Object) null);
            new Thread(futureTask, str2).start();
            return futureTask;
        }

        @SuppressLint({"ThreadPoolCreation"})
        @C0359n0
        /* renamed from: e */
        public void mo96201e(@C32495d String str, @C32495d String str2, ThreadPriority threadPriority, Runnable runnable) {
            new Thread(runnable, str2).start();
        }

        @SuppressLint({"ThreadPoolCreation"})
        @C0359n0
        /* renamed from: f */
        public ScheduledExecutorService mo96202f(int i, ThreadPriority threadPriority) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i));
        }

        @SuppressLint({"ThreadPoolCreation"})
        @C0359n0
        /* renamed from: g */
        public ExecutorService mo96203g(int i, ThreadFactory threadFactory, ThreadPriority threadPriority) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }

        @C0359n0
        /* renamed from: h */
        public ExecutorService mo96204h(int i, ThreadPriority threadPriority) {
            return mo96203g(i, Executors.defaultThreadFactory(), threadPriority);
        }

        @C0359n0
        /* renamed from: i */
        public ExecutorService mo96205i(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return mo96203g(1, threadFactory, threadPriority);
        }

        @SuppressLint({"ThreadPoolCreation"})
        @C0359n0
        /* renamed from: j */
        public ExecutorService mo96206j(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory));
        }
    }

    static {
        C33247b bVar = new C33247b();
        f80836a = bVar;
        f80837b = bVar;
    }

    /* renamed from: a */
    public static C33244a m134091a() {
        return f80837b;
    }

    /* renamed from: b */
    public static void m134092b(C33244a aVar) {
        if (f80837b == f80836a) {
            f80837b = aVar;
            return;
        }
        throw new IllegalStateException("Trying to install an ExecutorFactory twice!");
    }
}
