package com.google.android.gms.tasks;

import androidx.annotation.C0359n0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.tasks.s */
public final class C31063s<T> implements C31065t<T> {

    /* renamed from: a */
    public final CountDownLatch f74327a = new CountDownLatch(1);

    public C31063s() {
    }

    /* renamed from: a */
    public final void mo82228a(T t) {
        this.f74327a.countDown();
    }

    /* renamed from: b */
    public final void mo87762b() throws InterruptedException {
        this.f74327a.await();
    }

    /* renamed from: c */
    public final boolean mo87763c(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f74327a.await(j, timeUnit);
    }

    public final void onCanceled() {
        this.f74327a.countDown();
    }

    public final void onFailure(@C0359n0 Exception exc) {
        this.f74327a.countDown();
    }

    public /* synthetic */ C31063s(C31061r rVar) {
    }
}
