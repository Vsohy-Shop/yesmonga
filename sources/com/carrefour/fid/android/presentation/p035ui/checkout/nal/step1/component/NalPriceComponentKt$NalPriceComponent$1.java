package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.NalPriceComponentKt$NalPriceComponent$1 */
public final class NalPriceComponentKt$NalPriceComponent$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isVariableWeight;
    final /* synthetic */ int $quantity;
    final /* synthetic */ Double $subPrice;
    final /* synthetic */ Double $totalAmount;
    final /* synthetic */ OfferDiscountType $type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NalPriceComponentKt$NalPriceComponent$1(OfferDiscountType offerDiscountType, Double d, Double d2, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$type = offerDiscountType;
        this.$totalAmount = d;
        this.$subPrice = d2;
        this.$isVariableWeight = z;
        this.$isEnabled = z2;
        this.$quantity = i;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NalPriceComponentKt.m104768a(this.$type, this.$totalAmount, this.$subPrice, this.$isVariableWeight, this.$isEnabled, this.$quantity, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
