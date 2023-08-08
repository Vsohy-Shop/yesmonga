package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.os.Bundle;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26916f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/os/Bundle;", "it", "Lkotlin/d2;", "a", "(Landroid/os/Bundle;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderFragment$handleAtcPressed$1 */
public final class CheckoutStepOneAdditionalOrderFragment$handleAtcPressed$1 extends Lambda implements C11300l<Bundle, C11079d2> {
    final /* synthetic */ int $initialQuantity;
    final /* synthetic */ OfferProductModel $offer;
    final /* synthetic */ CheckoutStepOneAdditionalOrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepOneAdditionalOrderFragment$handleAtcPressed$1(CheckoutStepOneAdditionalOrderFragment checkoutStepOneAdditionalOrderFragment, OfferProductModel offerProductModel, int i) {
        super(1);
        this.this$0 = checkoutStepOneAdditionalOrderFragment;
        this.$offer = offerProductModel;
        this.$initialQuantity = i;
    }

    /* renamed from: a */
    public final void mo72902a(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "it");
        this.this$0.mo72880a1().sendIntent(new C26916f.C26932c.C26941i(false, 1, (DefaultConstructorMarker) null));
        this.this$0.mo72880a1().mo77648N(this.$offer, this.$initialQuantity);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72902a((Bundle) obj);
        return C11079d2.f28267a;
    }
}
