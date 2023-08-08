package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.core.impl.utils.executor.a */
public final class C1525a {
    @C0359n0
    /* renamed from: a */
    public static Executor m6437a() {
        return C1526b.m6445a();
    }

    @C0359n0
    /* renamed from: b */
    public static Executor m6438b() {
        return C1533d.m6452a();
    }

    @C0359n0
    /* renamed from: c */
    public static Executor m6439c() {
        return C1535e.m6453a();
    }

    /* renamed from: d */
    public static boolean m6440d(@C0359n0 Executor executor) {
        return executor instanceof SequentialExecutor;
    }

    @C0359n0
    /* renamed from: e */
    public static ScheduledExecutorService m6441e() {
        return C1537f.m6454a();
    }

    @C0359n0
    /* renamed from: f */
    public static ScheduledExecutorService m6442f() {
        return C1527c.m6446b();
    }

    @C0359n0
    /* renamed from: g */
    public static ScheduledExecutorService m6443g(@C0359n0 Handler handler) {
        return new C1527c(handler);
    }

    @C0359n0
    /* renamed from: h */
    public static Executor m6444h(@C0359n0 Executor executor) {
        return new SequentialExecutor(executor);
    }
}
