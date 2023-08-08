package com.google.zxing.common.detector;

/* renamed from: com.google.zxing.common.detector.a */
public final class C34713a {
    /* renamed from: a */
    public static float m141630a(float f, float f2, float f3, float f4) {
        double d = (double) (f - f3);
        double d2 = (double) (f2 - f4);
        return (float) Math.sqrt((d * d) + (d2 * d2));
    }

    /* renamed from: b */
    public static float m141631b(int i, int i2, int i3, int i4) {
        double d = (double) (i - i3);
        double d2 = (double) (i2 - i4);
        return (float) Math.sqrt((d * d) + (d2 * d2));
    }

    /* renamed from: c */
    public static int m141632c(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }

    /* renamed from: d */
    public static int m141633d(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }
}
