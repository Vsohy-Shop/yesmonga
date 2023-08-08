package androidx.compose.p004ui.layout;

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
@C11363r0({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n34#2:198\n41#2:199\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n51#1:198\n65#1:199\n*E\n"})
/* renamed from: androidx.compose.ui.layout.d1 */
public final class C15554d1 {
    @C12579k

    /* renamed from: b */
    public static final C15555a f38709b = new C15555a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f38710c = C15558e1.m69150a(Float.NaN, Float.NaN);

    /* renamed from: a */
    public final long f38711a;

    /* renamed from: androidx.compose.ui.layout.d1$a */
    public static final class C15555a {
        public /* synthetic */ C15555a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m69138b() {
        }

        /* renamed from: a */
        public final long mo44385a() {
            return C15554d1.f38710c;
        }

        public C15555a() {
        }
    }

    public /* synthetic */ C15554d1(long j) {
        this.f38711a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C15554d1 m69120b(long j) {
        return new C15554d1(j);
    }

    @C8547h2
    /* renamed from: c */
    public static final float m69121c(long j) {
        return m69131m(j);
    }

    @C8547h2
    /* renamed from: d */
    public static final float m69122d(long j) {
        return m69133o(j);
    }

    /* renamed from: e */
    public static long m69123e(long j) {
        return j;
    }

    /* renamed from: f */
    public static final long m69124f(long j, float f, float f2) {
        return C15558e1.m69150a(f, f2);
    }

    /* renamed from: g */
    public static /* synthetic */ long m69125g(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m69131m(j);
        }
        if ((i & 2) != 0) {
            f2 = m69133o(j);
        }
        return m69124f(j, f, f2);
    }

    @C8547h2
    /* renamed from: h */
    public static final long m69126h(long j, float f) {
        return C15558e1.m69150a(m69131m(j) / f, m69133o(j) / f);
    }

    /* renamed from: i */
    public static boolean m69127i(long j, Object obj) {
        return (obj instanceof C15554d1) && j == ((C15554d1) obj).mo44383s();
    }

    /* renamed from: j */
    public static final boolean m69128j(long j, long j2) {
        return j == j2;
    }

    @C11532s0
    /* renamed from: k */
    public static /* synthetic */ void m69129k() {
    }

    @C8547h2
    /* renamed from: l */
    public static /* synthetic */ void m69130l() {
    }

    /* renamed from: m */
    public static final float m69131m(long j) {
        boolean z;
        if (j != f38710c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11377x xVar = C11377x.f28521a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    @C8547h2
    /* renamed from: n */
    public static /* synthetic */ void m69132n() {
    }

    /* renamed from: o */
    public static final float m69133o(long j) {
        boolean z;
        if (j != f38710c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11377x xVar = C11377x.f28521a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* renamed from: p */
    public static int m69134p(long j) {
        return Long.hashCode(j);
    }

    @C8547h2
    /* renamed from: q */
    public static final long m69135q(long j, float f) {
        return C15558e1.m69150a(m69131m(j) * f, m69133o(j) * f);
    }

    @C12579k
    /* renamed from: r */
    public static String m69136r(long j) {
        return "ScaleFactor(" + C15558e1.m69158i(m69131m(j)) + ", " + C15558e1.m69158i(m69133o(j)) + ')';
    }

    public boolean equals(Object obj) {
        return m69127i(this.f38711a, obj);
    }

    public int hashCode() {
        return m69134p(this.f38711a);
    }

    /* renamed from: s */
    public final /* synthetic */ long mo44383s() {
        return this.f38711a;
    }

    @C12579k
    public String toString() {
        return m69136r(this.f38711a);
    }
}
