package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.crashlytics.internal.analytics.c */
public class C32658c implements C32657b, C32656a {

    /* renamed from: g */
    public static final String f79220g = "_ae";

    /* renamed from: a */
    public final C32660e f79221a;

    /* renamed from: b */
    public final int f79222b;

    /* renamed from: c */
    public final TimeUnit f79223c;

    /* renamed from: d */
    public final Object f79224d = new Object();

    /* renamed from: e */
    public CountDownLatch f79225e;

    /* renamed from: f */
    public boolean f79226f = false;

    public C32658c(@C0359n0 C32660e eVar, int i, TimeUnit timeUnit) {
        this.f79221a = eVar;
        this.f79222b = i;
        this.f79223c = timeUnit;
    }

    /* renamed from: U0 */
    public void mo94844U0(@C0359n0 String str, @C0359n0 Bundle bundle) {
        CountDownLatch countDownLatch = this.f79225e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        com.google.firebase.crashlytics.internal.C32741f.m132248f().mo95054d("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94808a(@androidx.annotation.C0359n0 java.lang.String r6, @androidx.annotation.C0363p0 android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f79224d
            monitor-enter(r0)
            com.google.firebase.crashlytics.internal.f r1 = com.google.firebase.crashlytics.internal.C32741f.m132248f()     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r2.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006d }
            r1.mo95060k(r2)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x006d }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x006d }
            r5.f79225e = r1     // Catch:{ all -> 0x006d }
            r1 = 0
            r5.f79226f = r1     // Catch:{ all -> 0x006d }
            com.google.firebase.crashlytics.internal.analytics.e r1 = r5.f79221a     // Catch:{ all -> 0x006d }
            r1.mo94808a(r6, r7)     // Catch:{ all -> 0x006d }
            com.google.firebase.crashlytics.internal.f r6 = com.google.firebase.crashlytics.internal.C32741f.m132248f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Awaiting app exception callback from Analytics..."
            r6.mo95060k(r7)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r6 = r5.f79225e     // Catch:{ InterruptedException -> 0x005f }
            int r7 = r5.f79222b     // Catch:{ InterruptedException -> 0x005f }
            long r3 = (long) r7     // Catch:{ InterruptedException -> 0x005f }
            java.util.concurrent.TimeUnit r7 = r5.f79223c     // Catch:{ InterruptedException -> 0x005f }
            boolean r6 = r6.await(r3, r7)     // Catch:{ InterruptedException -> 0x005f }
            if (r6 == 0) goto L_0x0055
            r5.f79226f = r2     // Catch:{ InterruptedException -> 0x005f }
            com.google.firebase.crashlytics.internal.f r6 = com.google.firebase.crashlytics.internal.C32741f.m132248f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "App exception callback received from Analytics listener."
            r6.mo95060k(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x0055:
            com.google.firebase.crashlytics.internal.f r6 = com.google.firebase.crashlytics.internal.C32741f.m132248f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r6.mo95062m(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x005f:
            com.google.firebase.crashlytics.internal.f r6 = com.google.firebase.crashlytics.internal.C32741f.m132248f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Interrupted while awaiting app exception callback from Analytics listener."
            r6.mo95054d(r7)     // Catch:{ all -> 0x006d }
        L_0x0068:
            r6 = 0
            r5.f79225e = r6     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.analytics.C32658c.mo94808a(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: b */
    public boolean mo94845b() {
        return this.f79226f;
    }
}
