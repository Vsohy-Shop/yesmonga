package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.arch.core.executor.d */
public class C0830d extends C0834f {

    /* renamed from: a */
    public final Object f2654a = new Object();

    /* renamed from: b */
    public final ExecutorService f2655b = Executors.newFixedThreadPool(4, new C0831a());
    @C0363p0

    /* renamed from: c */
    public volatile Handler f2656c;

    /* renamed from: androidx.arch.core.executor.d$a */
    public class C0831a implements ThreadFactory {

        /* renamed from: c */
        public static final String f2657c = "arch_disk_io_";

        /* renamed from: a */
        public final AtomicInteger f2658a = new AtomicInteger(0);

        public C0831a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(f2657c + this.f2658a.getAndIncrement());
            return thread;
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.arch.core.executor.d$b */
    public static class C0832b {
        @C0359n0
        /* renamed from: a */
        public static Handler m3983a(@C0359n0 Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @C0359n0
    /* renamed from: e */
    public static Handler m3979e(@C0359n0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0832b.m3983a(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    /* renamed from: a */
    public void mo3795a(@C0359n0 Runnable runnable) {
        this.f2655b.execute(runnable);
    }

    /* renamed from: c */
    public boolean mo3796c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: d */
    public void mo3797d(@C0359n0 Runnable runnable) {
        if (this.f2656c == null) {
            synchronized (this.f2654a) {
                if (this.f2656c == null) {
                    this.f2656c = m3979e(Looper.getMainLooper());
                }
            }
        }
        this.f2656c.post(runnable);
    }
}
