package com.carrefour.fid.android.product.presentation.viewmodel.details;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel", mo22502f = "ProductDetailsViewModel.kt", mo22503i = {}, mo22504l = {384}, mo22505m = "sendUpdateBasketEvent-KLAd-A4", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductDetailsViewModel$sendUpdateBasketEvent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDetailsViewModel$sendUpdateBasketEvent$1(ProductDetailsViewModel productDetailsViewModel, C11045c<? super ProductDetailsViewModel$sendUpdateBasketEvent$1> cVar) {
        super(cVar);
        this.this$0 = productDetailsViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo81718G0((String) null, 0.0d, 0, this);
    }
}
