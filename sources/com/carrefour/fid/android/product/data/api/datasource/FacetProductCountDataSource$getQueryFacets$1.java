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

@C11067d(mo22501c = "com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource", mo22502f = "FacetProductCountDataSource.kt", mo22503i = {}, mo22504l = {93}, mo22505m = "getQueryFacets-hUnOzRk", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FacetProductCountDataSource$getQueryFacets$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FacetProductCountDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetProductCountDataSource$getQueryFacets$1(FacetProductCountDataSource facetProductCountDataSource, C11045c<? super FacetProductCountDataSource$getQueryFacets$1> cVar) {
        super(cVar);
        this.this$0 = facetProductCountDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = this.this$0.mo79828e((String) null, (String) null, (String) null, (List<C38105d>) null, (List<C38111e>) null, this);
        return e == C11063b.m42612h() ? e : Result.m38701a(e);
    }
}
