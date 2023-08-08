package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import androidx.annotation.C0363p0;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.measurement.u0 */
public final class C42202u0 {
    @C0363p0

    /* renamed from: a */
    public static final Method f106437a;
    @C0363p0

    /* renamed from: b */
    public static final Method f106438b;

    static {
        Method method;
        Class<String> cls = String.class;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        f106437a = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
        }
        f106438b = method2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m170888a(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            r7.getClass()
            java.lang.reflect.Method r8 = f106437a
            if (r8 == 0) goto L_0x005b
            java.lang.String r8 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r8)
            if (r5 == 0) goto L_0x0018
            goto L_0x005b
        L_0x0018:
            java.lang.reflect.Method r5 = f106438b
            r8 = 0
            if (r5 == 0) goto L_0x002e
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002e }
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002e }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002e }
            if (r5 == 0) goto L_0x002e
            int r5 = r5.intValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002e }
            goto L_0x002f
        L_0x002e:
            r5 = r8
        L_0x002f:
            java.lang.String r0 = "UploadAlarm"
            java.lang.String r1 = "com.google.android.gms"
            java.lang.reflect.Method r2 = f106437a
            if (r2 == 0) goto L_0x0056
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            r3[r8] = r6     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            r4 = 1
            r3[r4] = r1     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            r1 = 2
            r3[r1] = r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            r5 = 3
            r3[r5] = r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            java.lang.Object r5 = r2.invoke(r7, r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            if (r5 == 0) goto L_0x005a
            int r8 = r5.intValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            int r8 = r7.schedule(r6)
        L_0x005a:
            return r8
        L_0x005b:
            int r5 = r7.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42202u0.m170888a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
