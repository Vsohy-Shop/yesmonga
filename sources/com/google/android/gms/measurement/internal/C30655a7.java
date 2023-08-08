package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C41977h1;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
public final class C30655a7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41977h1 f73223a;

    /* renamed from: b */
    public final /* synthetic */ C30819n7 f73224b;

    public C30655a7(C30819n7 n7Var, C41977h1 h1Var) {
        this.f73224b = n7Var;
        this.f73223a = h1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009a A[SYNTHETIC, Splitter:B:15:0x009a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.n7 r0 = r6.f73224b
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a
            com.google.android.gms.measurement.internal.u9 r0 = r0.mo87109M()
            com.google.android.gms.internal.measurement.C41901cf.m169755b()
            com.google.android.gms.measurement.internal.g5 r1 = r0.f74136a
            com.google.android.gms.measurement.internal.g r1 = r1.mo87130z()
            com.google.android.gms.measurement.internal.g3 r2 = com.google.android.gms.measurement.internal.C30742h3.f73566w0
            r3 = 0
            boolean r1 = r1.mo87070B(r3, r2)
            if (r1 == 0) goto L_0x0076
            com.google.android.gms.measurement.internal.g5 r1 = r0.f74136a
            com.google.android.gms.measurement.internal.k4 r1 = r1.mo87103F()
            com.google.android.gms.measurement.internal.h r1 = r1.mo87193q()
            com.google.android.gms.measurement.internal.zzah r2 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE
            boolean r1 = r1.mo87142i(r2)
            if (r1 != 0) goto L_0x003c
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87495x()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.mo87463a(r1)
            goto L_0x0085
        L_0x003c:
            com.google.android.gms.measurement.internal.g5 r1 = r0.f74136a
            com.google.android.gms.measurement.internal.k4 r1 = r1.mo87103F()
            com.google.android.gms.measurement.internal.g5 r2 = r0.f74136a
            com.google.android.gms.common.util.g r2 = r2.mo86900a()
            long r4 = r2.mo134768a()
            boolean r1 = r1.mo87198v(r4)
            if (r1 != 0) goto L_0x0085
            com.google.android.gms.measurement.internal.g5 r1 = r0.f74136a
            com.google.android.gms.measurement.internal.k4 r1 = r1.mo87103F()
            com.google.android.gms.measurement.internal.g4 r1 = r1.f73660p
            long r1 = r1.mo87096a()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0065
            goto L_0x0085
        L_0x0065:
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a
            com.google.android.gms.measurement.internal.k4 r0 = r0.mo87103F()
            com.google.android.gms.measurement.internal.g4 r0 = r0.f73660p
            long r0 = r0.mo87096a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0086
        L_0x0076:
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87495x()
            java.lang.String r1 = "getSessionId has been disabled."
            r0.mo87463a(r1)
        L_0x0085:
            r0 = r3
        L_0x0086:
            if (r0 == 0) goto L_0x009a
            com.google.android.gms.measurement.internal.n7 r1 = r6.f73224b
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a
            com.google.android.gms.measurement.internal.ua r1 = r1.mo87110N()
            com.google.android.gms.internal.measurement.h1 r2 = r6.f73223a
            long r3 = r0.longValue()
            r1.mo87510J(r2, r3)
            return
        L_0x009a:
            com.google.android.gms.internal.measurement.h1 r0 = r6.f73223a     // Catch:{ RemoteException -> 0x00a0 }
            r0.mo136499s6(r3)     // Catch:{ RemoteException -> 0x00a0 }
            return
        L_0x00a0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n7 r1 = r6.f73224b
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87489r()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.mo87464b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30655a7.run():void");
    }
}
