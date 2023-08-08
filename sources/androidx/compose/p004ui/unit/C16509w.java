package androidx.compose.p004ui.unit;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
@C11363r0({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,144:1\n34#2:145\n41#2:146\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n*L\n45#1:145\n52#1:146\n*E\n"})
/* renamed from: androidx.compose.ui.unit.w */
public final class C16509w {
    @C12579k

    /* renamed from: b */
    public static final C16510a f40916b = new C16510a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f40917c = C16511x.m74763a(0.0f, 0.0f);

    /* renamed from: a */
    public final long f40918a;

    /* renamed from: androidx.compose.ui.unit.w$a */
    public static final class C16510a {
        public /* synthetic */ C16510a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m74761b() {
        }

        /* renamed from: a */
        public final long mo47915a() {
            return C16509w.f40917c;
        }

        public C16510a() {
        }
    }

    public /* synthetic */ C16509w(long j) {
        this.f40918a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C16509w m74740b(long j) {
        return new C16509w(j);
    }

    @C8547h2
    /* renamed from: c */
    public static final float m74741c(long j) {
        return m74750l(j);
    }

    @C8547h2
    /* renamed from: d */
    public static final float m74742d(long j) {
        return m74752n(j);
    }

    /* renamed from: e */
    public static long m74743e(long j) {
        return j;
    }

    /* renamed from: f */
    public static final long m74744f(long j, float f, float f2) {
        return C16511x.m74763a(f, f2);
    }

    /* renamed from: g */
    public static /* synthetic */ long m74745g(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m74750l(j);
        }
        if ((i & 2) != 0) {
            f2 = m74752n(j);
        }
        return m74744f(j, f, f2);
    }

    @C8547h2
    /* renamed from: h */
    public static final long m74746h(long j, float f) {
        return C16511x.m74763a(m74750l(j) / f, m74752n(j) / f);
    }

    /* renamed from: i */
    public static boolean m74747i(long j, Object obj) {
        return (obj instanceof C16509w) && j == ((C16509w) obj).mo47914v();
    }

    /* renamed from: j */
    public static final boolean m74748j(long j, long j2) {
        return j == j2;
    }

    @C8547h2
    /* renamed from: k */
    public static /* synthetic */ void m74749k() {
    }

    /* renamed from: l */
    public static final float m74750l(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    @C8547h2
    /* renamed from: m */
    public static /* synthetic */ void m74751m() {
    }

    /* renamed from: n */
    public static final float m74752n(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: o */
    public static int m74753o(long j) {
        return Long.hashCode(j);
    }

    @C8547h2
    /* renamed from: p */
    public static final long m74754p(long j, long j2) {
        return C16511x.m74763a(m74750l(j) - m74750l(j2), m74752n(j) - m74752n(j2));
    }

    @C8547h2
    /* renamed from: q */
    public static final long m74755q(long j, long j2) {
        return C16511x.m74763a(m74750l(j) + m74750l(j2), m74752n(j) + m74752n(j2));
    }

    @C8547h2
    /* renamed from: r */
    public static final long m74756r(long j, float f) {
        return C16511x.m74763a(m74750l(j) % f, m74752n(j) % f);
    }

    @C8547h2
    /* renamed from: s */
    public static final long m74757s(long j, float f) {
        return C16511x.m74763a(m74750l(j) * f, m74752n(j) * f);
    }

    @C12579k
    /* renamed from: t */
    public static String m74758t(long j) {
        return '(' + m74750l(j) + ", " + m74752n(j) + ") px/sec";
    }

    @C8547h2
    /* renamed from: u */
    public static final long m74759u(long j) {
        return C16511x.m74763a(-m74750l(j), -m74752n(j));
    }

    public boolean equals(Object obj) {
        return m74747i(this.f40918a, obj);
    }

    public int hashCode() {
        return m74753o(this.f40918a);
    }

    @C12579k
    public String toString() {
        return m74758t(this.f40918a);
    }

    /* renamed from: v */
    public final /* synthetic */ long mo47914v() {
        return this.f40918a;
    }
}
