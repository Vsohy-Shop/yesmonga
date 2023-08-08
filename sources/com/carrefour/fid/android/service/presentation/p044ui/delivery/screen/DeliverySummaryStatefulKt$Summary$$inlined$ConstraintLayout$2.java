package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.C8592o;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$2\n+ 2 DeliverySummaryStateful.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/DeliverySummaryStatefulKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1524:1\n191#2,5:1525\n202#2:1537\n250#2:1538\n249#2:1539\n257#2,2:1573\n259#2,3:1576\n256#2,12:1579\n268#2,2:1598\n264#2,8:1600\n273#2,2:1613\n276#2:1622\n36#3:1530\n460#3,13:1559\n36#3:1591\n473#3,3:1608\n36#3:1615\n1114#4,6:1531\n1114#4,6:1592\n1114#4,6:1616\n74#5,6:1540\n80#5:1572\n84#5:1612\n75#6:1546\n76#6,11:1548\n89#6:1611\n76#7:1547\n154#8:1575\n*S KotlinDebug\n*F\n+ 1 DeliverySummaryStateful.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/DeliverySummaryStatefulKt\n*L\n195#1:1530\n249#1:1559,13\n267#1:1591\n249#1:1608,3\n274#1:1615\n195#1:1531,6\n267#1:1592,6\n274#1:1616,6\n249#1:1540,6\n249#1:1572\n249#1:1612\n249#1:1546\n249#1:1548,11\n249#1:1611\n249#1:1547\n258#1:1575\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$$inlined$ConstraintLayout$2 */
public final class DeliverySummaryStatefulKt$Summary$$inlined$ConstraintLayout$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ C11300l $actioner$inlined;
    final /* synthetic */ Address $address$inlined;
    final /* synthetic */ DeliveryType $deliveryType$inlined;
    final /* synthetic */ boolean $displayExitDialog$inlined;
    final /* synthetic */ boolean $isValidationLoading$inlined;
    final /* synthetic */ LazyListState $listState$inlined;
    final /* synthetic */ Double $minAmount$inlined;
    final /* synthetic */ C11289a $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ StoreService $storeService$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryStatefulKt$Summary$$inlined$ConstraintLayout$2(ConstraintLayoutScope constraintLayoutScope, int i, C11289a aVar, LazyListState lazyListState, boolean z, C11300l lVar, int i2, Address address, Double d, DeliveryType deliveryType, StoreService storeService, boolean z2) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = aVar;
        this.$listState$inlined = lazyListState;
        this.$displayExitDialog$inlined = z;
        this.$actioner$inlined = lVar;
        this.$$dirty$inlined = i2;
        this.$address$inlined = address;
        this.$minAmount$inlined = d;
        this.$deliveryType$inlined = deliveryType;
        this.$storeService$inlined = storeService;
        this.$isValidationLoading$inlined = z2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r14 = r29
            r1 = r30 & 11
            r1 = r1 ^ 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r29.mo15011p()
            if (r1 != 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            r29.mo14958a0()
            r14 = r0
            goto L_0x0227
        L_0x0017:
            androidx.constraintlayout.compose.ConstraintLayoutScope r1 = r0.$scope
            int r15 = r1.mo48254G()
            androidx.constraintlayout.compose.ConstraintLayoutScope r1 = r0.$scope
            r1.mo48256J()
            androidx.constraintlayout.compose.ConstraintLayoutScope r13 = r0.$scope
            androidx.constraintlayout.compose.ConstraintLayoutScope$a r1 = r13.mo48332O()
            androidx.constraintlayout.compose.e r2 = r1.mo48336a()
            androidx.constraintlayout.compose.e r12 = r1.mo48344i()
            androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
            r10 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r10)
            boolean r1 = r14.mo15006n0(r12)
            java.lang.Object r3 = r29.mo14921N()
            if (r1 != 0) goto L_0x004a
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r3 != r1) goto L_0x0052
        L_0x004a:
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$1$1 r3 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$1$1
            r3.<init>(r12)
            r14.mo14893C(r3)
        L_0x0052:
            r29.mo15002m0()
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            androidx.compose.ui.m r1 = r13.mo48330M(r11, r2, r3)
            androidx.compose.foundation.lazy.LazyListState r2 = r0.$listState$inlined
            r3 = 0
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$2 r9 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$2
            com.carrefour.fid.android.domain.models.account.Address r10 = r0.$address$inlined
            java.lang.Double r8 = r0.$minAmount$inlined
            com.carrefour.fid.android.service.presentation.model.DeliveryType r7 = r0.$deliveryType$inlined
            int r6 = r0.$$dirty$inlined
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r0.$storeService$inlined
            kotlin.jvm.functions.l r4 = r0.$actioner$inlined
            r16 = r9
            r17 = r10
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r5
            r22 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r16 = 0
            r17 = 252(0xfc, float:3.53E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = r29
            r30 = r15
            r15 = r11
            r11 = r16
            r0 = r12
            r12 = r17
            androidx.compose.foundation.lazy.LazyDslKt.m10737b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$3 r1 = com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$3.INSTANCE
            androidx.compose.ui.m r0 = r13.mo48330M(r15, r0, r1)
            r1 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo14918M(r1)
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r1 = r1.mo7631r()
            androidx.compose.ui.c$a r2 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r2 = r2.mo17072u()
            r13 = 0
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.ColumnKt.m9863b(r1, r2, r14, r13)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r14.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r5.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r7 = r29.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x00e9
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00e9:
            r29.mo14938T()
            boolean r7 = r29.mo14997l()
            if (r7 == 0) goto L_0x00f6
            r14.mo14947W(r6)
            goto L_0x00f9
        L_0x00f6:
            r29.mo14888A()
        L_0x00f9:
            r29.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r29)
            kotlin.jvm.functions.p r7 = r5.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r1, r7)
            kotlin.jvm.functions.p r1 = r5.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r1)
            kotlin.jvm.functions.p r1 = r5.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r1)
            kotlin.jvm.functions.p r1 = r5.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r1)
            r29.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r29)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r0.invoke(r1, r14, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r0 = 16
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r12 = 0
            r10 = 1
            r11 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10026m(r15, r12, r0, r10, r11)
            int r0 = com.carrefour.fid.android.service.C28330R.string.delivery_service_legal
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r14, r13)
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r3 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r0 = r0.mo11077c(r14, r3)
            androidx.compose.ui.text.p0 r21 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r0)
            com.carrefour.fid.android.design.theme.b r0 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r3 = r0.mo114257y()
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r0 = r11
            r10 = r16
            r16 = 0
            r12 = r16
            r13 = r16
            r16 = 0
            r27 = r30
            r26 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 48
            r24 = 0
            r25 = 65528(0xfff8, float:9.1824E-41)
            r22 = r29
            androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r26
            r2 = 1
            r3 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r1, r3, r2, r0)
            r0 = r29
            r13 = 1157296644(0x44faf204, float:2007.563)
            r0.mo14918M(r13)
            r14 = r28
            kotlin.jvm.functions.l r2 = r14.$actioner$inlined
            boolean r2 = r0.mo15006n0(r2)
            java.lang.Object r3 = r29.mo14921N()
            if (r2 != 0) goto L_0x01b0
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x01ba
        L_0x01b0:
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$4$1$1 r3 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$4$1$1
            kotlin.jvm.functions.l r2 = r14.$actioner$inlined
            r3.<init>(r2)
            r0.mo14893C(r3)
        L_0x01ba:
            r29.mo15002m0()
            r2 = r3
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r3 = 0
            r4 = 0
            r5 = 0
            int r6 = com.carrefour.fid.android.service.C28330R.string.delivery_service_start_shopping_button
            r15 = 0
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r6, r0, r15)
            boolean r7 = r14.$isValidationLoading$inlined
            r8 = 0
            r9 = 0
            r11 = 6
            r12 = 412(0x19c, float:5.77E-43)
            r10 = r29
            com.carrefour.fid.android.design.components.compose.ButtonComponentKt.m151339f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r29.mo15002m0()
            r29.mo14896D()
            r29.mo15002m0()
            r29.mo15002m0()
            r1 = -1073396332(0xffffffffc0054594, float:-2.0823717)
            r0.mo14918M(r1)
            boolean r1 = r14.$displayExitDialog$inlined
            if (r1 == 0) goto L_0x0215
            r0.mo14918M(r13)
            kotlin.jvm.functions.l r1 = r14.$actioner$inlined
            boolean r1 = r0.mo15006n0(r1)
            java.lang.Object r2 = r29.mo14921N()
            if (r1 != 0) goto L_0x0203
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x020d
        L_0x0203:
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$5$1 r2 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$5$1
            kotlin.jvm.functions.l r1 = r14.$actioner$inlined
            r2.<init>(r1)
            r0.mo14893C(r2)
        L_0x020d:
            r29.mo15002m0()
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.ExitDialogComponentKt.ExitDialogComponent(r2, r0, r15)
        L_0x0215:
            r29.mo15002m0()
            androidx.constraintlayout.compose.ConstraintLayoutScope r0 = r14.$scope
            int r0 = r0.mo48254G()
            r1 = r27
            if (r0 == r1) goto L_0x0227
            kotlin.jvm.functions.a r0 = r14.$onHelpersChanged
            r0.invoke()
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.DeliverySummaryStatefulKt$Summary$$inlined$ConstraintLayout$2.invoke(androidx.compose.runtime.o, int):void");
    }
}
