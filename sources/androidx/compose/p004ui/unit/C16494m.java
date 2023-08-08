package androidx.compose.p004ui.unit;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.C11532s0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
@C11363r0({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n55#2:180\n62#2:181\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n53#1:180\n60#1:181\n*E\n"})
/* renamed from: androidx.compose.ui.unit.m */
public final class C16494m {
    @C12579k

    /* renamed from: b */
    public static final C16495a f40890b = new C16495a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f40891c = C16496n.m74593a(0, 0);

    /* renamed from: a */
    public final long f40892a;

    /* renamed from: androidx.compose.ui.unit.m$a */
    public static final class C16495a {
        public /* synthetic */ C16495a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo47857a() {
            return C16494m.f40891c;
        }

        public C16495a() {
        }
    }

    public /* synthetic */ C16494m(long j) {
        this.f40892a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C16494m m74570b(long j) {
        return new C16494m(j);
    }

    @C8547h2
    /* renamed from: c */
    public static final int m74571c(long j) {
        return m74581m(j);
    }

    @C8547h2
    /* renamed from: d */
    public static final int m74572d(long j) {
        return m74583o(j);
    }

    /* renamed from: e */
    public static long m74573e(long j) {
        return j;
    }

    /* renamed from: f */
    public static final long m74574f(long j, int i, int i2) {
        return C16496n.m74593a(i, i2);
    }

    /* renamed from: g */
    public static /* synthetic */ long m74575g(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = m74581m(j);
        }
        if ((i3 & 2) != 0) {
            i2 = m74583o(j);
        }
        return m74574f(j, i, i2);
    }

    @C8547h2
    /* renamed from: h */
    public static final long m74576h(long j, float f) {
        return C16496n.m74593a(C11409d.m43851L0(((float) m74581m(j)) / f), C11409d.m43851L0(((float) m74583o(j)) / f));
    }

    /* renamed from: i */
    public static boolean m74577i(long j, Object obj) {
        return (obj instanceof C16494m) && j == ((C16494m) obj).mo47856w();
    }

    /* renamed from: j */
    public static final boolean m74578j(long j, long j2) {
        return j == j2;
    }

    @C11532s0
    /* renamed from: k */
    public static /* synthetic */ void m74579k() {
    }

    @C8547h2
    /* renamed from: l */
    public static /* synthetic */ void m74580l() {
    }

    /* renamed from: m */
    public static final int m74581m(long j) {
        return (int) (j >> 32);
    }

    @C8547h2
    /* renamed from: n */
    public static /* synthetic */ void m74582n() {
    }

    /* renamed from: o */
    public static final int m74583o(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: p */
    public static int m74584p(long j) {
        return Long.hashCode(j);
    }

    @C8547h2
    /* renamed from: q */
    public static final long m74585q(long j, long j2) {
        return C16496n.m74593a(m74581m(j) - m74581m(j2), m74583o(j) - m74583o(j2));
    }

    @C8547h2
    /* renamed from: r */
    public static final long m74586r(long j, long j2) {
        return C16496n.m74593a(m74581m(j) + m74581m(j2), m74583o(j) + m74583o(j2));
    }

    @C8547h2
    /* renamed from: s */
    public static final long m74587s(long j, int i) {
        return C16496n.m74593a(m74581m(j) % i, m74583o(j) % i);
    }

    @C8547h2
    /* renamed from: t */
    public static final long m74588t(long j, float f) {
        return C16496n.m74593a(C11409d.m43851L0(((float) m74581m(j)) * f), C11409d.m43851L0(((float) m74583o(j)) * f));
    }

    @C8547h2
    @C12579k
    /* renamed from: u */
    public static String m74589u(long j) {
        return '(' + m74581m(j) + ", " + m74583o(j) + ')';
    }

    @C8547h2
    /* renamed from: v */
    public static final long m74590v(long j) {
        return C16496n.m74593a(-m74581m(j), -m74583o(j));
    }

    public boolean equals(Object obj) {
        return m74577i(this.f40892a, obj);
    }

    public int hashCode() {
        return m74584p(this.f40892a);
    }

    @C8547h2
    @C12579k
    public String toString() {
        return m74589u(this.f40892a);
    }

    /* renamed from: w */
    public final /* synthetic */ long mo47856w() {
        return this.f40892a;
    }
}
