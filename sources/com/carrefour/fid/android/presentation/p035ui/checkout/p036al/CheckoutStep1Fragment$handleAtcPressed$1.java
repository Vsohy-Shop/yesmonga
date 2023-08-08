package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.mvi.C26024a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/os/Bundle;", "bundle", "Lkotlin/d2;", "a", "(Landroid/os/Bundle;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleAtcPressed$1 */
public final class CheckoutStep1Fragment$handleAtcPressed$1 extends Lambda implements C11300l<Bundle, C11079d2> {
    final /* synthetic */ int $initialQuantity;
    final /* synthetic */ boolean $isForRecommendedProducts;
    final /* synthetic */ OfferProductModel $offer;
    final /* synthetic */ int $productPosition;
    final /* synthetic */ CheckoutStep1Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep1Fragment$handleAtcPressed$1(CheckoutStep1Fragment checkoutStep1Fragment, OfferProductModel offerProductModel, int i, boolean z, int i2) {
        super(1);
        this.this$0 = checkoutStep1Fragment;
        this.$offer = offerProductModel;
        this.$initialQuantity = i;
        this.$isForRecommendedProducts = z;
        this.$productPosition = i2;
    }

    /* renamed from: a */
    public final void mo68199a(@C12579k Bundle bundle) {
        boolean z;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Boolean bool = (Boolean) bundle.get(QuantityBackDropFragment.f62744y);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            this.this$0.mo68155c1().sendIntent(new C26024a.C26054e.C26064j(this.$offer));
        } else {
            this.this$0.mo68155c1().sendIntent(new C26024a.C26054e.C26064j((OfferProductModel) null, 1, (DefaultConstructorMarker) null));
        }
        int p0 = this.$offer.mo121519p0();
        int i = this.$initialQuantity;
        if (p0 > i) {
            if (this.$isForRecommendedProducts) {
                this.this$0.mo68153a1().mo75491i(this.$offer, p0 - this.$initialQuantity, this.$productPosition);
                this.this$0.mo68155c1().sendIntent(new C26024a.C26054e.C26070p(this.$offer, p0 - this.$initialQuantity));
                return;
            }
            this.this$0.mo68153a1().mo75492j(this.$offer, p0 - this.$initialQuantity, this.$productPosition);
        } else if (p0 < i) {
            this.this$0.mo68153a1().mo75498p(this.$offer, this.$initialQuantity - p0, this.$productPosition);
            if (this.$isForRecommendedProducts) {
                this.this$0.mo68155c1().sendIntent(new C26024a.C26054e.C26070p(this.$offer, p0 - this.$initialQuantity));
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68199a((Bundle) obj);
        return C11079d2.f28267a;
    }
}
