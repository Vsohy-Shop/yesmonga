package com.google.android.gms.internal.measurement;

import android.os.UserManager;
import androidx.annotation.C0323b0;
import androidx.annotation.C0352k;

/* renamed from: com.google.android.gms.internal.measurement.g6 */
public final class C41964g6 {
    @C0323b0("DirectBootUtils.class")

    /* renamed from: a */
    public static UserManager f106148a;

    /* renamed from: b */
    public static volatile boolean f106149b = (!m169997b());

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        r7 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0041 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m169996a(android.content.Context r7) {
        /*
            boolean r0 = m169997b()
            r1 = 0
            if (r0 == 0) goto L_0x0056
            boolean r0 = f106149b
            if (r0 == 0) goto L_0x000c
            goto L_0x0056
        L_0x000c:
            java.lang.Class<com.google.android.gms.internal.measurement.g6> r0 = com.google.android.gms.internal.measurement.C41964g6.class
            monitor-enter(r0)
            boolean r2 = f106149b     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            goto L_0x0056
        L_0x0015:
            r2 = 1
            r3 = r2
        L_0x0017:
            r4 = 2
            r5 = 0
            if (r3 > r4) goto L_0x0046
            android.os.UserManager r4 = f106148a     // Catch:{ all -> 0x0053 }
            if (r4 != 0) goto L_0x0029
            java.lang.Class<android.os.UserManager> r4 = android.os.UserManager.class
            java.lang.Object r4 = r7.getSystemService(r4)     // Catch:{ all -> 0x0053 }
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch:{ all -> 0x0053 }
            f106148a = r4     // Catch:{ all -> 0x0053 }
        L_0x0029:
            android.os.UserManager r4 = f106148a     // Catch:{ all -> 0x0053 }
            if (r4 != 0) goto L_0x002f
            r7 = r2
            goto L_0x004b
        L_0x002f:
            boolean r6 = r4.isUserUnlocked()     // Catch:{ NullPointerException -> 0x0041 }
            if (r6 != 0) goto L_0x003f
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch:{ NullPointerException -> 0x0041 }
            boolean r7 = r4.isUserRunning(r6)     // Catch:{ NullPointerException -> 0x0041 }
            if (r7 != 0) goto L_0x0046
        L_0x003f:
            r7 = r2
            goto L_0x0047
        L_0x0041:
            f106148a = r5     // Catch:{ all -> 0x0053 }
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0046:
            r7 = r1
        L_0x0047:
            if (r7 == 0) goto L_0x004b
            f106148a = r5     // Catch:{ all -> 0x0053 }
        L_0x004b:
            if (r7 == 0) goto L_0x004f
            f106149b = r2     // Catch:{ all -> 0x0053 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            if (r7 != 0) goto L_0x0056
            return r2
        L_0x0053:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r7
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41964g6.m169996a(android.content.Context):boolean");
    }

    @C0352k(api = 24)
    /* renamed from: b */
    public static boolean m169997b() {
        return true;
    }
}
