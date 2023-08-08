package com.google.android.play.core.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.tasks.t */
public final class C32243t implements C32226c, C32225b {

    /* renamed from: a */
    public final CountDownLatch f78599a = new CountDownLatch(1);

    public C32243t() {
    }

    /* renamed from: a */
    public final void mo32778a(Object obj) {
        this.f78599a.countDown();
    }

    /* renamed from: b */
    public final void mo93044b() throws InterruptedException {
        this.f78599a.await();
    }

    /* renamed from: c */
    public final boolean mo93045c(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f78599a.await(j, timeUnit);
    }

    public final void onFailure(Exception exc) {
        this.f78599a.countDown();
    }

    public /* synthetic */ C32243t(byte[] bArr) {
    }
}
