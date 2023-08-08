package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.detector.C34713a;
import com.google.zxing.oned.C34792q;

/* renamed from: com.google.zxing.oned.rss.a */
public abstract class C34794a extends C34792q {

    /* renamed from: g */
    public static final float f84414g = 0.2f;

    /* renamed from: h */
    public static final float f84415h = 0.45f;

    /* renamed from: i */
    public static final float f84416i = 0.7916667f;

    /* renamed from: j */
    public static final float f84417j = 0.89285713f;

    /* renamed from: a */
    public final int[] f84418a = new int[4];

    /* renamed from: b */
    public final int[] f84419b;

    /* renamed from: c */
    public final float[] f84420c;

    /* renamed from: d */
    public final float[] f84421d;

    /* renamed from: e */
    public final int[] f84422e;

    /* renamed from: f */
    public final int[] f84423f;

    public C34794a() {
        int[] iArr = new int[8];
        this.f84419b = iArr;
        this.f84420c = new float[4];
        this.f84421d = new float[4];
        this.f84422e = new int[(iArr.length / 2)];
        this.f84423f = new int[(iArr.length / 2)];
    }

    @Deprecated
    /* renamed from: h */
    public static int m142049h(int[] iArr) {
        return C34713a.m141633d(iArr);
    }

    /* renamed from: i */
    public static void m142050i(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 < f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: p */
    public static void m142051p(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 > f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: q */
    public static boolean m142052q(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public static int m142053r(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i = 0; i < iArr2.length; i++) {
            if (C34792q.m142035e(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: j */
    public final int[] mo102921j() {
        return this.f84419b;
    }

    /* renamed from: k */
    public final int[] mo102922k() {
        return this.f84418a;
    }

    /* renamed from: l */
    public final int[] mo102923l() {
        return this.f84423f;
    }

    /* renamed from: m */
    public final float[] mo102924m() {
        return this.f84421d;
    }

    /* renamed from: n */
    public final int[] mo102925n() {
        return this.f84422e;
    }

    /* renamed from: o */
    public final float[] mo102926o() {
        return this.f84420c;
    }
}
