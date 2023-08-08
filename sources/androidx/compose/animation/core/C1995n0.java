package androidx.compose.animation.core;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;

@C11288f
@C11363r0({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,244:1\n34#2:245\n41#2:246\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n48#1:245\n50#1:246\n*E\n"})
/* renamed from: androidx.compose.animation.core.n0 */
public final class C1995n0 {

    /* renamed from: a */
    public final long f5569a;

    public /* synthetic */ C1995n0(long j) {
        this.f5569a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C1995n0 m8529a(long j) {
        return new C1995n0(j);
    }

    /* renamed from: b */
    public static long m8530b(long j) {
        return j;
    }

    /* renamed from: c */
    public static final long m8531c(long j, float f, float f2) {
        return C2012u0.m8633a(f, f2);
    }

    /* renamed from: d */
    public static /* synthetic */ long m8532d(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m8535h(j);
        }
        if ((i & 2) != 0) {
            f2 = m8536i(j);
        }
        return m8531c(j, f, f2);
    }

    /* renamed from: e */
    public static boolean m8533e(long j, Object obj) {
        return (obj instanceof C1995n0) && j == ((C1995n0) obj).mo6939l();
    }

    /* renamed from: f */
    public static final boolean m8534f(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    public static final float m8535h(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: i */
    public static final float m8536i(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: j */
    public static int m8537j(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: k */
    public static String m8538k(long j) {
        return "Motion(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m8533e(this.f5569a, obj);
    }

    /* renamed from: g */
    public final long mo6937g() {
        return this.f5569a;
    }

    public int hashCode() {
        return m8537j(this.f5569a);
    }

    /* renamed from: l */
    public final /* synthetic */ long mo6939l() {
        return this.f5569a;
    }

    public String toString() {
        return m8538k(this.f5569a);
    }
}
