package kotlin.random;

import com.urbanairship.automation.C8970v;
import kotlin.C11097g2;
import kotlin.C11404m1;
import kotlin.C11419p1;
import kotlin.C11531s;
import kotlin.C11588t1;
import kotlin.C11665v0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11448a0;
import kotlin.ranges.C11483x;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* renamed from: kotlin.random.e */
public final class C11444e {
    /* renamed from: a */
    public static final void m44129a(int i, int i2) {
        if (!(Integer.compare(i2 ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE) > 0)) {
            throw new IllegalArgumentException(C11443d.m44121c(C11419p1.m43993g(i), C11419p1.m43993g(i2)).toString());
        }
    }

    /* renamed from: b */
    public static final void m44130b(long j, long j2) {
        if (!(Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE) > 0)) {
            throw new IllegalArgumentException(C11443d.m44121c(C11588t1.m44992g(j), C11588t1.m44992g(j2)).toString());
        }
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: c */
    public static final byte[] m44131c(@C12579k Random random, int i) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return C11404m1.m43818q(random.mo22978d(i));
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: d */
    public static final byte[] m44132d(@C12579k Random random, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(random, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(bArr, "array");
        random.mo22979e(bArr);
        return bArr;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: e */
    public static final byte[] m44133e(@C12579k Random random, @C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(random, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(bArr, "array");
        random.mo22980f(bArr, i, i2);
        return bArr;
    }

    /* renamed from: f */
    public static /* synthetic */ byte[] m44134f(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C11404m1.m43809X(bArr);
        }
        return m44133e(random, bArr, i, i2);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: g */
    public static final int m44135g(@C12579k Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return C11419p1.m43971M(random.mo22985l());
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: h */
    public static final int m44136h(@C12579k Random random, @C12579k C11483x xVar) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(xVar, C8970v.f24100k);
        if (xVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + xVar);
        } else if (Integer.compare(xVar.mo23098w() ^ Integer.MIN_VALUE, -1 ^ Integer.MIN_VALUE) < 0) {
            return m44137i(random, xVar.mo23096r(), C11419p1.m43971M(xVar.mo23098w() + 1));
        } else {
            if (Integer.compare(xVar.mo23096r() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) > 0) {
                return C11419p1.m43971M(m44137i(random, C11419p1.m43971M(xVar.mo23096r() - 1), xVar.mo23098w()) + 1);
            }
            return m44135g(random);
        }
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: i */
    public static final int m44137i(@C12579k Random random, int i, int i2) {
        Intrinsics.checkNotNullParameter(random, "$this$nextUInt");
        m44129a(i, i2);
        return C11419p1.m43971M(random.mo22987n(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: j */
    public static final int m44138j(@C12579k Random random, int i) {
        Intrinsics.checkNotNullParameter(random, "$this$nextUInt");
        return m44137i(random, 0, i);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: k */
    public static final long m44139k(@C12579k Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return C11588t1.m44970M(random.mo22988o());
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: l */
    public static final long m44140l(@C12579k Random random, @C12579k C11448a0 a0Var) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(a0Var, C8970v.f24100k);
        if (a0Var.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + a0Var);
        } else if (Long.compare(a0Var.mo23112w() ^ Long.MIN_VALUE, -1 ^ Long.MIN_VALUE) < 0) {
            return m44142n(random, a0Var.mo23111r(), C11588t1.m44970M(a0Var.mo23112w() + C11588t1.m44970M(((long) 1) & 4294967295L)));
        } else {
            if (Long.compare(a0Var.mo23111r() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0) {
                return m44139k(random);
            }
            long j = ((long) 1) & 4294967295L;
            return C11588t1.m44970M(m44142n(random, C11588t1.m44970M(a0Var.mo23111r() - C11588t1.m44970M(j)), a0Var.mo23112w()) + C11588t1.m44970M(j));
        }
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: m */
    public static final long m44141m(@C12579k Random random, long j) {
        Intrinsics.checkNotNullParameter(random, "$this$nextULong");
        return m44142n(random, 0, j);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: n */
    public static final long m44142n(@C12579k Random random, long j, long j2) {
        Intrinsics.checkNotNullParameter(random, "$this$nextULong");
        m44130b(j, j2);
        return C11588t1.m44970M(random.mo22990q(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
