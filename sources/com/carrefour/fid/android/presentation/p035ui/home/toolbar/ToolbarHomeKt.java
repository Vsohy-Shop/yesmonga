package com.carrefour.fid.android.presentation.p035ui.home.toolbar;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nToolbarHome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolbarHome.kt\ncom/carrefour/fid/android/presentation/ui/home/toolbar/ToolbarHomeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,196:1\n67#2,3:197\n66#2:200\n460#2,13:227\n473#2,3:241\n460#2,13:265\n460#2,13:298\n473#2,3:312\n36#2:318\n473#2,3:325\n1114#3,6:201\n1114#3,6:319\n66#4,7:207\n73#4:240\n77#4:245\n67#4,6:246\n73#4:278\n77#4:329\n75#5:214\n76#5,11:216\n89#5:244\n75#5:252\n76#5,11:254\n75#5:285\n76#5,11:287\n89#5:315\n89#5:328\n76#6:215\n76#6:253\n76#6:286\n154#7:279\n154#7:281\n211#7:282\n154#7:317\n88#8:280\n78#9,2:283\n80#9:311\n84#9:316\n76#10:330\n76#10:331\n*S KotlinDebug\n*F\n+ 1 ToolbarHome.kt\ncom/carrefour/fid/android/presentation/ui/home/toolbar/ToolbarHomeKt\n*L\n62#1:197,3\n62#1:200\n102#1:227,13\n102#1:241,3\n120#1:265,13\n125#1:298,13\n125#1:312,3\n161#1:318\n120#1:325,3\n62#1:201,6\n161#1:319,6\n102#1:207,7\n102#1:240\n102#1:245\n120#1:246,6\n120#1:278\n120#1:329\n102#1:214\n102#1:216,11\n102#1:244\n120#1:252\n120#1:254,11\n125#1:285\n125#1:287,11\n125#1:315\n120#1:328\n102#1:215\n120#1:253\n125#1:286\n130#1:279\n132#1:281\n132#1:282\n159#1:317\n131#1:280\n125#1:283,2\n125#1:311\n125#1:316\n53#1:330\n54#1:331\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt */
public final class ToolbarHomeKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106586a(androidx.compose.foundation.layout.C2373k r34, com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i r35, boolean r36, float r37, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.home.toolbar.C24216a, kotlin.C11079d2> r38, androidx.compose.runtime.C8592o r39, int r40) {
        /*
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r40
            r0 = -671783519(0xffffffffd7f565a1, float:-5.39633683E14)
            r1 = r39
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r7 = r6 & 14
            if (r7 != 0) goto L_0x0024
            r7 = r34
            boolean r8 = r1.mo15006n0(r7)
            if (r8 == 0) goto L_0x0021
            r8 = 4
            goto L_0x0022
        L_0x0021:
            r8 = 2
        L_0x0022:
            r8 = r8 | r6
            goto L_0x0027
        L_0x0024:
            r7 = r34
            r8 = r6
        L_0x0027:
            r9 = r6 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0037
            boolean r9 = r1.mo15006n0(r2)
            if (r9 == 0) goto L_0x0034
            r9 = 32
            goto L_0x0036
        L_0x0034:
            r9 = 16
        L_0x0036:
            r8 = r8 | r9
        L_0x0037:
            r9 = r6 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0047
            boolean r9 = r1.mo14961b(r3)
            if (r9 == 0) goto L_0x0044
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0046
        L_0x0044:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0046:
            r8 = r8 | r9
        L_0x0047:
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0057
            boolean r9 = r1.mo14968d(r4)
            if (r9 == 0) goto L_0x0054
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0056
        L_0x0054:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0056:
            r8 = r8 | r9
        L_0x0057:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r6
            if (r9 != 0) goto L_0x0069
            boolean r9 = r1.mo14927P(r5)
            if (r9 == 0) goto L_0x0066
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0068
        L_0x0066:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0068:
            r8 = r8 | r9
        L_0x0069:
            r9 = 46811(0xb6db, float:6.5596E-41)
            r9 = r9 & r8
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r10) goto L_0x007d
            boolean r9 = r1.mo15011p()
            if (r9 != 0) goto L_0x0078
            goto L_0x007d
        L_0x0078:
            r1.mo14958a0()
            goto L_0x0339
        L_0x007d:
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0089
            r9 = -1
            java.lang.String r10 = "com.carrefour.fid.android.presentation.ui.home.toolbar.Header (ToolbarHome.kt:113)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r9, r10)
        L_0x0089:
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r14 = 0
            r13 = 1
            r12 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.SizeKt.m10112l(r0, r14, r13, r12)
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r16 = 2
            r17 = 0
            r8 = r34
            r15 = r12
            r12 = r16
            r6 = r13
            r13 = r17
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.C2373k.m10461c(r8, r9, r10, r11, r12, r13)
            r9 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.mo14918M(r9)
            androidx.compose.ui.c$a r32 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r9 = r32.mo17061C()
            r13 = 0
            androidx.compose.ui.layout.f0 r9 = androidx.compose.foundation.layout.BoxKt.m9849k(r9, r13, r1, r13)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r10)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p004ui.unit.LayoutDirection) r12
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r17.mo44585a()
            kotlin.jvm.functions.q r8 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r8)
            androidx.compose.runtime.d r14 = r1.mo15017r()
            boolean r14 = r14 instanceof androidx.compose.runtime.C8428d
            if (r14 != 0) goto L_0x00ef
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00ef:
            r1.mo14938T()
            boolean r14 = r1.mo14997l()
            if (r14 == 0) goto L_0x00fc
            r1.mo14947W(r6)
            goto L_0x00ff
        L_0x00fc:
            r1.mo14888A()
        L_0x00ff:
            r1.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r14 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r9, r14)
            kotlin.jvm.functions.p r9 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r11, r9)
            kotlin.jvm.functions.p r9 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r12, r9)
            kotlin.jvm.functions.p r9 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r10, r9)
            r1.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r8.invoke(r6, r1, r9)
            r6 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r6)
            androidx.compose.foundation.layout.BoxScopeInstance r14 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.ui.c r8 = r32.mo17069o()
            androidx.compose.ui.m r8 = r14.mo7701c(r0, r8)
            r9 = 0
            r10 = 1
            androidx.compose.ui.m r19 = androidx.compose.foundation.layout.SizeKt.m10114n(r8, r9, r10, r15)
            r20 = 0
            r8 = 40
            float r8 = (float) r8
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            float r9 = (float) r10
            float r10 = r9 - r4
            float r8 = r8 * r10
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            float r10 = (float) r13
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            float r8 = kotlin.ranges.C11479u.m44444t(r8, r10)
            float r21 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            r22 = 0
            r23 = 0
            r24 = 13
            r25 = 0
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.PaddingKt.m10028o(r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r10 = r10.mo7625f()
            androidx.compose.ui.e$a r11 = new androidx.compose.ui.e$a
            float r9 = r4 - r9
            r11.<init>(r9)
            r9 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r9)
            r9 = 6
            androidx.compose.ui.layout.f0 r9 = androidx.compose.foundation.layout.ColumnKt.m9863b(r10, r11, r1, r9)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r10)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            kotlin.jvm.functions.a r15 = r17.mo44585a()
            kotlin.jvm.functions.q r8 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r8)
            androidx.compose.runtime.d r6 = r1.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x01c3
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01c3:
            r1.mo14938T()
            boolean r6 = r1.mo14997l()
            if (r6 == 0) goto L_0x01d0
            r1.mo14947W(r15)
            goto L_0x01d3
        L_0x01d0:
            r1.mo14888A()
        L_0x01d3:
            r1.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r9, r15)
            kotlin.jvm.functions.p r9 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r10, r9)
            kotlin.jvm.functions.p r9 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r11, r9)
            kotlin.jvm.functions.p r9 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r12, r9)
            r1.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r8.invoke(r6, r1, r9)
            r6 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r6)
            androidx.compose.foundation.layout.ColumnScopeInstance r6 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r6 = 28
            float r6 = (float) r6
            r8 = 12
            float r8 = (float) r8
            float r8 = r8 * r4
            float r6 = r6 - r8
            boolean r8 = r2 instanceof com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i.C26510a
            if (r8 == 0) goto L_0x0248
            r8 = -784020913(0xffffffffd144ca4f, float:-5.2825485E10)
            r1.mo14918M(r8)
            r8 = 2131952825(0x7f1304b9, float:1.9542104E38)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r1, r13)
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = r2
            com.carrefour.fid.android.presentation.viewmodels.home.state.i$a r11 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i.C26510a) r11
            java.lang.String r11 = r11.mo77079d()
            r10[r13] = r11
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r10, r9)
            java.lang.String r8 = java.lang.String.format(r8, r9)
            java.lang.String r9 = "format(this, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            r1.mo15002m0()
        L_0x0245:
            r28 = r8
            goto L_0x0261
        L_0x0248:
            com.carrefour.fid.android.presentation.viewmodels.home.state.i$b r8 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i.C26511b.f64789a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0356
            r8 = -784020835(0xffffffffd144ca9d, float:-5.2825805E10)
            r1.mo14918M(r8)
            r8 = 2131952847(0x7f1304cf, float:1.9542148E38)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r1, r13)
            r1.mo15002m0()
            goto L_0x0245
        L_0x0261:
            r8 = 0
            r9 = 0
            long r11 = androidx.compose.p004ui.unit.C16506u.m74711l(r6)
            r6 = 0
            r15 = r13
            r13 = r6
            r33 = r14
            r14 = r6
            r15 = r6
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            androidx.compose.material.t0 r6 = androidx.compose.material.C7933t0.f19075a
            int r8 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r6 = r6.mo11077c(r1, r8)
            androidx.compose.ui.text.p0 r27 = r6.mo11094h()
            r29 = 0
            r30 = 0
            r31 = 65526(0xfff6, float:9.1821E-41)
            r7 = r28
            r28 = r1
            r8 = 0
            androidx.compose.material.TextKt.m14196c(r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            com.carrefour.fid.android.presentation.viewmodels.home.state.i$b r6 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i.C26511b.f64789a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r6)
            if (r6 != 0) goto L_0x02b7
            if (r3 != 0) goto L_0x02b3
            goto L_0x02b7
        L_0x02b3:
            r6 = 2131231152(0x7f0801b0, float:1.8078377E38)
            goto L_0x02ba
        L_0x02b7:
            r6 = 2131231151(0x7f0801af, float:1.8078375E38)
        L_0x02ba:
            r7 = 0
            androidx.compose.ui.graphics.painter.Painter r6 = androidx.compose.p004ui.res.C16015f.m71849d(r6, r1, r7)
            r17 = 0
            r18 = 0
            r8 = 16
            float r8 = (float) r8
            float r19 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            r20 = 0
            r21 = 11
            r22 = 0
            r16 = r0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.c r8 = r32.mo17060A()
            r9 = r33
            androidx.compose.ui.m r10 = r9.mo7701c(r0, r8)
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r5)
            java.lang.Object r8 = r1.mo14921N()
            if (r0 != 0) goto L_0x02fb
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r8 != r0) goto L_0x0303
        L_0x02fb:
            com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$Header$1$2$1 r8 = new com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$Header$1$2$1
            r8.<init>(r5)
            r1.mo14893C(r8)
        L_0x0303:
            r1.mo15002m0()
            r14 = r8
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            r15 = 7
            r16 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.ClickableKt.m8878e(r10, r11, r12, r13, r14, r15, r16)
            r0 = 2131951696(0x7f130050, float:1.9539814E38)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r7)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 8
            r16 = 120(0x78, float:1.68E-43)
            r7 = r6
            r14 = r1
            androidx.compose.foundation.ImageKt.m8967b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0339
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0339:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x0340
            goto L_0x0355
        L_0x0340:
            com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$Header$2 r8 = new com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$Header$2
            r0 = r8
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0355:
            return
        L_0x0356:
            r0 = -784025838(0xffffffffd144b712, float:-5.2805313E10)
            r1.mo14918M(r0)
            r1.mo15002m0()
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.toolbar.ToolbarHomeKt.m106586a(androidx.compose.foundation.layout.k, com.carrefour.fid.android.presentation.viewmodels.home.state.i, boolean, float, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106587b(androidx.compose.p004ui.C8767m r16, com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i r17, boolean r18, float r19, float r20, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.home.toolbar.C24216a, kotlin.C11079d2> r21, androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r7 = r23
            r0 = -358840175(0xffffffffea9c8891, float:-9.461867E25)
            r1 = r22
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r24 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r7 | 6
            r4 = r3
            r3 = r16
            goto L_0x0029
        L_0x0015:
            r3 = r7 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r16
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r7
            goto L_0x0029
        L_0x0026:
            r3 = r16
            r4 = r7
        L_0x0029:
            r5 = r24 & 2
            if (r5 == 0) goto L_0x0030
            r4 = r4 | 48
            goto L_0x0043
        L_0x0030:
            r5 = r7 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0043
            r5 = r17
            boolean r6 = r1.mo15006n0(r5)
            if (r6 == 0) goto L_0x003f
            r6 = 32
            goto L_0x0041
        L_0x003f:
            r6 = 16
        L_0x0041:
            r4 = r4 | r6
            goto L_0x0045
        L_0x0043:
            r5 = r17
        L_0x0045:
            r6 = r24 & 4
            if (r6 == 0) goto L_0x004c
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005f
            r6 = r18
            boolean r8 = r1.mo14961b(r6)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r8
            goto L_0x0061
        L_0x005f:
            r6 = r18
        L_0x0061:
            r8 = r24 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r15 = r19
            goto L_0x007c
        L_0x006a:
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            r15 = r19
            if (r8 != 0) goto L_0x007c
            boolean r8 = r1.mo14968d(r15)
            if (r8 == 0) goto L_0x0079
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r8
        L_0x007c:
            r8 = r24 & 16
            if (r8 == 0) goto L_0x0085
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r14 = r20
            goto L_0x0099
        L_0x0085:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r7
            r14 = r20
            if (r8 != 0) goto L_0x0099
            boolean r8 = r1.mo14968d(r14)
            if (r8 == 0) goto L_0x0096
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r4 = r4 | r8
        L_0x0099:
            r8 = r24 & 32
            if (r8 == 0) goto L_0x00a3
            r8 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r8
            r13 = r21
            goto L_0x00b6
        L_0x00a3:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r7
            r13 = r21
            if (r8 != 0) goto L_0x00b6
            boolean r8 = r1.mo14927P(r13)
            if (r8 == 0) goto L_0x00b3
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r4 = r4 | r8
        L_0x00b6:
            r8 = 374491(0x5b6db, float:5.24774E-40)
            r8 = r8 & r4
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r9) goto L_0x00cb
            boolean r8 = r1.mo15011p()
            if (r8 != 0) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            r1.mo14958a0()
            r2 = r3
            goto L_0x0104
        L_0x00cb:
            if (r2 == 0) goto L_0x00d0
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00d1
        L_0x00d0:
            r2 = r3
        L_0x00d1:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x00dd
            r3 = -1
            java.lang.String r8 = "com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHome (ToolbarHome.kt:71)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r3, r8)
        L_0x00dd:
            com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHome$1 r0 = new com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHome$1
            r8 = r0
            r9 = r2
            r10 = r20
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r21
            r15 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r3 = 1544521708(0x5c0f87ec, float:1.61601477E17)
            r4 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r3, r4, r0)
            r3 = 6
            m106593h(r0, r1, r3)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0104
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0104:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x010b
            goto L_0x0123
        L_0x010b:
            com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHome$2 r10 = new com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHome$2
            r0 = r10
            r1 = r2
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r23
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.toolbar.ToolbarHomeKt.m106587b(androidx.compose.ui.m, com.carrefour.fid.android.presentation.viewmodels.home.state.i, boolean, float, float, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c(backgroundColor = 4294440951L, heightDp = 126, showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m106588c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1105689081);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1105689081, i, -1, "com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeCollapsedPreview (ToolbarHome.kt:184)");
            }
            ThemeKt.m153788a(ComposableSingletons$ToolbarHomeKt.f60545a.mo70837b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ToolbarHomeKt$ToolbarHomeCollapsedPreview$1(i));
        }
    }

    @C8540g
    @C16464c(backgroundColor = 4294440951L, heightDp = 166, showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m106589d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1316848563);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1316848563, i, -1, "com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeExtendedPreview (ToolbarHome.kt:170)");
            }
            ThemeKt.m153788a(ComposableSingletons$ToolbarHomeKt.f60545a.mo70836a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ToolbarHomeKt$ToolbarHomeExtendedPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106590e(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r28, float r29, float r30, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35) {
        /*
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r35
            java.lang.String r0 = "viewModel"
            r1 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onAccountClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "onSearchClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onScanClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = -321823436(0xffffffffecd15d34, float:-2.0248451E27)
            r2 = r34
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0033
            r3 = -1
            java.lang.String r8 = "com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeStateful (ToolbarHome.kt:44)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r3, r8)
        L_0x0033:
            kotlinx.coroutines.flow.u r0 = r28.mo76742M1()
            r3 = 8
            r8 = 1
            r9 = 0
            androidx.compose.runtime.k2 r0 = androidx.compose.runtime.C8415c2.m30233b(r0, r9, r2, r3, r8)
            kotlinx.coroutines.flow.n r8 = r28.getUiState()
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = new com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c
            r9 = r3
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 65535(0xffff, float:9.1834E-41)
            r27 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r12 = 72
            r13 = 2
            r11 = r2
            androidx.compose.runtime.k2 r3 = androidx.compose.runtime.C8415c2.m30232a(r8, r9, r10, r11, r12, r13)
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r3 = m106592g(r3)
            boolean r10 = r3.mo76955F()
            r8 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.state.i r9 = m106591f(r0)
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            r2.mo14918M(r0)
            boolean r0 = r2.mo15006n0(r4)
            boolean r3 = r2.mo15006n0(r5)
            r0 = r0 | r3
            boolean r3 = r2.mo15006n0(r6)
            r0 = r0 | r3
            java.lang.Object r3 = r2.mo14921N()
            if (r0 != 0) goto L_0x009f
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r3 != r0) goto L_0x00a7
        L_0x009f:
            com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHomeStateful$1$1 r3 = new com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHomeStateful$1$1
            r3.<init>(r4, r5, r6)
            r2.mo14893C(r3)
        L_0x00a7:
            r2.mo15002m0()
            r13 = r3
            kotlin.jvm.functions.l r13 = (kotlin.jvm.functions.C11300l) r13
            int r0 = r7 << 6
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r11 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r11
            r15 = r3 | r0
            r16 = 1
            r11 = r29
            r12 = r30
            r14 = r2
            m106587b(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00ca
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00ca:
            androidx.compose.runtime.t1 r8 = r2.mo15020s()
            if (r8 != 0) goto L_0x00d1
            goto L_0x00e8
        L_0x00d1:
            com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHomeStateful$2 r9 = new com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHomeStateful$2
            r0 = r9
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.toolbar.ToolbarHomeKt.m106590e(com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel, float, float, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: f */
    public static final C26509i m106591f(C8578k2<? extends C26509i> k2Var) {
        return (C26509i) k2Var.getValue();
    }

    /* renamed from: g */
    public static final C26406a.C26449c m106592g(C8578k2<C26406a.C26449c> k2Var) {
        return k2Var.getValue();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: h */
    public static final void m106593h(C11305q<? super C2362h, ? super C8592o, ? super Integer, C11079d2> qVar, C8592o oVar, int i) {
        int i2;
        int i3;
        C8592o o = oVar.mo15009o(-1662488488);
        if ((i & 14) == 0) {
            if (o.mo14927P(qVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1662488488, i2, -1, "com.carrefour.fid.android.presentation.ui.home.toolbar.WithBackgroundImage (ToolbarHome.kt:100)");
            }
            o.mo14918M(733328855);
            C8767m.C8768a aVar = C8767m.f23478j;
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            ImageKt.m8967b(C16015f.m71849d(R.drawable.home_image_header, o, 0), (String) null, boxScopeInstance.mo7701c(aVar, aVar2.mo17060A()), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 56, 120);
            qVar.invoke(boxScopeInstance, o, Integer.valueOf(((i2 << 3) & 112) | 6));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ToolbarHomeKt$WithBackgroundImage$2(qVar, i));
        }
    }
}
