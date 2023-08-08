package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.shared.paging.C28844a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.repositories.PlpProductPagingSource", mo22502f = "PlpProductPagingSource.kt", mo22503i = {0}, mo22504l = {24}, mo22505m = "load", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PlpProductPagingSource$load$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlpProductPagingSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpProductPagingSource$load$1(PlpProductPagingSource plpProductPagingSource, C11045c<? super PlpProductPagingSource$load$1> cVar) {
        super(cVar);
        this.this$0 = plpProductPagingSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo80180a((C28844a.C28845a<Integer>) null, this);
    }
}
