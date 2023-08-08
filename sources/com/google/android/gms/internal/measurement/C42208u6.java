package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.u6 */
public final class C42208u6 {

    /* renamed from: a */
    public static volatile zzii f106446a = zzii.m171304c();

    /* renamed from: b */
    public static final Object f106447b = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L_0x0071;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m170901a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "com.google.android.gms.phenotype"
            java.lang.String r6 = r6.getAuthority()
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r5.concat(r6)
            return r1
        L_0x0017:
            com.google.android.gms.internal.measurement.zzii r6 = f106446a
            boolean r6 = r6.mo137539b()
            if (r6 == 0) goto L_0x002c
            com.google.android.gms.internal.measurement.zzii r5 = f106446a
            java.lang.Object r5 = r5.mo137538a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x002c:
            java.lang.Object r6 = f106447b
            monitor-enter(r6)
            com.google.android.gms.internal.measurement.zzii r0 = f106446a     // Catch:{ all -> 0x009a }
            boolean r0 = r0.mo137539b()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.measurement.zzii r5 = f106446a     // Catch:{ all -> 0x009a }
            java.lang.Object r5 = r5.mo137538a()     // Catch:{ all -> 0x009a }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x009a }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x009a }
            monitor-exit(r6)     // Catch:{ all -> 0x009a }
            return r5
        L_0x0045:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch:{ all -> 0x009a }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x0071
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x009a }
            r4 = 29
            if (r3 >= r4) goto L_0x005f
            r3 = r1
            goto L_0x0061
        L_0x005f:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0061:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0082
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x009a }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0082
        L_0x0071:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0082 }
            int r5 = r5.flags     // Catch:{ all -> 0x009a }
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x0082
            r1 = 1
        L_0x0082:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x009a }
            com.google.android.gms.internal.measurement.zzii r5 = com.google.android.gms.internal.measurement.zzii.m171305d(r5)     // Catch:{ all -> 0x009a }
            f106446a = r5     // Catch:{ all -> 0x009a }
            monitor-exit(r6)     // Catch:{ all -> 0x009a }
            com.google.android.gms.internal.measurement.zzii r5 = f106446a
            java.lang.Object r5 = r5.mo137538a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x009a:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x009a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42208u6.m170901a(android.content.Context, android.net.Uri):boolean");
    }
}
