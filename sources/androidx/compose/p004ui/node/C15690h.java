package androidx.compose.p004ui.node;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;

@C11288f
@C11363r0({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,340:1\n34#2:341\n62#2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n*L\n319#1:341\n322#1:342\n*E\n"})
/* renamed from: androidx.compose.ui.node.h */
public final class C15690h {

    /* renamed from: a */
    public final long f39002a;

    public /* synthetic */ C15690h(long j) {
        this.f39002a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C15690h m70272a(long j) {
        return new C15690h(j);
    }

    /* renamed from: b */
    public static final int m70273b(long j, long j2) {
        boolean i = m70279i(j);
        if (i == m70279i(j2)) {
            return (int) Math.signum(m70277f(j) - m70277f(j2));
        }
        if (i) {
            return -1;
        }
        return 1;
    }

    /* renamed from: c */
    public static long m70274c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m70275d(long j, Object obj) {
        return (obj instanceof C15690h) && j == ((C15690h) obj).mo45018k();
    }

    /* renamed from: e */
    public static final boolean m70276e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final float m70277f(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: h */
    public static int m70278h(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: i */
    public static final boolean m70279i(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }

    /* renamed from: j */
    public static String m70280j(long j) {
        return "DistanceAndInLayer(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m70275d(this.f39002a, obj);
    }

    /* renamed from: g */
    public final long mo45016g() {
        return this.f39002a;
    }

    public int hashCode() {
        return m70278h(this.f39002a);
    }

    /* renamed from: k */
    public final /* synthetic */ long mo45018k() {
        return this.f39002a;
    }

    public String toString() {
        return m70280j(this.f39002a);
    }
}
