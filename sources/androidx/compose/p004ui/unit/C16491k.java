package androidx.compose.p004ui.unit;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.C11532s0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
@C11363r0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n473#3:568\n154#3:569\n58#4:562\n51#4:563\n92#4:564\n88#4:565\n75#4:566\n71#4:567\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n391#1:558\n404#1:560\n391#1:559\n404#1:561\n447#1:568\n457#1:569\n418#1:562\n425#1:563\n434#1:564\n437#1:565\n440#1:566\n443#1:567\n*E\n"})
/* renamed from: androidx.compose.ui.unit.k */
public final class C16491k {
    @C12579k

    /* renamed from: b */
    public static final C16492a f40886b = new C16492a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f40887c;

    /* renamed from: d */
    public static final long f40888d;

    /* renamed from: a */
    public final long f40889a;

    /* renamed from: androidx.compose.ui.unit.k$a */
    public static final class C16492a {
        public /* synthetic */ C16492a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo47851a() {
            return C16491k.f40888d;
        }

        /* renamed from: b */
        public final long mo47852b() {
            return C16491k.f40887c;
        }

        public C16492a() {
        }
    }

    static {
        float f = (float) 0;
        f40887c = C16485h.m74483b(C16483g.m74435M(f), C16483g.m74435M(f));
        C16483g.C16484a aVar = C16483g.f40871b;
        f40888d = C16485h.m74483b(aVar.mo47828e(), aVar.mo47828e());
    }

    public /* synthetic */ C16491k(long j) {
        this.f40889a = j;
    }

    /* renamed from: c */
    public static final /* synthetic */ C16491k m74545c(long j) {
        return new C16491k(j);
    }

    @C8547h2
    /* renamed from: d */
    public static final float m74546d(long j) {
        return m74558p(j);
    }

    @C8547h2
    /* renamed from: e */
    public static final float m74547e(long j) {
        return m74555m(j);
    }

    /* renamed from: f */
    public static long m74548f(long j) {
        return j;
    }

    /* renamed from: g */
    public static final long m74549g(long j, float f, float f2) {
        return C16485h.m74483b(f, f2);
    }

    /* renamed from: h */
    public static /* synthetic */ long m74550h(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m74558p(j);
        }
        if ((i & 2) != 0) {
            f2 = m74555m(j);
        }
        return m74549g(j, f, f2);
    }

    @C8547h2
    /* renamed from: i */
    public static final long m74551i(long j, float f) {
        return C16485h.m74483b(C16483g.m74435M(m74558p(j) / f), C16483g.m74435M(m74555m(j) / f));
    }

    @C8547h2
    /* renamed from: j */
    public static final long m74552j(long j, int i) {
        float f = (float) i;
        return C16485h.m74483b(C16483g.m74435M(m74558p(j) / f), C16483g.m74435M(m74555m(j) / f));
    }

    /* renamed from: k */
    public static boolean m74553k(long j, Object obj) {
        return (obj instanceof C16491k) && j == ((C16491k) obj).mo47850x();
    }

    /* renamed from: l */
    public static final boolean m74554l(long j, long j2) {
        return j == j2;
    }

    /* renamed from: m */
    public static final float m74555m(long j) {
        boolean z;
        if (j != f40888d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11377x xVar = C11377x.f28521a;
            return C16483g.m74435M(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    @C8547h2
    /* renamed from: n */
    public static /* synthetic */ void m74556n() {
    }

    @C11532s0
    /* renamed from: o */
    public static /* synthetic */ void m74557o() {
    }

    /* renamed from: p */
    public static final float m74558p(long j) {
        boolean z;
        if (j != f40888d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11377x xVar = C11377x.f28521a;
            return C16483g.m74435M(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    @C8547h2
    /* renamed from: q */
    public static /* synthetic */ void m74559q() {
    }

    /* renamed from: r */
    public static int m74560r(long j) {
        return Long.hashCode(j);
    }

    @C8547h2
    /* renamed from: s */
    public static final long m74561s(long j, long j2) {
        return C16485h.m74483b(C16483g.m74435M(m74558p(j) - m74558p(j2)), C16483g.m74435M(m74555m(j) - m74555m(j2)));
    }

    @C8547h2
    /* renamed from: t */
    public static final long m74562t(long j, long j2) {
        return C16485h.m74483b(C16483g.m74435M(m74558p(j) + m74558p(j2)), C16483g.m74435M(m74555m(j) + m74555m(j2)));
    }

    @C8547h2
    /* renamed from: u */
    public static final long m74563u(long j, float f) {
        return C16485h.m74483b(C16483g.m74435M(m74558p(j) * f), C16483g.m74435M(m74555m(j) * f));
    }

    @C8547h2
    /* renamed from: v */
    public static final long m74564v(long j, int i) {
        float f = (float) i;
        return C16485h.m74483b(C16483g.m74435M(m74558p(j) * f), C16483g.m74435M(m74555m(j) * f));
    }

    @C8547h2
    @C12579k
    /* renamed from: w */
    public static String m74565w(long j) {
        boolean z;
        if (j != f40886b.mo47851a()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "DpSize.Unspecified";
        }
        return C16483g.m74447o0(m74558p(j)) + " x " + C16483g.m74447o0(m74555m(j));
    }

    public boolean equals(Object obj) {
        return m74553k(this.f40889a, obj);
    }

    public int hashCode() {
        return m74560r(this.f40889a);
    }

    @C8547h2
    @C12579k
    public String toString() {
        return m74565w(this.f40889a);
    }

    /* renamed from: x */
    public final /* synthetic */ long mo47850x() {
        return this.f40889a;
    }
}
