package com.google.android.gms.analytics;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.analytics.w */
public final class C40411w extends ThreadPoolExecutor {

    /* renamed from: a */
    public final /* synthetic */ C40372a0 f102991a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40411w(C40372a0 a0Var) {
        super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f102991a = a0Var;
        setThreadFactory(new C40413y((C40412x) null));
        allowCoreThreadTimeOut(true);
    }

    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C40410v(this, runnable, t);
    }
}
