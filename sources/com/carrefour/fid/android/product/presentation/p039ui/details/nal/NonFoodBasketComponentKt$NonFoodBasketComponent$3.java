package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.product.presentation.models.C27647a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponentKt$NonFoodBasketComponent$3 */
public final class NonFoodBasketComponentKt$NonFoodBasketComponent$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C27647a $basketButtonType;
    final /* synthetic */ Discount $discount;
    final /* synthetic */ boolean $isBasketLoading;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<C27647a, C11079d2> $onClick;
    final /* synthetic */ Prices $prices;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodBasketComponentKt$NonFoodBasketComponent$3(C8767m mVar, Prices prices, Discount discount, boolean z, C27647a aVar, C11300l<? super C27647a, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$prices = prices;
        this.$discount = discount;
        this.$isBasketLoading = z;
        this.$basketButtonType = aVar;
        this.$onClick = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NonFoodBasketComponentKt.m116824a(this.$modifier, this.$prices, this.$discount, this.$isBasketLoading, this.$basketButtonType, this.$onClick, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
