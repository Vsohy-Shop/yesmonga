package com.carrefour.fid.android.product.presentation.viewmodel.details;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel", mo22502f = "ProductDetailsViewModel.kt", mo22503i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, mo22504l = {263, 279, 284}, mo22505m = "updateBasket-3_lYCm4", mo22506n = {"this", "gtin", "oldQuantity", "newQuantity", "displayablePrice", "isCriteoProduct", "this", "oldQuantity", "newQuantity", "isCriteoProduct"}, mo22507s = {"L$0", "L$1", "I$0", "I$1", "D$0", "Z$0", "L$0", "I$0", "I$1", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductDetailsViewModel$updateBasket$1 extends ContinuationImpl {
    double D$0;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDetailsViewModel$updateBasket$1(ProductDetailsViewModel productDetailsViewModel, C11045c<? super ProductDetailsViewModel$updateBasket$1> cVar) {
        super(cVar);
        this.this$0 = productDetailsViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo81719H0((String) null, (String) null, 0, 0, 0.0d, false, this);
    }
}
