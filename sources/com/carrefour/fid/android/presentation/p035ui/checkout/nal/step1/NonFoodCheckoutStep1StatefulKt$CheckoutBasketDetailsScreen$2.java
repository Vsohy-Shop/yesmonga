package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26144b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nNonFoodCheckoutStep1Stateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep1Stateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,600:1\n36#2:601\n1114#3,6:602\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep1Stateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$2\n*L\n239#1:601\n239#1:602,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$2 */
public final class NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23520c, C11079d2> $actioner;
    final /* synthetic */ Basket $basket;
    final /* synthetic */ boolean $displayValidationButtonLoader;
    final /* synthetic */ boolean $showPreparationFees;
    final /* synthetic */ C26144b $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$2(C26144b bVar, Basket basket, boolean z, boolean z2, C11300l<? super C23520c, C11079d2> lVar, int i) {
        super(2);
        this.$state = bVar;
        this.$basket = basket;
        this.$displayValidationButtonLoader = z;
        this.$showPreparationFees = z2;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r8, int r9) {
        /*
            r7 = this;
            r0 = r9 & 11
            r1 = 2
            if (r0 != r1) goto L_0x0010
            boolean r0 = r8.mo15011p()
            if (r0 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            r8.mo14958a0()
            goto L_0x0075
        L_0x0010:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x001f
            r0 = -1
            java.lang.String r1 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.CheckoutBasketDetailsScreen.<anonymous> (NonFoodCheckoutStep1Stateful.kt:232)"
            r2 = 203151746(0xc1bd982, float:1.200622E-31)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r9, r0, r1)
        L_0x001f:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.b r9 = r7.$state
            com.carrefour.fid.android.shared.type.e r9 = r9.mo75966f()
            boolean r9 = r9 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r9 == 0) goto L_0x006c
            com.carrefour.fid.android.domain.models.basket.Basket r0 = r7.$basket
            if (r0 == 0) goto L_0x006c
            boolean r1 = r7.$displayValidationButtonLoader
            boolean r2 = r7.$showPreparationFees
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c, kotlin.d2> r9 = r7.$actioner
            r3 = 1157296644(0x44faf204, float:2007.563)
            r8.mo14918M(r3)
            boolean r3 = r8.mo15006n0(r9)
            java.lang.Object r4 = r8.mo14921N()
            if (r3 != 0) goto L_0x004b
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0053
        L_0x004b:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$2$1$1 r4 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$2$1$1
            r4.<init>(r9)
            r8.mo14893C(r4)
        L_0x0053:
            r8.mo15002m0()
            r3 = r4
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            int r9 = r7.$$dirty
            int r4 = r9 >> 12
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | 8
            int r9 = r9 << 3
            r9 = r9 & 896(0x380, float:1.256E-42)
            r5 = r4 | r9
            r6 = 0
            r4 = r8
            com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep1FooterStatefulKt.m103953i(r0, r1, r2, r3, r4, r5, r6)
        L_0x006c:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x0075
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$2.invoke(androidx.compose.runtime.o, int):void");
    }
}
