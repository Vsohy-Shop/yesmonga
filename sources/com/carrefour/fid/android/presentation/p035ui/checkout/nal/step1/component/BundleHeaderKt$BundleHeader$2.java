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
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.BundleHeaderKt$BundleHeader$2 */
public final class BundleHeaderKt$BundleHeader$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ double $amountInEuros;
    final /* synthetic */ int $bundleQty;
    final /* synthetic */ OfferDiscountType $discountType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BundleHeaderKt$BundleHeader$2(OfferDiscountType offerDiscountType, int i, double d, int i2) {
        super(2);
        this.$discountType = offerDiscountType;
        this.$bundleQty = i;
        this.$amountInEuros = d;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        BundleHeaderKt.m104743a(this.$discountType, this.$bundleQty, this.$amountInEuros, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}