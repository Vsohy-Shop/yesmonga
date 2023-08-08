package com.carrefour.fid.android.presentation.viewmodels.product.search;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListAllResultsViewModel", mo22502f = "ProductSearchWithListAllResultsViewModel.kt", mo22503i = {0, 1, 2, 3}, mo22504l = {167, 164, 173, 174}, mo22505m = "loadProductsWithSearchResultMap", mo22506n = {"this", "this", "this", "this"}, mo22507s = {"L$0", "L$0", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListAllResultsViewModel$loadProductsWithSearchResultMap$1 */
public final class C27250xaf6ae7e4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductSearchWithListAllResultsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27250xaf6ae7e4(ProductSearchWithListAllResultsViewModel productSearchWithListAllResultsViewModel, C11045c<? super C27250xaf6ae7e4> cVar) {
        super(cVar);
        this.this$0 = productSearchWithListAllResultsViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo79259m0(this);
    }
}
