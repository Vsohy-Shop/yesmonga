package com.contentsquare.android.sdk;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.contentsquare.android.sdk.bb */
public class C14220bb {

    /* renamed from: a */
    public ThreadPoolExecutor f35126a;

    /* renamed from: b */
    public final C14453jf f35127b;

    /* renamed from: com.contentsquare.android.sdk.bb$a */
    public static class C14221a implements C14222b {
        /* renamed from: b */
        public static /* synthetic */ Thread m61049b(String str, Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName(str);
            return thread;
        }

        /* renamed from: a */
        public ThreadPoolExecutor mo34705a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler, String str) {
            return new ThreadPoolExecutor(i, i2, j, timeUnit, blockingQueue, new C14183ab(str), rejectedExecutionHandler);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.bb$b */
    public interface C14222b {
        /* renamed from: a */
        ThreadPoolExecutor mo34705a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler, String str);
    }

    public C14220bb(int i) {
        this(i, new C14221a());
    }

    /* renamed from: a */
    public static int m61044a(int i) {
        return 60;
    }

    /* renamed from: c */
    public static int m61045c(int i) {
        return i != 0 ? 1 : 0;
    }

    /* renamed from: d */
    public static RejectedExecutionHandler m61046d(int i) {
        return i != 0 ? i != 1 ? new ThreadPoolExecutor.AbortPolicy() : new ThreadPoolExecutor.AbortPolicy() : new ThreadPoolExecutor.AbortPolicy();
    }

    /* renamed from: e */
    public static String m61047e(int i) {
        return i != 0 ? i != 1 ? "cs" : "cs-cpu" : "cs-io";
    }

    /* renamed from: b */
    public synchronized boolean mo34704b(Runnable runnable) {
        try {
            this.f35126a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f35127b.mo35674c("addTask failed", e);
            return false;
        }
        return true;
    }

    public C14220bb(int i, C14222b bVar) {
        this.f35127b = new C14453jf("ThreadPool");
        C14222b bVar2 = bVar;
        this.f35126a = bVar2.mo34705a(m61045c(i), 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(m61044a(i), true), m61046d(i), m61047e(i));
    }
}
