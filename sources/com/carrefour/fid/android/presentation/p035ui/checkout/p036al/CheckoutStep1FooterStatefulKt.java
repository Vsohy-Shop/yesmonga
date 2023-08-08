package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C3044g0;
import androidx.compose.material.C7933t0;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8755m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.ButtonColor;
import com.carrefour.fid.android.design.components.compose.ButtonComponentKt;
import com.carrefour.fid.android.design.components.compose.ButtonType;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketOfferDomain;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.state.C23431a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26007d;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutStep1MVIViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.type.C28897f;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCheckoutStep1FooterStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep1FooterStateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1FooterStatefulKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,358:1\n25#2:359\n460#2,13:386\n83#2,3:401\n460#2,13:425\n473#2,3:439\n473#2,3:445\n460#2,13:469\n83#2,3:485\n36#2:494\n36#2:501\n460#2,13:523\n473#2,3:537\n460#2,13:562\n473#2,3:577\n473#2,3:582\n460#2,13:607\n460#2,13:641\n473#2,3:656\n473#2,3:662\n1114#3,6:360\n1114#3,6:404\n1114#3,6:488\n1114#3,6:495\n1114#3,6:502\n73#4,7:366\n80#4:399\n84#4:449\n74#4,6:450\n80#4:482\n73#4,7:542\n80#4:575\n84#4:581\n84#4:586\n73#4,7:587\n80#4:620\n84#4:666\n75#5:373\n76#5,11:375\n75#5:412\n76#5,11:414\n89#5:442\n89#5:448\n75#5:456\n76#5,11:458\n75#5:510\n76#5,11:512\n89#5:540\n75#5:549\n76#5,11:551\n89#5:580\n89#5:585\n75#5:594\n76#5,11:596\n75#5:628\n76#5,11:630\n89#5:659\n89#5:665\n76#6:374\n76#6:413\n76#6:457\n76#6:511\n76#6:550\n76#6:595\n76#6:629\n154#7:400\n154#7:444\n164#7:483\n154#7:484\n154#7:576\n154#7:655\n154#7:661\n154#7:667\n154#7:668\n79#8,2:410\n81#8:438\n85#8:443\n79#8,2:508\n81#8:536\n85#8:541\n74#8,7:621\n81#8:654\n85#8:660\n76#9:669\n76#9:670\n102#9,2:671\n*S KotlinDebug\n*F\n+ 1 CheckoutStep1FooterStateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1FooterStatefulKt\n*L\n154#1:359\n172#1:386,13\n178#1:401,3\n173#1:425,13\n173#1:439,3\n172#1:445,3\n236#1:469,13\n246#1:485,3\n253#1:494\n256#1:501\n242#1:523,13\n242#1:537,3\n271#1:562,13\n271#1:577,3\n236#1:582,3\n293#1:607,13\n294#1:641,13\n294#1:656,3\n293#1:662,3\n154#1:360,6\n178#1:404,6\n246#1:488,6\n253#1:495,6\n256#1:502,6\n172#1:366,7\n172#1:399\n172#1:449\n236#1:450,6\n236#1:482\n271#1:542,7\n271#1:575\n271#1:581\n236#1:586\n293#1:587,7\n293#1:620\n293#1:666\n172#1:373\n172#1:375,11\n173#1:412\n173#1:414,11\n173#1:442\n172#1:448\n236#1:456\n236#1:458,11\n242#1:510\n242#1:512,11\n242#1:540\n271#1:549\n271#1:551,11\n271#1:580\n236#1:585\n293#1:594\n293#1:596,11\n294#1:628\n294#1:630,11\n294#1:659\n293#1:665\n172#1:374\n173#1:413\n236#1:457\n242#1:511\n271#1:550\n293#1:595\n294#1:629\n177#1:400\n205#1:444\n241#1:483\n245#1:484\n273#1:576\n297#1:655\n311#1:661\n320#1:667\n321#1:668\n173#1:410,2\n173#1:438\n173#1:443\n242#1:508,2\n242#1:536\n242#1:541\n294#1:621,7\n294#1:654\n294#1:660\n66#1:669\n228#1:670\n228#1:671,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt */
public final class CheckoutStep1FooterStatefulKt {
    @C3044g0
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m103945a(@C12579k CheckoutStepOneAdditionalOrderViewModel checkoutStepOneAdditionalOrderViewModel, @C12580l C11289a<C11079d2> aVar, @C12580l BottomSheetBehavior<ViewGroup> bottomSheetBehavior, @C12580l C8592o oVar, int i, int i2) {
        C11289a<C11079d2> aVar2;
        int i3 = i;
        Intrinsics.checkNotNullParameter(checkoutStepOneAdditionalOrderViewModel, "viewModel");
        C8592o o = oVar.mo15009o(573479180);
        if ((i2 & 2) != 0) {
            aVar2 = C23257x3d8047c.f58969f;
        } else {
            aVar2 = aVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(573479180, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1AdditionOrderFooterStateful (CheckoutStep1FooterStateful.kt:97)");
        }
        C8578k2<C23431a> b = C8415c2.m30233b(checkoutStepOneAdditionalOrderViewModel.mo77834H0(), (CoroutineContext) null, o, 8, 1);
        BasketAmounts basketAmounts = (BasketAmounts) C28897f.m119478b(b.getValue().mo68627l());
        if (basketAmounts != null) {
            m103949e(basketAmounts, (BasketPromotionCode) C28897f.m119478b(b.getValue().mo68630o()), (BasketReturnableBags) C28897f.m119478b(b.getValue().mo68631p()), b.getValue().mo68629n(), b.getValue().mo68634s(), b.getValue().mo68633r(), b.getValue().mo68635t(), aVar2, bottomSheetBehavior, o, ((i3 << 18) & 29360128) | 134218312, 0);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C23258x3d8047e(checkoutStepOneAdditionalOrderViewModel, aVar2, bottomSheetBehavior, i, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0168, code lost:
        if (r2 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x016a;
     */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m103946b(com.carrefour.fid.android.domain.models.basket.BasketAmounts r34, com.carrefour.fid.android.domain.models.basket.BasketPromotionCode r35, com.carrefour.fid.android.domain.models.basket.BasketReturnableBags r36, int r37, int r38, boolean r39, boolean r40, kotlin.jvm.functions.C11289a<kotlin.C11079d2> r41, androidx.compose.runtime.C8592o r42, int r43, int r44) {
        /*
            r9 = r43
            r0 = -2107315042(0xffffffff8264ec9e, float:-1.68187E-37)
            r1 = r42
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r14 = r44
            r1 = r14 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0016
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$1 r1 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23259xbd503ac7.f58970f
            r20 = r1
            goto L_0x0018
        L_0x0016:
            r20 = r41
        L_0x0018:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0024
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterScreenForCompose (CheckoutStep1FooterStateful.kt:217)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r1, r2)
        L_0x0024:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = 0
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$expanded$2 r4 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23264x238cb531.f58971f
            r6 = 3080(0xc08, float:4.316E-42)
            r7 = 6
            r5 = r15
            java.lang.Object r1 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r1, r2, r3, r4, r5, r6, r7)
            r10 = r1
            androidx.compose.runtime.z0 r10 = (androidx.compose.runtime.C8700z0) r10
            r1 = 2131952000(0x7f130180, float:1.954043E38)
            java.lang.String r11 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r15, r0)
            r1 = 2131952001(0x7f130181, float:1.9540432E38)
            java.lang.String r12 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r15, r0)
            r1 = 2131952002(0x7f130182, float:1.9540434E38)
            java.lang.String r13 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r15, r0)
            r1 = 2131952003(0x7f130183, float:1.9540436E38)
            java.lang.String r16 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r15, r0)
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.graphics.j2$a r1 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r2 = r1.mo42852w()
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            androidx.compose.ui.m r1 = androidx.compose.foundation.BackgroundKt.m8825d(r1, r2, r4, r5, r6)
            r7 = 0
            r6 = 3
            androidx.compose.ui.m r1 = androidx.compose.animation.AnimationModifierKt.m7766b(r1, r7, r7, r6, r7)
            r5 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r5)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r2 = r2.mo7631r()
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r3 = r3.mo17072u()
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.ColumnKt.m9863b(r2, r3, r15, r0)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r4)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r15.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r15.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r15.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r17.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r7 = r15.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x00b7
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00b7:
            r15.mo14938T()
            boolean r7 = r15.mo14997l()
            if (r7 == 0) goto L_0x00c4
            r15.mo14947W(r6)
            goto L_0x00c7
        L_0x00c4:
            r15.mo14888A()
        L_0x00c7:
            r15.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r7 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r7)
            kotlin.jvm.functions.p r2 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r2)
            kotlin.jvm.functions.p r2 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r2)
            kotlin.jvm.functions.p r2 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r5, r2)
            r15.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.invoke(r2, r15, r3)
            r7 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r7)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r6 = 0
            r5 = 1
            r4 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r8, r6, r5, r4)
            r2 = 0
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r5 = 0
            r21 = 390(0x186, float:5.47E-43)
            r22 = 10
            r19 = 0
            r0 = 1
            r17 = 3
            r6 = r15
            r7 = r21
            r14 = r8
            r8 = r22
            androidx.compose.material.DividerKt.m13428a(r1, r2, r4, r5, r6, r7, r8)
            r1 = 0
            r2 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r14, r1, r0, r2)
            r2 = 60
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10115o(r1, r2)
            r2 = 5
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r10
            r3[r0] = r11
            r4 = 2
            r3[r4] = r12
            r3[r17] = r16
            r4 = 4
            r3[r4] = r13
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r15.mo14918M(r4)
            r4 = 0
            r5 = 0
        L_0x0150:
            if (r4 >= r2) goto L_0x015c
            r6 = r3[r4]
            boolean r6 = r15.mo15006n0(r6)
            r5 = r5 | r6
            int r4 = r4 + 1
            goto L_0x0150
        L_0x015c:
            java.lang.Object r2 = r15.mo14921N()
            if (r5 != 0) goto L_0x016a
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r2 != r3) goto L_0x0179
        L_0x016a:
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$2$1$1 r8 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$2$1$1
            r2 = r8
            r3 = r11
            r4 = r12
            r5 = r16
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r15.mo14893C(r8)
        L_0x0179:
            r15.mo15002m0()
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            androidx.compose.ui.m r23 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71867b(r1, r0, r2)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r0)
            boolean r1 = r15.mo15006n0(r10)
            java.lang.Object r2 = r15.mo14921N()
            if (r1 != 0) goto L_0x019a
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x01a2
        L_0x019a:
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$2$2$1 r2 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$2$2$1
            r2.<init>(r10)
            r15.mo14893C(r2)
        L_0x01a2:
            r15.mo15002m0()
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            r1 = 0
            androidx.compose.foundation.gestures.f r24 = androidx.compose.foundation.gestures.DraggableKt.m9310n(r2, r15, r1)
            androidx.compose.foundation.gestures.Orientation r25 = androidx.compose.foundation.gestures.Orientation.Vertical
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 252(0xfc, float:3.53E-43)
            r33 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.gestures.DraggableKt.m9307k(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r2 = 0
            r3 = 0
            r4 = 0
            r15.mo14918M(r0)
            boolean r0 = r15.mo15006n0(r10)
            java.lang.Object r5 = r15.mo14921N()
            if (r0 != 0) goto L_0x01da
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r5 != r0) goto L_0x01e2
        L_0x01da:
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$2$3$1 r5 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$2$3$1
            r5.<init>(r10)
            r15.mo14893C(r5)
        L_0x01e2:
            r15.mo15002m0()
            kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
            r6 = 7
            r7 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.ClickableKt.m8878e(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r1 = r7.mo17070q()
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r2 = r8.mo7628l()
            r3 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo14918M(r3)
            r3 = 54
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.RowKt.m10071d(r2, r1, r15, r3)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r11)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r15.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r15.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r15.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r5 = r12.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r6 = r15.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x023e
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x023e:
            r15.mo14938T()
            boolean r6 = r15.mo14997l()
            if (r6 == 0) goto L_0x024b
            r15.mo14947W(r5)
            goto L_0x024e
        L_0x024b:
            r15.mo14888A()
        L_0x024e:
            r15.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r6 = r12.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r1, r6)
            kotlin.jvm.functions.p r1 = r12.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r2, r1)
            kotlin.jvm.functions.p r1 = r12.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r3, r1)
            kotlin.jvm.functions.p r1 = r12.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r4, r1)
            r15.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r15, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            boolean r1 = m103947c(r10)
            int r2 = r9 >> 15
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 512(0x200, float:7.175E-43)
            int r3 = r9 >> 12
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r6 = r2 | r3
            r2 = r40
            r3 = r34
            r4 = r20
            r5 = r15
            m103954j(r1, r2, r3, r4, r5, r6)
            r15.mo15002m0()
            r15.mo14896D()
            r15.mo15002m0()
            r15.mo15002m0()
            r1 = -1050278501(0xffffffffc166059b, float:-14.3763685)
            r15.mo14918M(r1)
            boolean r1 = m103947c(r10)
            if (r1 == 0) goto L_0x0398
            r1 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r1)
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement$l r2 = r8.mo7631r()
            androidx.compose.ui.c$b r3 = r7.mo17072u()
            r4 = 0
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.ColumnKt.m9863b(r2, r3, r15, r4)
            r15.mo14918M(r11)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r15.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r15.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r15.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            kotlin.jvm.functions.a r6 = r12.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r8 = r15.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x0307
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0307:
            r15.mo14938T()
            boolean r8 = r15.mo14997l()
            if (r8 == 0) goto L_0x0314
            r15.mo14947W(r6)
            goto L_0x0317
        L_0x0314:
            r15.mo14888A()
        L_0x0317:
            r15.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r8 = r12.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r8)
            kotlin.jvm.functions.p r2 = r12.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r2)
            kotlin.jvm.functions.p r2 = r12.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r2)
            kotlin.jvm.functions.p r2 = r12.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r5, r2)
            r15.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.invoke(r2, r15, r3)
            r15.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r0 = 26
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r2 = 16
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10025l(r1, r2, r0)
            int r0 = r9 << 3
            r1 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r1
            r0 = r0 | 4672(0x1240, float:6.547E-42)
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r9
            r0 = r0 | r1
            int r1 = r9 << 6
            r2 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r2
            r18 = r0 | r1
            r19 = 0
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r0 = r15
            r15 = r39
            r16 = r38
            r17 = r0
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.CheckoutSummaryKt.m162552a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            goto L_0x0399
        L_0x0398:
            r0 = r15
        L_0x0399:
            r0.mo15002m0()
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x03b1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03b1:
            androidx.compose.runtime.t1 r11 = r0.mo15020s()
            if (r11 != 0) goto L_0x03b8
            goto L_0x03d5
        L_0x03b8:
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$3 r12 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$3
            r0 = r12
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r20
            r9 = r43
            r10 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x03d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep1FooterStatefulKt.m103946b(com.carrefour.fid.android.domain.models.basket.BasketAmounts, com.carrefour.fid.android.domain.models.basket.BasketPromotionCode, com.carrefour.fid.android.domain.models.basket.BasketReturnableBags, int, int, boolean, boolean, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: c */
    public static final boolean m103947c(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: d */
    public static final void m103948d(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$3$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$3$1$1} */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0162, code lost:
        if (r3 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0164;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m103949e(com.carrefour.fid.android.domain.models.basket.BasketAmounts r28, com.carrefour.fid.android.domain.models.basket.BasketPromotionCode r29, com.carrefour.fid.android.domain.models.basket.BasketReturnableBags r30, int r31, int r32, boolean r33, boolean r34, kotlin.jvm.functions.C11289a<kotlin.C11079d2> r35, com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.ViewGroup> r36, androidx.compose.runtime.C8592o r37, int r38, int r39) {
        /*
            r9 = r36
            r10 = r38
            r0 = 162556489(0x9b06a49, float:4.247041E-33)
            r1 = r37
            androidx.compose.runtime.o r7 = r1.mo15009o(r0)
            r8 = r39
            r1 = r8 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0018
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$1 r1 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$1.f58972f
            r21 = r1
            goto L_0x001a
        L_0x0018:
            r21 = r35
        L_0x001a:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0026
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterScreenForXML (CheckoutStep1FooterStateful.kt:142)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r1, r2)
        L_0x0026:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo14918M(r0)
            java.lang.Object r0 = r7.mo14921N()
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            r2 = 2
            r3 = 0
            if (r0 != r1) goto L_0x0043
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r3, r2, r3)
            r7.mo14893C(r0)
        L_0x0043:
            r7.mo15002m0()
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            r1 = 2131952000(0x7f130180, float:1.954043E38)
            r4 = 0
            java.lang.String r13 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r7, r4)
            r1 = 2131952001(0x7f130181, float:1.9540432E38)
            java.lang.String r14 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r7, r4)
            r1 = 2131952002(0x7f130182, float:1.9540434E38)
            java.lang.String r16 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r7, r4)
            r1 = 2131952003(0x7f130183, float:1.9540436E38)
            java.lang.String r15 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r7, r4)
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$2 r1 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$2
            r1.<init>(r9, r0, r3)
            r5 = 72
            androidx.compose.runtime.EffectsKt.m29896h(r9, r1, r7, r5)
            r1 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r7.mo14918M(r1)
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r5 = r5.mo7631r()
            androidx.compose.ui.c$a r6 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r6 = r6.mo17072u()
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.ColumnKt.m9863b(r5, r6, r7, r4)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.mo14918M(r6)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r7.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r7.mo15032w(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p004ui.unit.LayoutDirection) r12
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r6 = r7.mo15032w(r6)
            androidx.compose.ui.platform.c4 r6 = (androidx.compose.p004ui.platform.C15863c4) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r2 = r17.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r4 = r7.mo15017r()
            boolean r4 = r4 instanceof androidx.compose.runtime.C8428d
            if (r4 != 0) goto L_0x00c0
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00c0:
            r7.mo14938T()
            boolean r4 = r7.mo14997l()
            if (r4 == 0) goto L_0x00cd
            r7.mo14947W(r2)
            goto L_0x00d0
        L_0x00cd:
            r7.mo14888A()
        L_0x00d0:
            r7.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r7)
            kotlin.jvm.functions.p r4 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r5, r4)
            kotlin.jvm.functions.p r4 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r11, r4)
            kotlin.jvm.functions.p r4 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r12, r4)
            kotlin.jvm.functions.p r4 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r6, r4)
            r7.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r7)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.invoke(r2, r7, r5)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r7.mo14918M(r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r3 = 0
            r5 = 1
            r6 = 0
            androidx.compose.ui.m r22 = androidx.compose.foundation.layout.SizeKt.m10114n(r1, r3, r5, r6)
            r1 = 2131099832(0x7f0600b8, float:1.7812028E38)
            long r23 = androidx.compose.p004ui.res.C16009b.m71825a(r1, r7, r4)
            r25 = 0
            r26 = 2
            r27 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.BackgroundKt.m8825d(r22, r23, r25, r26, r27)
            r3 = 60
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10115o(r1, r3)
            r3 = 5
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r6 = 0
            r4[r6] = r0
            r4[r5] = r13
            r6 = 2
            r4[r6] = r14
            r6 = 3
            r4[r6] = r15
            r6 = 4
            r4[r6] = r16
            r6 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r7.mo14918M(r6)
            r6 = 0
            r11 = 0
        L_0x014a:
            if (r6 >= r3) goto L_0x0156
            r12 = r4[r6]
            boolean r12 = r7.mo15006n0(r12)
            r11 = r11 | r12
            int r6 = r6 + 1
            goto L_0x014a
        L_0x0156:
            java.lang.Object r3 = r7.mo14921N()
            if (r11 != 0) goto L_0x0164
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r3 != r4) goto L_0x016e
        L_0x0164:
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$3$1$1 r3 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$3$1$1
            r11 = r3
            r12 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            r7.mo14893C(r3)
        L_0x016e:
            r7.mo15002m0()
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            androidx.compose.ui.m r11 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71867b(r1, r5, r3)
            r12 = 0
            r13 = 0
            r14 = 0
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$3$2 r15 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$3$2
            r15.<init>(r9)
            r16 = 7
            r17 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.ClickableKt.m8878e(r11, r12, r13, r14, r15, r16, r17)
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r3 = r3.mo17070q()
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r4 = r4.mo7628l()
            r5 = 693286680(0x2952b718, float:4.6788176E-14)
            r7.mo14918M(r5)
            r5 = 54
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.RowKt.m10071d(r4, r3, r7, r5)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r7.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r7.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r6 = r7.mo15032w(r6)
            androidx.compose.ui.platform.c4 r6 = (androidx.compose.p004ui.platform.C15863c4) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r13 = r7.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x01d8
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01d8:
            r7.mo14938T()
            boolean r13 = r7.mo14997l()
            if (r13 == 0) goto L_0x01e5
            r7.mo14947W(r12)
            goto L_0x01e8
        L_0x01e5:
            r7.mo14888A()
        L_0x01e8:
            r7.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r7)
            kotlin.jvm.functions.p r13 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r3, r13)
            kotlin.jvm.functions.p r3 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r4, r3)
            kotlin.jvm.functions.p r3 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r5, r3)
            kotlin.jvm.functions.p r3 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r6, r3)
            r7.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r7)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.invoke(r3, r7, r4)
            r7.mo14918M(r2)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            int r0 = r10 >> 15
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 512(0x200, float:7.175E-43)
            int r2 = r10 >> 12
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r6 = r0 | r2
            r2 = r34
            r3 = r28
            r4 = r21
            r5 = r7
            m103954j(r1, r2, r3, r4, r5, r6)
            r7.mo15002m0()
            r7.mo14896D()
            r7.mo15002m0()
            r7.mo15002m0()
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 26
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r2 = 16
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r11 = androidx.compose.foundation.layout.PaddingKt.m10025l(r0, r2, r1)
            int r0 = r10 << 3
            r1 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r1
            r0 = r0 | 4672(0x1240, float:6.547E-42)
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r10
            r0 = r0 | r1
            int r1 = r10 << 6
            r2 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r2
            r19 = r0 | r1
            r20 = 0
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r33
            r17 = r32
            r18 = r7
            com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.CheckoutSummaryKt.m162552a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r7.mo15002m0()
            r7.mo14896D()
            r7.mo15002m0()
            r7.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x029e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x029e:
            androidx.compose.runtime.t1 r12 = r7.mo15020s()
            if (r12 != 0) goto L_0x02a5
            goto L_0x02c4
        L_0x02a5:
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$4 r13 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$4
            r0 = r13
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r21
            r9 = r36
            r10 = r38
            r11 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x02c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep1FooterStatefulKt.m103949e(com.carrefour.fid.android.domain.models.basket.BasketAmounts, com.carrefour.fid.android.domain.models.basket.BasketPromotionCode, com.carrefour.fid.android.domain.models.basket.BasketReturnableBags, int, int, boolean, boolean, kotlin.jvm.functions.a, com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m103950f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1489062837);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1489062837, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterScreenPreview (CheckoutStep1FooterStateful.kt:330)");
            }
            ThemeKt.m153788a(ComposableSingletons$CheckoutStep1FooterStatefulKt.f59045a.mo68305a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenPreview$1(i));
        }
    }

    @C3044g0
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m103951g(@C12579k CheckoutStep1MVIViewModel checkoutStep1MVIViewModel, @C12580l C11289a<C11079d2> aVar, @C12579k C26007d dVar, @C12580l BottomSheetBehavior<ViewGroup> bottomSheetBehavior, @C12580l C8592o oVar, int i, int i2) {
        C11289a<C11079d2> aVar2;
        boolean z;
        com.carrefour.fid.android.domain.models.BasketAmounts v;
        boolean z2;
        double d;
        List<BasketOfferDomain> B;
        C26007d dVar2 = dVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(checkoutStep1MVIViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(dVar2, "analyticsViewModel");
        C8592o o = oVar.mo15009o(-1951054407);
        if ((i2 & 2) != 0) {
            aVar2 = CheckoutStep1FooterStatefulKt$CheckoutStep1FooterStateful$1.f58974f;
        } else {
            aVar2 = aVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1951054407, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStateful (CheckoutStep1FooterStateful.kt:59)");
        }
        C8578k2<C23431a> b = C8415c2.m30233b(checkoutStep1MVIViewModel.mo75449n1(), (CoroutineContext) null, o, 8, 1);
        BasketAmounts basketAmounts = (BasketAmounts) C28897f.m119478b(m103952h(b).mo68627l());
        if (basketAmounts == null) {
            z = true;
        } else {
            z = true;
            m103949e(basketAmounts, (BasketPromotionCode) C28897f.m119478b(m103952h(b).mo68630o()), (BasketReturnableBags) C28897f.m119478b(m103952h(b).mo68631p()), m103952h(b).mo68629n(), m103952h(b).mo68634s(), m103952h(b).mo68633r(), m103952h(b).mo68635t(), aVar2, bottomSheetBehavior, o, ((i3 << 18) & 29360128) | 134218312, 0);
        }
        BasketDomain m = m103952h(b).mo68628m();
        if (!(m == null || (v = m.mo115498v()) == null)) {
            if (v.mo115423B() == 0.0d) {
                z2 = z;
            } else {
                z2 = false;
            }
            if (!z2) {
                d = v.mo115423B();
            } else {
                d = v.mo115452y();
            }
            BasketDomain m2 = m103952h(b).mo68628m();
            if (!(m2 == null || (B = m2.mo115459B()) == null)) {
                dVar2.mo75486d(B, (float) d);
            }
        }
        BasketDomain m3 = m103952h(b).mo68628m();
        if (m3 != null) {
            dVar2.mo75508z(m3, m103952h(b).mo68632q());
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutStep1FooterStatefulKt$CheckoutStep1FooterStateful$5(checkoutStep1MVIViewModel, aVar2, dVar, bottomSheetBehavior, i, i2));
        }
    }

    /* renamed from: h */
    public static final C23431a m103952h(C8578k2<C23431a> k2Var) {
        return k2Var.getValue();
    }

    @C3044g0
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m103953i(@C12579k Basket basket, boolean z, boolean z2, @C12580l C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        C23268xbbacee15 checkoutStep1FooterStatefulKt$CheckoutStep1NonFoodFooterStateful$1;
        int i3;
        int i4 = i;
        Intrinsics.checkNotNullParameter(basket, "basket");
        C8592o o = oVar.mo15009o(-132806158);
        if ((i2 & 8) != 0) {
            checkoutStep1FooterStatefulKt$CheckoutStep1NonFoodFooterStateful$1 = C23268xbbacee15.f58975f;
        } else {
            checkoutStep1FooterStatefulKt$CheckoutStep1NonFoodFooterStateful$1 = aVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-132806158, i4, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1NonFoodFooterStateful (CheckoutStep1FooterStateful.kt:120)");
        }
        if (basket.mo116827L() != null) {
            BasketAmounts w = basket.mo116855w();
            BasketPromotionCode E = basket.mo116820E();
            BasketReturnableBags H = basket.mo116823H();
            int D = basket.mo116819D();
            Integer L = basket.mo116827L();
            if (L != null) {
                i3 = L.intValue();
            } else {
                i3 = 0;
            }
            m103946b(w, E, H, D, i3, z2, z, checkoutStep1FooterStatefulKt$CheckoutStep1NonFoodFooterStateful$1, o, ((i4 << 9) & 458752) | 584 | ((i4 << 15) & 3670016) | ((i4 << 12) & 29360128), 0);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C23269xbbacee16(basket, z, z2, checkoutStep1FooterStatefulKt$CheckoutStep1NonFoodFooterStateful$1, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m103954j(boolean z, boolean z2, BasketAmounts basketAmounts, C11289a<C11079d2> aVar, C8592o oVar, int i) {
        float f;
        int i2 = i;
        C8592o o = oVar.mo15009o(-809643109);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-809643109, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.TotalAndValidate (CheckoutStep1FooterStateful.kt:286)");
        }
        o.mo14918M(-483455358);
        C8767m.C8768a aVar2 = C8767m.f23478j;
        Arrangement arrangement = Arrangement.f6010a;
        Arrangement.C2279l r = arrangement.mo7631r();
        C8734c.C8735a aVar3 = C8734c.f23406a;
        C15560f0 b = ColumnKt.m9863b(r, aVar3.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(aVar2);
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
        C8592o b2 = Updater.m30180b(o);
        Updater.m30188j(b2, b, companion.mo44588d());
        Updater.m30188j(b2, dVar, companion.mo44586b());
        Updater.m30188j(b2, layoutDirection, companion.mo44587c());
        Updater.m30188j(b2, c4Var, companion.mo44590f());
        o.mo14972e();
        f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        C8734c.C8737c q = aVar3.mo17070q();
        o.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(arrangement.mo7630p(), q, o, 48);
        o.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(aVar2);
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo14938T();
        if (o.mo14997l()) {
            o.mo14947W(a2);
        } else {
            o.mo14888A();
        }
        o.mo14941U();
        C8592o b3 = Updater.m30180b(o);
        Updater.m30188j(b3, d, companion.mo44588d());
        Updater.m30188j(b3, dVar2, companion.mo44586b());
        Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
        Updater.m30188j(b3, c4Var2, companion.mo44590f());
        o.mo14972e();
        f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        float f4 = (float) 16;
        C8767m.C8768a aVar4 = aVar2;
        C8767m o2 = PaddingKt.m10028o(aVar4, C16483g.m74435M(f4), C16483g.m74435M((float) 4), C16483g.m74435M((float) 7), 0.0f, 8, (Object) null);
        if (z) {
            f = 180.0f;
        } else {
            f = 0.0f;
        }
        IconKt.m13539b(C16015f.m71849d(R.drawable.ic_arrow_up_white, o, 0), (String) null, C8755m.m32557a(o2, f), C16009b.m71825a(R.color.ds_primary, o, 0), o, 56, 0);
        String d2 = C16018i.m71858d(R.string.basket_total_title, o, 0);
        C7933t0 t0Var = C7933t0.f19075a;
        int i3 = C7933t0.f19076b;
        C8592o oVar2 = o;
        TextKt.m14196c(d2, (C8767m) null, C16009b.m71825a(R.color.ds_primary, o, 0), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153900l(t0Var.mo11077c(o, i3)), oVar2, 0, 0, 65530);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        C8767m o3 = PaddingKt.m10028o(aVar2, C16483g.m74435M(f4), C16483g.m74435M((float) 2), 0.0f, 0.0f, 12, (Object) null);
        TextKt.m14196c(C28782t.m119105b(Double.valueOf(basketAmounts.mo116865A())), o3, C16009b.m71825a(R.color.ds_main_primary, o, 0), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153900l(t0Var.mo11077c(o, i3)), oVar2, 48, 0, 65528);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        ButtonComponentKt.m151340g(PaddingKt.m10028o(SizeKt.m10115o(aVar2, C16483g.m74435M((float) 40)), 0.0f, 0.0f, C16483g.m74435M(f4), 0.0f, 11, (Object) null), aVar, (ButtonType) null, (ButtonColor) null, false, z2, C16018i.m71858d(R.string.checkout_validate_basket, o, 0), (Integer) null, (Integer) null, false, o, ((i2 >> 6) & 112) | 6 | ((i2 << 12) & 458752), 924);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CheckoutStep1FooterStatefulKt$TotalAndValidate$2(z, z2, basketAmounts, aVar, i));
        }
    }
}
