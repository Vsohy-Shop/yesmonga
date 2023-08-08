package com.google.mlkit.common.sdkinternal;

import androidx.annotation.C0323b0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.p */
public class C33971p {

    /* renamed from: a */
    public final Object f82470a = new Object();
    @C0323b0("lock")

    /* renamed from: b */
    public boolean f82471b;
    @C0323b0("lock")

    /* renamed from: c */
    public final Queue<C33942g0> f82472c = new ArrayDeque();

    /* renamed from: d */
    public final AtomicReference<Thread> f82473d = new AtomicReference<>();

    @C40473a
    /* renamed from: a */
    public void mo98826a() {
        C40843u.m166208r(Thread.currentThread().equals(this.f82473d.get()));
    }

    @C40473a
    /* renamed from: b */
    public void mo98827b(@RecentlyNonNull Executor executor, @RecentlyNonNull Runnable runnable) {
        synchronized (this.f82470a) {
            if (this.f82471b) {
                this.f82472c.add(new C33942g0(executor, runnable, (C33940f0) null));
                return;
            }
            this.f82471b = true;
            mo98829f(executor, runnable);
        }
    }

    /* renamed from: e */
    public final void mo98828e() {
        synchronized (this.f82470a) {
            if (this.f82472c.isEmpty()) {
                this.f82471b = false;
                return;
            }
            C33942g0 remove = this.f82472c.remove();
            mo98829f(remove.f82360a, remove.f82361b);
        }
    }

    /* renamed from: f */
    public final void mo98829f(Executor executor, Runnable runnable) {
        try {
            executor.execute(new C33938e0(this, runnable));
        } catch (RejectedExecutionException unused) {
            mo98828e();
        }
    }
}
