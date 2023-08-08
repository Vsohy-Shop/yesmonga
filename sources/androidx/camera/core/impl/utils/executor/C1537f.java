package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.core.impl.utils.executor.f */
public final class C1537f {

    /* renamed from: a */
    public static volatile ScheduledExecutorService f4403a;

    /* renamed from: a */
    public static ScheduledExecutorService m6454a() {
        if (f4403a != null) {
            return f4403a;
        }
        synchronized (C1537f.class) {
            if (f4403a == null) {
                f4403a = new C1527c(new Handler(Looper.getMainLooper()));
            }
        }
        return f4403a;
    }
}
