package kotlin.comparisons;

import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.comparisons.h */
public class C11016h extends C11006g {
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: I */
    public static final byte m42439I(byte b, byte b2) {
        return (byte) Math.max(b, b2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: J */
    public static final byte m42440J(byte b, byte b2, byte b3) {
        return (byte) Math.max(b, Math.max(b2, b3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: K */
    public static final byte m42441K(byte b, @C12579k byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "other");
        for (byte max : bArr) {
            b = (byte) Math.max(b, max);
        }
        return b;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: L */
    public static final double m42442L(double d, double d2) {
        return Math.max(d, d2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: M */
    public static final double m42443M(double d, double d2, double d3) {
        return Math.max(d, Math.max(d2, d3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: N */
    public static final double m42444N(double d, @C12579k double... dArr) {
        Intrinsics.checkNotNullParameter(dArr, "other");
        for (double max : dArr) {
            d = Math.max(d, max);
        }
        return d;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: O */
    public static final float m42445O(float f, float f2) {
        return Math.max(f, f2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: P */
    public static final float m42446P(float f, float f2, float f3) {
        return Math.max(f, Math.max(f2, f3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: Q */
    public static final float m42447Q(float f, @C12579k float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "other");
        for (float max : fArr) {
            f = Math.max(f, max);
        }
        return f;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: R */
    public static final int m42448R(int i, int i2) {
        return Math.max(i, i2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: S */
    public static final int m42449S(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: T */
    public static final int m42450T(int i, @C12579k int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "other");
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: U */
    public static final long m42451U(long j, long j2) {
        return Math.max(j, j2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: V */
    public static final long m42452V(long j, long j2, long j3) {
        return Math.max(j, Math.max(j2, j3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: W */
    public static final long m42453W(long j, @C12579k long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "other");
        for (long max : jArr) {
            j = Math.max(j, max);
        }
        return j;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: X */
    public static final <T extends Comparable<? super T>> T m42454X(@C12579k T t, @C12579k T t2) {
        Intrinsics.checkNotNullParameter(t, "a");
        Intrinsics.checkNotNullParameter(t2, "b");
        if (t.compareTo(t2) >= 0) {
            return t;
        }
        return t2;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: Y */
    public static final <T extends Comparable<? super T>> T m42455Y(@C12579k T t, @C12579k T t2, @C12579k T t3) {
        Intrinsics.checkNotNullParameter(t, "a");
        Intrinsics.checkNotNullParameter(t2, "b");
        Intrinsics.checkNotNullParameter(t3, "c");
        return m42454X(t, m42454X(t2, t3));
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: Z */
    public static final <T extends Comparable<? super T>> T m42456Z(@C12579k T t, @C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(t, "a");
        Intrinsics.checkNotNullParameter(tArr, "other");
        for (T X : tArr) {
            t = m42454X(t, X);
        }
        return t;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: a0 */
    public static final short m42457a0(short s, short s2) {
        return (short) Math.max(s, s2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: b0 */
    public static final short m42458b0(short s, short s2, short s3) {
        return (short) Math.max(s, Math.max(s2, s3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: c0 */
    public static final short m42459c0(short s, @C12579k short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, "other");
        for (short max : sArr) {
            s = (short) Math.max(s, max);
        }
        return s;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: d0 */
    public static final byte m42460d0(byte b, byte b2) {
        return (byte) Math.min(b, b2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: e0 */
    public static final byte m42461e0(byte b, byte b2, byte b3) {
        return (byte) Math.min(b, Math.min(b2, b3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: f0 */
    public static final byte m42462f0(byte b, @C12579k byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "other");
        for (byte min : bArr) {
            b = (byte) Math.min(b, min);
        }
        return b;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: g0 */
    public static final double m42463g0(double d, double d2) {
        return Math.min(d, d2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: h0 */
    public static final double m42464h0(double d, double d2, double d3) {
        return Math.min(d, Math.min(d2, d3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: i0 */
    public static final double m42465i0(double d, @C12579k double... dArr) {
        Intrinsics.checkNotNullParameter(dArr, "other");
        for (double min : dArr) {
            d = Math.min(d, min);
        }
        return d;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: j0 */
    public static final float m42466j0(float f, float f2) {
        return Math.min(f, f2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: k0 */
    public static final float m42467k0(float f, float f2, float f3) {
        return Math.min(f, Math.min(f2, f3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: l0 */
    public static final float m42468l0(float f, @C12579k float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "other");
        for (float min : fArr) {
            f = Math.min(f, min);
        }
        return f;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: m0 */
    public static final int m42469m0(int i, int i2) {
        return Math.min(i, i2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: n0 */
    public static final int m42470n0(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: o0 */
    public static final int m42471o0(int i, @C12579k int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "other");
        for (int min : iArr) {
            i = Math.min(i, min);
        }
        return i;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: p0 */
    public static final long m42472p0(long j, long j2) {
        return Math.min(j, j2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: q0 */
    public static final long m42473q0(long j, long j2, long j3) {
        return Math.min(j, Math.min(j2, j3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: r0 */
    public static final long m42474r0(long j, @C12579k long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "other");
        for (long min : jArr) {
            j = Math.min(j, min);
        }
        return j;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: s0 */
    public static final <T extends Comparable<? super T>> T m42475s0(@C12579k T t, @C12579k T t2) {
        Intrinsics.checkNotNullParameter(t, "a");
        Intrinsics.checkNotNullParameter(t2, "b");
        if (t.compareTo(t2) <= 0) {
            return t;
        }
        return t2;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: t0 */
    public static final <T extends Comparable<? super T>> T m42476t0(@C12579k T t, @C12579k T t2, @C12579k T t3) {
        Intrinsics.checkNotNullParameter(t, "a");
        Intrinsics.checkNotNullParameter(t2, "b");
        Intrinsics.checkNotNullParameter(t3, "c");
        return m42475s0(t, m42475s0(t2, t3));
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: u0 */
    public static final <T extends Comparable<? super T>> T m42477u0(@C12579k T t, @C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(t, "a");
        Intrinsics.checkNotNullParameter(tArr, "other");
        for (T s0 : tArr) {
            t = m42475s0(t, s0);
        }
        return t;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: v0 */
    public static final short m42478v0(short s, short s2) {
        return (short) Math.min(s, s2);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: w0 */
    public static final short m42479w0(short s, short s2, short s3) {
        return (short) Math.min(s, Math.min(s2, s3));
    }

    @C11665v0(version = "1.4")
    /* renamed from: x0 */
    public static final short m42480x0(short s, @C12579k short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, "other");
        for (short min : sArr) {
            s = (short) Math.min(s, min);
        }
        return s;
    }
}
