package com.carrefour.fid.android.checkout.presentation.p071ui.basket.component;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.basket.component.CheckoutSummaryKt$CheckoutSummary$3 */
public final class CheckoutSummaryKt$CheckoutSummary$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BasketAmounts $basketAmount;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ int $nbItems;
    final /* synthetic */ BasketPromotionCode $promoCode;
    final /* synthetic */ BasketReturnableBags $returnableBags;
    final /* synthetic */ boolean $showPreparationFees;
    final /* synthetic */ int $stampsCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutSummaryKt$CheckoutSummary$3(C8767m mVar, BasketAmounts basketAmounts, BasketPromotionCode basketPromotionCode, BasketReturnableBags basketReturnableBags, int i, boolean z, int i2, int i3, int i4) {
        super(2);
        this.$modifier = mVar;
        this.$basketAmount = basketAmounts;
        this.$promoCode = basketPromotionCode;
        this.$returnableBags = basketReturnableBags;
        this.$nbItems = i;
        this.$showPreparationFees = z;
        this.$stampsCount = i2;
        this.$$changed = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CheckoutSummaryKt.m162552a(this.$modifier, this.$basketAmount, this.$promoCode, this.$returnableBags, this.$nbItems, this.$showPreparationFees, this.$stampsCount, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
