package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nDeliveryChoiceRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryChoiceRadioButton.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/DeliveryChoiceRadioButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,219:1\n154#2:220\n154#2:221\n154#2:222\n154#2:285\n154#2:319\n154#2:320\n154#2:321\n154#2:327\n79#3,2:223\n81#3:251\n75#3,6:286\n81#3:318\n85#3:326\n85#3:337\n75#4:225\n76#4,11:227\n75#4:258\n76#4,11:260\n75#4:292\n76#4,11:294\n89#4:325\n89#4:331\n89#4:336\n76#5:226\n76#5:259\n76#5:293\n460#6,13:238\n460#6,13:271\n460#6,13:305\n473#6,3:322\n473#6,3:328\n473#6,3:333\n74#7,6:252\n80#7:284\n84#7:332\n*S KotlinDebug\n*F\n+ 1 DeliveryChoiceRadioButton.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/DeliveryChoiceRadioButtonKt\n*L\n51#1:220\n54#1:221\n56#1:222\n62#1:285\n66#1:319\n67#1:320\n75#1:321\n83#1:327\n47#1:223,2\n47#1:251\n59#1:286,6\n59#1:318\n59#1:326\n47#1:337\n47#1:225\n47#1:227,11\n58#1:258\n58#1:260,11\n59#1:292\n59#1:294,11\n59#1:325\n58#1:331\n47#1:336\n47#1:226\n58#1:259\n59#1:293\n47#1:238,13\n58#1:271,13\n59#1:305,13\n59#1:322,3\n58#1:328,3\n47#1:333,3\n58#1:252,6\n58#1:284\n58#1:332\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt */
public final class DeliveryChoiceRadioButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d3  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105018a(@org.jetbrains.annotations.C12579k java.lang.String r38, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r39, @org.jetbrains.annotations.C12580l java.lang.String r40, boolean r41, @org.jetbrains.annotations.C12580l java.lang.String r42, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r43, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r44, int r45, int r46) {
        /*
            r0 = r38
            r15 = r40
            r13 = r45
            java.lang.String r1 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = -1051561376(0xffffffffc1527260, float:-13.152924)
            r2 = r44
            androidx.compose.runtime.o r14 = r2.mo15009o(r1)
            r2 = r46 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r13 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x002a
            boolean r2 = r14.mo15006n0(r0)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r13
            goto L_0x002b
        L_0x002a:
            r2 = r13
        L_0x002b:
            r3 = r46 & 2
            if (r3 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r13 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r39
            boolean r6 = r14.mo15006n0(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r2 = r2 | r6
            goto L_0x0047
        L_0x0045:
            r5 = r39
        L_0x0047:
            r6 = r46 & 4
            if (r6 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004e:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005e
            boolean r6 = r14.mo15006n0(r15)
            if (r6 == 0) goto L_0x005b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r6
        L_0x005e:
            r6 = r46 & 8
            if (r6 == 0) goto L_0x0065
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0065:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0078
            r7 = r41
            boolean r8 = r14.mo14961b(r7)
            if (r8 == 0) goto L_0x0074
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r2 = r2 | r8
            goto L_0x007a
        L_0x0078:
            r7 = r41
        L_0x007a:
            r8 = r46 & 16
            if (r8 == 0) goto L_0x0081
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0096
        L_0x0081:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x0096
            r9 = r42
            boolean r10 = r14.mo15006n0(r9)
            if (r10 == 0) goto L_0x0092
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r2 = r2 | r10
            goto L_0x0098
        L_0x0096:
            r9 = r42
        L_0x0098:
            r10 = r46 & 32
            r27 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x00a1
            r2 = r2 | r27
            goto L_0x00b5
        L_0x00a1:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r13
            if (r11 != 0) goto L_0x00b5
            r11 = r43
            boolean r12 = r14.mo14927P(r11)
            if (r12 == 0) goto L_0x00b1
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r2 = r2 | r12
            goto L_0x00b7
        L_0x00b5:
            r11 = r43
        L_0x00b7:
            r12 = r2
            r2 = 374491(0x5b6db, float:5.24774E-40)
            r2 = r2 & r12
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r4) goto L_0x00d3
            boolean r2 = r14.mo15011p()
            if (r2 != 0) goto L_0x00c8
            goto L_0x00d3
        L_0x00c8:
            r14.mo14958a0()
            r2 = r5
            r4 = r7
            r5 = r9
            r6 = r11
            r27 = r14
            goto L_0x051d
        L_0x00d3:
            if (r3 == 0) goto L_0x00d8
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r5 = r2
        L_0x00d8:
            if (r6 == 0) goto L_0x00dd
            r28 = 0
            goto L_0x00df
        L_0x00dd:
            r28 = r7
        L_0x00df:
            if (r8 == 0) goto L_0x00e4
            r29 = 0
            goto L_0x00e6
        L_0x00e4:
            r29 = r9
        L_0x00e6:
            if (r10 == 0) goto L_0x00ed
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$DeliveryChoiceRadioButton$1 r4 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$DeliveryChoiceRadioButton$1.f59684f
            r30 = r4
            goto L_0x00ef
        L_0x00ed:
            r30 = r11
        L_0x00ef:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x00fb
            r4 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButton (DeliveryChoiceRadioButton.kt:32)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r12, r4, r6)
        L_0x00fb:
            if (r28 == 0) goto L_0x0104
            com.carrefour.fid.android.design.theme.b r1 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r6 = r1.mo114218O()
            goto L_0x010a
        L_0x0104:
            com.carrefour.fid.android.design.theme.b r1 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r6 = r1.mo114204A()
        L_0x010a:
            androidx.compose.material.t0 r1 = androidx.compose.material.C7933t0.f19075a
            int r11 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.f1 r4 = r1.mo11076b(r14, r11)
            androidx.compose.foundation.shape.e r4 = r4.mo10758e()
            androidx.compose.ui.m r4 = androidx.compose.p004ui.draw.C8744d.m32514a(r5, r4)
            r8 = 1
            float r9 = (float) r8
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            androidx.compose.foundation.i r6 = androidx.compose.foundation.C2250j.m9695a(r9, r6)
            r7 = 8
            float r10 = (float) r7
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            androidx.compose.foundation.shape.n r7 = androidx.compose.foundation.shape.C2694o.m12166h(r7)
            androidx.compose.ui.m r16 = androidx.compose.foundation.BorderKt.m8850f(r4, r6, r7)
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 7
            r22 = 0
            r20 = r30
            androidx.compose.ui.m r4 = androidx.compose.foundation.ClickableKt.m8878e(r16, r17, r18, r19, r20, r21, r22)
            r6 = 16
            float r6 = (float) r6
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10024k(r4, r6)
            androidx.compose.ui.c$a r16 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r6 = r16.mo17073w()
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f6010a
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            androidx.compose.foundation.layout.Arrangement$e r9 = r7.mo7638z(r9)
            r2 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo14918M(r2)
            r2 = 54
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.RowKt.m10071d(r9, r6, r14, r2)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r6)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r14.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r8 = r14.mo15032w(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p004ui.unit.LayoutDirection) r8
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r6 = r14.mo15032w(r6)
            androidx.compose.ui.platform.c4 r6 = (androidx.compose.p004ui.platform.C15863c4) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r3 = r17.mo44585a()
            kotlin.jvm.functions.q r4 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r4)
            androidx.compose.runtime.d r0 = r14.mo15017r()
            boolean r0 = r0 instanceof androidx.compose.runtime.C8428d
            if (r0 != 0) goto L_0x01a3
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01a3:
            r14.mo14938T()
            boolean r0 = r14.mo14997l()
            if (r0 == 0) goto L_0x01b0
            r14.mo14947W(r3)
            goto L_0x01b3
        L_0x01b0:
            r14.mo14888A()
        L_0x01b3:
            r14.mo14941U()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r3 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r0, r2, r3)
            kotlin.jvm.functions.p r2 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r0, r9, r2)
            kotlin.jvm.functions.p r2 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r0, r8, r2)
            kotlin.jvm.functions.p r2 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r0, r6, r2)
            r14.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4.invoke(r0, r14, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r9 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r22 = 2
            r23 = 0
            r18 = r9
            r19 = r8
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.C2411u0.m10660e(r18, r19, r20, r21, r22, r23)
            r3 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo14918M(r3)
            androidx.compose.foundation.layout.Arrangement$l r3 = r7.mo7631r()
            androidx.compose.ui.c$b r4 = r16.mo17072u()
            r6 = 0
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.ColumnKt.m9863b(r3, r4, r14, r6)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r14.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r0 = r14.mo15032w(r0)
            androidx.compose.ui.platform.c4 r0 = (androidx.compose.p004ui.platform.C15863c4) r0
            r19 = r1
            kotlin.jvm.functions.a r1 = r17.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            r20 = r5
            androidx.compose.runtime.d r5 = r14.mo15017r()
            boolean r5 = r5 instanceof androidx.compose.runtime.C8428d
            if (r5 != 0) goto L_0x0251
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0251:
            r14.mo14938T()
            boolean r5 = r14.mo14997l()
            if (r5 == 0) goto L_0x025e
            r14.mo14947W(r1)
            goto L_0x0261
        L_0x025e:
            r14.mo14888A()
        L_0x0261:
            r14.mo14941U()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r5 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r1, r3, r5)
            kotlin.jvm.functions.p r3 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r1, r4, r3)
            kotlin.jvm.functions.p r3 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r1, r6, r3)
            kotlin.jvm.functions.p r3 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r1, r0, r3)
            r14.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.invoke(r0, r14, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r0 = 0
            r2 = 0
            r3 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r8, r0, r3, r2)
            float r2 = (float) r1
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r3)
            r3 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo14918M(r3)
            androidx.compose.foundation.layout.Arrangement$d r3 = r7.mo7630p()
            androidx.compose.ui.c$c r4 = r16.mo17073w()
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.RowKt.m10071d(r3, r4, r14, r1)
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r1)
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r1 = r14.mo15032w(r1)
            androidx.compose.ui.unit.d r1 = (androidx.compose.p004ui.unit.C16479d) r1
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            kotlin.jvm.functions.a r6 = r17.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r7 = r14.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x02f8
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02f8:
            r14.mo14938T()
            boolean r7 = r14.mo14997l()
            if (r7 == 0) goto L_0x0305
            r14.mo14947W(r6)
            goto L_0x0308
        L_0x0305:
            r14.mo14888A()
        L_0x0308:
            r14.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r7 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r7)
            kotlin.jvm.functions.p r3 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r1, r3)
            kotlin.jvm.functions.p r1 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r1)
            kotlin.jvm.functions.p r1 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r5, r1)
            r14.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.invoke(r1, r14, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r0)
            r0 = 20
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10087C(r8, r0)
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r1)
            androidx.compose.material.b1 r2 = androidx.compose.material.C3030b1.f8083a
            com.carrefour.fid.android.design.theme.b r31 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r4 = r31.mo114218O()
            r6 = 0
            long r17 = r31.mo114204A()
            int r1 = androidx.compose.material.C3030b1.f8084b
            int r1 = r1 << 9
            r21 = 2
            r3 = r4
            r32 = r20
            r5 = r6
            r15 = r8
            r7 = r17
            r33 = r9
            r9 = r14
            r25 = r10
            r10 = r1
            r1 = r11
            r11 = r21
            androidx.compose.material.a1 r7 = r2.mo10719a(r3, r5, r7, r9, r10, r11)
            r5 = 0
            r6 = 0
            int r2 = r12 >> 9
            r2 = r2 & 14
            r2 = r2 | 384(0x180, float:5.38E-43)
            int r26 = r12 >> 12
            r3 = r26 & 112(0x70, float:1.57E-43)
            r9 = r2 | r3
            r10 = 24
            r2 = r28
            r3 = r30
            r4 = r0
            r8 = r14
            androidx.compose.material.RadioButtonKt.m13736a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.c$c r0 = r16.mo17070q()
            r2 = r33
            androidx.compose.ui.m r3 = r2.mo7845f(r15, r0)
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r25)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 14
            r9 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r3, r4, r5, r6, r7, r8, r9)
            r9 = r1
            r11 = r19
            r1 = r0
            androidx.compose.material.w1 r0 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r20 = r0.mo11098k()
            androidx.compose.ui.text.font.i0$a r33 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r7 = r33.mo46947c()
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r16 = 0
            r0 = r9
            r9 = r16
            r16 = 0
            r34 = r11
            r11 = r16
            r35 = r12
            r12 = r16
            r16 = 0
            r39 = r14
            r13 = r16
            r16 = 0
            r36 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = r35 & 14
            r22 = r21 | r27
            r23 = 0
            r24 = 65500(0xffdc, float:9.1785E-41)
            r37 = r0
            r0 = r38
            r21 = r39
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r39.mo15002m0()
            r39.mo14896D()
            r39.mo15002m0()
            r39.mo15002m0()
            r0 = 1123692368(0x42fa2f50, float:125.09241)
            r1 = r39
            r1.mo14918M(r0)
            if (r29 != 0) goto L_0x0412
            goto L_0x0459
        L_0x0412:
            r19 = 0
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r25)
            r21 = 0
            r22 = 0
            r23 = 13
            r24 = 0
            r18 = r36
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10028o(r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.material.w1 r0 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r22 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r0)
            long r4 = r31.mo114257y()
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r26 & 14
            r24 = r0 | 48
            r25 = 0
            r26 = 65528(0xfff8, float:9.1824E-41)
            r2 = r29
            r23 = r1
            androidx.compose.material.TextKt.m14196c(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
        L_0x0459:
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            if (r40 == 0) goto L_0x04b3
            r0 = 1123692653(0x42fa306d, float:125.09458)
            r1.mo14918M(r0)
            r0 = r34
            r3 = r37
            androidx.compose.material.w1 r0 = r0.mo11077c(r1, r3)
            androidx.compose.ui.text.p0 r20 = r0.mo11098k()
            androidx.compose.ui.text.font.i0 r7 = r33.mo46947c()
            r0 = 0
            r15 = r1
            r1 = r0
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = 0
            r39 = r15
            r15 = r0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            int r0 = r35 >> 6
            r0 = r0 & 14
            r22 = r0 | r27
            r23 = 0
            r24 = 65502(0xffde, float:9.1788E-41)
            r0 = r40
            r21 = r39
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r39.mo15002m0()
            r27 = r39
            goto L_0x0500
        L_0x04b3:
            r39 = r1
            r0 = r34
            r3 = r37
            r1 = 1123692768(0x42fa30e0, float:125.09546)
            r15 = r39
            r15.mo14918M(r1)
            r1 = 2131952166(0x7f130226, float:1.9540767E38)
            r2 = 0
            java.lang.String r2 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r15, r2)
            androidx.compose.material.w1 r0 = r0.mo11077c(r15, r3)
            androidx.compose.ui.text.p0 r22 = r0.mo11098k()
            androidx.compose.ui.text.font.i0 r9 = r33.mo46947c()
            long r4 = r31.mo114227X()
            r3 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r0 = 0
            r27 = r15
            r15 = r0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 196608(0x30000, float:2.75506E-40)
            r25 = 0
            r26 = 65498(0xffda, float:9.1782E-41)
            r23 = r27
            androidx.compose.material.TextKt.m14196c(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r27.mo15002m0()
        L_0x0500:
            r27.mo15002m0()
            r27.mo14896D()
            r27.mo15002m0()
            r27.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0515
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0515:
            r4 = r28
            r5 = r29
            r6 = r30
            r2 = r32
        L_0x051d:
            androidx.compose.runtime.t1 r9 = r27.mo15020s()
            if (r9 != 0) goto L_0x0524
            goto L_0x0535
        L_0x0524:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$DeliveryChoiceRadioButton$3 r10 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$DeliveryChoiceRadioButton$3
            r0 = r10
            r1 = r38
            r3 = r40
            r7 = r45
            r8 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x0535:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt.m105018a(java.lang.String, androidx.compose.ui.m, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105019b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r16, @org.jetbrains.annotations.C12579k java.lang.String r17, boolean r18, @org.jetbrains.annotations.C12580l java.lang.String r19, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r9 = r17
            r10 = r22
            java.lang.String r0 = "price"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 143505110(0x88db6d6, float:8.529113E-34)
            r1 = r21
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r23 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r10 | 6
            r3 = r2
            r2 = r16
            goto L_0x0030
        L_0x001c:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r16
            boolean r3 = r11.mo15006n0(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r10
            goto L_0x0030
        L_0x002d:
            r2 = r16
            r3 = r10
        L_0x0030:
            r4 = r23 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x0047
        L_0x0037:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0047
            boolean r4 = r11.mo15006n0(r9)
            if (r4 == 0) goto L_0x0044
            r4 = 32
            goto L_0x0046
        L_0x0044:
            r4 = 16
        L_0x0046:
            r3 = r3 | r4
        L_0x0047:
            r4 = r23 & 4
            if (r4 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0061
            r5 = r18
            boolean r6 = r11.mo14961b(r5)
            if (r6 == 0) goto L_0x005d
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r6
            goto L_0x0063
        L_0x0061:
            r5 = r18
        L_0x0063:
            r6 = r23 & 8
            if (r6 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r12 = r19
            goto L_0x007e
        L_0x006c:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            r12 = r19
            if (r6 != 0) goto L_0x007e
            boolean r6 = r11.mo15006n0(r12)
            if (r6 == 0) goto L_0x007b
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r6
        L_0x007e:
            r6 = r23 & 16
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0088
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0088:
            r8 = r10 & r7
            if (r8 != 0) goto L_0x009b
            r8 = r20
            boolean r13 = r11.mo14927P(r8)
            if (r13 == 0) goto L_0x0097
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r3 = r3 | r13
            goto L_0x009d
        L_0x009b:
            r8 = r20
        L_0x009d:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r3
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b3
            boolean r13 = r11.mo15011p()
            if (r13 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r11.mo14958a0()
            r1 = r2
            r3 = r5
            r5 = r8
            goto L_0x0108
        L_0x00b3:
            if (r1 == 0) goto L_0x00b9
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r13 = r1
            goto L_0x00ba
        L_0x00b9:
            r13 = r2
        L_0x00ba:
            r1 = 0
            if (r4 == 0) goto L_0x00bf
            r14 = r1
            goto L_0x00c0
        L_0x00bf:
            r14 = r5
        L_0x00c0:
            if (r6 == 0) goto L_0x00c6
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$EconomicDeliveryChoiceRadioButton$1 r2 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$EconomicDeliveryChoiceRadioButton$1.f59685f
            r15 = r2
            goto L_0x00c7
        L_0x00c6:
            r15 = r8
        L_0x00c7:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00d3
            r2 = -1
            java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.EconomicDeliveryChoiceRadioButton (DeliveryChoiceRadioButton.kt:103)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r2, r4)
        L_0x00d3:
            r0 = 0
            r2 = 0
            r4 = 1
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10114n(r13, r0, r4, r2)
            r0 = 2131952164(0x7f130224, float:1.9540763E38)
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r11, r1)
            int r1 = r3 << 3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = r1 & r7
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r4
            r7 = r3 | r1
            r8 = 0
            r1 = r2
            r2 = r17
            r3 = r14
            r4 = r19
            r5 = r15
            r6 = r11
            m105018a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0105
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0105:
            r1 = r13
            r3 = r14
            r5 = r15
        L_0x0108:
            androidx.compose.runtime.t1 r8 = r11.mo15020s()
            if (r8 != 0) goto L_0x010f
            goto L_0x0120
        L_0x010f:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$EconomicDeliveryChoiceRadioButton$2 r11 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$EconomicDeliveryChoiceRadioButton$2
            r0 = r11
            r2 = r17
            r4 = r19
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r11)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt.m105019b(androidx.compose.ui.m, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m105020c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(439989041);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(439989041, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.EconomicDeliveryChoiceRadioButtonPreview (DeliveryChoiceRadioButton.kt:179)");
            }
            ThemeKt.m153788a(ComposableSingletons$DeliveryChoiceRadioButtonKt.f59621a.mo69235b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C23647x9f0315(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105021d(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r16, @org.jetbrains.annotations.C12579k java.lang.String r17, boolean r18, @org.jetbrains.annotations.C12580l java.lang.String r19, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r9 = r17
            r10 = r22
            java.lang.String r0 = "price"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -1210345275(0xffffffffb7db98c5, float:-2.6177973E-5)
            r1 = r21
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r23 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r10 | 6
            r3 = r2
            r2 = r16
            goto L_0x0030
        L_0x001c:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r16
            boolean r3 = r11.mo15006n0(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r10
            goto L_0x0030
        L_0x002d:
            r2 = r16
            r3 = r10
        L_0x0030:
            r4 = r23 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x0047
        L_0x0037:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0047
            boolean r4 = r11.mo15006n0(r9)
            if (r4 == 0) goto L_0x0044
            r4 = 32
            goto L_0x0046
        L_0x0044:
            r4 = 16
        L_0x0046:
            r3 = r3 | r4
        L_0x0047:
            r4 = r23 & 4
            if (r4 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0061
            r5 = r18
            boolean r6 = r11.mo14961b(r5)
            if (r6 == 0) goto L_0x005d
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r6
            goto L_0x0063
        L_0x0061:
            r5 = r18
        L_0x0063:
            r6 = r23 & 8
            if (r6 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r12 = r19
            goto L_0x007e
        L_0x006c:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            r12 = r19
            if (r6 != 0) goto L_0x007e
            boolean r6 = r11.mo15006n0(r12)
            if (r6 == 0) goto L_0x007b
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r6
        L_0x007e:
            r6 = r23 & 16
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0088
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0088:
            r8 = r10 & r7
            if (r8 != 0) goto L_0x009b
            r8 = r20
            boolean r13 = r11.mo14927P(r8)
            if (r13 == 0) goto L_0x0097
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r3 = r3 | r13
            goto L_0x009d
        L_0x009b:
            r8 = r20
        L_0x009d:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r3
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b3
            boolean r13 = r11.mo15011p()
            if (r13 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r11.mo14958a0()
            r1 = r2
            r3 = r5
            r5 = r8
            goto L_0x0108
        L_0x00b3:
            if (r1 == 0) goto L_0x00b9
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r13 = r1
            goto L_0x00ba
        L_0x00b9:
            r13 = r2
        L_0x00ba:
            r1 = 0
            if (r4 == 0) goto L_0x00bf
            r14 = r1
            goto L_0x00c0
        L_0x00bf:
            r14 = r5
        L_0x00c0:
            if (r6 == 0) goto L_0x00c6
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$NonAlExpressChoiceRadioButton$1 r2 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$NonAlExpressChoiceRadioButton$1.f59686f
            r15 = r2
            goto L_0x00c7
        L_0x00c6:
            r15 = r8
        L_0x00c7:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00d3
            r2 = -1
            java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.NonAlExpressChoiceRadioButton (DeliveryChoiceRadioButton.kt:141)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r2, r4)
        L_0x00d3:
            r0 = 0
            r2 = 0
            r4 = 1
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10114n(r13, r0, r4, r2)
            r0 = 2131952165(0x7f130225, float:1.9540765E38)
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r11, r1)
            int r1 = r3 << 3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = r1 & r7
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r4
            r7 = r3 | r1
            r8 = 0
            r1 = r2
            r2 = r17
            r3 = r14
            r4 = r19
            r5 = r15
            r6 = r11
            m105018a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0105
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0105:
            r1 = r13
            r3 = r14
            r5 = r15
        L_0x0108:
            androidx.compose.runtime.t1 r8 = r11.mo15020s()
            if (r8 != 0) goto L_0x010f
            goto L_0x0120
        L_0x010f:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$NonAlExpressChoiceRadioButton$2 r11 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$NonAlExpressChoiceRadioButton$2
            r0 = r11
            r2 = r17
            r4 = r19
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r11)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt.m105021d(androidx.compose.ui.m, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105022e(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r18, boolean r19, @org.jetbrains.annotations.C12580l java.lang.String r20, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r5 = r23
            r0 = 1118028248(0x42a3c1d8, float:81.8786)
            r1 = r22
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r24 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r5 | 6
            r4 = r3
            r3 = r18
            goto L_0x0029
        L_0x0015:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r18
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
            r3 = r18
            r4 = r5
        L_0x0029:
            r6 = r24 & 2
            if (r6 == 0) goto L_0x0030
            r4 = r4 | 48
            goto L_0x0043
        L_0x0030:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0043
            r7 = r19
            boolean r8 = r1.mo14961b(r7)
            if (r8 == 0) goto L_0x003f
            r8 = 32
            goto L_0x0041
        L_0x003f:
            r8 = 16
        L_0x0041:
            r4 = r4 | r8
            goto L_0x0045
        L_0x0043:
            r7 = r19
        L_0x0045:
            r8 = r24 & 4
            if (r8 == 0) goto L_0x004e
            r4 = r4 | 384(0x180, float:5.38E-43)
            r15 = r20
            goto L_0x0060
        L_0x004e:
            r8 = r5 & 896(0x380, float:1.256E-42)
            r15 = r20
            if (r8 != 0) goto L_0x0060
            boolean r8 = r1.mo15006n0(r15)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r4 = r4 | r8
        L_0x0060:
            r8 = r24 & 8
            if (r8 == 0) goto L_0x0067
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x0067:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007a
            r9 = r21
            boolean r10 = r1.mo14927P(r9)
            if (r10 == 0) goto L_0x0076
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r4 = r4 | r10
            goto L_0x007c
        L_0x007a:
            r9 = r21
        L_0x007c:
            r10 = r4 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x0091
            boolean r10 = r1.mo15011p()
            if (r10 != 0) goto L_0x0089
            goto L_0x0091
        L_0x0089:
            r1.mo14958a0()
            r2 = r3
            r16 = r7
            r4 = r9
            goto L_0x00e9
        L_0x0091:
            if (r2 == 0) goto L_0x0096
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0097
        L_0x0096:
            r2 = r3
        L_0x0097:
            r3 = 0
            if (r6 == 0) goto L_0x009d
            r16 = r3
            goto L_0x009f
        L_0x009d:
            r16 = r7
        L_0x009f:
            if (r8 == 0) goto L_0x00a6
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$PickupDeliveryChoiceRadioButton$1 r6 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$PickupDeliveryChoiceRadioButton$1.f59687f
            r17 = r6
            goto L_0x00a8
        L_0x00a6:
            r17 = r9
        L_0x00a8:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x00b4
            r6 = -1
            java.lang.String r7 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupDeliveryChoiceRadioButton (DeliveryChoiceRadioButton.kt:160)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r6, r7)
        L_0x00b4:
            r0 = 0
            r6 = 0
            r7 = 1
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r0, r7, r6)
            r0 = 2131952170(0x7f13022a, float:1.9540775E38)
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r3)
            r8 = 0
            int r0 = r4 << 6
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | 384(0x180, float:5.38E-43)
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r0
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r4
            r13 = r3 | r0
            r14 = 0
            r9 = r16
            r10 = r20
            r11 = r17
            r12 = r1
            m105018a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00e7
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00e7:
            r4 = r17
        L_0x00e9:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x00f0
            goto L_0x0102
        L_0x00f0:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$PickupDeliveryChoiceRadioButton$2 r8 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$PickupDeliveryChoiceRadioButton$2
            r0 = r8
            r1 = r2
            r2 = r16
            r3 = r20
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt.m105022e(androidx.compose.ui.m, boolean, java.lang.String, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m105023f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(761242058);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(761242058, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupDeliveryChoiceRadioButtonPreview (DeliveryChoiceRadioButton.kt:207)");
            }
            ThemeKt.m153788a(ComposableSingletons$DeliveryChoiceRadioButtonKt.f59621a.mo69239f(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C23648xf0ec989c(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105024g(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r16, @org.jetbrains.annotations.C12579k java.lang.String r17, boolean r18, @org.jetbrains.annotations.C12580l java.lang.String r19, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r9 = r17
            r10 = r22
            java.lang.String r0 = "price"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 290603422(0x1152419e, float:1.6586299E-28)
            r1 = r21
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r23 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r10 | 6
            r3 = r2
            r2 = r16
            goto L_0x0030
        L_0x001c:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r16
            boolean r3 = r11.mo15006n0(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r10
            goto L_0x0030
        L_0x002d:
            r2 = r16
            r3 = r10
        L_0x0030:
            r4 = r23 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x0047
        L_0x0037:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0047
            boolean r4 = r11.mo15006n0(r9)
            if (r4 == 0) goto L_0x0044
            r4 = 32
            goto L_0x0046
        L_0x0044:
            r4 = 16
        L_0x0046:
            r3 = r3 | r4
        L_0x0047:
            r4 = r23 & 4
            if (r4 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0061
            r5 = r18
            boolean r6 = r11.mo14961b(r5)
            if (r6 == 0) goto L_0x005d
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r6
            goto L_0x0063
        L_0x0061:
            r5 = r18
        L_0x0063:
            r6 = r23 & 8
            if (r6 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r12 = r19
            goto L_0x007e
        L_0x006c:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            r12 = r19
            if (r6 != 0) goto L_0x007e
            boolean r6 = r11.mo15006n0(r12)
            if (r6 == 0) goto L_0x007b
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r6
        L_0x007e:
            r6 = r23 & 16
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0088
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0088:
            r8 = r10 & r7
            if (r8 != 0) goto L_0x009b
            r8 = r20
            boolean r13 = r11.mo14927P(r8)
            if (r13 == 0) goto L_0x0097
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r3 = r3 | r13
            goto L_0x009d
        L_0x009b:
            r8 = r20
        L_0x009d:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r3
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b3
            boolean r13 = r11.mo15011p()
            if (r13 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r11.mo14958a0()
            r1 = r2
            r3 = r5
            r5 = r8
            goto L_0x0108
        L_0x00b3:
            if (r1 == 0) goto L_0x00b9
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r13 = r1
            goto L_0x00ba
        L_0x00b9:
            r13 = r2
        L_0x00ba:
            r1 = 0
            if (r4 == 0) goto L_0x00bf
            r14 = r1
            goto L_0x00c0
        L_0x00bf:
            r14 = r5
        L_0x00c0:
            if (r6 == 0) goto L_0x00c6
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$StandardDeliveryChoiceRadioButton$1 r2 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$StandardDeliveryChoiceRadioButton$1.f59688f
            r15 = r2
            goto L_0x00c7
        L_0x00c6:
            r15 = r8
        L_0x00c7:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00d3
            r2 = -1
            java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.StandardDeliveryChoiceRadioButton (DeliveryChoiceRadioButton.kt:122)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r2, r4)
        L_0x00d3:
            r0 = 0
            r2 = 0
            r4 = 1
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10114n(r13, r0, r4, r2)
            r0 = 2131952174(0x7f13022e, float:1.9540783E38)
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r11, r1)
            int r1 = r3 << 3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = r1 & r7
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r4
            r7 = r3 | r1
            r8 = 0
            r1 = r2
            r2 = r17
            r3 = r14
            r4 = r19
            r5 = r15
            r6 = r11
            m105018a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0105
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0105:
            r1 = r13
            r3 = r14
            r5 = r15
        L_0x0108:
            androidx.compose.runtime.t1 r8 = r11.mo15020s()
            if (r8 != 0) goto L_0x010f
            goto L_0x0120
        L_0x010f:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$StandardDeliveryChoiceRadioButton$2 r11 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt$StandardDeliveryChoiceRadioButton$2
            r0 = r11
            r2 = r17
            r4 = r19
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r11)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt.m105024g(androidx.compose.ui.m, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m105025h(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(471043945);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(471043945, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.StandardDeliveryChoiceRadioButtonPreview (DeliveryChoiceRadioButton.kt:193)");
            }
            ThemeKt.m153788a(ComposableSingletons$DeliveryChoiceRadioButtonKt.f59621a.mo69237d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C23649x5dceafdd(i));
        }
    }
}
