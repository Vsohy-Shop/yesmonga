package com.carrefour.fid.android.design.components.compose.productcards;

import androidx.compose.runtime.C8592o;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$2\n+ 2 NonFoodProductCardComponent.kt\ncom/carrefour/fid/android/design/components/compose/productcards/NonFoodProductCardComponentKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,1524:1\n61#2,6:1525\n70#2:1532\n71#2:1534\n73#2,5:1536\n72#2,24:1541\n104#2,5:1607\n103#2,5:1612\n102#2,13:1617\n119#2,5:1631\n118#2,5:1636\n117#2,13:1641\n132#2,6:1655\n140#2,2:1662\n145#2:1669\n144#2:1670\n150#2:1678\n151#2:1680\n152#2,2:1688\n143#2:1690\n158#2:1691\n157#2,6:1692\n163#2:1699\n164#2,2:1707\n156#2:1716\n167#2:1717\n154#3:1531\n154#3:1533\n154#3:1535\n154#3:1565\n154#3:1630\n154#3:1654\n154#3:1661\n154#3:1679\n154#3:1698\n50#4:1566\n49#4:1567\n460#4,13:1593\n473#4,3:1664\n36#4:1671\n36#4:1681\n36#4:1700\n36#4:1709\n1114#5,6:1568\n1114#5,6:1672\n1114#5,6:1682\n1114#5,6:1701\n1114#5,6:1710\n74#6,6:1574\n80#6:1606\n84#6:1668\n75#7:1580\n76#7,11:1582\n89#7:1667\n76#8:1581\n*S KotlinDebug\n*F\n+ 1 NonFoodProductCardComponent.kt\ncom/carrefour/fid/android/design/components/compose/productcards/NonFoodProductCardComponentKt\n*L\n65#1:1531\n70#1:1533\n71#1:1535\n94#1:1565\n114#1:1630\n129#1:1654\n137#1:1661\n150#1:1679\n162#1:1698\n95#1:1566\n95#1:1567\n92#1:1593,13\n92#1:1664,3\n145#1:1671\n151#1:1681\n163#1:1700\n165#1:1709\n95#1:1568,6\n145#1:1672,6\n151#1:1682,6\n163#1:1701,6\n165#1:1710,6\n92#1:1574,6\n92#1:1606\n92#1:1668\n92#1:1580\n92#1:1582,11\n92#1:1667\n92#1:1581\n*E\n"})
/* renamed from: com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$$inlined$ConstraintLayout$2 */
public final class C37027x41288754 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ int $$dirty1$inlined;
    final /* synthetic */ int $currentQuantity$inlined;
    final /* synthetic */ boolean $isFrenchProduct$inlined;
    final /* synthetic */ C11304p $label$inlined;
    final /* synthetic */ String $name$inlined;
    final /* synthetic */ C11289a $onHelpersChanged;
    final /* synthetic */ C11289a $onQuantityClicked$inlined;
    final /* synthetic */ C11289a $onRemoveClicked$inlined;
    final /* synthetic */ String $packaging$inlined;
    final /* synthetic */ C11304p $price$inlined;
    final /* synthetic */ String $productUrl$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37027x41288754(ConstraintLayoutScope constraintLayoutScope, int i, C11289a aVar, String str, int i2, boolean z, C11289a aVar2, C11289a aVar3, int i3, int i4, String str2, String str3, C11304p pVar, C11304p pVar2) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = aVar;
        this.$productUrl$inlined = str;
        this.$$dirty$inlined = i2;
        this.$isFrenchProduct$inlined = z;
        this.$onRemoveClicked$inlined = aVar2;
        this.$onQuantityClicked$inlined = aVar3;
        this.$$dirty1$inlined = i3;
        this.$currentQuantity$inlined = i4;
        this.$name$inlined = str2;
        this.$packaging$inlined = str3;
        this.$label$inlined = pVar;
        this.$price$inlined = pVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r43, int r44) {
        /*
            r42 = this;
            r0 = r42
            r15 = r43
            r1 = r44 & 11
            r1 = r1 ^ 2
            if (r1 != 0) goto L_0x0016
            boolean r1 = r43.mo15011p()
            if (r1 != 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            r43.mo14958a0()
            goto L_0x03f0
        L_0x0016:
            androidx.constraintlayout.compose.ConstraintLayoutScope r1 = r0.$scope
            int r14 = r1.mo48254G()
            androidx.constraintlayout.compose.ConstraintLayoutScope r1 = r0.$scope
            r1.mo48256J()
            androidx.constraintlayout.compose.ConstraintLayoutScope r12 = r0.$scope
            androidx.constraintlayout.compose.ConstraintLayoutScope$a r1 = r12.mo48332O()
            androidx.constraintlayout.compose.e r11 = r1.mo48336a()
            androidx.constraintlayout.compose.e r10 = r1.mo48344i()
            androidx.constraintlayout.compose.e r9 = r1.mo48345j()
            androidx.constraintlayout.compose.e r8 = r1.mo48346k()
            androidx.constraintlayout.compose.e r6 = r1.mo48347l()
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 100
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10087C(r5, r1)
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$1 r2 = com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$1.f92554f
            androidx.compose.ui.m r1 = r12.mo48330M(r1, r11, r2)
            r2 = 16
            float r4 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r3 = 0
            r13 = 1
            r7 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10026m(r1, r3, r2, r13, r7)
            r2 = 4
            float r2 = (float) r2
            float r16 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.foundation.shape.n r3 = androidx.compose.foundation.shape.C2694o.m12166h(r16)
            androidx.compose.ui.m r1 = androidx.compose.p004ui.draw.C8744d.m32514a(r1, r3)
            r26 = r2
            r2 = r1
            androidx.compose.ui.layout.c$a r1 = androidx.compose.p004ui.layout.C15541c.f38696a
            androidx.compose.ui.layout.c r1 = r1.mo44373i()
            r3 = r7
            r7 = r1
            int r1 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_placeholder
            r13 = r1
            java.lang.String r1 = r0.$productUrl$inlined
            r16 = 0
            r3 = r16
            r27 = r4
            r4 = r16
            r28 = r5
            r5 = r16
            r29 = r6
            r6 = r16
            r30 = r8
            r8 = r16
            r16 = 0
            r31 = r9
            r9 = r16
            r16 = 0
            r32 = r10
            r10 = r16
            r33 = r11
            r11 = r16
            r34 = r12
            r12 = r16
            r35 = r14
            r14 = r16
            r15 = r16
            com.carrefour.fid.android.design.components.compose.productcards.ComposableSingletons$NonFoodProductCardComponentKt r16 = com.carrefour.fid.android.design.components.compose.productcards.ComposableSingletons$NonFoodProductCardComponentKt.f92540a
            kotlin.jvm.functions.r r16 = r16.mo112663a()
            int r3 = r0.$$dirty$inlined
            int r3 = r3 >> 3
            r3 = r3 & 14
            r17 = 1572864(0x180000, float:2.204052E-39)
            r18 = r3 | r17
            r19 = 196608(0x30000, float:2.75506E-40)
            r20 = 28604(0x6fbc, float:4.0083E-41)
            r17 = r43
            r3 = 0
            com.skydoves.landscapist.glide.C35325c.m145645b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = -1918512992(0xffffffff8da5d0a0, float:-1.0219135E-30)
            r14 = r43
            r14.mo14918M(r1)
            boolean r1 = r0.$isFrenchProduct$inlined
            r15 = 0
            if (r1 == 0) goto L_0x00f0
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$2 r1 = com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$2.f92555f
            r12 = r28
            r2 = r32
            r13 = r34
            androidx.compose.ui.m r3 = r13.mo48330M(r12, r2, r1)
            int r1 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_gr_flag_top_fr
            androidx.compose.ui.graphics.painter.Painter r1 = androidx.compose.p004ui.res.C16015f.m71849d(r1, r14, r15)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 56
            r10 = 120(0x78, float:1.68E-43)
            r8 = r43
            androidx.compose.foundation.ImageKt.m8967b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00f4
        L_0x00f0:
            r12 = r28
            r13 = r34
        L_0x00f4:
            r43.mo15002m0()
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r27)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10024k(r12, r1)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.mo14918M(r2)
            r2 = r33
            boolean r3 = r14.mo15006n0(r2)
            r10 = r29
            boolean r4 = r14.mo15006n0(r10)
            r3 = r3 | r4
            java.lang.Object r4 = r43.mo14921N()
            if (r3 != 0) goto L_0x0120
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0128
        L_0x0120:
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$3$1 r4 = new com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$3$1
            r4.<init>(r2, r10)
            r14.mo14893C(r4)
        L_0x0128:
            r43.mo15002m0()
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            r2 = r31
            androidx.compose.ui.m r1 = r13.mo48330M(r1, r2, r4)
            r2 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo14918M(r2)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r2 = r2.mo7631r()
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r3 = r3.mo17072u()
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.ColumnKt.m9863b(r2, r3, r14, r15)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r7 = r6.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r8 = r43.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x0182
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0182:
            r43.mo14938T()
            boolean r8 = r43.mo14997l()
            if (r8 == 0) goto L_0x018f
            r14.mo14947W(r7)
            goto L_0x0192
        L_0x018f:
            r43.mo14888A()
        L_0x0192:
            r43.mo14941U()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.Updater.m30180b(r43)
            kotlin.jvm.functions.p r8 = r6.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r7, r2, r8)
            kotlin.jvm.functions.p r2 = r6.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r7, r3, r2)
            kotlin.jvm.functions.p r2 = r6.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r7, r4, r2)
            kotlin.jvm.functions.p r2 = r6.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r7, r5, r2)
            r43.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r43)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r1.invoke(r2, r14, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            androidx.compose.ui.text.style.i$a r28 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r17 = r28.mo47672f()
            androidx.compose.material.t0 r11 = androidx.compose.material.C7933t0.f19075a
            int r9 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r1 = r11.mo11077c(r14, r9)
            androidx.compose.ui.text.p0 r21 = r1.mo11098k()
            com.carrefour.fid.android.design.theme.b r29 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r3 = r29.mo114205B()
            androidx.compose.ui.text.style.r$a r31 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r16 = r31.mo47727c()
            java.lang.String r1 = r0.$name$inlined
            r2 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r18 = 0
            r36 = r9
            r9 = r18
            r18 = 0
            r37 = r10
            r38 = r11
            r10 = r18
            r18 = 0
            r39 = r12
            r12 = r18
            androidx.compose.ui.text.style.i r17 = androidx.compose.p004ui.text.style.C16432i.m74172g(r17)
            r40 = r13
            r13 = r17
            r17 = 0
            r14 = r17
            r17 = 0
            r18 = 3
            r19 = 0
            r20 = 0
            int r2 = r0.$$dirty$inlined
            r5 = 6
            int r2 = r2 >> r5
            r23 = r2 & 14
            r24 = 3120(0xc30, float:4.372E-42)
            r25 = 54778(0xd5fa, float:7.676E-41)
            r22 = r43
            r0 = r5
            r2 = 0
            r5 = 0
            androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r14 = r39
            r12 = 0
            r13 = 1
            r15 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r14, r12, r13, r15)
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r26)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10115o(r1, r2)
            r10 = r43
            androidx.compose.foundation.layout.C2428y0.m10726a(r1, r10, r0)
            int r17 = r28.mo47672f()
            r2 = r36
            r1 = r38
            androidx.compose.material.w1 r1 = r1.mo11077c(r10, r2)
            androidx.compose.ui.text.p0 r21 = com.carrefour.fid.android.design.theme.C37477d.m153890b(r1)
            long r3 = r29.mo114257y()
            int r16 = r31.mo47727c()
            r11 = r0
            r0 = r42
            java.lang.String r1 = r0.$packaging$inlined
            r2 = 0
            r5 = 0
            r9 = 0
            r18 = 0
            r10 = r18
            r18 = 0
            r12 = r18
            androidx.compose.ui.text.style.i r17 = androidx.compose.p004ui.text.style.C16432i.m74172g(r17)
            r13 = r17
            r17 = 0
            r41 = r14
            r14 = r17
            r17 = 0
            r18 = 1
            r19 = 0
            int r2 = r0.$$dirty$inlined
            int r2 = r2 >> 9
            r23 = r2 & 14
            r2 = 0
            androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r11 = r41
            r12 = 0
            r13 = 1
            r14 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r11, r14, r13, r12)
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r27)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10115o(r1, r2)
            r15 = r43
            r2 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r1, r15, r2)
            kotlin.jvm.functions.p r1 = r0.$label$inlined
            int r3 = r0.$$dirty$inlined
            int r3 = r3 >> 21
            r3 = r3 & 14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.invoke(r15, r3)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r11, r14, r13, r12)
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r26)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10115o(r1, r3)
            androidx.compose.foundation.layout.C2428y0.m10726a(r1, r15, r2)
            kotlin.jvm.functions.p r1 = r0.$price$inlined
            int r2 = r0.$$dirty$inlined
            int r2 = r2 >> 18
            r2 = r2 & 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.invoke(r15, r2)
            r43.mo15002m0()
            r43.mo14896D()
            r43.mo15002m0()
            r43.mo15002m0()
            r10 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r10)
            r9 = r37
            boolean r1 = r15.mo15006n0(r9)
            java.lang.Object r2 = r43.mo14921N()
            if (r1 != 0) goto L_0x02f5
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x02fd
        L_0x02f5:
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$5$1 r2 = new com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$5$1
            r2.<init>(r9)
            r15.mo14893C(r2)
        L_0x02fd:
            r43.mo15002m0()
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            r1 = r30
            r8 = r40
            androidx.compose.ui.m r1 = r8.mo48330M(r11, r1, r2)
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r27)
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.PaddingKt.m10026m(r1, r14, r2, r13, r12)
            r17 = 0
            r18 = 0
            r19 = 0
            r15.mo14918M(r10)
            kotlin.jvm.functions.a r1 = r0.$onRemoveClicked$inlined
            boolean r1 = r15.mo15006n0(r1)
            java.lang.Object r2 = r43.mo14921N()
            if (r1 != 0) goto L_0x032f
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x0339
        L_0x032f:
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$6$1 r2 = new com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$6$1
            kotlin.jvm.functions.a r1 = r0.$onRemoveClicked$inlined
            r2.<init>(r1)
            r15.mo14893C(r2)
        L_0x0339:
            r43.mo15002m0()
            r20 = r2
            kotlin.jvm.functions.a r20 = (kotlin.jvm.functions.C11289a) r20
            r21 = 7
            r22 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.ClickableKt.m8878e(r16, r17, r18, r19, r20, r21, r22)
            int r1 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_delete
            r2 = 0
            androidx.compose.ui.graphics.painter.Painter r1 = androidx.compose.p004ui.res.C16015f.m71849d(r1, r15, r2)
            int r4 = com.carrefour.fid.android.design.components.C36896b.C36912p.accessibility_remove_product_in_basket
            java.lang.String r2 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r15, r2)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r16 = 8
            r17 = 120(0x78, float:1.68E-43)
            r12 = r8
            r8 = r43
            r13 = r9
            r9 = r16
            r10 = r17
            androidx.compose.foundation.ImageKt.m8967b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$7 r1 = com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$7.f92556f
            androidx.compose.ui.m r1 = r12.mo48330M(r11, r13, r1)
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r27)
            r3 = 0
            r4 = 1
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10026m(r1, r14, r2, r4, r3)
            r6 = 0
            r8 = 0
            r1 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r1)
            kotlin.jvm.functions.a r2 = r0.$onQuantityClicked$inlined
            boolean r2 = r15.mo15006n0(r2)
            java.lang.Object r3 = r43.mo14921N()
            if (r2 != 0) goto L_0x0394
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x039e
        L_0x0394:
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$8$1 r3 = new com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$8$1
            kotlin.jvm.functions.a r2 = r0.$onQuantityClicked$inlined
            r3.<init>(r2)
            r15.mo14893C(r3)
        L_0x039e:
            r43.mo15002m0()
            r9 = r3
            kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
            r10 = 7
            r11 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.ClickableKt.m8878e(r5, r6, r7, r8, r9, r10, r11)
            int r3 = r0.$currentQuantity$inlined
            r15.mo14918M(r1)
            kotlin.jvm.functions.a r1 = r0.$onQuantityClicked$inlined
            boolean r1 = r15.mo15006n0(r1)
            java.lang.Object r4 = r43.mo14921N()
            if (r1 != 0) goto L_0x03c3
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r4 != r1) goto L_0x03cd
        L_0x03c3:
            com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$9$1 r4 = new com.carrefour.fid.android.design.components.compose.productcards.NonFoodProductCardComponentKt$NonFoodProductCard$2$9$1
            kotlin.jvm.functions.a r1 = r0.$onQuantityClicked$inlined
            r4.<init>(r1)
            r15.mo14893C(r4)
        L_0x03cd:
            r43.mo15002m0()
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            int r1 = r0.$$dirty$inlined
            int r1 = r1 >> 9
            r5 = r1 & 112(0x70, float:1.57E-43)
            r6 = 0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r43
            com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt.m151524c(r1, r2, r3, r4, r5, r6)
            androidx.constraintlayout.compose.ConstraintLayoutScope r1 = r0.$scope
            int r1 = r1.mo48254G()
            r2 = r35
            if (r1 == r2) goto L_0x03f0
            kotlin.jvm.functions.a r1 = r0.$onHelpersChanged
            r1.invoke()
        L_0x03f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.productcards.C37027x41288754.invoke(androidx.compose.runtime.o, int):void");
    }
}
