package com.google.zxing.pdf417.decoder;

/* renamed from: com.google.zxing.pdf417.decoder.e */
public final class C34839e {

    /* renamed from: e */
    public static final int f84611e = 2;

    /* renamed from: a */
    public final C34835a f84612a;

    /* renamed from: b */
    public final C34843f[] f84613b;

    /* renamed from: c */
    public C34837c f84614c;

    /* renamed from: d */
    public final int f84615d;

    public C34839e(C34835a aVar, C34837c cVar) {
        this.f84612a = aVar;
        int a = aVar.mo103046a();
        this.f84615d = a;
        this.f84614c = cVar;
        this.f84613b = new C34843f[(a + 2)];
    }

    /* renamed from: b */
    public static boolean m142283b(C34838d dVar, C34838d dVar2) {
        if (dVar2 == null || !dVar2.mo103069g() || dVar2.mo103063a() != dVar.mo103063a()) {
            return false;
        }
        dVar.mo103071i(dVar2.mo103065c());
        return true;
    }

    /* renamed from: c */
    public static int m142284c(int i, int i2, C34838d dVar) {
        if (dVar == null || dVar.mo103069g()) {
            return i2;
        }
        if (!dVar.mo103070h(i)) {
            return i2 + 1;
        }
        dVar.mo103071i(i);
        return 0;
    }

    /* renamed from: a */
    public final void mo103074a(C34843f fVar) {
        if (fVar != null) {
            ((C34844g) fVar).mo103123g(this.f84612a);
        }
    }

    /* renamed from: d */
    public final int mo103075d() {
        int f = mo103077f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f84615d + 1; i++) {
            C34838d[] d = this.f84613b[i].mo103119d();
            for (int i2 = 0; i2 < d.length; i2++) {
                C34838d dVar = d[i2];
                if (dVar != null && !dVar.mo103069g()) {
                    mo103076e(i, i2, d);
                }
            }
        }
        return f;
    }

    /* renamed from: e */
    public final void mo103076e(int i, int i2, C34838d[] dVarArr) {
        C34838d[] dVarArr2;
        C34838d dVar = dVarArr[i2];
        C34838d[] d = this.f84613b[i - 1].mo103119d();
        C34843f fVar = this.f84613b[i + 1];
        if (fVar != null) {
            dVarArr2 = fVar.mo103119d();
        } else {
            dVarArr2 = d;
        }
        C34838d[] dVarArr3 = new C34838d[14];
        dVarArr3[2] = d[i2];
        dVarArr3[3] = dVarArr2[i2];
        int i3 = 0;
        if (i2 > 0) {
            int i4 = i2 - 1;
            dVarArr3[0] = dVarArr[i4];
            dVarArr3[4] = d[i4];
            dVarArr3[5] = dVarArr2[i4];
        }
        if (i2 > 1) {
            int i5 = i2 - 2;
            dVarArr3[8] = dVarArr[i5];
            dVarArr3[10] = d[i5];
            dVarArr3[11] = dVarArr2[i5];
        }
        if (i2 < dVarArr.length - 1) {
            int i6 = i2 + 1;
            dVarArr3[1] = dVarArr[i6];
            dVarArr3[6] = d[i6];
            dVarArr3[7] = dVarArr2[i6];
        }
        if (i2 < dVarArr.length - 2) {
            int i7 = i2 + 2;
            dVarArr3[9] = dVarArr[i7];
            dVarArr3[12] = d[i7];
            dVarArr3[13] = dVarArr2[i7];
        }
        while (i3 < 14 && !m142283b(dVar, dVarArr3[i3])) {
            i3++;
        }
    }

    /* renamed from: f */
    public final int mo103077f() {
        mo103078g();
        return mo103079h() + mo103080i();
    }

    /* renamed from: g */
    public final void mo103078g() {
        C34843f[] fVarArr = this.f84613b;
        C34843f fVar = fVarArr[0];
        if (fVar != null && fVarArr[this.f84615d + 1] != null) {
            C34838d[] d = fVar.mo103119d();
            C34838d[] d2 = this.f84613b[this.f84615d + 1].mo103119d();
            for (int i = 0; i < d.length; i++) {
                C34838d dVar = d[i];
                if (!(dVar == null || d2[i] == null || dVar.mo103065c() != d2[i].mo103065c())) {
                    for (int i2 = 1; i2 <= this.f84615d; i2++) {
                        C34838d dVar2 = this.f84613b[i2].mo103119d()[i];
                        if (dVar2 != null) {
                            dVar2.mo103071i(d[i].mo103065c());
                            if (!dVar2.mo103069g()) {
                                this.f84613b[i2].mo103119d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final int mo103079h() {
        C34843f fVar = this.f84613b[0];
        if (fVar == null) {
            return 0;
        }
        C34838d[] d = fVar.mo103119d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            C34838d dVar = d[i2];
            if (dVar != null) {
                int c = dVar.mo103065c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f84615d + 1 && i3 < 2; i4++) {
                    C34838d dVar2 = this.f84613b[i4].mo103119d()[i2];
                    if (dVar2 != null) {
                        i3 = m142284c(c, i3, dVar2);
                        if (!dVar2.mo103069g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    public final int mo103080i() {
        C34843f[] fVarArr = this.f84613b;
        int i = this.f84615d;
        if (fVarArr[i + 1] == null) {
            return 0;
        }
        C34838d[] d = fVarArr[i + 1].mo103119d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            C34838d dVar = d[i3];
            if (dVar != null) {
                int c = dVar.mo103065c();
                int i4 = 0;
                for (int i5 = this.f84615d + 1; i5 > 0 && i4 < 2; i5--) {
                    C34838d dVar2 = this.f84613b[i5].mo103119d()[i3];
                    if (dVar2 != null) {
                        i4 = m142284c(c, i4, dVar2);
                        if (!dVar2.mo103069g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: j */
    public int mo103081j() {
        return this.f84615d;
    }

    /* renamed from: k */
    public int mo103082k() {
        return this.f84612a.mo103047b();
    }

    /* renamed from: l */
    public int mo103083l() {
        return this.f84612a.mo103048c();
    }

    /* renamed from: m */
    public C34837c mo103084m() {
        return this.f84614c;
    }

    /* renamed from: n */
    public C34843f mo103085n(int i) {
        return this.f84613b[i];
    }

    /* renamed from: o */
    public C34843f[] mo103086o() {
        mo103074a(this.f84613b[0]);
        mo103074a(this.f84613b[this.f84615d + 1]);
        int i = 928;
        while (true) {
            int d = mo103075d();
            if (d > 0 && d < i) {
                i = d;
            }
        }
        return this.f84613b;
    }

    /* renamed from: p */
    public void mo103087p(C34837c cVar) {
        this.f84614c = cVar;
    }

    /* renamed from: q */
    public void mo103088q(int i, C34843f fVar) {
        this.f84613b[i] = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            com.google.zxing.pdf417.decoder.f[] r0 = r10.f84613b
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x000d
            int r2 = r10.f84615d
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x000d:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = r1
        L_0x0013:
            com.google.zxing.pdf417.decoder.d[] r5 = r2.mo103119d()     // Catch:{ all -> 0x007a }
            int r5 = r5.length     // Catch:{ all -> 0x007a }
            if (r4 >= r5) goto L_0x0072
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007a }
            r6[r1] = r7     // Catch:{ all -> 0x007a }
            r0.format(r5, r6)     // Catch:{ all -> 0x007a }
            r5 = r1
        L_0x0028:
            int r6 = r10.f84615d     // Catch:{ all -> 0x007a }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x0068
            com.google.zxing.pdf417.decoder.f[] r6 = r10.f84613b     // Catch:{ all -> 0x007a }
            r6 = r6[r5]     // Catch:{ all -> 0x007a }
            java.lang.String r8 = "    |   "
            if (r6 != 0) goto L_0x003c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r8, r6)     // Catch:{ all -> 0x007a }
            goto L_0x0065
        L_0x003c:
            com.google.zxing.pdf417.decoder.d[] r6 = r6.mo103119d()     // Catch:{ all -> 0x007a }
            r6 = r6[r4]     // Catch:{ all -> 0x007a }
            if (r6 != 0) goto L_0x004a
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r8, r6)     // Catch:{ all -> 0x007a }
            goto L_0x0065
        L_0x004a:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x007a }
            int r9 = r6.mo103065c()     // Catch:{ all -> 0x007a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x007a }
            r7[r1] = r9     // Catch:{ all -> 0x007a }
            int r6 = r6.mo103067e()     // Catch:{ all -> 0x007a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007a }
            r7[r3] = r6     // Catch:{ all -> 0x007a }
            r0.format(r8, r7)     // Catch:{ all -> 0x007a }
        L_0x0065:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0068:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r5, r6)     // Catch:{ all -> 0x007a }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0072:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x007a }
            r0.close()
            return r1
        L_0x007a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007c }
        L_0x007c:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0085:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.C34839e.toString():java.lang.String");
    }
}
