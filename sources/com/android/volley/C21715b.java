package com.android.volley;

import androidx.annotation.RestrictTo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.android.volley.b */
public abstract class C21715b implements C21760j {

    /* renamed from: a */
    public ExecutorService f56174a;

    /* renamed from: b */
    public ExecutorService f56175b;

    /* renamed from: c */
    public ScheduledExecutorService f56176c;

    /* renamed from: com.android.volley.b$a */
    public class C21716a implements C21717b {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f56177a;

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f56178b;

        /* renamed from: c */
        public final /* synthetic */ AtomicReference f56179c;

        public C21716a(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f56177a = atomicReference;
            this.f56178b = countDownLatch;
            this.f56179c = atomicReference2;
        }

        /* renamed from: a */
        public void mo64842a(VolleyError volleyError) {
            this.f56179c.set(volleyError);
            this.f56178b.countDown();
        }

        /* renamed from: b */
        public void mo64843b(C21762l lVar) {
            this.f56177a.set(lVar);
            this.f56178b.countDown();
        }
    }

    /* renamed from: com.android.volley.b$b */
    public interface C21717b {
        /* renamed from: a */
        void mo64842a(VolleyError volleyError);

        /* renamed from: b */
        void mo64843b(C21762l lVar);
    }

    /* renamed from: a */
    public C21762l mo64834a(Request<?> request) throws VolleyError {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        mo64838e(request, new C21716a(atomicReference, countDownLatch, atomicReference2));
        try {
            countDownLatch.await();
            if (atomicReference.get() != null) {
                return (C21762l) atomicReference.get();
            }
            if (atomicReference2.get() != null) {
                throw ((VolleyError) atomicReference2.get());
            }
            throw new VolleyError("Neither response entry was set");
        } catch (InterruptedException e) {
            C21776s.m100100d(e, "while waiting for CountDownLatch", new Object[0]);
            Thread.currentThread().interrupt();
            throw new VolleyError((Throwable) e);
        }
    }

    /* renamed from: b */
    public ExecutorService mo64835b() {
        return this.f56174a;
    }

    /* renamed from: c */
    public ExecutorService mo64836c() {
        return this.f56175b;
    }

    /* renamed from: d */
    public ScheduledExecutorService mo64837d() {
        return this.f56176c;
    }

    /* renamed from: e */
    public abstract void mo64838e(Request<?> request, C21717b bVar);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public void mo64839f(ExecutorService executorService) {
        this.f56174a = executorService;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public void mo64840g(ExecutorService executorService) {
        this.f56175b = executorService;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public void mo64841h(ScheduledExecutorService scheduledExecutorService) {
        this.f56176c = scheduledExecutorService;
    }
}
