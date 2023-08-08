package androidx.compose.p004ui.geometry;

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
@C11363r0({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n34#2:165\n41#2:166\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n49#1:165\n53#1:166\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.a */
public final class C15088a {
    @C12579k

    /* renamed from: b */
    public static final C15089a f37248b = new C15089a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f37249c = C15090b.m64846b(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: a */
    public final long f37250a;

    /* renamed from: androidx.compose.ui.geometry.a$a */
    public static final class C15089a {
        public /* synthetic */ C15089a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m64843b() {
        }

        /* renamed from: a */
        public final long mo42225a() {
            return C15088a.f37249c;
        }

        public C15089a() {
        }
    }

    public /* synthetic */ C15088a(long j) {
        this.f37250a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C15088a m64822b(long j) {
        return new C15088a(j);
    }

    @C8547h2
    /* renamed from: c */
    public static final float m64823c(long j) {
        return m64833m(j);
    }

    @C8547h2
    /* renamed from: d */
    public static final float m64824d(long j) {
        return m64835o(j);
    }

    /* renamed from: e */
    public static long m64825e(long j) {
        return j;
    }

    /* renamed from: f */
    public static final long m64826f(long j, float f, float f2) {
        return C15090b.m64845a(f, f2);
    }

    /* renamed from: g */
    public static /* synthetic */ long m64827g(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m64833m(j);
        }
        if ((i & 2) != 0) {
            f2 = m64835o(j);
        }
        return m64826f(j, f, f2);
    }

    @C8547h2
    /* renamed from: h */
    public static final long m64828h(long j, float f) {
        return C15090b.m64845a(m64833m(j) / f, m64835o(j) / f);
    }

    /* renamed from: i */
    public static boolean m64829i(long j, Object obj) {
        return (obj instanceof C15088a) && j == ((C15088a) obj).mo42224v();
    }

    /* renamed from: j */
    public static final boolean m64830j(long j, long j2) {
        return j == j2;
    }

    @C11532s0
    /* renamed from: k */
    public static /* synthetic */ void m64831k() {
    }

    @C8547h2
    /* renamed from: l */
    public static /* synthetic */ void m64832l() {
    }

    /* renamed from: m */
    public static final float m64833m(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    @C8547h2
    /* renamed from: n */
    public static /* synthetic */ void m64834n() {
    }

    /* renamed from: o */
    public static final float m64835o(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: p */
    public static int m64836p(long j) {
        return Long.hashCode(j);
    }

    @C8547h2
    /* renamed from: q */
    public static final long m64837q(long j, long j2) {
        return C15090b.m64845a(m64833m(j) - m64833m(j2), m64835o(j) - m64835o(j2));
    }

    @C8547h2
    /* renamed from: r */
    public static final long m64838r(long j, long j2) {
        return C15090b.m64845a(m64833m(j) + m64833m(j2), m64835o(j) + m64835o(j2));
    }

    @C8547h2
    /* renamed from: s */
    public static final long m64839s(long j, float f) {
        return C15090b.m64845a(m64833m(j) * f, m64835o(j) * f);
    }

    @C12579k
    /* renamed from: t */
    public static String m64840t(long j) {
        boolean z;
        if (m64833m(j) == m64835o(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "CornerRadius.circular(" + C15091c.m64848a(m64833m(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + C15091c.m64848a(m64833m(j), 1) + ", " + C15091c.m64848a(m64835o(j), 1) + ')';
    }

    @C8547h2
    /* renamed from: u */
    public static final long m64841u(long j) {
        return C15090b.m64845a(-m64833m(j), -m64835o(j));
    }

    public boolean equals(Object obj) {
        return m64829i(this.f37250a, obj);
    }

    public int hashCode() {
        return m64836p(this.f37250a);
    }

    @C12579k
    public String toString() {
        return m64840t(this.f37250a);
    }

    /* renamed from: v */
    public final /* synthetic */ long mo42224v() {
        return this.f37250a;
    }
}
