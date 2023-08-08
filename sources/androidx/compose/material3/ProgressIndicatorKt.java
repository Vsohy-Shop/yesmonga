package androidx.compose.material3;

import androidx.compose.animation.core.C2009t;
import androidx.compose.material3.tokens.C8296d0;
import androidx.compose.material3.tokens.C8298e;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
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

@C11363r0({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,612:1\n83#2,3:613\n83#2,3:622\n1114#3,6:616\n1114#3,6:625\n76#4:631\n76#4:632\n75#5,7:633\n92#5:641\n58#5:642\n154#6:640\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n*L\n85#1:613,3\n166#1:622,3\n85#1:616,6\n166#1:625,6\n296#1:631\n336#1:632\n487#1:633,7\n558#1:641\n558#1:642\n549#1:640\n*E\n"})
public final class ProgressIndicatorKt {

    /* renamed from: a */
    public static final float f19556a = C16483g.m74435M((float) C9527p.f26031b);

    /* renamed from: b */
    public static final float f19557b = C8296d0.f20901a.mo13347i();

    /* renamed from: c */
    public static final float f19558c;

    /* renamed from: d */
    public static final int f19559d = 1800;

    /* renamed from: e */
    public static final int f19560e = 750;

    /* renamed from: f */
    public static final int f19561f = 850;

    /* renamed from: g */
    public static final int f19562g = 567;

    /* renamed from: h */
    public static final int f19563h = 533;

    /* renamed from: i */
    public static final int f19564i = 0;

    /* renamed from: j */
    public static final int f19565j = 333;

    /* renamed from: k */
    public static final int f19566k = 1000;

    /* renamed from: l */
    public static final int f19567l = 1267;
    @C12579k

    /* renamed from: m */
    public static final C2009t f19568m = new C2009t(0.2f, 0.0f, 0.8f, 1.0f);
    @C12579k

    /* renamed from: n */
    public static final C2009t f19569n = new C2009t(0.4f, 0.0f, 1.0f, 1.0f);
    @C12579k

    /* renamed from: o */
    public static final C2009t f19570o = new C2009t(0.0f, 0.0f, 0.65f, 1.0f);
    @C12579k

    /* renamed from: p */
    public static final C2009t f19571p = new C2009t(0.1f, 0.0f, 0.45f, 1.0f);

    /* renamed from: q */
    public static final int f19572q = 5;

    /* renamed from: r */
    public static final int f19573r = 1332;

    /* renamed from: s */
    public static final float f19574s = -90.0f;

    /* renamed from: t */
    public static final float f19575t = 286.0f;

    /* renamed from: u */
    public static final float f19576u = 290.0f;

    /* renamed from: v */
    public static final float f19577v = 216.0f;

    /* renamed from: w */
    public static final int f19578w = 666;

    /* renamed from: x */
    public static final int f19579x = 666;
    @C12579k

    /* renamed from: y */
    public static final C2009t f19580y = new C2009t(0.4f, 0.0f, 0.2f, 1.0f);

    static {
        C8298e eVar = C8298e.f20970a;
        f19558c = C16483g.m74435M(eVar.mo13408h() - C16483g.m74435M(eVar.mo13402b() * ((float) 2)));
    }

    /* renamed from: A */
    public static final float m26033A() {
        return f19556a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26034a(float r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, long r20, float r22, long r23, int r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r1 = r18
            r9 = r27
            r0 = -1472321743(0xffffffffa83e2731, float:-1.0555617E-14)
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
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r9
            if (r11 != 0) goto L_0x0092
            r11 = r28 & 16
            if (r11 != 0) goto L_0x008c
            r11 = r23
            boolean r13 = r2.mo14980g(r11)
            if (r13 == 0) goto L_0x008e
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008c:
            r11 = r23
        L_0x008e:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r3 = r3 | r13
            goto L_0x0094
        L_0x0092:
            r11 = r23
        L_0x0094:
            r13 = r28 & 32
            if (r13 == 0) goto L_0x009c
            r14 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r14
            goto L_0x00b0
        L_0x009c:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00b0
            r14 = r25
            boolean r15 = r2.mo14976f(r14)
            if (r15 == 0) goto L_0x00ac
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r15
            goto L_0x00b2
        L_0x00b0:
            r14 = r25
        L_0x00b2:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r3 = r3 & r15
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r15) goto L_0x00ca
            boolean r3 = r2.mo15011p()
            if (r3 != 0) goto L_0x00c2
            goto L_0x00ca
        L_0x00c2:
            r2.mo14958a0()
        L_0x00c5:
            r3 = r6
            r6 = r11
            r8 = r14
            goto L_0x017c
        L_0x00ca:
            r2.mo14930Q()
            r3 = r9 & 1
            if (r3 == 0) goto L_0x00dc
            boolean r3 = r2.mo14977f0()
            if (r3 == 0) goto L_0x00d8
            goto L_0x00dc
        L_0x00d8:
            r2.mo14958a0()
            goto L_0x0109
        L_0x00dc:
            if (r4 == 0) goto L_0x00e1
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r5 = r3
        L_0x00e1:
            r3 = r28 & 4
            r4 = 6
            if (r3 == 0) goto L_0x00ec
            androidx.compose.material3.x1 r3 = androidx.compose.material3.C8368x1.f22469a
            long r6 = r3.mo14781a(r2, r4)
        L_0x00ec:
            if (r8 == 0) goto L_0x00f5
            androidx.compose.material3.x1 r3 = androidx.compose.material3.C8368x1.f22469a
            float r3 = r3.mo14784d()
            r10 = r3
        L_0x00f5:
            r3 = r28 & 16
            if (r3 == 0) goto L_0x0100
            androidx.compose.material3.x1 r3 = androidx.compose.material3.C8368x1.f22469a
            long r3 = r3.mo14785e(r2, r4)
            r11 = r3
        L_0x0100:
            if (r13 == 0) goto L_0x0109
            androidx.compose.material3.x1 r3 = androidx.compose.material3.C8368x1.f22469a
            int r3 = r3.mo14782b()
            r14 = r3
        L_0x0109:
            r2.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0118
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r3, r4)
        L_0x0118:
            r0 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = kotlin.ranges.C11479u.m44331H(r1, r0, r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r2.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.ui.graphics.drawscope.m r4 = new androidx.compose.ui.graphics.drawscope.m
            float r3 = r3.mo7425g5(r10)
            r8 = 0
            r13 = 0
            r15 = 0
            r16 = 26
            r17 = 0
            r19 = r4
            r20 = r3
            r21 = r8
            r22 = r14
            r23 = r13
            r24 = r15
            r25 = r16
            r26 = r17
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r3 = 0
            r8 = 0
            r13 = 6
            r19 = r5
            r20 = r0
            r21 = r3
            r22 = r8
            r23 = r13
            androidx.compose.ui.m r3 = androidx.compose.foundation.ProgressSemanticsKt.m9053c(r19, r20, r21, r22, r23, r24)
            float r8 = f19558c
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10087C(r3, r8)
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1 r8 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1
            r19 = r8
            r21 = r11
            r23 = r4
            r24 = r6
            r19.<init>(r20, r21, r23, r24)
            r0 = 0
            androidx.compose.foundation.CanvasKt.m8873b(r3, r8, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00c5
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x00c5
        L_0x017c:
            androidx.compose.runtime.t1 r11 = r2.mo15020s()
            if (r11 != 0) goto L_0x0183
            goto L_0x0194
        L_0x0183:
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2 r12 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2
            r0 = r12
            r1 = r18
            r2 = r5
            r5 = r10
            r9 = r27
            r10 = r28
            r0.<init>(r1, r2, r3, r5, r6, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m26034a(float, androidx.compose.ui.m, long, float, long, int, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26035b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, long r26, float r28, long r29, int r31, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r32, int r33, int r34) {
        /*
            r8 = r33
            r0 = -115871647(0xfffffffff917f061, float:-4.930702E34)
            r1 = r32
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r34 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0016
            r4 = r8 | 6
            r5 = r4
            r4 = r25
            goto L_0x002a
        L_0x0016:
            r4 = r8 & 14
            if (r4 != 0) goto L_0x0027
            r4 = r25
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
            r4 = r25
            r5 = r8
        L_0x002a:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0043
            r6 = r34 & 2
            if (r6 != 0) goto L_0x003d
            r6 = r26
            boolean r9 = r1.mo14980g(r6)
            if (r9 == 0) goto L_0x003f
            r9 = 32
            goto L_0x0041
        L_0x003d:
            r6 = r26
        L_0x003f:
            r9 = 16
        L_0x0041:
            r5 = r5 | r9
            goto L_0x0045
        L_0x0043:
            r6 = r26
        L_0x0045:
            r9 = r34 & 4
            if (r9 == 0) goto L_0x004c
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r10 = r8 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x005f
            r10 = r28
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
            r10 = r28
        L_0x0061:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007a
            r11 = r34 & 8
            if (r11 != 0) goto L_0x0074
            r11 = r29
            boolean r13 = r1.mo14980g(r11)
            if (r13 == 0) goto L_0x0076
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0074:
            r11 = r29
        L_0x0076:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r5 = r5 | r13
            goto L_0x007c
        L_0x007a:
            r11 = r29
        L_0x007c:
            r13 = r34 & 16
            if (r13 == 0) goto L_0x0083
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0098
        L_0x0083:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x0098
            r14 = r31
            boolean r15 = r1.mo14976f(r14)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r5 = r5 | r15
            goto L_0x009a
        L_0x0098:
            r14 = r31
        L_0x009a:
            r15 = 46811(0xb6db, float:6.5596E-41)
            r5 = r5 & r15
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r15) goto L_0x00b1
            boolean r5 = r1.mo15011p()
            if (r5 != 0) goto L_0x00a9
            goto L_0x00b1
        L_0x00a9:
            r1.mo14958a0()
            r2 = r6
            r5 = r11
            r7 = r14
            goto L_0x0257
        L_0x00b1:
            r1.mo14930Q()
            r5 = r8 & 1
            if (r5 == 0) goto L_0x00c8
            boolean r5 = r1.mo14977f0()
            if (r5 == 0) goto L_0x00bf
            goto L_0x00c8
        L_0x00bf:
            r1.mo14958a0()
            r2 = r4
        L_0x00c3:
            r4 = r10
            r20 = r11
            r5 = r14
            goto L_0x00f9
        L_0x00c8:
            if (r2 == 0) goto L_0x00cd
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00ce
        L_0x00cd:
            r2 = r4
        L_0x00ce:
            r4 = r34 & 2
            r5 = 6
            if (r4 == 0) goto L_0x00d9
            androidx.compose.material3.x1 r4 = androidx.compose.material3.C8368x1.f22469a
            long r6 = r4.mo14781a(r1, r5)
        L_0x00d9:
            if (r9 == 0) goto L_0x00e2
            androidx.compose.material3.x1 r4 = androidx.compose.material3.C8368x1.f22469a
            float r4 = r4.mo14784d()
            r10 = r4
        L_0x00e2:
            r4 = r34 & 8
            if (r4 == 0) goto L_0x00ed
            androidx.compose.material3.x1 r4 = androidx.compose.material3.C8368x1.f22469a
            long r4 = r4.mo14785e(r1, r5)
            r11 = r4
        L_0x00ed:
            if (r13 == 0) goto L_0x00c3
            androidx.compose.material3.x1 r4 = androidx.compose.material3.C8368x1.f22469a
            int r4 = r4.mo14783c()
            r5 = r4
            r4 = r10
            r20 = r11
        L_0x00f9:
            r1.mo14899E()
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0108
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:328)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r9, r10)
        L_0x0108:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r1.mo15032w(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.p004ui.unit.C16479d) r0
            androidx.compose.ui.graphics.drawscope.m r18 = new androidx.compose.ui.graphics.drawscope.m
            float r0 = r0.mo7425g5(r4)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 26
            r13 = 0
            r25 = r18
            r26 = r0
            r27 = r9
            r28 = r5
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r0 = 0
            r15 = 0
            r9 = 1
            androidx.compose.animation.core.InfiniteTransition r19 = androidx.compose.animation.core.InfiniteTransitionKt.m8041f(r0, r1, r15, r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r9 = 5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            kotlin.jvm.internal.c0 r9 = kotlin.jvm.internal.C11324c0.f28435a
            androidx.compose.animation.core.a1 r12 = androidx.compose.animation.core.VectorConvertersKt.m8225j(r9)
            r9 = 6660(0x1a04, float:9.333E-42)
            androidx.compose.animation.core.z r13 = androidx.compose.animation.core.C1947b0.m8291c()
            androidx.compose.animation.core.z0 r9 = androidx.compose.animation.core.C1972h.m8392q(r9, r15, r13, r3, r0)
            r13 = 0
            r16 = 0
            r14 = 6
            r22 = 0
            r25 = r9
            r26 = r13
            r27 = r16
            r29 = r14
            r30 = r22
            androidx.compose.animation.core.k0 r13 = androidx.compose.animation.core.C1972h.m8381f(r25, r26, r27, r29, r30)
            r14 = 0
            int r9 = androidx.compose.animation.core.InfiniteTransition.f5305f
            r15 = r9 | 4528(0x11b0, float:6.345E-42)
            int r22 = androidx.compose.animation.core.C1984k0.f5527d
            int r16 = r22 << 12
            r16 = r15 | r16
            r17 = 16
            r15 = r9
            r9 = r19
            r23 = r15
            r15 = r1
            androidx.compose.runtime.k2 r13 = androidx.compose.animation.core.InfiniteTransitionKt.m8039d(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9 = 0
            r10 = 1133445120(0x438f0000, float:286.0)
            r11 = 1332(0x534, float:1.867E-42)
            androidx.compose.animation.core.z r12 = androidx.compose.animation.core.C1947b0.m8291c()
            r15 = 0
            androidx.compose.animation.core.z0 r0 = androidx.compose.animation.core.C1972h.m8392q(r11, r15, r12, r3, r0)
            r3 = 0
            r11 = 0
            r14 = 6
            r16 = 0
            r25 = r0
            r26 = r3
            r27 = r11
            r29 = r14
            r30 = r16
            androidx.compose.animation.core.k0 r0 = androidx.compose.animation.core.C1972h.m8381f(r25, r26, r27, r29, r30)
            r11 = r23
            r12 = r11 | 432(0x1b0, float:6.05E-43)
            int r14 = r22 << 9
            r12 = r12 | r14
            r14 = 8
            r25 = r19
            r26 = r9
            r27 = r10
            r28 = r0
            r29 = r3
            r30 = r1
            r31 = r12
            r32 = r14
            androidx.compose.runtime.k2 r16 = androidx.compose.animation.core.InfiniteTransitionKt.m8037b(r25, r26, r27, r28, r29, r30, r31, r32)
            r0 = 0
            r3 = 1133576192(0x43910000, float:290.0)
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1 r9 = androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1.f19581f
            androidx.compose.animation.core.m0 r9 = androidx.compose.animation.core.C1972h.m8382g(r9)
            r10 = 0
            r23 = 0
            r12 = 6
            r14 = 0
            r25 = r9
            r26 = r10
            r27 = r23
            r29 = r12
            r30 = r14
            androidx.compose.animation.core.k0 r9 = androidx.compose.animation.core.C1972h.m8381f(r25, r26, r27, r29, r30)
            r12 = r11 | 432(0x1b0, float:6.05E-43)
            int r14 = r22 << 9
            r12 = r12 | r14
            r14 = 8
            r25 = r19
            r26 = r0
            r27 = r3
            r28 = r9
            r29 = r10
            r30 = r1
            r31 = r12
            r32 = r14
            androidx.compose.runtime.k2 r14 = androidx.compose.animation.core.InfiniteTransitionKt.m8037b(r25, r26, r27, r28, r29, r30, r31, r32)
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1 r9 = androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1.f19582f
            androidx.compose.animation.core.m0 r9 = androidx.compose.animation.core.C1972h.m8382g(r9)
            r12 = 6
            r17 = 0
            r25 = r9
            r26 = r10
            r27 = r23
            r29 = r12
            r30 = r17
            androidx.compose.animation.core.k0 r9 = androidx.compose.animation.core.C1972h.m8381f(r25, r26, r27, r29, r30)
            r11 = r11 | 432(0x1b0, float:6.05E-43)
            int r12 = r22 << 9
            r11 = r11 | r12
            r12 = 8
            r25 = r19
            r26 = r0
            r27 = r3
            r28 = r9
            r29 = r10
            r30 = r1
            r31 = r11
            r32 = r12
            androidx.compose.runtime.k2 r0 = androidx.compose.animation.core.InfiniteTransitionKt.m8037b(r25, r26, r27, r28, r29, r30, r31, r32)
            androidx.compose.ui.m r3 = androidx.compose.foundation.ProgressSemanticsKt.m9051a(r2)
            float r9 = f19558c
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10087C(r3, r9)
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3 r12 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
            r9 = r12
            r10 = r20
            r25 = r2
            r2 = r12
            r12 = r18
            r26 = r5
            r5 = r15
            r15 = r0
            r17 = r4
            r18 = r6
            r9.<init>(r10, r12, r13, r14, r15, r16, r17, r18)
            androidx.compose.foundation.CanvasKt.m8873b(r3, r2, r1, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x024f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x024f:
            r10 = r4
            r2 = r6
            r5 = r20
            r4 = r25
            r7 = r26
        L_0x0257:
            androidx.compose.runtime.t1 r11 = r1.mo15020s()
            if (r11 != 0) goto L_0x025e
            goto L_0x026d
        L_0x025e:
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4 r12 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4
            r0 = r12
            r1 = r4
            r4 = r10
            r8 = r33
            r9 = r34
            r0.<init>(r1, r2, r4, r5, r7, r8, r9)
            r11.mo15202a(r12)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m26035b(androidx.compose.ui.m, long, float, long, int, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m26036c(float r20, androidx.compose.p004ui.C8767m r21, long r22, float r24, androidx.compose.runtime.C8592o r25, int r26, int r27) {
        /*
            r6 = r26
            r0 = 402841196(0x1802de6c, float:1.69144E-24)
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
            goto L_0x0108
        L_0x0092:
            r1.mo14930Q()
            r11 = r6 & 1
            r12 = 6
            if (r11 == 0) goto L_0x00af
            boolean r11 = r1.mo14977f0()
            if (r11 == 0) goto L_0x00a1
            goto L_0x00af
        L_0x00a1:
            r1.mo14958a0()
            r4 = r27 & 4
            if (r4 == 0) goto L_0x00aa
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00aa:
            r4 = r5
        L_0x00ab:
            r18 = r7
            r5 = r10
            goto L_0x00cb
        L_0x00af:
            if (r4 == 0) goto L_0x00b4
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00b5
        L_0x00b4:
            r4 = r5
        L_0x00b5:
            r5 = r27 & 4
            if (r5 == 0) goto L_0x00c1
            androidx.compose.material3.x1 r5 = androidx.compose.material3.C8368x1.f22469a
            long r7 = r5.mo14781a(r1, r12)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c1:
            if (r9 == 0) goto L_0x00ab
            androidx.compose.material3.x1 r5 = androidx.compose.material3.C8368x1.f22469a
            float r5 = r5.mo14784d()
            r18 = r7
        L_0x00cb:
            r1.mo14899E()
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00da
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:412)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r7, r8)
        L_0x00da:
            androidx.compose.material3.x1 r0 = androidx.compose.material3.C8368x1.f22469a
            long r12 = r0.mo14785e(r1, r12)
            int r14 = r0.mo14782b()
            r0 = 196608(0x30000, float:2.75506E-40)
            r7 = r3 & 14
            r0 = r0 | r7
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
            m26034a(r7, r8, r9, r11, r12, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0108
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0108:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x010f
            goto L_0x0121
        L_0x010f:
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5 r9 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5
            r0 = r9
            r1 = r20
            r2 = r4
            r3 = r18
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m26036c(float, androidx.compose.ui.m, long, float, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m26037d(androidx.compose.p004ui.C8767m r19, long r20, float r22, androidx.compose.runtime.C8592o r23, int r24, int r25) {
        /*
            r5 = r24
            r0 = 947193756(0x3875079c, float:5.841964E-5)
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
            goto L_0x00ea
        L_0x0074:
            r1.mo14930Q()
            r10 = r5 & 1
            r11 = 6
            if (r10 == 0) goto L_0x0095
            boolean r10 = r1.mo14977f0()
            if (r10 == 0) goto L_0x0083
            goto L_0x0095
        L_0x0083:
            r1.mo14958a0()
            r2 = r25 & 2
            if (r2 == 0) goto L_0x008c
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x008c:
            r2 = r3
        L_0x008d:
            r16 = r9
        L_0x008f:
            r17 = r6
            r6 = r4
            r3 = r17
            goto L_0x00b2
        L_0x0095:
            if (r2 == 0) goto L_0x009a
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x009b
        L_0x009a:
            r2 = r3
        L_0x009b:
            r3 = r25 & 2
            if (r3 == 0) goto L_0x00a7
            androidx.compose.material3.x1 r3 = androidx.compose.material3.C8368x1.f22469a
            long r6 = r3.mo14781a(r1, r11)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a7:
            if (r8 == 0) goto L_0x008d
            androidx.compose.material3.x1 r3 = androidx.compose.material3.C8368x1.f22469a
            float r3 = r3.mo14784d()
            r16 = r3
            goto L_0x008f
        L_0x00b2:
            r1.mo14899E()
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00c1
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:428)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r7, r8)
        L_0x00c1:
            androidx.compose.material3.x1 r0 = androidx.compose.material3.C8368x1.f22469a
            long r10 = r0.mo14785e(r1, r11)
            int r12 = r0.mo14783c()
            r0 = r6 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r7 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            r6 = r6 & 896(0x380, float:1.256E-42)
            r14 = r0 | r6
            r15 = 0
            r6 = r2
            r7 = r3
            r9 = r16
            r13 = r1
            m26035b(r6, r7, r9, r10, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00e8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00e8:
            r9 = r16
        L_0x00ea:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x00f1
            goto L_0x0101
        L_0x00f1:
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6 r8 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6
            r0 = r8
            r1 = r2
            r2 = r3
            r4 = r9
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m26037d(androidx.compose.ui.m, long, float, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1} */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e8, code lost:
        if (r3 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x01ea;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d2 A[LOOP:0: B:70:0x01d0->B:71:0x01d2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26038e(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r29, long r30, long r32, int r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r7 = r36
            r0 = -476865359(0xffffffffe3939cb1, float:-5.4459244E21)
            r1 = r35
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r37 & 1
            if (r2 == 0) goto L_0x0015
            r5 = r7 | 6
            r6 = r5
            r5 = r29
            goto L_0x0029
        L_0x0015:
            r5 = r7 & 14
            if (r5 != 0) goto L_0x0026
            r5 = r29
            boolean r6 = r1.mo15006n0(r5)
            if (r6 == 0) goto L_0x0023
            r6 = 4
            goto L_0x0024
        L_0x0023:
            r6 = 2
        L_0x0024:
            r6 = r6 | r7
            goto L_0x0029
        L_0x0026:
            r5 = r29
            r6 = r7
        L_0x0029:
            r8 = r7 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0042
            r8 = r37 & 2
            if (r8 != 0) goto L_0x003c
            r8 = r30
            boolean r10 = r1.mo14980g(r8)
            if (r10 == 0) goto L_0x003e
            r10 = 32
            goto L_0x0040
        L_0x003c:
            r8 = r30
        L_0x003e:
            r10 = 16
        L_0x0040:
            r6 = r6 | r10
            goto L_0x0044
        L_0x0042:
            r8 = r30
        L_0x0044:
            r10 = r7 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x005d
            r10 = r37 & 4
            if (r10 != 0) goto L_0x0057
            r10 = r32
            boolean r12 = r1.mo14980g(r10)
            if (r12 == 0) goto L_0x0059
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r10 = r32
        L_0x0059:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r6 = r6 | r12
            goto L_0x005f
        L_0x005d:
            r10 = r32
        L_0x005f:
            r12 = r37 & 8
            if (r12 == 0) goto L_0x0066
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0066:
            r13 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x0079
            r13 = r34
            boolean r14 = r1.mo14976f(r13)
            if (r14 == 0) goto L_0x0075
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r6 = r6 | r14
            goto L_0x007b
        L_0x0079:
            r13 = r34
        L_0x007b:
            r6 = r6 & 5851(0x16db, float:8.199E-42)
            r14 = 1170(0x492, float:1.64E-42)
            if (r6 != r14) goto L_0x0090
            boolean r6 = r1.mo15011p()
            if (r6 != 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            r1.mo14958a0()
            r2 = r5
            r4 = r10
            r6 = r13
            goto L_0x0214
        L_0x0090:
            r1.mo14930Q()
            r6 = r7 & 1
            r15 = 6
            if (r6 == 0) goto L_0x00a9
            boolean r6 = r1.mo14977f0()
            if (r6 == 0) goto L_0x009f
            goto L_0x00a9
        L_0x009f:
            r1.mo14958a0()
            r2 = r5
        L_0x00a3:
            r5 = r8
            r26 = r10
            r28 = r13
            goto L_0x00d2
        L_0x00a9:
            if (r2 == 0) goto L_0x00ae
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00af
        L_0x00ae:
            r2 = r5
        L_0x00af:
            r5 = r37 & 2
            if (r5 == 0) goto L_0x00ba
            androidx.compose.material3.x1 r5 = androidx.compose.material3.C8368x1.f22469a
            long r5 = r5.mo14786f(r1, r15)
            r8 = r5
        L_0x00ba:
            r5 = r37 & 4
            if (r5 == 0) goto L_0x00c5
            androidx.compose.material3.x1 r5 = androidx.compose.material3.C8368x1.f22469a
            long r5 = r5.mo14788h(r1, r15)
            r10 = r5
        L_0x00c5:
            if (r12 == 0) goto L_0x00a3
            androidx.compose.material3.x1 r5 = androidx.compose.material3.C8368x1.f22469a
            int r5 = r5.mo14787g()
            r28 = r5
            r5 = r8
            r26 = r10
        L_0x00d2:
            r1.mo14899E()
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x00e1
            r8 = -1
            java.lang.String r9 = "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:107)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r8, r9)
        L_0x00e1:
            r0 = 0
            r14 = 0
            r13 = 1
            androidx.compose.animation.core.InfiniteTransition r0 = androidx.compose.animation.core.InfiniteTransitionKt.m8041f(r0, r1, r14, r13)
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1 r8 = androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1.f19583f
            androidx.compose.animation.core.m0 r8 = androidx.compose.animation.core.C1972h.m8382g(r8)
            r11 = 0
            r16 = 0
            r12 = 6
            r18 = 0
            r29 = r8
            r30 = r11
            r31 = r16
            r33 = r12
            r34 = r18
            androidx.compose.animation.core.k0 r11 = androidx.compose.animation.core.C1972h.m8381f(r29, r30, r31, r33, r34)
            r12 = 0
            int r8 = androidx.compose.animation.core.InfiniteTransition.f5305f
            r13 = r8 | 432(0x1b0, float:6.05E-43)
            int r16 = androidx.compose.animation.core.C1984k0.f5527d
            int r17 = r16 << 9
            r17 = r13 | r17
            r18 = 8
            r13 = r8
            r8 = r0
            r3 = r13
            r19 = 1
            r13 = r1
            r4 = r14
            r14 = r17
            r17 = r15
            r15 = r18
            androidx.compose.runtime.k2 r21 = androidx.compose.animation.core.InfiniteTransitionKt.m8037b(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1 r8 = androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1.f19584f
            androidx.compose.animation.core.m0 r8 = androidx.compose.animation.core.C1972h.m8382g(r8)
            r11 = 0
            r12 = 0
            r14 = 6
            r15 = 0
            r29 = r8
            r30 = r11
            r31 = r12
            r33 = r14
            r34 = r15
            androidx.compose.animation.core.k0 r11 = androidx.compose.animation.core.C1972h.m8381f(r29, r30, r31, r33, r34)
            r12 = 0
            r8 = r3 | 432(0x1b0, float:6.05E-43)
            int r13 = r16 << 9
            r14 = r8 | r13
            r15 = 8
            r8 = r0
            r13 = r1
            androidx.compose.runtime.k2 r22 = androidx.compose.animation.core.InfiniteTransitionKt.m8037b(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1 r8 = androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1.f19585f
            androidx.compose.animation.core.m0 r8 = androidx.compose.animation.core.C1972h.m8382g(r8)
            r11 = 0
            r12 = 0
            r14 = 6
            r15 = 0
            r29 = r8
            r30 = r11
            r31 = r12
            r33 = r14
            r34 = r15
            androidx.compose.animation.core.k0 r11 = androidx.compose.animation.core.C1972h.m8381f(r29, r30, r31, r33, r34)
            r12 = 0
            r8 = r3 | 432(0x1b0, float:6.05E-43)
            int r13 = r16 << 9
            r14 = r8 | r13
            r15 = 8
            r8 = r0
            r13 = r1
            androidx.compose.runtime.k2 r24 = androidx.compose.animation.core.InfiniteTransitionKt.m8037b(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1 r8 = androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1.f19586f
            androidx.compose.animation.core.m0 r8 = androidx.compose.animation.core.C1972h.m8382g(r8)
            r11 = 0
            r12 = 0
            r14 = 6
            r15 = 0
            r29 = r8
            r30 = r11
            r31 = r12
            r33 = r14
            r34 = r15
            androidx.compose.animation.core.k0 r11 = androidx.compose.animation.core.C1972h.m8381f(r29, r30, r31, r33, r34)
            r12 = 0
            r3 = r3 | 432(0x1b0, float:6.05E-43)
            int r8 = r16 << 9
            r14 = r3 | r8
            r15 = 8
            r8 = r0
            r13 = r1
            androidx.compose.runtime.k2 r25 = androidx.compose.animation.core.InfiniteTransitionKt.m8037b(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.ui.m r0 = androidx.compose.foundation.ProgressSemanticsKt.m9051a(r2)
            float r3 = f19556a
            float r8 = f19557b
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10089E(r0, r3, r8)
            r3 = 7
            java.lang.Object[] r8 = new java.lang.Object[r3]
            androidx.compose.ui.graphics.j2 r9 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r26)
            r8[r4] = r9
            androidx.compose.ui.graphics.j4 r9 = androidx.compose.p004ui.graphics.C15244j4.m66126d(r28)
            r8[r19] = r9
            r9 = 2
            r8[r9] = r21
            r9 = 3
            r8[r9] = r22
            androidx.compose.ui.graphics.j2 r9 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r5)
            r10 = 4
            r8[r10] = r9
            r9 = 5
            r8[r9] = r24
            r8[r17] = r25
            r9 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r1.mo14918M(r9)
            r9 = r4
            r14 = r9
        L_0x01d0:
            if (r14 >= r3) goto L_0x01dc
            r10 = r8[r14]
            boolean r10 = r1.mo15006n0(r10)
            r9 = r9 | r10
            int r14 = r14 + 1
            goto L_0x01d0
        L_0x01dc:
            java.lang.Object r3 = r1.mo14921N()
            if (r9 != 0) goto L_0x01ea
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r3 != r8) goto L_0x01fe
        L_0x01ea:
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1 r3 = new androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
            r16 = r3
            r17 = r26
            r19 = r28
            r20 = r21
            r21 = r22
            r22 = r5
            r16.<init>(r17, r19, r20, r21, r22, r24, r25)
            r1.mo14893C(r3)
        L_0x01fe:
            r1.mo15002m0()
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            androidx.compose.foundation.CanvasKt.m8873b(r0, r3, r1, r4)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x020f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x020f:
            r8 = r5
            r4 = r26
            r6 = r28
        L_0x0214:
            androidx.compose.runtime.t1 r10 = r1.mo15020s()
            if (r10 != 0) goto L_0x021b
            goto L_0x022a
        L_0x021b:
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4 r11 = new androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4
            r0 = r11
            r1 = r2
            r2 = r8
            r7 = r36
            r8 = r37
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r10.mo15202a(r11)
        L_0x022a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m26038e(androidx.compose.ui.m, long, long, int, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final /* synthetic */ void m26039f(C8767m mVar, long j, long j2, C8592o oVar, int i, int i2) {
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
        C8592o o = oVar.mo15009o(585576195);
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
                    j3 = C8368x1.f22469a.mo14786f(o, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    j4 = C8368x1.f22469a.mo14788h(o, 6);
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
                ComposerKt.m29845w0(585576195, i9, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:206)");
            }
            m26038e(mVar3, j5, j6, C8368x1.f22469a.mo14787g(), o, (i9 & 14) | 3072 | (i9 & 112) | (i9 & 896), 0);
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1} */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0152, code lost:
        if (r4 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0154;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26040g(float r17, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r18, long r19, long r21, int r23, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r24, int r25, int r26) {
        /*
            r1 = r17
            r8 = r25
            r0 = 905419617(0x35f79b61, float:1.8448155E-6)
            r2 = r24
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r26 & 1
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
            r6 = r26 & 2
            if (r6 == 0) goto L_0x002d
            r3 = r3 | 48
            goto L_0x0040
        L_0x002d:
            r7 = r8 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0040
            r7 = r18
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
            r7 = r18
        L_0x0042:
            r9 = r8 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005b
            r9 = r26 & 4
            if (r9 != 0) goto L_0x0055
            r9 = r19
            boolean r11 = r2.mo14980g(r9)
            if (r11 == 0) goto L_0x0057
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0055:
            r9 = r19
        L_0x0057:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r11
            goto L_0x005d
        L_0x005b:
            r9 = r19
        L_0x005d:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0076
            r11 = r26 & 8
            if (r11 != 0) goto L_0x0070
            r11 = r21
            boolean r13 = r2.mo14980g(r11)
            if (r13 == 0) goto L_0x0072
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0070:
            r11 = r21
        L_0x0072:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r3 = r3 | r13
            goto L_0x0078
        L_0x0076:
            r11 = r21
        L_0x0078:
            r13 = r26 & 16
            if (r13 == 0) goto L_0x007f
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0094
        L_0x007f:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x0094
            r14 = r23
            boolean r15 = r2.mo14976f(r14)
            if (r15 == 0) goto L_0x0090
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r3 = r3 | r15
            goto L_0x0096
        L_0x0094:
            r14 = r23
        L_0x0096:
            r15 = 46811(0xb6db, float:6.5596E-41)
            r3 = r3 & r15
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r15) goto L_0x00ac
            boolean r3 = r2.mo15011p()
            if (r3 != 0) goto L_0x00a5
            goto L_0x00ac
        L_0x00a5:
            r2.mo14958a0()
        L_0x00a8:
            r3 = r9
            r5 = r11
            goto L_0x0179
        L_0x00ac:
            r2.mo14930Q()
            r3 = r8 & 1
            if (r3 == 0) goto L_0x00be
            boolean r3 = r2.mo14977f0()
            if (r3 == 0) goto L_0x00ba
            goto L_0x00be
        L_0x00ba:
            r2.mo14958a0()
            goto L_0x00e1
        L_0x00be:
            if (r6 == 0) goto L_0x00c3
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r7 = r3
        L_0x00c3:
            r3 = r26 & 4
            r6 = 6
            if (r3 == 0) goto L_0x00ce
            androidx.compose.material3.x1 r3 = androidx.compose.material3.C8368x1.f22469a
            long r9 = r3.mo14786f(r2, r6)
        L_0x00ce:
            r3 = r26 & 8
            if (r3 == 0) goto L_0x00d8
            androidx.compose.material3.x1 r3 = androidx.compose.material3.C8368x1.f22469a
            long r11 = r3.mo14788h(r2, r6)
        L_0x00d8:
            if (r13 == 0) goto L_0x00e1
            androidx.compose.material3.x1 r3 = androidx.compose.material3.C8368x1.f22469a
            int r3 = r3.mo14787g()
            r14 = r3
        L_0x00e1:
            r2.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x00f0
            r3 = -1
            java.lang.String r6 = "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:72)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r3, r6)
        L_0x00f0:
            r0 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = kotlin.ranges.C11479u.m44331H(r1, r0, r3)
            r3 = 0
            r6 = 0
            r13 = 6
            r15 = 0
            r18 = r7
            r19 = r0
            r20 = r3
            r21 = r6
            r22 = r13
            r23 = r15
            androidx.compose.ui.m r3 = androidx.compose.foundation.ProgressSemanticsKt.m9053c(r18, r19, r20, r21, r22, r23)
            float r6 = f19556a
            float r13 = f19557b
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10089E(r3, r6, r13)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            androidx.compose.ui.graphics.j2 r13 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r11)
            r15 = 0
            r6[r15] = r13
            androidx.compose.ui.graphics.j4 r13 = androidx.compose.p004ui.graphics.C15244j4.m66126d(r14)
            r16 = 1
            r6[r16] = r13
            java.lang.Float r13 = java.lang.Float.valueOf(r0)
            r6[r4] = r13
            r4 = 3
            androidx.compose.ui.graphics.j2 r13 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r9)
            r6[r4] = r13
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r2.mo14918M(r4)
            r4 = r15
            r13 = r4
        L_0x0139:
            if (r4 >= r5) goto L_0x0146
            r5 = r6[r4]
            boolean r5 = r2.mo15006n0(r5)
            r13 = r13 | r5
            int r4 = r4 + 1
            r5 = 4
            goto L_0x0139
        L_0x0146:
            java.lang.Object r4 = r2.mo14921N()
            if (r13 != 0) goto L_0x0154
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r4 != r5) goto L_0x0166
        L_0x0154:
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1 r4 = new androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
            r18 = r4
            r19 = r11
            r21 = r14
            r22 = r0
            r23 = r9
            r18.<init>(r19, r21, r22, r23)
            r2.mo14893C(r4)
        L_0x0166:
            r2.mo15002m0()
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            androidx.compose.foundation.CanvasKt.m8873b(r3, r4, r2, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00a8
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x00a8
        L_0x0179:
            androidx.compose.runtime.t1 r10 = r2.mo15020s()
            if (r10 != 0) goto L_0x0180
            goto L_0x0191
        L_0x0180:
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2 r11 = new androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2
            r0 = r11
            r1 = r17
            r2 = r7
            r7 = r14
            r8 = r25
            r9 = r26
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m26040g(float, androidx.compose.ui.m, long, long, int, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m26041h(float r20, androidx.compose.p004ui.C8767m r21, long r22, long r24, androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r7 = r27
            r0 = -372717133(0xffffffffe9c8c9b3, float:-3.0342208E25)
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
            goto L_0x010b
        L_0x008b:
            r1.mo14930Q()
            r6 = r7 & 1
            if (r6 == 0) goto L_0x00aa
            boolean r6 = r1.mo14977f0()
            if (r6 == 0) goto L_0x0099
            goto L_0x00aa
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
            goto L_0x00cd
        L_0x00aa:
            if (r4 == 0) goto L_0x00af
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00b0
        L_0x00af:
            r4 = r5
        L_0x00b0:
            r5 = r28 & 4
            r6 = 6
            if (r5 == 0) goto L_0x00bd
            androidx.compose.material3.x1 r5 = androidx.compose.material3.C8368x1.f22469a
            long r8 = r5.mo14786f(r1, r6)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00bd:
            r5 = r28 & 8
            if (r5 == 0) goto L_0x00cd
            androidx.compose.material3.x1 r5 = androidx.compose.material3.C8368x1.f22469a
            long r5 = r5.mo14788h(r1, r6)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r18 = r5
            r5 = r8
            goto L_0x00d0
        L_0x00cd:
            r5 = r8
            r18 = r10
        L_0x00d0:
            r1.mo14899E()
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x00df
            r8 = -1
            java.lang.String r9 = "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:191)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r8, r9)
        L_0x00df:
            androidx.compose.material3.x1 r0 = androidx.compose.material3.C8368x1.f22469a
            int r14 = r0.mo14787g()
            r0 = r3 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
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
            m26040g(r8, r9, r10, r12, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0108
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0108:
            r8 = r5
            r5 = r18
        L_0x010b:
            androidx.compose.runtime.t1 r10 = r1.mo15020s()
            if (r10 != 0) goto L_0x0112
            goto L_0x0123
        L_0x0112:
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5 r11 = new androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
            r0 = r11
            r1 = r20
            r2 = r4
            r3 = r8
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r5, r7, r8)
            r10.mo15202a(r11)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m26041h(float, androidx.compose.ui.m, long, long, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: s */
    public static final void m26052s(C15187e eVar, float f, float f2, long j, C15198m mVar) {
        float f3 = (float) 2;
        float g = mVar.mo42726g() / f3;
        float t = C15104m.m65023t(eVar.mo42718b()) - (f3 * g);
        C15187e.m65724z2(eVar, j, f, f2, false, C15096g.m64898a(g, g), C15106n.m65033a(t, t), 0.0f, mVar, (C15249k2) null, 0, 832, (Object) null);
    }

    /* renamed from: t */
    public static final void m26053t(C15187e eVar, long j, C15198m mVar) {
        m26052s(eVar, 0.0f, 360.0f, j, mVar);
    }

    /* renamed from: u */
    public static final void m26054u(C15187e eVar, float f, float f2, long j, C15198m mVar) {
        m26052s(eVar, f, f2, j, mVar);
    }

    /* renamed from: v */
    public static final void m26055v(C15187e eVar, float f, float f2, float f3, long j, C15198m mVar) {
        float f4;
        if (C15244j4.m66129g(mVar.mo42721c(), C15244j4.f37564b.mo42862a())) {
            f4 = 0.0f;
        } else {
            f4 = ((f2 / C16483g.m74435M(f19558c / ((float) 2))) * 57.29578f) / 2.0f;
        }
        m26052s(eVar, f + f4, Math.max(f3, 0.1f), j, mVar);
    }

    /* renamed from: w */
    public static final void m26056w(C15187e eVar, float f, float f2, long j, float f3, int i) {
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

    /* renamed from: x */
    public static final void m26057x(C15187e eVar, long j, float f, int i) {
        m26056w(eVar, 0.0f, 1.0f, j, f, i);
    }

    /* renamed from: y */
    public static final float m26058y() {
        return f19558c;
    }

    /* renamed from: z */
    public static final float m26059z() {
        return f19557b;
    }
}
