package com.carrefour.fid.android.presentation.viewmodels.product.search;

import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListRecommendationResultsViewModel", mo22502f = "ProductSearchWithListRecommendationResultsViewModel.kt", mo22503i = {0, 0, 1, 1, 2}, mo22504l = {128, 125, 134}, mo22505m = "getProductOfferList", mo22506n = {"this", "gtinList", "this", "gtinList", "this"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListRecommendationResultsViewModel$getProductOfferList$1 */
public final class C27257x2bd2fd6c extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductSearchWithListRecommendationResultsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27257x2bd2fd6c(ProductSearchWithListRecommendationResultsViewModel productSearchWithListRecommendationResultsViewModel, C11045c<? super C27257x2bd2fd6c> cVar) {
        super(cVar);
        this.this$0 = productSearchWithListRecommendationResultsViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo79267m0((List<String>) null, this);
    }
}
