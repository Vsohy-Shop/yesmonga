package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.emoji2.text.c */
public class C19011c {

    /* renamed from: a */
    public static final int f48367a = 15;

    @C0376v0(28)
    /* renamed from: androidx.emoji2.text.c$a */
    public static class C19012a {
        @C0373u
        /* renamed from: a */
        public static Handler m88841a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @C0359n0
    @Deprecated
    /* renamed from: b */
    public static Executor m88837b(@C0359n0 Handler handler) {
        Objects.requireNonNull(handler);
        return new C19010b(handler);
    }

    /* renamed from: c */
    public static ThreadPoolExecutor m88838c(@C0359n0 String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C19009a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: d */
    public static /* synthetic */ Thread m88839d(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: e */
    public static Handler m88840e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C19012a.m88841a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}
