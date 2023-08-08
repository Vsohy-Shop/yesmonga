package kotlin.ranges;

import com.urbanairship.automation.C8970v;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.util.NoSuchElementException;
import kotlin.C11097g2;
import kotlin.C11400l1;
import kotlin.C11419p1;
import kotlin.C11429q;
import kotlin.C11531s;
import kotlin.C11588t1;
import kotlin.C11665v0;
import kotlin.C11679z1;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.C11444e;
import kotlin.random.Random;
import kotlin.ranges.C11480v;
import kotlin.ranges.C11485y;
import okhttp3.internal.p013ws.WebSocketProtocol;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.c0 */
public class C11454c0 {
    @C11665v0(version = "1.7")
    /* renamed from: A */
    public static final int m44175A(@C12579k C11480v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.mo23096r();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @C11665v0(version = "1.7")
    /* renamed from: B */
    public static final long m44176B(@C12579k C11485y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.mo23111r();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @C12580l
    @C11665v0(version = "1.7")
    /* renamed from: C */
    public static final C11419p1 m44177C(@C12579k C11480v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return C11419p1.m43993g(vVar.mo23096r());
    }

    @C12580l
    @C11665v0(version = "1.7")
    /* renamed from: D */
    public static final C11588t1 m44178D(@C12579k C11485y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return C11588t1.m44992g(yVar.mo23111r());
    }

    @C11665v0(version = "1.7")
    /* renamed from: E */
    public static final int m44179E(@C12579k C11480v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.mo23098w();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @C11665v0(version = "1.7")
    /* renamed from: F */
    public static final long m44180F(@C12579k C11485y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.mo23112w();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @C12580l
    @C11665v0(version = "1.7")
    /* renamed from: G */
    public static final C11419p1 m44181G(@C12579k C11480v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return C11419p1.m43993g(vVar.mo23098w());
    }

    @C12580l
    @C11665v0(version = "1.7")
    /* renamed from: H */
    public static final C11588t1 m44182H(@C12579k C11485y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return C11588t1.m44992g(yVar.mo23112w());
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: I */
    public static final int m44183I(C11483x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return m44184J(xVar, Random.f28564a);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: J */
    public static final int m44184J(@C12579k C11483x xVar, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        try {
            return C11444e.m44136h(random, xVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: K */
    public static final long m44185K(C11448a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return m44186L(a0Var, Random.f28564a);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: L */
    public static final long m44186L(@C12579k C11448a0 a0Var, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        try {
            return C11444e.m44140l(random, a0Var);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: M */
    public static final C11419p1 m44187M(C11483x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return m44188N(xVar, Random.f28564a);
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: N */
    public static final C11419p1 m44188N(@C12579k C11483x xVar, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (xVar.isEmpty()) {
            return null;
        }
        return C11419p1.m43993g(C11444e.m44136h(random, xVar));
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: O */
    public static final C11588t1 m44189O(C11448a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return m44190P(a0Var, Random.f28564a);
    }

    @C11097g2(markerClass = {C11429q.class, C11531s.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: P */
    public static final C11588t1 m44190P(@C12579k C11448a0 a0Var, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (a0Var.isEmpty()) {
            return null;
        }
        return C11588t1.m44992g(C11444e.m44140l(random, a0Var));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: Q */
    public static final C11480v m44191Q(@C12579k C11480v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        return C11480v.f28618d.mo23100a(vVar.mo23098w(), vVar.mo23096r(), -vVar.mo23099y());
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: R */
    public static final C11485y m44192R(@C12579k C11485y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return C11485y.f28628d.mo23114a(yVar.mo23112w(), yVar.mo23111r(), -yVar.mo23113y());
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: S */
    public static final C11480v m44193S(@C12579k C11480v vVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C11478t.m44301a(z, Integer.valueOf(i));
        C11480v.C11481a aVar = C11480v.f28618d;
        int r = vVar.mo23096r();
        int w = vVar.mo23098w();
        if (vVar.mo23099y() <= 0) {
            i = -i;
        }
        return aVar.mo23100a(r, w, i);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: T */
    public static final C11485y m44194T(@C12579k C11485y yVar, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C11478t.m44301a(z, Long.valueOf(j));
        C11485y.C11486a aVar = C11485y.f28628d;
        long r = yVar.mo23111r();
        long w = yVar.mo23112w();
        if (yVar.mo23113y() <= 0) {
            j = -j;
        }
        return aVar.mo23114a(r, w, j);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: U */
    public static final C11483x m44195U(short s, short s2) {
        short s3 = s2 & C11679z1.f28988d;
        if (Intrinsics.compare((int) s3, 0) <= 0) {
            return C11483x.f28626e.mo23109a();
        }
        return new C11483x(C11419p1.m43971M(s & C11679z1.f28988d), C11419p1.m43971M(C11419p1.m43971M(s3) - 1), (DefaultConstructorMarker) null);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: V */
    public static final C11483x m44196V(int i, int i2) {
        if (Integer.compare(i2 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) <= 0) {
            return C11483x.f28626e.mo23109a();
        }
        return new C11483x(i, C11419p1.m43971M(i2 - 1), (DefaultConstructorMarker) null);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: W */
    public static final C11483x m44197W(byte b, byte b2) {
        byte b3 = b2 & 255;
        if (Intrinsics.compare((int) b3, 0) <= 0) {
            return C11483x.f28626e.mo23109a();
        }
        return new C11483x(C11419p1.m43971M(b & 255), C11419p1.m43971M(C11419p1.m43971M(b3) - 1), (DefaultConstructorMarker) null);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: X */
    public static final C11448a0 m44198X(long j, long j2) {
        if (Long.compare(j2 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0) {
            return C11448a0.f28578e.mo23015a();
        }
        return new C11448a0(j, C11588t1.m44970M(j2 - C11588t1.m44970M(((long) 1) & 4294967295L)), (DefaultConstructorMarker) null);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: a */
    public static final short m44199a(short s, short s2) {
        return Intrinsics.compare((int) s & C11679z1.f28988d, (int) 65535 & s2) < 0 ? s2 : s;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: b */
    public static final int m44200b(int i, int i2) {
        return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0 ? i2 : i;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: c */
    public static final byte m44201c(byte b, byte b2) {
        return Intrinsics.compare((int) b & 255, (int) b2 & 255) < 0 ? b2 : b;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: d */
    public static final long m44202d(long j, long j2) {
        return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0 ? j2 : j;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: e */
    public static final short m44203e(short s, short s2) {
        return Intrinsics.compare((int) s & C11679z1.f28988d, (int) 65535 & s2) > 0 ? s2 : s;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: f */
    public static final int m44204f(int i, int i2) {
        return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) > 0 ? i2 : i;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: g */
    public static final byte m44205g(byte b, byte b2) {
        return Intrinsics.compare((int) b & 255, (int) b2 & 255) > 0 ? b2 : b;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: h */
    public static final long m44206h(long j, long j2) {
        return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0 ? j2 : j;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: i */
    public static final long m44207i(long j, @C12579k C11459g<C11588t1> gVar) {
        Intrinsics.checkNotNullParameter(gVar, C8970v.f24100k);
        if (gVar instanceof C11457f) {
            return ((C11588t1) C11479u.m44349N(C11588t1.m44992g(j), (C11457f) gVar)).mo23301j2();
        }
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
        } else if (Long.compare(j ^ Long.MIN_VALUE, gVar.getStart().mo23301j2() ^ Long.MIN_VALUE) < 0) {
            return gVar.getStart().mo23301j2();
        } else {
            if (Long.compare(j ^ Long.MIN_VALUE, gVar.mo23013q().mo23301j2() ^ Long.MIN_VALUE) > 0) {
                return gVar.mo23013q().mo23301j2();
            }
            return j;
        }
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: j */
    public static final short m44208j(short s, short s2, short s3) {
        short s4 = s2 & C11679z1.f28988d;
        short s5 = s3 & C11679z1.f28988d;
        if (Intrinsics.compare((int) s4, (int) s5) <= 0) {
            short s6 = 65535 & s;
            if (Intrinsics.compare((int) s6, (int) s4) < 0) {
                return s2;
            }
            if (Intrinsics.compare((int) s6, (int) s5) > 0) {
                return s3;
            }
            return s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + C11679z1.m45849T1(s3) + " is less than minimum " + C11679z1.m45849T1(s2) + '.');
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: k */
    public static final int m44209k(int i, int i2, int i3) {
        if (Integer.compare(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + C11419p1.m43984Y1(i3) + " is less than minimum " + C11419p1.m43984Y1(i2) + '.');
        } else if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0) {
            return i2;
        } else {
            if (Integer.compare(i ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE) > 0) {
                return i3;
            }
            return i;
        }
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: l */
    public static final byte m44210l(byte b, byte b2, byte b3) {
        byte b4 = b2 & 255;
        byte b5 = b3 & 255;
        if (Intrinsics.compare((int) b4, (int) b5) <= 0) {
            byte b6 = b & 255;
            if (Intrinsics.compare((int) b6, (int) b4) < 0) {
                return b2;
            }
            if (Intrinsics.compare((int) b6, (int) b5) > 0) {
                return b3;
            }
            return b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + C11400l1.m43769T1(b3) + " is less than minimum " + C11400l1.m43769T1(b2) + '.');
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: m */
    public static final long m44211m(long j, long j2, long j3) {
        if (Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + C11588t1.m44983Y1(j3) + " is less than minimum " + C11588t1.m44983Y1(j2) + '.');
        } else if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0) {
            return j2;
        } else {
            if (Long.compare(j ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) > 0) {
                return j3;
            }
            return j;
        }
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: n */
    public static final int m44212n(int i, @C12579k C11459g<C11419p1> gVar) {
        Intrinsics.checkNotNullParameter(gVar, C8970v.f24100k);
        if (gVar instanceof C11457f) {
            return ((C11419p1) C11479u.m44349N(C11419p1.m43993g(i), (C11457f) gVar)).mo22930j2();
        }
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
        } else if (Integer.compare(i ^ Integer.MIN_VALUE, gVar.getStart().mo22930j2() ^ Integer.MIN_VALUE) < 0) {
            return gVar.getStart().mo22930j2();
        } else {
            if (Integer.compare(i ^ Integer.MIN_VALUE, gVar.mo23013q().mo22930j2() ^ Integer.MIN_VALUE) > 0) {
                return gVar.mo23013q().mo22930j2();
            }
            return i;
        }
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: o */
    public static final boolean m44213o(@C12579k C11483x xVar, byte b) {
        Intrinsics.checkNotNullParameter(xVar, "$this$contains");
        return xVar.mo23105M(C11419p1.m43971M(b & 255));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: p */
    public static final boolean m44214p(C11448a0 a0Var, C11588t1 t1Var) {
        Intrinsics.checkNotNullParameter(a0Var, "$this$contains");
        if (t1Var == null || !a0Var.mo23003M(t1Var.mo23301j2())) {
            return false;
        }
        return true;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: q */
    public static final boolean m44215q(@C12579k C11448a0 a0Var, int i) {
        Intrinsics.checkNotNullParameter(a0Var, "$this$contains");
        return a0Var.mo23003M(C11588t1.m44970M(((long) i) & 4294967295L));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: r */
    public static final boolean m44216r(@C12579k C11448a0 a0Var, byte b) {
        Intrinsics.checkNotNullParameter(a0Var, "$this$contains");
        return a0Var.mo23003M(C11588t1.m44970M(((long) b) & 255));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: s */
    public static final boolean m44217s(@C12579k C11483x xVar, short s) {
        Intrinsics.checkNotNullParameter(xVar, "$this$contains");
        return xVar.mo23105M(C11419p1.m43971M(s & C11679z1.f28988d));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: t */
    public static final boolean m44218t(C11483x xVar, C11419p1 p1Var) {
        Intrinsics.checkNotNullParameter(xVar, "$this$contains");
        if (p1Var == null || !xVar.mo23105M(p1Var.mo22930j2())) {
            return false;
        }
        return true;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: u */
    public static final boolean m44219u(@C12579k C11483x xVar, long j) {
        Intrinsics.checkNotNullParameter(xVar, "$this$contains");
        if (C11588t1.m44970M(j >>> 32) != 0 || !xVar.mo23105M(C11419p1.m43971M((int) j))) {
            return false;
        }
        return true;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: v */
    public static final boolean m44220v(@C12579k C11448a0 a0Var, short s) {
        Intrinsics.checkNotNullParameter(a0Var, "$this$contains");
        return a0Var.mo23003M(C11588t1.m44970M(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: w */
    public static final C11480v m44221w(short s, short s2) {
        return C11480v.f28618d.mo23100a(C11419p1.m43971M(s & C11679z1.f28988d), C11419p1.m43971M(s2 & C11679z1.f28988d), -1);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: x */
    public static final C11480v m44222x(int i, int i2) {
        return C11480v.f28618d.mo23100a(i, i2, -1);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: y */
    public static final C11480v m44223y(byte b, byte b2) {
        return C11480v.f28618d.mo23100a(C11419p1.m43971M(b & 255), C11419p1.m43971M(b2 & 255), -1);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: z */
    public static final C11485y m44224z(long j, long j2) {
        return C11485y.f28628d.mo23114a(j, j2, -1);
    }
}
