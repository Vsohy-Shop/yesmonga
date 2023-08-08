package com.usabilla.sdk.ubform.utils.ext;

/* renamed from: com.usabilla.sdk.ubform.utils.ext.f */
public final class C10132f {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        kotlin.p010io.C11133b.m42950a(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        r0 = move-exception;
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m38338a(@org.jetbrains.annotations.C12579k android.content.ContentResolver r7, @org.jetbrains.annotations.C12579k android.net.Uri r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)
            r8 = 0
            if (r7 != 0) goto L_0x0018
            goto L_0x0029
        L_0x0018:
            java.lang.String r0 = "_display_name"
            int r0 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x002a }
            r7.moveToFirst()     // Catch:{ all -> 0x002a }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x002a }
            kotlin.p010io.C11133b.m42950a(r7, r8)
            r8 = r0
        L_0x0029:
            return r8
        L_0x002a:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.utils.ext.C10132f.m38338a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
