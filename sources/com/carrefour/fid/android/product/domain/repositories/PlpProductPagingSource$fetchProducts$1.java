package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.product.domain.model.C27587e;
import com.carrefour.fid.android.shared.paging.C28844a;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource", mo22502f = "PlpProductPagingSource.kt", mo22503i = {}, mo22504l = {54, 64, 73, 81, 90}, mo22505m = "fetchProducts-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PlpProductPagingSource$fetchProducts$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlpProductPagingSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpProductPagingSource$fetchProducts$1(PlpProductPagingSource plpProductPagingSource, C11045c<? super PlpProductPagingSource$fetchProducts$1> cVar) {
        super(cVar);
        this.this$0 = plpProductPagingSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.mo80181c((C27587e) null, (C28844a.C28845a<Integer>) null, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
