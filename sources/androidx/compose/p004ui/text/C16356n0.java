package androidx.compose.p004ui.text;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
@C11363r0({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,128:1\n55#2:129\n62#2:130\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n48#1:129\n50#1:130\n*E\n"})
/* renamed from: androidx.compose.ui.text.n0 */
public final class C16356n0 {
    @C12579k

    /* renamed from: b */
    public static final C16357a f40590b = new C16357a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f40591c = C16359o0.m73779a(0);

    /* renamed from: a */
    public final long f40592a;

    /* renamed from: androidx.compose.ui.text.n0$a */
    public static final class C16357a {
        public /* synthetic */ C16357a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo47429a() {
            return C16356n0.f40591c;
        }

        public C16357a() {
        }
    }

    public /* synthetic */ C16356n0(long j) {
        this.f40592a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C16356n0 m73730b(long j) {
        return new C16356n0(j);
    }

    /* renamed from: c */
    public static long m73731c(long j) {
        return j;
    }

    /* renamed from: d */
    public static final boolean m73732d(long j, long j2) {
        return m73740l(j) <= m73740l(j2) && m73739k(j2) <= m73739k(j);
    }

    /* renamed from: e */
    public static final boolean m73733e(long j, int i) {
        return i < m73739k(j) && m73740l(j) <= i;
    }

    /* renamed from: f */
    public static boolean m73734f(long j, Object obj) {
        return (obj instanceof C16356n0) && j == ((C16356n0) obj).mo47427r();
    }

    /* renamed from: g */
    public static final boolean m73735g(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    public static final boolean m73736h(long j) {
        return m73742n(j) == m73737i(j);
    }

    /* renamed from: i */
    public static final int m73737i(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: j */
    public static final int m73738j(long j) {
        return m73739k(j) - m73740l(j);
    }

    /* renamed from: k */
    public static final int m73739k(long j) {
        return m73742n(j) > m73737i(j) ? m73742n(j) : m73737i(j);
    }

    /* renamed from: l */
    public static final int m73740l(long j) {
        return m73742n(j) > m73737i(j) ? m73737i(j) : m73742n(j);
    }

    /* renamed from: m */
    public static final boolean m73741m(long j) {
        return m73742n(j) > m73737i(j);
    }

    /* renamed from: n */
    public static final int m73742n(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: o */
    public static int m73743o(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: p */
    public static final boolean m73744p(long j, long j2) {
        return m73740l(j) < m73739k(j2) && m73740l(j2) < m73739k(j);
    }

    @C12579k
    /* renamed from: q */
    public static String m73745q(long j) {
        return "TextRange(" + m73742n(j) + ", " + m73737i(j) + ')';
    }

    public boolean equals(Object obj) {
        return m73734f(this.f40592a, obj);
    }

    public int hashCode() {
        return m73743o(this.f40592a);
    }

    /* renamed from: r */
    public final /* synthetic */ long mo47427r() {
        return this.f40592a;
    }

    @C12579k
    public String toString() {
        return m73745q(this.f40592a);
    }
}
