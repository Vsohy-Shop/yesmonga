package kotlin;

import kotlin.internal.C11110f;
import kotlin.internal.C11111g;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11454c0;
import kotlin.ranges.C11483x;
import okhttp3.internal.p013ws.WebSocketProtocol;
import org.jetbrains.annotations.C12579k;

@C11288f
@C11665v0(version = "1.5")
@C11097g2(markerClass = {C11531s.class})
/* renamed from: kotlin.z1 */
public final class C11679z1 implements Comparable<C11679z1> {
    @C12579k

    /* renamed from: b */
    public static final C11680a f28986b = new C11680a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final short f28987c = 0;

    /* renamed from: d */
    public static final short f28988d = -1;

    /* renamed from: e */
    public static final int f28989e = 2;

    /* renamed from: f */
    public static final int f28990f = 16;

    /* renamed from: a */
    public final short f28991a;

    /* renamed from: kotlin.z1$a */
    public static final class C11680a {
        public /* synthetic */ C11680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C11680a() {
        }
    }

    @C11111g
    @C11532s0
    public /* synthetic */ C11679z1(short s) {
        this.f28991a = s;
    }

    @C11110f
    /* renamed from: A0 */
    public static final int m45827A0(short s, byte b) {
        return C11419p1.m43971M(C11419p1.m43971M(s & f28988d) - C11419p1.m43971M(b & 255));
    }

    @C11110f
    /* renamed from: A1 */
    public static final int m45828A1(short s, short s2) {
        return C11092f1.m42711a(C11419p1.m43971M(s & f28988d), C11419p1.m43971M(s2 & f28988d));
    }

    @C11110f
    /* renamed from: B1 */
    public static final int m45829B1(short s, byte b) {
        return C11419p1.m43971M(C11419p1.m43971M(s & f28988d) * C11419p1.m43971M(b & 255));
    }

    @C11110f
    /* renamed from: C0 */
    public static final long m45830C0(short s, long j) {
        return C11588t1.m44970M(C11588t1.m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j);
    }

    @C11110f
    /* renamed from: E1 */
    public static final long m45831E1(short s, long j) {
        return C11588t1.m44970M(C11588t1.m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j);
    }

    @C11110f
    /* renamed from: F0 */
    public static final int m45832F0(short s, int i) {
        return C11419p1.m43971M(C11419p1.m43971M(s & f28988d) - i);
    }

    @C11110f
    /* renamed from: F1 */
    public static final int m45833F1(short s, int i) {
        return C11419p1.m43971M(C11419p1.m43971M(s & f28988d) * i);
    }

    @C11110f
    /* renamed from: G1 */
    public static final int m45834G1(short s, short s2) {
        return C11419p1.m43971M(C11419p1.m43971M(s & f28988d) * C11419p1.m43971M(s2 & f28988d));
    }

    @C11110f
    /* renamed from: H0 */
    public static final int m45835H0(short s, short s2) {
        return C11419p1.m43971M(C11419p1.m43971M(s & f28988d) - C11419p1.m43971M(s2 & f28988d));
    }

    @C11110f
    /* renamed from: H1 */
    public static final byte m45836H1(short s) {
        return (byte) s;
    }

    @C11110f
    /* renamed from: I1 */
    public static final double m45837I1(short s) {
        return (double) (s & f28988d);
    }

    @C11110f
    /* renamed from: K0 */
    public static final byte m45838K0(short s, byte b) {
        return C11400l1.m43761M((byte) C11092f1.m42711a(C11419p1.m43971M(s & f28988d), C11419p1.m43971M(b & 255)));
    }

    @C11110f
    /* renamed from: L0 */
    public static final long m45839L0(short s, long j) {
        return C11104i1.m42815a(C11588t1.m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @C11110f
    /* renamed from: L1 */
    public static final float m45840L1(short s) {
        return (float) (s & f28988d);
    }

    @C11111g
    @C11532s0
    /* renamed from: M */
    public static short m45841M(short s) {
        return s;
    }

    @C11110f
    /* renamed from: M1 */
    public static final int m45842M1(short s) {
        return s & f28988d;
    }

    @C11110f
    /* renamed from: N0 */
    public static final int m45843N0(short s, int i) {
        return C11092f1.m42711a(C11419p1.m43971M(s & f28988d), i);
    }

    @C11110f
    /* renamed from: N1 */
    public static final long m45844N1(short s) {
        return ((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    @C11110f
    /* renamed from: O0 */
    public static final short m45845O0(short s, short s2) {
        return m45841M((short) C11092f1.m42711a(C11419p1.m43971M(s & f28988d), C11419p1.m43971M(s2 & f28988d)));
    }

    @C11110f
    /* renamed from: Q */
    public static final short m45846Q(short s) {
        return m45841M((short) (s - 1));
    }

    @C11110f
    /* renamed from: Q1 */
    public static final short m45847Q1(short s) {
        return s;
    }

    @C11110f
    /* renamed from: R0 */
    public static final short m45848R0(short s, short s2) {
        return m45841M((short) (s | s2));
    }

    @C12579k
    /* renamed from: T1 */
    public static String m45849T1(short s) {
        return String.valueOf(s & f28988d);
    }

    @C11110f
    /* renamed from: U0 */
    public static final int m45850U0(short s, byte b) {
        return C11419p1.m43971M(C11419p1.m43971M(s & f28988d) + C11419p1.m43971M(b & 255));
    }

    @C11110f
    /* renamed from: W */
    public static final int m45851W(short s, byte b) {
        return C11096g1.m42744a(C11419p1.m43971M(s & f28988d), C11419p1.m43971M(b & 255));
    }

    @C11110f
    /* renamed from: X */
    public static final long m45852X(short s, long j) {
        return C11397k1.m43746a(C11588t1.m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @C11110f
    /* renamed from: X1 */
    public static final byte m45853X1(short s) {
        return C11400l1.m43761M((byte) s);
    }

    @C11110f
    /* renamed from: Y1 */
    public static final int m45854Y1(short s) {
        return C11419p1.m43971M(s & f28988d);
    }

    @C11110f
    /* renamed from: Z */
    public static final int m45855Z(short s, int i) {
        return C11096g1.m42744a(C11419p1.m43971M(s & f28988d), i);
    }

    @C11110f
    /* renamed from: a2 */
    public static final long m45856a2(short s) {
        return C11588t1.m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @C11110f
    /* renamed from: b */
    public static final short m45857b(short s, short s2) {
        return m45841M((short) (s & s2));
    }

    @C11110f
    /* renamed from: c1 */
    public static final long m45858c1(short s, long j) {
        return C11588t1.m44970M(C11588t1.m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j);
    }

    @C11110f
    /* renamed from: c2 */
    public static final short m45859c2(short s) {
        return s;
    }

    @C11110f
    /* renamed from: e0 */
    public static final int m45860e0(short s, short s2) {
        return C11096g1.m42744a(C11419p1.m43971M(s & f28988d), C11419p1.m43971M(s2 & f28988d));
    }

    /* renamed from: f0 */
    public static boolean m45861f0(short s, Object obj) {
        return (obj instanceof C11679z1) && s == ((C11679z1) obj).mo23548e2();
    }

    /* renamed from: g */
    public static final /* synthetic */ C11679z1 m45862g(short s) {
        return new C11679z1(s);
    }

    /* renamed from: h0 */
    public static final boolean m45863h0(short s, short s2) {
        return s == s2;
    }

    @C11110f
    /* renamed from: i0 */
    public static final int m45864i0(short s, byte b) {
        return C11096g1.m42744a(C11419p1.m43971M(s & f28988d), C11419p1.m43971M(b & 255));
    }

    @C11110f
    /* renamed from: i2 */
    public static final short m45865i2(short s, short s2) {
        return m45841M((short) (s ^ s2));
    }

    @C11110f
    /* renamed from: j0 */
    public static final long m45866j0(short s, long j) {
        return C11397k1.m43746a(C11588t1.m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @C11110f
    /* renamed from: j1 */
    public static final int m45867j1(short s, int i) {
        return C11419p1.m43971M(C11419p1.m43971M(s & f28988d) + i);
    }

    @C11110f
    /* renamed from: k1 */
    public static final int m45868k1(short s, short s2) {
        return C11419p1.m43971M(C11419p1.m43971M(s & f28988d) + C11419p1.m43971M(s2 & f28988d));
    }

    @C11110f
    /* renamed from: l1 */
    public static final C11483x m45869l1(short s, short s2) {
        return new C11483x(C11419p1.m43971M(s & f28988d), C11419p1.m43971M(s2 & f28988d), (DefaultConstructorMarker) null);
    }

    @C11110f
    /* renamed from: m0 */
    public static final int m45870m0(short s, int i) {
        return C11096g1.m42744a(C11419p1.m43971M(s & f28988d), i);
    }

    @C11110f
    /* renamed from: n0 */
    public static final int m45871n0(short s, short s2) {
        return C11096g1.m42744a(C11419p1.m43971M(s & f28988d), C11419p1.m43971M(s2 & f28988d));
    }

    @C11110f
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: n1 */
    public static final C11483x m45872n1(short s, short s2) {
        return C11454c0.m44196V(C11419p1.m43971M(s & f28988d), C11419p1.m43971M(s2 & f28988d));
    }

    @C11532s0
    /* renamed from: o0 */
    public static /* synthetic */ void m45873o0() {
    }

    /* renamed from: p0 */
    public static int m45874p0(short s) {
        return Short.hashCode(s);
    }

    @C11110f
    /* renamed from: q */
    public static final int m45875q(short s, byte b) {
        return Intrinsics.compare((int) s & f28988d, (int) b & 255);
    }

    @C11110f
    /* renamed from: q1 */
    public static final int m45876q1(short s, byte b) {
        return C11092f1.m42711a(C11419p1.m43971M(s & f28988d), C11419p1.m43971M(b & 255));
    }

    @C11110f
    /* renamed from: r */
    public static final int m45877r(short s, long j) {
        return Long.compare(C11588t1.m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
    }

    @C11110f
    /* renamed from: t0 */
    public static final short m45878t0(short s) {
        return m45841M((short) (s + 1));
    }

    @C11110f
    /* renamed from: u0 */
    public static final short m45879u0(short s) {
        return m45841M((short) (~s));
    }

    @C11110f
    /* renamed from: w */
    public static final int m45880w(short s, int i) {
        return Integer.compare(C11419p1.m43971M(s & f28988d) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
    }

    @C11110f
    /* renamed from: w1 */
    public static final long m45881w1(short s, long j) {
        return C11104i1.m42815a(C11588t1.m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @C11110f
    /* renamed from: z */
    public static int m45882z(short s, short s2) {
        return Intrinsics.compare((int) s & f28988d, (int) s2 & f28988d);
    }

    @C11110f
    /* renamed from: z1 */
    public static final int m45883z1(short s, int i) {
        return C11092f1.m42711a(C11419p1.m43971M(s & f28988d), i);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare((int) mo23548e2() & f28988d, (int) ((C11679z1) obj).mo23548e2() & f28988d);
    }

    /* renamed from: e2 */
    public final /* synthetic */ short mo23548e2() {
        return this.f28991a;
    }

    public boolean equals(Object obj) {
        return m45861f0(this.f28991a, obj);
    }

    public int hashCode() {
        return m45874p0(this.f28991a);
    }

    @C12579k
    public String toString() {
        return m45849T1(this.f28991a);
    }

    @C11110f
    /* renamed from: y */
    public final int mo23552y(short s) {
        return Intrinsics.compare((int) mo23548e2() & f28988d, (int) s & f28988d);
    }
}
