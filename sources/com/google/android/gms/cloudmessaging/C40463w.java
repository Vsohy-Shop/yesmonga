package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.C41008d;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.cloudmessaging.w */
public final class C40463w {

    /* renamed from: a */
    public final Context f103104a;
    @GuardedBy("this")

    /* renamed from: b */
    public int f103105b;
    @GuardedBy("this")

    /* renamed from: c */
    public int f103106c = 0;

    public C40463w(Context context) {
        this.f103104a = context;
    }

    /* renamed from: a */
    public final synchronized int mo133583a() {
        PackageInfo packageInfo;
        if (this.f103105b == 0) {
            try {
                packageInfo = C41008d.m166715a(this.f103104a).mo134784f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f103105b = packageInfo.versionCode;
            }
        }
        return this.f103105b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo133584b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f103106c     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f103104a     // Catch:{ all -> 0x0071 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0071 }
            android.content.Context r1 = r5.f103104a     // Catch:{ all -> 0x0071 }
            com.google.android.gms.common.wrappers.c r1 = com.google.android.gms.common.wrappers.C41008d.m166715a(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            int r1 = r1.mo134780b(r2, r3)     // Catch:{ all -> 0x0071 }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0021
            monitor-exit(r5)
            return r3
        L_0x0021:
            boolean r1 = com.google.android.gms.common.util.C40996v.m166689n()     // Catch:{ all -> 0x0071 }
            r2 = 1
            if (r1 != 0) goto L_0x0045
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0071 }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0045
            int r1 = r1.size()     // Catch:{ all -> 0x0071 }
            if (r1 > 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            r5.f103106c = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r5)
            return r2
        L_0x0045:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0071 }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x0071 }
            r1 = 2
            if (r0 == 0) goto L_0x0063
            int r0 = r0.size()     // Catch:{ all -> 0x0071 }
            if (r0 > 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            r5.f103106c = r1     // Catch:{ all -> 0x0071 }
            monitor-exit(r5)
            return r1
        L_0x0063:
            boolean r0 = com.google.android.gms.common.util.C40996v.m166689n()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x006d
            r5.f103106c = r1     // Catch:{ all -> 0x0071 }
            r2 = r1
            goto L_0x006f
        L_0x006d:
            r5.f103106c = r2     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r5)
            return r2
        L_0x0071:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C40463w.mo133584b():int");
    }
}
