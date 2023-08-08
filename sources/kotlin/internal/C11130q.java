package kotlin.internal;

import kotlin.C11092f1;
import kotlin.C11104i1;
import kotlin.C11419p1;
import kotlin.C11532s0;
import kotlin.C11588t1;
import kotlin.C11665v0;

/* renamed from: kotlin.internal.q */
public final class C11130q {
    /* renamed from: a */
    public static final int m42838a(int i, int i2, int i3) {
        int a = C11092f1.m42711a(i, i3);
        int a2 = C11092f1.m42711a(i2, i3);
        int a3 = Integer.compare(a ^ Integer.MIN_VALUE, a2 ^ Integer.MIN_VALUE);
        int M = C11419p1.m43971M(a - a2);
        if (a3 >= 0) {
            return M;
        }
        return C11419p1.m43971M(M + i3);
    }

    /* renamed from: b */
    public static final long m42839b(long j, long j2, long j3) {
        long a = C11104i1.m42815a(j, j3);
        long a2 = C11104i1.m42815a(j2, j3);
        int a3 = Long.compare(a ^ Long.MIN_VALUE, a2 ^ Long.MIN_VALUE);
        long M = C11588t1.m44970M(a - a2);
        if (a3 >= 0) {
            return M;
        }
        return C11588t1.m44970M(M + j3);
    }

    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: c */
    public static final long m42840c(long j, long j2, long j3) {
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i > 0) {
            if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0) {
                return j2;
            }
            return C11588t1.m44970M(j2 - m42839b(j2, j, C11588t1.m44970M(j3)));
        } else if (i >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0) {
            return j2;
        } else {
            return C11588t1.m44970M(j2 + m42839b(j, j2, C11588t1.m44970M(-j3)));
        }
    }

    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: d */
    public static final int m42841d(int i, int i2, int i3) {
        if (i3 > 0) {
            if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) >= 0) {
                return i2;
            }
            return C11419p1.m43971M(i2 - m42838a(i2, i, C11419p1.m43971M(i3)));
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) <= 0) {
            return i2;
        } else {
            return C11419p1.m43971M(i2 + m42838a(i, i2, C11419p1.m43971M(-i3)));
        }
    }
}
