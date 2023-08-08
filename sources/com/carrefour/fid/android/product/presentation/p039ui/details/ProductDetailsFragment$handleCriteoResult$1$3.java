package com.carrefour.fid.android.product.presentation.p039ui.details;

import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.presentation.p039ui.details.C27810j;
import com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel;
import com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsFragment$handleCriteoResult$1$3 */
public final class ProductDetailsFragment$handleCriteoResult$1$3 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ PlpOffer $offer;
    final /* synthetic */ C38114b $plpItemData;
    final /* synthetic */ ProductDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDetailsFragment$handleCriteoResult$1$3(ProductDetailsFragment productDetailsFragment, C38114b bVar, PlpOffer plpOffer) {
        super(0);
        this.this$0 = productDetailsFragment;
        this.$plpItemData = bVar;
        this.$offer = plpOffer;
    }

    public final void invoke() {
        ProductDetailsViewModel a1 = this.this$0.mo80579m1();
        C38012n w = this.$plpItemData.mo118842j().mo118886w();
        a1.sendIntent(new C28135b.C28151c.C28159h(w != null ? w.mo117555k() : null));
        FragmentKt.m118823k(this.this$0, C27810j.C27813c.m116790b(C27810j.f67405a, this.$offer.mo118819v(), 0, (String) null, 6, (Object) null));
    }
}
