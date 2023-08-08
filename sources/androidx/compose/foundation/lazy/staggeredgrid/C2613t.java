package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;

@C11288f
@C11363r0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n879#1:1101\n878#1:1103\n48#2:1098\n55#2:1099\n62#2:1100\n62#2:1102\n55#2:1104\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n880#1:1101\n880#1:1103\n876#1:1098\n878#1:1099\n879#1:1100\n880#1:1102\n880#1:1104\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.t */
public final class C2613t {

    /* renamed from: a */
    public final long f6931a;

    public /* synthetic */ C2613t(long j) {
        this.f6931a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C2613t m11844a(long j) {
        return new C2613t(j);
    }

    /* renamed from: b */
    public static long m11845b(int i, int i2) {
        return m11846c((((long) (i2 + i)) & 4294967295L) | (((long) i) << 32));
    }

    /* renamed from: c */
    public static long m11846c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m11847d(long j, Object obj) {
        return (obj instanceof C2613t) && j == ((C2613t) obj).mo9017l();
    }

    /* renamed from: e */
    public static final boolean m11848e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final int m11849f(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: h */
    public static final int m11850h(long j) {
        return ((int) (4294967295L & j)) - ((int) (j >> 32));
    }

    /* renamed from: i */
    public static final int m11851i(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: j */
    public static int m11852j(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: k */
    public static String m11853k(long j) {
        return "SpanRange(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m11847d(this.f6931a, obj);
    }

    /* renamed from: g */
    public final long mo9015g() {
        return this.f6931a;
    }

    public int hashCode() {
        return m11852j(this.f6931a);
    }

    /* renamed from: l */
    public final /* synthetic */ long mo9017l() {
        return this.f6931a;
    }

    public String toString() {
        return m11853k(this.f6931a);
    }
}
