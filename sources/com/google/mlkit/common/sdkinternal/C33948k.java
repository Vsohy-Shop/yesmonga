package com.google.mlkit.common.sdkinternal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_common.C42468p;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.k */
public class C33948k extends C42468p {

    /* renamed from: b */
    public static final ThreadLocal<Deque<Runnable>> f82368b = new ThreadLocal<>();

    /* renamed from: a */
    public final ThreadPoolExecutor f82369a;

    public C33948k() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C33981z(defaultThreadFactory));
        this.f82369a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: d */
    public static /* synthetic */ void m136591d(Runnable runnable) {
        f82368b.set(new ArrayDeque());
        runnable.run();
    }

    /* renamed from: e */
    public static void m136592e(Deque<Runnable> deque, Runnable runnable) {
        C40843u.m166202l(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = deque.peekFirst();
            } while (runnable != null);
        }
    }

    @RecentlyNonNull
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo98719a() {
        return this.f82369a;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final ExecutorService mo98720b() {
        return this.f82369a;
    }

    public final void execute(@RecentlyNonNull Runnable runnable) {
        Deque deque = f82368b.get();
        if (deque == null || deque.size() > 1) {
            this.f82369a.execute(new C33979x(runnable));
        } else {
            m136592e(deque, runnable);
        }
    }
}
