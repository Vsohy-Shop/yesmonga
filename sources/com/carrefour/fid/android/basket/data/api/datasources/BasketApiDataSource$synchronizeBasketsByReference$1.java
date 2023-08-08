package com.carrefour.fid.android.basket.data.api.datasources;

import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource", mo22502f = "BasketApiDataSource.kt", mo22503i = {0, 0}, mo22504l = {184}, mo22505m = "synchronizeBasketsByReference-BWLJW6A", mo22506n = {"this", "referenceIds"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketApiDataSource$synchronizeBasketsByReference$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketApiDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketApiDataSource$synchronizeBasketsByReference$1(BasketApiDataSource basketApiDataSource, C11045c<? super BasketApiDataSource$synchronizeBasketsByReference$1> cVar) {
        super(cVar);
        this.this$0 = basketApiDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object o = this.this$0.mo32795o((List<String>) null, (String) null, (String) null, this);
        return o == C11063b.m42612h() ? o : Result.m38701a(o);
    }
}
