package androidx.camera.core.impl.utils.executor;

import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.camera.core.impl.utils.executor.d */
public final class C1533d implements Executor {

    /* renamed from: b */
    public static volatile Executor f4394b;

    /* renamed from: a */
    public final ExecutorService f4395a = Executors.newSingleThreadExecutor(new C1534a());

    /* renamed from: androidx.camera.core.impl.utils.executor.d$a */
    public class C1534a implements ThreadFactory {

        /* renamed from: b */
        public static final String f4396b = "CameraX-camerax_high_priority";

        public C1534a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName(f4396b);
            return thread;
        }
    }

    /* renamed from: a */
    public static Executor m6452a() {
        if (f4394b != null) {
            return f4394b;
        }
        synchronized (C1533d.class) {
            if (f4394b == null) {
                f4394b = new C1533d();
            }
        }
        return f4394b;
    }

    public void execute(@C0359n0 Runnable runnable) {
        this.f4395a.execute(runnable);
    }
}
