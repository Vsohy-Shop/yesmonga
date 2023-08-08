package kotlin;

import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11600b;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "UnsignedKt")
/* renamed from: kotlin.f2 */
public final class C11093f2 {
    @C11532s0
    /* renamed from: a */
    public static final int m42712a(double d) {
        if (Double.isNaN(d) || d <= m42717f(0)) {
            return 0;
        }
        if (d >= m42717f(-1)) {
            return -1;
        }
        if (d <= 2.147483647E9d) {
            return C11419p1.m43971M((int) d);
        }
        return C11419p1.m43971M(C11419p1.m43971M((int) (d - ((double) Integer.MAX_VALUE))) + C11419p1.m43971M(Integer.MAX_VALUE));
    }

    @C11532s0
    /* renamed from: b */
    public static final long m42713b(double d) {
        if (Double.isNaN(d) || d <= m42721j(0)) {
            return 0;
        }
        if (d >= m42721j(-1)) {
            return -1;
        }
        if (d < 9.223372036854776E18d) {
            return C11588t1.m44970M((long) d);
        }
        return C11588t1.m44970M(C11588t1.m44970M((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @C11532s0
    /* renamed from: c */
    public static final int m42714c(int i, int i2) {
        return Intrinsics.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @C11532s0
    /* renamed from: d */
    public static final int m42715d(int i, int i2) {
        return C11419p1.m43971M((int) ((((long) i) & 4294967295L) / (((long) i2) & 4294967295L)));
    }

    @C11532s0
    /* renamed from: e */
    public static final int m42716e(int i, int i2) {
        return C11419p1.m43971M((int) ((((long) i) & 4294967295L) % (((long) i2) & 4294967295L)));
    }

    @C11532s0
    /* renamed from: f */
    public static final double m42717f(int i) {
        return ((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * ((double) 2));
    }

    @C11532s0
    /* renamed from: g */
    public static final int m42718g(long j, long j2) {
        return Intrinsics.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @C11532s0
    /* renamed from: h */
    public static final long m42719h(long j, long j2) {
        if (j2 < 0) {
            if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0) {
                return C11588t1.m44970M(0);
            }
            return C11588t1.m44970M(1);
        } else if (j >= 0) {
            return C11588t1.m44970M(j / j2);
        } else {
            int i = 1;
            long j3 = ((j >>> 1) / j2) << 1;
            if (Long.compare(C11588t1.m44970M(j - (j3 * j2)) ^ Long.MIN_VALUE, C11588t1.m44970M(j2) ^ Long.MIN_VALUE) < 0) {
                i = 0;
            }
            return C11588t1.m44970M(j3 + ((long) i));
        }
    }

    @C11532s0
    /* renamed from: i */
    public static final long m42720i(long j, long j2) {
        if (j2 < 0) {
            if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0) {
                return j;
            }
            return C11588t1.m44970M(j - j2);
        } else if (j >= 0) {
            return C11588t1.m44970M(j % j2);
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            if (Long.compare(C11588t1.m44970M(j3) ^ Long.MIN_VALUE, C11588t1.m44970M(j2) ^ Long.MIN_VALUE) < 0) {
                j2 = 0;
            }
            return C11588t1.m44970M(j3 - j2);
        }
    }

    @C11532s0
    /* renamed from: j */
    public static final double m42721j(long j) {
        return (((double) (j >>> 11)) * ((double) 2048)) + ((double) (j & 2047));
    }

    @C12579k
    /* renamed from: k */
    public static final String m42722k(long j) {
        return m42723l(j, 10);
    }

    @C12579k
    /* renamed from: l */
    public static final String m42723l(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, C11600b.m45172a(i));
            Intrinsics.checkNotNullExpressionValue(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = (long) i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, C11600b.m45172a(i));
        Intrinsics.checkNotNullExpressionValue(l2, "toString(this, checkRadix(radix))");
        sb.append(l2);
        String l3 = Long.toString(j4, C11600b.m45172a(i));
        Intrinsics.checkNotNullExpressionValue(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }
}
