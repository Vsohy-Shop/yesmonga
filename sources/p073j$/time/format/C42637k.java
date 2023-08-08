package p073j$.time.format;

import okhttp3.internal.connection.RealConnection;
import p073j$.time.temporal.C42675n;

/* renamed from: j$.time.format.k */
class C42637k implements C42633g {

    /* renamed from: f */
    static final long[] f107867f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};

    /* renamed from: a */
    final C42675n f107868a;

    /* renamed from: b */
    final int f107869b;

    /* renamed from: c */
    final int f107870c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C42625D f107871d;

    /* renamed from: e */
    final int f107872e;

    C42637k(C42675n nVar, int i, int i2, C42625D d) {
        this.f107868a = nVar;
        this.f107869b = i;
        this.f107870c = i2;
        this.f107871d = d;
        this.f107872e = 0;
    }

    protected C42637k(C42675n nVar, int i, int i2, C42625D d, int i3) {
        this.f107868a = nVar;
        this.f107869b = i;
        this.f107870c = i2;
        this.f107871d = d;
        this.f107872e = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo138143b(C42651y yVar, long j) {
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo138144c(C42649w wVar) {
        int i = this.f107872e;
        return i == -1 || (i > 0 && this.f107869b == this.f107870c && this.f107871d == C42625D.NOT_NEGATIVE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo138145d(C42649w wVar, long j, int i, int i2) {
        return wVar.mo138174o(this.f107868a, j, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C42637k mo138146e() {
        return this.f107872e == -1 ? this : new C42637k(this.f107868a, this.f107869b, this.f107870c, this.f107871d, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C42637k mo138147f(int i) {
        return new C42637k(this.f107868a, this.f107869b, this.f107870c, this.f107871d, this.f107872e + i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1 A[LOOP:0: B:30:0x0099->B:32:0x00a1, LOOP_END] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo138135n(p073j$.time.format.C42651y r13, java.lang.StringBuilder r14) {
        /*
            r12 = this;
            j$.time.temporal.n r0 = r12.f107868a
            java.lang.Long r1 = r13.mo138185e(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            long r3 = r1.longValue()
            long r3 = r12.mo138143b(r13, r3)
            j$.time.format.DecimalStyle r13 = r13.mo138182b()
            r5 = -9223372036854775808
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x001f
            java.lang.String r1 = "9223372036854775808"
            goto L_0x0027
        L_0x001f:
            long r5 = java.lang.Math.abs(r3)
            java.lang.String r1 = java.lang.Long.toString(r5)
        L_0x0027:
            int r5 = r1.length()
            java.lang.String r6 = " cannot be printed as the value "
            java.lang.String r7 = "Field "
            int r8 = r12.f107870c
            if (r5 > r8) goto L_0x00af
            java.lang.String r1 = r13.mo138124a(r1)
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            r8 = 1
            int r9 = r12.f107869b
            r10 = 2
            j$.time.format.D r11 = r12.f107871d
            if (r5 < 0) goto L_0x0062
            int[] r0 = p073j$.time.format.C42630d.f107857a
            int r5 = r11.ordinal()
            r0 = r0[r5]
            if (r0 == r8) goto L_0x0055
            if (r0 == r10) goto L_0x0050
            goto L_0x0099
        L_0x0050:
            char r0 = r13.mo138128e()
            goto L_0x0096
        L_0x0055:
            r0 = 19
            if (r9 >= r0) goto L_0x0099
            long[] r0 = f107867f
            r5 = r0[r9]
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0099
            goto L_0x0050
        L_0x0062:
            int[] r5 = p073j$.time.format.C42630d.f107857a
            int r11 = r11.ordinal()
            r5 = r5[r11]
            if (r5 == r8) goto L_0x0092
            if (r5 == r10) goto L_0x0092
            r10 = 3
            if (r5 == r10) goto L_0x0092
            r10 = 4
            if (r5 == r10) goto L_0x0075
            goto L_0x0099
        L_0x0075:
            j$.time.c r13 = new j$.time.c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r7)
            r14.append(r0)
            r14.append(r6)
            r14.append(r3)
            java.lang.String r0 = " cannot be negative according to the SignStyle"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x0092:
            char r0 = r13.mo138127d()
        L_0x0096:
            r14.append(r0)
        L_0x0099:
            int r0 = r1.length()
            int r0 = r9 - r0
            if (r2 >= r0) goto L_0x00ab
            char r0 = r13.mo138130f()
            r14.append(r0)
            int r2 = r2 + 1
            goto L_0x0099
        L_0x00ab:
            r14.append(r1)
            return r8
        L_0x00af:
            j$.time.c r13 = new j$.time.c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r7)
            r14.append(r0)
            r14.append(r6)
            r14.append(r3)
            java.lang.String r0 = " exceeds the maximum print width of "
            r14.append(r0)
            r14.append(r8)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.format.C42637k.mo138135n(j$.time.format.y, java.lang.StringBuilder):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0183  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo138136o(p073j$.time.format.C42649w r21, java.lang.CharSequence r22, int r23) {
        /*
            r20 = this;
            r6 = r20
            r0 = r23
            int r1 = r22.length()
            if (r0 != r1) goto L_0x000c
            int r0 = ~r0
            return r0
        L_0x000c:
            char r2 = r22.charAt(r23)
            j$.time.format.DecimalStyle r3 = r21.mo138166g()
            char r3 = r3.mo138128e()
            r4 = 4
            r5 = 0
            r7 = 1
            int r8 = r6.f107870c
            j$.time.format.D r9 = r6.f107871d
            int r10 = r6.f107869b
            if (r2 != r3) goto L_0x004b
            boolean r2 = r21.mo138171l()
            if (r10 != r8) goto L_0x002b
            r3 = r7
            goto L_0x002c
        L_0x002b:
            r3 = r5
        L_0x002c:
            int r11 = r9.ordinal()
            if (r11 == 0) goto L_0x003e
            if (r11 == r7) goto L_0x003a
            if (r11 == r4) goto L_0x003a
            if (r2 != 0) goto L_0x003c
            if (r3 != 0) goto L_0x003c
        L_0x003a:
            r2 = r7
            goto L_0x0041
        L_0x003c:
            r2 = r5
            goto L_0x0041
        L_0x003e:
            if (r2 != 0) goto L_0x003c
            goto L_0x003a
        L_0x0041:
            if (r2 != 0) goto L_0x0045
            int r0 = ~r0
            return r0
        L_0x0045:
            int r0 = r0 + 1
            r4 = r0
            r0 = r5
            r2 = r7
            goto L_0x0088
        L_0x004b:
            j$.time.format.DecimalStyle r3 = r21.mo138166g()
            char r3 = r3.mo138127d()
            if (r2 != r3) goto L_0x0079
            boolean r2 = r21.mo138171l()
            if (r10 != r8) goto L_0x005d
            r3 = r7
            goto L_0x005e
        L_0x005d:
            r3 = r5
        L_0x005e:
            int r11 = r9.ordinal()
            if (r11 == 0) goto L_0x006c
            if (r11 == r7) goto L_0x006c
            if (r11 == r4) goto L_0x006c
            if (r2 != 0) goto L_0x006e
            if (r3 != 0) goto L_0x006e
        L_0x006c:
            r2 = r7
            goto L_0x006f
        L_0x006e:
            r2 = r5
        L_0x006f:
            if (r2 != 0) goto L_0x0073
            int r0 = ~r0
            return r0
        L_0x0073:
            int r0 = r0 + 1
            r4 = r0
            r2 = r5
            r0 = r7
            goto L_0x0088
        L_0x0079:
            j$.time.format.D r2 = p073j$.time.format.C42625D.ALWAYS
            if (r9 != r2) goto L_0x0085
            boolean r2 = r21.mo138171l()
            if (r2 == 0) goto L_0x0085
            int r0 = ~r0
            return r0
        L_0x0085:
            r4 = r0
            r0 = r5
            r2 = r0
        L_0x0088:
            boolean r3 = r21.mo138171l()
            if (r3 != 0) goto L_0x0097
            boolean r3 = r20.mo138144c(r21)
            if (r3 == 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r3 = r7
            goto L_0x0098
        L_0x0097:
            r3 = r10
        L_0x0098:
            int r11 = r4 + r3
            if (r11 <= r1) goto L_0x009e
            int r0 = ~r4
            return r0
        L_0x009e:
            boolean r12 = r21.mo138171l()
            if (r12 != 0) goto L_0x00ad
            boolean r12 = r20.mo138144c(r21)
            if (r12 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r8 = 9
        L_0x00ad:
            int r12 = r6.f107872e
            int r13 = java.lang.Math.max(r12, r5)
            int r13 = r13 + r8
        L_0x00b4:
            r8 = 2
            r16 = 0
            if (r5 >= r8) goto L_0x0118
            int r13 = r13 + r4
            int r8 = java.lang.Math.min(r13, r1)
            r13 = r4
            r17 = 0
        L_0x00c1:
            if (r13 >= r8) goto L_0x0104
            int r19 = r13 + 1
            r14 = r22
            char r13 = r14.charAt(r13)
            j$.time.format.DecimalStyle r15 = r21.mo138166g()
            int r13 = r15.mo138125b(r13)
            if (r13 >= 0) goto L_0x00db
            int r13 = r19 + -1
            if (r13 >= r11) goto L_0x0104
            int r0 = ~r4
            return r0
        L_0x00db:
            int r15 = r19 - r4
            r7 = 18
            if (r15 <= r7) goto L_0x00f9
            if (r16 != 0) goto L_0x00e7
            java.math.BigInteger r16 = java.math.BigInteger.valueOf(r17)
        L_0x00e7:
            r7 = r16
            java.math.BigInteger r15 = java.math.BigInteger.TEN
            java.math.BigInteger r7 = r7.multiply(r15)
            long r13 = (long) r13
            java.math.BigInteger r13 = java.math.BigInteger.valueOf(r13)
            java.math.BigInteger r16 = r7.add(r13)
            goto L_0x0100
        L_0x00f9:
            r14 = 10
            long r17 = r17 * r14
            long r13 = (long) r13
            long r17 = r17 + r13
        L_0x0100:
            r13 = r19
            r7 = 1
            goto L_0x00c1
        L_0x0104:
            if (r12 <= 0) goto L_0x0112
            if (r5 != 0) goto L_0x0112
            int r13 = r13 - r4
            int r13 = r13 - r12
            int r13 = java.lang.Math.max(r3, r13)
            int r5 = r5 + 1
            r7 = 1
            goto L_0x00b4
        L_0x0112:
            r5 = r13
            r1 = r16
            r7 = r17
            goto L_0x011d
        L_0x0118:
            r5 = r4
            r1 = r16
            r7 = 0
        L_0x011d:
            if (r0 == 0) goto L_0x014b
            if (r1 == 0) goto L_0x0139
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0133
            boolean r0 = r21.mo138171l()
            if (r0 == 0) goto L_0x0133
            r0 = 1
            int r4 = r4 - r0
            int r0 = ~r4
            return r0
        L_0x0133:
            java.math.BigInteger r0 = r1.negate()
            r1 = r0
            goto L_0x0163
        L_0x0139:
            r0 = 1
            r2 = 0
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0149
            boolean r2 = r21.mo138171l()
            if (r2 == 0) goto L_0x0149
            int r4 = r4 - r0
            int r0 = ~r4
            return r0
        L_0x0149:
            long r2 = -r7
            goto L_0x0164
        L_0x014b:
            j$.time.format.D r0 = p073j$.time.format.C42625D.EXCEEDS_PAD
            if (r9 != r0) goto L_0x0163
            boolean r0 = r21.mo138171l()
            if (r0 == 0) goto L_0x0163
            int r0 = r5 - r4
            if (r2 == 0) goto L_0x015f
            if (r0 > r10) goto L_0x0163
            r0 = 1
            int r4 = r4 - r0
            int r0 = ~r4
            return r0
        L_0x015f:
            if (r0 <= r10) goto L_0x0163
            int r0 = ~r4
            return r0
        L_0x0163:
            r2 = r7
        L_0x0164:
            if (r1 == 0) goto L_0x0183
            int r0 = r1.bitLength()
            r2 = 63
            if (r0 <= r2) goto L_0x0176
            java.math.BigInteger r0 = java.math.BigInteger.TEN
            java.math.BigInteger r1 = r1.divide(r0)
            int r5 = r5 + -1
        L_0x0176:
            long r2 = r1.longValue()
            r0 = r20
            r1 = r21
            int r0 = r0.mo138145d(r1, r2, r4, r5)
            return r0
        L_0x0183:
            r0 = r20
            r1 = r21
            int r0 = r0.mo138145d(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.format.C42637k.mo138136o(j$.time.format.w, java.lang.CharSequence, int):int");
    }

    public String toString() {
        C42625D d = this.f107871d;
        C42675n nVar = this.f107868a;
        int i = this.f107870c;
        int i2 = this.f107869b;
        if (i2 == 1 && i == 19 && d == C42625D.NORMAL) {
            return "Value(" + nVar + ")";
        } else if (i2 == i && d == C42625D.NOT_NEGATIVE) {
            return "Value(" + nVar + "," + i2 + ")";
        } else {
            return "Value(" + nVar + "," + i2 + "," + i + "," + d + ")";
        }
    }
}
