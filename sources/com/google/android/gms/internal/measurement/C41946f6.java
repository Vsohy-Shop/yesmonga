package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.f6 */
public final class C41946f6 {

    /* renamed from: a */
    public static final Uri f106116a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f106117b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f106118c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f106119d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f106120e = new AtomicBoolean();

    /* renamed from: f */
    public static HashMap f106121f;

    /* renamed from: g */
    public static final HashMap f106122g = new HashMap(16, 1.0f);

    /* renamed from: h */
    public static final HashMap f106123h = new HashMap(16, 1.0f);

    /* renamed from: i */
    public static final HashMap f106124i = new HashMap(16, 1.0f);

    /* renamed from: j */
    public static final HashMap f106125j = new HashMap(16, 1.0f);

    /* renamed from: k */
    public static Object f106126k;

    /* renamed from: l */
    public static boolean f106127l;

    /* renamed from: m */
    public static final String[] f106128m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r11 = r11.query(f106116a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r12}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (r11 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r11.moveToFirst() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        m169875c(r0, r12, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r13 = r11.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r13 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r13.equals((java.lang.Object) null) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        m169875c(r0, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if (r13 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ad, code lost:
        throw r12;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m169873a(android.content.ContentResolver r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.f6> r13 = com.google.android.gms.internal.measurement.C41946f6.class
            monitor-enter(r13)
            java.util.HashMap r0 = f106121f     // Catch:{ all -> 0x00ae }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002e
            java.util.concurrent.atomic.AtomicBoolean r0 = f106120e     // Catch:{ all -> 0x00ae }
            r0.set(r2)     // Catch:{ all -> 0x00ae }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00ae }
            r4 = 16
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r4, r5)     // Catch:{ all -> 0x00ae }
            f106121f = r0     // Catch:{ all -> 0x00ae }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00ae }
            r0.<init>()     // Catch:{ all -> 0x00ae }
            f106126k = r0     // Catch:{ all -> 0x00ae }
            f106127l = r2     // Catch:{ all -> 0x00ae }
            android.net.Uri r0 = f106116a     // Catch:{ all -> 0x00ae }
            com.google.android.gms.internal.measurement.d6 r4 = new com.google.android.gms.internal.measurement.d6     // Catch:{ all -> 0x00ae }
            r4.<init>(r3)     // Catch:{ all -> 0x00ae }
            r11.registerContentObserver(r0, r1, r4)     // Catch:{ all -> 0x00ae }
            goto L_0x0058
        L_0x002e:
            java.util.concurrent.atomic.AtomicBoolean r0 = f106120e     // Catch:{ all -> 0x00ae }
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x0058
            java.util.HashMap r0 = f106121f     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.HashMap r0 = f106122g     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.HashMap r0 = f106123h     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.HashMap r0 = f106124i     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.HashMap r0 = f106125j     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00ae }
            r0.<init>()     // Catch:{ all -> 0x00ae }
            f106126k = r0     // Catch:{ all -> 0x00ae }
            f106127l = r2     // Catch:{ all -> 0x00ae }
        L_0x0058:
            java.lang.Object r0 = f106126k     // Catch:{ all -> 0x00ae }
            java.util.HashMap r4 = f106121f     // Catch:{ all -> 0x00ae }
            boolean r4 = r4.containsKey(r12)     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x0070
            java.util.HashMap r11 = f106121f     // Catch:{ all -> 0x00ae }
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x00ae }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00ae }
            if (r11 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r3 = r11
        L_0x006e:
            monitor-exit(r13)     // Catch:{ all -> 0x00ae }
            return r3
        L_0x0070:
            java.lang.String[] r4 = f106128m     // Catch:{ all -> 0x00ae }
            int r4 = r4.length     // Catch:{ all -> 0x00ae }
            monitor-exit(r13)     // Catch:{ all -> 0x00ae }
            android.net.Uri r6 = f106116a
            r7 = 0
            r8 = 0
            java.lang.String[] r9 = new java.lang.String[r1]
            r9[r2] = r12
            r10 = 0
            r5 = r11
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)
            if (r11 != 0) goto L_0x0085
            return r3
        L_0x0085:
            boolean r13 = r11.moveToFirst()     // Catch:{ all -> 0x00a9 }
            if (r13 != 0) goto L_0x0092
            m169875c(r0, r12, r3)     // Catch:{ all -> 0x00a9 }
            r11.close()
            return r3
        L_0x0092:
            java.lang.String r13 = r11.getString(r1)     // Catch:{ all -> 0x00a9 }
            r11.close()
            if (r13 == 0) goto L_0x00a2
            boolean r11 = r13.equals(r3)
            if (r11 == 0) goto L_0x00a2
            r13 = r3
        L_0x00a2:
            m169875c(r0, r12, r13)
            if (r13 == 0) goto L_0x00a8
            return r13
        L_0x00a8:
            return r3
        L_0x00a9:
            r12 = move-exception
            r11.close()
            throw r12
        L_0x00ae:
            r11 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00ae }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41946f6.m169873a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static void m169875c(Object obj, String str, String str2) {
        synchronized (C41946f6.class) {
            if (obj == f106126k) {
                f106121f.put(str, str2);
            }
        }
    }
}
