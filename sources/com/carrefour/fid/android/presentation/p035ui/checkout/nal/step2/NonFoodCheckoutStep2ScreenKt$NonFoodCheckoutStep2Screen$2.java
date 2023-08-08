package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nNonFoodCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,932:1\n50#2:933\n49#2:934\n36#2:941\n1114#3,6:935\n1114#3,6:942\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2\n*L\n340#1:933\n340#1:934\n347#1:941\n340#1:935,6\n347#1:942,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2 */
public final class NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C11300l<C23617b, C11079d2> $actioner;
    final /* synthetic */ BasketAmounts $basketAmounts;
    final /* synthetic */ C26191b.C26192a $cardFid;
    final /* synthetic */ boolean $isValidatePaymentEnabled;
    final /* synthetic */ boolean $isValidatingBasket;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2(BasketAmounts basketAmounts, boolean z, boolean z2, C26191b.C26192a aVar, C11300l<? super C23617b, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$basketAmounts = basketAmounts;
        this.$isValidatingBasket = z;
        this.$isValidatePaymentEnabled = z2;
        this.$cardFid = aVar;
        this.$actioner = lVar;
        this.$$dirty1 = i;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13) {
        /*
            r11 = this;
            r1 = r13 & 11
            r2 = 2
            if (r1 != r2) goto L_0x0011
            boolean r1 = r12.mo15011p()
            if (r1 != 0) goto L_0x000c
            goto L_0x0011
        L_0x000c:
            r12.mo14958a0()
            goto L_0x00af
        L_0x0011:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0020
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Screen.<anonymous> (NonFoodCheckoutStep2Screen.kt:332)"
            r3 = -506019162(0xffffffffe1d6c2a6, float:-4.9520364E20)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r13, r1, r2)
        L_0x0020:
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 1
            r2 = 0
            r3 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r3, r1, r2)
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r1 = r11.$basketAmounts
            double r1 = r1.mo116868D()
            boolean r3 = r11.$isValidatingBasket
            boolean r4 = r11.$isValidatePaymentEnabled
            r5 = 2131952178(0x7f130232, float:1.9540791E38)
            r6 = 0
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r12, r6)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$a r6 = r11.$cardFid
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b, kotlin.d2> r7 = r11.$actioner
            r9 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.mo14918M(r9)
            boolean r9 = r12.mo15006n0(r6)
            boolean r10 = r12.mo15006n0(r7)
            r9 = r9 | r10
            java.lang.Object r10 = r12.mo14921N()
            if (r9 != 0) goto L_0x005c
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r10 != r9) goto L_0x0064
        L_0x005c:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2$1$1 r10 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2$1$1
            r10.<init>(r6, r7)
            r12.mo14893C(r10)
        L_0x0064:
            r12.mo15002m0()
            r6 = r10
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.checkout.nal.step2.b, kotlin.d2> r7 = r11.$actioner
            r9 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r9)
            boolean r9 = r12.mo15006n0(r7)
            java.lang.Object r10 = r12.mo14921N()
            if (r9 != 0) goto L_0x0084
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r10 != r9) goto L_0x008c
        L_0x0084:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2$2$1 r10 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2$2$1
            r10.<init>(r7)
            r12.mo14893C(r10)
        L_0x008c:
            r12.mo15002m0()
            r7 = r10
            kotlin.jvm.functions.a r7 = (kotlin.jvm.functions.C11289a) r7
            int r9 = r11.$$dirty
            int r9 = r9 >> 18
            r9 = r9 & 896(0x380, float:1.256E-42)
            r9 = r9 | 6
            int r10 = r11.$$dirty1
            int r10 = r10 << 9
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r10
            r10 = 0
            r8 = r12
            com.carrefour.fid.android.presentation.p035ui.checkout.common.ValidatePaymentComponentKt.m104655a(r0, r1, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00af
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2.invoke(androidx.compose.runtime.o, int):void");
    }
}
