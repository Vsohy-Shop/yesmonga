package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nOrderOnlineEmptyScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderOnlineEmptyScreen.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderOnlineEmptyScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,93:1\n154#2:94\n154#2:124\n154#2:125\n154#2:126\n154#2:127\n154#2:128\n78#3,2:95\n80#3:123\n84#3:140\n75#4:97\n76#4,11:99\n89#4:139\n76#5:98\n460#6,13:110\n36#6:129\n473#6,3:136\n1114#7,6:130\n*S KotlinDebug\n*F\n+ 1 OrderOnlineEmptyScreen.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderOnlineEmptyScreenKt\n*L\n40#1:94\n48#1:124\n64#1:125\n69#1:126\n73#1:127\n74#1:128\n38#1:95,2\n38#1:123\n38#1:140\n38#1:97\n38#1:99,11\n38#1:139\n38#1:98\n38#1:110,13\n70#1:129\n38#1:136,3\n70#1:130,6\n*E\n"})
public final class OrderOnlineEmptyScreenKt {
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m114503a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r36, int r37, int r38, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r39, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r40, int r41, int r42) {
        /*
            r5 = r41
            r0 = -1954387713(0xffffffff8b8268ff, float:-5.023216E-32)
            r1 = r40
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r42 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r5 | 6
            r4 = r3
            r3 = r36
            goto L_0x0029
        L_0x0015:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r36
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
            r3 = r36
            r4 = r5
        L_0x0029:
            r6 = r5 & 112(0x70, float:1.57E-43)
            r7 = 32
            r8 = 16
            if (r6 != 0) goto L_0x0044
            r6 = r42 & 2
            if (r6 != 0) goto L_0x003f
            r6 = r37
            boolean r9 = r1.mo14976f(r6)
            if (r9 == 0) goto L_0x0041
            r9 = r7
            goto L_0x0042
        L_0x003f:
            r6 = r37
        L_0x0041:
            r9 = r8
        L_0x0042:
            r4 = r4 | r9
            goto L_0x0046
        L_0x0044:
            r6 = r37
        L_0x0046:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005f
            r9 = r42 & 4
            if (r9 != 0) goto L_0x0059
            r9 = r38
            boolean r10 = r1.mo14976f(r9)
            if (r10 == 0) goto L_0x005b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x0059:
            r9 = r38
        L_0x005b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r10
            goto L_0x0061
        L_0x005f:
            r9 = r38
        L_0x0061:
            r10 = r42 & 8
            if (r10 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r11 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007b
            r11 = r39
            boolean r12 = r1.mo14927P(r11)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r12
            goto L_0x007d
        L_0x007b:
            r11 = r39
        L_0x007d:
            r12 = r4 & 5851(0x16db, float:8.199E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r12 != r13) goto L_0x0091
            boolean r12 = r1.mo15011p()
            if (r12 != 0) goto L_0x008a
            goto L_0x0091
        L_0x008a:
            r1.mo14958a0()
            r2 = r6
            r4 = r11
            goto L_0x02f4
        L_0x0091:
            r1.mo14930Q()
            r12 = r5 & 1
            if (r12 == 0) goto L_0x00b4
            boolean r12 = r1.mo14977f0()
            if (r12 == 0) goto L_0x009f
            goto L_0x00b4
        L_0x009f:
            r1.mo14958a0()
            r2 = r42 & 2
            if (r2 == 0) goto L_0x00a8
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a8:
            r2 = r42 & 4
            if (r2 == 0) goto L_0x00ae
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ae:
            r2 = r3
            r14 = r4
            r3 = r6
        L_0x00b1:
            r4 = r9
            r15 = r11
            goto L_0x00d9
        L_0x00b4:
            if (r2 == 0) goto L_0x00b9
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00ba
        L_0x00b9:
            r2 = r3
        L_0x00ba:
            r3 = r42 & 2
            if (r3 == 0) goto L_0x00c4
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            r3 = 2131953366(0x7f1306d6, float:1.95432E38)
            goto L_0x00c5
        L_0x00c4:
            r3 = r6
        L_0x00c5:
            r6 = r42 & 4
            if (r6 == 0) goto L_0x00cf
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r6 = 2131953365(0x7f1306d5, float:1.9543199E38)
            r9 = r6
        L_0x00cf:
            if (r10 == 0) goto L_0x00d7
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenKt$OrderOnlineEmptyScreen$1 r6 = com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenKt$OrderOnlineEmptyScreen$1.f65863f
            r14 = r4
            r15 = r6
            r4 = r9
            goto L_0x00d9
        L_0x00d7:
            r14 = r4
            goto L_0x00b1
        L_0x00d9:
            r1.mo14899E()
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x00e8
            r6 = -1
            java.lang.String r9 = "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreen (OrderOnlineEmptyScreen.kt:31)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r6, r9)
        L_0x00e8:
            float r0 = (float) r8
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.PaddingKt.m10024k(r2, r6)
            r13 = 0
            r12 = 1
            r11 = 0
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10112l(r6, r13, r12, r11)
            androidx.compose.ui.c$a r8 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r8 = r8.mo17068m()
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r9 = r9.mo7625f()
            r10 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r10)
            r10 = 54
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.ColumnKt.m9863b(r9, r8, r1, r10)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.platform.c4 r11 = (androidx.compose.p004ui.platform.C15863c4) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r16.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r13 = r1.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x0149
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0149:
            r1.mo14938T()
            boolean r13 = r1.mo14997l()
            if (r13 == 0) goto L_0x0156
            r1.mo14947W(r12)
            goto L_0x0159
        L_0x0156:
            r1.mo14888A()
        L_0x0159:
            r1.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r13 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r13)
            kotlin.jvm.functions.p r8 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r8)
            kotlin.jvm.functions.p r8 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r8)
            kotlin.jvm.functions.p r8 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r11, r8)
            r1.mo14972e()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r8 = androidx.compose.runtime.C8684u1.m31905a(r8)
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r6.invoke(r8, r1, r10)
            r6 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r6)
            androidx.compose.foundation.layout.ColumnScopeInstance r13 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r6 = 2131231474(0x7f0802f2, float:1.807903E38)
            androidx.compose.ui.graphics.painter.Painter r6 = androidx.compose.p004ui.res.C16015f.m71849d(r6, r1, r9)
            r8 = 0
            androidx.compose.ui.m$a r12 = androidx.compose.p004ui.C8767m.f23478j
            r17 = 0
            r9 = 48
            float r9 = (float) r9
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            r19 = 0
            float r7 = (float) r7
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            r21 = 5
            r22 = 0
            r16 = r12
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r10 = 0
            r11 = 0
            r16 = 0
            r17 = 0
            r18 = 440(0x1b8, float:6.17E-43)
            r19 = 120(0x78, float:1.68E-43)
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r16
            r36 = r12
            r12 = r17
            r31 = r13
            r13 = r1
            r32 = r14
            r14 = r18
            r37 = r2
            r2 = r15
            r15 = r19
            androidx.compose.foundation.ImageKt.m8967b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            int r6 = r32 >> 3
            r33 = 14
            r6 = r6 & 14
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r1, r6)
            androidx.compose.material.t0 r7 = androidx.compose.material.C7933t0.f19075a
            int r8 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r7 = r7.mo11077c(r1, r8)
            androidx.compose.ui.text.p0 r26 = com.carrefour.fid.android.design.theme.C37477d.m153895g(r7)
            androidx.compose.ui.text.font.i0$a r7 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r13 = r7.mo46947c()
            com.carrefour.fid.android.design.theme.b r34 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r8 = r34.mo114220Q()
            androidx.compose.ui.text.style.i$a r35 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r18 = r35.mo47667a()
            r7 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            androidx.compose.ui.text.style.i r18 = androidx.compose.p004ui.text.style.C16432i.m74172g(r18)
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 196608(0x30000, float:2.75506E-40)
            r29 = 0
            r30 = 64986(0xfdda, float:9.1065E-41)
            r27 = r1
            androidx.compose.material.TextKt.m14196c(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            int r6 = r32 >> 6
            r6 = r6 & 14
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r1, r6)
            long r10 = androidx.compose.p004ui.unit.C16506u.m74712m(r33)
            long r8 = r34.mo114257y()
            int r23 = r35.mo47667a()
            r17 = 0
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r19 = 0
            r20 = 0
            r21 = 13
            r22 = 0
            r16 = r36
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = r31
            r15 = 1
            androidx.compose.ui.m r7 = r13.mo7712b(r7, r12, r15)
            r12 = 0
            r13 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            androidx.compose.ui.text.style.i r18 = androidx.compose.p004ui.text.style.C16432i.m74172g(r23)
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r28 = 3072(0xc00, float:4.305E-42)
            r30 = 130544(0x1fdf0, float:1.82931E-40)
            androidx.compose.material.TextKt.m14196c(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r6 = 20
            float r6 = (float) r6
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.foundation.shape.n r11 = androidx.compose.foundation.shape.C2694o.m12166h(r6)
            r6 = r36
            r7 = 0
            r8 = 0
            r9 = 1
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10114n(r6, r8, r9, r7)
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10024k(r6, r0)
            r6 = 50
            float r6 = (float) r6
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r6)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r2)
            java.lang.Object r6 = r1.mo14921N()
            if (r0 != 0) goto L_0x02b7
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r6 != r0) goto L_0x02bf
        L_0x02b7:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenKt$OrderOnlineEmptyScreen$2$1$1 r6 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenKt$OrderOnlineEmptyScreen$2$1$1
            r6.<init>(r2)
            r1.mo14893C(r6)
        L_0x02bf:
            r1.mo15002m0()
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.ComposableSingletons$OrderOnlineEmptyScreenKt r0 = com.carrefour.fid.android.presentation.viewmodels.order.refont.view.ComposableSingletons$OrderOnlineEmptyScreenKt.f65827a
            kotlin.jvm.functions.q r15 = r0.mo78673a()
            r17 = 805306416(0x30000030, float:4.6566395E-10)
            r18 = 476(0x1dc, float:6.67E-43)
            r16 = r1
            androidx.compose.material.ButtonKt.m13343a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02ef
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02ef:
            r9 = r4
            r4 = r2
            r2 = r3
            r3 = r37
        L_0x02f4:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x02fb
            goto L_0x030a
        L_0x02fb:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenKt$OrderOnlineEmptyScreen$3 r8 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenKt$OrderOnlineEmptyScreen$3
            r0 = r8
            r1 = r3
            r3 = r9
            r5 = r41
            r6 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x030a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenKt.m114503a(androidx.compose.ui.m, int, int, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m114504b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1183679258);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1183679258, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenPreview (OrderOnlineEmptyScreen.kt:85)");
            }
            ThemeKt.m153788a(ComposableSingletons$OrderOnlineEmptyScreenKt.f65827a.mo78675c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderOnlineEmptyScreenKt$OrderOnlineEmptyScreenPreview$1(i));
        }
    }
}
