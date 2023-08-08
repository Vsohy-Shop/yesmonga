package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.l7 */
public final class C30795l7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f73730a;

    /* renamed from: b */
    public final /* synthetic */ Uri f73731b;

    /* renamed from: c */
    public final /* synthetic */ String f73732c;

    /* renamed from: d */
    public final /* synthetic */ String f73733d;

    /* renamed from: e */
    public final /* synthetic */ C30807m7 f73734e;

    public C30795l7(C30807m7 m7Var, boolean z, Uri uri, String str, String str2) {
        this.f73734e = m7Var;
        this.f73730a = z;
        this.f73731b = uri;
        this.f73732c = str;
        this.f73733d = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3 A[SYNTHETIC, Splitter:B:32:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb A[Catch:{ RuntimeException -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd A[Catch:{ RuntimeException -> 0x0190 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            com.google.android.gms.measurement.internal.m7 r2 = r1.f73734e
            boolean r0 = r1.f73730a
            android.net.Uri r3 = r1.f73731b
            java.lang.String r4 = r1.f73732c
            java.lang.String r5 = r1.f73733d
            com.google.android.gms.measurement.internal.n7 r6 = r2.f73750a
            r6.mo86866h()
            com.google.android.gms.measurement.internal.n7 r6 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g5 r6 = r6.f74136a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.ua r6 = r6.mo87110N()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.internal.measurement.C42063lf.m170504b()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.n7 r7 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g r7 = r7.mo87130z()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g3 r8 = com.google.android.gms.measurement.internal.C30742h3.f73568x0     // Catch:{ RuntimeException -> 0x0190 }
            r9 = 0
            boolean r7 = r7.mo87070B(r9, r8)     // Catch:{ RuntimeException -> 0x0190 }
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r11 = "Activity created with data 'referrer' without required params"
            java.lang.String r12 = "utm_medium"
            java.lang.String r13 = "_cis"
            java.lang.String r14 = "utm_source"
            java.lang.String r15 = "utm_campaign"
            java.lang.String r9 = "gclid"
            if (r10 == 0) goto L_0x003f
        L_0x003d:
            r6 = 0
            goto L_0x009f
        L_0x003f:
            boolean r10 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            boolean r10 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            boolean r10 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            boolean r10 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            java.lang.String r10 = "utm_id"
            boolean r10 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            java.lang.String r10 = "dclid"
            boolean r10 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            java.lang.String r10 = "srsltid"
            boolean r10 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            if (r7 == 0) goto L_0x007c
            java.lang.String r7 = "sfmc_id"
            boolean r7 = r5.contains(r7)     // Catch:{ RuntimeException -> 0x0190 }
            if (r7 != 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r7 = 1
            goto L_0x008a
        L_0x007c:
            com.google.android.gms.measurement.internal.g5 r6 = r6.f74136a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87488q()     // Catch:{ RuntimeException -> 0x0190 }
            r6.mo87463a(r11)     // Catch:{ RuntimeException -> 0x0190 }
            goto L_0x003d
        L_0x008a:
            java.lang.String r10 = "https://google.com/search?"
            java.lang.String r10 = r10.concat(r5)     // Catch:{ RuntimeException -> 0x0190 }
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ RuntimeException -> 0x0190 }
            android.os.Bundle r6 = r6.mo87544v0(r10, r7)     // Catch:{ RuntimeException -> 0x0190 }
            if (r6 == 0) goto L_0x009f
            java.lang.String r7 = "referrer"
            r6.putString(r13, r7)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x009f:
            java.lang.String r7 = "_cmp"
            if (r0 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.n7 r0 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.ua r0 = r0.mo87110N()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.internal.measurement.C42063lf.m170504b()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.n7 r10 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g5 r10 = r10.f74136a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g r10 = r10.mo87130z()     // Catch:{ RuntimeException -> 0x0190 }
            r1 = 0
            boolean r8 = r10.mo87070B(r1, r8)     // Catch:{ RuntimeException -> 0x0190 }
            android.os.Bundle r0 = r0.mo87544v0(r3, r8)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r1 = "intent"
            r0.putString(r13, r1)     // Catch:{ RuntimeException -> 0x0190 }
            boolean r1 = r0.containsKey(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r1 != 0) goto L_0x00e9
            if (r6 == 0) goto L_0x00e9
            boolean r1 = r6.containsKey(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = "_cer"
            java.lang.String r3 = "gclid=%s"
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r8 = r6.getString(r9)     // Catch:{ RuntimeException -> 0x0190 }
            r13 = 0
            r10[r13] = r8     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r3 = java.lang.String.format(r3, r10)     // Catch:{ RuntimeException -> 0x0190 }
            r0.putString(r1, r3)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x00e9:
            com.google.android.gms.measurement.internal.n7 r1 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            r1.mo87334u(r4, r7, r0)     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.n7 r1 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.ab r1 = r1.f73783n     // Catch:{ RuntimeException -> 0x0190 }
            r1.mo86882a(r4, r0)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x00f5:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x00fd
            goto L_0x017f
        L_0x00fd:
            com.google.android.gms.measurement.internal.n7 r0 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87488q()     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r1 = "Activity created with referrer"
            r0.mo87464b(r1, r5)     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.n7 r0 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g r0 = r0.mo87130z()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g3 r1 = com.google.android.gms.measurement.internal.C30742h3.f73526c0     // Catch:{ RuntimeException -> 0x0190 }
            r3 = 0
            boolean r0 = r0.mo87070B(r3, r1)     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r1 = "_ldl"
            java.lang.String r3 = "auto"
            if (r0 == 0) goto L_0x014b
            if (r6 == 0) goto L_0x0132
            com.google.android.gms.measurement.internal.n7 r0 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            r0.mo87334u(r4, r7, r6)     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.n7 r0 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.ab r0 = r0.f73783n     // Catch:{ RuntimeException -> 0x0190 }
            r0.mo86882a(r4, r6)     // Catch:{ RuntimeException -> 0x0190 }
            goto L_0x0143
        L_0x0132:
            com.google.android.gms.measurement.internal.n7 r0 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87488q()     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r4 = "Referrer does not contain valid parameters"
            r0.mo87464b(r4, r5)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x0143:
            com.google.android.gms.measurement.internal.n7 r0 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            r4 = 1
            r5 = 0
            r0.mo87309K(r3, r1, r5, r4)     // Catch:{ RuntimeException -> 0x0190 }
            return
        L_0x014b:
            boolean r0 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x0180
            boolean r0 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            boolean r0 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            boolean r0 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x0180
        L_0x0173:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x017f
            com.google.android.gms.measurement.internal.n7 r0 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            r4 = 1
            r0.mo87309K(r3, r1, r5, r4)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x017f:
            return
        L_0x0180:
            com.google.android.gms.measurement.internal.n7 r0 = r2.f73750a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87488q()     // Catch:{ RuntimeException -> 0x0190 }
            r0.mo87463a(r11)     // Catch:{ RuntimeException -> 0x0190 }
            return
        L_0x0190:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n7 r1 = r2.f73750a
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87489r()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.mo87464b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30795l7.run():void");
    }
}
