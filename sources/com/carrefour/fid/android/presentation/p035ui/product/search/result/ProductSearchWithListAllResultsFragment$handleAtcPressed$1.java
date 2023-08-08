package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import android.os.Bundle;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27308b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/os/Bundle;", "it", "Lkotlin/d2;", "a", "(Landroid/os/Bundle;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListAllResultsFragment$handleAtcPressed$1 */
public final class ProductSearchWithListAllResultsFragment$handleAtcPressed$1 extends Lambda implements C11300l<Bundle, C11079d2> {
    final /* synthetic */ int $initialQuantity;
    final /* synthetic */ OfferProductModel $offer;
    final /* synthetic */ int $productPosition;
    final /* synthetic */ ProductSearchWithListAllResultsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductSearchWithListAllResultsFragment$handleAtcPressed$1(ProductSearchWithListAllResultsFragment productSearchWithListAllResultsFragment, OfferProductModel offerProductModel, int i, int i2) {
        super(1);
        this.this$0 = productSearchWithListAllResultsFragment;
        this.$offer = offerProductModel;
        this.$initialQuantity = i;
        this.$productPosition = i2;
    }

    /* renamed from: a */
    public final void mo74516a(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "it");
        this.this$0.mo74487d1().sendIntent(new C27308b.C27315d.C27319d(this.this$0.getArguments()));
        int p0 = this.$offer.mo121519p0();
        int i = this.$initialQuantity;
        if (p0 > i) {
            this.this$0.mo74486c1().mo79308d(this.$offer, p0 - this.$initialQuantity, this.$productPosition);
        } else if (p0 < i) {
            this.this$0.mo74486c1().mo79309e(this.$offer, this.$initialQuantity - p0, this.$productPosition);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74516a((Bundle) obj);
        return C11079d2.f28267a;
    }
}
