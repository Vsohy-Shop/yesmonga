package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.domain.models.product.C38105d;
import com.carrefour.fid.android.domain.models.product.C38111e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource", mo22502f = "PlpProductListDataSource.kt", mo22503i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, mo22504l = {115, 117}, mo22505m = "getQueryProducts-eH_QyT8$product_release", mo22506n = {"this", "storeServices", "query", "slotSlice", "filters", "sorts", "page", "itemCount", "this"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PlpProductListDataSource$getQueryProducts$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlpProductListDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpProductListDataSource$getQueryProducts$1(PlpProductListDataSource plpProductListDataSource, C11045c<? super PlpProductListDataSource$getQueryProducts$1> cVar) {
        super(cVar);
        this.this$0 = plpProductListDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object h = this.this$0.mo79836h((List<String>) null, (String) null, (String) null, (List<C38105d>) null, (List<C38111e>) null, 0, 0, this);
        return h == C11063b.m42612h() ? h : Result.m38701a(h);
    }
}
