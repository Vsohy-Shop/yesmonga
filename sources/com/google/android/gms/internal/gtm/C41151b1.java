package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.b1 */
public final class C41151b1 implements ServiceConnection {

    /* renamed from: c */
    public volatile boolean f104448c;

    /* renamed from: d */
    public final /* synthetic */ C41175c1 f104449d;

    /* renamed from: e */
    public volatile C41730z3 f104450e;

    public C41151b1(C41175c1 c1Var) {
        this.f104449d = c1Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(1:15)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0063 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.gtm.C41730z3 mo135058a() {
        /*
            r6 = this;
            com.google.android.gms.analytics.C40372a0.m164215h()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.analytics.service.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r3 = "com.google.android.gms.analytics.service.AnalyticsService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            com.google.android.gms.internal.gtm.c1 r1 = r6.f104449d
            android.content.Context r1 = r1.mo135734G()
            java.lang.String r2 = "app_package_name"
            java.lang.String r3 = r1.getPackageName()
            r0.putExtra(r2, r3)
            com.google.android.gms.common.stats.b r2 = com.google.android.gms.common.stats.C40954b.m166547b()
            monitor-enter(r6)
            r3 = 0
            r6.f104450e = r3     // Catch:{ all -> 0x007b }
            r4 = 1
            r6.f104448c = r4     // Catch:{ all -> 0x007b }
            com.google.android.gms.internal.gtm.c1 r4 = r6.f104449d     // Catch:{ all -> 0x007b }
            com.google.android.gms.internal.gtm.b1 r4 = r4.f104481c     // Catch:{ all -> 0x007b }
            r5 = 129(0x81, float:1.81E-43)
            boolean r0 = r2.mo134751a(r1, r0, r4, r5)     // Catch:{ all -> 0x007b }
            com.google.android.gms.internal.gtm.c1 r1 = r6.f104449d     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "Bind to service requested"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x007b }
            r1.mo135760w(r2, r4)     // Catch:{ all -> 0x007b }
            r1 = 0
            if (r0 != 0) goto L_0x004e
            r6.f104448c = r1     // Catch:{ all -> 0x007b }
            monitor-exit(r6)     // Catch:{ all -> 0x007b }
            return r3
        L_0x004e:
            com.google.android.gms.internal.gtm.c1 r0 = r6.f104449d     // Catch:{ InterruptedException -> 0x0063 }
            r0.mo135742P()     // Catch:{ InterruptedException -> 0x0063 }
            com.google.android.gms.internal.gtm.u3<java.lang.Long> r0 = com.google.android.gms.internal.gtm.C41634v3.f105108M     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.Object r0 = r0.mo135909b()     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ InterruptedException -> 0x0063 }
            long r4 = r0.longValue()     // Catch:{ InterruptedException -> 0x0063 }
            r6.wait(r4)     // Catch:{ InterruptedException -> 0x0063 }
            goto L_0x006a
        L_0x0063:
            com.google.android.gms.internal.gtm.c1 r0 = r6.f104449d     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "Wait for service connect was interrupted"
            r0.mo135762y(r2)     // Catch:{ all -> 0x007b }
        L_0x006a:
            r6.f104448c = r1     // Catch:{ all -> 0x007b }
            com.google.android.gms.internal.gtm.z3 r0 = r6.f104450e     // Catch:{ all -> 0x007b }
            r6.f104450e = r3     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x0079
            com.google.android.gms.internal.gtm.c1 r1 = r6.f104449d     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "Successfully bound to service but never got onServiceConnected callback"
            r1.mo135754q(r2)     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r6)     // Catch:{ all -> 0x007b }
            return r0
        L_0x007b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x007b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41151b1.mo135058a():com.google.android.gms.internal.gtm.z3");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|(1:15)(1:16)|17|18|25|26) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|10|11|(6:13|(1:15)(1:16)|17|18|25|26)(3:19|20|21)|(2:28|29)(3:30|31|(1:33)(1:34))|35|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0047 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0080 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            java.lang.String r3 = "AnalyticsServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C40843u.m166197g(r3)
            monitor-enter(r2)
            if (r4 != 0) goto L_0x0014
            com.google.android.gms.internal.gtm.c1 r3 = r2.f104449d     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "Service connected with null binder"
            r3.mo135754q(r4)     // Catch:{ all -> 0x0044 }
            r2.notifyAll()     // Catch:{ all -> 0x0089 }
            monitor-exit(r2)     // Catch:{ all -> 0x0089 }
            return
        L_0x0014:
            r3 = 0
            java.lang.String r0 = r4.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0046 }
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r1 = r1.equals(r0)     // Catch:{ RemoteException -> 0x0046 }
            if (r1 == 0) goto L_0x003b
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x0046 }
            boolean r1 = r0 instanceof com.google.android.gms.internal.gtm.C41730z3     // Catch:{ RemoteException -> 0x0046 }
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.gtm.z3 r0 = (com.google.android.gms.internal.gtm.C41730z3) r0     // Catch:{ RemoteException -> 0x0046 }
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.gtm.z3 r0 = new com.google.android.gms.internal.gtm.z3     // Catch:{ RemoteException -> 0x0046 }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x0046 }
        L_0x0033:
            com.google.android.gms.internal.gtm.c1 r4 = r2.f104449d     // Catch:{ RemoteException -> 0x0047 }
            java.lang.String r1 = "Bound to IAnalyticsService interface"
            r4.mo135759v(r1)     // Catch:{ RemoteException -> 0x0047 }
            goto L_0x004e
        L_0x003b:
            com.google.android.gms.internal.gtm.c1 r4 = r2.f104449d     // Catch:{ RemoteException -> 0x0046 }
            java.lang.String r1 = "Got binder with a wrong descriptor"
            r4.mo135755r(r1, r0)     // Catch:{ RemoteException -> 0x0046 }
            r0 = r3
            goto L_0x004e
        L_0x0044:
            r3 = move-exception
            goto L_0x0085
        L_0x0046:
            r0 = r3
        L_0x0047:
            com.google.android.gms.internal.gtm.c1 r4 = r2.f104449d     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "Service connect failed to get IAnalyticsService"
            r4.mo135754q(r1)     // Catch:{ all -> 0x0044 }
        L_0x004e:
            if (r0 != 0) goto L_0x0064
            com.google.android.gms.common.stats.b r3 = com.google.android.gms.common.stats.C40954b.m166547b()     // Catch:{ IllegalArgumentException -> 0x0080 }
            com.google.android.gms.internal.gtm.c1 r4 = r2.f104449d     // Catch:{ IllegalArgumentException -> 0x0080 }
            android.content.Context r4 = r4.mo135734G()     // Catch:{ IllegalArgumentException -> 0x0080 }
            com.google.android.gms.internal.gtm.c1 r0 = r2.f104449d     // Catch:{ IllegalArgumentException -> 0x0080 }
            com.google.android.gms.internal.gtm.b1 r0 = r0.f104481c     // Catch:{ IllegalArgumentException -> 0x0080 }
            r3.mo134752c(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0080 }
            goto L_0x0080
        L_0x0064:
            boolean r4 = r2.f104448c     // Catch:{ all -> 0x0044 }
            if (r4 != 0) goto L_0x007e
            com.google.android.gms.internal.gtm.c1 r4 = r2.f104449d     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "onServiceConnected received after the timeout limit"
            r4.mo135762y(r1)     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.gtm.c1 r4 = r2.f104449d     // Catch:{ all -> 0x0044 }
            com.google.android.gms.analytics.a0 r4 = r4.mo135736J()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.gtm.y0 r1 = new com.google.android.gms.internal.gtm.y0     // Catch:{ all -> 0x0044 }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x0044 }
            r4.mo133262i(r1)     // Catch:{ all -> 0x0044 }
            goto L_0x0080
        L_0x007e:
            r2.f104450e = r0     // Catch:{ all -> 0x0044 }
        L_0x0080:
            r2.notifyAll()     // Catch:{ all -> 0x0089 }
            monitor-exit(r2)     // Catch:{ all -> 0x0089 }
            return
        L_0x0085:
            r2.notifyAll()     // Catch:{ all -> 0x0089 }
            throw r3     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0089 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41151b1.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C40843u.m166197g("AnalyticsServiceConnection.onServiceDisconnected");
        this.f104449d.mo135736J().mo133262i(new C41127a1(this, componentName));
    }
}
