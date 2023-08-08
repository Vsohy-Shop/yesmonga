package kotlin.collections;

import kotlin.C10857a2;
import kotlin.C11404m1;
import kotlin.C11431q1;
import kotlin.C11531s;
import kotlin.C11662u1;
import kotlin.C11679z1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.h1 */
public final class C10943h1 {
    @C11531s
    /* renamed from: a */
    public static final int m40950a(long[] jArr, int i, int i2) {
        long Q = C11662u1.m45750Q(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compare(C11662u1.m45750Q(jArr, i) ^ Long.MIN_VALUE, Q ^ Long.MIN_VALUE) < 0) {
                i++;
            }
            while (Long.compare(C11662u1.m45750Q(jArr, i2) ^ Long.MIN_VALUE, Q ^ Long.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                long Q2 = C11662u1.m45750Q(jArr, i);
                C11662u1.m45758j0(jArr, i, C11662u1.m45750Q(jArr, i2));
                C11662u1.m45758j0(jArr, i2, Q2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @C11531s
    /* renamed from: b */
    public static final int m40951b(byte[] bArr, int i, int i2) {
        byte b;
        byte Q = C11404m1.m43808Q(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                b = Q & 255;
                if (Intrinsics.compare((int) C11404m1.m43808Q(bArr, i) & 255, (int) b) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare((int) C11404m1.m43808Q(bArr, i2) & 255, (int) b) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte Q2 = C11404m1.m43808Q(bArr, i);
                C11404m1.m43816j0(bArr, i, C11404m1.m43808Q(bArr, i2));
                C11404m1.m43816j0(bArr, i2, Q2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @C11531s
    /* renamed from: c */
    public static final int m40952c(short[] sArr, int i, int i2) {
        short s;
        short Q = C10857a2.m38726Q(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                short Q2 = C10857a2.m38726Q(sArr, i) & C11679z1.f28988d;
                s = Q & C11679z1.f28988d;
                if (Intrinsics.compare((int) Q2, (int) s) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare((int) C10857a2.m38726Q(sArr, i2) & C11679z1.f28988d, (int) s) > 0) {
                i2--;
            }
            if (i <= i2) {
                short Q3 = C10857a2.m38726Q(sArr, i);
                C10857a2.m38734j0(sArr, i, C10857a2.m38726Q(sArr, i2));
                C10857a2.m38734j0(sArr, i2, Q3);
                i++;
                i2--;
            }
        }
        return i;
    }

    @C11531s
    /* renamed from: d */
    public static final int m40953d(int[] iArr, int i, int i2) {
        int Q = C11431q1.m44044Q(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compare(C11431q1.m44044Q(iArr, i) ^ Integer.MIN_VALUE, Q ^ Integer.MIN_VALUE) < 0) {
                i++;
            }
            while (Integer.compare(C11431q1.m44044Q(iArr, i2) ^ Integer.MIN_VALUE, Q ^ Integer.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                int Q2 = C11431q1.m44044Q(iArr, i);
                C11431q1.m44052j0(iArr, i, C11431q1.m44044Q(iArr, i2));
                C11431q1.m44052j0(iArr, i2, Q2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @C11531s
    /* renamed from: e */
    public static final void m40954e(long[] jArr, int i, int i2) {
        int a = m40950a(jArr, i, i2);
        int i3 = a - 1;
        if (i < i3) {
            m40954e(jArr, i, i3);
        }
        if (a < i2) {
            m40954e(jArr, a, i2);
        }
    }

    @C11531s
    /* renamed from: f */
    public static final void m40955f(byte[] bArr, int i, int i2) {
        int b = m40951b(bArr, i, i2);
        int i3 = b - 1;
        if (i < i3) {
            m40955f(bArr, i, i3);
        }
        if (b < i2) {
            m40955f(bArr, b, i2);
        }
    }

    @C11531s
    /* renamed from: g */
    public static final void m40956g(short[] sArr, int i, int i2) {
        int c = m40952c(sArr, i, i2);
        int i3 = c - 1;
        if (i < i3) {
            m40956g(sArr, i, i3);
        }
        if (c < i2) {
            m40956g(sArr, c, i2);
        }
    }

    @C11531s
    /* renamed from: h */
    public static final void m40957h(int[] iArr, int i, int i2) {
        int d = m40953d(iArr, i, i2);
        int i3 = d - 1;
        if (i < i3) {
            m40957h(iArr, i, i3);
        }
        if (d < i2) {
            m40957h(iArr, d, i2);
        }
    }

    @C11531s
    /* renamed from: i */
    public static final void m40958i(@C12579k long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "array");
        m40954e(jArr, i, i2 - 1);
    }

    @C11531s
    /* renamed from: j */
    public static final void m40959j(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "array");
        m40955f(bArr, i, i2 - 1);
    }

    @C11531s
    /* renamed from: k */
    public static final void m40960k(@C12579k short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "array");
        m40956g(sArr, i, i2 - 1);
    }

    @C11531s
    /* renamed from: l */
    public static final void m40961l(@C12579k int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "array");
        m40957h(iArr, i, i2 - 1);
    }
}
