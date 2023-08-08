package com.carrefour.fid.android.presentation.viewmodels.product.search;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListRecommendationResultsViewModel", mo22502f = "ProductSearchWithListRecommendationResultsViewModel.kt", mo22503i = {0, 0, 0, 0}, mo22504l = {194}, mo22505m = "addAllProductsToBasket", mo22506n = {"this", "isAddProductFailed", "productAddedList", "offer"}, mo22507s = {"L$0", "L$1", "L$2", "L$4"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListRecommendationResultsViewModel$addAllProductsToBasket$1 */
public final class C27256xbeb0ecd4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductSearchWithListRecommendationResultsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27256xbeb0ecd4(ProductSearchWithListRecommendationResultsViewModel productSearchWithListRecommendationResultsViewModel, C11045c<? super C27256xbeb0ecd4> cVar) {
        super(cVar);
        this.this$0 = productSearchWithListRecommendationResultsViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo79266l0(this);
    }
}
