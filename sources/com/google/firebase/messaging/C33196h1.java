package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.google.android.gms.stats.C30993d;
import com.google.errorprone.annotations.C32509r;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.h1 */
public final class C33196h1 {

    /* renamed from: a */
    public static final String f80709a = "com.google.firebase.iid.WakeLockHolder.wakefulintent";

    /* renamed from: b */
    public static final long f80710b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: c */
    public static final Object f80711c = new Object();
    @C0323b0("WakeLockHolder.syncObject")

    /* renamed from: d */
    public static C30993d f80712d;

    @C32509r(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    /* renamed from: b */
    public static void m133895b(Intent intent, long j) {
        synchronized (f80711c) {
            if (f80712d != null) {
                m133903j(intent, true);
                f80712d.mo87680a(j);
            }
        }
    }

    @C0323b0("WakeLockHolder.syncObject")
    /* renamed from: c */
    public static void m133896c(Context context) {
        if (f80712d == null) {
            C30993d dVar = new C30993d(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f80712d = dVar;
            dVar.mo87683d(true);
        }
    }

    /* renamed from: d */
    public static void m133897d(@C0359n0 Intent intent) {
        synchronized (f80711c) {
            if (f80712d != null && m133899f(intent)) {
                m133903j(intent, false);
                f80712d.mo87682c();
            }
        }
    }

    @C32509r(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    /* renamed from: e */
    public static void m133898e(Context context) {
        synchronized (f80711c) {
            m133896c(context);
        }
    }

    @C0344h1
    /* renamed from: f */
    public static boolean m133899f(@C0359n0 Intent intent) {
        return intent.getBooleanExtra(f80709a, false);
    }

    @C32509r(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    /* renamed from: h */
    public static void m133901h() {
        synchronized (f80711c) {
            f80712d = null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: i */
    public static void m133902i(Context context, C33213m1 m1Var, Intent intent) {
        synchronized (f80711c) {
            m133896c(context);
            boolean f = m133899f(intent);
            m133903j(intent, true);
            if (!f) {
                f80712d.mo87680a(f80710b);
            }
            m1Var.mo96137c(intent).mo87721e(new C33193g1(intent));
        }
    }

    /* renamed from: j */
    public static void m133903j(@C0359n0 Intent intent, boolean z) {
        intent.putExtra(f80709a, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        return r3;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m133904k(@androidx.annotation.C0359n0 android.content.Context r3, @androidx.annotation.C0359n0 android.content.Intent r4) {
        /*
            java.lang.Object r0 = f80711c
            monitor-enter(r0)
            m133896c(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = m133899f(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            m133903j(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            r3 = 0
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            com.google.android.gms.stats.d r4 = f80712d     // Catch:{ all -> 0x0022 }
            long r1 = f80710b     // Catch:{ all -> 0x0022 }
            r4.mo87680a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C33196h1.m133904k(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
