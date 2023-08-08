package kotlin;

import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;

@C11314h(name = "UNumbersKt")
/* renamed from: kotlin.y1 */
public final class C11676y1 {
    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: A */
    public static final int m45799A(int i) {
        return C11419p1.m43971M(Integer.lowestOneBit(i));
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: B */
    public static final short m45800B(short s) {
        return C11679z1.m45841M((short) Integer.lowestOneBit(s & C11679z1.f28988d));
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: a */
    public static final int m45801a(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: b */
    public static final int m45802b(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: c */
    public static final int m45803c(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: d */
    public static final int m45804d(short s) {
        return Integer.numberOfLeadingZeros(s & C11679z1.f28988d) - 16;
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: e */
    public static final int m45805e(byte b) {
        return Integer.bitCount(C11419p1.m43971M(b & 255));
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: f */
    public static final int m45806f(long j) {
        return Long.bitCount(j);
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: g */
    public static final int m45807g(int i) {
        return Integer.bitCount(i);
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: h */
    public static final int m45808h(short s) {
        return Integer.bitCount(C11419p1.m43971M(s & C11679z1.f28988d));
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: i */
    public static final int m45809i(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: j */
    public static final int m45810j(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: k */
    public static final int m45811k(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: l */
    public static final int m45812l(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: m */
    public static final long m45813m(long j, int i) {
        return C11588t1.m44970M(Long.rotateLeft(j, i));
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: n */
    public static final byte m45814n(byte b, int i) {
        return C11400l1.m43761M(C11279j0.m43394Z0(b, i));
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: o */
    public static final int m45815o(int i, int i2) {
        return C11419p1.m43971M(Integer.rotateLeft(i, i2));
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: p */
    public static final short m45816p(short s, int i) {
        return C11679z1.m45841M(C11279j0.m43395a1(s, i));
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: q */
    public static final long m45817q(long j, int i) {
        return C11588t1.m44970M(Long.rotateRight(j, i));
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: r */
    public static final byte m45818r(byte b, int i) {
        return C11400l1.m43761M(C11279j0.m43396b1(b, i));
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: s */
    public static final int m45819s(int i, int i2) {
        return C11419p1.m43971M(Integer.rotateRight(i, i2));
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: t */
    public static final short m45820t(short s, int i) {
        return C11679z1.m45841M(C11279j0.m43397c1(s, i));
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: u */
    public static final byte m45821u(byte b) {
        return C11400l1.m43761M((byte) Integer.highestOneBit(b & 255));
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: v */
    public static final long m45822v(long j) {
        return C11588t1.m44970M(Long.highestOneBit(j));
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: w */
    public static final int m45823w(int i) {
        return C11419p1.m43971M(Integer.highestOneBit(i));
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: x */
    public static final short m45824x(short s) {
        return C11679z1.m45841M((short) Integer.highestOneBit(s & C11679z1.f28988d));
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: y */
    public static final byte m45825y(byte b) {
        return C11400l1.m43761M((byte) Integer.lowestOneBit(b & 255));
    }

    @C11097g2(markerClass = {C11531s.class, C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: z */
    public static final long m45826z(long j) {
        return C11588t1.m44970M(Long.lowestOneBit(j));
    }
}
