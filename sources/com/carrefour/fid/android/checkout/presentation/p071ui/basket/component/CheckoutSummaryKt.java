package com.carrefour.fid.android.checkout.presentation.p071ui.basket.component;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nCheckoutSummary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutSummary.kt\ncom/carrefour/fid/android/checkout/presentation/ui/basket/component/CheckoutSummaryKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,327:1\n25#2:328\n25#2:335\n460#2,13:361\n36#2:387\n36#2:394\n473#2,3:401\n1114#3,6:329\n1114#3,6:336\n1114#3,6:388\n1114#3,6:395\n74#4,6:342\n80#4:374\n84#4:405\n75#5:348\n76#5,11:350\n89#5:404\n76#6:349\n154#7:375\n154#7:376\n154#7:377\n154#7:378\n154#7:379\n154#7:380\n154#7:381\n154#7:382\n154#7:383\n154#7:384\n154#7:385\n154#7:386\n*S KotlinDebug\n*F\n+ 1 CheckoutSummary.kt\ncom/carrefour/fid/android/checkout/presentation/ui/basket/component/CheckoutSummaryKt\n*L\n48#1:328\n49#1:335\n51#1:361,13\n258#1:387\n288#1:394\n51#1:401,3\n48#1:329,6\n49#1:336,6\n258#1:388,6\n288#1:395,6\n51#1:342,6\n51#1:374\n51#1:405\n51#1:348\n51#1:350,11\n51#1:404\n51#1:349\n58#1:375\n73#1:376\n88#1:377\n102#1:378\n117#1:379\n146#1:380\n162#1:381\n192#1:382\n202#1:383\n206#1:384\n225#1:385\n241#1:386\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt */
public final class CheckoutSummaryKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m162552a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r49, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.basket.BasketAmounts r50, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.basket.BasketPromotionCode r51, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.basket.BasketReturnableBags r52, int r53, boolean r54, int r55, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r56, int r57, int r58) {
        /*
            r2 = r50
            r3 = r51
            r4 = r52
            r8 = r57
            java.lang.String r0 = "basketAmount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 594155498(0x236a17ea, float:1.26902294E-17)
            r1 = r56
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r5 = r58 & 1
            if (r5 == 0) goto L_0x001d
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x001f
        L_0x001d:
            r5 = r49
        L_0x001f:
            r6 = r58 & 64
            r7 = 0
            if (r6 == 0) goto L_0x0026
            r6 = r7
            goto L_0x0028
        L_0x0026:
            r6 = r55
        L_0x0028:
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0034
            r9 = -1
            java.lang.String r10 = "com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummary (CheckoutSummary.kt:37)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r9, r10)
        L_0x0034:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r0)
            java.lang.Object r9 = r1.mo14921N()
            androidx.compose.runtime.o$a r34 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r34.mo16277a()
            r11 = 2
            r15 = 0
            if (r9 != r10) goto L_0x0051
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r9 = androidx.compose.runtime.C8539f2.m30981g(r9, r15, r11, r15)
            r1.mo14893C(r9)
        L_0x0051:
            r1.mo15002m0()
            r13 = r9
            androidx.compose.runtime.z0 r13 = (androidx.compose.runtime.C8700z0) r13
            r1.mo14918M(r0)
            java.lang.Object r0 = r1.mo14921N()
            java.lang.Object r9 = r34.mo16277a()
            if (r0 != r9) goto L_0x006d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r15, r11, r15)
            r1.mo14893C(r0)
        L_0x006d:
            r1.mo15002m0()
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$1 r9 = com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.CheckoutSummaryKt$CheckoutSummary$1.f101712f
            r14 = 1
            androidx.compose.ui.m r9 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71867b(r5, r14, r9)
            r10 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r10)
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r10 = r10.mo7631r()
            androidx.compose.ui.c$a r11 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r11 = r11.mo17072u()
            androidx.compose.ui.layout.f0 r10 = androidx.compose.foundation.layout.ColumnKt.m9863b(r10, r11, r1, r7)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r11)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p004ui.unit.LayoutDirection) r12
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r15 = r1.mo15032w(r15)
            androidx.compose.ui.platform.c4 r15 = (androidx.compose.p004ui.platform.C15863c4) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r14 = r16.mo44585a()
            kotlin.jvm.functions.q r9 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r9)
            androidx.compose.runtime.d r7 = r1.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x00c8
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00c8:
            r1.mo14938T()
            boolean r7 = r1.mo14997l()
            if (r7 == 0) goto L_0x00d5
            r1.mo14947W(r14)
            goto L_0x00d8
        L_0x00d5:
            r1.mo14888A()
        L_0x00d8:
            r1.mo14941U()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r14 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r7, r10, r14)
            kotlin.jvm.functions.p r10 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r7, r11, r10)
            kotlin.jvm.functions.p r10 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r7, r12, r10)
            kotlin.jvm.functions.p r10 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r7, r15, r10)
            r1.mo14972e()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r7 = androidx.compose.runtime.C8684u1.m31905a(r7)
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r9.invoke(r7, r1, r11)
            r7 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r7)
            androidx.compose.foundation.layout.ColumnScopeInstance r7 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            int r7 = com.carrefour.fid.android.checkout.C39805b.C39821p.checkout_summary_detail_order
            r14 = 1
            java.lang.Object[] r9 = new java.lang.Object[r14]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r53)
            r9[r10] = r11
            int r10 = r8 >> 9
            r10 = r10 & 112(0x70, float:1.57E-43)
            r10 = r10 | 512(0x200, float:7.175E-43)
            r15 = r53
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71856b(r7, r15, r9, r1, r10)
            androidx.compose.material.t0 r7 = androidx.compose.material.C7933t0.f19075a
            int r10 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r11 = r7.mo11077c(r1, r10)
            androidx.compose.ui.text.p0 r29 = com.carrefour.fid.android.design.theme.C37477d.m153896h(r11)
            com.carrefour.fid.android.design.theme.b r35 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r11 = r35.mo114207D()
            r16 = 0
            r36 = r10
            r10 = r16
            r16 = 0
            r37 = r13
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r31 = 0
            r32 = 0
            r33 = 65530(0xfffa, float:9.1827E-41)
            r30 = r1
            androidx.compose.material.TextKt.m14196c(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            androidx.compose.ui.m$a r15 = androidx.compose.p004ui.C8767m.f23478j
            r9 = 4
            float r13 = (float) r9
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            r14 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r15, r14, r9, r12, r11)
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$1 r10 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$1
            r10.<init>(r2)
            r11 = 795094318(0x2f642d2e, float:2.075253E-10)
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r11, r12, r10)
            r11 = 54
            r12 = 0
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt.m162561a(r9, r10, r1, r11, r12)
            r9 = 516814456(0x1ecdf678, float:2.1807156E-20)
            r1.mo14918M(r9)
            if (r3 == 0) goto L_0x01b4
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            r10 = 0
            r11 = 1
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r15, r14, r9, r11, r10)
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$2 r10 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$2
            r10.<init>(r3)
            r14 = -1268178957(0xffffffffb4691ff3, float:-2.1711439E-7)
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r14, r11, r10)
            r14 = 54
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt.m162561a(r9, r10, r1, r14, r12)
            goto L_0x01b6
        L_0x01b4:
            r14 = r11
            r11 = 1
        L_0x01b6:
            r1.mo15002m0()
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            r10 = 0
            r12 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r15, r10, r9, r11, r12)
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$3 r10 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$3
            r10.<init>(r2)
            r12 = 1590223511(0x5ec8e297, float:7.2376491E18)
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r12, r11, r10)
            r12 = 0
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt.m162561a(r9, r10, r1, r14, r12)
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            r10 = 0
            r12 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r15, r10, r9, r11, r12)
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$4 r10 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$4
            r10.<init>(r2)
            r12 = -282990026(0xffffffffef21ea36, float:-5.011023E28)
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r12, r11, r10)
            r11 = 0
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt.m162561a(r9, r10, r1, r14, r11)
            r9 = 516816173(0x1ecdfd2d, float:2.180993E-20)
            r1.mo14918M(r9)
            double r9 = r50.mo116867C()
            double r9 = java.lang.Math.abs(r9)
            r45 = 0
            int r9 = (r9 > r45 ? 1 : (r9 == r45 ? 0 : -1))
            if (r9 != 0) goto L_0x0203
            r14 = 1
            goto L_0x0204
        L_0x0203:
            r14 = 0
        L_0x0204:
            if (r14 != 0) goto L_0x0226
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            r10 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r15, r10, r9, r12, r11)
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$5 r10 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$5
            r14 = r37
            r10.<init>(r2, r14)
            r11 = -1235470308(0xffffffffb65c381c, float:-3.2815215E-6)
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r11, r12, r10)
            r11 = 54
            r12 = 0
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt.m162561a(r9, r10, r1, r11, r12)
            goto L_0x0228
        L_0x0226:
            r14 = r37
        L_0x0228:
            r1.mo15002m0()
            r9 = 516817498(0x1ece025a, float:2.1812071E-20)
            r1.mo14918M(r9)
            if (r54 == 0) goto L_0x0250
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            r10 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r15, r10, r9, r12, r11)
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$6 r10 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$6
            r10.<init>(r2)
            r11 = 1186283451(0x46b53fbb, float:23199.865)
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r11, r12, r10)
            r11 = 54
            r12 = 0
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt.m162561a(r9, r10, r1, r11, r12)
        L_0x0250:
            r1.mo15002m0()
            r9 = 516818127(0x1ece04cf, float:2.1813087E-20)
            r1.mo14918M(r9)
            if (r4 == 0) goto L_0x02d9
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            r10 = 0
            r11 = 1
            r12 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r15, r12, r9, r11, r10)
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$7 r10 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$7
            r10.<init>(r4, r0)
            r12 = -686930086(0xffffffffd70e475a, float:-1.56437104E14)
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r12, r11, r10)
            r11 = 0
            r12 = 54
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt.m162561a(r9, r10, r1, r12, r11)
            r39 = 0
            r40 = 0
            r41 = 0
            r11 = 5
            float r9 = (float) r11
            float r42 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            r43 = 7
            r44 = 0
            r38 = r15
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10028o(r38, r39, r40, r41, r42, r43, r44)
            r17 = 0
            int r9 = com.carrefour.fid.android.checkout.C39805b.C39823r.checkout_summary_returnable_bags_description
            r11 = 0
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r9, r1, r11)
            r11 = r36
            androidx.compose.material.w1 r7 = r7.mo11077c(r1, r11)
            androidx.compose.ui.text.p0 r29 = com.carrefour.fid.android.design.theme.C37477d.m153877D(r7)
            long r18 = r35.mo114207D()
            r7 = 5
            r16 = 0
            r11 = r18
            r17 = 0
            r36 = r13
            r37 = r14
            r13 = r17
            r16 = 0
            r47 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r31 = 48
            r32 = 0
            r33 = 65528(0xfff8, float:9.1824E-41)
            r30 = r1
            androidx.compose.material.TextKt.m14196c(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x02e0
        L_0x02d9:
            r36 = r13
            r37 = r14
            r47 = r15
            r7 = 5
        L_0x02e0:
            r1.mo15002m0()
            float r7 = (float) r7
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            r15 = r47
            r12 = 1
            r13 = 0
            r14 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r15, r14, r7, r12, r13)
            long r10 = r35.mo114206C()
            r7 = 0
            r16 = 0
            r17 = 6
            r18 = 12
            r12 = r7
            r7 = r13
            r13 = r16
            r14 = r1
            r48 = r15
            r15 = r17
            r16 = r18
            androidx.compose.material.DividerKt.m13428a(r9, r10, r12, r13, r14, r15, r16)
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r36)
            r10 = r48
            r11 = 0
            r15 = 1
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r10, r11, r9, r15, r7)
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$8 r12 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$8
            r12.<init>(r2)
            r13 = 2138763733(0x7f7af1d5, float:3.3356266E38)
            androidx.compose.runtime.internal.a r12 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r13, r15, r12)
            r13 = 54
            r14 = 0
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt.m162561a(r9, r12, r1, r13, r14)
            r9 = 516820700(0x1ece0edc, float:2.1817244E-20)
            r1.mo14918M(r9)
            double r16 = r50.mo116893v()
            int r9 = (r16 > r45 ? 1 : (r16 == r45 ? 0 : -1))
            if (r9 <= 0) goto L_0x034e
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r36)
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r10, r11, r9, r15, r7)
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$9 r12 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$9
            r12.<init>(r2)
            r14 = 1734823673(0x67674ef9, float:1.09232345E24)
            androidx.compose.runtime.internal.a r12 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r14, r15, r12)
            r14 = 0
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt.m162561a(r9, r12, r1, r13, r14)
        L_0x034e:
            r1.mo15002m0()
            r9 = 516821354(0x1ece116a, float:2.18183E-20)
            r1.mo14918M(r9)
            if (r6 <= 0) goto L_0x0371
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r36)
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10026m(r10, r11, r9, r15, r7)
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$10 r10 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$10
            r10.<init>(r6)
            r11 = -138389864(0xfffffffff7c05698, float:-7.8021666E33)
            androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r11, r15, r10)
            r11 = 0
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.SpacedItemsRowKt.m162561a(r9, r10, r1, r13, r11)
        L_0x0371:
            r1.mo15002m0()
            r9 = 516821959(0x1ece13c7, float:2.1819278E-20)
            r1.mo14918M(r9)
            java.lang.Object r9 = r37.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r14 = 1157296644(0x44faf204, float:2007.563)
            if (r9 == 0) goto L_0x03f4
            r1.mo14918M(r14)
            r9 = r37
            boolean r10 = r1.mo15006n0(r9)
            java.lang.Object r11 = r1.mo14921N()
            if (r10 != 0) goto L_0x039e
            java.lang.Object r10 = r34.mo16277a()
            if (r11 != r10) goto L_0x03a6
        L_0x039e:
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$11$1 r11 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$11$1
            r11.<init>(r9)
            r1.mo14893C(r11)
        L_0x03a6:
            r1.mo15002m0()
            r10 = r11
            kotlin.jvm.functions.a r10 = (kotlin.jvm.functions.C11289a) r10
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$12 r11 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$12
            r11.<init>(r9)
            r9 = 71940101(0x449b805, float:2.3711934E-36)
            androidx.compose.runtime.internal.a r11 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r9, r15, r11)
            r12 = 0
            r13 = 0
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.ComposableSingletons$CheckoutSummaryKt r9 = com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.ComposableSingletons$CheckoutSummaryKt.f101721a
            kotlin.jvm.functions.p r16 = r9.mo131498b()
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$13 r9 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$13
            r9.<init>(r2)
            r14 = -47875319(0xfffffffffd257b09, float:-1.3747591E37)
            androidx.compose.runtime.internal.a r14 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r14, r15, r9)
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 221232(0x36030, float:3.10012E-40)
            r24 = 972(0x3cc, float:1.362E-42)
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r16
            r7 = 1157296644(0x44faf204, float:2007.563)
            r15 = r17
            r16 = r18
            r18 = r20
            r20 = r22
            r21 = r1
            r22 = r23
            r23 = r24
            androidx.compose.material.AndroidAlertDialog_androidKt.m13200a(r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23)
            goto L_0x03f5
        L_0x03f4:
            r7 = r14
        L_0x03f5:
            r1.mo15002m0()
            r9 = -665799068(0xffffffffd850b664, float:-9.1792712E14)
            r1.mo14918M(r9)
            java.lang.Object r9 = r0.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0430
            r1.mo14918M(r7)
            boolean r7 = r1.mo15006n0(r0)
            java.lang.Object r9 = r1.mo14921N()
            if (r7 != 0) goto L_0x041d
            java.lang.Object r7 = r34.mo16277a()
            if (r9 != r7) goto L_0x0425
        L_0x041d:
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$14$1 r9 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$2$14$1
            r9.<init>(r0)
            r1.mo14893C(r9)
        L_0x0425:
            r1.mo15002m0()
            kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
            r0 = 0
            r7 = 0
            r10 = 1
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.CheckoutReturnableBagsDialogKt.m162547a(r0, r9, r1, r7, r10)
        L_0x0430:
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0448
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0448:
            androidx.compose.runtime.t1 r10 = r1.mo15020s()
            if (r10 != 0) goto L_0x044f
            goto L_0x0468
        L_0x044f:
            com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$3 r11 = new com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$3
            r0 = r11
            r1 = r5
            r2 = r50
            r3 = r51
            r4 = r52
            r5 = r53
            r7 = r6
            r6 = r54
            r8 = r57
            r9 = r58
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x0468:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.CheckoutSummaryKt.m162552a(androidx.compose.ui.m, com.carrefour.fid.android.domain.models.basket.BasketAmounts, com.carrefour.fid.android.domain.models.basket.BasketPromotionCode, com.carrefour.fid.android.domain.models.basket.BasketReturnableBags, int, boolean, int, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m162553b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-2119932563);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2119932563, i, -1, "com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryPreview (CheckoutSummary.kt:296)");
            }
            ThemeKt.m153788a(ComposableSingletons$CheckoutSummaryKt.f101721a.mo131499c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutSummaryKt$CheckoutSummaryPreview$1(i));
        }
    }
}
