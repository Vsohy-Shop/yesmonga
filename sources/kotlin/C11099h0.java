package kotlin;

import kotlin.internal.C11110f;
import kotlin.internal.C11111g;

/* renamed from: kotlin.h0 */
public class C11099h0 extends C11095g0 {
    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: J */
    public static final int m42748J(byte b, byte b2) {
        int i = b / b2;
        return ((b ^ b2) >= 0 || b2 * i == b) ? i : i - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: K */
    public static final int m42749K(byte b, int i) {
        int i2 = b / i;
        return ((b ^ i) >= 0 || i * i2 == b) ? i2 : i2 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: L */
    public static final int m42750L(byte b, short s) {
        int i = b / s;
        return ((b ^ s) >= 0 || s * i == b) ? i : i - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: M */
    public static final int m42751M(int i, byte b) {
        int i2 = i / b;
        return ((i ^ b) >= 0 || b * i2 == i) ? i2 : i2 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: N */
    public static final int m42752N(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: O */
    public static final int m42753O(int i, short s) {
        int i2 = i / s;
        return ((i ^ s) >= 0 || s * i2 == i) ? i2 : i2 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: P */
    public static final int m42754P(short s, byte b) {
        int i = s / b;
        return ((s ^ b) >= 0 || b * i == s) ? i : i - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: Q */
    public static final int m42755Q(short s, int i) {
        int i2 = s / i;
        return ((s ^ i) >= 0 || i * i2 == s) ? i2 : i2 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: R */
    public static final int m42756R(short s, short s2) {
        int i = s / s2;
        return ((s ^ s2) >= 0 || s2 * i == s) ? i : i - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: S */
    public static final long m42757S(byte b, long j) {
        long j2 = (long) b;
        long j3 = j2 / j;
        return ((j2 ^ j) >= 0 || j * j3 == j2) ? j3 : j3 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: T */
    public static final long m42758T(int i, long j) {
        long j2 = (long) i;
        long j3 = j2 / j;
        return ((j2 ^ j) >= 0 || j * j3 == j2) ? j3 : j3 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: U */
    public static final long m42759U(long j, byte b) {
        long j2 = (long) b;
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: V */
    public static final long m42760V(long j, int i) {
        long j2 = (long) i;
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: W */
    public static final long m42761W(long j, long j2) {
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: X */
    public static final long m42762X(long j, short s) {
        long j2 = (long) s;
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: Y */
    public static final long m42763Y(short s, long j) {
        long j2 = (long) s;
        long j3 = j2 / j;
        return ((j2 ^ j) >= 0 || j * j3 == j2) ? j3 : j3 - 1;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: Z */
    public static final byte m42764Z(byte b, byte b2) {
        int i = b % b2;
        return (byte) (i + (b2 & (((i ^ b2) & ((-i) | i)) >> 31)));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: a0 */
    public static final byte m42765a0(int i, byte b) {
        int i2 = i % b;
        return (byte) (i2 + (b & (((i2 ^ b) & ((-i2) | i2)) >> 31)));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: b0 */
    public static final byte m42766b0(long j, byte b) {
        long j2 = (long) b;
        long j3 = j % j2;
        return (byte) ((int) (j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63))));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: c0 */
    public static final byte m42767c0(short s, byte b) {
        int i = s % b;
        return (byte) (i + (b & (((i ^ b) & ((-i) | i)) >> 31)));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: d0 */
    public static final double m42768d0(double d, double d2) {
        double d3 = d % d2;
        boolean z = true;
        if (d3 == 0.0d) {
            return d3;
        }
        if (Math.signum(d3) != Math.signum(d2)) {
            z = false;
        }
        return !z ? d3 + d2 : d3;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: e0 */
    public static final double m42769e0(double d, float f) {
        double d2 = (double) f;
        double d3 = d % d2;
        boolean z = true;
        if (d3 == 0.0d) {
            return d3;
        }
        if (Math.signum(d3) != Math.signum(d2)) {
            z = false;
        }
        return !z ? d3 + d2 : d3;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: f0 */
    public static final double m42770f0(float f, double d) {
        double d2 = ((double) f) % d;
        boolean z = true;
        if (d2 == 0.0d) {
            return d2;
        }
        if (Math.signum(d2) != Math.signum(d)) {
            z = false;
        }
        return !z ? d2 + d : d2;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: g0 */
    public static final float m42771g0(float f, float f2) {
        float f3 = f % f2;
        boolean z = true;
        if (f3 == 0.0f) {
            return f3;
        }
        if (Math.signum(f3) != Math.signum(f2)) {
            z = false;
        }
        return !z ? f3 + f2 : f3;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: h0 */
    public static final int m42772h0(byte b, int i) {
        int i2 = b % i;
        return i2 + (i & (((i2 ^ i) & ((-i2) | i2)) >> 31));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: i0 */
    public static final int m42773i0(int i, int i2) {
        int i3 = i % i2;
        return i3 + (i2 & (((i3 ^ i2) & ((-i3) | i3)) >> 31));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: j0 */
    public static final int m42774j0(long j, int i) {
        long j2 = (long) i;
        long j3 = j % j2;
        return (int) (j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63)));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: k0 */
    public static final int m42775k0(short s, int i) {
        int i2 = s % i;
        return i2 + (i & (((i2 ^ i) & ((-i2) | i2)) >> 31));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: l0 */
    public static final long m42776l0(byte b, long j) {
        long j2 = ((long) b) % j;
        return j2 + (j & (((j2 ^ j) & ((-j2) | j2)) >> 63));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: m0 */
    public static final long m42777m0(int i, long j) {
        long j2 = ((long) i) % j;
        return j2 + (j & (((j2 ^ j) & ((-j2) | j2)) >> 63));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: n0 */
    public static final long m42778n0(long j, long j2) {
        long j3 = j % j2;
        return j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: o0 */
    public static final long m42779o0(short s, long j) {
        long j2 = ((long) s) % j;
        return j2 + (j & (((j2 ^ j) & ((-j2) | j2)) >> 63));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: p0 */
    public static final short m42780p0(byte b, short s) {
        int i = b % s;
        return (short) (i + (s & (((i ^ s) & ((-i) | i)) >> 31)));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: q0 */
    public static final short m42781q0(int i, short s) {
        int i2 = i % s;
        return (short) (i2 + (s & (((i2 ^ s) & ((-i2) | i2)) >> 31)));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: r0 */
    public static final short m42782r0(long j, short s) {
        long j2 = (long) s;
        long j3 = j % j2;
        return (short) ((int) (j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63))));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11111g
    /* renamed from: s0 */
    public static final short m42783s0(short s, short s2) {
        int i = s % s2;
        return (short) (i + (s2 & (((i ^ s2) & ((-i) | i)) >> 31)));
    }
}
