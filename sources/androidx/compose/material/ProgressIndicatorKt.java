package androidx.compose.material;

import androidx.compose.animation.core.C2009t;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.contentsquare.android.api.C14092c;
import com.urbanairship.push.notifications.C9527p;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.C11363r0;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,587:1\n83#2,3:588\n83#2,3:597\n1114#3,6:591\n1114#3,6:600\n76#4:606\n76#4:607\n75#5,7:608\n76#6:615\n76#6:616\n76#6:617\n76#6:618\n76#6:619\n76#6:620\n76#6:621\n76#6:622\n154#7:623\n154#7:624\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n*L\n86#1:588,3\n165#1:597,3\n86#1:591,6\n165#1:600,6\n296#1:606\n334#1:607\n512#1:608,7\n117#1:615\n128#1:616\n139#1:617\n150#1:618\n340#1:619\n352#1:620\n363#1:621\n375#1:622\n530#1:623\n534#1:624\n*E\n"})
public final class ProgressIndicatorKt {

    /* renamed from: a */
    public static final float f7759a = C7948y0.f19132a.mo11115b();

    /* renamed from: b */
    public static final float f7760b = C16483g.m74435M((float) C9527p.f26031b);

    /* renamed from: c */
    public static final float f7761c = C16483g.m74435M((float) 40);

    /* renamed from: d */
    public static final int f7762d = 1800;

    /* renamed from: e */
    public static final int f7763e = 750;

    /* renamed from: f */
    public static final int f7764f = 850;

    /* renamed from: g */
    public static final int f7765g = 567;

    /* renamed from: h */
    public static final int f7766h = 533;

    /* renamed from: i */
    public static final int f7767i = 0;

    /* renamed from: j */
    public static final int f7768j = 333;

    /* renamed from: k */
    public static final int f7769k = 1000;

    /* renamed from: l */
    public static final int f7770l = 1267;
    @C12579k

    /* renamed from: m */
    public static final C2009t f7771m = new C2009t(0.2f, 0.0f, 0.8f, 1.0f);
    @C12579k

    /* renamed from: n */
    public static final C2009t f7772n = new C2009t(0.4f, 0.0f, 1.0f, 1.0f);
    @C12579k

    /* renamed from: o */
    public static final C2009t f7773o = new C2009t(0.0f, 0.0f, 0.65f, 1.0f);
    @C12579k

    /* renamed from: p */
    public static final C2009t f7774p = new C2009t(0.1f, 0.0f, 0.45f, 1.0f);

    /* renamed from: q */
    public static final int f7775q = 5;

    /* renamed from: r */
    public static final int f7776r = 1332;

    /* renamed from: s */
    public static final float f7777s = -90.0f;

    /* renamed from: t */
    public static final float f7778t = 286.0f;

    /* renamed from: u */
    public static final float f7779u = 290.0f;

    /* renamed from: v */
    public static final float f7780v = 216.0f;

    /* renamed from: w */
    public static final int f7781w = 666;

    /* renamed from: x */
    public static final int f7782x = 666;
    @C12579k

    /* renamed from: y */
    public static final C2009t f7783y = new C2009t(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: I */
    public static final void m13698I(C15187e eVar, float f, float f2, long j, C15198m mVar) {
        float f3 = (float) 2;
        float g = mVar.mo42726g() / f3;
        float t = C15104m.m65023t(eVar.mo42718b()) - (f3 * g);
        C15187e.m65724z2(eVar, j, f, f2, false, C15096g.m64898a(g, g), C15106n.m65033a(t, t), 0.0f, mVar, (C15249k2) null, 0, 832, (Object) null);
    }

    /* renamed from: J */
    public static final void m13699J(C15187e eVar, long j, C15198m mVar) {
        m13698I(eVar, 0.0f, 360.0f, j, mVar);
    }

    /* renamed from: K */
    public static final void m13700K(C15187e eVar, float f, float f2, long j, C15198m mVar) {
        m13698I(eVar, f, f2, j, mVar);
    }

    /* renamed from: L */
    public static final void m13701L(C15187e eVar, float f, float f2, float f3, long j, C15198m mVar) {
        float f4;
        if (C15244j4.m66129g(mVar.mo42721c(), C15244j4.f37564b.mo42862a())) {
            f4 = 0.0f;
        } else {
            f4 = ((f2 / C16483g.m74435M(f7761c / ((float) 2))) * 57.29578f) / 2.0f;
        }
        m13698I(eVar, f + f4, Math.max(f3, 0.1f), j, mVar);
    }

    /* renamed from: M */
    public static final void m13702M(C15187e eVar, float f, float f2, long j, float f3, int i) {
        boolean z;
        float f4;
        float f5;
        float t = C15104m.m65023t(eVar.mo42718b());
        float m = C15104m.m65016m(eVar.mo42718b());
        float f6 = (float) 2;
        float f7 = m / f6;
        if (eVar.getLayoutDirection() == LayoutDirection.Ltr) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f;
        } else {
            f4 = 1.0f - f2;
        }
        float f8 = f4 * t;
        if (z) {
            f5 = f2;
        } else {
            f5 = 1.0f - f;
        }
        float f9 = f5 * t;
        if (C15244j4.m66129g(i, C15244j4.f37564b.mo42862a()) || m > t) {
            C15187e.m65695K2(eVar, j, C15096g.m64898a(f8, f7), C15096g.m64898a(f9, f7), f3, 0, (C15242j3) null, 0.0f, (C15249k2) null, 0, C14092c.f34592d1, (Object) null);
            return;
        }
        float f10 = f3 / f6;
        C11457f e = C11478t.m44305e(f10, t - f10);
        float floatValue = ((Number) C11479u.m44349N(Float.valueOf(f8), e)).floatValue();
        float floatValue2 = ((Number) C11479u.m44349N(Float.valueOf(f9), e)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            C15187e.m65695K2(eVar, j, C15096g.m64898a(floatValue, f7), C15096g.m64898a(floatValue2, f7), f3, i, (C15242j3) null, 0.0f, (C15249k2) null, 0, C14092c.f34573Y0, (Object) null);
        }
    }

    /* renamed from: N */
    public static final void m13703N(C15187e eVar, long j, float f, int i) {
        m13702M(eVar, 0.0f, 1.0f, j, f, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13704a(float r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, long r20, float r22, long r23, int r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r1 = r18
            r9 = r27
            r0 = 1746618448(0x681b4850, float:2.933203E24)
            r2 = r26
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r9 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.mo14968d(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r9
            goto L_0x0024
        L_0x0023:
            r3 = r9
        L_0x0024:
            r4 = r28 & 2
            if (r4 == 0) goto L_0x002b
            r3 = r3 | 48
            goto L_0x003e
        L_0x002b:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x003e
            r5 = r19
            boolean r6 = r2.mo15006n0(r5)
            if (r6 == 0) goto L_0x003a
            r6 = 32
            goto L_0x003c
        L_0x003a:
            r6 = 16
        L_0x003c:
            r3 = r3 | r6
            goto L_0x0040
        L_0x003e:
            r5 = r19
        L_0x0040:
            r6 = r9 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0059
            r6 = r28 & 4
            if (r6 != 0) goto L_0x0053
            r6 = r20
            boolean r8 = r2.mo14980g(r6)
            if (r8 == 0) goto L_0x0055
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0053:
            r6 = r20
        L_0x0055:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r3 = r3 | r8
            goto L_0x005b
        L_0x0059:
            r6 = r20
        L_0x005b:
            r8 = r28 & 8
            if (r8 == 0) goto L_0x0062
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0062:
            r10 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0075
            r10 = r22
            boolean r11 = r2.mo14968d(r10)
            if (r11 == 0) goto L_0x0071
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r11
            goto L_0x0077
        L_0x0075:
            r10 = r22
        L_0x0077:
            r11 = r28 & 16
            if (r11 == 0) goto L_0x007e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0093
        L_0x007e:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r9
            if (r12 != 0) goto L_0x0093
            r12 = r23
            boolean r14 = r2.mo14980g(r12)
            if (r14 == 0) goto L_0x008f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r14
            goto L_0x0095
        L_0x0093:
            r12 = r23
        L_0x0095:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00af
            r14 = r28 & 32
            if (r14 != 0) goto L_0x00a9
            r14 = r25
            boolean r15 = r2.mo14976f(r14)
            if (r15 == 0) goto L_0x00ab
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00a9:
            r14 = r25
        L_0x00ab:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r3 = r3 | r15
            goto L_0x00b1
        L_0x00af:
            r14 = r25
        L_0x00b1:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r3 = r3 & r15
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r15) goto L_0x00c9
            boolean r3 = r2.mo15011p()
            if (r3 != 0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            r2.mo14958a0()
        L_0x00c4:
            r3 = r6
            r6 = r12
            r8 = r14
            goto L_0x0180
        L_0x00c9:
            r2.mo14930Q()
            r3 = r9 & 1
            if (r3 == 0) goto L_0x00db
            boolean r3 = r2.mo14977f0()
            if (r3 == 0) goto L_0x00d7
            goto L_0x00db
        L_0x00d7:
            r2.mo14958a0()
            goto L_0x010d
        L_0x00db:
            if (r4 == 0) goto L_0x00e0
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r5 = r3
        L_0x00e0:
            r3 = r28 & 4
            if (r3 == 0) goto L_0x00f0
            androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
            r4 = 6
            androidx.compose.material.q r3 = r3.mo11075a(r2, r4)
            long r3 = r3.mo10971j()
            r6 = r3
        L_0x00f0:
            if (r8 == 0) goto L_0x00f9
            androidx.compose.material.y0 r3 = androidx.compose.material.C7948y0.f19132a
            float r3 = r3.mo11115b()
            r10 = r3
        L_0x00f9:
            if (r11 == 0) goto L_0x0102
            androidx.compose.ui.graphics.j2$a r3 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r3 = r3.mo42850s()
            r12 = r3
        L_0x0102:
            r3 = r28 & 32
            if (r3 == 0) goto L_0x010d
            androidx.compose.ui.graphics.j4$a r3 = androidx.compose.p004ui.graphics.C15244j4.f37564b
            int r3 = r3.mo42862a()
            r14 = r3
        L_0x010d:
            r2.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x011c
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r3, r4)
        L_0x011c:
            r0 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = kotlin.ranges.C11479u.m44331H(r1, r0, r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r2.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.ui.graphics.drawscope.m r4 = new androidx.compose.ui.graphics.drawscope.m
            float r3 = r3.mo7425g5(r10)
            r8 = 0
            r11 = 0
            r15 = 0
            r16 = 26
            r17 = 0
            r19 = r4
            r20 = r3
            r21 = r8
            r22 = r14
            r23 = r11
            r24 = r15
            r25 = r16
            r26 = r17
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r3 = 0
            r8 = 0
            r11 = 6
            r19 = r5
            r20 = r0
            r21 = r3
            r22 = r8
            r23 = r11
            androidx.compose.ui.m r3 = androidx.compose.foundation.ProgressSemanticsKt.m9053c(r19, r20, r21, r22, r23, r24)
            float r8 = f7761c
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10087C(r3, r8)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1 r8 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
            r19 = r8
            r21 = r12
            r23 = r4
            r24 = r6
            r19.<init>(r20, r21, r23, r24)
            r0 = 0
            androidx.compose.foundation.CanvasKt.m8873b(r3, r8, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00c4
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x00c4
        L_0x0180:
            androidx.compose.runtime.t1 r11 = r2.mo15020s()
            if (r11 != 0) goto L_0x0187
            goto L_0x0198
        L_0x0187:
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2 r12 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
            r0 = r12
            r1 = r18
            r2 = r5
            r5 = r10
            r9 = r27
            r10 = r28
            r0.<init>(r1, r2, r3, r5, r6, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m13704a(float, androidx.compose.ui.m, long, float, long, int, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13705b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r28, long r29, float r31, long r32, int r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r8 = r36
            r0 = -1119119072(0xffffffffbd4b9920, float:-0.04970658)
            r1 = r35
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r37 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0016
            r4 = r8 | 6
            r5 = r4
            r4 = r28
            goto L_0x002a
        L_0x0016:
            r4 = r8 & 14
            if (r4 != 0) goto L_0x0027
            r4 = r28
            boolean r5 = r1.mo15006n0(r4)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = r3
        L_0x0025:
            r5 = r5 | r8
            goto L_0x002a
        L_0x0027:
            r4 = r28
            r5 = r8
        L_0x002a:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0043
            r6 = r37 & 2
            if (r6 != 0) goto L_0x003d
            r6 = r29
            boolean r9 = r1.mo14980g(r6)
            if (r9 == 0) goto L_0x003f
            r9 = 32
            goto L_0x0041
        L_0x003d:
            r6 = r29
        L_0x003f:
            r9 = 16
        L_0x0041:
            r5 = r5 | r9
            goto L_0x0045
        L_0x0043:
            r6 = r29
        L_0x0045:
            r9 = r37 & 4
            if (r9 == 0) goto L_0x004c
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r10 = r8 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x005f
            r10 = r31
            boolean r11 = r1.mo14968d(r10)
            if (r11 == 0) goto L_0x005b
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r11 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r5 = r5 | r11
            goto L_0x0061
        L_0x005f:
            r10 = r31
        L_0x0061:
            r11 = r37 & 8
            if (r11 == 0) goto L_0x0068
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r12 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x007b
            r12 = r32
            boolean r14 = r1.mo14980g(r12)
            if (r14 == 0) goto L_0x0077
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r5 = r5 | r14
            goto L_0x007d
        L_0x007b:
            r12 = r32
        L_0x007d:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x0098
            r14 = r37 & 16
            if (r14 != 0) goto L_0x0092
            r14 = r34
            boolean r15 = r1.mo14976f(r14)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0092:
            r14 = r34
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r5 = r5 | r15
            goto L_0x009a
        L_0x0098:
            r14 = r34
        L_0x009a:
            r15 = 46811(0xb6db, float:6.5596E-41)
            r5 = r5 & r15
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r15) goto L_0x00b0
            boolean r5 = r1.mo15011p()
            if (r5 != 0) goto L_0x00a9
            goto L_0x00b0
        L_0x00a9:
            r1.mo14958a0()
            r2 = r4
            r4 = r10
            goto L_0x023e
        L_0x00b0:
            r1.mo14930Q()
            r5 = r8 & 1
            if (r5 == 0) goto L_0x00c7
            boolean r5 = r1.mo14977f0()
            if (r5 == 0) goto L_0x00be
            goto L_0x00c7
        L_0x00be:
            r1.mo14958a0()
            r2 = r4
        L_0x00c2:
            r4 = r10
            r20 = r12
            r5 = r14
            goto L_0x00fd
        L_0x00c7:
            if (r2 == 0) goto L_0x00cc
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00cd
        L_0x00cc:
            r2 = r4
        L_0x00cd:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x00dd
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            r5 = 6
            androidx.compose.material.q r4 = r4.mo11075a(r1, r5)
            long r4 = r4.mo10971j()
            r6 = r4
        L_0x00dd:
            if (r9 == 0) goto L_0x00e6
            androidx.compose.material.y0 r4 = androidx.compose.material.C7948y0.f19132a
            float r4 = r4.mo11115b()
            r10 = r4
        L_0x00e6:
            if (r11 == 0) goto L_0x00ef
            androidx.compose.ui.graphics.j2$a r4 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r4 = r4.mo42850s()
            r12 = r4
        L_0x00ef:
            r4 = r37 & 16
            if (r4 == 0) goto L_0x00c2
            androidx.compose.ui.graphics.j4$a r4 = androidx.compose.p004ui.graphics.C15244j4.f37564b
            int r4 = r4.mo42864c()
            r5 = r4
            r4 = r10
            r20 = r12
        L_0x00fd:
            r1.mo14899E()
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x010c
            r9 = -1
            java.lang.String r10 = "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r9, r10)
        L_0x010c:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r1.mo15032w(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.p004ui.unit.C16479d) r0
            androidx.compose.ui.graphics.drawscope.m r12 = new androidx.compose.ui.graphics.drawscope.m
            float r0 = r0.mo7425g5(r4)
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 26
            r14 = 0
            r28 = r12
            r29 = r0
            r30 = r9
            r31 = r5
            r32 = r10
            r33 = r11
            r34 = r13
            r35 = r14
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            r0 = 0
            androidx.compose.animation.core.InfiniteTransition r9 = androidx.compose.animation.core.InfiniteTransitionKt.m8040e(r1, r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r11 = 5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            kotlin.jvm.internal.c0 r13 = kotlin.jvm.internal.C11324c0.f28435a
            androidx.compose.animation.core.a1 r13 = androidx.compose.animation.core.VectorConvertersKt.m8225j(r13)
            r14 = 6660(0x1a04, float:9.333E-42)
            androidx.compose.animation.core.z r15 = androidx.compose.animation.core.C1947b0.m8291c()
            r35 = r5
            r5 = 0
            androidx.compose.animation.core.z0 r14 = androidx.compose.animation.core.C1972h.m8392q(r14, r0, r15, r3, r5)
            r15 = 0
            r16 = 0
            r18 = 6
            r19 = 0
            r28 = r14
            r29 = r15
            r30 = r16
            r32 = r18
            r33 = r19
            androidx.compose.animation.core.k0 r14 = androidx.compose.animation.core.C1972h.m8381f(r28, r29, r30, r32, r33)
            int r15 = androidx.compose.animation.core.InfiniteTransition.f5305f
            r0 = r15 | 4528(0x11b0, float:6.345E-42)
            int r16 = androidx.compose.animation.core.C1984k0.f5527d
            int r17 = r16 << 12
            r0 = r0 | r17
            r28 = r9
            r29 = r10
            r30 = r11
            r31 = r13
            r32 = r14
            r33 = r1
            r34 = r0
            androidx.compose.runtime.k2 r0 = androidx.compose.animation.core.InfiniteTransitionKt.m8038c(r28, r29, r30, r31, r32, r33, r34)
            r10 = 0
            r13 = 1332(0x534, float:1.867E-42)
            androidx.compose.animation.core.z r14 = androidx.compose.animation.core.C1947b0.m8291c()
            r11 = 0
            androidx.compose.animation.core.z0 r22 = androidx.compose.animation.core.C1972h.m8392q(r13, r11, r14, r3, r5)
            r23 = 0
            r24 = 0
            r26 = 6
            r27 = 0
            androidx.compose.animation.core.k0 r3 = androidx.compose.animation.core.C1972h.m8381f(r22, r23, r24, r26, r27)
            r5 = r15 | 432(0x1b0, float:6.05E-43)
            int r11 = r16 << 9
            r5 = r5 | r11
            r29 = r10
            r10 = 1133445120(0x438f0000, float:286.0)
            r30 = r10
            r31 = r3
            r32 = r1
            r33 = r5
            androidx.compose.runtime.k2 r19 = androidx.compose.animation.core.InfiniteTransitionKt.m8036a(r28, r29, r30, r31, r32, r33)
            r3 = 0
            r5 = 1133576192(0x43910000, float:290.0)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2 r10 = androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2.f7784f
            androidx.compose.animation.core.m0 r10 = androidx.compose.animation.core.C1972h.m8382g(r10)
            r11 = 0
            r13 = 0
            r17 = 6
            r18 = 0
            r28 = r10
            r29 = r11
            r30 = r13
            r32 = r17
            r33 = r18
            androidx.compose.animation.core.k0 r10 = androidx.compose.animation.core.C1972h.m8381f(r28, r29, r30, r32, r33)
            r11 = r15 | 432(0x1b0, float:6.05E-43)
            int r13 = r16 << 9
            r11 = r11 | r13
            r28 = r9
            r29 = r3
            r30 = r5
            r31 = r10
            r32 = r1
            r33 = r11
            androidx.compose.runtime.k2 r17 = androidx.compose.animation.core.InfiniteTransitionKt.m8036a(r28, r29, r30, r31, r32, r33)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2 r10 = androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2.f7785f
            androidx.compose.animation.core.m0 r10 = androidx.compose.animation.core.C1972h.m8382g(r10)
            r11 = 0
            r13 = 0
            r18 = 6
            r22 = 0
            r28 = r10
            r29 = r11
            r30 = r13
            r32 = r18
            r33 = r22
            androidx.compose.animation.core.k0 r10 = androidx.compose.animation.core.C1972h.m8381f(r28, r29, r30, r32, r33)
            r11 = r15 | 432(0x1b0, float:6.05E-43)
            int r13 = r16 << 9
            r11 = r11 | r13
            r28 = r9
            r29 = r3
            r30 = r5
            r31 = r10
            r32 = r1
            r33 = r11
            androidx.compose.runtime.k2 r18 = androidx.compose.animation.core.InfiniteTransitionKt.m8036a(r28, r29, r30, r31, r32, r33)
            androidx.compose.ui.m r3 = androidx.compose.foundation.ProgressSemanticsKt.m9051a(r2)
            float r5 = f7761c
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10087C(r3, r5)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3 r5 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
            r9 = r5
            r10 = r20
            r13 = r4
            r14 = r6
            r16 = r0
            r9.<init>(r10, r12, r13, r14, r16, r17, r18, r19)
            r0 = 0
            androidx.compose.foundation.CanvasKt.m8873b(r3, r5, r1, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x023a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x023a:
            r14 = r35
            r12 = r20
        L_0x023e:
            androidx.compose.runtime.t1 r10 = r1.mo15020s()
            if (r10 != 0) goto L_0x0245
            goto L_0x0256
        L_0x0245:
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4 r11 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
            r0 = r11
            r1 = r2
            r2 = r6
            r5 = r12
            r7 = r14
            r8 = r36
            r9 = r37
            r0.<init>(r1, r2, r4, r5, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x0256:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m13705b(androidx.compose.ui.m, long, float, long, int, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m13706c(float r20, androidx.compose.p004ui.C8767m r21, long r22, float r24, androidx.compose.runtime.C8592o r25, int r26, int r27) {
        /*
            r6 = r26
            r0 = -409649739(0xffffffffe7953db5, float:-1.4095418E24)
            r1 = r25
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r27 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r6 | 6
            r3 = r2
            r2 = r20
            goto L_0x0029
        L_0x0015:
            r2 = r6 & 14
            if (r2 != 0) goto L_0x0026
            r2 = r20
            boolean r3 = r1.mo14968d(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r6
            goto L_0x0029
        L_0x0026:
            r2 = r20
            r3 = r6
        L_0x0029:
            r4 = r27 & 2
            if (r4 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0043
            r5 = r21
            boolean r7 = r1.mo15006n0(r5)
            if (r7 == 0) goto L_0x003f
            r7 = 32
            goto L_0x0041
        L_0x003f:
            r7 = 16
        L_0x0041:
            r3 = r3 | r7
            goto L_0x0045
        L_0x0043:
            r5 = r21
        L_0x0045:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005e
            r7 = r27 & 4
            if (r7 != 0) goto L_0x0058
            r7 = r22
            boolean r9 = r1.mo14980g(r7)
            if (r9 == 0) goto L_0x005a
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x0058:
            r7 = r22
        L_0x005a:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r3 = r3 | r9
            goto L_0x0060
        L_0x005e:
            r7 = r22
        L_0x0060:
            r9 = r27 & 8
            if (r9 == 0) goto L_0x0067
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x0067:
            r10 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007a
            r10 = r24
            boolean r11 = r1.mo14968d(r10)
            if (r11 == 0) goto L_0x0076
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r11
            goto L_0x007c
        L_0x007a:
            r10 = r24
        L_0x007c:
            r11 = r3 & 5851(0x16db, float:8.199E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 != r12) goto L_0x0092
            boolean r11 = r1.mo15011p()
            if (r11 != 0) goto L_0x0089
            goto L_0x0092
        L_0x0089:
            r1.mo14958a0()
            r4 = r5
            r18 = r7
            r5 = r10
            goto L_0x010d
        L_0x0092:
            r1.mo14930Q()
            r11 = r6 & 1
            if (r11 == 0) goto L_0x00ae
            boolean r11 = r1.mo14977f0()
            if (r11 == 0) goto L_0x00a0
            goto L_0x00ae
        L_0x00a0:
            r1.mo14958a0()
            r4 = r27 & 4
            if (r4 == 0) goto L_0x00a9
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a9:
            r4 = r5
        L_0x00aa:
            r18 = r7
            r5 = r10
            goto L_0x00cf
        L_0x00ae:
            if (r4 == 0) goto L_0x00b3
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00b4
        L_0x00b3:
            r4 = r5
        L_0x00b4:
            r5 = r27 & 4
            if (r5 == 0) goto L_0x00c5
            androidx.compose.material.t0 r5 = androidx.compose.material.C7933t0.f19075a
            r7 = 6
            androidx.compose.material.q r5 = r5.mo11075a(r1, r7)
            long r7 = r5.mo10971j()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c5:
            if (r9 == 0) goto L_0x00aa
            androidx.compose.material.y0 r5 = androidx.compose.material.C7948y0.f19132a
            float r5 = r5.mo11115b()
            r18 = r7
        L_0x00cf:
            r1.mo14899E()
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00de
            r7 = -1
            java.lang.String r8 = "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r7, r8)
        L_0x00de:
            androidx.compose.ui.graphics.j2$a r0 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r12 = r0.mo42850s()
            androidx.compose.ui.graphics.j4$a r0 = androidx.compose.p004ui.graphics.C15244j4.f37564b
            int r14 = r0.mo42862a()
            r0 = r3 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r7 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            r7 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r7
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r16 = r0 | r3
            r17 = 0
            r7 = r20
            r8 = r4
            r9 = r18
            r11 = r5
            r15 = r1
            m13704a(r7, r8, r9, r11, r12, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x010d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x010d:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x0114
            goto L_0x0126
        L_0x0114:
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$5 r9 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$5
            r0 = r9
            r1 = r20
            r2 = r4
            r3 = r18
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m13706c(float, androidx.compose.ui.m, long, float, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m13707d(androidx.compose.p004ui.C8767m r19, long r20, float r22, androidx.compose.runtime.C8592o r23, int r24, int r25) {
        /*
            r5 = r24
            r0 = -392089979(0xffffffffe8a12e85, float:-6.089273E24)
            r1 = r23
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r25 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r5 | 6
            r4 = r3
            r3 = r19
            goto L_0x0029
        L_0x0015:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r19
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r5
            goto L_0x0029
        L_0x0026:
            r3 = r19
            r4 = r5
        L_0x0029:
            r6 = r5 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0042
            r6 = r25 & 2
            if (r6 != 0) goto L_0x003c
            r6 = r20
            boolean r8 = r1.mo14980g(r6)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003c:
            r6 = r20
        L_0x003e:
            r8 = 16
        L_0x0040:
            r4 = r4 | r8
            goto L_0x0044
        L_0x0042:
            r6 = r20
        L_0x0044:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x004b
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004b:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005e
            r9 = r22
            boolean r10 = r1.mo14968d(r9)
            if (r10 == 0) goto L_0x005a
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r4 = r4 | r10
            goto L_0x0060
        L_0x005e:
            r9 = r22
        L_0x0060:
            r10 = r4 & 731(0x2db, float:1.024E-42)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0074
            boolean r10 = r1.mo15011p()
            if (r10 != 0) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            r1.mo14958a0()
            r2 = r3
            r3 = r6
            goto L_0x00f0
        L_0x0074:
            r1.mo14930Q()
            r10 = r5 & 1
            if (r10 == 0) goto L_0x0094
            boolean r10 = r1.mo14977f0()
            if (r10 == 0) goto L_0x0082
            goto L_0x0094
        L_0x0082:
            r1.mo14958a0()
            r2 = r25 & 2
            if (r2 == 0) goto L_0x008b
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x008b:
            r2 = r3
        L_0x008c:
            r16 = r9
        L_0x008e:
            r17 = r6
            r6 = r4
            r3 = r17
            goto L_0x00b6
        L_0x0094:
            if (r2 == 0) goto L_0x0099
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x009a
        L_0x0099:
            r2 = r3
        L_0x009a:
            r3 = r25 & 2
            if (r3 == 0) goto L_0x00ab
            androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
            r6 = 6
            androidx.compose.material.q r3 = r3.mo11075a(r1, r6)
            long r6 = r3.mo10971j()
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ab:
            if (r8 == 0) goto L_0x008c
            androidx.compose.material.y0 r3 = androidx.compose.material.C7948y0.f19132a
            float r3 = r3.mo11115b()
            r16 = r3
            goto L_0x008e
        L_0x00b6:
            r1.mo14899E()
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00c5
            r7 = -1
            java.lang.String r8 = "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:421)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r7, r8)
        L_0x00c5:
            androidx.compose.ui.graphics.j2$a r0 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r10 = r0.mo42850s()
            androidx.compose.ui.graphics.j4$a r0 = androidx.compose.p004ui.graphics.C15244j4.f37564b
            int r12 = r0.mo42864c()
            r0 = r6 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r7 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            r6 = r6 & 896(0x380, float:1.256E-42)
            r14 = r0 | r6
            r15 = 0
            r6 = r2
            r7 = r3
            r9 = r16
            r13 = r1
            m13705b(r6, r7, r9, r10, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00ee
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00ee:
            r9 = r16
        L_0x00f0:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x00f7
            goto L_0x0107
        L_0x00f7:
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$6 r8 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$6
            r0 = r8
            r1 = r2
            r2 = r3
            r4 = r9
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m13707d(androidx.compose.ui.m, long, float, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: e */
    public static final float m13708e(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: f */
    public static final float m13709f(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: g */
    public static final int m13710g(C8578k2<Integer> k2Var) {
        return k2Var.getValue().intValue();
    }

    /* renamed from: h */
    public static final float m13711h(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1} */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x020b, code lost:
        if (r4 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x020d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13712i(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, long r26, long r28, int r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r7 = r32
            r0 = 1501635280(0x598122d0, float:4.5435686E15)
            r1 = r31
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r33 & 1
            r4 = 2
            if (r2 == 0) goto L_0x0016
            r5 = r7 | 6
            r6 = r5
            r5 = r25
            goto L_0x002a
        L_0x0016:
            r5 = r7 & 14
            if (r5 != 0) goto L_0x0027
            r5 = r25
            boolean r6 = r1.mo15006n0(r5)
            if (r6 == 0) goto L_0x0024
            r6 = 4
            goto L_0x0025
        L_0x0024:
            r6 = r4
        L_0x0025:
            r6 = r6 | r7
            goto L_0x002a
        L_0x0027:
            r5 = r25
            r6 = r7
        L_0x002a:
            r8 = r7 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0043
            r8 = r33 & 2
            if (r8 != 0) goto L_0x003d
            r8 = r26
            boolean r10 = r1.mo14980g(r8)
            if (r10 == 0) goto L_0x003f
            r10 = 32
            goto L_0x0041
        L_0x003d:
            r8 = r26
        L_0x003f:
            r10 = 16
        L_0x0041:
            r6 = r6 | r10
            goto L_0x0045
        L_0x0043:
            r8 = r26
        L_0x0045:
            r10 = r7 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x005e
            r10 = r33 & 4
            if (r10 != 0) goto L_0x0058
            r10 = r28
            boolean r12 = r1.mo14980g(r10)
            if (r12 == 0) goto L_0x005a
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x0058:
            r10 = r28
        L_0x005a:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r6 = r6 | r12
            goto L_0x0060
        L_0x005e:
            r10 = r28
        L_0x0060:
            r12 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0079
            r12 = r33 & 8
            if (r12 != 0) goto L_0x0073
            r12 = r30
            boolean r13 = r1.mo14976f(r12)
            if (r13 == 0) goto L_0x0075
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0073:
            r12 = r30
        L_0x0075:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r6 = r6 | r13
            goto L_0x007b
        L_0x0079:
            r12 = r30
        L_0x007b:
            r6 = r6 & 5851(0x16db, float:8.199E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r6 != r13) goto L_0x0090
            boolean r6 = r1.mo15011p()
            if (r6 != 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            r1.mo14958a0()
            r2 = r5
        L_0x008c:
            r4 = r10
            r6 = r12
            goto L_0x022e
        L_0x0090:
            r1.mo14930Q()
            r6 = r7 & 1
            r13 = 6
            if (r6 == 0) goto L_0x00a4
            boolean r6 = r1.mo14977f0()
            if (r6 == 0) goto L_0x009f
            goto L_0x00a4
        L_0x009f:
            r1.mo14958a0()
            r2 = r5
            goto L_0x00db
        L_0x00a4:
            if (r2 == 0) goto L_0x00a9
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00aa
        L_0x00a9:
            r2 = r5
        L_0x00aa:
            r5 = r33 & 2
            if (r5 == 0) goto L_0x00b9
            androidx.compose.material.t0 r5 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r5 = r5.mo11075a(r1, r13)
            long r5 = r5.mo10971j()
            r8 = r5
        L_0x00b9:
            r5 = r33 & 4
            if (r5 == 0) goto L_0x00d0
            r16 = 1047904911(0x3e75c28f, float:0.24)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 14
            r21 = 0
            r14 = r8
            long r5 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r14, r16, r17, r18, r19, r20, r21)
            r10 = r5
        L_0x00d0:
            r5 = r33 & 8
            if (r5 == 0) goto L_0x00db
            androidx.compose.ui.graphics.j4$a r5 = androidx.compose.p004ui.graphics.C15244j4.f37564b
            int r5 = r5.mo42862a()
            r12 = r5
        L_0x00db:
            r1.mo14899E()
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x00ea
            r5 = -1
            java.lang.String r6 = "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:106)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r5, r6)
        L_0x00ea:
            r0 = 0
            androidx.compose.animation.core.InfiniteTransition r5 = androidx.compose.animation.core.InfiniteTransitionKt.m8040e(r1, r0)
            r6 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2 r15 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2.f7786f
            androidx.compose.animation.core.m0 r15 = androidx.compose.animation.core.C1972h.m8382g(r15)
            r16 = 0
            r17 = 0
            r19 = 6
            r20 = 0
            r25 = r15
            r26 = r16
            r27 = r17
            r29 = r19
            r30 = r20
            androidx.compose.animation.core.k0 r15 = androidx.compose.animation.core.C1972h.m8381f(r25, r26, r27, r29, r30)
            int r13 = androidx.compose.animation.core.InfiniteTransition.f5305f
            r3 = r13 | 432(0x1b0, float:6.05E-43)
            int r17 = androidx.compose.animation.core.C1984k0.f5527d
            int r18 = r17 << 9
            r3 = r3 | r18
            r25 = r5
            r26 = r6
            r27 = r14
            r28 = r15
            r29 = r1
            r30 = r3
            androidx.compose.runtime.k2 r20 = androidx.compose.animation.core.InfiniteTransitionKt.m8036a(r25, r26, r27, r28, r29, r30)
            r3 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2 r14 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2.f7787f
            androidx.compose.animation.core.m0 r14 = androidx.compose.animation.core.C1972h.m8382g(r14)
            r15 = 0
            r18 = 0
            r21 = 6
            r22 = 0
            r25 = r14
            r26 = r15
            r27 = r18
            r29 = r21
            r30 = r22
            androidx.compose.animation.core.k0 r14 = androidx.compose.animation.core.C1972h.m8381f(r25, r26, r27, r29, r30)
            r15 = r13 | 432(0x1b0, float:6.05E-43)
            int r18 = r17 << 9
            r15 = r15 | r18
            r25 = r5
            r26 = r3
            r27 = r6
            r28 = r14
            r29 = r1
            r30 = r15
            androidx.compose.runtime.k2 r21 = androidx.compose.animation.core.InfiniteTransitionKt.m8036a(r25, r26, r27, r28, r29, r30)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2 r14 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2.f7788f
            androidx.compose.animation.core.m0 r14 = androidx.compose.animation.core.C1972h.m8382g(r14)
            r15 = 0
            r18 = 0
            r22 = 6
            r23 = 0
            r25 = r14
            r26 = r15
            r27 = r18
            r29 = r22
            r30 = r23
            androidx.compose.animation.core.k0 r14 = androidx.compose.animation.core.C1972h.m8381f(r25, r26, r27, r29, r30)
            r15 = r13 | 432(0x1b0, float:6.05E-43)
            int r18 = r17 << 9
            r15 = r15 | r18
            r25 = r5
            r26 = r3
            r27 = r6
            r28 = r14
            r29 = r1
            r30 = r15
            androidx.compose.runtime.k2 r22 = androidx.compose.animation.core.InfiniteTransitionKt.m8036a(r25, r26, r27, r28, r29, r30)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2 r14 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2.f7789f
            androidx.compose.animation.core.m0 r14 = androidx.compose.animation.core.C1972h.m8382g(r14)
            r15 = 0
            r18 = 0
            r23 = 6
            r24 = 0
            r25 = r14
            r26 = r15
            r27 = r18
            r29 = r23
            r30 = r24
            androidx.compose.animation.core.k0 r14 = androidx.compose.animation.core.C1972h.m8381f(r25, r26, r27, r29, r30)
            r13 = r13 | 432(0x1b0, float:6.05E-43)
            int r15 = r17 << 9
            r13 = r13 | r15
            r25 = r5
            r26 = r3
            r27 = r6
            r28 = r14
            r29 = r1
            r30 = r13
            androidx.compose.runtime.k2 r23 = androidx.compose.animation.core.InfiniteTransitionKt.m8036a(r25, r26, r27, r28, r29, r30)
            androidx.compose.ui.m r3 = androidx.compose.foundation.ProgressSemanticsKt.m9051a(r2)
            float r5 = f7760b
            float r6 = f7759a
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10089E(r3, r5, r6)
            r5 = 7
            java.lang.Object[] r6 = new java.lang.Object[r5]
            androidx.compose.ui.graphics.j2 r13 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r10)
            r6[r0] = r13
            androidx.compose.ui.graphics.j4 r13 = androidx.compose.p004ui.graphics.C15244j4.m66126d(r12)
            r14 = 1
            r6[r14] = r13
            r6[r4] = r20
            r4 = 3
            r6[r4] = r21
            androidx.compose.ui.graphics.j2 r4 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r8)
            r13 = 4
            r6[r13] = r4
            r4 = 5
            r6[r4] = r22
            r4 = 6
            r6[r4] = r23
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r1.mo14918M(r4)
            r4 = r0
            r13 = r4
        L_0x01f3:
            if (r4 >= r5) goto L_0x01ff
            r14 = r6[r4]
            boolean r14 = r1.mo15006n0(r14)
            r13 = r13 | r14
            int r4 = r4 + 1
            goto L_0x01f3
        L_0x01ff:
            java.lang.Object r4 = r1.mo14921N()
            if (r13 != 0) goto L_0x020d
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r4 != r5) goto L_0x021b
        L_0x020d:
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1 r4 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
            r14 = r4
            r15 = r10
            r17 = r12
            r18 = r8
            r14.<init>(r15, r17, r18, r20, r21, r22, r23)
            r1.mo14893C(r4)
        L_0x021b:
            r1.mo15002m0()
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            androidx.compose.foundation.CanvasKt.m8873b(r3, r4, r1, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x008c
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x008c
        L_0x022e:
            androidx.compose.runtime.t1 r10 = r1.mo15020s()
            if (r10 != 0) goto L_0x0235
            goto L_0x0244
        L_0x0235:
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4 r11 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
            r0 = r11
            r1 = r2
            r2 = r8
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r10.mo15202a(r11)
        L_0x0244:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m13712i(androidx.compose.ui.m, long, long, int, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final /* synthetic */ void m13713j(C8767m mVar, long j, long j2, C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        long j3;
        long j4;
        long j5;
        C8767m mVar3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        C8592o o = oVar.mo15009o(-819397058);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i7 | 6;
            mVar2 = mVar;
        } else if ((i7 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            mVar2 = mVar;
            i3 = i7;
        }
        if ((i7 & 112) == 0) {
            j3 = j;
            if ((i2 & 2) != 0 || !o.mo14980g(j3)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i7 & 896) == 0) {
            j4 = j2;
            if ((i2 & 4) != 0 || !o.mo14980g(j4)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i3 |= i4;
        } else {
            j4 = j2;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            o.mo14930Q();
            if ((i7 & 1) == 0 || o.mo14977f0()) {
                if (i8 != 0) {
                    mVar3 = C8767m.f23478j;
                } else {
                    mVar3 = mVar2;
                }
                if ((i2 & 2) != 0) {
                    j3 = C7933t0.f19075a.mo11075a(o, 6).mo10971j();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    j4 = C15240j2.m66080w(j3, 0.24f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                    i3 &= -897;
                }
            } else {
                o.mo14958a0();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                mVar3 = mVar2;
            }
            int i9 = i3;
            j5 = j3;
            long j6 = j4;
            o.mo14899E();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-819397058, i9, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:205)");
            }
            m13712i(mVar3, j5, j6, C15244j4.f37564b.mo42862a(), o, (i9 & 14) | (i9 & 112) | (i9 & 896), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            j4 = j6;
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
            j5 = j3;
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ProgressIndicatorKt$LinearProgressIndicator$6(mVar3, j5, j4, i, i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: androidx.compose.ui.m$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1} */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0163, code lost:
        if (r4 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0165;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13714k(float r22, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r23, long r24, long r26, int r28, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r29, int r30, int r31) {
        /*
            r1 = r22
            r8 = r30
            r0 = -531984864(0xffffffffe04a8e20, float:-5.8382555E19)
            r2 = r29
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r31 & 1
            r4 = 2
            r5 = 4
            if (r3 == 0) goto L_0x0016
            r3 = r8 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.mo14968d(r1)
            if (r3 == 0) goto L_0x0022
            r3 = r5
            goto L_0x0023
        L_0x0022:
            r3 = r4
        L_0x0023:
            r3 = r3 | r8
            goto L_0x0026
        L_0x0025:
            r3 = r8
        L_0x0026:
            r6 = r31 & 2
            if (r6 == 0) goto L_0x002d
            r3 = r3 | 48
            goto L_0x0040
        L_0x002d:
            r7 = r8 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0040
            r7 = r23
            boolean r9 = r2.mo15006n0(r7)
            if (r9 == 0) goto L_0x003c
            r9 = 32
            goto L_0x003e
        L_0x003c:
            r9 = 16
        L_0x003e:
            r3 = r3 | r9
            goto L_0x0042
        L_0x0040:
            r7 = r23
        L_0x0042:
            r9 = r8 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005b
            r9 = r31 & 4
            if (r9 != 0) goto L_0x0055
            r9 = r24
            boolean r11 = r2.mo14980g(r9)
            if (r11 == 0) goto L_0x0057
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0055:
            r9 = r24
        L_0x0057:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r11
            goto L_0x005d
        L_0x005b:
            r9 = r24
        L_0x005d:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0076
            r11 = r31 & 8
            if (r11 != 0) goto L_0x0070
            r11 = r26
            boolean r13 = r2.mo14980g(r11)
            if (r13 == 0) goto L_0x0072
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0070:
            r11 = r26
        L_0x0072:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r3 = r3 | r13
            goto L_0x0078
        L_0x0076:
            r11 = r26
        L_0x0078:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r8
            if (r13 != 0) goto L_0x0093
            r13 = r31 & 16
            if (r13 != 0) goto L_0x008d
            r13 = r28
            boolean r14 = r2.mo14976f(r13)
            if (r14 == 0) goto L_0x008f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008d:
            r13 = r28
        L_0x008f:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r14
            goto L_0x0095
        L_0x0093:
            r13 = r28
        L_0x0095:
            r14 = 46811(0xb6db, float:6.5596E-41)
            r3 = r3 & r14
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r14) goto L_0x00ab
            boolean r3 = r2.mo15011p()
            if (r3 != 0) goto L_0x00a4
            goto L_0x00ab
        L_0x00a4:
            r2.mo14958a0()
        L_0x00a7:
            r3 = r9
            r5 = r11
            goto L_0x018a
        L_0x00ab:
            r2.mo14930Q()
            r3 = r8 & 1
            if (r3 == 0) goto L_0x00bd
            boolean r3 = r2.mo14977f0()
            if (r3 == 0) goto L_0x00b9
            goto L_0x00bd
        L_0x00b9:
            r2.mo14958a0()
            goto L_0x00f2
        L_0x00bd:
            if (r6 == 0) goto L_0x00c2
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r7 = r3
        L_0x00c2:
            r3 = r31 & 4
            if (r3 == 0) goto L_0x00d1
            androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
            r6 = 6
            androidx.compose.material.q r3 = r3.mo11075a(r2, r6)
            long r9 = r3.mo10971j()
        L_0x00d1:
            r3 = r31 & 8
            if (r3 == 0) goto L_0x00e7
            r16 = 1047904911(0x3e75c28f, float:0.24)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 14
            r21 = 0
            r14 = r9
            long r11 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r14, r16, r17, r18, r19, r20, r21)
        L_0x00e7:
            r3 = r31 & 16
            if (r3 == 0) goto L_0x00f2
            androidx.compose.ui.graphics.j4$a r3 = androidx.compose.p004ui.graphics.C15244j4.f37564b
            int r3 = r3.mo42862a()
            r13 = r3
        L_0x00f2:
            r2.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0101
            r3 = -1
            java.lang.String r6 = "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:72)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r3, r6)
        L_0x0101:
            r0 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = kotlin.ranges.C11479u.m44331H(r1, r0, r3)
            r3 = 0
            r6 = 0
            r14 = 6
            r15 = 0
            r23 = r7
            r24 = r0
            r25 = r3
            r26 = r6
            r27 = r14
            r28 = r15
            androidx.compose.ui.m r3 = androidx.compose.foundation.ProgressSemanticsKt.m9053c(r23, r24, r25, r26, r27, r28)
            float r6 = f7760b
            float r14 = f7759a
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10089E(r3, r6, r14)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            androidx.compose.ui.graphics.j2 r14 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r11)
            r15 = 0
            r6[r15] = r14
            androidx.compose.ui.graphics.j4 r14 = androidx.compose.p004ui.graphics.C15244j4.m66126d(r13)
            r16 = 1
            r6[r16] = r14
            java.lang.Float r14 = java.lang.Float.valueOf(r0)
            r6[r4] = r14
            r4 = 3
            androidx.compose.ui.graphics.j2 r14 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r9)
            r6[r4] = r14
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r2.mo14918M(r4)
            r4 = r15
            r14 = r4
        L_0x014a:
            if (r4 >= r5) goto L_0x0157
            r5 = r6[r4]
            boolean r5 = r2.mo15006n0(r5)
            r14 = r14 | r5
            int r4 = r4 + 1
            r5 = 4
            goto L_0x014a
        L_0x0157:
            java.lang.Object r4 = r2.mo14921N()
            if (r14 != 0) goto L_0x0165
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r4 != r5) goto L_0x0177
        L_0x0165:
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1 r4 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
            r23 = r4
            r24 = r11
            r26 = r13
            r27 = r0
            r28 = r9
            r23.<init>(r24, r26, r27, r28)
            r2.mo14893C(r4)
        L_0x0177:
            r2.mo15002m0()
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            androidx.compose.foundation.CanvasKt.m8873b(r3, r4, r2, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00a7
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x00a7
        L_0x018a:
            androidx.compose.runtime.t1 r10 = r2.mo15020s()
            if (r10 != 0) goto L_0x0191
            goto L_0x01a2
        L_0x0191:
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2 r11 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
            r0 = r11
            r1 = r22
            r2 = r7
            r7 = r13
            r8 = r30
            r9 = r31
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m13714k(float, androidx.compose.ui.m, long, long, int, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m13715l(float r20, androidx.compose.p004ui.C8767m r21, long r22, long r24, androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r7 = r27
            r0 = -850309746(0xffffffffcd514d8e, float:-2.19470048E8)
            r1 = r26
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r28 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r20
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 14
            if (r2 != 0) goto L_0x0026
            r2 = r20
            boolean r3 = r1.mo14968d(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r20
            r3 = r7
        L_0x0029:
            r4 = r28 & 2
            if (r4 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r5 = r7 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0043
            r5 = r21
            boolean r6 = r1.mo15006n0(r5)
            if (r6 == 0) goto L_0x003f
            r6 = 32
            goto L_0x0041
        L_0x003f:
            r6 = 16
        L_0x0041:
            r3 = r3 | r6
            goto L_0x0045
        L_0x0043:
            r5 = r21
        L_0x0045:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005c
            r6 = r28 & 4
            r8 = r22
            if (r6 != 0) goto L_0x0058
            boolean r6 = r1.mo14980g(r8)
            if (r6 == 0) goto L_0x0058
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r3 = r3 | r6
            goto L_0x005e
        L_0x005c:
            r8 = r22
        L_0x005e:
            r6 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0075
            r6 = r28 & 8
            r10 = r24
            if (r6 != 0) goto L_0x0071
            boolean r6 = r1.mo14980g(r10)
            if (r6 == 0) goto L_0x0071
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r6
            goto L_0x0077
        L_0x0075:
            r10 = r24
        L_0x0077:
            r6 = r3 & 5851(0x16db, float:8.199E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r6 != r12) goto L_0x008b
            boolean r6 = r1.mo15011p()
            if (r6 != 0) goto L_0x0084
            goto L_0x008b
        L_0x0084:
            r1.mo14958a0()
            r4 = r5
            r5 = r10
            goto L_0x0116
        L_0x008b:
            r1.mo14930Q()
            r6 = r7 & 1
            if (r6 == 0) goto L_0x00ab
            boolean r6 = r1.mo14977f0()
            if (r6 == 0) goto L_0x0099
            goto L_0x00ab
        L_0x0099:
            r1.mo14958a0()
            r4 = r28 & 4
            if (r4 == 0) goto L_0x00a2
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a2:
            r4 = r28 & 8
            if (r4 == 0) goto L_0x00a8
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00a8:
            r4 = r5
            r5 = r8
            goto L_0x00db
        L_0x00ab:
            if (r4 == 0) goto L_0x00b0
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00b1
        L_0x00b0:
            r4 = r5
        L_0x00b1:
            r5 = r28 & 4
            if (r5 == 0) goto L_0x00c3
            androidx.compose.material.t0 r5 = androidx.compose.material.C7933t0.f19075a
            r6 = 6
            androidx.compose.material.q r5 = r5.mo11075a(r1, r6)
            long r5 = r5.mo10971j()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00c4
        L_0x00c3:
            r5 = r8
        L_0x00c4:
            r8 = r28 & 8
            if (r8 == 0) goto L_0x00db
            r10 = 1047904911(0x3e75c28f, float:0.24)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 14
            r15 = 0
            r8 = r5
            long r8 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r8, r10, r11, r12, r13, r14, r15)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r18 = r8
            goto L_0x00dd
        L_0x00db:
            r18 = r10
        L_0x00dd:
            r1.mo14899E()
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x00ec
            r8 = -1
            java.lang.String r9 = "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:190)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r8, r9)
        L_0x00ec:
            androidx.compose.ui.graphics.j4$a r0 = androidx.compose.p004ui.graphics.C15244j4.f37564b
            int r14 = r0.mo42862a()
            r0 = r3 & 14
            r8 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r8
            r8 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r8
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r16 = r0 | r3
            r17 = 0
            r8 = r20
            r9 = r4
            r10 = r5
            r12 = r18
            r15 = r1
            m13714k(r8, r9, r10, r12, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0113
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0113:
            r8 = r5
            r5 = r18
        L_0x0116:
            androidx.compose.runtime.t1 r10 = r1.mo15020s()
            if (r10 != 0) goto L_0x011d
            goto L_0x012e
        L_0x011d:
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$5 r11 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$5
            r0 = r11
            r1 = r20
            r2 = r4
            r3 = r8
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r5, r7, r8)
            r10.mo15202a(r11)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m13715l(float, androidx.compose.ui.m, long, long, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: m */
    public static final float m13716m(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: n */
    public static final float m13717n(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: o */
    public static final float m13718o(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: p */
    public static final float m13719p(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }
}
