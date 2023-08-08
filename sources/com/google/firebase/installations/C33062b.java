package com.google.firebase.installations;

import androidx.annotation.C0359n0;
import com.google.android.gms.tasks.C31035e;
import com.google.android.gms.tasks.C31047k;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.installations.b */
public final class C33062b implements C31035e<Void> {

    /* renamed from: a */
    public final CountDownLatch f80198a = new CountDownLatch(1);

    /* renamed from: a */
    public boolean mo95786a(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f80198a.await(j, timeUnit);
    }

    /* renamed from: b */
    public void mo95787b() {
        this.f80198a.countDown();
    }

    public void onComplete(@C0359n0 C31047k<Void> kVar) {
        this.f80198a.countDown();
    }
}
