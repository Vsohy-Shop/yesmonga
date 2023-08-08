package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.CheckoutSummaryKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderFragment$handleBasketResult$1 */
public final class CheckoutStepOneAdditionalOrderFragment$handleBasketResult$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ BasketAmounts $basketAmount;
    final /* synthetic */ Integer $nbItems;
    final /* synthetic */ BasketPromotionCode $promoCode;
    final /* synthetic */ BasketReturnableBags $returnableBags;
    final /* synthetic */ boolean $showPreparationFees;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepOneAdditionalOrderFragment$handleBasketResult$1(BasketAmounts basketAmounts, BasketPromotionCode basketPromotionCode, BasketReturnableBags basketReturnableBags, Integer num, boolean z) {
        super(2);
        this.$basketAmount = basketAmounts;
        this.$promoCode = basketPromotionCode;
        this.$returnableBags = basketReturnableBags;
        this.$nbItems = num;
        this.$showPreparationFees = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(902673406, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderFragment.handleBasketResult.<anonymous> (CheckoutStepOneAdditionalOrderFragment.kt:255)");
            }
            final BasketAmounts basketAmounts = this.$basketAmount;
            final BasketPromotionCode basketPromotionCode = this.$promoCode;
            final BasketReturnableBags basketReturnableBags = this.$returnableBags;
            final Integer num = this.$nbItems;
            final boolean z = this.$showPreparationFees;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -683168293, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-683168293, i2, -1, "com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderFragment.handleBasketResult.<anonymous>.<anonymous> (CheckoutStepOneAdditionalOrderFragment.kt:256)");
                        }
                        float f = (float) 26;
                        float f2 = (float) 16;
                        CheckoutSummaryKt.m162552a(PaddingKt.m10027n(BackgroundKt.m8825d(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), C16483g.m74435M(f2), C16483g.m74435M(f), C16483g.m74435M(f2), C16483g.m74435M(f)), basketAmounts, basketPromotionCode, basketReturnableBags, num.intValue(), z, 0, oVar, 4672, 64);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
