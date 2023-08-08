package kotlin.internal;

import kotlin.C11532s0;

/* renamed from: kotlin.internal.n */
public final class C11126n {
    /* renamed from: a */
    public static final int m42832a(int i, int i2, int i3) {
        return m42836e(m42836e(i, i3) - m42836e(i2, i3), i3);
    }

    /* renamed from: b */
    public static final long m42833b(long j, long j2, long j3) {
        return m42837f(m42837f(j, j3) - m42837f(j2, j3), j3);
    }

    @C11532s0
    /* renamed from: c */
    public static final int m42834c(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m42832a(i2, i, i3);
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            return i2 + m42832a(i, i2, -i3);
        }
    }

    @C11532s0
    /* renamed from: d */
    public static final long m42835d(long j, long j2, long j3) {
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i > 0) {
            if (j >= j2) {
                return j2;
            }
            return j2 - m42833b(j2, j, j3);
        } else if (i >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (j <= j2) {
            return j2;
        } else {
            return j2 + m42833b(j, j2, -j3);
        }
    }

    /* renamed from: e */
    public static final int m42836e(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: f */
    public static final long m42837f(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }
}
