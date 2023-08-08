package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;
import java.util.Map;

/* renamed from: com.google.zxing.oned.m */
public final class C34788m extends C34792q {

    /* renamed from: b */
    public static final float f84394b = 0.38f;

    /* renamed from: c */
    public static final float f84395c = 0.5f;

    /* renamed from: d */
    public static final int f84396d = 3;

    /* renamed from: e */
    public static final int f84397e = 2;

    /* renamed from: f */
    public static final int f84398f = 1;

    /* renamed from: g */
    public static final int[] f84399g = {6, 8, 10, 12, 14};

    /* renamed from: h */
    public static final int[] f84400h = {1, 1, 1, 1};

    /* renamed from: i */
    public static final int[][] f84401i = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: j */
    public static final int[][] f84402j = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    public int f84403a = -1;

    /* renamed from: h */
    public static int m142023h(int[] iArr) throws NotFoundException {
        int length = f84402j.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float e = C34792q.m142035e(iArr, f84402j[i2], 0.5f);
            if (e < f) {
                i = i2;
                f = e;
            } else if (e == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: j */
    public static void m142024j(C34709a aVar, int i, int i2, StringBuilder sb) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C34792q.m142036f(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m142023h(iArr2) + 48));
            sb.append((char) (m142023h(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: l */
    public static int[] m142025l(C34709a aVar, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int o = aVar.mo102649o();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < o) {
            if (aVar.mo102645k(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (C34792q.m142035e(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: m */
    public static int m142026m(C34709a aVar) throws NotFoundException {
        int o = aVar.mo102649o();
        int m = aVar.mo102647m(0);
        if (m != o) {
            return m;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: b */
    public C34761k mo102904b(int i, C34709a aVar, Map<DecodeHintType, ?> map) throws FormatException, NotFoundException {
        int[] iArr;
        boolean z;
        int[] k = mo102917k(aVar);
        int[] i2 = mo102916i(aVar);
        StringBuilder sb = new StringBuilder(20);
        m142024j(aVar, k[1], i2[0], sb);
        String sb2 = sb.toString();
        if (map != null) {
            iArr = (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS);
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = f84399g;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length2) {
                z = false;
                break;
            }
            int i5 = iArr[i3];
            if (length == i5) {
                z = true;
                break;
            }
            if (i5 > i4) {
                i4 = i5;
            }
            i3++;
        }
        if (!z && length > i4) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new C34761k(sb2, (byte[]) null, new C34762l[]{new C34762l((float) k[1], f), new C34762l((float) i2[0], f)}, BarcodeFormat.ITF);
        }
        throw FormatException.m141227a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = m142025l(r7, r0, f84401i[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo102916i(com.google.zxing.common.C34709a r7) throws com.google.zxing.NotFoundException {
        /*
            r6 = this;
            r7.mo102653v()
            int r0 = m142026m(r7)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            int[][] r3 = f84401i     // Catch:{ NotFoundException -> 0x0012 }
            r3 = r3[r2]     // Catch:{ NotFoundException -> 0x0012 }
            int[] r0 = m142025l(r7, r0, r3)     // Catch:{ NotFoundException -> 0x0012 }
            goto L_0x001a
        L_0x0012:
            int[][] r3 = f84401i     // Catch:{ all -> 0x0035 }
            r3 = r3[r1]     // Catch:{ all -> 0x0035 }
            int[] r0 = m142025l(r7, r0, r3)     // Catch:{ all -> 0x0035 }
        L_0x001a:
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            r6.mo102918n(r7, r3)     // Catch:{ all -> 0x0035 }
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            int r4 = r7.mo102649o()     // Catch:{ all -> 0x0035 }
            r5 = r0[r1]     // Catch:{ all -> 0x0035 }
            int r4 = r4 - r5
            r0[r2] = r4     // Catch:{ all -> 0x0035 }
            int r2 = r7.mo102649o()     // Catch:{ all -> 0x0035 }
            int r2 = r2 - r3
            r0[r1] = r2     // Catch:{ all -> 0x0035 }
            r7.mo102653v()
            return r0
        L_0x0035:
            r0 = move-exception
            r7.mo102653v()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.C34788m.mo102916i(com.google.zxing.common.a):int[]");
    }

    /* renamed from: k */
    public final int[] mo102917k(C34709a aVar) throws NotFoundException {
        int[] l = m142025l(aVar, m142026m(aVar), f84400h);
        int i = l[1];
        int i2 = l[0];
        this.f84403a = (i - i2) / 4;
        mo102918n(aVar, i2);
        return l;
    }

    /* renamed from: n */
    public final void mo102918n(C34709a aVar, int i) throws NotFoundException {
        int i2 = this.f84403a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !aVar.mo102645k(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw NotFoundException.m141229a();
        }
    }
}
