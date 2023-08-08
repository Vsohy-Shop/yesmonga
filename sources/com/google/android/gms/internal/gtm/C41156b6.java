package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.gtm.b6 */
public final class C41156b6 extends ThreadPoolExecutor {

    /* renamed from: a */
    public final Context f104455a;

    public C41156b6(Context context, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(1, 1, 0, timeUnit, blockingQueue, threadFactory);
        this.f104455a = context;
    }

    public final void afterExecute(Runnable runnable, Throwable th) {
        if (th != null) {
            C41660w5.m168644b("Uncaught exception: ", th, this.f104455a);
        }
    }
}
