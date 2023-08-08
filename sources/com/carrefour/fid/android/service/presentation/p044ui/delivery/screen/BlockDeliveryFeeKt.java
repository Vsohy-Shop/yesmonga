package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.service.models.DeliveryFee;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo22516d2 = {"", "isLoading", "", "Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee;", "fees", "Lkotlin/Function0;", "Lkotlin/d2;", "onHowToGetItClicked", "BlockDeliveryFee", "(ZLjava/util/List;Lkotlin/jvm/functions/a;Landroidx/compose/runtime/o;II)V", "BlockDeliveryFeePreview", "(Landroidx/compose/runtime/o;I)V", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBlockDeliveryFee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockDeliveryFee.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/BlockDeliveryFeeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,91:1\n154#2:92\n154#2:129\n74#3,6:93\n80#3:125\n84#3:141\n75#4:99\n76#4,11:101\n89#4:140\n76#5:100\n460#6,13:112\n36#6:130\n473#6,3:137\n1045#7:126\n1855#7,2:127\n1114#8,6:131\n*S KotlinDebug\n*F\n+ 1 BlockDeliveryFee.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/BlockDeliveryFeeKt\n*L\n32#1:92\n68#1:129\n29#1:93,6\n29#1:125\n29#1:141\n29#1:99\n29#1:101,11\n29#1:140\n29#1:100\n29#1:112,13\n69#1:130\n29#1:137,3\n42#1:126\n42#1:127,2\n69#1:131,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeeKt */
public final class BlockDeliveryFeeKt {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeeKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeType[] r0 = com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeType r1 = com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeType.Amount     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeType r1 = com.carrefour.fid.android.domain.models.service.models.DeliveryFee.FeeType.Pregnancy     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.BlockDeliveryFeeKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeeKt$BlockDeliveryFee$1} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void BlockDeliveryFee(boolean r31, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.service.models.DeliveryFee> r32, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35, int r36) {
        /*
            r2 = r32
            java.lang.String r0 = "fees"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = -1535729111(0xffffffffa476a229, float:-5.3480102E-17)
            r1 = r34
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r36 & 1
            r15 = 0
            if (r3 == 0) goto L_0x0017
            r14 = r15
            goto L_0x0019
        L_0x0017:
            r14 = r31
        L_0x0019:
            r3 = r36 & 4
            if (r3 == 0) goto L_0x0021
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeeKt$BlockDeliveryFee$1 r3 = com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.BlockDeliveryFeeKt$BlockDeliveryFee$1.INSTANCE
            r12 = r3
            goto L_0x0023
        L_0x0021:
            r12 = r33
        L_0x0023:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0032
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFee (BlockDeliveryFee.kt:24)"
            r13 = r35
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r13, r3, r4)
            goto L_0x0034
        L_0x0032:
            r13 = r35
        L_0x0034:
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r3 = 0
            r11 = 1
            r9 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r3, r11, r9)
            r4 = 16
            float r7 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10026m(r0, r3, r4, r11, r9)
            r8 = 2
            androidx.compose.ui.m r0 = com.carrefour.fid.android.design.components.compose.C37019o.m151909b(r0, r14, r9, r8, r9)
            r3 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r3)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r3 = r3.mo7631r()
            androidx.compose.ui.c$a r4 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r4 = r4.mo17072u()
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.ColumnKt.m9863b(r3, r4, r1, r15)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r1.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r1.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r6 = r1.mo15032w(r6)
            androidx.compose.ui.platform.c4 r6 = (androidx.compose.p004ui.platform.C15863c4) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r8 = r10.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r9 = r1.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x009c
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x009c:
            r1.mo14938T()
            boolean r9 = r1.mo14997l()
            if (r9 == 0) goto L_0x00a9
            r1.mo14947W(r8)
            goto L_0x00ac
        L_0x00a9:
            r1.mo14888A()
        L_0x00ac:
            r1.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r9 = r10.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r3, r9)
            kotlin.jvm.functions.p r3 = r10.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r3)
            kotlin.jvm.functions.p r3 = r10.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r3)
            kotlin.jvm.functions.p r3 = r10.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r6, r3)
            r1.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r0.invoke(r3, r1, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            int r0 = com.carrefour.fid.android.service.C28330R.string.delivery_service_summary_price_list_title
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r15)
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r4 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r0 = r0.mo11077c(r1, r4)
            androidx.compose.ui.text.p0 r23 = com.carrefour.fid.android.design.theme.C37477d.m153885L(r0)
            androidx.compose.ui.text.font.i0$a r0 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r10 = r0.mo46947c()
            com.carrefour.fid.android.design.theme.b r0 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r5 = r0.mo114205B()
            r4 = 0
            r8 = 0
            r0 = r7
            r7 = r8
            r9 = 0
            r28 = 0
            r16 = 0
            r11 = r16
            r16 = 0
            r29 = r12
            r12 = r16
            r16 = 0
            r30 = r14
            r14 = r16
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 196608(0x30000, float:2.75506E-40)
            r26 = 0
            r27 = 65498(0xffda, float:9.1782E-41)
            r24 = r1
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = -793953851(0xffffffffd0ad39c5, float:-2.32499548E10)
            r1.mo14918M(r3)
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeeKt$BlockDeliveryFee$lambda$3$$inlined$sortedBy$1 r4 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeeKt$BlockDeliveryFee$lambda$3$$inlined$sortedBy$1
            r4.<init>()
            java.util.List r3 = kotlin.collections.CollectionsKt___CollectionsKt.m40675p5(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r10 = r3.iterator()
        L_0x0151:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x022a
            java.lang.Object r3 = r10.next()
            com.carrefour.fid.android.domain.models.service.models.DeliveryFee r3 = (com.carrefour.fid.android.domain.models.service.models.DeliveryFee) r3
            com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeType r4 = r3.mo119074k()
            int[] r5 = com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.BlockDeliveryFeeKt.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r5[r4]
            r5 = 0
            r11 = 1
            if (r4 == r11) goto L_0x0192
            r12 = 2
            if (r4 != r12) goto L_0x0183
            r4 = -788328943(0xffffffffd1030e11, float:-3.5179794E10)
            r1.mo14918M(r4)
            int r4 = com.carrefour.fid.android.service.C28330R.string.delivery_summary_pregnant_women
            r13 = 0
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r1, r13)
            r1.mo15002m0()
            goto L_0x0216
        L_0x0183:
            r0 = -788331269(0xffffffffd10304fb, float:-3.5170267E10)
            r1.mo14918M(r0)
            r1.mo15002m0()
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0192:
            r12 = 2
            r13 = 0
            r4 = -788329521(0xffffffffd1030bcf, float:-3.5177427E10)
            r1.mo14918M(r4)
            com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r4 = r3.mo119072i()
            r7 = 64
            if (r4 == 0) goto L_0x01f0
            com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r4 = r3.mo119072i()
            if (r4 == 0) goto L_0x01b1
            double r8 = r4.mo119083f()
            java.lang.Double r9 = java.lang.Double.valueOf(r8)
            goto L_0x01b3
        L_0x01b1:
            r9 = r28
        L_0x01b3:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Double) r9, (double) r5)
            if (r4 == 0) goto L_0x01ba
            goto L_0x01f0
        L_0x01ba:
            r4 = -788329290(0xffffffffd1030cb6, float:-3.5178373E10)
            r1.mo14918M(r4)
            int r4 = com.carrefour.fid.android.service.C28330R.string.delivery_summary_basket_between
            java.lang.Object[] r8 = new java.lang.Object[r12]
            com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r9 = r3.mo119073j()
            if (r9 == 0) goto L_0x01cf
            double r14 = r9.mo119083f()
            goto L_0x01d0
        L_0x01cf:
            r14 = r5
        L_0x01d0:
            java.lang.Double r9 = java.lang.Double.valueOf(r14)
            r8[r13] = r9
            com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r9 = r3.mo119072i()
            if (r9 == 0) goto L_0x01e1
            double r14 = r9.mo119083f()
            goto L_0x01e2
        L_0x01e1:
            r14 = r5
        L_0x01e2:
            java.lang.Double r9 = java.lang.Double.valueOf(r14)
            r8[r11] = r9
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71859e(r4, r8, r1, r7)
            r1.mo15002m0()
            goto L_0x0213
        L_0x01f0:
            r4 = -788329440(0xffffffffd1030c20, float:-3.5177759E10)
            r1.mo14918M(r4)
            int r4 = com.carrefour.fid.android.service.C28330R.string.delivery_summary_basket_greater_than
            java.lang.Object[] r8 = new java.lang.Object[r11]
            com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r9 = r3.mo119073j()
            if (r9 == 0) goto L_0x0205
            double r14 = r9.mo119083f()
            goto L_0x0206
        L_0x0205:
            r14 = r5
        L_0x0206:
            java.lang.Double r9 = java.lang.Double.valueOf(r14)
            r8[r13] = r9
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71859e(r4, r8, r1, r7)
            r1.mo15002m0()
        L_0x0213:
            r1.mo15002m0()
        L_0x0216:
            r7 = 0
            com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r3 = r3.mo119070h()
            if (r3 == 0) goto L_0x0221
            double r5 = r3.mo119083f()
        L_0x0221:
            r8 = 0
            r9 = 1
            r3 = r7
            r7 = r1
            com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.ItemDeliveryFeePriceKt.ItemDeliveryFeePrice(r3, r4, r5, r7, r8, r9)
            goto L_0x0151
        L_0x022a:
            r13 = 0
            r1.mo15002m0()
            int r3 = com.carrefour.fid.android.service.C28330R.string.delivery_summary_how_to_get_it
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r1, r13)
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            int r5 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r4 = r4.mo11077c(r1, r5)
            androidx.compose.ui.text.p0 r23 = com.carrefour.fid.android.design.theme.C37477d.m153896h(r4)
            com.carrefour.fid.android.design.theme.b r4 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r5 = r4.mo114218O()
            androidx.compose.ui.m$a r7 = androidx.compose.p004ui.C8767m.f23478j
            r8 = 0
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r10 = 0
            r11 = 0
            r12 = 13
            r13 = 0
            androidx.compose.ui.m r14 = androidx.compose.foundation.layout.PaddingKt.m10028o(r7, r8, r9, r10, r11, r12, r13)
            r15 = 0
            r16 = 0
            r17 = 0
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            r0 = r29
            boolean r4 = r1.mo15006n0(r0)
            java.lang.Object r7 = r1.mo14921N()
            if (r4 != 0) goto L_0x0275
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r7 != r4) goto L_0x027d
        L_0x0275:
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeeKt$BlockDeliveryFee$2$3$1 r7 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeeKt$BlockDeliveryFee$2$3$1
            r7.<init>(r0)
            r1.mo14893C(r7)
        L_0x027d:
            r1.mo15002m0()
            r18 = r7
            kotlin.jvm.functions.a r18 = (kotlin.jvm.functions.C11289a) r18
            r19 = 7
            r20 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.ClickableKt.m8878e(r14, r15, r16, r17, r18, r19, r20)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r27 = 65528(0xfff8, float:9.1824E-41)
            r24 = r1
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x02c2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02c2:
            androidx.compose.runtime.t1 r6 = r1.mo15020s()
            if (r6 != 0) goto L_0x02c9
            goto L_0x02db
        L_0x02c9:
            com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeeKt$BlockDeliveryFee$3 r7 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeeKt$BlockDeliveryFee$3
            r3 = r0
            r0 = r7
            r1 = r30
            r2 = r32
            r4 = r35
            r5 = r36
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x02db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.BlockDeliveryFeeKt.BlockDeliveryFee(boolean, java.util.List, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    /* access modifiers changed from: private */
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void BlockDeliveryFeePreview(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(-752114791);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-752114791, i2, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeePreview (BlockDeliveryFee.kt:75)");
            }
            ThemeKt.m153788a(C8553b.m31048b(o, -1365379978, true, new BlockDeliveryFeeKt$BlockDeliveryFeePreview$1(CollectionsKt__CollectionsKt.m40448L(new DeliveryFee(DeliveryFee.FeeType.Pregnancy, (DeliveryFee.FeeAmount) null, (DeliveryFee.FeeAmount) null, new DeliveryFee.FeeAmount(0, 3, "$", 1, (DefaultConstructorMarker) null), 6, (DefaultConstructorMarker) null), new DeliveryFee((DeliveryFee.FeeType) null, (DeliveryFee.FeeAmount) null, (DeliveryFee.FeeAmount) null, new DeliveryFee.FeeAmount(0, 2, "$", 1, (DefaultConstructorMarker) null), 7, (DefaultConstructorMarker) null), new DeliveryFee((DeliveryFee.FeeType) null, (DeliveryFee.FeeAmount) null, (DeliveryFee.FeeAmount) null, new DeliveryFee.FeeAmount(0, 3, "$", 1, (DefaultConstructorMarker) null), 7, (DefaultConstructorMarker) null)))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BlockDeliveryFeeKt$BlockDeliveryFeePreview$2(i2));
        }
    }
}
