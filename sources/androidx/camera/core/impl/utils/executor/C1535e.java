package androidx.camera.core.impl.utils.executor;

import androidx.annotation.C0359n0;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.impl.utils.executor.e */
public final class C1535e implements Executor {

    /* renamed from: b */
    public static volatile Executor f4398b;

    /* renamed from: a */
    public final ExecutorService f4399a = Executors.newFixedThreadPool(2, new C1536a());

    /* renamed from: androidx.camera.core.impl.utils.executor.e$a */
    public class C1536a implements ThreadFactory {

        /* renamed from: c */
        public static final String f4400c = "CameraX-camerax_io_%d";

        /* renamed from: a */
        public final AtomicInteger f4401a = new AtomicInteger(0);

        public C1536a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, f4400c, new Object[]{Integer.valueOf(this.f4401a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    public static Executor m6453a() {
        if (f4398b != null) {
            return f4398b;
        }
        synchronized (C1535e.class) {
            if (f4398b == null) {
                f4398b = new C1535e();
            }
        }
        return f4398b;
    }

    public void execute(@C0359n0 Runnable runnable) {
        this.f4399a.execute(runnable);
    }
}
