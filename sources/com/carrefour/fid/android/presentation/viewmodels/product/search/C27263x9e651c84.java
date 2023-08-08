package com.carrefour.fid.android.presentation.viewmodels.product.search;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel", mo22502f = "ProductSearchWithListResultViewModel.kt", mo22503i = {0}, mo22504l = {36}, mo22505m = "checkSearchWithListAvailability", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$checkSearchWithListAvailability$1 */
public final class C27263x9e651c84 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductSearchWithListResultViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27263x9e651c84(ProductSearchWithListResultViewModel productSearchWithListResultViewModel, C11045c<? super C27263x9e651c84> cVar) {
        super(cVar);
        this.this$0 = productSearchWithListResultViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo79275e0(this);
    }
}
