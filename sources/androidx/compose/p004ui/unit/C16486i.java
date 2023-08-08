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
@C11363r0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n337#3:564\n154#3:565\n58#4:562\n51#4:563\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n273#1:558\n286#1:560\n273#1:559\n286#1:561\n311#1:564\n321#1:565\n300#1:562\n307#1:563\n*E\n"})
/* renamed from: androidx.compose.ui.unit.i */
public final class C16486i {
    @C12579k

    /* renamed from: b */
    public static final C16487a f40876b = new C16487a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f40877c;

    /* renamed from: d */
    public static final long f40878d;

    /* renamed from: a */
    public final long f40879a;

    /* renamed from: androidx.compose.ui.unit.i$a */
    public static final class C16487a {
        public /* synthetic */ C16487a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo47833a() {
            return C16486i.f40878d;
        }

        /* renamed from: b */
        public final long mo47834b() {
            return C16486i.f40877c;
        }

        public C16487a() {
        }
    }

    static {
        float f = (float) 0;
        f40877c = C16485h.m74482a(C16483g.m74435M(f), C16483g.m74435M(f));
        C16483g.C16484a aVar = C16483g.f40871b;
        f40878d = C16485h.m74482a(aVar.mo47828e(), aVar.mo47828e());
    }

    public /* synthetic */ C16486i(long j) {
        this.f40879a = j;
    }

    /* renamed from: c */
    public static final /* synthetic */ C16486i m74510c(long j) {
        return new C16486i(j);
    }

    /* renamed from: d */
    public static long m74511d(long j) {
        return j;
    }

    /* renamed from: e */
    public static final long m74512e(long j, float f, float f2) {
        return C16485h.m74482a(f, f2);
    }

    /* renamed from: f */
    public static /* synthetic */ long m74513f(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m74517j(j);
        }
        if ((i & 2) != 0) {
            f2 = m74519l(j);
        }
        return m74512e(j, f, f2);
    }

    /* renamed from: g */
    public static boolean m74514g(long j, Object obj) {
        return (obj instanceof C16486i) && j == ((C16486i) obj).mo47831r();
    }

    /* renamed from: h */
    public static final boolean m74515h(long j, long j2) {
        return j == j2;
    }

    @C11532s0
    /* renamed from: i */
    public static /* synthetic */ void m74516i() {
    }

    /* renamed from: j */
    public static final float m74517j(long j) {
        boolean z;
        if (j != f40878d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11377x xVar = C11377x.f28521a;
            return C16483g.m74435M(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    @C8547h2
    /* renamed from: k */
    public static /* synthetic */ void m74518k() {
    }

    /* renamed from: l */
    public static final float m74519l(long j) {
        boolean z;
        if (j != f40878d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11377x xVar = C11377x.f28521a;
            return C16483g.m74435M(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    @C8547h2
    /* renamed from: m */
    public static /* synthetic */ void m74520m() {
    }

    /* renamed from: n */
    public static int m74521n(long j) {
        return Long.hashCode(j);
    }

    @C8547h2
    /* renamed from: o */
    public static final long m74522o(long j, long j2) {
        return C16485h.m74482a(C16483g.m74435M(m74517j(j) - m74517j(j2)), C16483g.m74435M(m74519l(j) - m74519l(j2)));
    }

    @C8547h2
    /* renamed from: p */
    public static final long m74523p(long j, long j2) {
        return C16485h.m74482a(C16483g.m74435M(m74517j(j) + m74517j(j2)), C16483g.m74435M(m74519l(j) + m74519l(j2)));
    }

    @C8547h2
    @C12579k
    /* renamed from: q */
    public static String m74524q(long j) {
        boolean z;
        if (j != f40876b.mo47833a()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "DpOffset.Unspecified";
        }
        return '(' + C16483g.m74447o0(m74517j(j)) + ", " + C16483g.m74447o0(m74519l(j)) + ')';
    }

    public boolean equals(Object obj) {
        return m74514g(this.f40879a, obj);
    }

    public int hashCode() {
        return m74521n(this.f40879a);
    }

    /* renamed from: r */
    public final /* synthetic */ long mo47831r() {
        return this.f40879a;
    }

    @C8547h2
    @C12579k
    public String toString() {
        return m74524q(this.f40879a);
    }
}
