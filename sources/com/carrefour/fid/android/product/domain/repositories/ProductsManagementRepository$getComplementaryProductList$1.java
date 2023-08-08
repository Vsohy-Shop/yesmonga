package com.carrefour.fid.android.product.domain.repositories;

import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository", mo22502f = "ProductsManagementRepository.kt", mo22503i = {}, mo22504l = {49}, mo22505m = "getComplementaryProductList-0E7RQCE$product_release", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductsManagementRepository$getComplementaryProductList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductsManagementRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductsManagementRepository$getComplementaryProductList$1(ProductsManagementRepository productsManagementRepository, C11045c<? super ProductsManagementRepository$getComplementaryProductList$1> cVar) {
        super(cVar);
        this.this$0 = productsManagementRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.mo80193c((String) null, (List<String>) null, this);
        return c == C11063b.m42612h() ? c : Result.m38701a(c);
    }
}
