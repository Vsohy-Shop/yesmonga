package com.google.android.material.color;

/* renamed from: com.google.android.material.color.t */
public final class C31267t {
    /* renamed from: a */
    public static float m125965a(float f, float f2, float f3) {
        return Math.min(Math.max(f3, f), f2);
    }

    /* renamed from: b */
    public static float m125966b(float f, float f2) {
        return 180.0f - Math.abs(Math.abs(f - f2) - 180.0f);
    }

    /* renamed from: c */
    public static float m125967c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    public static float m125968d(float f) {
        return f < 0.0f ? (f % 360.0f) + 360.0f : f >= 360.0f ? f % 360.0f : f;
    }

    /* renamed from: e */
    public static int m125969e(int i) {
        if (i < 0) {
            return (i % 360) + 360;
        }
        if (i >= 360) {
            return i % 360;
        }
        return i;
    }

    /* renamed from: f */
    public static float m125970f(float f) {
        return (f * 180.0f) / 3.1415927f;
    }

    /* renamed from: g */
    public static float m125971g(float f) {
        return (f / 180.0f) * 3.1415927f;
    }
}
