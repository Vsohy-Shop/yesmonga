package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.RecommendedProductsByDepartmentModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListAllResultsFragment$handleDepartmentList$1$1$1$1 */
public final class C25614xb19c0950 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ List<RecommendedProductsByDepartmentModel> $departments;
    final /* synthetic */ int $index;
    final /* synthetic */ OfferProductModel $offer;
    final /* synthetic */ int $recommendedIndex;
    final /* synthetic */ ProductSearchWithListAllResultsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25614xb19c0950(ProductSearchWithListAllResultsFragment productSearchWithListAllResultsFragment, OfferProductModel offerProductModel, List<RecommendedProductsByDepartmentModel> list, int i, int i2) {
        super(0);
        this.this$0 = productSearchWithListAllResultsFragment;
        this.$offer = offerProductModel;
        this.$departments = list;
        this.$recommendedIndex = i;
        this.$index = i2;
    }

    public final void invoke() {
        ProductSearchWithListAllResultsFragment productSearchWithListAllResultsFragment = this.this$0;
        productSearchWithListAllResultsFragment.mo74499o0(this.$offer, productSearchWithListAllResultsFragment.mo74500o1(this.$departments, this.$recommendedIndex, this.$index + 1));
    }
}
