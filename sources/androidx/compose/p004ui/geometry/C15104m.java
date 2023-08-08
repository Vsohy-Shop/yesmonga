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
@C11363r0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,225:1\n34#2:226\n41#2:227\n152#3:228\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n51#1:226\n61#1:227\n138#1:228\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.m */
public final class C15104m {
    @C12579k

    /* renamed from: b */
    public static final C15105a f37280b = new C15105a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f37281c = C15106n.m65033a(0.0f, 0.0f);

    /* renamed from: d */
    public static final long f37282d = C15106n.m65033a(Float.NaN, Float.NaN);

    /* renamed from: a */
    public final long f37283a;

    /* renamed from: androidx.compose.ui.geometry.m$a */
    public static final class C15105a {
        public /* synthetic */ C15105a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m65029b() {
        }

        @C8547h2
        /* renamed from: d */
        public static /* synthetic */ void m65030d() {
        }

        /* renamed from: a */
        public final long mo42316a() {
            return C15104m.f37282d;
        }

        /* renamed from: c */
        public final long mo42317c() {
            return C15104m.f37281c;
        }

        public C15105a() {
        }
    }

    public /* synthetic */ C15104m(long j) {
        this.f37283a = j;
    }

    /* renamed from: c */
    public static final /* synthetic */ C15104m m65006c(long j) {
        return new C15104m(j);
    }

    @C8547h2
    /* renamed from: d */
    public static final float m65007d(long j) {
        return m65023t(j);
    }

    @C8547h2
    /* renamed from: e */
    public static final float m65008e(long j) {
        return m65016m(j);
    }

    /* renamed from: f */
    public static long m65009f(long j) {
        return j;
    }

    /* renamed from: g */
    public static final long m65010g(long j, float f, float f2) {
        return C15106n.m65033a(f, f2);
    }

    /* renamed from: h */
    public static /* synthetic */ long m65011h(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m65023t(j);
        }
        if ((i & 2) != 0) {
            f2 = m65016m(j);
        }
        return m65010g(j, f, f2);
    }

    @C8547h2
    /* renamed from: i */
    public static final long m65012i(long j, float f) {
        return C15106n.m65033a(m65023t(j) / f, m65016m(j) / f);
    }

    /* renamed from: j */
    public static boolean m65013j(long j, Object obj) {
        return (obj instanceof C15104m) && j == ((C15104m) obj).mo42315y();
    }

    /* renamed from: k */
    public static final boolean m65014k(long j, long j2) {
        return j == j2;
    }

    @C8547h2
    /* renamed from: l */
    public static /* synthetic */ void m65015l() {
    }

    /* renamed from: m */
    public static final float m65016m(long j) {
        boolean z;
        if (j != f37282d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11377x xVar = C11377x.f28521a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    @C8547h2
    /* renamed from: n */
    public static /* synthetic */ void m65017n() {
    }

    /* renamed from: o */
    public static final float m65018o(long j) {
        return Math.max(Math.abs(m65023t(j)), Math.abs(m65016m(j)));
    }

    @C8547h2
    /* renamed from: p */
    public static /* synthetic */ void m65019p() {
    }

    /* renamed from: q */
    public static final float m65020q(long j) {
        return Math.min(Math.abs(m65023t(j)), Math.abs(m65016m(j)));
    }

    @C11532s0
    /* renamed from: r */
    public static /* synthetic */ void m65021r() {
    }

    @C8547h2
    /* renamed from: s */
    public static /* synthetic */ void m65022s() {
    }

    /* renamed from: t */
    public static final float m65023t(long j) {
        boolean z;
        if (j != f37282d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11377x xVar = C11377x.f28521a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: u */
    public static int m65024u(long j) {
        return Long.hashCode(j);
    }

    @C8547h2
    /* renamed from: v */
    public static final boolean m65025v(long j) {
        return m65023t(j) <= 0.0f || m65016m(j) <= 0.0f;
    }

    @C8547h2
    /* renamed from: w */
    public static final long m65026w(long j, float f) {
        return C15106n.m65033a(m65023t(j) * f, m65016m(j) * f);
    }

    @C12579k
    /* renamed from: x */
    public static String m65027x(long j) {
        boolean z;
        if (j != f37280b.mo42316a()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "Size.Unspecified";
        }
        return "Size(" + C15091c.m64848a(m65023t(j), 1) + ", " + C15091c.m64848a(m65016m(j), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m65013j(this.f37283a, obj);
    }

    public int hashCode() {
        return m65024u(this.f37283a);
    }

    @C12579k
    public String toString() {
        return m65027x(this.f37283a);
    }

    /* renamed from: y */
    public final /* synthetic */ long mo42315y() {
        return this.f37283a;
    }
}
