package com.carrefour.fid.android.product.presentation.p039ui.details;

import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.product.presentation.models.extensions.C27661d;
import com.carrefour.fid.android.product.presentation.p039ui.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/utils/a;", "it", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/design/components/utils/a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsFragment$handleCriteoResult$1$1 */
public final class ProductDetailsFragment$handleCriteoResult$1$1 extends Lambda implements C11300l<C37133a, C11079d2> {
    final /* synthetic */ PlpOffer $offer;
    final /* synthetic */ String $onAddBasketTrackingUrl;
    final /* synthetic */ C38114b $plpItemData;
    final /* synthetic */ ProductDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDetailsFragment$handleCriteoResult$1$1(C38114b bVar, PlpOffer plpOffer, String str, ProductDetailsFragment productDetailsFragment) {
        super(1);
        this.$plpItemData = bVar;
        this.$offer = plpOffer;
        this.$onAddBasketTrackingUrl = str;
        this.this$0 = productDetailsFragment;
    }

    /* renamed from: a */
    public final void mo80605a(@C12579k C37133a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        if (this.$plpItemData.mo118843k() > 0) {
            QuantityBackDropFragment.C28089a.m117643b(QuantityBackDropFragment.f68038Z, this.$offer.mo118819v().mo118136f(), (Integer) null, this.$plpItemData.mo118843k(), (PlpProductAnalytics) null, (BasketType) null, this.$onAddBasketTrackingUrl, (C38115c) null, 90, (Object) null).show(this.this$0.requireActivity().mo57175g0(), (String) null);
        } else {
            this.this$0.mo80579m1().sendIntent(new C28135b.C28151c.C28152a(this.$offer.mo118819v().mo118136f(), this.$offer.mo118792C(), this.$plpItemData.mo118843k(), C27661d.m116379f(this.$offer, this.$plpItemData.mo118843k()), C27661d.m116376c(this.$offer), C27661d.m116378e(this.$offer, this.$plpItemData.mo118843k()), true, (DefaultConstructorMarker) null));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80605a((C37133a) obj);
        return C11079d2.f28267a;
    }
}
