package com.google.zxing.pdf417.detector;

import com.google.zxing.C34644b;
import com.google.zxing.C34762l;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34710b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.pdf417.detector.a */
public final class C34847a {

    /* renamed from: a */
    public static final int[] f84634a = {0, 4, 1, 5};

    /* renamed from: b */
    public static final int[] f84635b = {6, 2, 7, 3};

    /* renamed from: c */
    public static final float f84636c = 0.42f;

    /* renamed from: d */
    public static final float f84637d = 0.8f;

    /* renamed from: e */
    public static final int[] f84638e = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: f */
    public static final int[] f84639f = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: g */
    public static final int f84640g = 3;

    /* renamed from: h */
    public static final int f84641h = 5;

    /* renamed from: i */
    public static final int f84642i = 25;

    /* renamed from: j */
    public static final int f84643j = 5;

    /* renamed from: k */
    public static final int f84644k = 10;

    /* renamed from: a */
    public static void m142367a(C34762l[] lVarArr, C34762l[] lVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            lVarArr[iArr[i]] = lVarArr2[i];
        }
    }

    /* renamed from: b */
    public static C34848b m142368b(C34644b bVar, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException {
        C34710b b = bVar.mo102478b();
        List<C34762l[]> c = m142369c(z, b);
        if (c.isEmpty()) {
            b = b.clone();
            b.mo102676u();
            c = m142369c(z, b);
        }
        return new C34848b(b, c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3.hasNext() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r4 = (com.google.zxing.C34762l[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r2 = (int) java.lang.Math.max((float) r2, r7.mo102884d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r4 = r4[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r2 = java.lang.Math.max(r2, (int) r4.mo102884d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r4 == 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r3 = r0.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.google.zxing.C34762l[]> m142369c(boolean r8, com.google.zxing.common.C34710b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0008:
            r4 = r3
        L_0x0009:
            int r5 = r9.mo102670k()
            if (r2 >= r5) goto L_0x0077
            com.google.zxing.l[] r3 = m142372f(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L_0x004f
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L_0x004f
            if (r4 == 0) goto L_0x0077
            java.util.Iterator r3 = r0.iterator()
        L_0x0023:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004b
            java.lang.Object r4 = r3.next()
            com.google.zxing.l[] r4 = (com.google.zxing.C34762l[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L_0x003d
            float r2 = (float) r2
            float r7 = r7.mo102884d()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L_0x003d:
            r4 = r4[r5]
            if (r4 == 0) goto L_0x0023
            float r4 = r4.mo102884d()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L_0x0023
        L_0x004b:
            int r2 = r2 + 5
            r3 = r1
            goto L_0x0008
        L_0x004f:
            r0.add(r3)
            if (r8 == 0) goto L_0x0077
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0065
            float r4 = r4.mo102883c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.mo102884d()
            goto L_0x0073
        L_0x0065:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.mo102883c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.mo102884d()
        L_0x0073:
            int r2 = (int) r2
            r3 = r4
            r4 = r6
            goto L_0x0009
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.detector.C34847a.m142369c(boolean, com.google.zxing.common.b):java.util.List");
    }

    /* renamed from: d */
    public static int[] m142370d(C34710b bVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bVar.mo102666h(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (bVar.mo102666h(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else if (m142373g(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m142373g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: e */
    public static C34762l[] m142371e(C34710b bVar, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        C34762l[] lVarArr = new C34762l[4];
        int[] iArr2 = new int[iArr.length];
        int i9 = i3;
        while (true) {
            if (i9 >= i8) {
                z = false;
                break;
            }
            int[] d = m142370d(bVar, i4, i9, i2, false, iArr, iArr2);
            if (d != null) {
                int i10 = i9;
                int[] iArr3 = d;
                int i11 = i10;
                while (true) {
                    if (i11 <= 0) {
                        i7 = i11;
                        break;
                    }
                    int i12 = i11 - 1;
                    int[] d2 = m142370d(bVar, i4, i12, i2, false, iArr, iArr2);
                    if (d2 == null) {
                        i7 = i12 + 1;
                        break;
                    }
                    iArr3 = d2;
                    i11 = i12;
                }
                float f = (float) i7;
                lVarArr[0] = new C34762l((float) iArr3[0], f);
                lVarArr[1] = new C34762l((float) iArr3[1], f);
                z = true;
                i9 = i7;
            } else {
                i9 += 5;
            }
        }
        int i13 = i9 + 1;
        if (z) {
            int[] iArr4 = {(int) lVarArr[0].mo102883c(), (int) lVarArr[1].mo102883c()};
            int i14 = i13;
            int i15 = 0;
            while (true) {
                if (i14 >= i8) {
                    i5 = i15;
                    i6 = i14;
                    break;
                }
                i5 = i15;
                i6 = i14;
                int[] d3 = m142370d(bVar, iArr4[0], i14, i2, false, iArr, iArr2);
                if (d3 == null || Math.abs(iArr4[0] - d3[0]) >= 5 || Math.abs(iArr4[1] - d3[1]) >= 5) {
                    if (i5 > 25) {
                        break;
                    }
                    i15 = i5 + 1;
                } else {
                    iArr4 = d3;
                    i15 = 0;
                }
                i14 = i6 + 1;
            }
            i13 = i6 - (i5 + 1);
            float f2 = (float) i13;
            lVarArr[2] = new C34762l((float) iArr4[0], f2);
            lVarArr[3] = new C34762l((float) iArr4[1], f2);
        }
        if (i13 - i9 < 10) {
            Arrays.fill(lVarArr, (Object) null);
        }
        return lVarArr;
    }

    /* renamed from: f */
    public static C34762l[] m142372f(C34710b bVar, int i, int i2) {
        int k = bVar.mo102670k();
        int o = bVar.mo102674o();
        C34762l[] lVarArr = new C34762l[8];
        m142367a(lVarArr, m142371e(bVar, k, o, i, i2, f84638e), f84634a);
        C34762l lVar = lVarArr[4];
        if (lVar != null) {
            i2 = (int) lVar.mo102883c();
            i = (int) lVarArr[4].mo102884d();
        }
        m142367a(lVarArr, m142371e(bVar, k, o, i, i2, f84639f), f84635b);
        return lVarArr;
    }

    /* renamed from: g */
    public static float m142373g(int[] iArr, int[] iArr2, float f) {
        float f2;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = (float) i;
        float f4 = f3 / ((float) i2);
        float f5 = f * f4;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f7 = ((float) iArr2[i4]) * f4;
            float f8 = (float) i5;
            if (f8 > f7) {
                f2 = f8 - f7;
            } else {
                f2 = f7 - f8;
            }
            if (f2 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f2;
        }
        return f6 / f3;
    }
}
