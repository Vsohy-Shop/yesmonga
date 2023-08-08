package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForCompose$3 */
public final class C23263xbd503ac9 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BasketAmounts $basketAmounts;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ int $nbItems;
    final /* synthetic */ C11289a<C11079d2> $onValidateBasket;
    final /* synthetic */ BasketPromotionCode $promoCode;
    final /* synthetic */ BasketReturnableBags $returnableBags;
    final /* synthetic */ boolean $showPreparationFees;
    final /* synthetic */ int $stampsCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23263xbd503ac9(BasketAmounts basketAmounts, BasketPromotionCode basketPromotionCode, BasketReturnableBags basketReturnableBags, int i, int i2, boolean z, boolean z2, C11289a<C11079d2> aVar, int i3, int i4) {
        super(2);
        this.$basketAmounts = basketAmounts;
        this.$promoCode = basketPromotionCode;
        this.$returnableBags = basketReturnableBags;
        this.$nbItems = i;
        this.$stampsCount = i2;
        this.$showPreparationFees = z;
        this.$isLoading = z2;
        this.$onValidateBasket = aVar;
        this.$$changed = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CheckoutStep1FooterStatefulKt.m103946b(this.$basketAmounts, this.$promoCode, this.$returnableBags, this.$nbItems, this.$stampsCount, this.$showPreparationFees, this.$isLoading, this.$onValidateBasket, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
