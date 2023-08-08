package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t6 */
public final class C42191t6 {

    /* renamed from: a */
    public static volatile zzii f106424a;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        throw r14;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0142 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzii m170869a(android.content.Context r14) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.t6> r0 = com.google.android.gms.internal.measurement.C42191t6.class
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzii r1 = f106424a     // Catch:{ all -> 0x015d }
            if (r1 != 0) goto L_0x015b
            java.lang.String r1 = android.os.Build.TYPE     // Catch:{ all -> 0x015d }
            java.lang.String r2 = android.os.Build.TAGS     // Catch:{ all -> 0x015d }
            java.lang.String r3 = "eng"
            boolean r3 = r1.equals(r3)     // Catch:{ all -> 0x015d }
            if (r3 != 0) goto L_0x001b
            java.lang.String r3 = "userdebug"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x015d }
            if (r1 == 0) goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "dev-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x015d }
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = "test-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x015d }
            if (r1 == 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            com.google.android.gms.internal.measurement.zzii r14 = com.google.android.gms.internal.measurement.zzii.m171304c()     // Catch:{ all -> 0x015d }
        L_0x0030:
            r1 = r14
            goto L_0x0153
        L_0x0033:
            boolean r1 = com.google.android.gms.internal.measurement.C41964g6.m169997b()     // Catch:{ all -> 0x015d }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r14.isDeviceProtectedStorage()     // Catch:{ all -> 0x015d }
            if (r1 != 0) goto L_0x0043
            android.content.Context r14 = r14.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x015d }
        L_0x0043:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x015d }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0156 }
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r4 = "phenotype_hermetic"
            java.io.File r4 = r14.getDir(r4, r2)     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r5 = "overrides.txt"
            r3.<init>(r4, r5)     // Catch:{ RuntimeException -> 0x0068 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0156 }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.measurement.zzii r3 = com.google.android.gms.internal.measurement.zzii.m171305d(r3)     // Catch:{ all -> 0x0156 }
            goto L_0x006c
        L_0x0063:
            com.google.android.gms.internal.measurement.zzii r3 = com.google.android.gms.internal.measurement.zzii.m171304c()     // Catch:{ all -> 0x0156 }
            goto L_0x006c
        L_0x0068:
            com.google.android.gms.internal.measurement.zzii r3 = com.google.android.gms.internal.measurement.zzii.m171304c()     // Catch:{ all -> 0x0156 }
        L_0x006c:
            boolean r4 = r3.mo137539b()     // Catch:{ all -> 0x0156 }
            if (r4 == 0) goto L_0x014a
            java.lang.Object r3 = r3.mo137538a()     // Catch:{ all -> 0x0156 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0156 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0143 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0143 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0143 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0143 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0143 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0143 }
            r5 = 1
            androidx.collection.l r6 = new androidx.collection.l     // Catch:{ all -> 0x0127 }
            r6.<init>()     // Catch:{ all -> 0x0127 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0127 }
            r7.<init>()     // Catch:{ all -> 0x0127 }
        L_0x0092:
            java.lang.String r8 = r4.readLine()     // Catch:{ all -> 0x0127 }
            if (r8 == 0) goto L_0x00fd
            java.lang.String r9 = " "
            r10 = 3
            java.lang.String[] r9 = r8.split(r9, r10)     // Catch:{ all -> 0x0127 }
            int r11 = r9.length     // Catch:{ all -> 0x0127 }
            if (r11 == r10) goto L_0x00b0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0127 }
            r9.<init>()     // Catch:{ all -> 0x0127 }
            java.lang.String r10 = "Invalid: "
            r9.append(r10)     // Catch:{ all -> 0x0127 }
            r9.append(r8)     // Catch:{ all -> 0x0127 }
            goto L_0x0092
        L_0x00b0:
            r8 = r9[r2]     // Catch:{ all -> 0x0127 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0127 }
            r10.<init>(r8)     // Catch:{ all -> 0x0127 }
            r8 = r9[r5]     // Catch:{ all -> 0x0127 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0127 }
            r11.<init>(r8)     // Catch:{ all -> 0x0127 }
            java.lang.String r8 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x0127 }
            r11 = 2
            r12 = r9[r11]     // Catch:{ all -> 0x0127 }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ all -> 0x0127 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0127 }
            if (r12 != 0) goto L_0x00e5
            r9 = r9[r11]     // Catch:{ all -> 0x0127 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0127 }
            r11.<init>(r9)     // Catch:{ all -> 0x0127 }
            java.lang.String r12 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x0127 }
            int r9 = r12.length()     // Catch:{ all -> 0x0127 }
            r13 = 1024(0x400, float:1.435E-42)
            if (r9 < r13) goto L_0x00e2
            if (r12 != r11) goto L_0x00e5
        L_0x00e2:
            r7.put(r11, r12)     // Catch:{ all -> 0x0127 }
        L_0x00e5:
            boolean r9 = r6.containsKey(r10)     // Catch:{ all -> 0x0127 }
            if (r9 != 0) goto L_0x00f3
            androidx.collection.l r9 = new androidx.collection.l     // Catch:{ all -> 0x0127 }
            r9.<init>()     // Catch:{ all -> 0x0127 }
            r6.put(r10, r9)     // Catch:{ all -> 0x0127 }
        L_0x00f3:
            java.lang.Object r9 = r6.get(r10)     // Catch:{ all -> 0x0127 }
            androidx.collection.l r9 = (androidx.collection.C1886l) r9     // Catch:{ all -> 0x0127 }
            r9.put(r8, r12)     // Catch:{ all -> 0x0127 }
            goto L_0x0092
        L_0x00fd:
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0127 }
            java.lang.String r14 = r14.getPackageName()     // Catch:{ all -> 0x0127 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0127 }
            r7.<init>()     // Catch:{ all -> 0x0127 }
            java.lang.String r8 = "Parsed "
            r7.append(r8)     // Catch:{ all -> 0x0127 }
            r7.append(r3)     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = " for Android package "
            r7.append(r3)     // Catch:{ all -> 0x0127 }
            r7.append(r14)     // Catch:{ all -> 0x0127 }
            com.google.android.gms.internal.measurement.m6 r14 = new com.google.android.gms.internal.measurement.m6     // Catch:{ all -> 0x0127 }
            r14.<init>(r6)     // Catch:{ all -> 0x0127 }
            r4.close()     // Catch:{ IOException -> 0x0143 }
            com.google.android.gms.internal.measurement.zzii r14 = com.google.android.gms.internal.measurement.zzii.m171305d(r14)     // Catch:{ all -> 0x0156 }
            goto L_0x014e
        L_0x0127:
            r14 = move-exception
            r4.close()     // Catch:{ all -> 0x012c }
            goto L_0x0142
        L_0x012c:
            r3 = move-exception
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0142 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r2] = r8     // Catch:{ Exception -> 0x0142 }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0142 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0142 }
            r5[r2] = r3     // Catch:{ Exception -> 0x0142 }
            r4.invoke(r14, r5)     // Catch:{ Exception -> 0x0142 }
        L_0x0142:
            throw r14     // Catch:{ IOException -> 0x0143 }
        L_0x0143:
            r14 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0156 }
            r2.<init>(r14)     // Catch:{ all -> 0x0156 }
            throw r2     // Catch:{ all -> 0x0156 }
        L_0x014a:
            com.google.android.gms.internal.measurement.zzii r14 = com.google.android.gms.internal.measurement.zzii.m171304c()     // Catch:{ all -> 0x0156 }
        L_0x014e:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x015d }
            goto L_0x0030
        L_0x0153:
            f106424a = r1     // Catch:{ all -> 0x015d }
            goto L_0x015b
        L_0x0156:
            r14 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x015d }
            throw r14     // Catch:{ all -> 0x015d }
        L_0x015b:
            monitor-exit(r0)     // Catch:{ all -> 0x015d }
            return r1
        L_0x015d:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x015d }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42191t6.m170869a(android.content.Context):com.google.android.gms.internal.measurement.zzii");
    }
}
