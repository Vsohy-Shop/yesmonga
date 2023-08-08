package androidx.camera.core;

import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.camera.core.impl.C1477m;
import androidx.core.util.C18001r;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.k */
public class C1629k implements Executor {

    /* renamed from: c */
    public static final int f4565c = 1;

    /* renamed from: d */
    public static final int f4566d = 1;

    /* renamed from: e */
    public static final ThreadFactory f4567e = new C1630a();

    /* renamed from: a */
    public final Object f4568a = new Object();
    @C0323b0("mExecutorLock")
    @C0359n0

    /* renamed from: b */
    public ThreadPoolExecutor f4569b = m6686a();

    /* renamed from: androidx.camera.core.k$a */
    public class C1630a implements ThreadFactory {

        /* renamed from: b */
        public static final String f4570b = "CameraX-core_camera_%d";

        /* renamed from: a */
        public final AtomicInteger f4571a = new AtomicInteger(0);

        public Thread newThread(@C0359n0 Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, f4570b, new Object[]{Integer.valueOf(this.f4571a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m6686a() {
        return new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f4567e);
    }

    /* renamed from: b */
    public void mo5612b() {
        synchronized (this.f4568a) {
            if (!this.f4569b.isShutdown()) {
                this.f4569b.shutdown();
            }
        }
    }

    /* renamed from: c */
    public void mo5613c(@C0359n0 C1477m mVar) {
        ThreadPoolExecutor threadPoolExecutor;
        C18001r.m81775l(mVar);
        synchronized (this.f4568a) {
            if (this.f4569b.isShutdown()) {
                this.f4569b = m6686a();
            }
            threadPoolExecutor = this.f4569b;
        }
        int max = Math.max(1, mVar.mo4718c().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    public void execute(@C0359n0 Runnable runnable) {
        C18001r.m81775l(runnable);
        synchronized (this.f4568a) {
            this.f4569b.execute(runnable);
        }
    }
}
