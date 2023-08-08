package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nNonFoodCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,932:1\n36#2:933\n36#2:940\n1114#3,6:934\n1114#3,6:941\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3\n*L\n499#1:933\n503#1:940\n499#1:934,6\n503#1:941,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3 */
public final class NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C11300l<C23617b, C11079d2> $actioner;
    final /* synthetic */ BasketAmounts $basketAmounts;
    final /* synthetic */ Address $billingAddress;
    final /* synthetic */ C26191b.C26192a $cardFid;
    final /* synthetic */ Address $deliveryAddress;
    final /* synthetic */ boolean $displayCardFidDialog;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ C38080a $pickupSelected;
    final /* synthetic */ int $productCount;
    final /* synthetic */ BasketPromotionCode $promoCode;
    final /* synthetic */ C28892e<C11079d2> $promoCodeState;
    final /* synthetic */ List<C26191b.C26193b> $selectableDeliveryModes;
    final /* synthetic */ String $telephone;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3(LazyListState lazyListState, int i, boolean z, C11300l<? super C23617b, C11079d2> lVar, List<C26191b.C26193b> list, C38080a aVar, BasketAmounts basketAmounts, Address address, Address address2, String str, int i2, BasketPromotionCode basketPromotionCode, C28892e<C11079d2> eVar, C26191b.C26192a aVar2, int i3) {
        super(3);
        this.$listState = lazyListState;
        this.$$dirty1 = i;
        this.$displayCardFidDialog = z;
        this.$actioner = lVar;
        this.$selectableDeliveryModes = list;
        this.$pickupSelected = aVar;
        this.$basketAmounts = basketAmounts;
        this.$deliveryAddress = address;
        this.$billingAddress = address2;
        this.$telephone = str;
        this.$$dirty = i2;
        this.$promoCode = basketPromotionCode;
        this.$promoCodeState = eVar;
        this.$cardFid = aVar2;
        this.$productCount = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2366i0 r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r33, int r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r13 = r33
            r2 = r34
            java.lang.String r3 = "paddingValues"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = r2 & 14
            if (r3 != 0) goto L_0x001c
            boolean r3 = r13.mo15006n0(r1)
            if (r3 == 0) goto L_0x0019
            r3 = 4
            goto L_0x001a
        L_0x0019:
            r3 = 2
        L_0x001a:
            r3 = r3 | r2
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            r3 = r3 & 91
            r4 = 18
            if (r3 != r4) goto L_0x002f
            boolean r3 = r33.mo15011p()
            if (r3 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            r33.mo14958a0()
            goto L_0x013b
        L_0x002f:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x003e
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Screen.<anonymous> (NonFoodCheckoutStep2Screen.kt:351)"
            r5 = -1804587874(0xffffffff94702c9e, float:-1.2125703E-26)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r2, r3, r4)
        L_0x003e:
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r3 = 1
            r4 = 0
            r5 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r5, r3, r4)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10023j(r2, r1)
            com.carrefour.fid.android.design.theme.b r1 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r4 = r1.mo114231a0()
            r6 = 0
            r7 = 2
            r8 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.BackgroundKt.m8825d(r3, r4, r6, r7, r8)
            androidx.compose.ui.c$a r2 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r6 = r2.mo17072u()
            androidx.compose.foundation.lazy.LazyListState r2 = r0.$listState
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3$1 r9 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3$1
            java.util.List<com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$b> r15 = r0.$selectableDeliveryModes
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b, kotlin.d2> r10 = r0.$actioner
            int r11 = r0.$$dirty1
            com.carrefour.fid.android.domain.models.pickup.a r12 = r0.$pickupSelected
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r14 = r0.$basketAmounts
            com.carrefour.fid.android.domain.models.account.Address r8 = r0.$deliveryAddress
            com.carrefour.fid.android.domain.models.account.Address r7 = r0.$billingAddress
            java.lang.String r5 = r0.$telephone
            int r4 = r0.$$dirty
            com.carrefour.fid.android.domain.models.basket.BasketPromotionCode r3 = r0.$promoCode
            com.carrefour.fid.android.shared.type.e<kotlin.d2> r13 = r0.$promoCodeState
            r29 = r6
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$a r6 = r0.$cardFid
            r30 = r1
            int r1 = r0.$productCount
            r19 = r14
            r14 = r9
            r16 = r10
            r17 = r11
            r18 = r12
            r20 = r8
            r21 = r7
            r22 = r5
            r23 = r4
            r24 = r3
            r25 = r13
            r26 = r2
            r27 = r6
            r28 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            int r1 = r0.$$dirty1
            int r1 = r1 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r3 = 196608(0x30000, float:2.75506E-40)
            r11 = r1 | r3
            r12 = 220(0xdc, float:3.08E-43)
            r1 = r30
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r29
            r7 = 0
            r8 = 0
            r10 = r33
            androidx.compose.foundation.lazy.LazyDslKt.m10737b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = r0.$displayCardFidDialog
            if (r1 == 0) goto L_0x0132
            r1 = 2131952130(0x7f130202, float:1.9540694E38)
            r2 = 0
            r3 = r33
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r3, r2)
            r1 = 2131952129(0x7f130201, float:1.9540692E38)
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r3, r2)
            r1 = 2131952815(0x7f1304af, float:1.9542083E38)
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r3, r2)
            r1 = 2131952781(0x7f13048d, float:1.9542014E38)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r3, r2)
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b, kotlin.d2> r1 = r0.$actioner
            r2 = 1157296644(0x44faf204, float:2007.563)
            r3.mo14918M(r2)
            boolean r4 = r3.mo15006n0(r1)
            java.lang.Object r9 = r33.mo14921N()
            if (r4 != 0) goto L_0x00f5
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r9 != r4) goto L_0x00fd
        L_0x00f5:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3$2$1 r9 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3$2$1
            r9.<init>(r1)
            r3.mo14893C(r9)
        L_0x00fd:
            r33.mo15002m0()
            kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b, kotlin.d2> r1 = r0.$actioner
            r3.mo14918M(r2)
            boolean r2 = r3.mo15006n0(r1)
            java.lang.Object r4 = r33.mo14921N()
            if (r2 != 0) goto L_0x0119
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r4 != r2) goto L_0x0121
        L_0x0119:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3$3$1 r4 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3$3$1
            r4.<init>(r1)
            r3.mo14893C(r4)
        L_0x0121:
            r33.mo15002m0()
            r10 = r4
            kotlin.jvm.functions.a r10 = (kotlin.jvm.functions.C11289a) r10
            com.carrefour.fid.android.design.components.compose.f$b r1 = new com.carrefour.fid.android.design.components.compose.f$b
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            int r2 = com.carrefour.fid.android.design.components.compose.C36984f.C36986b.f92385g
            com.carrefour.fid.android.design.components.compose.DialogComponentKt.m151480c(r1, r3, r2)
        L_0x0132:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x013b
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3.invoke(androidx.compose.foundation.layout.i0, androidx.compose.runtime.o, int):void");
    }
}
