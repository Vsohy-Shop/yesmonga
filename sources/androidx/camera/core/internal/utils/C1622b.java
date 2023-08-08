package androidx.camera.core.internal.utils;

/* renamed from: androidx.camera.core.internal.utils.b */
public final class C1622b {

    /* renamed from: a */
    public static final String f4556a = "VideoUtil";

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    @androidx.annotation.C0363p0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m6678a(@androidx.annotation.C0359n0 android.content.ContentResolver r8, @androidx.annotation.C0359n0 android.net.Uri r9) {
        /*
            java.lang.String r0 = "_data"
            r1 = 0
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ RuntimeException -> 0x002b }
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ RuntimeException -> 0x002b }
            java.lang.Object r8 = androidx.core.util.C18001r.m81775l(r1)     // Catch:{ RuntimeException -> 0x002b }
            android.database.Cursor r8 = (android.database.Cursor) r8     // Catch:{ RuntimeException -> 0x002b }
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ RuntimeException -> 0x0028, all -> 0x0025 }
            r8.moveToFirst()     // Catch:{ RuntimeException -> 0x0028, all -> 0x0025 }
            java.lang.String r9 = r8.getString(r0)     // Catch:{ RuntimeException -> 0x0028, all -> 0x0025 }
            r8.close()
            return r9
        L_0x0025:
            r9 = move-exception
            r1 = r8
            goto L_0x0051
        L_0x0028:
            r0 = move-exception
            r1 = r8
            goto L_0x002c
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            java.lang.String r8 = "VideoUtil"
            java.lang.String r2 = "Failed in getting absolute path for Uri %s with Exception %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0050 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0050 }
            r4 = 0
            r3[r4] = r9     // Catch:{ all -> 0x0050 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0050 }
            r0 = 1
            r3[r0] = r9     // Catch:{ all -> 0x0050 }
            java.lang.String r9 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0050 }
            androidx.camera.core.C1417i2.m5913c(r8, r9)     // Catch:{ all -> 0x0050 }
            java.lang.String r8 = ""
            if (r1 == 0) goto L_0x004f
            r1.close()
        L_0x004f:
            return r8
        L_0x0050:
            r9 = move-exception
        L_0x0051:
            if (r1 == 0) goto L_0x0056
            r1.close()
        L_0x0056:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.utils.C1622b.m6678a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
