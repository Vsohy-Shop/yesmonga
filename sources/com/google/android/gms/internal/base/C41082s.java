package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.base.s */
public final class C41082s implements C41080q {
    public /* synthetic */ C41082s(C41081r rVar) {
    }

    /* renamed from: a */
    public final ExecutorService mo134898a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: b */
    public final ExecutorService mo134899b(int i, int i2) {
        return mo134898a(4, Executors.defaultThreadFactory(), 2);
    }

    /* renamed from: c */
    public final ExecutorService mo134900c(ThreadFactory threadFactory, int i) {
        return mo134898a(1, threadFactory, 1);
    }

    public C41082s() {
    }
}
