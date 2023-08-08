package androidx.compose.p004ui.geometry;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
@C11363r0({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n34#2:267\n41#2:268\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n70#1:267\n80#1:268\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.f */
public final class C15094f {
    @C12579k

    /* renamed from: b */
    public static final C15095a f37256b = new C15095a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f37257c = C15096g.m64898a(0.0f, 0.0f);

    /* renamed from: d */
    public static final long f37258d = C15096g.m64898a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e */
    public static final long f37259e = C15096g.m64898a(Float.NaN, Float.NaN);

    /* renamed from: a */
    public final long f37260a;

    /* renamed from: androidx.compose.ui.geometry.f$a */
    public static final class C15095a {
        public /* synthetic */ C15095a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m64892b() {
        }

        @C8547h2
        /* renamed from: d */
        public static /* synthetic */ void m64893d() {
        }

        @C8547h2
        /* renamed from: f */
        public static /* synthetic */ void m64894f() {
        }

        /* renamed from: a */
        public final long mo42246a() {
            return C15094f.f37258d;
        }

        /* renamed from: c */
        public final long mo42247c() {
            return C15094f.f37259e;
        }

        /* renamed from: e */
        public final long mo42248e() {
            return C15094f.f37257c;
        }

        public C15095a() {
        }
    }

    public /* synthetic */ C15094f(long j) {
        this.f37260a = j;
    }

    /* renamed from: d */
    public static final /* synthetic */ C15094f m64868d(long j) {
        return new C15094f(j);
    }

    @C8547h2
    /* renamed from: e */
    public static final float m64869e(long j) {
        return m64880p(j);
    }

    @C8547h2
    /* renamed from: f */
    public static final float m64870f(long j) {
        return m64882r(j);
    }

    /* renamed from: g */
    public static long m64871g(long j) {
        return j;
    }

    /* renamed from: h */
    public static final long m64872h(long j, float f, float f2) {
        return C15096g.m64898a(f, f2);
    }

    /* renamed from: i */
    public static /* synthetic */ long m64873i(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m64880p(j);
        }
        if ((i & 2) != 0) {
            f2 = m64882r(j);
        }
        return m64872h(j, f, f2);
    }

    @C8547h2
    /* renamed from: j */
    public static final long m64874j(long j, float f) {
        return C15096g.m64898a(m64880p(j) / f, m64882r(j) / f);
    }

    /* renamed from: k */
    public static boolean m64875k(long j, Object obj) {
        return (obj instanceof C15094f) && j == ((C15094f) obj).mo42242A();
    }

    /* renamed from: l */
    public static final boolean m64876l(long j, long j2) {
        return j == j2;
    }

    @C8547h2
    /* renamed from: m */
    public static final float m64877m(long j) {
        return (float) Math.sqrt((double) ((m64880p(j) * m64880p(j)) + (m64882r(j) * m64882r(j))));
    }

    @C8547h2
    /* renamed from: n */
    public static final float m64878n(long j) {
        return (m64880p(j) * m64880p(j)) + (m64882r(j) * m64882r(j));
    }

    @C8547h2
    /* renamed from: o */
    public static /* synthetic */ void m64879o() {
    }

    /* renamed from: p */
    public static final float m64880p(long j) {
        boolean z;
        if (j != f37259e) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11377x xVar = C11377x.f28521a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    @C8547h2
    /* renamed from: q */
    public static /* synthetic */ void m64881q() {
    }

    /* renamed from: r */
    public static final float m64882r(long j) {
        boolean z;
        if (j != f37259e) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11377x xVar = C11377x.f28521a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: s */
    public static int m64883s(long j) {
        return Long.hashCode(j);
    }

    @C8547h2
    /* renamed from: t */
    public static final boolean m64884t(long j) {
        if (!Float.isNaN(m64880p(j)) && !Float.isNaN(m64882r(j))) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    @C8547h2
    /* renamed from: u */
    public static final long m64885u(long j, long j2) {
        return C15096g.m64898a(m64880p(j) - m64880p(j2), m64882r(j) - m64882r(j2));
    }

    @C8547h2
    /* renamed from: v */
    public static final long m64886v(long j, long j2) {
        return C15096g.m64898a(m64880p(j) + m64880p(j2), m64882r(j) + m64882r(j2));
    }

    @C8547h2
    /* renamed from: w */
    public static final long m64887w(long j, float f) {
        return C15096g.m64898a(m64880p(j) % f, m64882r(j) % f);
    }

    @C8547h2
    /* renamed from: x */
    public static final long m64888x(long j, float f) {
        return C15096g.m64898a(m64880p(j) * f, m64882r(j) * f);
    }

    @C12579k
    /* renamed from: y */
    public static String m64889y(long j) {
        if (!C15096g.m64901d(j)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + C15091c.m64848a(m64880p(j), 1) + ", " + C15091c.m64848a(m64882r(j), 1) + ')';
    }

    @C8547h2
    /* renamed from: z */
    public static final long m64890z(long j) {
        return C15096g.m64898a(-m64880p(j), -m64882r(j));
    }

    /* renamed from: A */
    public final /* synthetic */ long mo42242A() {
        return this.f37260a;
    }

    public boolean equals(Object obj) {
        return m64875k(this.f37260a, obj);
    }

    public int hashCode() {
        return m64883s(this.f37260a);
    }

    @C12579k
    public String toString() {
        return m64889y(this.f37260a);
    }
}
