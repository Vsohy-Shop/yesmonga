package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.C40974d0;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.w6 */
public final class C41661w6 {

    /* renamed from: d */
    public static C41661w6 f105190d;

    /* renamed from: a */
    public volatile String f105191a = null;

    /* renamed from: b */
    public volatile String f105192b = null;

    /* renamed from: c */
    public volatile int f105193c = 1;

    @C40974d0
    /* renamed from: a */
    public static C41661w6 m168646a() {
        C41661w6 w6Var;
        synchronized (C41661w6.class) {
            if (f105190d == null) {
                f105190d = new C41661w6();
            }
            w6Var = f105190d;
        }
        return w6Var;
    }

    /* renamed from: b */
    public final String mo136016b() {
        return this.f105192b;
    }

    /* renamed from: c */
    public final String mo136017c() {
        return this.f105191a;
    }

    /* renamed from: d */
    public final boolean mo136018d() {
        return this.f105193c == 2;
    }

    /* renamed from: e */
    public final boolean mo136019e(String str) {
        return mo136018d() && this.f105191a.equals(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00af, code lost:
        return true;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo136020f(java.lang.String r7, android.net.Uri r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            java.lang.String r1 = r8.toString()     // Catch:{ UnsupportedEncodingException -> 0x00e2 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x00e2 }
            java.lang.String r2 = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+"
            boolean r2 = r1.matches(r2)     // Catch:{ all -> 0x00e0 }
            if (r2 != 0) goto L_0x002c
            java.lang.String r7 = "Bad preview url: "
            int r8 = r1.length()     // Catch:{ all -> 0x00e0 }
            if (r8 == 0) goto L_0x0021
            java.lang.String r7 = r7.concat(r1)     // Catch:{ all -> 0x00e0 }
            goto L_0x0027
        L_0x0021:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x00e0 }
            r8.<init>(r7)     // Catch:{ all -> 0x00e0 }
            r7 = r8
        L_0x0027:
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r7)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r6)
            return r0
        L_0x002c:
            java.lang.String r2 = "id"
            java.lang.String r2 = r8.getQueryParameter(r2)     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = "gtm_auth"
            java.lang.String r3 = r8.getQueryParameter(r3)     // Catch:{ all -> 0x00e0 }
            java.lang.String r4 = "gtm_preview"
            java.lang.String r4 = r8.getQueryParameter(r4)     // Catch:{ all -> 0x00e0 }
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00e0 }
            if (r7 != 0) goto L_0x004b
            java.lang.String r7 = "Preview fails (container doesn't match the container specified by the asset)"
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r7)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r6)
            return r0
        L_0x004b:
            if (r2 == 0) goto L_0x00c8
            int r7 = r2.length()     // Catch:{ all -> 0x00e0 }
            if (r7 <= 0) goto L_0x00c8
            r7 = 1
            if (r4 == 0) goto L_0x0093
            int r5 = r4.length()     // Catch:{ all -> 0x00e0 }
            if (r5 != 0) goto L_0x0093
            java.lang.String r8 = r6.f105191a     // Catch:{ all -> 0x00e0 }
            boolean r8 = r2.equals(r8)     // Catch:{ all -> 0x00e0 }
            if (r8 == 0) goto L_0x008c
            int r8 = r6.f105193c     // Catch:{ all -> 0x00e0 }
            if (r8 != r7) goto L_0x0069
            goto L_0x008c
        L_0x0069:
            java.lang.String r8 = r6.f105191a     // Catch:{ all -> 0x00e0 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "Exit preview mode for container: "
            int r1 = r8.length()     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x007c
            java.lang.String r8 = r0.concat(r8)     // Catch:{ all -> 0x00e0 }
            goto L_0x0081
        L_0x007c:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x00e0 }
            r8.<init>(r0)     // Catch:{ all -> 0x00e0 }
        L_0x0081:
            com.google.android.gms.internal.gtm.C41493p6.m168152d(r8)     // Catch:{ all -> 0x00e0 }
            r6.f105193c = r7     // Catch:{ all -> 0x00e0 }
            r8 = 0
            r6.f105191a = r8     // Catch:{ all -> 0x00e0 }
            r6.f105192b = r8     // Catch:{ all -> 0x00e0 }
            goto L_0x00ae
        L_0x008c:
            java.lang.String r7 = "Error in exiting preview mode. The container is not in preview."
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r7)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r6)
            return r0
        L_0x0093:
            if (r4 == 0) goto L_0x00b0
            int r4 = r4.length()     // Catch:{ all -> 0x00e0 }
            if (r4 <= 0) goto L_0x00b0
            if (r3 == 0) goto L_0x00b0
            int r3 = r3.length()     // Catch:{ all -> 0x00e0 }
            if (r3 <= 0) goto L_0x00b0
            r0 = 2
            r6.f105193c = r0     // Catch:{ all -> 0x00e0 }
            java.lang.String r8 = r8.getQuery()     // Catch:{ all -> 0x00e0 }
            r6.f105192b = r8     // Catch:{ all -> 0x00e0 }
            r6.f105191a = r2     // Catch:{ all -> 0x00e0 }
        L_0x00ae:
            monitor-exit(r6)
            return r7
        L_0x00b0:
            java.lang.String r7 = "Bad preview url: "
            int r8 = r1.length()     // Catch:{ all -> 0x00e0 }
            if (r8 == 0) goto L_0x00bd
            java.lang.String r7 = r7.concat(r1)     // Catch:{ all -> 0x00e0 }
            goto L_0x00c3
        L_0x00bd:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x00e0 }
            r8.<init>(r7)     // Catch:{ all -> 0x00e0 }
            r7 = r8
        L_0x00c3:
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r7)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r6)
            return r0
        L_0x00c8:
            java.lang.String r7 = "Bad preview url: "
            int r8 = r1.length()     // Catch:{ all -> 0x00e0 }
            if (r8 == 0) goto L_0x00d5
            java.lang.String r7 = r7.concat(r1)     // Catch:{ all -> 0x00e0 }
            goto L_0x00db
        L_0x00d5:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x00e0 }
            r8.<init>(r7)     // Catch:{ all -> 0x00e0 }
            r7 = r8
        L_0x00db:
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r7)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r6)
            return r0
        L_0x00e0:
            r7 = move-exception
            goto L_0x0103
        L_0x00e2:
            r7 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00e0 }
            int r8 = r7.length()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            int r8 = r8 + 32
            r1.<init>(r8)     // Catch:{ all -> 0x00e0 }
            java.lang.String r8 = "Error decoding the preview url: "
            r1.append(r8)     // Catch:{ all -> 0x00e0 }
            r1.append(r7)     // Catch:{ all -> 0x00e0 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r7)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r6)
            return r0
        L_0x0103:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41661w6.mo136020f(java.lang.String, android.net.Uri):boolean");
    }
}
