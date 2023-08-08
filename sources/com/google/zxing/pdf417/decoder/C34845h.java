package com.google.zxing.pdf417.decoder;

import com.google.zxing.common.detector.C34713a;
import com.google.zxing.pdf417.C34830a;
import java.lang.reflect.Array;

/* renamed from: com.google.zxing.pdf417.decoder.h */
public final class C34845h {

    /* renamed from: a */
    public static final float[][] f84629a;

    static {
        int i;
        int length = C34830a.f84536i.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f84629a = (float[][]) Array.newInstance(Float.TYPE, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = C34830a.f84536i;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    f84629a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static int m142338a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    public static int m142339b(int[] iArr) {
        int d = C34713a.m141633d(iArr);
        float[] fArr = new float[8];
        if (d > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = ((float) iArr[i]) / ((float) d);
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f84629a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float[] fArr3 = fArr2[i3];
            float f2 = 0.0f;
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C34830a.f84536i[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    public static int m142340c(int[] iArr) {
        int a = m142338a(iArr);
        if (C34830a.m142210b(a) == -1) {
            return -1;
        }
        return a;
    }

    /* renamed from: d */
    public static int m142341d(int[] iArr) {
        int c = m142340c(m142342e(iArr));
        if (c != -1) {
            return c;
        }
        return m142339b(iArr);
    }

    /* renamed from: e */
    public static int[] m142342e(int[] iArr) {
        float d = (float) C34713a.m141633d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            float f = (d / 34.0f) + ((((float) i3) * d) / 17.0f);
            int i4 = iArr[i2];
            if (((float) (i + i4)) <= f) {
                i += i4;
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
