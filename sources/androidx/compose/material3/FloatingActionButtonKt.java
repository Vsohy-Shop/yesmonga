package androidx.compose.material3;

import androidx.compose.animation.C2025e;
import androidx.compose.animation.C2028g;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.material3.tokens.C8305g0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,619:1\n25#2:620\n25#2:627\n25#2:634\n25#2:641\n25#2:648\n1114#3,6:621\n1114#3,6:628\n1114#3,6:635\n1114#3,6:642\n1114#3,6:649\n154#4:655\n154#4:656\n154#4:657\n154#4:658\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n*L\n103#1:620\n171#1:627\n223#1:634\n278#1:641\n348#1:648\n103#1:621,6\n171#1:628,6\n223#1:635,6\n278#1:642,6\n348#1:649,6\n585#1:655\n587#1:656\n589#1:657\n591#1:658\n*E\n"})
public final class FloatingActionButtonKt {

    /* renamed from: a */
    public static final float f19428a = C16483g.m74435M((float) 16);

    /* renamed from: b */
    public static final float f19429b = C16483g.m74435M((float) 12);

    /* renamed from: c */
    public static final float f19430c = C16483g.m74435M((float) 20);

    /* renamed from: d */
    public static final float f19431d = C16483g.m74435M((float) 80);
    @C12579k

    /* renamed from: e */
    public static final C2028g f19432e;
    @C12579k

    /* renamed from: f */
    public static final C2025e f19433f;

    static {
        C8305g0 g0Var = C8305g0.f21174a;
        C2028g x = EnterExitTransitionKt.m7844x(C1972h.m8392q(100, 0, g0Var.mo13598g(), 2, (Object) null), 0.0f, 2, (Object) null);
        C2023z0 q = C1972h.m8392q(500, 0, g0Var.mo13593b(), 2, (Object) null);
        C8734c.C8735a aVar = C8734c.f23406a;
        f19432e = x.mo7029c(EnterExitTransitionKt.m7801E(q, aVar.mo17072u(), false, (C11300l) null, 12, (Object) null));
        f19433f = EnterExitTransitionKt.m7842v(C1972h.m8391p(200, 100, g0Var.mo13598g()), 0.0f, 2, (Object) null).mo7023c(EnterExitTransitionKt.m7836p(C1972h.m8392q(500, 0, g0Var.mo13593b(), 2, (Object) null), aVar.mo17072u(), false, (C11300l) null, 12, (Object) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0120  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25803a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r34, boolean r35, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r36, long r37, long r39, @org.jetbrains.annotations.C12580l androidx.compose.material3.FloatingActionButtonElevation r41, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r42, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r43, int r44, int r45) {
        /*
            r1 = r31
            r2 = r32
            r0 = r33
            r15 = r44
            r14 = r45
            java.lang.String r3 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "icon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r3 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = -1387401842(0xffffffffad4ded8e, float:-1.1705649E-11)
            r4 = r43
            androidx.compose.runtime.o r13 = r4.mo15009o(r3)
            r4 = r14 & 1
            if (r4 == 0) goto L_0x0029
            r4 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r4 = r15 & 14
            if (r4 != 0) goto L_0x0038
            boolean r4 = r13.mo14927P(r1)
            if (r4 == 0) goto L_0x0035
            r4 = 4
            goto L_0x0036
        L_0x0035:
            r4 = 2
        L_0x0036:
            r4 = r4 | r15
            goto L_0x0039
        L_0x0038:
            r4 = r15
        L_0x0039:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0040
            r4 = r4 | 48
            goto L_0x0050
        L_0x0040:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0050
            boolean r5 = r13.mo14927P(r2)
            if (r5 == 0) goto L_0x004d
            r5 = 32
            goto L_0x004f
        L_0x004d:
            r5 = 16
        L_0x004f:
            r4 = r4 | r5
        L_0x0050:
            r5 = r14 & 4
            if (r5 == 0) goto L_0x0057
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r5 = r15 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            boolean r5 = r13.mo14927P(r0)
            if (r5 == 0) goto L_0x0064
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r5
        L_0x0067:
            r5 = r14 & 8
            if (r5 == 0) goto L_0x006e
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r6 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0081
            r6 = r34
            boolean r7 = r13.mo15006n0(r6)
            if (r7 == 0) goto L_0x007d
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r4 = r4 | r7
            goto L_0x0083
        L_0x0081:
            r6 = r34
        L_0x0083:
            r7 = r14 & 16
            r8 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x008d
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008d:
            r9 = r15 & r8
            if (r9 != 0) goto L_0x00a0
            r9 = r35
            boolean r10 = r13.mo14961b(r9)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r4 = r4 | r10
            goto L_0x00a2
        L_0x00a0:
            r9 = r35
        L_0x00a2:
            r10 = 458752(0x70000, float:6.42848E-40)
            r11 = r15 & r10
            if (r11 != 0) goto L_0x00bd
            r11 = r14 & 32
            if (r11 != 0) goto L_0x00b7
            r11 = r36
            boolean r12 = r13.mo15006n0(r11)
            if (r12 == 0) goto L_0x00b9
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b7:
            r11 = r36
        L_0x00b9:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r4 = r4 | r12
            goto L_0x00bf
        L_0x00bd:
            r11 = r36
        L_0x00bf:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r16 = r15 & r12
            if (r16 != 0) goto L_0x00d9
            r16 = r14 & 64
            r10 = r37
            if (r16 != 0) goto L_0x00d4
            boolean r16 = r13.mo14980g(r10)
            if (r16 == 0) goto L_0x00d4
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d4:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r4 = r4 | r16
            goto L_0x00db
        L_0x00d9:
            r10 = r37
        L_0x00db:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00f5
            r12 = r14 & 128(0x80, float:1.794E-43)
            r8 = r39
            if (r12 != 0) goto L_0x00f0
            boolean r17 = r13.mo14980g(r8)
            if (r17 == 0) goto L_0x00f0
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r4 = r4 | r17
            goto L_0x00f7
        L_0x00f5:
            r8 = r39
        L_0x00f7:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r15 & r17
            if (r17 != 0) goto L_0x0113
            r12 = r14 & 256(0x100, float:3.59E-43)
            if (r12 != 0) goto L_0x010c
            r12 = r41
            boolean r18 = r13.mo15006n0(r12)
            if (r18 == 0) goto L_0x010e
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0110
        L_0x010c:
            r12 = r41
        L_0x010e:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0110:
            r4 = r4 | r18
            goto L_0x0115
        L_0x0113:
            r12 = r41
        L_0x0115:
            r3 = r14 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0120
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r4 = r4 | r19
            r0 = r42
            goto L_0x0135
        L_0x0120:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r15 & r19
            r0 = r42
            if (r19 != 0) goto L_0x0135
            boolean r19 = r13.mo15006n0(r0)
            if (r19 == 0) goto L_0x0131
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x0131:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r4 = r4 | r19
        L_0x0135:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r4 & r19
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r6) goto L_0x015e
            boolean r0 = r13.mo15011p()
            if (r0 != 0) goto L_0x0146
            goto L_0x015e
        L_0x0146:
            r13.mo14958a0()
            r4 = r34
            r5 = r35
            r6 = r36
            r18 = r13
            r28 = r12
            r12 = r42
            r29 = r10
            r11 = r28
            r9 = r8
            r7 = r29
            goto L_0x02a3
        L_0x015e:
            r13.mo14930Q()
            r0 = r15 & 1
            r19 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r20 = -3670017(0xffffffffffc7ffff, float:NaN)
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x01a2
            boolean r0 = r13.mo14977f0()
            if (r0 == 0) goto L_0x0175
            goto L_0x01a2
        L_0x0175:
            r13.mo14958a0()
            r0 = r14 & 32
            if (r0 == 0) goto L_0x017e
            r4 = r4 & r21
        L_0x017e:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0184
            r4 = r4 & r20
        L_0x0184:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x018a
            r4 = r4 & r19
        L_0x018a:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0192
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = r4 & r0
        L_0x0192:
            r0 = r34
            r19 = r36
            r26 = r42
            r24 = r8
            r20 = r10
            r22 = r12
            r12 = r35
            goto L_0x0232
        L_0x01a2:
            if (r5 == 0) goto L_0x01a7
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x01a9
        L_0x01a7:
            r0 = r34
        L_0x01a9:
            if (r7 == 0) goto L_0x01ad
            r5 = 1
            goto L_0x01af
        L_0x01ad:
            r5 = r35
        L_0x01af:
            r7 = r14 & 32
            r6 = 6
            if (r7 == 0) goto L_0x01bd
            androidx.compose.material3.u0 r7 = androidx.compose.material3.C8355u0.f22430a
            androidx.compose.ui.graphics.g4 r7 = r7.mo14722e(r13, r6)
            r4 = r4 & r21
            goto L_0x01bf
        L_0x01bd:
            r7 = r36
        L_0x01bf:
            r21 = r14 & 64
            if (r21 == 0) goto L_0x01cb
            androidx.compose.material3.u0 r10 = androidx.compose.material3.C8355u0.f22430a
            long r10 = r10.mo14721d(r13, r6)
            r4 = r4 & r20
        L_0x01cb:
            r6 = r14 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x01d9
            int r6 = r4 >> 18
            r6 = r6 & 14
            long r8 = androidx.compose.material3.ColorSchemeKt.m25516c(r10, r13, r6)
            r4 = r4 & r19
        L_0x01d9:
            r6 = r14 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0203
            androidx.compose.material3.u0 r6 = androidx.compose.material3.C8355u0.f22430a
            r12 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r25 = 15
            r34 = r6
            r35 = r12
            r36 = r19
            r37 = r20
            r38 = r21
            r39 = r13
            r40 = r24
            r41 = r25
            androidx.compose.material3.FloatingActionButtonElevation r6 = r34.mo14720c(r35, r36, r37, r38, r39, r40, r41)
            r12 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = r4 & r12
            goto L_0x0204
        L_0x0203:
            r6 = r12
        L_0x0204:
            if (r3 == 0) goto L_0x0227
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo14918M(r3)
            java.lang.Object r3 = r13.mo14921N()
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r3 != r12) goto L_0x021f
            androidx.compose.foundation.interaction.g r3 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r13.mo14893C(r3)
        L_0x021f:
            r13.mo15002m0()
            androidx.compose.foundation.interaction.g r3 = (androidx.compose.foundation.interaction.C2243g) r3
            r26 = r3
            goto L_0x0229
        L_0x0227:
            r26 = r42
        L_0x0229:
            r12 = r5
            r22 = r6
            r19 = r7
            r24 = r8
            r20 = r10
        L_0x0232:
            r13.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0244
            r3 = -1
            java.lang.String r5 = "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:337)"
            r6 = -1387401842(0xffffffffad4ded8e, float:-1.1705649E-11)
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r4, r3, r5)
        L_0x0244:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5 r3 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
            r3.<init>(r12, r2, r4, r1)
            r5 = 1172118032(0x45dd1a10, float:7075.258)
            r6 = 1
            androidx.compose.runtime.internal.a r18 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r5, r6, r3)
            int r3 = r4 >> 6
            r5 = r3 & 14
            r6 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r5
            int r4 = r4 >> 9
            r5 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r5
            r5 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r4
            r3 = r3 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r4
            r3 = r3 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r5
            r16 = r3 | r4
            r17 = 0
            r3 = r33
            r4 = r0
            r5 = r19
            r6 = r20
            r8 = r24
            r10 = r22
            r11 = r26
            r23 = r12
            r12 = r18
            r18 = r13
            r14 = r16
            r15 = r17
            m25805c(r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0296
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0296:
            r4 = r0
            r6 = r19
            r7 = r20
            r11 = r22
            r5 = r23
            r9 = r24
            r12 = r26
        L_0x02a3:
            androidx.compose.runtime.t1 r15 = r18.mo15020s()
            if (r15 != 0) goto L_0x02aa
            goto L_0x02c1
        L_0x02aa:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$6 r14 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$6
            r0 = r14
            r1 = r31
            r2 = r32
            r3 = r33
            r13 = r44
            r27 = r14
            r14 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            r0 = r27
            r15.mo15202a(r0)
        L_0x02c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m25803a(kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.a, androidx.compose.ui.m, boolean, androidx.compose.ui.graphics.g4, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0115  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25804b(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r28, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r29, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r30, long r31, long r33, @org.jetbrains.annotations.C12580l androidx.compose.material3.FloatingActionButtonElevation r35, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r37
            r15 = r39
            r12 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -326283107(0xffffffffec8d509d, float:-1.3667138E27)
            r1 = r38
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.mo14927P(r13)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r15
            goto L_0x0032
        L_0x0031:
            r1 = r15
        L_0x0032:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r29
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
            goto L_0x004e
        L_0x004c:
            r3 = r29
        L_0x004e:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0067
            r4 = r12 & 4
            if (r4 != 0) goto L_0x0061
            r4 = r30
            boolean r5 = r11.mo15006n0(r4)
            if (r5 == 0) goto L_0x0063
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r4 = r30
        L_0x0063:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r5
            goto L_0x0069
        L_0x0067:
            r4 = r30
        L_0x0069:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0082
            r5 = r12 & 8
            if (r5 != 0) goto L_0x007c
            r5 = r31
            boolean r7 = r11.mo14980g(r5)
            if (r7 == 0) goto L_0x007e
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r5 = r31
        L_0x007e:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r7
            goto L_0x0084
        L_0x0082:
            r5 = r31
        L_0x0084:
            r9 = 57344(0xe000, float:8.0356E-41)
            r7 = r15 & r9
            if (r7 != 0) goto L_0x00a0
            r7 = r12 & 16
            if (r7 != 0) goto L_0x009a
            r7 = r33
            boolean r10 = r11.mo14980g(r7)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r7 = r33
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r10
            goto L_0x00a2
        L_0x00a0:
            r7 = r33
        L_0x00a2:
            r10 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r10
            if (r16 != 0) goto L_0x00bc
            r16 = r12 & 32
            r10 = r35
            if (r16 != 0) goto L_0x00b7
            boolean r16 = r11.mo15006n0(r10)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r16
            goto L_0x00be
        L_0x00bc:
            r10 = r35
        L_0x00be:
            r16 = r12 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00cb
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r9 = r36
            goto L_0x00de
        L_0x00cb:
            r18 = r15 & r17
            r9 = r36
            if (r18 != 0) goto L_0x00de
            boolean r19 = r11.mo15006n0(r9)
            if (r19 == 0) goto L_0x00da
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r19
        L_0x00de:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e7
            r1 = r1 | r20
            goto L_0x00f8
        L_0x00e7:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r15
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r11.mo14927P(r14)
            if (r0 == 0) goto L_0x00f5
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r1 = r1 | r0
        L_0x00f8:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0115
            boolean r0 = r11.mo15011p()
            if (r0 != 0) goto L_0x0108
            goto L_0x0115
        L_0x0108:
            r11.mo14958a0()
            r2 = r29
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r10
            r19 = r11
            goto L_0x0243
        L_0x0115:
            r11.mo14930Q()
            r0 = r15 & 1
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0151
            boolean r0 = r11.mo14977f0()
            if (r0 == 0) goto L_0x0129
            goto L_0x0151
        L_0x0129:
            r11.mo14958a0()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0132
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0132:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0138
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0138:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x013d
            r1 = r1 & r3
        L_0x013d:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0143
            r1 = r1 & r21
        L_0x0143:
            r16 = r29
            r23 = r4
            r26 = r5
            r24 = r7
        L_0x014b:
            r22 = r9
        L_0x014d:
            r21 = r10
            goto L_0x01db
        L_0x0151:
            if (r2 == 0) goto L_0x0156
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0158
        L_0x0156:
            r0 = r29
        L_0x0158:
            r2 = r12 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0168
            androidx.compose.material3.u0 r2 = androidx.compose.material3.C8355u0.f22430a
            androidx.compose.ui.graphics.g4 r2 = r2.mo14722e(r11, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r23 = r2
            goto L_0x016a
        L_0x0168:
            r23 = r4
        L_0x016a:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0177
            androidx.compose.material3.u0 r2 = androidx.compose.material3.C8355u0.f22430a
            long r2 = r2.mo14721d(r11, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r2
        L_0x0177:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x018c
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m25516c(r5, r11, r2)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
            r22 = r1
            r24 = r2
            goto L_0x0190
        L_0x018c:
            r22 = r1
            r24 = r7
        L_0x0190:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x01ad
            androidx.compose.material3.u0 r1 = androidx.compose.material3.C8355u0.f22430a
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 24576(0x6000, float:3.4438E-41)
            r10 = 15
            r26 = r5
            r5 = r7
            r6 = r11
            r7 = r8
            r8 = r10
            androidx.compose.material3.FloatingActionButtonElevation r1 = r1.mo14720c(r2, r3, r4, r5, r6, r7, r8)
            r2 = r22 & r21
            r10 = r1
            r1 = r2
            goto L_0x01b1
        L_0x01ad:
            r26 = r5
            r1 = r22
        L_0x01b1:
            if (r16 == 0) goto L_0x01d7
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r2)
            java.lang.Object r2 = r11.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r2 != r3) goto L_0x01cc
            androidx.compose.foundation.interaction.g r2 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r11.mo14893C(r2)
        L_0x01cc:
            r11.mo15002m0()
            androidx.compose.foundation.interaction.g r2 = (androidx.compose.foundation.interaction.C2243g) r2
            r16 = r0
            r22 = r2
            goto L_0x014d
        L_0x01d7:
            r16 = r0
            goto L_0x014b
        L_0x01db:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ed
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:270)"
            r3 = -326283107(0xffffffffec8d509d, float:-1.3667138E27)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x01ed:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2 r0 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2
            r0.<init>(r14, r1)
            r2 = 398457247(0x17bff99f, float:1.2406099E-24)
            r3 = 1
            androidx.compose.runtime.internal.a r9 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r2, r3, r0)
            r0 = r1 & 14
            r0 = r0 | r20
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r17
            r17 = r0 | r1
            r18 = 0
            r0 = r28
            r1 = r16
            r2 = r23
            r3 = r26
            r5 = r24
            r7 = r21
            r8 = r22
            r10 = r11
            r19 = r11
            r11 = r17
            r12 = r18
            m25805c(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0237
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0237:
            r2 = r16
            r8 = r21
            r9 = r22
            r3 = r23
            r6 = r24
            r4 = r26
        L_0x0243:
            androidx.compose.runtime.t1 r12 = r19.mo15020s()
            if (r12 != 0) goto L_0x024a
            goto L_0x025d
        L_0x024a:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3 r11 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3
            r0 = r11
            r1 = r28
            r10 = r37
            r13 = r11
            r11 = r39
            r14 = r12
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r14.mo15202a(r13)
        L_0x025d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m25804b(kotlin.jvm.functions.a, androidx.compose.ui.m, androidx.compose.ui.graphics.g4, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0115  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25805c(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r26, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r27, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r28, long r29, long r31, @org.jetbrains.annotations.C12580l androidx.compose.material3.FloatingActionButtonElevation r33, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r34, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r35, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r36, int r37, int r38) {
        /*
            r13 = r26
            r11 = r35
            r6 = r37
            r7 = r38
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -731723913(0xffffffffd462c777, float:-3.89603629E12)
            r1 = r36
            androidx.compose.runtime.o r4 = r1.mo15009o(r0)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r6 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r6 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r4.mo14927P(r13)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r6
            goto L_0x0032
        L_0x0031:
            r1 = r6
        L_0x0032:
            r2 = r7 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r6 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r27
            boolean r5 = r4.mo15006n0(r3)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r1 = r1 | r5
            goto L_0x004e
        L_0x004c:
            r3 = r27
        L_0x004e:
            r5 = r6 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r7 & 4
            if (r5 != 0) goto L_0x0061
            r5 = r28
            boolean r8 = r4.mo15006n0(r5)
            if (r8 == 0) goto L_0x0063
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r5 = r28
        L_0x0063:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r8
            goto L_0x0069
        L_0x0067:
            r5 = r28
        L_0x0069:
            r8 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0082
            r8 = r7 & 8
            if (r8 != 0) goto L_0x007c
            r8 = r29
            boolean r10 = r4.mo14980g(r8)
            if (r10 == 0) goto L_0x007e
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r8 = r29
        L_0x007e:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r10
            goto L_0x0084
        L_0x0082:
            r8 = r29
        L_0x0084:
            r22 = 57344(0xe000, float:8.0356E-41)
            r10 = r6 & r22
            if (r10 != 0) goto L_0x009e
            r10 = r7 & 16
            r14 = r31
            if (r10 != 0) goto L_0x009a
            boolean r10 = r4.mo14980g(r14)
            if (r10 == 0) goto L_0x009a
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r10
            goto L_0x00a0
        L_0x009e:
            r14 = r31
        L_0x00a0:
            r23 = 458752(0x70000, float:6.42848E-40)
            r10 = r6 & r23
            if (r10 != 0) goto L_0x00bb
            r10 = r7 & 32
            if (r10 != 0) goto L_0x00b5
            r10 = r33
            boolean r12 = r4.mo15006n0(r10)
            if (r12 == 0) goto L_0x00b7
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b5:
            r10 = r33
        L_0x00b7:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r12
            goto L_0x00bd
        L_0x00bb:
            r10 = r33
        L_0x00bd:
            r12 = r7 & 64
            if (r12 == 0) goto L_0x00c8
            r16 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r16
            r0 = r34
            goto L_0x00dd
        L_0x00c8:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r6 & r16
            r0 = r34
            if (r16 != 0) goto L_0x00dd
            boolean r16 = r4.mo15006n0(r0)
            if (r16 == 0) goto L_0x00d9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r16
        L_0x00dd:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e5
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e3:
            r1 = r1 | r0
            goto L_0x00f6
        L_0x00e5:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r6
            if (r0 != 0) goto L_0x00f6
            boolean r0 = r4.mo14927P(r11)
            if (r0 == 0) goto L_0x00f3
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e3
        L_0x00f3:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e3
        L_0x00f6:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0115
            boolean r0 = r4.mo15011p()
            if (r0 != 0) goto L_0x0106
            goto L_0x0115
        L_0x0106:
            r4.mo14958a0()
            r2 = r27
            r24 = r4
            r3 = r5
            r4 = r8
            r8 = r10
            r6 = r14
            r9 = r34
            goto L_0x026b
        L_0x0115:
            r4.mo14930Q()
            r0 = r6 & 1
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x014f
            boolean r0 = r4.mo14977f0()
            if (r0 == 0) goto L_0x0129
            goto L_0x014f
        L_0x0129:
            r4.mo14958a0()
            r0 = r7 & 4
            if (r0 == 0) goto L_0x0132
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0132:
            r0 = r7 & 8
            if (r0 == 0) goto L_0x0138
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0138:
            r0 = r7 & 16
            if (r0 == 0) goto L_0x013e
            r1 = r1 & r16
        L_0x013e:
            r0 = r7 & 32
            if (r0 == 0) goto L_0x0143
            r1 = r1 & r3
        L_0x0143:
            r0 = r34
            r12 = r1
            r17 = r5
            r18 = r8
            r3 = r10
            r5 = r27
            goto L_0x01d0
        L_0x014f:
            if (r2 == 0) goto L_0x0154
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0156
        L_0x0154:
            r0 = r27
        L_0x0156:
            r2 = r7 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0164
            androidx.compose.material3.u0 r2 = androidx.compose.material3.C8355u0.f22430a
            androidx.compose.ui.graphics.g4 r2 = r2.mo14725h(r4, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r5 = r2
        L_0x0164:
            r2 = r7 & 8
            if (r2 == 0) goto L_0x0171
            androidx.compose.material3.u0 r2 = androidx.compose.material3.C8355u0.f22430a
            long r2 = r2.mo14721d(r4, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r2
        L_0x0171:
            r2 = r7 & 16
            if (r2 == 0) goto L_0x0180
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m25516c(r8, r4, r2)
            r1 = r1 & r16
            goto L_0x0181
        L_0x0180:
            r2 = r14
        L_0x0181:
            r14 = r7 & 32
            if (r14 == 0) goto L_0x019c
            androidx.compose.material3.u0 r14 = androidx.compose.material3.C8355u0.f22430a
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 24576(0x6000, float:3.4438E-41)
            r21 = 15
            r19 = r4
            androidx.compose.material3.FloatingActionButtonElevation r10 = r14.mo14720c(r15, r16, r17, r18, r19, r20, r21)
            r14 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r14
        L_0x019c:
            if (r12 == 0) goto L_0x01c6
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.mo14918M(r12)
            java.lang.Object r12 = r4.mo14921N()
            androidx.compose.runtime.o$a r14 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r14 = r14.mo16277a()
            if (r12 != r14) goto L_0x01b7
            androidx.compose.foundation.interaction.g r12 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r4.mo14893C(r12)
        L_0x01b7:
            r4.mo15002m0()
            androidx.compose.foundation.interaction.g r12 = (androidx.compose.foundation.interaction.C2243g) r12
            r14 = r2
            r17 = r5
            r18 = r8
            r3 = r10
            r5 = r0
            r0 = r12
            r12 = r1
            goto L_0x01d0
        L_0x01c6:
            r12 = r1
            r14 = r2
            r17 = r5
            r18 = r8
            r3 = r10
            r5 = r0
            r0 = r34
        L_0x01d0:
            r4.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01e2
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:95)"
            r8 = -731723913(0xffffffffd462c777, float:-3.89603629E12)
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r12, r1, r2)
        L_0x01e2:
            androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2 r1 = androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.f19435f
            r2 = 0
            r8 = 0
            r10 = 1
            androidx.compose.ui.m r1 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r5, r8, r1, r10, r2)
            r2 = 0
            int r8 = r12 >> 18
            r8 = r8 & 14
            int r9 = r12 >> 12
            r9 = r9 & 112(0x70, float:1.57E-43)
            r9 = r9 | r8
            androidx.compose.runtime.k2 r8 = r3.mo11572f(r0, r4, r9)
            java.lang.Object r8 = r8.getValue()
            androidx.compose.ui.unit.g r8 = (androidx.compose.p004ui.unit.C16483g) r8
            float r8 = r8.mo47823t0()
            androidx.compose.runtime.k2 r9 = r3.mo11570e(r0, r4, r9)
            java.lang.Object r9 = r9.getValue()
            androidx.compose.ui.unit.g r9 = (androidx.compose.p004ui.unit.C16483g) r9
            float r9 = r9.mo47823t0()
            r16 = 0
            r2 = r10
            r10 = r16
            androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3 r10 = new androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
            r10.<init>(r14, r11, r12)
            r20 = r0
            r0 = 1249316354(0x4a770e02, float:4047744.5)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r4, r0, r2, r10)
            r2 = r12
            r12 = r0
            r0 = r2 & 14
            int r10 = r2 << 3
            r21 = r3
            r3 = r10 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = r10 & r22
            r0 = r0 | r3
            r3 = r10 & r23
            r0 = r0 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            int r2 = r2 << 9
            r2 = r2 & r3
            r0 = r0 | r2
            r22 = r14
            r14 = r0
            r15 = 6
            r16 = 260(0x104, float:3.64E-43)
            r0 = r26
            r3 = r17
            r24 = r4
            r25 = r5
            r4 = r18
            r6 = r22
            r11 = r20
            r13 = r24
            r2 = 0
            r10 = 0
            androidx.compose.material3.SurfaceKt.m26355d(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x025f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x025f:
            r3 = r17
            r4 = r18
            r9 = r20
            r8 = r21
            r6 = r22
            r2 = r25
        L_0x026b:
            androidx.compose.runtime.t1 r13 = r24.mo15020s()
            if (r13 != 0) goto L_0x0272
            goto L_0x0283
        L_0x0272:
            androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$4 r14 = new androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$4
            r0 = r14
            r1 = r26
            r10 = r35
            r11 = r37
            r12 = r38
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r13.mo15202a(r14)
        L_0x0283:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m25805c(kotlin.jvm.functions.a, androidx.compose.ui.m, androidx.compose.ui.graphics.g4, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0115  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25806d(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r28, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r29, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r30, long r31, long r33, @org.jetbrains.annotations.C12580l androidx.compose.material3.FloatingActionButtonElevation r35, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r37
            r15 = r39
            r12 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1650866856(0xffffffff9d99c558, float:-4.070281E-21)
            r1 = r38
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.mo14927P(r13)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r15
            goto L_0x0032
        L_0x0031:
            r1 = r15
        L_0x0032:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r29
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
            goto L_0x004e
        L_0x004c:
            r3 = r29
        L_0x004e:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0067
            r4 = r12 & 4
            if (r4 != 0) goto L_0x0061
            r4 = r30
            boolean r5 = r11.mo15006n0(r4)
            if (r5 == 0) goto L_0x0063
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r4 = r30
        L_0x0063:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r5
            goto L_0x0069
        L_0x0067:
            r4 = r30
        L_0x0069:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0082
            r5 = r12 & 8
            if (r5 != 0) goto L_0x007c
            r5 = r31
            boolean r7 = r11.mo14980g(r5)
            if (r7 == 0) goto L_0x007e
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r5 = r31
        L_0x007e:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r7
            goto L_0x0084
        L_0x0082:
            r5 = r31
        L_0x0084:
            r9 = 57344(0xe000, float:8.0356E-41)
            r7 = r15 & r9
            if (r7 != 0) goto L_0x00a0
            r7 = r12 & 16
            if (r7 != 0) goto L_0x009a
            r7 = r33
            boolean r10 = r11.mo14980g(r7)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r7 = r33
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r10
            goto L_0x00a2
        L_0x00a0:
            r7 = r33
        L_0x00a2:
            r10 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r10
            if (r16 != 0) goto L_0x00bc
            r16 = r12 & 32
            r10 = r35
            if (r16 != 0) goto L_0x00b7
            boolean r16 = r11.mo15006n0(r10)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r16
            goto L_0x00be
        L_0x00bc:
            r10 = r35
        L_0x00be:
            r16 = r12 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00cb
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r9 = r36
            goto L_0x00de
        L_0x00cb:
            r18 = r15 & r17
            r9 = r36
            if (r18 != 0) goto L_0x00de
            boolean r19 = r11.mo15006n0(r9)
            if (r19 == 0) goto L_0x00da
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r19
        L_0x00de:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00e8
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e6:
            r1 = r1 | r0
            goto L_0x00f8
        L_0x00e8:
            r0 = r15 & r20
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r11.mo14927P(r14)
            if (r0 == 0) goto L_0x00f5
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e6
        L_0x00f5:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e6
        L_0x00f8:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0115
            boolean r0 = r11.mo15011p()
            if (r0 != 0) goto L_0x0108
            goto L_0x0115
        L_0x0108:
            r11.mo14958a0()
            r2 = r29
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r10
            r19 = r11
            goto L_0x0256
        L_0x0115:
            r11.mo14930Q()
            r0 = r15 & 1
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0151
            boolean r0 = r11.mo14977f0()
            if (r0 == 0) goto L_0x0129
            goto L_0x0151
        L_0x0129:
            r11.mo14958a0()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0132
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0132:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0138
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0138:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x013d
            r1 = r1 & r3
        L_0x013d:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0143
            r1 = r1 & r21
        L_0x0143:
            r16 = r29
            r23 = r4
            r26 = r5
            r24 = r7
        L_0x014b:
            r22 = r9
        L_0x014d:
            r21 = r10
            goto L_0x01db
        L_0x0151:
            if (r2 == 0) goto L_0x0156
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0158
        L_0x0156:
            r0 = r29
        L_0x0158:
            r2 = r12 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0168
            androidx.compose.material3.u0 r2 = androidx.compose.material3.C8355u0.f22430a
            androidx.compose.ui.graphics.g4 r2 = r2.mo14724g(r11, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r23 = r2
            goto L_0x016a
        L_0x0168:
            r23 = r4
        L_0x016a:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0177
            androidx.compose.material3.u0 r2 = androidx.compose.material3.C8355u0.f22430a
            long r2 = r2.mo14721d(r11, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r2
        L_0x0177:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x018c
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m25516c(r5, r11, r2)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
            r22 = r1
            r24 = r2
            goto L_0x0190
        L_0x018c:
            r22 = r1
            r24 = r7
        L_0x0190:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x01ad
            androidx.compose.material3.u0 r1 = androidx.compose.material3.C8355u0.f22430a
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 24576(0x6000, float:3.4438E-41)
            r10 = 15
            r26 = r5
            r5 = r7
            r6 = r11
            r7 = r8
            r8 = r10
            androidx.compose.material3.FloatingActionButtonElevation r1 = r1.mo14720c(r2, r3, r4, r5, r6, r7, r8)
            r2 = r22 & r21
            r10 = r1
            r1 = r2
            goto L_0x01b1
        L_0x01ad:
            r26 = r5
            r1 = r22
        L_0x01b1:
            if (r16 == 0) goto L_0x01d7
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r2)
            java.lang.Object r2 = r11.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r2 != r3) goto L_0x01cc
            androidx.compose.foundation.interaction.g r2 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r11.mo14893C(r2)
        L_0x01cc:
            r11.mo15002m0()
            androidx.compose.foundation.interaction.g r2 = (androidx.compose.foundation.interaction.C2243g) r2
            r16 = r0
            r22 = r2
            goto L_0x014d
        L_0x01d7:
            r16 = r0
            goto L_0x014b
        L_0x01db:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ed
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:215)"
            r3 = -1650866856(0xffffffff9d99c558, float:-4.070281E-21)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x01ed:
            androidx.compose.material3.tokens.p r0 = androidx.compose.material3.tokens.C8331p.f21854a
            float r2 = r0.mo14211e()
            float r0 = r0.mo14209c()
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r29 = r16
            r30 = r2
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10091G(r29, r30, r31, r32, r33, r34, r35)
            r0 = r1 & 14
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = r1 & r17
            r0 = r0 | r3
            r1 = r1 & r20
            r17 = r0 | r1
            r18 = 0
            r0 = r28
            r1 = r2
            r2 = r23
            r3 = r26
            r5 = r24
            r7 = r21
            r8 = r22
            r9 = r37
            r10 = r11
            r19 = r11
            r11 = r17
            r12 = r18
            m25805c(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x024a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x024a:
            r2 = r16
            r8 = r21
            r9 = r22
            r3 = r23
            r6 = r24
            r4 = r26
        L_0x0256:
            androidx.compose.runtime.t1 r12 = r19.mo15020s()
            if (r12 != 0) goto L_0x025d
            goto L_0x0270
        L_0x025d:
            androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$2 r11 = new androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$2
            r0 = r11
            r1 = r28
            r10 = r37
            r13 = r11
            r11 = r39
            r14 = r12
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r14.mo15202a(r13)
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m25806d(kotlin.jvm.functions.a, androidx.compose.ui.m, androidx.compose.ui.graphics.g4, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0115  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25807e(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r28, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r29, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r30, long r31, long r33, @org.jetbrains.annotations.C12580l androidx.compose.material3.FloatingActionButtonElevation r35, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r37
            r15 = r39
            r12 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 1444748300(0x561d1c0c, float:4.3185946E13)
            r1 = r38
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.mo14927P(r13)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r15
            goto L_0x0032
        L_0x0031:
            r1 = r15
        L_0x0032:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r29
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
            goto L_0x004e
        L_0x004c:
            r3 = r29
        L_0x004e:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0067
            r4 = r12 & 4
            if (r4 != 0) goto L_0x0061
            r4 = r30
            boolean r5 = r11.mo15006n0(r4)
            if (r5 == 0) goto L_0x0063
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r4 = r30
        L_0x0063:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r5
            goto L_0x0069
        L_0x0067:
            r4 = r30
        L_0x0069:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0082
            r5 = r12 & 8
            if (r5 != 0) goto L_0x007c
            r5 = r31
            boolean r7 = r11.mo14980g(r5)
            if (r7 == 0) goto L_0x007e
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r5 = r31
        L_0x007e:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r7
            goto L_0x0084
        L_0x0082:
            r5 = r31
        L_0x0084:
            r9 = 57344(0xe000, float:8.0356E-41)
            r7 = r15 & r9
            if (r7 != 0) goto L_0x00a0
            r7 = r12 & 16
            if (r7 != 0) goto L_0x009a
            r7 = r33
            boolean r10 = r11.mo14980g(r7)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r7 = r33
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r10
            goto L_0x00a2
        L_0x00a0:
            r7 = r33
        L_0x00a2:
            r10 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r10
            if (r16 != 0) goto L_0x00bc
            r16 = r12 & 32
            r10 = r35
            if (r16 != 0) goto L_0x00b7
            boolean r16 = r11.mo15006n0(r10)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r16
            goto L_0x00be
        L_0x00bc:
            r10 = r35
        L_0x00be:
            r16 = r12 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00cb
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r9 = r36
            goto L_0x00de
        L_0x00cb:
            r18 = r15 & r17
            r9 = r36
            if (r18 != 0) goto L_0x00de
            boolean r19 = r11.mo15006n0(r9)
            if (r19 == 0) goto L_0x00da
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r19
        L_0x00de:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00e8
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e6:
            r1 = r1 | r0
            goto L_0x00f8
        L_0x00e8:
            r0 = r15 & r20
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r11.mo14927P(r14)
            if (r0 == 0) goto L_0x00f5
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e6
        L_0x00f5:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e6
        L_0x00f8:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0115
            boolean r0 = r11.mo15011p()
            if (r0 != 0) goto L_0x0108
            goto L_0x0115
        L_0x0108:
            r11.mo14958a0()
            r2 = r29
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r10
            r19 = r11
            goto L_0x0256
        L_0x0115:
            r11.mo14930Q()
            r0 = r15 & 1
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0151
            boolean r0 = r11.mo14977f0()
            if (r0 == 0) goto L_0x0129
            goto L_0x0151
        L_0x0129:
            r11.mo14958a0()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0132
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0132:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0138
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0138:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x013d
            r1 = r1 & r3
        L_0x013d:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0143
            r1 = r1 & r21
        L_0x0143:
            r16 = r29
            r23 = r4
            r26 = r5
            r24 = r7
        L_0x014b:
            r22 = r9
        L_0x014d:
            r21 = r10
            goto L_0x01db
        L_0x0151:
            if (r2 == 0) goto L_0x0156
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0158
        L_0x0156:
            r0 = r29
        L_0x0158:
            r2 = r12 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0168
            androidx.compose.material3.u0 r2 = androidx.compose.material3.C8355u0.f22430a
            androidx.compose.ui.graphics.g4 r2 = r2.mo14726i(r11, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r23 = r2
            goto L_0x016a
        L_0x0168:
            r23 = r4
        L_0x016a:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0177
            androidx.compose.material3.u0 r2 = androidx.compose.material3.C8355u0.f22430a
            long r2 = r2.mo14721d(r11, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r2
        L_0x0177:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x018c
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m25516c(r5, r11, r2)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
            r22 = r1
            r24 = r2
            goto L_0x0190
        L_0x018c:
            r22 = r1
            r24 = r7
        L_0x0190:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x01ad
            androidx.compose.material3.u0 r1 = androidx.compose.material3.C8355u0.f22430a
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 24576(0x6000, float:3.4438E-41)
            r10 = 15
            r26 = r5
            r5 = r7
            r6 = r11
            r7 = r8
            r8 = r10
            androidx.compose.material3.FloatingActionButtonElevation r1 = r1.mo14720c(r2, r3, r4, r5, r6, r7, r8)
            r2 = r22 & r21
            r10 = r1
            r1 = r2
            goto L_0x01b1
        L_0x01ad:
            r26 = r5
            r1 = r22
        L_0x01b1:
            if (r16 == 0) goto L_0x01d7
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r2)
            java.lang.Object r2 = r11.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r2 != r3) goto L_0x01cc
            androidx.compose.foundation.interaction.g r2 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r11.mo14893C(r2)
        L_0x01cc:
            r11.mo15002m0()
            androidx.compose.foundation.interaction.g r2 = (androidx.compose.foundation.interaction.C2243g) r2
            r16 = r0
            r22 = r2
            goto L_0x014d
        L_0x01d7:
            r16 = r0
            goto L_0x014b
        L_0x01db:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ed
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:163)"
            r3 = 1444748300(0x561d1c0c, float:4.3185946E13)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x01ed:
            androidx.compose.material3.tokens.q r0 = androidx.compose.material3.tokens.C8333q.f21953a
            float r2 = r0.mo14308e()
            float r0 = r0.mo14306c()
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r29 = r16
            r30 = r2
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10091G(r29, r30, r31, r32, r33, r34, r35)
            r0 = r1 & 14
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = r1 & r17
            r0 = r0 | r3
            r1 = r1 & r20
            r17 = r0 | r1
            r18 = 0
            r0 = r28
            r1 = r2
            r2 = r23
            r3 = r26
            r5 = r24
            r7 = r21
            r8 = r22
            r9 = r37
            r10 = r11
            r19 = r11
            r11 = r17
            r12 = r18
            m25805c(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x024a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x024a:
            r2 = r16
            r8 = r21
            r9 = r22
            r3 = r23
            r6 = r24
            r4 = r26
        L_0x0256:
            androidx.compose.runtime.t1 r12 = r19.mo15020s()
            if (r12 != 0) goto L_0x025d
            goto L_0x0270
        L_0x025d:
            androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$2 r11 = new androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$2
            r0 = r11
            r1 = r28
            r10 = r37
            r13 = r11
            r11 = r39
            r14 = r12
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r14.mo15202a(r13)
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m25807e(kotlin.jvm.functions.a, androidx.compose.ui.m, androidx.compose.ui.graphics.g4, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }
}
