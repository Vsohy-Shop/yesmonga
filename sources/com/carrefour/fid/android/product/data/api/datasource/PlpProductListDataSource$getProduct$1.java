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

@C11067d(mo22501c = "com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource", mo22502f = "PlpProductListDataSource.kt", mo22503i = {0}, mo22504l = {160}, mo22505m = "getProduct-xbL76SM$product_release", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PlpProductListDataSource$getProduct$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlpProductListDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpProductListDataSource$getProduct$1(PlpProductListDataSource plpProductListDataSource, C11045c<? super PlpProductListDataSource$getProduct$1> cVar) {
        super(cVar);
        this.this$0 = plpProductListDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.mo79833d((List<String>) null, (String) null, (String) null, this);
        return d == C11063b.m42612h() ? d : Result.m38701a(d);
    }
}
