package androidx.compose.p004ui.unit;

import androidx.compose.p004ui.unit.C16507v;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.C11532s0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.unit.t */
public final class C16504t {
    @C12579k

    /* renamed from: b */
    public static final C16505a f40903b = new C16505a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final C16507v[] f40904c;

    /* renamed from: d */
    public static final long f40905d = C16506u.m74721v(0, Float.NaN);

    /* renamed from: a */
    public final long f40906a;

    /* renamed from: androidx.compose.ui.unit.t$a */
    public static final class C16505a {
        public /* synthetic */ C16505a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: c */
        public static /* synthetic */ void m74697c() {
        }

        @C12579k
        /* renamed from: a */
        public final C16507v[] mo47902a() {
            return C16504t.f40904c;
        }

        /* renamed from: b */
        public final long mo47903b() {
            return C16504t.f40905d;
        }

        public C16505a() {
        }
    }

    static {
        C16507v.C16508a aVar = C16507v.f40911b;
        f40904c = new C16507v[]{C16507v.m74729d(aVar.mo47910c()), C16507v.m74729d(aVar.mo47909b()), C16507v.m74729d(aVar.mo47908a())};
    }

    public /* synthetic */ C16504t(long j) {
        this.f40906a = j;
    }

    /* renamed from: c */
    public static final /* synthetic */ C16504t m74676c(long j) {
        return new C16504t(j);
    }

    /* renamed from: d */
    public static final int m74677d(long j, long j2) {
        C16506u.m74702c(j, j2);
        return Float.compare(m74687n(j), m74687n(j2));
    }

    /* renamed from: e */
    public static long m74678e(long j) {
        return j;
    }

    /* renamed from: f */
    public static final long m74679f(long j, double d) {
        C16506u.m74701b(j);
        return C16506u.m74721v(m74685l(j), (float) (((double) m74687n(j)) / d));
    }

    /* renamed from: g */
    public static final long m74680g(long j, float f) {
        C16506u.m74701b(j);
        return C16506u.m74721v(m74685l(j), m74687n(j) / f);
    }

    /* renamed from: h */
    public static final long m74681h(long j, int i) {
        C16506u.m74701b(j);
        return C16506u.m74721v(m74685l(j), m74687n(j) / ((float) i));
    }

    /* renamed from: i */
    public static boolean m74682i(long j, Object obj) {
        return (obj instanceof C16504t) && j == ((C16504t) obj).mo47901w();
    }

    /* renamed from: j */
    public static final boolean m74683j(long j, long j2) {
        return j == j2;
    }

    @C11532s0
    /* renamed from: k */
    public static /* synthetic */ void m74684k() {
    }

    /* renamed from: l */
    public static final long m74685l(long j) {
        return j & C16506u.f40907a;
    }

    /* renamed from: m */
    public static final long m74686m(long j) {
        return f40904c[(int) (m74685l(j) >>> 32)].mo47906j();
    }

    /* renamed from: n */
    public static final float m74687n(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: o */
    public static int m74688o(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: p */
    public static final boolean m74689p(long j) {
        return m74685l(j) == 8589934592L;
    }

    /* renamed from: q */
    public static final boolean m74690q(long j) {
        return m74685l(j) == 4294967296L;
    }

    /* renamed from: r */
    public static final long m74691r(long j, double d) {
        C16506u.m74701b(j);
        return C16506u.m74721v(m74685l(j), (float) (((double) m74687n(j)) * d));
    }

    /* renamed from: s */
    public static final long m74692s(long j, float f) {
        C16506u.m74701b(j);
        return C16506u.m74721v(m74685l(j), m74687n(j) * f);
    }

    /* renamed from: t */
    public static final long m74693t(long j, int i) {
        C16506u.m74701b(j);
        return C16506u.m74721v(m74685l(j), m74687n(j) * ((float) i));
    }

    @C12579k
    /* renamed from: u */
    public static String m74694u(long j) {
        long m = m74686m(j);
        C16507v.C16508a aVar = C16507v.f40911b;
        if (C16507v.m74732g(m, aVar.mo47910c())) {
            return "Unspecified";
        }
        if (C16507v.m74732g(m, aVar.mo47909b())) {
            return m74687n(j) + ".sp";
        } else if (!C16507v.m74732g(m, aVar.mo47908a())) {
            return "Invalid";
        } else {
            return m74687n(j) + ".em";
        }
    }

    /* renamed from: v */
    public static final long m74695v(long j) {
        C16506u.m74701b(j);
        return C16506u.m74721v(m74685l(j), -m74687n(j));
    }

    public boolean equals(Object obj) {
        return m74682i(this.f40906a, obj);
    }

    public int hashCode() {
        return m74688o(this.f40906a);
    }

    @C12579k
    public String toString() {
        return m74694u(this.f40906a);
    }

    /* renamed from: w */
    public final /* synthetic */ long mo47901w() {
        return this.f40906a;
    }
}
