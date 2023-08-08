package com.carrefour.fid.android.checkout.presentation.p071ui.slot.component;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTodayBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayBanner.kt\ncom/carrefour/fid/android/checkout/presentation/ui/slot/component/TodayBannerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,119:1\n154#2:120\n154#2:154\n154#2:155\n154#2:156\n154#2:157\n154#2:191\n154#2:192\n154#2:234\n74#3,6:121\n80#3:153\n73#3,7:193\n80#3:226\n84#3:239\n84#3:249\n75#4:127\n76#4,11:129\n75#4:164\n76#4,11:166\n75#4:200\n76#4,11:202\n89#4:238\n89#4:243\n89#4:248\n76#5:128\n76#5:165\n76#5:201\n460#6,13:140\n460#6,13:177\n460#6,13:213\n473#6,3:235\n473#6,3:240\n473#6,3:245\n75#7,6:158\n81#7:190\n85#7:244\n1098#8:227\n927#8,6:228\n*S KotlinDebug\n*F\n+ 1 TodayBanner.kt\ncom/carrefour/fid/android/checkout/presentation/ui/slot/component/TodayBannerKt\n*L\n42#1:120\n46#1:154\n58#1:155\n59#1:156\n63#1:157\n67#1:191\n71#1:192\n95#1:234\n39#1:121,6\n39#1:153\n72#1:193,7\n72#1:226\n72#1:239\n39#1:249\n39#1:127\n39#1:129,11\n54#1:164\n54#1:166,11\n72#1:200\n72#1:202,11\n72#1:238\n54#1:243\n39#1:248\n39#1:128\n54#1:165\n72#1:201\n39#1:140,13\n54#1:177,13\n72#1:213,13\n72#1:235,3\n54#1:240,3\n39#1:245,3\n54#1:158,6\n54#1:190\n54#1:244\n74#1:227\n85#1:228,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.component.TodayBannerKt */
public final class TodayBannerKt {
    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m162649a(boolean r71, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r72, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r73, int r74, int r75) {
        /*
            r0 = r71
            r1 = r74
            r2 = r75
            r3 = 968200287(0x39b5905f, float:3.4630575E-4)
            r4 = r73
            androidx.compose.runtime.o r15 = r4.mo15009o(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r1 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r1 & 14
            if (r4 != 0) goto L_0x0025
            boolean r4 = r15.mo14961b(r0)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r1
            goto L_0x0026
        L_0x0025:
            r4 = r1
        L_0x0026:
            r5 = r2 & 2
            r13 = 32
            r6 = 16
            if (r5 == 0) goto L_0x0031
            r4 = r4 | 48
            goto L_0x0042
        L_0x0031:
            r7 = r1 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0042
            r7 = r72
            boolean r8 = r15.mo14927P(r7)
            if (r8 == 0) goto L_0x003f
            r8 = r13
            goto L_0x0040
        L_0x003f:
            r8 = r6
        L_0x0040:
            r4 = r4 | r8
            goto L_0x0044
        L_0x0042:
            r7 = r72
        L_0x0044:
            r4 = r4 & 91
            r8 = 18
            if (r4 != r8) goto L_0x0058
            boolean r4 = r15.mo15011p()
            if (r4 != 0) goto L_0x0051
            goto L_0x0058
        L_0x0051:
            r15.mo14958a0()
            r29 = r15
            goto L_0x04aa
        L_0x0058:
            if (r5 == 0) goto L_0x005f
            com.carrefour.fid.android.checkout.presentation.ui.slot.component.TodayBannerKt$TodayBanner$1 r4 = com.carrefour.fid.android.checkout.presentation.p071ui.slot.component.TodayBannerKt$TodayBanner$1.f101801f
            r30 = r4
            goto L_0x0061
        L_0x005f:
            r30 = r7
        L_0x0061:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x006d
            r4 = -1
            java.lang.String r5 = "com.carrefour.fid.android.checkout.presentation.ui.slot.component.TodayBanner (TodayBanner.kt:37)"
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r4, r5)
        L_0x006d:
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r14 = 0
            r12 = 1
            r11 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r14, r12, r11)
            float r10 = (float) r6
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10024k(r4, r5)
            r8 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r8)
            androidx.compose.foundation.layout.Arrangement r29 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r5 = r29.mo7631r()
            androidx.compose.ui.c$a r31 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r6 = r31.mo17072u()
            r9 = 0
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.ColumnKt.m9863b(r5, r6, r15, r9)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r6)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r15.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r32 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r32.mo44585a()
            kotlin.jvm.functions.q r4 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r4)
            androidx.compose.runtime.d r12 = r15.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x00cf
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00cf:
            r15.mo14938T()
            boolean r12 = r15.mo14997l()
            if (r12 == 0) goto L_0x00dc
            r15.mo14947W(r11)
            goto L_0x00df
        L_0x00dc:
            r15.mo14888A()
        L_0x00df:
            r15.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r12 = r32.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r5, r12)
            kotlin.jvm.functions.p r5 = r32.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r7, r5)
            kotlin.jvm.functions.p r5 = r32.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r6, r5)
            kotlin.jvm.functions.p r5 = r32.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r8, r5)
            r15.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r4.invoke(r5, r15, r6)
            r12 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r12)
            androidx.compose.foundation.layout.ColumnScopeInstance r4 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            int r4 = com.carrefour.fid.android.checkout.C39805b.C39823r.today_title
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r15, r9)
            r17 = 0
            r18 = 0
            r19 = 0
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            r21 = 7
            r22 = 0
            r16 = r3
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r6 = 0
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r16 = 0
            r8 = r16
            r16 = 0
            r34 = r10
            r10 = r16
            r11 = r16
            r12 = r16
            r16 = 0
            r13 = r16
            r16 = 0
            r72 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.ui.text.font.u r48 = com.carrefour.fid.android.design.theme.C37477d.m153883J()
            androidx.compose.ui.text.font.i0$a r70 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r45 = r70.mo46947c()
            r24 = 14
            long r43 = androidx.compose.p004ui.unit.C16506u.m74712m(r24)
            androidx.compose.ui.text.p0 r40 = new androidx.compose.ui.text.p0
            r24 = r40
            r41 = 0
            r46 = 0
            r47 = 0
            r49 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 4194265(0x3fffd9, float:5.877417E-39)
            r69 = 0
            r40.<init>((long) r41, (long) r43, (androidx.compose.p004ui.text.font.C16209i0) r45, (androidx.compose.p004ui.text.font.C16190e0) r46, (androidx.compose.p004ui.text.font.C16194f0) r47, (androidx.compose.p004ui.text.font.C16242u) r48, (java.lang.String) r49, (long) r50, (androidx.compose.p004ui.text.style.C16410a) r52, (androidx.compose.p004ui.text.style.C16439m) r53, (androidx.compose.p004ui.text.intl.C16342f) r54, (long) r55, (androidx.compose.p004ui.text.style.C16434j) r57, (androidx.compose.p004ui.graphics.C15205e4) r58, (androidx.compose.p004ui.text.style.C16432i) r59, (androidx.compose.p004ui.text.style.C16436k) r60, (long) r61, (androidx.compose.p004ui.text.style.C16442o) r63, (androidx.compose.p004ui.text.C16051a0) r64, (androidx.compose.p004ui.text.style.C16426h) r65, (androidx.compose.p004ui.text.style.C16417f) r66, (androidx.compose.p004ui.text.style.C16415e) r67, (int) r68, (kotlin.jvm.internal.DefaultConstructorMarker) r69)
            r26 = 48
            r27 = 0
            r28 = 65532(0xfffc, float:9.183E-41)
            r25 = r72
            androidx.compose.material.TextKt.m14196c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4 = 0
            r14 = 0
            r15 = 1
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r4, r15, r14)
            float r5 = (float) r15
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            com.carrefour.fid.android.design.theme.b r35 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r6 = r35.mo114236d()
            androidx.compose.foundation.i r5 = androidx.compose.foundation.C2250j.m9695a(r5, r6)
            r6 = 8
            float r13 = (float) r6
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            androidx.compose.foundation.shape.n r6 = androidx.compose.foundation.shape.C2694o.m12166h(r6)
            androidx.compose.ui.m r7 = androidx.compose.foundation.BorderKt.m8850f(r4, r5, r6)
            long r8 = r35.mo114234c()
            r10 = 0
            r11 = 2
            r12 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.BackgroundKt.m8825d(r7, r8, r10, r11, r12)
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 7
            r22 = 0
            r20 = r30
            androidx.compose.ui.m r4 = androidx.compose.foundation.ClickableKt.m8878e(r16, r17, r18, r19, r20, r21, r22)
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r34)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10024k(r4, r5)
            r5 = 693286680(0x2952b718, float:4.6788176E-14)
            r12 = r72
            r12.mo14918M(r5)
            androidx.compose.foundation.layout.Arrangement$d r5 = r29.mo7630p()
            androidx.compose.ui.c$c r6 = r31.mo17073w()
            r11 = 0
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.RowKt.m10071d(r5, r6, r12, r11)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.mo14918M(r10)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r12.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r12.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r12.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r9 = r32.mo44585a()
            kotlin.jvm.functions.q r4 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r4)
            androidx.compose.runtime.d r10 = r12.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x0241
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0241:
            r12.mo14938T()
            boolean r10 = r12.mo14997l()
            if (r10 == 0) goto L_0x024e
            r12.mo14947W(r9)
            goto L_0x0251
        L_0x024e:
            r12.mo14888A()
        L_0x0251:
            r12.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r12)
            kotlin.jvm.functions.p r10 = r32.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r10)
            kotlin.jvm.functions.p r5 = r32.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r5)
            kotlin.jvm.functions.p r5 = r32.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r5)
            kotlin.jvm.functions.p r5 = r32.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r5)
            r12.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r12)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r4.invoke(r5, r12, r6)
            r10 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.mo14918M(r10)
            androidx.compose.foundation.layout.RowScopeInstance r4 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            int r4 = com.carrefour.fid.android.checkout.C39805b.C39813h.ds_ic_basket_express
            androidx.compose.ui.graphics.painter.Painter r4 = androidx.compose.p004ui.res.C16015f.m71849d(r4, r12, r11)
            r5 = 30
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10087C(r3, r5)
            androidx.compose.ui.graphics.k2$a r16 = androidx.compose.p004ui.graphics.C15249k2.f37569b
            long r17 = r35.mo114218O()
            r19 = 0
            r20 = 2
            r21 = 0
            androidx.compose.ui.graphics.k2 r16 = androidx.compose.p004ui.graphics.C15249k2.C15250a.m66144d(r16, r17, r19, r20, r21)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r17 = 440(0x1b8, float:6.17E-43)
            r18 = 56
            r14 = r10
            r15 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r10 = r16
            r14 = r11
            r11 = r12
            r15 = r12
            r12 = r17
            r33 = r13
            r13 = r18
            androidx.compose.foundation.ImageKt.m8967b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = 24
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10092H(r3, r4)
            r13 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r4, r15, r13)
            r4 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r4)
            androidx.compose.foundation.layout.Arrangement$l r4 = r29.mo7631r()
            androidx.compose.ui.c$b r5 = r31.mo17072u()
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.ColumnKt.m9863b(r4, r5, r15, r14)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r15.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            kotlin.jvm.functions.a r8 = r32.mo44585a()
            kotlin.jvm.functions.q r9 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r10 = r15.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x0321
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0321:
            r15.mo14938T()
            boolean r10 = r15.mo14997l()
            if (r10 == 0) goto L_0x032e
            r15.mo14947W(r8)
            goto L_0x0331
        L_0x032e:
            r15.mo14888A()
        L_0x0331:
            r15.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r10 = r32.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r10)
            kotlin.jvm.functions.p r4 = r32.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r4)
            kotlin.jvm.functions.p r4 = r32.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r6, r4)
            kotlin.jvm.functions.p r4 = r32.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r7, r4)
            r15.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r9.invoke(r4, r15, r5)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r4)
            r4 = 30949189(0x1d83f45, float:7.9436656E-38)
            r15.mo14918M(r4)
            androidx.compose.ui.text.d$a r4 = new androidx.compose.ui.text.d$a
            r5 = 0
            r6 = 1
            r4.<init>(r14, r6, r5)
            if (r0 == 0) goto L_0x037e
            int r5 = com.carrefour.fid.android.checkout.C39805b.C39823r.today_question_part_1_drive
            goto L_0x0380
        L_0x037e:
            int r5 = com.carrefour.fid.android.checkout.C39805b.C39823r.today_question_part_1_lad
        L_0x0380:
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r15, r14)
            r4.mo46707l(r5)
            r5 = 32
            r4.mo46704i(r5)
            androidx.compose.ui.text.c0 r5 = new androidx.compose.ui.text.c0
            r36 = r5
            r37 = 0
            r39 = 0
            androidx.compose.ui.text.font.i0 r41 = r70.mo46947c()
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = 16379(0x3ffb, float:2.2952E-41)
            r56 = 0
            r36.<init>((long) r37, (long) r39, (androidx.compose.p004ui.text.font.C16209i0) r41, (androidx.compose.p004ui.text.font.C16190e0) r42, (androidx.compose.p004ui.text.font.C16194f0) r43, (androidx.compose.p004ui.text.font.C16242u) r44, (java.lang.String) r45, (long) r46, (androidx.compose.p004ui.text.style.C16410a) r48, (androidx.compose.p004ui.text.style.C16439m) r49, (androidx.compose.p004ui.text.intl.C16342f) r50, (long) r51, (androidx.compose.p004ui.text.style.C16434j) r53, (androidx.compose.p004ui.graphics.C15205e4) r54, (int) r55, (kotlin.jvm.internal.DefaultConstructorMarker) r56)
            int r5 = r4.mo46713r(r5)
            int r6 = com.carrefour.fid.android.checkout.C39805b.C39823r.today_question_part_2     // Catch:{ all -> 0x04ba }
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r6, r15, r14)     // Catch:{ all -> 0x04ba }
            r4.mo46707l(r6)     // Catch:{ all -> 0x04ba }
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x04ba }
            r4.mo46710o(r5)
            java.lang.String r5 = " ?"
            r4.mo46707l(r5)
            androidx.compose.ui.text.d r4 = r4.mo46716u()
            r15.mo15002m0()
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r13 = r16
            r16 = 0
            r72 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 262142(0x3fffe, float:3.67339E-40)
            r26 = r72
            androidx.compose.material.TextKt.m14197d(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r33)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10115o(r3, r4)
            r15 = r72
            r4 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r3, r15, r4)
            int r3 = com.carrefour.fid.android.checkout.C39805b.C39823r.find_a_slot
            r4 = 0
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r4)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r4)
            r4 = r3
            java.lang.String r5 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            androidx.compose.ui.text.font.u r44 = com.carrefour.fid.android.design.theme.C37477d.m153888O()
            androidx.compose.ui.text.font.i0 r41 = r70.mo46947c()
            r3 = 12
            long r39 = androidx.compose.p004ui.unit.C16506u.m74712m(r3)
            r5 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            long r46 = androidx.compose.p004ui.unit.C16506u.m74710k(r5)
            androidx.compose.ui.text.p0 r36 = new androidx.compose.ui.text.p0
            r24 = r36
            r37 = 0
            r42 = 0
            r43 = 0
            r45 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 4194137(0x3fff59, float:5.877238E-39)
            r65 = 0
            r36.<init>((long) r37, (long) r39, (androidx.compose.p004ui.text.font.C16209i0) r41, (androidx.compose.p004ui.text.font.C16190e0) r42, (androidx.compose.p004ui.text.font.C16194f0) r43, (androidx.compose.p004ui.text.font.C16242u) r44, (java.lang.String) r45, (long) r46, (androidx.compose.p004ui.text.style.C16410a) r48, (androidx.compose.p004ui.text.style.C16439m) r49, (androidx.compose.p004ui.text.intl.C16342f) r50, (long) r51, (androidx.compose.p004ui.text.style.C16434j) r53, (androidx.compose.p004ui.graphics.C15205e4) r54, (androidx.compose.p004ui.text.style.C16432i) r55, (androidx.compose.p004ui.text.style.C16436k) r56, (long) r57, (androidx.compose.p004ui.text.style.C16442o) r59, (androidx.compose.p004ui.text.C16051a0) r60, (androidx.compose.p004ui.text.style.C16426h) r61, (androidx.compose.p004ui.text.style.C16417f) r62, (androidx.compose.p004ui.text.style.C16415e) r63, (int) r64, (kotlin.jvm.internal.DefaultConstructorMarker) r65)
            long r6 = r35.mo114218O()
            r5 = 0
            r13 = 0
            r3 = 0
            r29 = r15
            r15 = r3
            r26 = 0
            r28 = 65530(0xfffa, float:9.1827E-41)
            r25 = r29
            androidx.compose.material.TextKt.m14196c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r29.mo15002m0()
            r29.mo14896D()
            r29.mo15002m0()
            r29.mo15002m0()
            r29.mo15002m0()
            r29.mo14896D()
            r29.mo15002m0()
            r29.mo15002m0()
            r29.mo15002m0()
            r29.mo14896D()
            r29.mo15002m0()
            r29.mo15002m0()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x04a8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04a8:
            r7 = r30
        L_0x04aa:
            androidx.compose.runtime.t1 r3 = r29.mo15020s()
            if (r3 != 0) goto L_0x04b1
            goto L_0x04b9
        L_0x04b1:
            com.carrefour.fid.android.checkout.presentation.ui.slot.component.TodayBannerKt$TodayBanner$3 r4 = new com.carrefour.fid.android.checkout.presentation.ui.slot.component.TodayBannerKt$TodayBanner$3
            r4.<init>(r0, r7, r1, r2)
            r3.mo15202a(r4)
        L_0x04b9:
            return
        L_0x04ba:
            r0 = move-exception
            r4.mo46710o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.p071ui.slot.component.TodayBannerKt.m162649a(boolean, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c(showBackground = true, widthDp = 400)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m162650b(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-588793589);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-588793589, i, -1, "com.carrefour.fid.android.checkout.presentation.ui.slot.component.TodayBannerPreview (TodayBanner.kt:113)");
            }
            ThemeKt.m153788a(ComposableSingletons$TodayBannerKt.f101797a.mo131599a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TodayBannerKt$TodayBannerPreview$1(i));
        }
    }
}
