package androidx.compose.animation.core;

import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,244:1\n25#2,3:245\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n*L\n59#1:245,3\n*E\n"})
/* renamed from: androidx.compose.animation.core.u0 */
public final class C2012u0 {

    /* renamed from: a */
    public static final double f5631a = 62.5d;

    /* renamed from: b */
    public static final float f5632b = Float.MAX_VALUE;

    /* renamed from: a */
    public static final long m8633a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return C1995n0.m8530b((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    /* renamed from: b */
    public static final float m8634b() {
        return f5632b;
    }
}
