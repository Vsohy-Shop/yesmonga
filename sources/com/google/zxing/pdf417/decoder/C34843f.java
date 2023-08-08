package com.google.zxing.pdf417.decoder;

/* renamed from: com.google.zxing.pdf417.decoder.f */
public class C34843f {

    /* renamed from: c */
    public static final int f84625c = 5;

    /* renamed from: a */
    public final C34837c f84626a;

    /* renamed from: b */
    public final C34838d[] f84627b;

    public C34843f(C34837c cVar) {
        this.f84626a = new C34837c(cVar);
        this.f84627b = new C34838d[((cVar.mo103058e() - cVar.mo103060g()) + 1)];
    }

    /* renamed from: a */
    public final C34837c mo103116a() {
        return this.f84626a;
    }

    /* renamed from: b */
    public final C34838d mo103117b(int i) {
        return this.f84627b[mo103120e(i)];
    }

    /* renamed from: c */
    public final C34838d mo103118c(int i) {
        C34838d dVar;
        C34838d dVar2;
        C34838d b = mo103117b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = mo103120e(i) - i2;
            if (e >= 0 && (dVar2 = this.f84627b[e]) != null) {
                return dVar2;
            }
            int e2 = mo103120e(i) + i2;
            C34838d[] dVarArr = this.f84627b;
            if (e2 < dVarArr.length && (dVar = dVarArr[e2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C34838d[] mo103119d() {
        return this.f84627b;
    }

    /* renamed from: e */
    public final int mo103120e(int i) {
        return i - this.f84626a.mo103060g();
    }

    /* renamed from: f */
    public final void mo103121f(int i, C34838d dVar) {
        this.f84627b[mo103120e(i)] = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            com.google.zxing.pdf417.decoder.d[] r1 = r11.f84627b     // Catch:{ all -> 0x0054 }
            int r2 = r1.length     // Catch:{ all -> 0x0054 }
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x000b:
            if (r4 >= r2) goto L_0x004c
            r6 = r1[r4]     // Catch:{ all -> 0x0054 }
            r7 = 1
            if (r6 != 0) goto L_0x0023
            java.lang.String r6 = "%3d:    |   %n"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0054 }
            int r8 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r7[r3] = r5     // Catch:{ all -> 0x0054 }
            r0.format(r6, r7)     // Catch:{ all -> 0x0054 }
            r5 = r8
            goto L_0x0049
        L_0x0023:
            java.lang.String r8 = "%3d: %3d|%3d%n"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0054 }
            int r10 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r3] = r5     // Catch:{ all -> 0x0054 }
            int r5 = r6.mo103065c()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r7] = r5     // Catch:{ all -> 0x0054 }
            int r5 = r6.mo103067e()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r6 = 2
            r9[r6] = r5     // Catch:{ all -> 0x0054 }
            r0.format(r8, r9)     // Catch:{ all -> 0x0054 }
            r5 = r10
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x004c:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0054 }
            r0.close()
            return r1
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x005f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.C34843f.toString():java.lang.String");
    }
}
