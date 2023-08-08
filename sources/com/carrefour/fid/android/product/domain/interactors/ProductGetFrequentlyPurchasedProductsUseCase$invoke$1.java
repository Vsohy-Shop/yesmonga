package com.carrefour.fid.android.product.domain.interactors;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetFrequentlyPurchasedProductsUseCase", mo22502f = "ProductGetFrequentlyPurchasedProductsUseCase.kt", mo22503i = {0, 0}, mo22504l = {16, 19, 23}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "serviceNeedsToBeSet"}, mo22507s = {"L$0", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductGetFrequentlyPurchasedProductsUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductGetFrequentlyPurchasedProductsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetFrequentlyPurchasedProductsUseCase$invoke$1(ProductGetFrequentlyPurchasedProductsUseCase productGetFrequentlyPurchasedProductsUseCase, C11045c<? super ProductGetFrequentlyPurchasedProductsUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = productGetFrequentlyPurchasedProductsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo79978a(false, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
