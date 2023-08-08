package com.carrefour.fid.android.basket.data.api.datasources;

import com.carrefour.fid.android.domain.models.basket.BasketType;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource", mo22502f = "BasketApiDataSource.kt", mo22503i = {0, 0}, mo22504l = {238}, mo22505m = "updateOfferInBasket-4l_FcWM", mo22506n = {"this", "basketReference"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketApiDataSource$updateOfferInBasket$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketApiDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketApiDataSource$updateOfferInBasket$1(BasketApiDataSource basketApiDataSource, C11045c<? super BasketApiDataSource$updateOfferInBasket$1> cVar) {
        super(cVar);
        this.this$0 = basketApiDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object q = this.this$0.mo32797q((String) null, (BasketType) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, false, this);
        return q == C11063b.m42612h() ? q : Result.m38701a(q);
    }
}
