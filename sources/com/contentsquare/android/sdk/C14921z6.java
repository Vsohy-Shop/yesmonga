package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.z6 */
public class C14921z6 {
    /* renamed from: a */
    public static double m64195a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: b */
    public static int m64196b(float f) {
        return (int) (f + 0.5f);
    }

    /* renamed from: c */
    public static int m64197c(int i, int i2) {
        return i * i2;
    }

    /* renamed from: d */
    public static int m64198d(long j) {
        return (int) Math.max(Math.min(j, 2147483647L), -2147483648L);
    }

    /* renamed from: e */
    public static boolean m64199e(int i, int i2, int i3, int i4, int i5, int i6) {
        return i5 >= i && i5 <= i + i3 && i6 >= i2 && i6 <= i2 + i4;
    }

    /* renamed from: f */
    public static int m64200f(int i, int i2) {
        return Integer.compare(i2, i);
    }
}
