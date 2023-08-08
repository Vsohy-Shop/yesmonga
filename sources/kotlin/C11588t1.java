package kotlin;

import kotlin.internal.C11110f;
import kotlin.internal.C11111g;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11448a0;
import kotlin.ranges.C11454c0;
import okhttp3.internal.p013ws.WebSocketProtocol;
import org.jetbrains.annotations.C12579k;

@C11288f
@C11665v0(version = "1.5")
@C11097g2(markerClass = {C11531s.class})
/* renamed from: kotlin.t1 */
public final class C11588t1 implements Comparable<C11588t1> {
    @C12579k

    /* renamed from: b */
    public static final C11589a f28778b = new C11589a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f28779c = 0;

    /* renamed from: d */
    public static final long f28780d = -1;

    /* renamed from: e */
    public static final int f28781e = 8;

    /* renamed from: f */
    public static final int f28782f = 64;

    /* renamed from: a */
    public final long f28783a;

    /* renamed from: kotlin.t1$a */
    public static final class C11589a {
        public /* synthetic */ C11589a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C11589a() {
        }
    }

    @C11111g
    @C11532s0
    public /* synthetic */ C11588t1(long j) {
        this.f28783a = j;
    }

    @C11110f
    /* renamed from: A0 */
    public static final long m44956A0(long j, byte b) {
        return m44970M(j - m44970M(((long) b) & 255));
    }

    @C11110f
    /* renamed from: A1 */
    public static final long m44957A1(long j, short s) {
        return C11104i1.m42815a(j, m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @C11110f
    /* renamed from: B1 */
    public static final long m44958B1(long j, int i) {
        return m44970M(j << i);
    }

    @C11110f
    /* renamed from: C0 */
    public static final long m44959C0(long j, long j2) {
        return m44970M(j - j2);
    }

    @C11110f
    /* renamed from: E1 */
    public static final long m44960E1(long j, int i) {
        return m44970M(j >>> i);
    }

    @C11110f
    /* renamed from: F0 */
    public static final long m44961F0(long j, int i) {
        return m44970M(j - m44970M(((long) i) & 4294967295L));
    }

    @C11110f
    /* renamed from: F1 */
    public static final long m44962F1(long j, byte b) {
        return m44970M(j * m44970M(((long) b) & 255));
    }

    @C11110f
    /* renamed from: G1 */
    public static final long m44963G1(long j, long j2) {
        return m44970M(j * j2);
    }

    @C11110f
    /* renamed from: H0 */
    public static final long m44964H0(long j, short s) {
        return m44970M(j - m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @C11110f
    /* renamed from: H1 */
    public static final long m44965H1(long j, int i) {
        return m44970M(j * m44970M(((long) i) & 4294967295L));
    }

    @C11110f
    /* renamed from: I1 */
    public static final long m44966I1(long j, short s) {
        return m44970M(j * m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @C11110f
    /* renamed from: K0 */
    public static final byte m44967K0(long j, byte b) {
        return C11400l1.m43761M((byte) ((int) C11104i1.m42815a(j, m44970M(((long) b) & 255))));
    }

    @C11110f
    /* renamed from: L0 */
    public static final long m44968L0(long j, long j2) {
        return C11104i1.m42815a(j, j2);
    }

    @C11110f
    /* renamed from: L1 */
    public static final byte m44969L1(long j) {
        return (byte) ((int) j);
    }

    @C11111g
    @C11532s0
    /* renamed from: M */
    public static long m44970M(long j) {
        return j;
    }

    @C11110f
    /* renamed from: M1 */
    public static final double m44971M1(long j) {
        return C11093f2.m42721j(j);
    }

    @C11110f
    /* renamed from: N0 */
    public static final int m44972N0(long j, int i) {
        return C11419p1.m43971M((int) C11104i1.m42815a(j, m44970M(((long) i) & 4294967295L)));
    }

    @C11110f
    /* renamed from: N1 */
    public static final float m44973N1(long j) {
        return (float) C11093f2.m42721j(j);
    }

    @C11110f
    /* renamed from: O0 */
    public static final short m44974O0(long j, short s) {
        return C11679z1.m45841M((short) ((int) C11104i1.m42815a(j, m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX))));
    }

    @C11110f
    /* renamed from: Q */
    public static final long m44975Q(long j) {
        return m44970M(j - 1);
    }

    @C11110f
    /* renamed from: Q1 */
    public static final int m44976Q1(long j) {
        return (int) j;
    }

    @C11110f
    /* renamed from: R0 */
    public static final long m44977R0(long j, long j2) {
        return m44970M(j | j2);
    }

    @C11110f
    /* renamed from: T1 */
    public static final long m44978T1(long j) {
        return j;
    }

    @C11110f
    /* renamed from: U0 */
    public static final long m44979U0(long j, byte b) {
        return m44970M(j + m44970M(((long) b) & 255));
    }

    @C11110f
    /* renamed from: W */
    public static final long m44980W(long j, byte b) {
        return C11397k1.m43746a(j, m44970M(((long) b) & 255));
    }

    @C11110f
    /* renamed from: X */
    public static final long m44981X(long j, long j2) {
        return C11093f2.m42719h(j, j2);
    }

    @C11110f
    /* renamed from: X1 */
    public static final short m44982X1(long j) {
        return (short) ((int) j);
    }

    @C12579k
    /* renamed from: Y1 */
    public static String m44983Y1(long j) {
        return C11093f2.m42722k(j);
    }

    @C11110f
    /* renamed from: Z */
    public static final long m44984Z(long j, int i) {
        return C11397k1.m43746a(j, m44970M(((long) i) & 4294967295L));
    }

    @C11110f
    /* renamed from: a2 */
    public static final byte m44985a2(long j) {
        return C11400l1.m43761M((byte) ((int) j));
    }

    @C11110f
    /* renamed from: b */
    public static final long m44986b(long j, long j2) {
        return m44970M(j & j2);
    }

    @C11110f
    /* renamed from: c1 */
    public static final long m44987c1(long j, long j2) {
        return m44970M(j + j2);
    }

    @C11110f
    /* renamed from: c2 */
    public static final int m44988c2(long j) {
        return C11419p1.m43971M((int) j);
    }

    @C11110f
    /* renamed from: e0 */
    public static final long m44989e0(long j, short s) {
        return C11397k1.m43746a(j, m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @C11110f
    /* renamed from: e2 */
    public static final long m44990e2(long j) {
        return j;
    }

    /* renamed from: f0 */
    public static boolean m44991f0(long j, Object obj) {
        return (obj instanceof C11588t1) && j == ((C11588t1) obj).mo23301j2();
    }

    /* renamed from: g */
    public static final /* synthetic */ C11588t1 m44992g(long j) {
        return new C11588t1(j);
    }

    /* renamed from: h0 */
    public static final boolean m44993h0(long j, long j2) {
        return j == j2;
    }

    @C11110f
    /* renamed from: i0 */
    public static final long m44994i0(long j, byte b) {
        return C11397k1.m43746a(j, m44970M(((long) b) & 255));
    }

    @C11110f
    /* renamed from: i2 */
    public static final short m44995i2(long j) {
        return C11679z1.m45841M((short) ((int) j));
    }

    @C11110f
    /* renamed from: j0 */
    public static final long m44996j0(long j, long j2) {
        return C11397k1.m43746a(j, j2);
    }

    @C11110f
    /* renamed from: j1 */
    public static final long m44997j1(long j, int i) {
        return m44970M(j + m44970M(((long) i) & 4294967295L));
    }

    @C11110f
    /* renamed from: k1 */
    public static final long m44998k1(long j, short s) {
        return m44970M(j + m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @C11110f
    /* renamed from: k2 */
    public static final long m44999k2(long j, long j2) {
        return m44970M(j ^ j2);
    }

    @C11110f
    /* renamed from: l1 */
    public static final C11448a0 m45000l1(long j, long j2) {
        return new C11448a0(j, j2, (DefaultConstructorMarker) null);
    }

    @C11110f
    /* renamed from: m0 */
    public static final long m45001m0(long j, int i) {
        return C11397k1.m43746a(j, m44970M(((long) i) & 4294967295L));
    }

    @C11110f
    /* renamed from: n0 */
    public static final long m45002n0(long j, short s) {
        return C11397k1.m43746a(j, m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @C11110f
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: n1 */
    public static final C11448a0 m45003n1(long j, long j2) {
        return C11454c0.m44198X(j, j2);
    }

    @C11532s0
    /* renamed from: o0 */
    public static /* synthetic */ void m45004o0() {
    }

    /* renamed from: p0 */
    public static int m45005p0(long j) {
        return Long.hashCode(j);
    }

    @C11110f
    /* renamed from: q */
    public static final int m45006q(long j, byte b) {
        return Long.compare(j ^ Long.MIN_VALUE, m44970M(((long) b) & 255) ^ Long.MIN_VALUE);
    }

    @C11110f
    /* renamed from: q1 */
    public static final long m45007q1(long j, byte b) {
        return C11104i1.m42815a(j, m44970M(((long) b) & 255));
    }

    @C11110f
    /* renamed from: t0 */
    public static final long m45008t0(long j) {
        return m44970M(j + 1);
    }

    @C11110f
    /* renamed from: u0 */
    public static final long m45009u0(long j) {
        return m44970M(~j);
    }

    @C11110f
    /* renamed from: w */
    public static int m45010w(long j, long j2) {
        return C11093f2.m42718g(j, j2);
    }

    @C11110f
    /* renamed from: w1 */
    public static final long m45011w1(long j, long j2) {
        return C11093f2.m42720i(j, j2);
    }

    @C11110f
    /* renamed from: y */
    public static final int m45012y(long j, int i) {
        return Long.compare(j ^ Long.MIN_VALUE, m44970M(((long) i) & 4294967295L) ^ Long.MIN_VALUE);
    }

    @C11110f
    /* renamed from: z */
    public static final int m45013z(long j, short s) {
        return Long.compare(j ^ Long.MIN_VALUE, m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE);
    }

    @C11110f
    /* renamed from: z1 */
    public static final long m45014z1(long j, int i) {
        return C11104i1.m42815a(j, m44970M(((long) i) & 4294967295L));
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C11093f2.m42718g(mo23301j2(), ((C11588t1) obj).mo23301j2());
    }

    public boolean equals(Object obj) {
        return m44991f0(this.f28783a, obj);
    }

    public int hashCode() {
        return m45005p0(this.f28783a);
    }

    /* renamed from: j2 */
    public final /* synthetic */ long mo23301j2() {
        return this.f28783a;
    }

    @C11110f
    /* renamed from: r */
    public final int mo23302r(long j) {
        return C11093f2.m42718g(mo23301j2(), j);
    }

    @C12579k
    public String toString() {
        return m44983Y1(this.f28783a);
    }
}
