package org.joda.time.chrono;

import org.joda.time.C12589a;

abstract class BasicGJChronology extends BasicChronology {
    private static final long serialVersionUID = 538276888268L;

    /* renamed from: u1 */
    public static final int[] f30966u1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: v1 */
    public static final int[] f30967v1 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: w1 */
    public static final long[] f30968w1 = new long[12];

    /* renamed from: x1 */
    public static final long[] f30969x1 = new long[12];

    /* renamed from: y1 */
    public static final long f30970y1 = 5097600000L;

    static {
        long j = 0;
        int i = 0;
        long j2 = 0;
        while (i < 11) {
            j += ((long) f30966u1[i]) * 86400000;
            int i2 = i + 1;
            f30968w1[i2] = j;
            j2 += ((long) f30967v1[i]) * 86400000;
            f30969x1[i2] = j2;
            i = i2;
        }
    }

    public BasicGJChronology(C12589a aVar, Object obj, int i) {
        super(aVar, obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r13 < 12825000) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r13 < 20587500) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r13 < 28265625) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (r13 < 4978125) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r13 < 12740625) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0094, code lost:
        if (r13 < 20503125) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a3, code lost:
        if (r13 < 28181250) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r13 < 5062500) goto L_0x0071;
     */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo28861H0(long r13, int r15) {
        /*
            r12 = this;
            long r0 = r12.mo28870Q0(r15)
            long r13 = r13 - r0
            r0 = 10
            long r13 = r13 >> r0
            int r13 = (int) r13
            boolean r14 = r12.mo28874U0(r15)
            r15 = 2
            r1 = 3
            r2 = 5
            r3 = 6
            r4 = 8
            r5 = 9
            r6 = 11
            r7 = 12
            r8 = 1
            r9 = 4
            r10 = 7
            r11 = 2615625(0x27e949, float:3.665271E-39)
            if (r14 == 0) goto L_0x005e
            r14 = 15356250(0xea515a, float:2.151869E-38)
            if (r13 >= r14) goto L_0x0040
            r14 = 7678125(0x7528ad, float:1.0759345E-38)
            if (r13 >= r14) goto L_0x0034
            if (r13 >= r11) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            r14 = 5062500(0x4d3f64, float:7.094073E-39)
            if (r13 >= r14) goto L_0x0073
            goto L_0x0071
        L_0x0034:
            r14 = 10209375(0x9bc85f, float:1.4306382E-38)
            if (r13 >= r14) goto L_0x003a
            goto L_0x007a
        L_0x003a:
            r14 = 12825000(0xc3b1a8, float:1.7971653E-38)
            if (r13 >= r14) goto L_0x0083
            goto L_0x0081
        L_0x0040:
            r14 = 23118750(0x160c39e, float:4.128265E-38)
            if (r13 >= r14) goto L_0x0051
            r14 = 17971875(0x1123aa3, float:2.6858035E-38)
            if (r13 >= r14) goto L_0x004b
            goto L_0x008f
        L_0x004b:
            r14 = 20587500(0x13a23ec, float:3.4188577E-38)
            if (r13 >= r14) goto L_0x0098
            goto L_0x0096
        L_0x0051:
            r14 = 25734375(0x188ace7, float:5.020661E-38)
            if (r13 >= r14) goto L_0x0058
            goto L_0x00a8
        L_0x0058:
            r14 = 28265625(0x1af4c99, float:6.439476E-38)
            if (r13 >= r14) goto L_0x00a7
            goto L_0x00a5
        L_0x005e:
            r14 = 15271875(0xe907c3, float:2.1400455E-38)
            if (r13 >= r14) goto L_0x0085
            r14 = 7593750(0x73df16, float:1.064111E-38)
            if (r13 >= r14) goto L_0x0075
            if (r13 >= r11) goto L_0x006c
        L_0x006a:
            r0 = r8
            goto L_0x00a8
        L_0x006c:
            r14 = 4978125(0x4bf5cd, float:6.975839E-39)
            if (r13 >= r14) goto L_0x0073
        L_0x0071:
            r0 = r15
            goto L_0x00a8
        L_0x0073:
            r0 = r1
            goto L_0x00a8
        L_0x0075:
            r14 = 10125000(0x9a7ec8, float:1.4188147E-38)
            if (r13 >= r14) goto L_0x007c
        L_0x007a:
            r0 = r9
            goto L_0x00a8
        L_0x007c:
            r14 = 12740625(0xc26811, float:1.7853418E-38)
            if (r13 >= r14) goto L_0x0083
        L_0x0081:
            r0 = r2
            goto L_0x00a8
        L_0x0083:
            r0 = r3
            goto L_0x00a8
        L_0x0085:
            r14 = 23034375(0x15f7a07, float:4.1046182E-38)
            if (r13 >= r14) goto L_0x009a
            r14 = 17887500(0x110f10c, float:2.6621566E-38)
            if (r13 >= r14) goto L_0x0091
        L_0x008f:
            r0 = r10
            goto L_0x00a8
        L_0x0091:
            r14 = 20503125(0x138da55, float:3.3952108E-38)
            if (r13 >= r14) goto L_0x0098
        L_0x0096:
            r0 = r4
            goto L_0x00a8
        L_0x0098:
            r0 = r5
            goto L_0x00a8
        L_0x009a:
            r14 = 25650000(0x1876350, float:4.9733674E-38)
            if (r13 >= r14) goto L_0x00a0
            goto L_0x00a8
        L_0x00a0:
            r14 = 28181250(0x1ae0302, float:6.392182E-38)
            if (r13 >= r14) goto L_0x00a7
        L_0x00a5:
            r0 = r6
            goto L_0x00a8
        L_0x00a7:
            r0 = r7
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicGJChronology.mo28861H0(long, int):int");
    }

    /* renamed from: I0 */
    public long mo28862I0(int i, int i2) {
        if (mo28874U0(i)) {
            return f30969x1[i2 - 1];
        }
        return f30968w1[i2 - 1];
    }

    /* renamed from: O0 */
    public long mo28868O0(long j, long j2) {
        int N0 = mo28867N0(j);
        int N02 = mo28867N0(j2);
        long Q0 = j - mo28870Q0(N0);
        long Q02 = j2 - mo28870Q0(N02);
        if (Q02 >= 5097600000L) {
            if (mo28874U0(N02)) {
                if (!mo28874U0(N0)) {
                    Q02 -= 86400000;
                }
            } else if (Q0 >= 5097600000L && mo28874U0(N0)) {
                Q0 -= 86400000;
            }
        }
        int i = N0 - N02;
        if (Q0 < Q02) {
            i--;
        }
        return (long) i;
    }

    /* renamed from: T0 */
    public boolean mo28873T0(long j) {
        return mo28641g().mo28828g(j) == 29 && mo28619E().mo28807J(j);
    }

    /* renamed from: V0 */
    public long mo28875V0(long j, int i) {
        int N0 = mo28867N0(j);
        int r0 = mo28890r0(j, N0);
        int D0 = mo28857D0(j);
        if (r0 > 59) {
            if (mo28874U0(N0)) {
                if (!mo28874U0(i)) {
                    r0--;
                }
            } else if (mo28874U0(i)) {
                r0++;
            }
        }
        return mo28871R0(i, 1, r0) + ((long) D0);
    }

    /* renamed from: t0 */
    public int mo28892t0(int i) {
        return f30967v1[i - 1];
    }

    /* renamed from: v0 */
    public int mo28894v0(long j, int i) {
        if (i > 28 || i < 1) {
            return mo28893u0(j);
        }
        return 28;
    }

    /* renamed from: y0 */
    public int mo28897y0(int i, int i2) {
        if (mo28874U0(i)) {
            return f30967v1[i2 - 1];
        }
        return f30966u1[i2 - 1];
    }
}
