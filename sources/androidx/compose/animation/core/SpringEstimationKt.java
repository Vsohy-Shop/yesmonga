package androidx.compose.animation.core;

import kotlin.Pair;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n1#1,318:1\n317#1:319\n317#1:320\n313#1:321\n317#1:322\n317#1:323\n313#1:324\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n141#1:319\n142#1:320\n183#1:321\n211#1:322\n212#1:323\n259#1:324\n*E\n"})
public final class SpringEstimationKt {
    /* renamed from: a */
    public static final long m8058a(double d, double d2, double d3, double d4, double d5) {
        return m8064g(C2007s.m8609a(1.0d, 2.0d * d2 * Math.sqrt(d), d), d2, d3, d4, d5);
    }

    /* renamed from: b */
    public static final long m8059b(double d, double d2, double d3, double d4, double d5, double d6) {
        return m8064g(C2007s.m8609a(d3, d2, d), d2 / (Math.sqrt(d * d3) * 2.0d), d4, d5, d6);
    }

    /* renamed from: c */
    public static final long m8060c(float f, float f2, float f3, float f4, float f5) {
        return m8058a((double) f, (double) f2, (double) f3, (double) f4, (double) f5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9 A[LOOP:0: B:35:0x00ac->B:39:0x00b9, LOOP_END] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final double m8061d(kotlin.Pair<androidx.compose.animation.core.C2005r, androidx.compose.animation.core.C2005r> r19, double r20, double r22, double r24) {
        /*
            r8 = r24
            java.lang.Object r0 = r19.mo21849e()
            androidx.compose.animation.core.r r0 = (androidx.compose.animation.core.C2005r) r0
            double r10 = r0.mo6964k()
            double r0 = r10 * r20
            double r12 = r22 - r0
            double r2 = r8 / r20
            double r2 = java.lang.Math.abs(r2)
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r10
            double r4 = r8 / r12
            double r4 = java.lang.Math.abs(r4)
            double r4 = java.lang.Math.log(r4)
            double r4 = m8062e(r4, r10)
            double r4 = r4 / r10
            boolean r6 = java.lang.Double.isInfinite(r2)
            r14 = 0
            r7 = 1
            if (r6 != 0) goto L_0x003a
            boolean r6 = java.lang.Double.isNaN(r2)
            if (r6 != 0) goto L_0x003a
            r6 = r7
            goto L_0x003b
        L_0x003a:
            r6 = r14
        L_0x003b:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0040
            r15 = r4
            goto L_0x0058
        L_0x0040:
            boolean r6 = java.lang.Double.isInfinite(r4)
            if (r6 != 0) goto L_0x004e
            boolean r6 = java.lang.Double.isNaN(r4)
            if (r6 != 0) goto L_0x004e
            r6 = r7
            goto L_0x004f
        L_0x004e:
            r6 = r14
        L_0x004f:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            double r2 = java.lang.Math.max(r2, r4)
        L_0x0057:
            r15 = r2
        L_0x0058:
            double r0 = r0 + r12
            double r0 = -r0
            double r2 = r10 * r12
            double r4 = r0 / r2
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L_0x0091
            r17 = 0
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            goto L_0x0091
        L_0x006b:
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r0 = r20
            r2 = r10
            r6 = r12
            double r0 = m8063f(r0, r2, r4, r6)
            double r0 = -r0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
            int r0 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            int r0 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            r15 = r17
            goto L_0x0091
        L_0x0087:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r10
            double r0 = -r0
            double r2 = r20 / r12
            double r15 = r0 - r2
            r7 = r8
            goto L_0x0093
        L_0x0091:
            double r0 = -r8
            r7 = r0
        L_0x0093:
            androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1 r9 = new androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
            r0 = r9
            r1 = r20
            r3 = r12
            r5 = r10
            r0.<init>(r1, r3, r5, r7)
            androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 r7 = new androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
            r0 = r7
            r1 = r12
            r3 = r10
            r5 = r20
            r0.<init>(r1, r3, r5)
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x00ac:
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e2
            r0 = 100
            if (r14 >= r0) goto L_0x00e2
            int r14 = r14 + 1
            java.lang.Double r0 = java.lang.Double.valueOf(r15)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r15)
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = r0 / r2
            double r0 = r15 - r0
            double r15 = r15 - r0
            double r2 = java.lang.Math.abs(r15)
            r15 = r0
            r0 = r2
            goto L_0x00ac
        L_0x00e2:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.m8061d(kotlin.Pair, double, double, double):double");
    }

    /* renamed from: e */
    public static final double m8062e(double d, double d2) {
        double d3 = d;
        for (int i = 0; i < 6; i++) {
            d3 = d - Math.log(Math.abs(d3 / d2));
        }
        return d3;
    }

    /* renamed from: f */
    public static final double m8063f(double d, double d2, double d3, double d4) {
        double d5 = d2 * d3;
        return (d * Math.exp(d5)) + (d4 * d3 * Math.exp(d5));
    }

    /* renamed from: g */
    public static final long m8064g(Pair<C2005r, C2005r> pair, double d, double d2, double d3, double d4) {
        boolean z;
        double d5;
        int i = (d3 > 0.0d ? 1 : (d3 == 0.0d ? 0 : -1));
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (d2 != 0.0d) {
                z2 = false;
            }
            if (z2) {
                return 0;
            }
        }
        if (i < 0) {
            d2 = -d2;
        }
        double d6 = d2;
        double abs = Math.abs(d3);
        if (d > 1.0d) {
            d5 = m8065h(pair, abs, d6, d4);
        } else if (d < 1.0d) {
            d5 = m8067j(pair, abs, d6, d4);
        } else {
            d5 = m8061d(pair, abs, d6, d4);
        }
        return (long) (d5 * 1000.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final double m8065h(kotlin.Pair<androidx.compose.animation.core.C2005r, androidx.compose.animation.core.C2005r> r31, double r32, double r34, double r36) {
        /*
            r0 = r36
            java.lang.Object r2 = r31.mo21849e()
            androidx.compose.animation.core.r r2 = (androidx.compose.animation.core.C2005r) r2
            double r14 = r2.mo6964k()
            java.lang.Object r2 = r31.mo21851f()
            androidx.compose.animation.core.r r2 = (androidx.compose.animation.core.C2005r) r2
            double r16 = r2.mo6964k()
            double r2 = r14 * r32
            double r2 = r2 - r34
            double r18 = r14 - r16
            double r11 = r2 / r18
            double r20 = r32 - r11
            double r2 = r0 / r20
            double r2 = java.lang.Math.abs(r2)
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r14
            double r4 = r0 / r11
            double r4 = java.lang.Math.abs(r4)
            double r4 = java.lang.Math.log(r4)
            double r4 = r4 / r16
            boolean r6 = java.lang.Double.isInfinite(r2)
            r22 = 0
            r7 = 1
            if (r6 != 0) goto L_0x0048
            boolean r6 = java.lang.Double.isNaN(r2)
            if (r6 != 0) goto L_0x0048
            r6 = r7
            goto L_0x004a
        L_0x0048:
            r6 = r22
        L_0x004a:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0050
            r23 = r4
            goto L_0x006a
        L_0x0050:
            boolean r6 = java.lang.Double.isInfinite(r4)
            if (r6 != 0) goto L_0x005e
            boolean r6 = java.lang.Double.isNaN(r4)
            if (r6 != 0) goto L_0x005e
            r6 = r7
            goto L_0x0060
        L_0x005e:
            r6 = r22
        L_0x0060:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            double r2 = java.lang.Math.max(r2, r4)
        L_0x0068:
            r23 = r2
        L_0x006a:
            double r25 = r20 * r14
            double r2 = -r11
            double r2 = r2 * r16
            double r2 = r25 / r2
            double r2 = java.lang.Math.log(r2)
            double r4 = r16 - r14
            double r7 = r2 / r4
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L_0x00b8
            r27 = 0
            int r2 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r2 > 0) goto L_0x0086
            goto L_0x00b8
        L_0x0086:
            int r2 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a6
            r3 = r20
            r5 = r14
            r9 = r11
            r29 = r11
            r11 = r16
            double r2 = m8066i(r3, r5, r7, r9, r11)
            double r2 = -r2
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a8
            int r2 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ba
            int r2 = (r20 > r27 ? 1 : (r20 == r27 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ba
            r23 = r27
            goto L_0x00ba
        L_0x00a6:
            r29 = r11
        L_0x00a8:
            double r11 = r29 * r16
            double r11 = r11 * r16
            double r2 = -r11
            double r25 = r25 * r14
            double r2 = r2 / r25
            double r2 = java.lang.Math.log(r2)
            double r23 = r2 / r18
            goto L_0x00bb
        L_0x00b8:
            r29 = r11
        L_0x00ba:
            double r0 = -r0
        L_0x00bb:
            r12 = r0
            androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1 r0 = new androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1
            r3 = r0
            r4 = r20
            r6 = r14
            r8 = r29
            r10 = r16
            r3.<init>(r4, r6, r8, r10, r12)
            androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1 r1 = new androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1
            r3 = r1
            r3.<init>(r4, r6, r8, r10)
            java.lang.Double r2 = java.lang.Double.valueOf(r23)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r2 = java.lang.Math.abs(r2)
            r4 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00eb
            return r23
        L_0x00eb:
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r4 = r22
        L_0x00f2:
            r5 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x012a
            r2 = 100
            if (r4 >= r2) goto L_0x012a
            int r4 = r4 + 1
            java.lang.Double r2 = java.lang.Double.valueOf(r23)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r23)
            java.lang.Object r5 = r1.invoke(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            double r2 = r2 / r5
            double r2 = r23 - r2
            double r23 = r23 - r2
            double r5 = java.lang.Math.abs(r23)
            r23 = r2
            r2 = r5
            goto L_0x00f2
        L_0x012a:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.m8065h(kotlin.Pair, double, double, double):double");
    }

    /* renamed from: i */
    public static final double m8066i(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    /* renamed from: j */
    public static final double m8067j(Pair<C2005r, C2005r> pair, double d, double d2, double d3) {
        double k = pair.mo21849e().mo6964k();
        double j = (d2 - (k * d)) / pair.mo21849e().mo6963j();
        return Math.log(d3 / Math.sqrt((d * d) + (j * j))) / k;
    }

    /* renamed from: k */
    public static final boolean m8068k(double d) {
        return !(!Double.isInfinite(d) && !Double.isNaN(d));
    }

    /* renamed from: l */
    public static final double m8069l(double d, C11300l<? super Double, Double> lVar, C11300l<? super Double, Double> lVar2) {
        return d - (lVar.invoke(Double.valueOf(d)).doubleValue() / lVar2.invoke(Double.valueOf(d)).doubleValue());
    }
}
