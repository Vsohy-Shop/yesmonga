package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.domain.models.offer.Offer;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$2$1", mo22502f = "ProductDetailsViewModel.kt", mo22503i = {0, 0}, mo22504l = {134, 141}, mo22505m = "emit", mo22506n = {"this", "offerResult"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductDetailsViewModel$getProductOffer$2$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductDetailsViewModel$getProductOffer$2$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDetailsViewModel$getProductOffer$2$1$emit$1(ProductDetailsViewModel$getProductOffer$2$1 productDetailsViewModel$getProductOffer$2$1, C11045c<? super ProductDetailsViewModel$getProductOffer$2$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = productDetailsViewModel$getProductOffer$2$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((C36371a<Offer>) null, this);
    }
}
