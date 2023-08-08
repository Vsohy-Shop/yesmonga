package com.google.android.gms.maps;

import android.content.Context;
import androidx.annotation.C0359n0;
import javax.annotation.concurrent.GuardedBy;

public final class MapsInitializer {

    /* renamed from: a */
    public static final String f72912a = "MapsInitializer";
    @GuardedBy("MapsInitializer.class")

    /* renamed from: b */
    public static boolean f72913b = false;
    @GuardedBy("MapsInitializer.class")

    /* renamed from: c */
    public static Renderer f72914c = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    /* renamed from: a */
    public static synchronized int m122289a(@C0359n0 Context context) {
        int b;
        synchronized (MapsInitializer.class) {
            b = m122290b(context, (Renderer) null, (C30450g) null);
        }
        return b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:10|11|12|13|14|15|16|(9:18|(1:(1:21))|23|24|(1:26)|27|28|29|(1:31))|22|23|24|(0)|27|28|29|(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return 0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0054 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[Catch:{ RemoteException -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061 A[Catch:{ RemoteException -> 0x0068 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int m122290b(@androidx.annotation.C0359n0 android.content.Context r5, @androidx.annotation.C0363p0 com.google.android.gms.maps.MapsInitializer.Renderer r6, @androidx.annotation.C0363p0 com.google.android.gms.maps.C30450g r7) {
        /*
            java.lang.Class<com.google.android.gms.maps.MapsInitializer> r0 = com.google.android.gms.maps.MapsInitializer.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.C40843u.m166203m(r5, r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "preferredRenderer: "
            r2.concat(r1)     // Catch:{ all -> 0x0074 }
            boolean r1 = f72913b     // Catch:{ all -> 0x0074 }
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r7 == 0) goto L_0x001d
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = f72914c     // Catch:{ all -> 0x0074 }
            r7.onMapsSdkInitialized(r5)     // Catch:{ all -> 0x0074 }
        L_0x001d:
            monitor-exit(r0)
            return r2
        L_0x001f:
            com.google.android.gms.maps.internal.s1 r1 = com.google.android.gms.maps.internal.C30519p1.m122785a(r5, r6)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x006f }
            com.google.android.gms.maps.internal.a r3 = r1.mo86221f()     // Catch:{ RemoteException -> 0x0068 }
            com.google.android.gms.maps.C30409b.m122340l(r3)     // Catch:{ RemoteException -> 0x0068 }
            com.google.android.gms.internal.maps.s r3 = r1.mo86223p()     // Catch:{ RemoteException -> 0x0068 }
            com.google.android.gms.maps.model.C30575b.m123162h(r3)     // Catch:{ RemoteException -> 0x0068 }
            r3 = 1
            f72913b = r3     // Catch:{ all -> 0x0074 }
            r4 = 2
            if (r6 == 0) goto L_0x0042
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0043
            if (r6 == r3) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r3 = r4
            goto L_0x0043
        L_0x0042:
            r3 = r2
        L_0x0043:
            int r6 = r1.mo86220e()     // Catch:{ RemoteException -> 0x0054 }
            if (r6 != r4) goto L_0x004d
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST     // Catch:{ RemoteException -> 0x0054 }
            f72914c = r6     // Catch:{ RemoteException -> 0x0054 }
        L_0x004d:
            com.google.android.gms.dynamic.d r5 = com.google.android.gms.dynamic.C41019f.m166811T6(r5)     // Catch:{ RemoteException -> 0x0054 }
            r1.mo86218Q5(r5, r3)     // Catch:{ RemoteException -> 0x0054 }
        L_0x0054:
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = f72914c     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0074 }
            java.lang.String r6 = "loadedRenderer: "
            r6.concat(r5)     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0066
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = f72914c     // Catch:{ all -> 0x0074 }
            r7.onMapsSdkInitialized(r5)     // Catch:{ all -> 0x0074 }
        L_0x0066:
            monitor-exit(r0)
            return r2
        L_0x0068:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ all -> 0x0074 }
            r6.<init>(r5)     // Catch:{ all -> 0x0074 }
            throw r6     // Catch:{ all -> 0x0074 }
        L_0x006f:
            r5 = move-exception
            int r5 = r5.errorCode     // Catch:{ all -> 0x0074 }
            monitor-exit(r0)
            return r5
        L_0x0074:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapsInitializer.m122290b(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer, com.google.android.gms.maps.g):int");
    }
}
