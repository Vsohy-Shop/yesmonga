package androidx.compose.p004ui.util;

import kotlin.jvm.internal.C11377x;

/* renamed from: androidx.compose.ui.util.b */
public final class C16513b {
    /* renamed from: a */
    public static final long m74765a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
    }

    /* renamed from: b */
    public static final long m74766b(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* renamed from: c */
    public static final float m74767c(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: d */
    public static final float m74768d(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: e */
    public static final int m74769e(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: f */
    public static final int m74770f(long j) {
        return (int) (j & 4294967295L);
    }
}
