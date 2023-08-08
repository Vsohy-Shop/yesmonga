package com.google.android.material.color;

import androidx.annotation.C0376v0;

@C0376v0(30)
/* renamed from: com.google.android.material.color.h */
public final class C31233h {

    /* renamed from: a */
    public static final String f75152a = "h";

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0062 A[SYNTHETIC, Splitter:B:42:0x0062] */
    @androidx.annotation.C0363p0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.loader.ResourcesLoader m125820a(@androidx.annotation.C0359n0 android.content.Context r4, @androidx.annotation.C0359n0 java.util.Map<java.lang.Integer, java.lang.Integer> r5) {
        /*
            r0 = 0
            byte[] r4 = com.google.android.material.color.C31234i.m125829i(r4, r5)     // Catch:{ Exception -> 0x0066 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0066 }
            r5.<init>()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r1 = "Table created, length: "
            r5.append(r1)     // Catch:{ Exception -> 0x0066 }
            int r1 = r4.length     // Catch:{ Exception -> 0x0066 }
            r5.append(r1)     // Catch:{ Exception -> 0x0066 }
            int r5 = r4.length     // Catch:{ Exception -> 0x0066 }
            if (r5 != 0) goto L_0x0017
            return r0
        L_0x0017:
            java.lang.String r5 = "temp.arsc"
            r1 = 0
            java.io.FileDescriptor r5 = android.system.Os.memfd_create(r5, r1)     // Catch:{ all -> 0x005e }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x005c }
            r1.<init>(r5)     // Catch:{ all -> 0x005c }
            r1.write(r4)     // Catch:{ all -> 0x0052 }
            android.os.ParcelFileDescriptor r4 = android.os.ParcelFileDescriptor.dup(r5)     // Catch:{ all -> 0x0052 }
            com.google.android.material.color.C31232g.m125819a()     // Catch:{ all -> 0x0046 }
            android.content.res.loader.ResourcesLoader r2 = com.google.android.material.color.C31231f.m125818a()     // Catch:{ all -> 0x0046 }
            android.content.res.loader.ResourcesProvider r3 = android.content.res.loader.ResourcesProvider.loadFromTable(r4, r0)     // Catch:{ all -> 0x0046 }
            r2.addProvider(r3)     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x003d
            r4.close()     // Catch:{ all -> 0x0052 }
        L_0x003d:
            r1.close()     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0045
            android.system.Os.close(r5)     // Catch:{ Exception -> 0x0066 }
        L_0x0045:
            return r2
        L_0x0046:
            r2 = move-exception
            if (r4 == 0) goto L_0x0051
            r4.close()     // Catch:{ all -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r4 = move-exception
            r2.addSuppressed(r4)     // Catch:{ all -> 0x0052 }
        L_0x0051:
            throw r2     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r4 = move-exception
            r1.close()     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch:{ all -> 0x005c }
        L_0x005b:
            throw r4     // Catch:{ all -> 0x005c }
        L_0x005c:
            r4 = move-exception
            goto L_0x0060
        L_0x005e:
            r4 = move-exception
            r5 = r0
        L_0x0060:
            if (r5 == 0) goto L_0x0065
            android.system.Os.close(r5)     // Catch:{ Exception -> 0x0066 }
        L_0x0065:
            throw r4     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.C31233h.m125820a(android.content.Context, java.util.Map):android.content.res.loader.ResourcesLoader");
    }
}
