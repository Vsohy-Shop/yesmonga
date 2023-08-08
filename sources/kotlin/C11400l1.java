package kotlin;

import kotlin.internal.C11110f;
import kotlin.internal.C11111g;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11454c0;
import kotlin.ranges.C11483x;
import org.jetbrains.annotations.C12579k;

@C11288f
@C11665v0(version = "1.5")
@C11097g2(markerClass = {C11531s.class})
/* renamed from: kotlin.l1 */
public final class C11400l1 implements Comparable<C11400l1> {
    @C12579k

    /* renamed from: b */
    public static final C11401a f28530b = new C11401a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final byte f28531c = 0;

    /* renamed from: d */
    public static final byte f28532d = -1;

    /* renamed from: e */
    public static final int f28533e = 1;

    /* renamed from: f */
    public static final int f28534f = 8;

    /* renamed from: a */
    public final byte f28535a;

    /* renamed from: kotlin.l1$a */
    public static final class C11401a {
        public /* synthetic */ C11401a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C11401a() {
        }
    }

    @C11111g
    @C11532s0
    public /* synthetic */ C11400l1(byte b) {
        this.f28535a = b;
    }

    @C11110f
    /* renamed from: A0 */
    public static final int m43747A0(byte b, byte b2) {
        return C11419p1.m43971M(C11419p1.m43971M(b & 255) - C11419p1.m43971M(b2 & 255));
    }

    @C11110f
    /* renamed from: A1 */
    public static final int m43748A1(byte b, short s) {
        return C11092f1.m42711a(C11419p1.m43971M(b & 255), C11419p1.m43971M(s & C11679z1.f28988d));
    }

    @C11110f
    /* renamed from: B1 */
    public static final int m43749B1(byte b, byte b2) {
        return C11419p1.m43971M(C11419p1.m43971M(b & 255) * C11419p1.m43971M(b2 & 255));
    }

    @C11110f
    /* renamed from: C0 */
    public static final long m43750C0(byte b, long j) {
        return C11588t1.m44970M(C11588t1.m44970M(((long) b) & 255) - j);
    }

    @C11110f
    /* renamed from: E1 */
    public static final long m43751E1(byte b, long j) {
        return C11588t1.m44970M(C11588t1.m44970M(((long) b) & 255) * j);
    }

    @C11110f
    /* renamed from: F0 */
    public static final int m43752F0(byte b, int i) {
        return C11419p1.m43971M(C11419p1.m43971M(b & 255) - i);
    }

    @C11110f
    /* renamed from: F1 */
    public static final int m43753F1(byte b, int i) {
        return C11419p1.m43971M(C11419p1.m43971M(b & 255) * i);
    }

    @C11110f
    /* renamed from: G1 */
    public static final int m43754G1(byte b, short s) {
        return C11419p1.m43971M(C11419p1.m43971M(b & 255) * C11419p1.m43971M(s & C11679z1.f28988d));
    }

    @C11110f
    /* renamed from: H0 */
    public static final int m43755H0(byte b, short s) {
        return C11419p1.m43971M(C11419p1.m43971M(b & 255) - C11419p1.m43971M(s & C11679z1.f28988d));
    }

    @C11110f
    /* renamed from: H1 */
    public static final byte m43756H1(byte b) {
        return b;
    }

    @C11110f
    /* renamed from: I1 */
    public static final double m43757I1(byte b) {
        return (double) (b & 255);
    }

    @C11110f
    /* renamed from: K0 */
    public static final byte m43758K0(byte b, byte b2) {
        return m43761M((byte) C11092f1.m42711a(C11419p1.m43971M(b & 255), C11419p1.m43971M(b2 & 255)));
    }

    @C11110f
    /* renamed from: L0 */
    public static final long m43759L0(byte b, long j) {
        return C11104i1.m42815a(C11588t1.m44970M(((long) b) & 255), j);
    }

    @C11110f
    /* renamed from: L1 */
    public static final float m43760L1(byte b) {
        return (float) (b & 255);
    }

    @C11111g
    @C11532s0
    /* renamed from: M */
    public static byte m43761M(byte b) {
        return b;
    }

    @C11110f
    /* renamed from: M1 */
    public static final int m43762M1(byte b) {
        return b & 255;
    }

    @C11110f
    /* renamed from: N0 */
    public static final int m43763N0(byte b, int i) {
        return C11092f1.m42711a(C11419p1.m43971M(b & 255), i);
    }

    @C11110f
    /* renamed from: N1 */
    public static final long m43764N1(byte b) {
        return ((long) b) & 255;
    }

    @C11110f
    /* renamed from: O0 */
    public static final short m43765O0(byte b, short s) {
        return C11679z1.m45841M((short) C11092f1.m42711a(C11419p1.m43971M(b & 255), C11419p1.m43971M(s & C11679z1.f28988d)));
    }

    @C11110f
    /* renamed from: Q */
    public static final byte m43766Q(byte b) {
        return m43761M((byte) (b - 1));
    }

    @C11110f
    /* renamed from: Q1 */
    public static final short m43767Q1(byte b) {
        return (short) (((short) b) & 255);
    }

    @C11110f
    /* renamed from: R0 */
    public static final byte m43768R0(byte b, byte b2) {
        return m43761M((byte) (b | b2));
    }

    @C12579k
    /* renamed from: T1 */
    public static String m43769T1(byte b) {
        return String.valueOf(b & 255);
    }

    @C11110f
    /* renamed from: U0 */
    public static final int m43770U0(byte b, byte b2) {
        return C11419p1.m43971M(C11419p1.m43971M(b & 255) + C11419p1.m43971M(b2 & 255));
    }

    @C11110f
    /* renamed from: W */
    public static final int m43771W(byte b, byte b2) {
        return C11096g1.m42744a(C11419p1.m43971M(b & 255), C11419p1.m43971M(b2 & 255));
    }

    @C11110f
    /* renamed from: X */
    public static final long m43772X(byte b, long j) {
        return C11397k1.m43746a(C11588t1.m44970M(((long) b) & 255), j);
    }

    @C11110f
    /* renamed from: X1 */
    public static final byte m43773X1(byte b) {
        return b;
    }

    @C11110f
    /* renamed from: Y1 */
    public static final int m43774Y1(byte b) {
        return C11419p1.m43971M(b & 255);
    }

    @C11110f
    /* renamed from: Z */
    public static final int m43775Z(byte b, int i) {
        return C11096g1.m42744a(C11419p1.m43971M(b & 255), i);
    }

    @C11110f
    /* renamed from: a2 */
    public static final long m43776a2(byte b) {
        return C11588t1.m44970M(((long) b) & 255);
    }

    @C11110f
    /* renamed from: b */
    public static final byte m43777b(byte b, byte b2) {
        return m43761M((byte) (b & b2));
    }

    @C11110f
    /* renamed from: c1 */
    public static final long m43778c1(byte b, long j) {
        return C11588t1.m44970M(C11588t1.m44970M(((long) b) & 255) + j);
    }

    @C11110f
    /* renamed from: c2 */
    public static final short m43779c2(byte b) {
        return C11679z1.m45841M((short) (((short) b) & 255));
    }

    @C11110f
    /* renamed from: e0 */
    public static final int m43780e0(byte b, short s) {
        return C11096g1.m42744a(C11419p1.m43971M(b & 255), C11419p1.m43971M(s & C11679z1.f28988d));
    }

    /* renamed from: f0 */
    public static boolean m43781f0(byte b, Object obj) {
        return (obj instanceof C11400l1) && b == ((C11400l1) obj).mo22897e2();
    }

    /* renamed from: g */
    public static final /* synthetic */ C11400l1 m43782g(byte b) {
        return new C11400l1(b);
    }

    /* renamed from: h0 */
    public static final boolean m43783h0(byte b, byte b2) {
        return b == b2;
    }

    @C11110f
    /* renamed from: i0 */
    public static final int m43784i0(byte b, byte b2) {
        return C11096g1.m42744a(C11419p1.m43971M(b & 255), C11419p1.m43971M(b2 & 255));
    }

    @C11110f
    /* renamed from: i2 */
    public static final byte m43785i2(byte b, byte b2) {
        return m43761M((byte) (b ^ b2));
    }

    @C11110f
    /* renamed from: j0 */
    public static final long m43786j0(byte b, long j) {
        return C11397k1.m43746a(C11588t1.m44970M(((long) b) & 255), j);
    }

    @C11110f
    /* renamed from: j1 */
    public static final int m43787j1(byte b, int i) {
        return C11419p1.m43971M(C11419p1.m43971M(b & 255) + i);
    }

    @C11110f
    /* renamed from: k1 */
    public static final int m43788k1(byte b, short s) {
        return C11419p1.m43971M(C11419p1.m43971M(b & 255) + C11419p1.m43971M(s & C11679z1.f28988d));
    }

    @C11110f
    /* renamed from: l1 */
    public static final C11483x m43789l1(byte b, byte b2) {
        return new C11483x(C11419p1.m43971M(b & 255), C11419p1.m43971M(b2 & 255), (DefaultConstructorMarker) null);
    }

    @C11110f
    /* renamed from: m0 */
    public static final int m43790m0(byte b, int i) {
        return C11096g1.m42744a(C11419p1.m43971M(b & 255), i);
    }

    @C11110f
    /* renamed from: n0 */
    public static final int m43791n0(byte b, short s) {
        return C11096g1.m42744a(C11419p1.m43971M(b & 255), C11419p1.m43971M(s & C11679z1.f28988d));
    }

    @C11110f
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: n1 */
    public static final C11483x m43792n1(byte b, byte b2) {
        return C11454c0.m44196V(C11419p1.m43971M(b & 255), C11419p1.m43971M(b2 & 255));
    }

    @C11532s0
    /* renamed from: o0 */
    public static /* synthetic */ void m43793o0() {
    }

    /* renamed from: p0 */
    public static int m43794p0(byte b) {
        return Byte.hashCode(b);
    }

    @C11110f
    /* renamed from: q1 */
    public static final int m43795q1(byte b, byte b2) {
        return C11092f1.m42711a(C11419p1.m43971M(b & 255), C11419p1.m43971M(b2 & 255));
    }

    @C11110f
    /* renamed from: r */
    public static int m43796r(byte b, byte b2) {
        return Intrinsics.compare((int) b & 255, (int) b2 & 255);
    }

    @C11110f
    /* renamed from: t0 */
    public static final byte m43797t0(byte b) {
        return m43761M((byte) (b + 1));
    }

    @C11110f
    /* renamed from: u0 */
    public static final byte m43798u0(byte b) {
        return m43761M((byte) (~b));
    }

    @C11110f
    /* renamed from: w */
    public static final int m43799w(byte b, long j) {
        return Long.compare(C11588t1.m44970M(((long) b) & 255) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
    }

    @C11110f
    /* renamed from: w1 */
    public static final long m43800w1(byte b, long j) {
        return C11104i1.m42815a(C11588t1.m44970M(((long) b) & 255), j);
    }

    @C11110f
    /* renamed from: y */
    public static final int m43801y(byte b, int i) {
        return Integer.compare(C11419p1.m43971M(b & 255) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
    }

    @C11110f
    /* renamed from: z */
    public static final int m43802z(byte b, short s) {
        return Intrinsics.compare((int) b & 255, (int) s & C11679z1.f28988d);
    }

    @C11110f
    /* renamed from: z1 */
    public static final int m43803z1(byte b, int i) {
        return C11092f1.m42711a(C11419p1.m43971M(b & 255), i);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare((int) mo22897e2() & 255, (int) ((C11400l1) obj).mo22897e2() & 255);
    }

    /* renamed from: e2 */
    public final /* synthetic */ byte mo22897e2() {
        return this.f28535a;
    }

    public boolean equals(Object obj) {
        return m43781f0(this.f28535a, obj);
    }

    public int hashCode() {
        return m43794p0(this.f28535a);
    }

    @C11110f
    /* renamed from: q */
    public final int mo22900q(byte b) {
        return Intrinsics.compare((int) mo22897e2() & 255, (int) b & 255);
    }

    @C12579k
    public String toString() {
        return m43769T1(this.f28535a);
    }
}
