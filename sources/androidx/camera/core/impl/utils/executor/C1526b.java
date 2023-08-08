package androidx.camera.core.impl.utils.executor;

import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.utils.executor.b */
public final class C1526b implements Executor {

    /* renamed from: a */
    public static volatile C1526b f4381a;

    /* renamed from: a */
    public static Executor m6445a() {
        if (f4381a != null) {
            return f4381a;
        }
        synchronized (C1526b.class) {
            if (f4381a == null) {
                f4381a = new C1526b();
            }
        }
        return f4381a;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
