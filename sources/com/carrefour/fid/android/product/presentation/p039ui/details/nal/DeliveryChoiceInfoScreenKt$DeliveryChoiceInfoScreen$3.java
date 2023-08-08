package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDeliveryChoiceInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryChoiceInfoScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,255:1\n154#2:256\n154#2:257\n154#2:290\n154#2:291\n75#3,5:258\n80#3:289\n84#3:303\n75#4:263\n76#4,11:265\n89#4:302\n76#5:264\n460#6,13:276\n36#6:292\n473#6,3:299\n1114#7,6:293\n*S KotlinDebug\n*F\n+ 1 DeliveryChoiceInfoScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$3\n*L\n68#1:256\n70#1:257\n72#1:290\n143#1:291\n65#1:258,5\n65#1:289\n65#1:303\n65#1:263\n65#1:265,11\n65#1:302\n65#1:264\n65#1:276,13\n144#1:292\n65#1:299,3\n144#1:293,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$3 */
public final class DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$3 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $isRelayPointEligible;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ ScrollState $scrollState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$3(ScrollState scrollState, boolean z, C11289a<C11079d2> aVar, int i) {
        super(3);
        this.$scrollState = scrollState;
        this.$isRelayPointEligible = z;
        this.$onBackPressed = aVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2366i0 r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r14 = r35
            r2 = r36
            java.lang.String r3 = "paddingValues"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = r2 & 14
            r15 = 2
            if (r3 != 0) goto L_0x001d
            boolean r3 = r14.mo15006n0(r1)
            if (r3 == 0) goto L_0x001a
            r3 = 4
            goto L_0x001b
        L_0x001a:
            r3 = r15
        L_0x001b:
            r3 = r3 | r2
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            r3 = r3 & 91
            r4 = 18
            if (r3 != r4) goto L_0x0030
            boolean r3 = r35.mo15011p()
            if (r3 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r35.mo14958a0()
            goto L_0x0309
        L_0x0030:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x003f
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreen.<anonymous> (DeliveryChoiceInfoScreen.kt:63)"
            r5 = 692321822(0x2943fe1e, float:4.351911E-14)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r2, r3, r4)
        L_0x003f:
            androidx.compose.ui.m$a r13 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10023j(r13, r1)
            r2 = 16
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r12 = 0
            r10 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10026m(r1, r2, r12, r15, r10)
            androidx.compose.foundation.ScrollState r4 = r0.$scrollState
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 14
            r9 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.ScrollKt.m9059f(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f6010a
            r3 = 8
            float r11 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r11)
            androidx.compose.foundation.layout.Arrangement$e r2 = r2.mo7638z(r3)
            boolean r9 = r0.$isRelayPointEligible
            kotlin.jvm.functions.a<kotlin.d2> r8 = r0.$onBackPressed
            r3 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo14918M(r3)
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r3 = r3.mo17072u()
            r4 = 6
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.ColumnKt.m9863b(r2, r3, r14, r4)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r6 = r14.mo15032w(r6)
            androidx.compose.ui.platform.c4 r6 = (androidx.compose.p004ui.platform.C15863c4) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r10 = r7.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r12 = r35.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x00b9
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00b9:
            r35.mo14938T()
            boolean r12 = r35.mo14997l()
            if (r12 == 0) goto L_0x00c6
            r14.mo14947W(r10)
            goto L_0x00c9
        L_0x00c6:
            r35.mo14888A()
        L_0x00c9:
            r35.mo14941U()
            androidx.compose.runtime.o r10 = androidx.compose.runtime.Updater.m30180b(r35)
            kotlin.jvm.functions.p r12 = r7.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r10, r2, r12)
            kotlin.jvm.functions.p r2 = r7.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r10, r3, r2)
            kotlin.jvm.functions.p r2 = r7.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r10, r5, r2)
            kotlin.jvm.functions.p r2 = r7.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r10, r6, r2)
            r35.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r35)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r12 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r1.invoke(r2, r14, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r11)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10024k(r13, r1)
            androidx.compose.foundation.layout.C2428y0.m10726a(r1, r14, r4)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_resume
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r12)
            androidx.compose.material.t0 r10 = androidx.compose.material.C7933t0.f19075a
            int r7 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r2 = r10.mo11077c(r14, r7)
            androidx.compose.ui.text.p0 r21 = com.carrefour.fid.android.design.theme.C37477d.m153890b(r2)
            int r5 = com.carrefour.fid.android.product.C27609f.C27615f.ds_grey_10
            long r3 = androidx.compose.p004ui.res.C16009b.m71825a(r5, r14, r12)
            r2 = 0
            r16 = 0
            r26 = r5
            r5 = r16
            r16 = 0
            r27 = r7
            r7 = r16
            r28 = r8
            r8 = r16
            r29 = r9
            r9 = r16
            r16 = 0
            r31 = r10
            r30 = r11
            r10 = r16
            r16 = 0
            r12 = r16
            r32 = r13
            r13 = r16
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 65530(0xfffa, float:9.1827E-41)
            r22 = r35
            androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = 504063571(0x1e0b6653, float:7.379759E-21)
            r14 = r35
            r14.mo14918M(r1)
            if (r29 == 0) goto L_0x0204
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_relay_info_title_home
            r15 = 0
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r15)
            r12 = 0
            r13 = 2
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116813g(r1, r12, r14, r15, r13)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_relay_pick_up_store
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r15)
            int r11 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_relay_delay
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r11, r14, r15)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_relay_delay_pick_up_order
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r15)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_free
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r15)
            r1 = 0
            r2 = 1
            r7 = 0
            r9 = 54
            r10 = 64
            r8 = r35
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116810d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_pick_up
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r15)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r11, r14, r15)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_pick_up_delay_pick_up_order
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r15)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_pick_up_costs
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r15)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_delivery_fees_4
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r15)
            r1 = 1
            r10 = 0
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116810d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_relay_pick_up_information
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r15)
            r3 = r27
            r2 = r31
            androidx.compose.material.w1 r2 = r2.mo11077c(r14, r3)
            androidx.compose.ui.text.p0 r21 = com.carrefour.fid.android.design.theme.C37477d.m153890b(r2)
            r2 = r26
            long r3 = androidx.compose.p004ui.res.C16009b.m71825a(r2, r14, r15)
            r2 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r16 = 0
            r12 = r16
            r13 = r16
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 65530(0xfffa, float:9.1827E-41)
            r22 = r35
            androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0204:
            r35.mo15002m0()
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_title_home
            r14 = r35
            r11 = 0
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r11)
            r12 = 2
            r13 = 0
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116813g(r1, r13, r14, r11, r12)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_title_home_standard
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r11)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_2_3_delays
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r11)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_delivery_fees_1
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r11)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_delivery_fees_4
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r11)
            r1 = 1
            r2 = 0
            r3 = 0
            r9 = 6
            r10 = 6
            r8 = r35
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116810d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_title_big_product
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r11)
            int r15 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_7_8_delay
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r15, r14, r11)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_delivery_fees_2
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r11)
            int r10 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_delivery_fees_5
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r10, r14, r11)
            r1 = 1
            r16 = 6
            r12 = r10
            r10 = r16
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116810d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_title_big_product_2
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r11)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r15, r14, r11)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_delivery_fees_3
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r11)
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r12, r14, r11)
            r1 = 1
            r10 = 6
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116810d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = com.carrefour.fid.android.product.C27609f.C27627r.delivery_choice_info_delivery_other_infos
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r11)
            r2 = 2
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt.m116813g(r1, r13, r14, r11, r2)
            com.carrefour.fid.android.design.theme.b r1 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r7 = r1.mo114208E()
            r9 = 0
            r10 = 2
            r11 = 0
            r6 = r32
            androidx.compose.ui.m r2 = androidx.compose.foundation.BackgroundKt.m8825d(r6, r7, r9, r10, r11)
            r3 = 1
            r4 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r4, r3, r13)
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r30)
            androidx.compose.ui.m r13 = androidx.compose.foundation.layout.PaddingKt.m10026m(r2, r4, r5, r3, r13)
            androidx.compose.material.i r2 = androidx.compose.material.C3049i.f8133a
            long r3 = r1.mo114218O()
            r5 = 0
            r7 = 0
            r9 = 0
            int r1 = androidx.compose.material.C3049i.f8145m
            int r11 = r1 << 12
            r12 = 14
            r1 = r2
            r2 = r3
            r4 = r5
            r6 = r7
            r8 = r9
            r10 = r35
            androidx.compose.material.h r8 = r1.mo10775a(r2, r4, r6, r8, r10, r11, r12)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r1)
            r1 = r28
            boolean r2 = r14.mo15006n0(r1)
            java.lang.Object r3 = r35.mo14921N()
            if (r2 != 0) goto L_0x02cf
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x02d7
        L_0x02cf:
            com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$3$1$1$1 r3 = new com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$3$1$1$1
            r3.<init>(r1)
            r14.mo14893C(r3)
        L_0x02d7:
            r35.mo15002m0()
            r1 = r3
            kotlin.jvm.functions.a r1 = (kotlin.jvm.functions.C11289a) r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            com.carrefour.fid.android.product.presentation.ui.details.nal.ComposableSingletons$DeliveryChoiceInfoScreenKt r2 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.ComposableSingletons$DeliveryChoiceInfoScreenKt.f67416a
            kotlin.jvm.functions.q r10 = r2.mo80792a()
            r12 = 805306368(0x30000000, float:4.656613E-10)
            r15 = 380(0x17c, float:5.32E-43)
            r2 = r13
            r11 = r35
            r13 = r15
            androidx.compose.material.ButtonKt.m13343a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r35.mo15002m0()
            r35.mo14896D()
            r35.mo15002m0()
            r35.mo15002m0()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0309
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0309:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryChoiceInfoScreen$3.invoke(androidx.compose.foundation.layout.i0, androidx.compose.runtime.o, int):void");
    }
}
