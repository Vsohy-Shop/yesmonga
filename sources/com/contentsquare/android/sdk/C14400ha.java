package com.contentsquare.android.sdk;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.contentsquare.android.sdk.ha */
public class C14400ha {

    /* renamed from: c */
    public static final int f35602c = Runtime.getRuntime().availableProcessors();

    /* renamed from: d */
    public static final TimeUnit f35603d = TimeUnit.SECONDS;

    /* renamed from: e */
    public static final C14453jf f35604e = new C14453jf("ThreadExecutor");

    /* renamed from: a */
    public final BlockingQueue<Runnable> f35605a;

    /* renamed from: b */
    public ThreadPoolExecutor f35606b;

    /* renamed from: com.contentsquare.android.sdk.ha$a */
    public class C14401a implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            if (runnable instanceof C14657qf) {
                C14400ha.f35604e.mo35676e("Transaction Rejected! rolling back.");
                ((C14657qf) runnable).mo36282b();
                return;
            }
            C14400ha.f35604e.mo35677f("Rejected! Cannot rollback! Not an instance of TransactionRunnable", new Object[0]);
        }
    }

    public C14400ha() {
        this(new ArrayBlockingQueue(10), new C14401a());
    }

    /* renamed from: a */
    public <T> Future<T> mo35502a(Callable<T> callable) {
        return this.f35606b.submit(callable);
    }

    public C14400ha(BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        C14453jf jfVar = f35604e;
        int i = f35602c;
        jfVar.mo35674c("Building a thredpool executor maxSize %d", Integer.valueOf(i));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, i, 30, f35603d, blockingQueue, rejectedExecutionHandler);
        this.f35606b = threadPoolExecutor;
        this.f35605a = blockingQueue;
        threadPoolExecutor.allowCoreThreadTimeOut(false);
    }
}
