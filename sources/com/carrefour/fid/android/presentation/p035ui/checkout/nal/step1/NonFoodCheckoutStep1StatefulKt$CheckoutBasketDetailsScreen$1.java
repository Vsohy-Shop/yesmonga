package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.interactors.basket.C37562d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nNonFoodCheckoutStep1Stateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep1Stateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,600:1\n36#2:601\n1114#3,6:602\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep1Stateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$1\n*L\n228#1:601\n228#1:602,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$1 */
public final class NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23520c, C11079d2> $actioner;
    final /* synthetic */ C37562d $basketAndOffers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$1(C37562d dVar, C11300l<? super C23520c, C11079d2> lVar, int i) {
        super(2);
        this.$basketAndOffers = dVar;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r15 = r17
            r1 = r18
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r17.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r17.mo14958a0()
            goto L_0x00bb
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.CheckoutBasketDetailsScreen.<anonymous> (NonFoodCheckoutStep1Stateful.kt:222)"
            r4 = -455231133(0xffffffffe4ddb963, float:-3.2720712E22)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            com.carrefour.fid.android.domain.interactors.basket.d r1 = r0.$basketAndOffers
            if (r1 == 0) goto L_0x0033
            int r1 = r1.mo114369i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = com.carrefour.fid.android.shared.extension.C28759i.m119064a(r1, r2)
            r2 = 2131951880(0x7f130108, float:1.9540187E38)
            r3 = 0
            if (r1 == 0) goto L_0x0096
            r1 = -766712636(0xffffffffd24ce4c4, float:-2.20002845E11)
            r15.mo14918M(r1)
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r15, r3)
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 2131951659(0x7f13002b, float:1.9539739E38)
            java.lang.String r11 = androidx.compose.p004ui.res.C16018i.m71858d(r11, r15, r3)
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.checkout.nal.step1.c, kotlin.d2> r3 = r0.$actioner
            r12 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r12)
            boolean r12 = r15.mo15006n0(r3)
            java.lang.Object r13 = r17.mo14921N()
            if (r12 != 0) goto L_0x0076
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r13 != r12) goto L_0x007e
        L_0x0076:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$1$1$1 r13 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$1$1$1
            r13.<init>(r3)
            r15.mo14893C(r13)
        L_0x007e:
            r17.mo15002m0()
            r12 = r13
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            r13 = 0
            r14 = 62
            r3 = r4
            r5 = r6
            r7 = r8
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r17
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151505j(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14)
            r17.mo15002m0()
            goto L_0x00b2
        L_0x0096:
            r1 = -766712251(0xffffffffd24ce645, float:-2.20009153E11)
            r15.mo14918M(r1)
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r15, r3)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r10 = 0
            r11 = 30
            r9 = r17
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151511p(r1, r2, r3, r5, r7, r9, r10, r11)
            r17.mo15002m0()
        L_0x00b2:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00bb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$1.invoke(androidx.compose.runtime.o, int):void");
    }
}
