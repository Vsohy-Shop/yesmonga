package com.carrefour.fid.android.product.data.api.datasource;

import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource", mo22502f = "ProductsDataSource.kt", mo22503i = {}, mo22504l = {80}, mo22505m = "getComplementaryProducts-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductsDataSource$getComplementaryProducts$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductsDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductsDataSource$getComplementaryProducts$1(ProductsDataSource productsDataSource, C11045c<? super ProductsDataSource$getComplementaryProducts$1> cVar) {
        super(cVar);
        this.this$0 = productsDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.mo79839d((String) null, (List<String>) null, this);
        return d == C11063b.m42612h() ? d : Result.m38701a(d);
    }
}
