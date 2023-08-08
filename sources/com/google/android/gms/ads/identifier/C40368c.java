package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.C40974d0;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@C40974d0
/* renamed from: com.google.android.gms.ads.identifier.c */
public final class C40368c extends Thread {

    /* renamed from: a */
    public final WeakReference<C40365a> f102895a;

    /* renamed from: b */
    public final long f102896b;

    /* renamed from: c */
    public final CountDownLatch f102897c = new CountDownLatch(1);

    /* renamed from: d */
    public boolean f102898d = false;

    public C40368c(C40365a aVar, long j) {
        this.f102895a = new WeakReference<>(aVar);
        this.f102896b = j;
        start();
    }

    /* renamed from: a */
    public final void mo133254a() {
        C40365a aVar = this.f102895a.get();
        if (aVar != null) {
            aVar.mo133244f();
            this.f102898d = true;
        }
    }

    public final void run() {
        try {
            if (!this.f102897c.await(this.f102896b, TimeUnit.MILLISECONDS)) {
                mo133254a();
            }
        } catch (InterruptedException unused) {
            mo133254a();
        }
    }
}
