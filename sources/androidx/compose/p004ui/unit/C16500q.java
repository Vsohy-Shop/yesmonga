package androidx.compose.p004ui.unit;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.C11532s0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
@C11363r0({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,111:1\n55#2:112\n62#2:113\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n46#1:112\n53#1:113\n*E\n"})
/* renamed from: androidx.compose.ui.unit.q */
public final class C16500q {
    @C12579k

    /* renamed from: b */
    public static final C16501a f40900b = new C16501a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f40901c = m74654e(0);

    /* renamed from: a */
    public final long f40902a;

    /* renamed from: androidx.compose.ui.unit.q$a */
    public static final class C16501a {
        public /* synthetic */ C16501a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo47897a() {
            return C16500q.f40901c;
        }

        public C16501a() {
        }
    }

    public /* synthetic */ C16500q(long j) {
        this.f40902a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C16500q m74651b(long j) {
        return new C16500q(j);
    }

    @C8547h2
    /* renamed from: c */
    public static final int m74652c(long j) {
        return m74662m(j);
    }

    @C8547h2
    /* renamed from: d */
    public static final int m74653d(long j) {
        return m74659j(j);
    }

    /* renamed from: e */
    public static long m74654e(long j) {
        return j;
    }

    @C8547h2
    /* renamed from: f */
    public static final long m74655f(long j, int i) {
        return C16502r.m74668a(m74662m(j) / i, m74659j(j) / i);
    }

    /* renamed from: g */
    public static boolean m74656g(long j, Object obj) {
        return (obj instanceof C16500q) && j == ((C16500q) obj).mo47895q();
    }

    /* renamed from: h */
    public static final boolean m74657h(long j, long j2) {
        return j == j2;
    }

    @C8547h2
    /* renamed from: i */
    public static /* synthetic */ void m74658i() {
    }

    /* renamed from: j */
    public static final int m74659j(long j) {
        return (int) (j & 4294967295L);
    }

    @C11532s0
    /* renamed from: k */
    public static /* synthetic */ void m74660k() {
    }

    @C8547h2
    /* renamed from: l */
    public static /* synthetic */ void m74661l() {
    }

    /* renamed from: m */
    public static final int m74662m(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: n */
    public static int m74663n(long j) {
        return Long.hashCode(j);
    }

    @C8547h2
    /* renamed from: o */
    public static final long m74664o(long j, int i) {
        return C16502r.m74668a(m74662m(j) * i, m74659j(j) * i);
    }

    @C8547h2
    @C12579k
    /* renamed from: p */
    public static String m74665p(long j) {
        return m74662m(j) + " x " + m74659j(j);
    }

    public boolean equals(Object obj) {
        return m74656g(this.f40902a, obj);
    }

    public int hashCode() {
        return m74663n(this.f40902a);
    }

    /* renamed from: q */
    public final /* synthetic */ long mo47895q() {
        return this.f40902a;
    }

    @C8547h2
    @C12579k
    public String toString() {
        return m74665p(this.f40902a);
    }
}
