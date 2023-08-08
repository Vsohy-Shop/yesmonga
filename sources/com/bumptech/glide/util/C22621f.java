package com.bumptech.glide.util;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.util.f */
public final class C22621f {

    /* renamed from: a */
    public static final Executor f58011a = new C22622a();

    /* renamed from: b */
    public static final Executor f58012b = new C22623b();

    /* renamed from: com.bumptech.glide.util.f$a */
    public class C22622a implements Executor {
        public void execute(@C0359n0 Runnable runnable) {
            C22635o.m102649x(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.util.f$b */
    public class C22623b implements Executor {
        public void execute(@C0359n0 Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m102597a() {
        return f58012b;
    }

    /* renamed from: b */
    public static Executor m102598b() {
        return f58011a;
    }

    @C0344h1
    /* renamed from: c */
    public static void m102599c(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5, timeUnit)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(5, timeUnit)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
