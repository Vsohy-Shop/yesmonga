package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCardNumberOfActivatedCoupons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberOfActivatedCoupons.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,121:1\n154#2:122\n154#2:193\n154#2:194\n154#2:202\n74#3,6:123\n80#3:155\n84#3:214\n75#4:129\n76#4,11:131\n75#4:161\n76#4,11:163\n89#4:191\n89#4:213\n76#5:130\n76#5:162\n460#6,13:142\n460#6,13:174\n473#6,3:188\n36#6:195\n36#6:203\n473#6,3:210\n76#7,5:156\n81#7:187\n85#7:192\n1114#8,6:196\n1114#8,6:204\n*S KotlinDebug\n*F\n+ 1 CardNumberOfActivatedCoupons.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1\n*L\n45#1:122\n57#1:193\n61#1:194\n72#1:202\n42#1:123,6\n42#1:155\n42#1:214\n42#1:129\n42#1:131,11\n47#1:161\n47#1:163,11\n47#1:191\n42#1:213\n42#1:130\n47#1:162\n42#1:142,13\n47#1:174,13\n47#1:188,3\n66#1:195\n77#1:203\n42#1:210,3\n47#1:156,5\n47#1:187\n47#1:192\n66#1:196,6\n77#1:204,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1 */
public final class CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $hasBurnedCoupons;
    final /* synthetic */ int $numberOfActivatedCoupons;
    final /* synthetic */ int $numberOfAvailableCoupons;
    final /* synthetic */ C11289a<C11079d2> $onDisplayCouponBarCodes;
    final /* synthetic */ C11289a<C11079d2> $onDisplayFidCardClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1(C11289a<C11079d2> aVar, int i, boolean z, C11289a<C11079d2> aVar2, int i2, int i3) {
        super(2);
        this.$onDisplayFidCardClicked = aVar;
        this.$$dirty = i;
        this.$hasBurnedCoupons = z;
        this.$onDisplayCouponBarCodes = aVar2;
        this.$numberOfActivatedCoupons = i2;
        this.$numberOfAvailableCoupons = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r14 = r25
            r1 = r26
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r25.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r25.mo14958a0()
            goto L_0x02b1
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCoupons.<anonymous> (CardNumberOfActivatedCoupons.kt:40)"
            r4 = 2094027817(0x7cd05429, float:8.653638E36)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.ui.m$a r15 = androidx.compose.p004ui.C8767m.f23478j
            r13 = 0
            r12 = 1
            r4 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r13, r12, r4)
            r2 = 16
            float r2 = (float) r2
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10024k(r1, r3)
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r5 = r3.mo17068m()
            kotlin.jvm.functions.a<kotlin.d2> r11 = r0.$onDisplayFidCardClicked
            boolean r10 = r0.$hasBurnedCoupons
            kotlin.jvm.functions.a<kotlin.d2> r9 = r0.$onDisplayCouponBarCodes
            int r6 = r0.$numberOfActivatedCoupons
            int r7 = r0.$numberOfAvailableCoupons
            r8 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo14918M(r8)
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r4 = r8.mo7631r()
            r12 = 48
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.ColumnKt.m9863b(r4, r5, r14, r12)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r5)
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r12 = r14.mo15032w(r12)
            androidx.compose.ui.unit.d r12 = (androidx.compose.p004ui.unit.C16479d) r12
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r13 = r14.mo15032w(r13)
            androidx.compose.ui.platform.c4 r13 = (androidx.compose.p004ui.platform.C15863c4) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r19 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r0 = r19.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            r20 = r9
            androidx.compose.runtime.d r9 = r25.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x0097
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0097:
            r25.mo14938T()
            boolean r9 = r25.mo14997l()
            if (r9 == 0) goto L_0x00a4
            r14.mo14947W(r0)
            goto L_0x00a7
        L_0x00a4:
            r25.mo14888A()
        L_0x00a7:
            r25.mo14941U()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r25)
            kotlin.jvm.functions.p r9 = r19.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r0, r4, r9)
            kotlin.jvm.functions.p r4 = r19.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r0, r12, r4)
            kotlin.jvm.functions.p r4 = r19.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r0, r5, r4)
            kotlin.jvm.functions.p r4 = r19.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r0, r13, r4)
            r25.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r25)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r13 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r1.invoke(r0, r14, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r1 = 0
            r4 = 1
            r5 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r5, r4, r1)
            androidx.compose.foundation.layout.Arrangement$e r1 = r8.mo7629n()
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo14918M(r4)
            androidx.compose.ui.c$c r3 = r3.mo17073w()
            r4 = 6
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.RowKt.m10071d(r1, r3, r14, r4)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r14.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r12 = r19.mo44585a()
            kotlin.jvm.functions.q r9 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r9)
            androidx.compose.runtime.d r4 = r25.mo15017r()
            boolean r4 = r4 instanceof androidx.compose.runtime.C8428d
            if (r4 != 0) goto L_0x0136
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0136:
            r25.mo14938T()
            boolean r4 = r25.mo14997l()
            if (r4 == 0) goto L_0x0143
            r14.mo14947W(r12)
            goto L_0x0146
        L_0x0143:
            r25.mo14888A()
        L_0x0146:
            r25.mo14941U()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.Updater.m30180b(r25)
            kotlin.jvm.functions.p r12 = r19.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r4, r1, r12)
            kotlin.jvm.functions.p r1 = r19.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r4, r3, r1)
            kotlin.jvm.functions.p r1 = r19.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r4, r5, r1)
            kotlin.jvm.functions.p r1 = r19.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r4, r8, r1)
            r25.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r25)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r9.invoke(r1, r14, r3)
            r14.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r0 = 2131952449(0x7f130341, float:1.9541341E38)
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r14, r13)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CardNumberOfActivatedCouponsKt.m105599c(r0, r1, r14, r13)
            r0 = 2131952454(0x7f130346, float:1.9541351E38)
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r14, r13)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CardNumberOfActivatedCouponsKt.m105599c(r0, r1, r14, r13)
            r25.mo15002m0()
            r25.mo14896D()
            r25.mo15002m0()
            r25.mo15002m0()
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10115o(r15, r0)
            r1 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r0, r14, r1)
            r6 = 0
            r0 = 10
            float r0 = (float) r0
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r8 = 0
            r9 = 0
            r1 = 13
            r2 = 0
            r5 = r15
            r12 = r20
            r17 = r10
            r10 = r1
            r1 = r11
            r11 = r2
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10028o(r5, r6, r7, r8, r9, r10, r11)
            r4 = 0
            r10 = 0
            r11 = 1
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r10, r11, r4)
            r3 = 2131952839(0x7f1304c7, float:1.9542132E38)
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r14, r13)
            com.carrefour.fid.android.design.components.compose.ButtonType r3 = com.carrefour.fid.android.design.components.compose.ButtonType.Secondary
            r9 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r9)
            boolean r5 = r14.mo15006n0(r1)
            java.lang.Object r6 = r25.mo14921N()
            if (r5 != 0) goto L_0x01f5
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x01fd
        L_0x01f5:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1$1$2$1 r6 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1$1$2$1
            r6.<init>(r1)
            r14.mo14893C(r6)
        L_0x01fd:
            r25.mo15002m0()
            r5 = r6
            kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
            r6 = 0
            r8 = 0
            r16 = 0
            r1 = 2131231244(0x7f08020c, float:1.8078564E38)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)
            r19 = 0
            r20 = 0
            r21 = 390(0x186, float:5.47E-43)
            r22 = 824(0x338, float:1.155E-42)
            r1 = r2
            r2 = r5
            r5 = r4
            r4 = r6
            r6 = r5
            r5 = r8
            r8 = r6
            r6 = r16
            r8 = r18
            r9 = r19
            r16 = r10
            r10 = r20
            r18 = r11
            r11 = r25
            r23 = r12
            r12 = r21
            r13 = r22
            com.carrefour.fid.android.design.components.compose.ButtonComponentKt.m151340g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -387866073(0xffffffffe8e1a227, float:-8.524189E24)
            r14.mo14918M(r1)
            if (r17 == 0) goto L_0x0299
            r6 = 0
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r8 = 0
            r9 = 0
            r10 = 13
            r11 = 0
            r5 = r15
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r5, r6, r7, r8, r9, r10, r11)
            r1 = 0
            r2 = 1
            r3 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r3, r2, r1)
            r0 = 2131952458(0x7f13034a, float:1.954136E38)
            r2 = 0
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r14, r2)
            com.carrefour.fid.android.design.components.compose.ButtonType r3 = com.carrefour.fid.android.design.components.compose.ButtonType.Tertiary
            r0 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r0)
            r0 = r23
            boolean r2 = r14.mo15006n0(r0)
            java.lang.Object r4 = r25.mo14921N()
            if (r2 != 0) goto L_0x0276
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r4 != r2) goto L_0x027e
        L_0x0276:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1$1$3$1 r4 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1$1$3$1
            r4.<init>(r0)
            r14.mo14893C(r4)
        L_0x027e:
            r25.mo15002m0()
            r2 = r4
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r0 = 2131231172(0x7f0801c4, float:1.8078418E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r10 = 0
            r12 = 390(0x186, float:5.47E-43)
            r13 = 696(0x2b8, float:9.75E-43)
            r11 = r25
            com.carrefour.fid.android.design.components.compose.ButtonComponentKt.m151340g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0299:
            r25.mo15002m0()
            r25.mo15002m0()
            r25.mo14896D()
            r25.mo15002m0()
            r25.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02b1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1.invoke(androidx.compose.runtime.o, int):void");
    }
}
